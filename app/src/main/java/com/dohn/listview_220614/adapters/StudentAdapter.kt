package com.dohn.listview_220614.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.dohn.listview_220614.R
import com.dohn.listview_220614.datas.StudentData

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>
) : ArrayAdapter<StudentData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if ( tempRow == null ) {
            tempRow = LayoutInflater.from( mContext ).inflate( R.layout.student_list_item, null )
        }

        val row = tempRow!!

        val data = mList[position]

        val txtName = row.findViewById<TextView>( R.id.txtName )
        val txtAge = row.findViewById<TextView>( R.id.txtAge )
        val txtAddress = row.findViewById<TextView>( R.id.txtAddress )


        return row



    }


}