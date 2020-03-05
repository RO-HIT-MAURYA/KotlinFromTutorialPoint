package hum.hai.kotlinfromtutorialpoint

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variablesBasic()
        stringBasic()
        arrayBasic()
        collectionBasic()
    }

    private fun collectionBasic() {

        var list = listOf(3,1,4,7,4,9)
        Log.e("asReversedIs",list.asReversed().toString())

        Log.e("averageIs",list.average().toString())
        Log.e("dropIs",list.drop(4).toString())
        Log.e("dropLastIs",list.dropLast(4).toString())
        Log.e("distinctIs",list.distinct().toString())
        Log.e("elementAtIs",list.elementAt(3).toString())

        Log.e("firstIs",list.first().toString())
        Log.e("lastIs",list.last().toString())
        Log.e("getIs",list.get(3).toString())

        Log.e("indexOfIs",list.indexOf(4).toString())
        Log.e("lastIndexOfIs",list.lastIndexOf(4).toString())
        Log.e("isEmptyIs",list.isEmpty().toString())

        Log.e("maxIs",list.max().toString())
        Log.e("minIs",list.min().toString())

        Log.e("minusIs",list.minus(3).toString())
        Log.e("minusElementIs",list.minusElement(1).toString())

        Log.e("plusIs",list.plus(0).toString())
        Log.e("plusElementIs",list.plusElement(7).toString())
        Log.e("randomIs",list.random().toString())

        Log.e("sublistIs",list.subList(0,3).toString())
        Log.e("sizeIs",list.size.toString())

        Log.e("sortedIs",list.sorted().toString())
        Log.e("sumIs",list.sum().toString())

        Log.e("toHashSetIs",list.toHashSet().toString())
        Log.e("toSetIs",list.toSet().toString())
        Log.e("toSortedSetIs",list.toSortedSet().toString())

        Log.e("toIntArrayIs",list.toIntArray().toString())
        Log.e("toMutableListIs",list.toMutableList().toString())
        Log.e("toMutableSetIs",list.toMutableSet().toString())

        Log.e("filterIs",list.filter { it%2 == 0 }.toString())

        val l = mutableListOf("a","S","d","F",1)
        l.add("gh")
        Log.e("addIs",l.toString())
        l.clear()
        Log.e("clearIs",l.toString())
    }

    private fun stringBasic() {
        val string = "eIgHt"

        Log.e("tagIs","string is $string")
        Log.e("reverseStringIs",string.reversed())
        Log.e("modifiedStringIs",string.plus("dfdsf"))

        val v = "7".toInt();
        Log.e("stringIs", (v+6).toString())

        Log.e("capitalizedIs", string.capitalize())
        Log.e("decapitalizedIs",string.decapitalize())
        Log.e("dropIs",string.drop(3))
        Log.e("dropLastIs",string.dropLast(3))

        if (string.startsWith('E',true))
            Log.e("startWith","isTrue")

        if (string.endsWith("t",true))
            Log.e("endWith","isTrue")

        var str = " I am n0t afra!d 01 "

        Log.e("removePrefixIs",str.removePrefix("a"))
        Log.e("removeSuffixIs",str.removeSuffix("d"))

        Log.e("removeRangeIs",str.removeRange(3,7))

        Log.e("replaceIs",str.replace('!','i'))

        Log.e("indexValueIs",str.get(3).toString())
        Log.e("randomIs",str.random().toString())

        Log.e("toUpperCaseIs",str.toUpperCase())
        Log.e("toLowerCaseIs",str.toLowerCase())

        Log.e("trimIs",str.trim())
        Log.e("trimStartIs",str.trimStart())
        Log.e("trimEndIs",str.trimEnd())

        Log.e("substringIs",str.substring(7))
        Log.e("subStringInRangeIs",str.substring(3,7))

        Log.e("toHashSetIs",str.toHashSet().toString())
        Log.e("toListIs",str.toList().toString())

        Log.e("toSetIs",str.toSet().toString())
        Log.e("toSortedSetIs",str.toSortedSet().toString())

        Log.e("countIs",str.count().toString())
        Log.e("lengthIs",str.length.toString())

        Log.e("filterIs",str.filter { it == '0' })
    }

    private fun arrayBasic() {
        var array = arrayOf(1,2,3)
        Log.e("arrayIs",array.toString())

        Log.e("1Is",array[0].toString())

        Log.e("sizeIs",array.size.toString())

        try {
            Log.e("exceptionIs",array[3].toString())
        }
        catch (e : Exception)
        {
            e.printStackTrace();
        }
    }

    private fun variablesBasic()
    {
        var boolean = true
        var byte = 2
        var short = 1
        var char = 'A'

        val int = 3
        val long = 4
        val float = 3f
        val double = 1.0;


        Log.e("booleanIs",boolean.toString())
        Log.e("byteIs",byte.toString())
        Log.e("shortIs",short.toString())
        Log.e("intIs",int.toString())
        Log.e("longIs",long.toString())
        Log.e("floatIs",float.toString())
        Log.e("doubleIs",double.toString())
        Log.e("charIs",char.toString())
    }
}
