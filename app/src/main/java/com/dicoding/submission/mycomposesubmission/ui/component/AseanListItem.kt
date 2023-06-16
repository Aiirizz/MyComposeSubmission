package com.dicoding.submission.mycomposesubmission.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dicoding.submission.mycomposesubmission.R
import com.dicoding.submission.mycomposesubmission.model.Country
import com.dicoding.submission.mycomposesubmission.ui.theme.MyComposeSubmissionTheme


@Composable
fun AseanListItem(country: Country, onClick: () -> Unit) {
    val flag = country.flag

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(3.dp)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 20.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = R.color.teal_200)

        )

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(flag),
                contentDescription = "flag",
                modifier = Modifier
                    .size(120.dp, 80.dp)
                    .padding(start = 15.dp, end = 0.dp)
            )
            Text(
                text = country.name,
                style = MaterialTheme.typography.displaySmall,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, top = 0.dp, bottom = 0.dp, end = 10.dp)
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun AseanListAppPreview(){
    MyComposeSubmissionTheme {
        val onClick : () -> Unit = {}
        AseanListItem(Country("Indonesia","", R.drawable.indo),onClick)
    }
}
