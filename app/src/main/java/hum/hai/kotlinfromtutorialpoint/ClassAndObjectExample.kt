package hum.hai.kotlinfromtutorialpoint

import android.util.Log

class ClassAndObjectExample
{
    var v = "Variable"

    fun funs()
    {
        Log.e("vIs",v)
    }

    class ClassAndObjectExample0
    {
        fun fun0()
        {
            Log.e("fun0Is","0")
        }

        fun foo() = "dfdfdf"

        inner class InnerClass
        {
            fun fun1()
            {
                Log.e("iAm","fromFun1")
            }
        }
    }
}