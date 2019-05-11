package example.javatpoint.com.calcolatrice

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.View
import android.widget.EditText
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        /*
            READ THE CONTEXT INFORMATIONS
        */

        val addendo1 = findViewById<EditText>(R.id.addendo1);   // first element
        val addendo2 = findViewById<EditText>(R.id.addendo2);   // second element

        val risulato = findViewById<EditText>(R.id.risultato);  // result
        risultato.setEnabled(false)                             // disable input element

        var a1:String   // first element insert
        var a2:String   // second element insert

        var add1: Float = 0.0f  // number1 read to the form
        var add2: Float = 0.0f  // number2 read to the form

        var Calc = Calculator() // object that used for calculation

        /*
            function for check the parameters reads to the form
        */
        fun check(): Boolean {
            a1 = addendo1.text.toString().trim()
            a2 = addendo2.text.toString().trim()

            if (a1.isEmpty() || a2.isEmpty()) {
                Toast.makeText(applicationContext, "addendo1 or addendo2 cannot be blank", Toast.LENGTH_LONG).show()
                return false
            }
            else {
                add1 = a1.toFloat()
                add2 = a2.toFloat()

                /* insert the date in the object */

                Calc.insert(add1, add2)

                return true

            }
        }

        /*
            SELECT THE OPERATION
        */

        som.setOnClickListener(View.OnClickListener {

            var control: Boolean = check()

            if (control) {

                var total: Float = Calc.sum()

                risulato.setText(total.toString())
            }

        })

        sottr.setOnClickListener(View.OnClickListener {

            var control: Boolean = check()

            if (control) {

                var total: Float = Calc.sottr()

                risulato.setText(total.toString())
            }

        })

        per.setOnClickListener(View.OnClickListener {

            var control: Boolean = check()

            if (control) {

                var total: Float = Calc.per()

                risulato.setText(total.toString())
            }

        })

        diviso.setOnClickListener(View.OnClickListener {

            var control: Boolean = check()

            if (control) {

                var total: Float = Calc.div()

                risulato.setText(total.toString())
            }

        })

        /* Clean */
        canc.setOnClickListener(View.OnClickListener {

            addendo1.text.clear()
            addendo2.text.clear()
            risulato.text.clear()

        })
    }

}