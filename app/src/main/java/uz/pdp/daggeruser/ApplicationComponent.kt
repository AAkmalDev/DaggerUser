package uz.pdp.daggeruser

import dagger.Component
import uz.pdp.daggeruser.module.NetworkModule
import uz.pdp.daggeruser.repository.UserViewModel
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)

    fun inject(userViewModel: UserViewModel)

}