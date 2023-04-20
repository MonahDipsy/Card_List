
package com.example.cardlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cardlist.ui.theme.CardListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserList()
        }
    }
}

@Composable
fun UserList(){
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        UserCard(
            imageId = R.drawable.lion,
            heading = "Lion",
            description = "The lion is a large, carnivorous mammal with a distinctive mane and is known as the king of the jungle."
        )
        UserCard(
            imageId = R.drawable.monkey,
            heading = "Monkey",
            description = "A highly intelligent and social primate, known for their dexterity and ability to use tools."
        )
        UserCard(
            imageId = R.drawable.zebra,
            heading = "Zebra",
            description = "A striped herbivorous mammal that lives in herds and is native to Africa, often hunted by predators such as lions and hyenas."
        )
        UserCard(
            imageId = R.drawable.parrot,
            heading = "Parrot",
            description = "A colorful bird with a distinctive curved beak, known for their ability to mimic human speech and sounds."
        )
        UserCard(imageId = R.drawable.headline,
            heading = "Human",
            description = "Monicah Odipo is the author. She is a human being and a student at Maseno" )
    }
}

@Composable
fun UserCard(imageId: Int, heading: String, description: String) {
    Card(
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(12.dp)
                .padding(12.dp)
        ) {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = heading, fontSize = 14.sp, color = Color.Blue)
                Text(
                    text = description,
                    fontSize = 10.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(12.dp)
                )
                Button(onClick = {
                    // Action to perform
                }) {
                    Text(
                        text = "View Animal",
                    )

                }
            }
        }
    }
}

@Preview
@Composable
fun UserListPreview() {
    CardListTheme {
        UserList()
    }
}



