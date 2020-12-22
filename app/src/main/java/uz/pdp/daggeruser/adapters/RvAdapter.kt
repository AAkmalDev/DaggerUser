package uz.pdp.daggeruser.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_user.view.*
import uz.pdp.daggeruser.R
import uz.pdp.daggeruser.models.User

class RvAdapter(val userList:ArrayList<User>):RecyclerView.Adapter<RvAdapter.Vh>() {


    inner class Vh(itemView: View):RecyclerView.ViewHolder(itemView){
        fun onBind(user: User){
            itemView.user_name.text = user.name
            itemView.user_email.text = user.email
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_user,parent,false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(userList[position])
    }

    override fun getItemCount(): Int = userList.size
}