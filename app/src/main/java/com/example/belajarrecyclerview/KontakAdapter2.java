package com.example.belajarrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KontakAdapter2 extends RecyclerView.Adapter<KontakAdapter2.KontakViewHolder> {


    ArrayList<Kontak> kontaks;
    Context ctx;

    public KontakAdapter2(ArrayList<Kontak> kontaks, Context ctx) {
        this.kontaks = kontaks;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public KontakAdapter2.KontakViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       LayoutInflater inflater = LayoutInflater.from(ctx);
       KontakViewHolder KV = new KontakViewHolder
               (inflater.inflate(R.layout.item_kontak, parent, false));

        return KV;
    }

    @Override
    public void onBindViewHolder(@NonNull KontakAdapter2.KontakViewHolder holder, int position) {

        holder.txNama.setText(kontaks.get(position).getNama());
        holder.txHp.setText(kontaks.get(position).getHp());


    }

    @Override
    public int getItemCount() {
        return kontaks.size();
    }

    public class KontakViewHolder extends RecyclerView.ViewHolder {

        TextView txNama, txHp;
        public KontakViewHolder(@NonNull View itemView) {
            super(itemView);
            txNama = itemView.findViewById(R.id.txNama);
            txHp = itemView.findViewById(R.id.txHp);

            txNama.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Toast.makeText(ctx,txNama.getText(), Toast.LENGTH_SHORT).show();
                }
            });


        }

    }
}
