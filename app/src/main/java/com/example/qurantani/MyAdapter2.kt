package com.example.qurantani

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*

class MyAdapter2 (val arrayList: ArrayList<Model>, val context: Context): RecyclerView.Adapter<MyAdapter2.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bindItems(model: Model){
            itemView.titleTv.text = model.title
            itemView.desc.text = model.desc
            itemView.img_row.setImageResource(model.img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent,false)

        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener {

            val model = arrayList.get(position)
//            ambil title dan desc
            var gTitle: String = model.title
            var gDesc: String = model.desc
            var gMakna: String = model.makna
            var gImageView:Int = model.img

            var gExmanfaat:String = model.exmanfaat
            var gExhama:String = model.exhama
            var gExpenanaman:String = model.expenanaman
            var gExPH:String = model.exPH
            var gExPC:String = model.exPC

            val intent = Intent(context,Description::class.java)

            intent.putExtra("iTitle",gTitle)
            intent.putExtra("iDesc",gDesc)
            intent.putExtra("iMakna",gMakna)
            intent.putExtra("iImageView",gImageView)

            intent.putExtra("iExmanfaat",gExmanfaat)
            intent.putExtra("iExhama",gExhama)
            intent.putExtra("iExpenanaman",gExpenanaman)
            intent.putExtra("iExPH",gExPH)
            intent.putExtra("iExPC",gExPC)

            context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

}