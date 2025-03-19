package com.example.belajarrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.belajarrecyclerview.databinding.ItemKontakBinding;

import java.util.ArrayList;

public class KontakAdapter extends RecyclerView.Adapter<KontakAdapter.KontakViewHolder> {

    private ArrayList<Kontak> kontak;
    Context ctx;
    public KontakAdapter(ArrayList<Kontak> kontak, Context ctx) {
        this.kontak = kontak;
        this.ctx = ctx;
    }


    @NonNull
    @Override
    public KontakViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        KontakViewHolder KV = new KontakViewHolder
                (inflater.inflate(R.layout.item_kontak, parent, false));
        return KV;
    }

    @Override
    public void onBindViewHolder(@NonNull KontakViewHolder holder, int position) {

        holder.txNama.setText(kontak.get(position).getNama());
        holder.txHp.setText(kontak.get(position).getHp());

    }

    @Override
    public int getItemCount() {
        return kontak.size();
    }

    public class KontakViewHolder extends RecyclerView.ViewHolder {
        TextView txNama, txHp;
        ItemKontakBinding binding;
        public KontakViewHolder(@NonNull View itemView) {
            super(itemView);
            txNama = itemView.findViewById(R.id.txNama);
            txHp = itemView.findViewById(R.id.txHp);
        }



    }
}
