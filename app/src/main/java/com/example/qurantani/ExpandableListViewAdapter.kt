package com.example.qurantani

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import java.util.zip.Inflater

class ExpandableListViewAdapter internal constructor(private val context: Context, private val advantageList:List<String>,private val subadvantageList:HashMap<String, List<String>>):
        BaseExpandableListAdapter() {

    override fun getGroupCount(): Int {
        return advantageList.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return this.subadvantageList[this.advantageList[groupPosition]]!!.size
    }

    override fun getGroup(groupPosition: Int): Any {
        return advantageList[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return this.subadvantageList[this.advantageList[groupPosition]]!![childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(
            groupPosition: Int,
            isExpanded: Boolean,
            convertView: View?,
            parent: ViewGroup?
    ): View {
        var convertView = convertView
        val advantageTitle = getGroup(groupPosition) as String

        if (convertView == null){
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.advantage,null)
        }

        val advantageTv = convertView!!.findViewById<TextView>(R.id.advantage_tv)
        advantageTv.setText(advantageTitle)

        return convertView
    }

    override fun getChildView(
            groupPosition: Int,
            childPosition: Int,
            isLastChild: Boolean,
            convertView: View?,
            parent: ViewGroup?
    ): View {
        var convertView = convertView
        val subadvantageTitle = getChild(groupPosition, childPosition) as String

        if (convertView == null){
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.sub_advantage,null)
        }

        val subadvantageTv = convertView!!.findViewById<TextView>(R.id.sub_advantage_tv)
        subadvantageTv.setText(subadvantageTitle)

        return convertView
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }
}