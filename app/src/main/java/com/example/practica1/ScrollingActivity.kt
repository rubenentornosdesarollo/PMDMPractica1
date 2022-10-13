package com.example.practica1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.practica1.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

    val tesla = "https://es.wikipedia.org/wiki/Nikola_Tesla"
    val lovelace = "https://es.wikipedia.org/wiki/Ada_Lovelace"
    val babbage = "https://es.wikipedia.org/wiki/Charles_Babbage"
    val musk = "https://es.wikipedia.org/wiki/Elon_Musk"

    val openUrl = Intent(Intent.ACTION_VIEW)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        Glide de Nikola Tesla
        Glide.with(this)
            .load("https://upload.wikimedia.org/wikipedia/commons/thumb/7/79/Tesla_circa_1890.jpeg/220px-Tesla_circa_1890.jpeg")
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCardTesla)

        // Glide de Ada Lovelace
        Glide.with(this)
            .load("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Ada_Byron_daguerreotype_by_Antoine_Claudet_1843_or_1850.jpg/220px-Ada_Byron_daguerreotype_by_Antoine_Claudet_1843_or_1850.jpg")
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCardLovelace)

        // Glide de Charles Babbage
        Glide.with(this)
            .load("https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/CharlesBabbage.jpg/220px-CharlesBabbage.jpg")
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCardBabbage)

        // Glide de Charles Babbage
        Glide.with(this)
            .load("https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Elon_Musk_Royal_Society_%28crop1%29.jpg/220px-Elon_Musk_Royal_Society_%28crop1%29.jpg")
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCardMusk)


//        Boton de Nikola Tesla
        binding.content.btnIrTesla.setOnClickListener{
            openUrl.data = Uri.parse(tesla)
            startActivity(openUrl)
        }

//        Boton de Ada Lovelace
        binding.content.btnIrLovelace.setOnClickListener{
            openUrl.data = Uri.parse(lovelace)
            startActivity(openUrl)
        }

//        Boton de Charles Babbage
        binding.content.btnIrBabbage.setOnClickListener{
            openUrl.data = Uri.parse(babbage)
            startActivity(openUrl)
        }

        // Boton de Elon Musk
        binding.content.btnIrMusk.setOnClickListener{
            openUrl.data = Uri.parse(musk)
            startActivity(openUrl)
        }


    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}