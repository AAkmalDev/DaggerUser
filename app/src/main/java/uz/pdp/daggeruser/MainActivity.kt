package uz.pdp.daggeruser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*
import uz.pdp.daggeruser.adapters.RvAdapter
import uz.pdp.daggeruser.models.User
import uz.pdp.daggeruser.repository.UserViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as App).applicationComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userViewModel.getUserRepository().observe(this, Observer {
            recycler.adapter = RvAdapter(it as ArrayList<User>)
        })
    }
}