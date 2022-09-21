#include  <SoftwareSerial.h>
#include <OneWire.h>
#include <DallasTemperature.h>
#include <Math.h>
#define ONE_WIRE_BUS 18

OneWire myWire(ONE_WIRE_BUS); 
DallasTemperature sensors ( &myWire ) ;
SoftwareSerial BT(10,11); // 10 RX, 11 TX.

unsigned long startMillis;  //some global variables available anywhere in the program
unsigned long currentMillis;
const unsigned long period = 60000;  //the value is a number of milliseconds

//byte Led_1 = 14; //A0
//byte Led_2 = 15; //A1
//byte Led_3 = 16; //A2
//byte Led_4 = 17;//A3
//byte Led_5 = 12; 
//byte Led_6 = 13; 
//byte Led_7 = 2;
//byte Led_8 = 3;
//
//byte Led_9 = 4;
//byte Led_10 = 5;
//byte Led_11 = 6;
//byte Led_12 = 7;
//byte Led_13 = 8;
//byte Led_14 = 9;
////byte Led_15 = 12;
////byte Led_16 = 13;

///////////////////////////

byte Led_1 = 2;
byte Led_2 = 3;
byte Led_3 = 4;
byte Led_4 = 5;
byte Led_5 = 6;
byte Led_6 = 7;
byte Led_7 = 8;
byte Led_8 = 9;
byte Led_9= 12;
byte Led_10= 13;
byte Led_11= 14; //A0
byte Led_12= 15; //A1
byte Led_13 =16; //A2
byte Led_14= 17; //A3



char DataBluetooth = "";
bool ALL = true;

void setup()  
{
  Serial.begin(9600); 
  BT.begin(9600); 
  Serial.println("");
  Serial.println("Iniciando Multy Controller ...");
  
  sensors.begin ( ) ; 
  delay(2000);

  Serial.println("Controller OK");

  
  startMillis = millis();  //initial start time

  pinMode(Led_1, OUTPUT);
  pinMode(Led_2, OUTPUT);
  pinMode(Led_3, OUTPUT);
  pinMode(Led_4, OUTPUT);
  pinMode(Led_5, OUTPUT);
  pinMode(Led_6, OUTPUT);
  pinMode(Led_7, OUTPUT);
  pinMode(Led_8, OUTPUT);

  pinMode(Led_9, OUTPUT);
  pinMode(Led_10, OUTPUT);
  pinMode(Led_11, OUTPUT);
  pinMode(Led_12, OUTPUT);
  pinMode(Led_13, OUTPUT);
  pinMode(Led_14, OUTPUT);
  //pinMode(Led_15, OUTPUT);
  //pinMode(Led_16, OUTPUT);
  
  digitalWrite(Led_1, HIGH);
  digitalWrite(Led_2, HIGH);
  digitalWrite(Led_3, HIGH);
  digitalWrite(Led_4, HIGH);
  digitalWrite(Led_5, HIGH);
  digitalWrite(Led_6, HIGH);
  digitalWrite(Led_7, HIGH);
  digitalWrite(Led_8, HIGH);

  digitalWrite(Led_9, HIGH);
  digitalWrite(Led_10, HIGH);
  digitalWrite(Led_11, HIGH);
  digitalWrite(Led_12, HIGH);
  digitalWrite(Led_13, HIGH);
  digitalWrite(Led_14, HIGH);
  //digitalWrite(Led_15, HIGH);
  //digitalWrite(Led_16, HIGH);
  
}
 
