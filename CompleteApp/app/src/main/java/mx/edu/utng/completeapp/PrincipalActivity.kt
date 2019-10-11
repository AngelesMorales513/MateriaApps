package mx.edu.utng.completeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_principal.*

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        btnViaje.setOnClickListener{
            val intento = Intent(this, ViajeActivity::class.java)
            startActivity(intento)
        }

        btnPrestamo.setOnClickListener{
            val intento2 = Intent(this, PrestamoActivity::class.java)
            startActivity(intento2)
        }

        btnJuego.setOnClickListener{
            val intento3 = Intent(this, JuegoActivity::class.java)
            startActivity(intento3)
        }

        btnSalir.setOnClickListener{
            System.exit(0)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_principal, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var msg: String = ""
        when(item.itemId){

            R.id.itmViaje->{
                msg="Viaje Seleccionado"
                startActivity(Intent(this, ViajeActivity::class.java))
            }
            R.id.itmPrestamo->{
                msg="Préstamo Seleccionado"
                startActivity(Intent(this, PrestamoActivity::class.java))
            }
            R.id.itmJuego->{
                msg="Juego Seleccionado"
                startActivity(Intent(this, JuegoActivity::class.java))
            }
            R.id.itmSalir->{
                System.exit(0)
            }
        }
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }

}
