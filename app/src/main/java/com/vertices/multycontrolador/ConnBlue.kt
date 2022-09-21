package com.vertices.multycontrol

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.ingenieriajhr.blujhr.BluJhr
import com.vertices.multycontrol.R
import kotlinx.android.synthetic.main.activity_conn_blue.*
import java.text.SimpleDateFormat
import java.util.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.prefs.Preferences


class ConnBlue : AppCompatActivity() {

    var addres = ""

    lateinit var blu: BluJhr
    val LAST_TEXT_btnA = "btnBText"
    val LAST_TEXT_btnB = "btnBText"
    val LAST_TEXT_btnC = "btnCText"
    val LAST_TEXT_btnD = "btnDText"
    val LAST_TEXT_btnE = "btnEText"
    val LAST_TEXT_btnF = "btnFText"
    val LAST_TEXT_btnG = "btnGText"
    val LAST_TEXT_btnH = "btnHText"
    val LAST_TEXT_btnI = "btnIText"
    val LAST_TEXT_btnJ = "btnJText"
    val LAST_TEXT_btnK = "btnKText"
    val LAST_TEXT_btnL = "btnLText"
    val LAST_TEXT_btnM = "btnMText"
    val LAST_TEXT_btnN = "btnNText"
    val LAST_TEXT_btnO = "btnOText"
    val LAST_TEXT_btnP = "btPAText"
    val LAST_TEXT_btnQ = "btQAText"
    val LAST_TEXT_btnR = "btRAText"




    var estadoConexion = BluJhr.Connected.False

    //Variables check estado del boton
    var stdBA: Boolean = false;
    var stdBB: Boolean = false;
    var stdBC: Boolean = false;
    var stdBD: Boolean = false;
    var stdBE: Boolean = false;
    var stdBF: Boolean = false;
    var stdBG: Boolean = false;
    var stdBH: Boolean = false;
    var stdBI: Boolean = false;
    var stdBJ: Boolean = false;
    var stdBK: Boolean = false;
    var stdBL: Boolean = false;
    var stdBM: Boolean = false;
    var stdBN: Boolean = false;
    var stdBO: Boolean = false;
    var stdBP: Boolean = false;
    var stdBQ: Boolean = false;
    //Para el reloj

    var run = true //set it to false if you want to stop the timer

    var mHandler: Handler = Handler()



    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conn_blue)
