package com.dohn.listview_220614

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dohn.listview_220614.datas.StudentData

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(  StudentData( "강도훈", 1997, "서울시 구로구" )  )
        mStudentList.add(  StudentData( "강도끼", 1977, "서울시 은평구" )  )
        mStudentList.add(  StudentData( "박칼", 1982, "서울시 강남구" )  )
        mStudentList.add(  StudentData( "이검", 1991, "서울시 동대문구" )  )
        mStudentList.add(  StudentData( "송망치", 1999, "서울시 서대문구" )  )
        mStudentList.add(  StudentData( "장톱", 1995, "안산시 단원구" )  )
        mStudentList.add(  StudentData( "서채찍", 2001, "안산시 상록구" )  )
        mStudentList.add(  StudentData( "문해머", 1989, "서울시 동작구" )  )
        mStudentList.add(  StudentData( "오함마", 1945, "서울시 성북구" )  )

    }
}