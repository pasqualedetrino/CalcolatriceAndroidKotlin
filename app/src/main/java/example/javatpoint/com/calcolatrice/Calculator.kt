package example.javatpoint.com.calcolatrice

class Calculator {

    var add1: Float = 0f
    var add2: Float = 0f

    var result: Float = 0f

    /* constructor */
    fun insert(a1: Float, a2:Float) {
        add1 = a1
        add2 = a2
    }

    /*  operations */

    fun sum(): Float {
        var s = add1 + add2

        return s
    }

    fun sottr(): Float {
        var s = add1 - add2

        return s
    }

    fun per(): Float {
        var p = add1*add2

        return p
    }

    fun div(): Float {
        var d = add1/add2

        return d

    }
}