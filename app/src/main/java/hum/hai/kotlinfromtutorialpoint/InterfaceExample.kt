package hum.hai.kotlinfromtutorialpoint

import android.util.Log

interface InterfaceExample
{
    var a : Int
    fun method() : String
    fun hello()
    {
        Log.e("helloIs","calledFromInterfaceExample")
    }
}

interface IE
{
    fun funsc()
    {
        Log.e("executed","fromFuncs")
    }
}

class InterfaceClass : InterfaceExample, IE
{
    override var a : Int = 20

    override fun method() = "dfdsf"

    override fun hello()
    {
        Log.e("log","e")
    }


}