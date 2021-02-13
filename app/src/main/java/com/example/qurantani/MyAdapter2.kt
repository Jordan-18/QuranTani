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
//            if (position == 0){
//                Toast.makeText(
//                    context,
//                    "Kamu Berada Di Anggur",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//            if (position == 1){
//                Toast.makeText(
//                    context,
//                    "Kamu Berada Di Delima",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//            if (position == 2){
//                Toast.makeText(
//                    context,
//                    "Kamu Berada Di Jahe",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//            if (position == 3){
//                Toast.makeText(
//                    context,
//                    "Kamu Berada Di Kurma",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//            if (position == 4){
//                Toast.makeText(
//                    context,
//                    "Kamu Berada Di Tin",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//            if (position == 5){
//                Toast.makeText(
//                    context,
//                    "Kamu Berada Di Bawang",
//                    Toast.LENGTH_LONG
//                ).show()
//            }

            val model = arrayList.get(position)
//            ambil title dan desc
            var gTitle: String = model.title
            var gImageView:Int = model.img

            val intent = Intent(context,Description::class.java)

            intent.putExtra("iTitle",gTitle)
            intent.putExtra("iImageView",gImageView)

            context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

}