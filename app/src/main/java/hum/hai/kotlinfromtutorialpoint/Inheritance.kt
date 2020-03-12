package hum.hai.kotlinfromtutorialpoint

import android.util.Log

open class Inheritance
{
    open fun inheritance()
    {
        Log.e("from","parentClass")
    }
}

class Inheritances : Inheritance()
{
    override fun inheritance()
    {
        Log.e("from","childClass")
    }
}