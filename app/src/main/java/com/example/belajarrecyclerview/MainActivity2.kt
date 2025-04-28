package com.example.belajarrecyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.belajarrecyclerview.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(getLayoutInflater())
        setContentView(binding.getRoot())

       // ArrayList<Kontak> kontaks = new ArrayList<Kontak>();
        val kontaks : ArrayList<Kontak> =  ArrayList<Kontak>()
        kontaks.add(Kontak("Budi","0812345"))
        kontaks.add(Kontak("Joni","0822345"))
        kontaks.add(Kontak("Andi","0832345"))
        kontaks.add(Kontak("Peter","0842345"))
        kontaks.add(Kontak("Dono","0852345"))


        val adapter2:KontakAdapter2 =  KontakAdapter2(kontaks,this)
        binding.rv.adapter=adapter2
        binding.rv.setLayoutManager(LinearLayoutManager(this))
        binding.fab.setOnClickListener{

            kontaks.add(Kontak("new Kontak","0812345"))
            adapter2.notifyDataSetChanged()

        }





    }
}