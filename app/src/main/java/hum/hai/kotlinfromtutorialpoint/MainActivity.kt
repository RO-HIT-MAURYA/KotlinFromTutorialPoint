package hum.hai.kotlinfromtutorialpoint

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variablesBasic()
        stringBasic()
        arrayBasic()
        collectionBasic()
        ranges()
        forLoop()
        switch()
        returnBreakContinue()
        labelExample()
        classAndObjectExample()
        interfaceExample()
        constructorExample()
        inheritanceExample()
        interfaceExample()
        companionObject()//replacement of static method
    }

    private fun companionObject() {
        Log.e("valueIs",ClassAndObjectExample.v)
        Log.e("methodIs",ClassAndObjectExample.companionMethod(10))
    }

    private fun inheritanceExample() {
        var i = Inheritance()
        i.inheritance()

        i =Inheritances()
        i.inheritance()
    }

    private fun constructorExample() {
        var constructorExample = ConstructorExample(1,"str")
        Log.e("iIs",constructorExample.int.toString())
        Log.e("strIs",constructorExample.s)

        constructorExample = ConstructorExample(2,"string",3.0f)
        Log.e("i,String,fIs",""+constructorExample.int +" , "+ constructorExample.str + " , " +constructorExample.v)
    }

    private fun interfaceExample() {

        val v : IndividualInterface = object : IndividualInterface
        {
            override fun interfaceFun() {
                Log.e("interface","isExecuted")
            }
        }
        v.interfaceFun()

        val va : IndividualInterface.FaceInter = object : IndividualInterface.FaceInter
        {
            override fun faceInter() {
                Log.e("nestedInterface","isExecuted")
            }
        }
        va.faceInter()

        val interfaceClass = InterfaceClass()
        Log.e("interfaceClass",interfaceClass.a.toString())
        Log.e("interfaceClass",interfaceClass.method())
        interfaceClass.hello()

        interfaceClass.funsc();
    }

    private fun classAndObjectExample() {

        var objects = ClassAndObjectExample()
        objects.funs()

        // inner key word is not used
        val o = ClassAndObjectExample.ClassAndObjectExample0()
        o.fun0()

        Log.e("fooIs",ClassAndObjectExample.ClassAndObjectExample0().foo())

        // inner key word is used.
        var obj = ClassAndObjectExample.ClassAndObjectExample0().InnerClass()
        obj.fun1()
    }

    private fun labelExample() {

        label@for (i in 0..3)
        {
            for (j in 0..7)
            {
                if (i==2 && j==3)
                    break@label

                Log.e("innerLoopIs",j.toString())
            }
            Log.e("outerLoopIs",i.toString())
        }
    }

    private fun returnBreakContinue() {

        val i = returnType(10)
        Log.e("returnTypeIs",i.toString())

        for (i in listOf(0,7,9,5,3,1))
        {
            if (i==7)
                continue

            Log.e("continueIs",i.toString())
        }

        for (i in 1..10)
        {
            if (i == 7)
                break

            Log.e("breakIs",i.toString())
        }

        for (i in 1..9)
        {
            if (i % 7 ==0)
                return

            Log.e("returnIs",i.toString())
        }
    }

    private fun returnType(i: Int): Any {

        return 'i'+i;
    }

    private fun switch() {

        val i = 3;

        when(i)
        {
            1-> Log.e("numberIs",i.toString())
            3-> Log.e("numberIs",i.toString())

            else-> Log.e("numberIs",i.toString())
        }

    }

    private fun forLoop() {
        val list = listOf("j","k","l",'f',1,2)
        for (i in list)
            Log.e("iIs",i.toString())

        for ((index,value) in list.withIndex())
        {
            val string = "index is $index and value is $value"
            Log.e("stringIs",string)
        }
    }

    private fun ranges() {
        for(i in 1..3)
            Log.e("iIs",i.toString())

        val j = 3;
        if (j in 1..7)
            Log.e("3Is","iterated")
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

        var a = IntArray(2)
        a[0] = 1
        a[1] = 0
        Log.e("aIs",a.toString())

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
