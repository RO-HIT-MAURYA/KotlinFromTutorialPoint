package hum.hai.kotlinfromtutorialpoint
import android.util.Log

class ConstructorExample(val i : Int,var s : String)
{
    var int = this.i
    var str = this.s
    var v = 0.0f

    constructor(i: Int,s: String,float: Float) : this(i,s)
    {
        v = float
    }
}