//////////////////////////////////////////////////////////////////
        LoadDataState()
        timer();


        // Listeners para cambiar labels

        labe_a.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                // Call onDone result here
                saveData()
                //Toast.makeText(applicationContext,"PASO",Toast.LENGTH_SHORT).show()

                true
            }
            false
        }
        labe_b.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                // Call onDone result here
                saveData()
                //Toast.makeText(applicationContext,"PASO",Toast.LENGTH_SHORT).show()

                true
            }
            false
        }
        labe_c.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                // Call onDone result here
                saveData()
                //Toast.makeText(applicationContext,"PASO",Toast.LENGTH_SHORT).show()

                true
            }
            false
        }
        labe_d.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                // Call onDone result here
                saveData()
                //Toast.makeText(applicationContext,"PASO",Toast.LENGTH_SHORT).show()

                true
            }
            false
        }
        labe_e.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                // Call onDone result here
                saveData()
                //Toast.makeText(applicationContext,"PASO",Toast.LENGTH_SHORT).show()

                true
            }
            false
        }
        labe_f.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                // Call onDone result here
                saveData()
                //Toast.makeText(applicationContext,"PASO",Toast.LENGTH_SHORT).show()

                true
            }
            false
        }
        labe_g.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                // Call onDone result here
                saveData()
                //Toast.makeText(applicationContext,"PASO",Toast.LENGTH_SHORT).show()

                true
            }
            false
        }
        labe_h.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                // Call onDone result here
                saveData()
                //Toast.makeText(applicationContext,"PASO",Toast.LENGTH_SHORT).show()

                true
            }
            false
        }
        labe_i.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                // Call onDone result here
                saveData()
                //Toast.makeText(applicationContext,"PASO",Toast.LENGTH_SHORT).show()

                true
            }
            false
        }
        labe_j.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                // Call onDone result here
                saveData()
                //Toast.makeText(applicationContext,"PASO",Toast.LENGTH_SHORT).show()

                true
            }
            false
        }
        labe_k.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                // Call onDone result here
                saveData()
                //Toast.makeText(applicationContext,"PASO",Toast.LENGTH_SHORT).show()

                true
            }
            false
        }

        labe_l.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                // Call onDone result here
                saveData()
                //Toast.makeText(applicationContext,"PASO",Toast.LENGTH_SHORT).show()

                true
            }
            false
        }
        labe_m.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                // Call onDone result here
                saveData()
                //Toast.makeText(applicationContext,"PASO",Toast.LENGTH_SHORT).show()

                true
            }
            false
        }
        labe_n.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                // Call onDone result here
                saveData()
                //Toast.makeText(applicationContext,"PASO",Toast.LENGTH_SHORT).show()

                true
            }
            false
        }


        loadData()


        addres = intent.getStringExtra("addres").toString()

        blu = BluJhr(this)

        blu.setDataLoadFinishedListener(object : BluJhr.ConnectedBluetooth {
            override fun onConnectState(state: BluJhr.Connected) {
                when (state) {
                    BluJhr.Connected.True -> {
                        Toast.makeText(applicationContext, "CONNECTED", Toast.LENGTH_SHORT).show()
                        //RelayActualState()
                        rxReceived()

                        estadoConexion = state

                    }
                    BluJhr.Connected.Pending -> {
                        Toast.makeText(applicationContext, "DISCONNECTING", Toast.LENGTH_SHORT).show()

                        estadoConexion = state
                        //rxReceived()
                    }
                    BluJhr.Connected.False -> {
                        Toast.makeText(applicationContext, "CONNECTION FAIL", Toast.LENGTH_SHORT)
                            .show()
                        estadoConexion = state
                    }
                    BluJhr.Connected.Disconnect -> {
                        Toast.makeText(applicationContext, "DISCONNECTED", Toast.LENGTH_SHORT)
                            .show()
                        estadoConexion = state
                        startActivity(Intent(applicationContext, MainActivity::class.java))
                    }
                }
            }
        })


        btnA.setOnClickListener {
            //blu.bluTx(edtSend.text.toString())
            blu.bluTx("A")
        }
        btnB.setOnClickListener {
            //blu.bluTx(edtSend.text.toString())
            blu.bluTx("B")
        }
        btnC.setOnClickListener {
            //blu.bluTx(edtSend.text.toString())
            blu.bluTx("C")
        }
        btnD.setOnClickListener {
            //blu.bluTx(edtSend.text.toString())
            blu.bluTx("D")
        }
        btnE.setOnClickListener {
            //blu.bluTx(edtSend.text.toString())
            blu.bluTx("E")
        }
        btnF.setOnClickListener {
            //blu.bluTx(edtSend.text.toString())
            blu.bluTx("F")
        }
        btnG.setOnClickListener {
            //blu.bluTx(edtSend.text.toString())
            blu.bluTx("G")
        }
        btnH.setOnClickListener {
            //blu.bluTx(edtSend.text.toString())
            blu.bluTx("H")
        }
        btnI.setOnClickListener {
            //blu.bluTx(edtSend.text.toString())
            blu.bluTx("I")
        }
        btnJ.setOnClickListener {
            //blu.bluTx(edtSend.text.toString())
            blu.bluTx("J")
        }
        btnK.setOnClickListener {
            //blu.bluTx(edtSend.text.toString())
            blu.bluTx("K")
        }
        btnL.setOnClickListener {
            //blu.bluTx(edtSend.text.toString())
            blu.bluTx("L")
        }
        btnM.setOnClickListener {
            //blu.bluTx(edtSend.text.toString())
            blu.bluTx("M")
        }
        btnN.setOnClickListener {
            //blu.bluTx(edtSend.text.toString())
            blu.bluTx("N")
        }
        btnO.setOnClickListener {
            //blu.bluTx(edtSend.text.toString())
            //Toast.makeText(applicationContext, "PASANDO", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,help::class.java)
            startActivity(intent)
            //blu.bluTx("O")
        }

        btnQ.setOnClickListener {
            //blu.bluTx(edtSend.text.toString())

            blu.bluTx("Q")
        }



    }



    /**
     * Se llama al siguiente método cuando cambia el foco de la ventana.
     */
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)

        if (estadoConexion != BluJhr.Connected.True) {
            Toast.makeText(applicationContext, "CONNECTING", Toast.LENGTH_SHORT).show()
            blu.connect(addres)
        }

    }

    private fun rxReceived() {
        blu.loadDateRx(object : BluJhr.ReceivedData {

            @RequiresApi(Build.VERSION_CODES.M)
            override fun rxDate(rx: String) {


                if (rx == "a") {

                    if (stdBA == false) {
                        //txtConsola.text = "BOTON 1 encendido"
                        btnA.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)

                        //Toast.makeText(applicationContext, "BOTON 1 ENCENDIDO", Toast.LENGTH_SHORT)
                           // .show()
                        stdBA = true

                    } else {
                        btnA.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                        //Toast.makeText(applicationContext, "BOTON 1 APAGADO", Toast.LENGTH_SHORT).show()

                        stdBA = false
                    }
                    saveDataState()
                }
                if (rx == "b") {
                    if (stdBB == false) {
                        btnB.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                        //Toast.makeText(applicationContext, "BOTON 2 ENCENDIDO", Toast.LENGTH_SHORT)
                          //  .show()
                        stdBB = true
                    } else {
                        btnB.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                        //Toast.makeText(applicationContext, "BOTON 2 APAGADO", Toast.LENGTH_SHORT)
                          //  .show()
                        stdBB = false
                    }
                    saveDataState()
                }
                if (rx == "c") {
                    if (stdBC == false) {
                        btnC.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                       // Toast.makeText(applicationContext, "BOTON 3 ENCENDIDO", Toast.LENGTH_SHORT)
                          //  .show()
                        stdBC = true
                    } else {
                        btnC.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                       // Toast.makeText(applicationContext, "BOTON 3 APAGADO", Toast.LENGTH_SHORT)
                          //  .show()
                        stdBC = false
                    }
                    saveDataState()
                }

                if (rx == "d") {
                    if (stdBD == false) {
                        btnD.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                       // Toast.makeText(applicationContext, "BOTON 4 ENCENDIDO", Toast.LENGTH_SHORT)
                          //  .show()
                        stdBD = true
                    } else {
                        btnD.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                        //Toast.makeText(applicationContext, "BOTON 4 APAGADO", Toast.LENGTH_SHORT)
                            //.show()
                        stdBD = false
                    }
                    saveDataState()
                }
                if (rx == "e") {
                    if (stdBE == false) {
                        btnE.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                        //Toast.makeText(applicationContext, "BOTON 5 ENCENDIDO", Toast.LENGTH_SHORT)
                           // .show()
                        stdBE = true
                    } else {
                        btnE.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                       // Toast.makeText(applicationContext, "BOTON 5 APAGADO", Toast.LENGTH_SHORT)
                           // .show()
                        stdBE = false
                    }
                    saveDataState()
                }
                if (rx == "f") {
                    if (stdBF == false) {
                        btnF.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                       // Toast.makeText(applicationContext, "BOTON 6 ENCENDIDO", Toast.LENGTH_SHORT)
                          //  .show()
                        stdBF = true
                    } else {
                        btnF.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                       // Toast.makeText(applicationContext, "BOTON 6 APAGADO", Toast.LENGTH_SHORT)
                          //  .show()
                        stdBF = false
                    }
                    saveDataState()
                }
                if (rx == "g") {
                    if (stdBG == false) {
                        btnG.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                        //Toast.makeText(applicationContext, "BOTON 7 ENCENDIDO", Toast.LENGTH_SHORT)
                          //  .show()
                        stdBG = true
                    } else {
                        btnG.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                       // Toast.makeText(applicationContext, "BOTON 7 APAGADO", Toast.LENGTH_SHORT)
                          //  .show()
                        stdBG = false
                    }
                    saveDataState()
                }
                if (rx == "h") {
                    if (stdBH == false) {
                        btnH.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                        //Toast.makeText(applicationContext, "BOTON 8 ENCENDIDO", Toast.LENGTH_SHORT)
                         //   .show()
                        stdBH = true
                    } else {
                        btnH.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                       // Toast.makeText(applicationContext, "BOTON 8 APAGADO", Toast.LENGTH_SHORT)
                          //  .show()
                        stdBH = false
                    }
                    saveDataState()
                }
                if (rx == "i") {
                    if (stdBI == false) {
                        btnI.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                       // Toast.makeText(applicationContext, "BOTON 9 ENCENDIDO", Toast.LENGTH_SHORT)
                        //    .show()
                        stdBI = true
                    } else {
                        btnI.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                       // Toast.makeText(applicationContext, "BOTON 9 APAGADO", Toast.LENGTH_SHORT)
                       //     .show()
                        stdBI = false
                    }
                    saveDataState()
                }
                if (rx == "j") {
                    if (stdBJ == false) {
                        btnJ.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                       // Toast.makeText(applicationContext, "BOTON 10 ENCENDIDO", Toast.LENGTH_SHORT)
                        //    .show()
                        stdBJ = true
                    } else {
                        btnJ.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                      //  Toast.makeText(applicationContext, "BOTON 10 APAGADO", Toast.LENGTH_SHORT)
                       //     .show()
                        stdBJ = false
                    }
                    saveDataState()
                }
                if (rx == "k") {
                    if (stdBK == false) {
                        btnK.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                       // Toast.makeText(applicationContext, "BOTON 11 ENCENDIDO", Toast.LENGTH_SHORT)
                        //    .show()
                        stdBK = true
                    } else {
                        btnK.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                        //Toast.makeText(applicationContext, "BOTON 11 APAGADO", Toast.LENGTH_SHORT)
                           // .show()
                        stdBK = false
                    }
                    saveDataState()
                }
                if (rx == "l") {
                    if (stdBL == false) {
                        btnL.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                       // Toast.makeText(applicationContext, "BOTON 12 ENCENDIDO", Toast.LENGTH_SHORT)
                          //  .show()
                        stdBL = true
                    } else {
                        btnL.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                      //  Toast.makeText(applicationContext, "BOTON 12 APAGADO", Toast.LENGTH_SHORT)
                        //    .show()
                        stdBL = false
                    }
                    saveDataState()
                }
                if (rx == "m") {
                    if (stdBM == false) {
                        btnM.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                       // Toast.makeText(applicationContext, "BOTON 13 ENCENDIDO", Toast.LENGTH_SHORT)
                        //    .show()
                        stdBM = true
                    } else {
                        btnM.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                      //  Toast.makeText(applicationContext, "BOTON 13 APAGADO", Toast.LENGTH_SHORT)
                       //     .show()
                        stdBM = false
                    }
                    saveDataState()
                }
                if (rx == "n") {
                    if (stdBN == false) {
                        btnN.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                      //  Toast.makeText(applicationContext, "BOTON 14 ENCENDIDO", Toast.LENGTH_SHORT)
                        //    .show()
                        stdBN = true
                    } else {
                        btnN.foreground =
                            ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                      //  Toast.makeText(applicationContext, "BOTON 14 APAGADO", Toast.LENGTH_SHORT)
                        //    .show()
                        stdBN = false
                    }
                    saveDataState()
                }

                if (rx == "q") {
                    stdBA = true
                    stdBB = true
                    stdBC = true
                    stdBD = true
                    stdBE = true
                    stdBF = true
                    stdBG = true
                    stdBH = true
                    stdBI = true
                    stdBJ = true
                    stdBK = true
                    stdBL = true
                    stdBM = true
                    stdBN = true
                    stdBO = true
                    stdBP = true
                    stdBQ = true


                    btnA.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                    btnB.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                    btnC.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                    btnD.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                    btnE.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                    btnF.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                    btnG.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                    btnH.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                    btnI.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                    btnJ.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                    btnK.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                    btnL.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                    btnM.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                    btnN.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                    //btnO.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
                    btnQ.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)

                    //Toast.makeText(applicationContext, "TODO ENCENDIDO", Toast.LENGTH_SHORT).show()
                    saveDataState()
                }
                if (rx == "r") {
                    stdBA = false
                    stdBB = false
                    stdBC = false
                    stdBD = false
                    stdBE = false
                    stdBF = false
                    stdBG = false
                    stdBH = false
                    stdBI = false
                    stdBJ = false
                    stdBK = false
                    stdBL = false
                    stdBM = false
                    stdBN = false
                    stdBO = false
                    stdBP = false
                    stdBQ = false
                    btnA.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                    btnB.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                    btnC.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                    btnD.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                    btnE.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                    btnF.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                    btnG.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                    btnH.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                    btnI.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                    btnJ.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                    btnK.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                    btnL.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                    btnM.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                    btnN.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                    //btnO.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)

                    btnQ.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                   // Toast.makeText(applicationContext, "TODO APAGADO", Toast.LENGTH_SHORT).show()
                    val label_n : String = labe_n.text.toString()
                }


                //PARA MOSTRAR LA TEMPERATURA

                if (rx.startsWith("$")) {

                    temText.text = rx.removeRange(0, 1)
                }


            }
        })

    }
    private fun saveDataState(){
        val sharedPreferences  = getSharedPreferences("SharedPrefsState", Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.apply{
            putString("STATE_A", stdBA.toString())
            putString("STATE_B", stdBB.toString())
            putString("STATE_C", stdBC.toString())
            putString("STATE_D", stdBD.toString())
            putString("STATE_E", stdBE.toString())
            putString("STATE_F", stdBF.toString())
            putString("STATE_G", stdBG.toString())
            putString("STATE_H", stdBH.toString())
            putString("STATE_I", stdBI.toString())
            putString("STATE_J", stdBJ.toString())
            putString("STATE_K", stdBK.toString())
            putString("STATE_L", stdBL.toString())
            putString("STATE_M", stdBM.toString())
            putString("STATE_N", stdBN.toString())
            putString("STATE_O", stdBO.toString())
            putString("STATE_P", stdBP.toString())
            putString("STATE_Q", stdBQ.toString())




        }.apply()

        Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show()

    }
    private fun LoadDataState(){
        val sharedPreferences = getSharedPreferences("SharedPrefsState", MODE_PRIVATE)
        val state_A = sharedPreferences.getString("STATE_A", null)
        val state_B = sharedPreferences.getString("STATE_B", null)
        val state_C = sharedPreferences.getString("STATE_C", null)
        val state_D = sharedPreferences.getString("STATE_D", null)
        val state_E = sharedPreferences.getString("STATE_E", null)
        val state_F = sharedPreferences.getString("STATE_F", null)
        val state_G = sharedPreferences.getString("STATE_G", null)
        val state_H = sharedPreferences.getString("STATE_H", null)
        val state_I = sharedPreferences.getString("STATE_I", null)
        val state_J = sharedPreferences.getString("STATE_J", null)
        val state_K = sharedPreferences.getString("STATE_K", null)
        val state_L = sharedPreferences.getString("STATE_L", null)
        val state_M = sharedPreferences.getString("STATE_M", null)
        val state_N = sharedPreferences.getString("STATE_N", null)
        val state_O = sharedPreferences.getString("STATE_O", null)
        val state_P = sharedPreferences.getString("STATE_P", null)
        val state_Q = sharedPreferences.getString("STATE_Q", null)

        if(state_A.contentEquals("true")) {
            stdBA = true
            if(stdBA){
                btnA.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
            }
            else{
                btnA.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                stdBA = false
            }

        }
        if(state_B.contentEquals("true")) {
            stdBB = true
            if(stdBB){
                btnB.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
            }
            else{
                btnB.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                stdBB = false
            }

        }
        if(state_C.contentEquals("true")) {
            stdBC = true
            if(stdBC){
                btnC.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
            }
            else{
                btnC.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                stdBC = false
            }

        }
        if(state_D.contentEquals("true")) {
            stdBD = true
            if(stdBD){
                btnD.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
            }
            else{
                btnD.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                stdBD = false
            }

        }
        if(state_E.contentEquals("true")) {
            stdBE = true
            if(stdBE){
                btnE.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
            }
            else{
                btnE.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                stdBE = false
            }

        }
        if(state_F.contentEquals("true")) {
            stdBF = true
            if(stdBF){
                btnF.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
            }
            else{
                btnF.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                stdBF = false
            }

        }
        if(state_G.contentEquals("true")) {
            stdBG = true
            if(stdBG){
                btnG.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
            }
            else{
                btnG.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                stdBG = false
            }

        }
        if(state_H.contentEquals("true")) {
            stdBH = true
            if(stdBH){
                btnH.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
            }
            else{
                btnH.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                stdBH = false
            }

        }
        if(state_I.contentEquals("true")) {
            stdBI = true
            if(stdBI){
                btnI.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
            }
            else{
                btnI.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                stdBI = false
            }

        }
        if(state_J.contentEquals("true")) {
            stdBJ = true
            if(stdBJ){
                btnJ.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
            }
            else{
                btnJ.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                stdBJ = false
            }

        }
        if(state_K.contentEquals("true")) {
            stdBK = true
            if(stdBK){
                btnK.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
            }
            else{
                btnK.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                stdBK = false
            }

        }
        if(state_L.contentEquals("true")) {
            stdBL = true
            if(stdBL){
                btnL.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
            }
            else{
                btnL.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                stdBL = false
            }

        }
        if(state_M.contentEquals("true")) {
            stdBM = true
            if(stdBM){
                btnM.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
            }
            else{
                btnM.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                stdBM = false
            }

        }
        if(state_N.contentEquals("true")) {
            stdBN = true
            if(stdBN){
                btnN.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
            }
            else{
                btnN.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                stdBN = false
            }

        }
        if(state_O.contentEquals("true")) {
            stdBO = true
            if(stdBO){
                btnO.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
            }
            else{
                btnO.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                stdBO = false
            }

        }

        if(state_Q.contentEquals("true")) {
            stdBQ = true
            if(stdBQ){
                btnQ.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_on)
            }
            else{
                btnQ.foreground = ContextCompat.getDrawable(this@ConnBlue, R.drawable.boton_off)
                stdBQ = false
            }

        }




    }
    private fun saveData(){
        //Variables de las etiquetas
        val label_a : String = labe_a.text.toString()
        val label_b : String = labe_b.text.toString()
        val label_c : String = labe_c.text.toString()
        val label_d : String = labe_d.text.toString()
        val label_e : String = labe_e.text.toString()
        val label_f : String = labe_f.text.toString()
        val label_g : String = labe_g.text.toString()
        val label_h : String = labe_h.text.toString()
        val label_i : String = labe_i.text.toString()
        val label_j : String = labe_j.text.toString()
        val label_k : String = labe_k.text.toString()
        val label_l : String = labe_l.text.toString()
        val label_m : String = labe_m.text.toString()
        val label_n : String = labe_n.text.toString()



        labe_a.setText(label_a)
        labe_b.setText(label_b)
        labe_c.setText(label_c)
        labe_d.setText(label_d)
        labe_e.setText(label_e)
        labe_f.setText(label_f)
        labe_g.setText(label_g)
        labe_h.setText(label_h)
        labe_i.setText(label_i)
        labe_j.setText(label_j)
        labe_k.setText(label_k)
        labe_l.setText(label_l)
        labe_m.setText(label_m)
        labe_n.setText(label_n)


        val sharedPreferences  = getSharedPreferences("SharedPrefs", Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.apply{
            putString("LABEL_a_KEY", label_a)
            putString("LABEL_b_KEY", label_b)
            putString("LABEL_c_KEY", label_c)
            putString("LABEL_d_KEY", label_d)
            putString("LABEL_e_KEY", label_e)
            putString("LABEL_f_KEY", label_f)
            putString("LABEL_g_KEY", label_g)
            putString("LABEL_h_KEY", label_h)
            putString("LABEL_i_KEY", label_i)
            putString("LABEL_j_KEY", label_j)
            putString("LABEL_k_KEY", label_k)
            putString("LABEL_l_KEY", label_l)
            putString("LABEL_m_KEY", label_m)
            putString("LABEL_n_KEY", label_n)


        }.apply()

        Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show()

    }

    private fun loadData(){


        val sharedPreferences = getSharedPreferences("SharedPrefs", MODE_PRIVATE)
        val label_a = sharedPreferences.getString("LABEL_a_KEY", null)
        val label_b = sharedPreferences.getString("LABEL_b_KEY", null)
        val label_c = sharedPreferences.getString("LABEL_c_KEY", null)
        val label_d = sharedPreferences.getString("LABEL_d_KEY", null)
        val label_e = sharedPreferences.getString("LABEL_e_KEY", null)
        val label_f = sharedPreferences.getString("LABEL_f_KEY", null)
        val label_g = sharedPreferences.getString("LABEL_g_KEY", null)
        val label_h = sharedPreferences.getString("LABEL_h_KEY", null)
        val label_i = sharedPreferences.getString("LABEL_i_KEY", null)
        val label_j = sharedPreferences.getString("LABEL_j_KEY", null)
        val label_k = sharedPreferences.getString("LABEL_k_KEY", null)
        val label_l = sharedPreferences.getString("LABEL_l_KEY", null)
        val label_m = sharedPreferences.getString("LABEL_m_KEY", null)
        val label_n = sharedPreferences.getString("LABEL_n_KEY", null)



        if(sharedPreferences.contains("LABEL_a_KEY")){

            //Toast.makeText(this, "Hay prefe", Toast.LENGTH_SHORT).show()
            labe_a.setText(label_a)
            labe_b.setText(label_b)
            labe_c.setText(label_c)
            labe_d.setText(label_d)
            labe_e.setText(label_e)
            labe_f.setText(label_f)
            labe_g.setText(label_g)
            labe_h.setText(label_h)
            labe_i.setText(label_i)
            labe_j.setText(label_j)
            labe_k.setText(label_k)
            labe_l.setText(label_l)
            labe_m.setText(label_m)
            labe_n.setText(label_n)



        }
        else{
            //Toast.makeText(this, "NO Hay prefe", Toast.LENGTH_SHORT).show()

        }

    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun timer() {
        Thread {
            while (run) {
                try {
                    Thread.sleep(1000)
                    mHandler.post {
                        val current = LocalDateTime.now()
                        val formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                        val formatted = current.format(formatter)
                        time.setText(formatted.toString())
                    }
                } catch (e: Exception) {
                }
            }
        }.start()
    }


}