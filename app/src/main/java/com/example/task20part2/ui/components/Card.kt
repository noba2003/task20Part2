package com.example.task20part2.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task20part2.R
import com.example.task20part2.model.Profile


@Composable
fun ProfileCard(pro: Profile) {

    Card (modifier = Modifier.padding(5.dp).fillMaxWidth().padding(8.dp).border(width = 2.dp, color = Color.Black),) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                ImageCard(pro.imageProfile)
                InformationCard("Posts", pro.post.toString())
                InformationCard("Followers", pro.followers.toString())
                InformationCard("Following", pro.following.toString())

            }
            Discription("Catalin", pro.discription)
            EditProfile()
            Gallery(pro.images)
            Gallery(listOf(R.drawable.imag2, R.drawable.imag5))

        }
    }

}

@Composable
fun InformationCard(text: String, value: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = value, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        Text(text = text, fontSize = 14.sp)

    }
}

@Composable
fun Discription(text: String, value: String) {

    Column(modifier = Modifier.padding(top = 16.dp, start = 15.dp)) {
        Text(text = text, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        Text(text = value)

    }
}

@Composable
fun ImageCard(imagProfile: Int) {
    Image(
        painter = painterResource(id = imagProfile),
        contentDescription = null,
        modifier = Modifier
            .size(120.dp)
            .clip(shape = CircleShape)
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = CircleShape
            ),
        contentScale = ContentScale.Crop
    )
}


@Composable
fun Gallery(images: List<Int>) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(top = 2.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(2.dp)
        ) {
            for (image in images) {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .weight(1f),
                    contentScale = ContentScale.Crop
                )
            }
        }


    }
}

@Composable
fun EditProfile() {

    Button(
        onClick = { },
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Gray,
            contentColor = Color.Black
        ),
        shape = RoundedCornerShape(4.dp)
    ) {
        Text(text = "Edit Profile", fontSize = 16.sp, fontWeight = FontWeight.Medium)

    }
}