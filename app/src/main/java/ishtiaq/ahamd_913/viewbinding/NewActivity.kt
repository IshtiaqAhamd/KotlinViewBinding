package ishtiaq.ahamd_913.viewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ishtiaq.ahamd_913.viewbinding.databinding.ActivityNewBinding

class NewActivity : AppCompatActivity() {
    private lateinit var newBinding: ActivityNewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        newBinding = ActivityNewBinding.inflate(layoutInflater)
        val view = newBinding.root
        setContentView(view)

        newBinding.t1.setText("I am also Changed....")

    }
}