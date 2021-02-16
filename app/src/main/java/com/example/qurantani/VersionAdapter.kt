package com.example.qurantani

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class VersionAdapter (val versionList: List<Versions>) :
    RecyclerView.Adapter<VersionAdapter.VersionVh>(){
    class VersionVh(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var codedesctxt : TextView = itemView.findViewById(R.id.code_desc)
        var Exdesctxt : TextView = itemView.findViewById(R.id.expand_desctxt)
        var linearLayout : LinearLayout = itemView.findViewById(R.id.linear_desc)
        var expandableLayout :RelativeLayout = itemView.findViewById(R.id.expandable_layout)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VersionVh {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.row_desc,parent,false)

        return VersionVh(view)
    }

    override fun onBindViewHolder(holder: VersionVh, position: Int) {

        val versions : Versions = versionList[position]
        holder.codedesctxt.text = versions.codedesc
        holder.Exdesctxt.text = versions.expanddesc

        val isExpandable : Boolean = versionList[position].expandable
        holder.expandableLayout.visibility = if (isExpandable) View.VISIBLE else View.GONE

        holder.linearLayout.setOnClickListener {
            val versions = versionList[position]
            versions.expandable = !versions.expandable
            notifyItemChanged(position)
        }

    }

    override fun getItemCount(): Int {
        return versionList.size
    }

}