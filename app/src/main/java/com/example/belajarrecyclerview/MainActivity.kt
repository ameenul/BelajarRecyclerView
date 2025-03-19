package com.example.belajarrecyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.belajarrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()



        binding = ActivityMainBinding.inflate(getLayoutInflater())
        setContentView(binding.getRoot())

         val kontaks: ArrayList<Kontak> =  ArrayList<Kontak>()
        kontaks.add(Kontak("Budi","0812345"))
        kontaks.add(Kontak("Joni","0822345"))
        kontaks.add(Kontak("Andi","0832345"))
        kontaks.add(Kontak("Peter","0842345"))
        kontaks.add(Kontak("Dono","0852345"))

        val adapter:KontakAdapter =  KontakAdapter(kontaks,this)
        binding.rv.setAdapter(adapter)
        binding.rv.setLayoutManager(LinearLayoutManager(this))

        binding.fab.setOnClickListener{

            kontaks.add(Kontak("new Kontak","0812345"))
            adapter.notifyDataSetChanged()
        }

    }
}