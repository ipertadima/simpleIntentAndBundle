package google.co.id.kotlinactivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val data = intent.extras
        val tas = data?.getSerializable("data4") as Tas
        val buku = data.getParcelable("data5") as Buku

        Log.d("Merk", tas.merk)
        Log.d("Ukuran", tas.ukuran.toString())

        Log.d("Merk", buku.merk)
    }
}
