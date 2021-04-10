package proj.ezcolet.contracts

import proj.ezcolet.models.users.CourierModel
import proj.ezcolet.models.users.UserModel

interface CourierInfoContract {
    interface Presenter {
        suspend fun getUser(username: String): CourierModel?
        suspend fun getFirstName(courier: CourierModel): String?
        suspend fun getLastName(courier: CourierModel): String?
        suspend fun getRating(courier: CourierModel): Float?
        suspend fun getMonthlyOrders(courier: CourierModel): Int?
        suspend fun getTotalOrders(courier: CourierModel): Int?
        suspend fun getMaxRatings(courier: CourierModel): Int?
        suspend fun getNumberRatings(courier: CourierModel): Int?
    }
}