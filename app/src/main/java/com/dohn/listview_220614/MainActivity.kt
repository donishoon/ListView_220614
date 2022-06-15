package com.dohn.listview_220614

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dohn.listview_220614.adapters.StudentAdapter
import com.dohn.listview_220614.datas.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()

    lateinit var mAdapter : StudentAdapter

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

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList )

        studentListView.adapter = mAdapter

        studentListView.setOnItemClickListener { parent, view, position, id ->
            
            val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name} 클릭됨", Toast.LENGTH_SHORT).show()


        }

    }
}