package google.co.id.kotlinactivity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var bundle: Bundle
    lateinit var bundleDua: Bundle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bundle = Bundle().apply {
            putString("data", "ini data")
            putBoolean("data2", true)
            putInt("data3", 2)
        }

        val tas = Tas("MERK A", 15.0)
        val buku = Buku("", 0.0)
        bundleDua = Bundle().apply {
            putSerializable("data4", tas)
            putParcelable("data5", buku)
        }


        button.setOnClickListener {
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            intent.putExtras(bundleDua)
            startActivity(intent)
        }

        button_dua.setOnClickListener {
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("INI", "ON Start")
    }

    override fun onResume() {
        super.onResume()
        Log.d("INI", "ON Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("INI", "ON Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("INI", "On Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("INI", "On Destroy")
    }
}


