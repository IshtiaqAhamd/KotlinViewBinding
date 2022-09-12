package ishtiaq.ahamd_913.viewbinding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ishtiaq.ahamd_913.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainbinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainbinding= ActivityMainBinding.inflate(layoutInflater)
        val view = mainbinding.root
        setContentView(view)
        mainbinding.t1.setText("Now I am Changed")
        mainbinding.button.setOnClickListener {
            val intent = Intent(this, NewActivity:: class.java)
            startActivity(intent)
        }
    }
}