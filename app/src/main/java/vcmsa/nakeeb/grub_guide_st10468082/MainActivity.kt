package vcmsa.nakeeb.grub_guide_st10468082
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity: AppCompatActivity() {
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


        button.setOnClickListener {
            try{
                val inputText = editText.text.toString()
                //Display breakfast options if Breakfast is typed
                if (inputText.toString() == "Breakfast") {
                    editText2.setText("Eggs, Toast, Tea, Jam, Coffee, Pancakes, Cereal")
                }
                else if (inputText.toString() == "Mid-Morning") {
                    editText2.setText("Fruit, Yogurt, Fruit, Trail-Mix, Fruit Juice")
                //display lunch options if Lunch is typed
                } else if (inputText.toString() == "Lunch") {
                    editText2.setText("Curries, Bakes, Pizza, Pasta, Roasts")
                //display mid-day options if Mid-Day is typed
                } else if (inputText.toString() == "Mid-Day") {
                    editText2.setText("Popcorn, Protein Bars, Pretzels, Chips")
                //display dinner options if Dinner is typed
                } else if (inputText.toString() == "Dinner") {
                    editText2.setText("Curries, Bakes, Pizza, Pasta, Roasts")
                //display deserts options if Desserts is typed
                } else if (inputText.toString() == "Desserts") {
                    editText2.setText("Ice-Cream, Cakes, Cookies, Brownies")


                }
                else {


                    Toast.makeText(this, "Please enter correct meal", Toast.LENGTH_SHORT).show()
                }
            } catch (e: Exception) {
                Toast.makeText(this, "Please enter correct meal", Toast.LENGTH_SHORT).show()



            }
        }
        }


    }







