package proj.ezcolet.views.admin

import android.graphics.PixelFormat
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import proj.ezcolet.databinding.AdminMenuActivityBinding
import proj.ezcolet.services.ViewService

class AdminHomeActivity : AppCompatActivity() {

    private lateinit var addCourierBtn: Button
    private lateinit var binding: AdminMenuActivityBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFormat(PixelFormat.RGBA_8888)
        binding = AdminMenuActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addCourierBtn = binding.addCourierBtn

        addCourierBtn.setOnClickListener() {
            goToAddCourier()
        }
    }

    private fun goToAddCourier() {
        ViewService.setView(this, AdminAddCourierActivity())
    }
}