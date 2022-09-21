package com.vertices.multycontrol

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.contains
import com.ingenieriajhr.blujhr.BluJhr
import kotlinx.android.synthetic.main.activity_conn_blue.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    lateinit var blue: BluJhr
    var devicesBluetooth = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        blue = BluJhr(this)
        blue.onBluetooth()




        listDeviceBlu.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this,ConnBlue::class.java)
            intent.putExtra("addres",devicesBluetooth[i])
            startActivity(intent)
        }


    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if (blue.checkPermissions(requestCode,grantResults)){
            Toast.makeText(this, "Exit", Toast.LENGTH_SHORT).show()
            blue.initializeBluetooth()
        }else{
            if(Build.VERSION.SDK_INT < Build.VERSION_CODES.S){
                blue.initializeBluetooth()
            }else{
                Toast.makeText(this, "SOMETHING HAS GONE WRONG", Toast.LENGTH_SHORT).show()
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (!blue.stateBluetoooth() && requestCode == 100){
            blue.initializeBluetooth()
        }else{
            if (requestCode == 100){
                devicesBluetooth = blue.deviceBluetooth()


                if (devicesBluetooth.isNotEmpty()){
                    val adapter = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,devicesBluetooth)

                    listDeviceBlu.adapter = adapter
                    //Para auto conectar al bluetooth FARO
//                    for(i in 0..adapter.count){
//
//                        if (listDeviceBlu.adapter.getItem(i).toString().contains("FARO")){
//                            Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show()
//                            listDeviceBlu.adapter = adapter
//
//                            val intent = Intent(this,ConnBlue::class.java)
//                            intent.putExtra("addres",devicesBluetooth[i])
//                            startActivity(intent)
//                            break
//                        }
//
//                    }
//
//

                }else{
                    Toast.makeText(this, "NO PAIRED DEVICES", Toast.LENGTH_SHORT).show()
                }

            }

        }
        super.onActivityResult(requestCode, resultCode, data)
    }

}