void loop()
{ 

     currentMillis = millis();  //get the current "time" (actually the number of milliseconds since the program started)
     if (currentMillis - startMillis >= period)  //test whether the period has elapsed
     {
        
        send_string();
        startMillis = currentMillis;  //IMPORTANT to save the start time of the current LED state.
     }
    
    // Si hay datos disponibles en el módulo bluetooth HC-05
    if(BT.available())
    {
      DataBluetooth = BT.read();
      Serial.print(DataBluetooth);
      
      

      if(DataBluetooth == 'A')
      {
        if(digitalRead(Led_1) == HIGH)
        {
          digitalWrite(Led_1, LOW);
          
        }
        else
        {
          digitalWrite(Led_1, HIGH);
        }

        BT.println("a"); 
        
        Serial.println("");       
      }
      
      if(DataBluetooth == 'B')
      {
        if(digitalRead(Led_2) == HIGH)
        {
          digitalWrite(Led_2, LOW);
        }
        else
        {
          digitalWrite(Led_2, HIGH);
        }
        BT.println("b"); 
        Serial.println("");       
      }

      if(DataBluetooth == 'C')
      {
       if(digitalRead(Led_3) == HIGH)
        {
          digitalWrite(Led_3, LOW);
        }
        else
        {
          digitalWrite(Led_3, HIGH);
        }
        BT.println("c"); 
        Serial.println("");         
      }

      if(DataBluetooth == 'D')
      {
        
        if(digitalRead(Led_4) == HIGH)
        {
          digitalWrite(Led_4, LOW);
        }
        else
        {
          digitalWrite(Led_4, HIGH);
        }
        
        BT.println("d");
        Serial.println("");          
      }

      if(DataBluetooth == 'E')
      {
        if(digitalRead(Led_5) == HIGH)
        {
          digitalWrite(Led_5, LOW);
        }
        else
        {
          digitalWrite(Led_5, HIGH);
        }
        
       
        BT.println("e");
        Serial.println("");          
      }
      if(DataBluetooth == 'F')
      {
        if(digitalRead(Led_6) == HIGH)
        {
          digitalWrite(Led_6, LOW);
        }
        else
        {
          digitalWrite(Led_6, HIGH);
        }
       
        
        BT.println("f");
        Serial.println("");          
      }

      if(DataBluetooth == 'G')
      {
         if(digitalRead(Led_7) == HIGH)
        {
          digitalWrite(Led_7, LOW);
        }
        else
        {
          digitalWrite(Led_7, HIGH);
        }
        
        BT.println("g");
        Serial.println("");          
      }

      if(DataBluetooth == 'H')
      {
         if(digitalRead(Led_8) == HIGH)
        {
          digitalWrite(Led_8, LOW);
        }
        else
        {
          digitalWrite(Led_8, HIGH);
        }
       
        BT.println("h");
        Serial.println("");          
      } 

      if(DataBluetooth == 'I')
      {
         if(digitalRead(Led_9) == HIGH)
        {
          digitalWrite(Led_9, LOW);
        }
        else
        {
          digitalWrite(Led_9, HIGH);
        }
       
        BT.println("i");
        Serial.println("");          
      } 
      
      if(DataBluetooth == 'J')
      {
         if(digitalRead(Led_10) == HIGH)
        {
          digitalWrite(Led_10, LOW);
        }
        else
        {
          digitalWrite(Led_10, HIGH);
        }
       
        BT.println("j");
        Serial.println("");          
      } 
      if(DataBluetooth == 'K')
      {
         if(digitalRead(Led_11) == HIGH)
        {
          digitalWrite(Led_11, LOW);
        }
        else
        {
          digitalWrite(Led_11, HIGH);
        }
       
        BT.println("k");
        Serial.println("");          
      } 
      if(DataBluetooth == 'L')
      {
         if(digitalRead(Led_12) == HIGH)
        {
          digitalWrite(Led_12, LOW);
        }
        else
        {
          digitalWrite(Led_12, HIGH);
        }
       
        BT.println("l");
        Serial.println("");          
      } 
      if(DataBluetooth == 'M')
      {
         if(digitalRead(Led_13) == HIGH)
        {
          digitalWrite(Led_13, LOW);
        }
        else
        {
          digitalWrite(Led_13, HIGH);
        }
       
        BT.println("m");
        Serial.println("");          
      } 
      if(DataBluetooth == 'N')
      {
         if(digitalRead(Led_14) == HIGH)
        {
          digitalWrite(Led_14, LOW);
        }
        else
        {
          digitalWrite(Led_14, HIGH);
        }
       
        BT.println("n");
        Serial.println("");          
      } 

      
      if(DataBluetooth == 'Q')
      {
        if (ALL == true)
        {

          digitalWrite(Led_1, LOW);
          digitalWrite(Led_2, LOW);
          digitalWrite(Led_3, LOW);
          digitalWrite(Led_4, LOW);
          digitalWrite(Led_5, LOW);
          digitalWrite(Led_6, LOW);
          digitalWrite(Led_7, LOW);
          digitalWrite(Led_8, LOW);

          digitalWrite(Led_9, LOW);
          digitalWrite(Led_10, LOW);
          digitalWrite(Led_11, LOW);
          digitalWrite(Led_12, LOW);
          digitalWrite(Led_13, LOW);
          digitalWrite(Led_14, LOW);
          //digitalWrite(Led_15, LOW);
          //digitalWrite(Led_16, LOW);
          
          ALL = !ALL;
          BT.println("q"); 
          Serial.println("");

          
         
        }

        else
        {
          
          digitalWrite(Led_1, HIGH);
          digitalWrite(Led_2, HIGH);
          digitalWrite(Led_3, HIGH);
          digitalWrite(Led_4, HIGH);
          digitalWrite(Led_5, HIGH);
          digitalWrite(Led_6, HIGH);
          digitalWrite(Led_7, HIGH);
          digitalWrite(Led_8, HIGH);

          digitalWrite(Led_9, HIGH);
          digitalWrite(Led_10, HIGH);
          digitalWrite(Led_11, HIGH);
          digitalWrite(Led_12, HIGH);
          digitalWrite(Led_13, HIGH);
          digitalWrite(Led_14, HIGH);
          //digitalWrite(Led_15, HIGH);
          //digitalWrite(Led_16, HIGH);
          ALL = !ALL;
          BT.println("r"); 
          Serial.println(""); 
        }
        
        
        
      }

     
      
    }

   
    if(Serial.available())
    {
      DataBluetooth = Serial.read();
      
      BT.print(DataBluetooth);
    } 
    

}

void send_string(){

    sensors.requestTemperatures();
    float temp = sensors.getTempCByIndex ( 0 );
    int roundTemp = (int)round (temp);
    String  temperatura =  String(roundTemp);
    Serial.println("$" + temperatura) ; 
    Serial.println(""); 
    BT.println("$"+ temperatura);
    
}
