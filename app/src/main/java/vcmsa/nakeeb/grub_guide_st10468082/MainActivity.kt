package vcmsa.nakeeb.grub_guide_st10468082

import android.app.ProgressDialog.show
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


private val Any?.editTextOne: Any
    get() { TODO("Not yet implemented") }

private val Any?.editTextTextMultiLine: Any
    get() {
        TODO("Not yet implemented")
    }

private fun Any.setText(s: String) { TODO("Not yet implemented") }


private fun Any.clear() {
    TODO("Not yet implemented")
}

class MainActivity<EditText : View?> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // code starts here
        val button = findViewById<Button>(R.id.buttonOne)
        val editText = findViewById<EditText>(R.id.editTextOne)
        val editText2 = findViewById<EditText>(R.id.editTextTextMultiLine)
        val breakfast: String = "Eggs,Toast,Tea,Jam,Coffee,Pancakes,Cereal,Protein Shake"
        val midMorning: String = "Fruit,Nuts,Hard Boiled Eggs"
        val lunch: String = "Sandwich,Salads,Soup,Wraps"
        val midDay: String = "Popcorn,Protein Bars,Pretzels,Chips"
        val dinner: String = "Curries,Bakes,Pizza,Pasta,Roasts"
        val deserts: String = "Ice Cream,Cakes,Cookies"

        button.setOnClickListener {
            try{
                if (editText.editTextOne.toString() == "Breakfast") {
                    editText2.editTextTextMultiLine.setText("Breafast")
                } else if (editText.editTextOne.toString() == "Mid-Morning") {
                    editText2.editTextTextMultiLine.setText("Mid-Morining")
                } else if (editText.editTextOne.toString() == "Lunch") {
                    editText2.editTextTextMultiLine.setText("Lunch")
                } else if (editText.editTextOne.toString() == "Mid-Day") {
                    editText2.editTextTextMultiLine.setText("Mid-Day")
                } else if (editText.editTextOne.toString() == "Dinner") {
                    editText2.editTextTextMultiLine.setText("Dinner")
                } else if (editText.editTextOne.toString() == "Desserts") {
                    editText2.editTextTextMultiLine.setText("Deserts")

                }
                // when user enters Breakfast show breakfast options
                // when user enters Mid-Morning show mid-morning options
                // when user enters Lunch show lunch options
                // when user enters Mid-Day show mid-day options
                // when user enters Dinner show dinner options
                // when user enters Deserts show deserts options
                else {
                    Toast.makeText(this, "Please enter a valid time", Toast.LENGTH_SHORT).show()
                }
                when (editText.editTextOne.toString()) {
                    "Breakfast" -> editText2.editTextTextMultiLine.setText("Breafast")
                    "Mid-Morning" -> editText2.editTextTextMultiLine.setText("Mid-Morining")
                    "Lunch" -> editText2.editTextTextMultiLine.setText("Lunch")
                    "Mid-Day" -> editText2.editTextTextMultiLine.setText("Mid-Day")
                    "Dinner" -> editText2.editTextTextMultiLine.setText("Dinner")
                    "Deserts" -> editText2.editTextTextMultiLine.setText("Deserts")
                    else -> editText2.editTextTextMultiLine.setText("Please enter a valid time")
                }


            } catch (e: Exception) {
                editText2.editTextTextMultiLine.setText("Please enter a valid time")
                editText.editTextOne.clear()
                editText2.editTextTextMultiLine.clear()


            }
        }
        }


    }



