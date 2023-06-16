import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dicoding.submission.mycomposesubmission.R
import com.dicoding.submission.mycomposesubmission.model.Country
import com.dicoding.submission.mycomposesubmission.ui.theme.MyComposeSubmissionTheme

@Composable
fun DetailPage(country: Country){
    val flag = country.flag

    Column(
        modifier = Modifier
            .background(color = colorResource(id = R.color.teal_200))
            .fillMaxWidth()
            .padding(10.dp)

    ) {
        Text(
            text = country.name,
            style = TextStyle(fontSize = 40.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier
                .padding(bottom = 20.dp, top = 20.dp)
        )
        Image(
            painter = painterResource(id = flag),
            contentDescription = "flag-detail",
            modifier = Modifier
                .size(350.dp, 180.dp)
        )
        Text(
            text = country.desc,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier
                .padding(top = 50.dp, bottom = 100.dp)
        )
    }
}

@Preview(device = Devices.PIXEL_4, showBackground = true)
@Composable
fun DetailPagePreview(){
    MyComposeSubmissionTheme {
        DetailPage(Country("Indonesia","Deskripsi", R.drawable.indo))
    }
}