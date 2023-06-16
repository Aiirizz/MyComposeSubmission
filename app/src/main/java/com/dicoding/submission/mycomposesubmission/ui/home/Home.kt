import android.annotation.SuppressLint
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.dicoding.submission.mycomposesubmission.model.Country
import com.dicoding.submission.mycomposesubmission.ui.component.AseanListItem
import com.dicoding.submission.mycomposesubmission.ui.home.HomeViewModel
import com.riyandifirman.cinemawiki.component.AppBar

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Home(navController: NavController, viewModel: HomeViewModel){
    val country = viewModel.countryList.value
    val toDetail: (Country) -> Unit = { country ->
        navController.navigate("detail/${country.flag}")

    }
    Scaffold(
        topBar = {
            AppBar(navController)

        },
        content = {
            LazyColumn{
                items(country.size){ index ->
                    AseanListItem(country[index]) {
                        toDetail(country[index])
                    }
                }
            }
        }
    )
}