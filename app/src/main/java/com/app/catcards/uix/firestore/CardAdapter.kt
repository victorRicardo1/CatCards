package com.app.catcards.uix.firestore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.catcards.R

class CardAdapter(
    private val datalist: ArrayList<CardsData>) :
    RecyclerView.Adapter<CardAdapter.MyViewHolder>(){

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val tvPergutna: TextView = itemView.findViewById(R.id.item_pergunta)
        val tvResCardA: TextView = itemView.findViewById(R.id.item_res_a)
        val tvResCardB: TextView = itemView.findViewById(R.id.item_res_b)
        val tvResCardC: TextView = itemView.findViewById(R.id.item_res_c)
        val tvResCardD: TextView = itemView.findViewById(R.id.item_res_d)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_card, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvPergutna.text = datalist[position].perguntaCard
        holder.tvResCardA.text = datalist[position].resCard_A
        holder.tvResCardB.text = datalist[position].resCard_B
        holder.tvResCardC.text = datalist[position].resCard_C
        holder.tvResCardD.text = datalist[position].resCard_D
    }

    override fun getItemCount(): Int {
        return datalist.size
    }
}