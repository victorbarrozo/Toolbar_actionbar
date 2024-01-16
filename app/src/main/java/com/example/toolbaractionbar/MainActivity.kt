package com.example.toolbaractionbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.core.view.MenuProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inicializarActionBar()


    }

    private fun inicializarActionBar() {
       addMenuProvider(
           object : MenuProvider{
               override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                   menuInflater.inflate(R.menu.menu_principal,menu)
               }

               override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                   when(menuItem.itemId){
                       R.id.itemFoto ->{
                           Toast.makeText(applicationContext, "Adicionar foto", Toast.LENGTH_SHORT).show()}
                       R.id.itemPesquisar ->{
                           Toast.makeText(applicationContext, "Pesquisar", Toast.LENGTH_SHORT).show()}
                       R.id.itemConfiguracoes ->{
                           Toast.makeText(applicationContext, "Configuraçôes", Toast.LENGTH_SHORT).show()
                           val intent = Intent(applicationContext, ConfiguracoesActivity::class.java)
                           startActivity(intent)
                       }
                       R.id.itemSair ->{
                           Toast.makeText(applicationContext, "Sair" , Toast.LENGTH_SHORT).show()}
                   }
                   return true
               }
           }
       )
    }

    /* override fun onCreateOptionsMenu(menu: Menu?): Boolean {
         menuInflater.inflate(R.menu.menu_principal,menu)
         return super.onCreateOptionsMenu(menu)
     }

     override fun onOptionsItemSelected(item: MenuItem): Boolean {

         when(item.itemId){
             R.id.itemFoto ->{
                 Toast.makeText(this, "Adicionar foto", Toast.LENGTH_SHORT).show()}
             R.id.itemPesquisar ->{
                 Toast.makeText(this, "Pesquisar", Toast.LENGTH_SHORT).show()}
             R.id.itemConfiguracoes ->{
                 Toast.makeText(this, "Configuraçôes", Toast.LENGTH_SHORT).show()
                 val intent = Intent(this, ConfiguracoesActivity::class.java)
                 startActivity(intent)
             }
             R.id.itemSair ->{
                 Toast.makeText(this, "Sair" , Toast.LENGTH_SHORT).show()}
         }
         return true
     }*/
}