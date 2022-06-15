package com.dohn.listview_220614.datas

class StudentData(
    val name: String,
    val brithYear: Int,
    val address: String,
) {

    fun getKoreanAge( year: Int ) : Int {

        val koreanAge = year - this.brithYear + 1

        return koreanAge

    }

}