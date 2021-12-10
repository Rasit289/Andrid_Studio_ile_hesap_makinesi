package com.example.googleetkinlik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)








    }
    var operator ="*"
    var eskisayi=""
    var yenioperator=true

    fun butonislem(view:View){


        var butonsec2=view as Button
        var topla= findViewById<Button>(R.id.arti)
        var cıkar= findViewById<Button>(R.id.eksi)
        var carp= findViewById<Button>(R.id.carpma)
        var bolu= findViewById<Button>(R.id.bolu)


        when(butonsec2.id) {

            bolu.id -> {
               operator="/"
            }
            carp.id -> {
                operator="*"
            }
            cıkar.id -> {
                operator="-"
            }
            topla.id -> {
                operator="+"

            }

            }
        var hesaplama=findViewById<TextView>(R.id.hesaplama)
        eskisayi=hesaplama.text.toString()
        yenioperator=true

            }
    fun butonhesapla(view:View){
        var hesaplama=findViewById<TextView>(R.id.hesaplama)
        var yenisayi=hesaplama.text.toString()
        var sonuc:Double? =null

        when(operator){
          "/"->{
              sonuc=eskisayi.toDouble()/yenisayi.toDouble()
          }
            "*"->{
                sonuc=eskisayi.toDouble()*yenisayi.toDouble()
            }
            "+"->{
                sonuc=eskisayi.toDouble()+yenisayi.toDouble()
            }
            "-"->{
                sonuc=eskisayi.toDouble()-yenisayi.toDouble()

            }
        }
      hesaplama.setText(sonuc.toString())
        yenioperator=true

    }

    fun ac(view: View){
        var hesaplama=findViewById<TextView>(R.id.hesaplama)
        hesaplama.setText("0")
        yenioperator=true
    }

    fun butontik (view: View){

        var sifir= findViewById<Button>(R.id.sifir)
        var bir= findViewById<Button>(R.id.bir)
        var iki= findViewById<Button>(R.id.iki)
        var uc= findViewById<Button>(R.id.uc)
        var dort= findViewById<Button>(R.id.dort)
        var bes= findViewById<Button>(R.id.bes)
        var alti= findViewById<Button>(R.id.alti)
        var yedi= findViewById<Button>(R.id.yedi)
        var sekiz= findViewById<Button>(R.id.sekiz)
        var dokuz= findViewById<Button>(R.id.dokuz)

        var hesaplama=findViewById<TextView>(R.id.hesaplama)

        if(yenioperator){
            hesaplama.text=""
        }
        yenioperator=false

        var butonsec=view as Button
        var butondeger :String=hesaplama.text.toString()





        when(butonsec.id){

            sifir.id->{
                butondeger+="0"
            }
            bir.id->{
                butondeger+="1"
            }
            iki.id->{
                butondeger+="2"
            }
            uc.id->{
                butondeger+="3"
            }
            dort.id->{
                butondeger+="4"
            }
            bes.id->{
                butondeger+="5"
            }
            alti.id->{
                butondeger+="6"
            }
            yedi.id->{
                butondeger+="7"
            }
            sekiz.id->{
                butondeger+="8"
            }
            dokuz.id->{
                butondeger+="9"
            }


        }
        hesaplama.setText(butondeger)
    }
}


