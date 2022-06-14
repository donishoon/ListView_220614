package com.dohn.listview_220614.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.dohn.listview_220614.datas.StudentData

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>
) : ArrayAdapter<StudentData>(mContext, resId, mList) {
}