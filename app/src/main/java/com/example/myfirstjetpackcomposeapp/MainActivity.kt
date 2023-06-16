package com.example.myfirstjetpackcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstjetpackcomposeapp.ui.theme.MyFirstJetPackCOmposeAppTheme
import androidx.compose.ui.unit.dp
import com.google.android.engage.common.datamodel.Image

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstJetPackCOmposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
//Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription =null,modifier=Modifier.background(Color.Black) )

    LazyRow(modifier = Modifier ){
        items(10){ i->
            Icon(imageVector = Icons.Default.Add , contentDescription = null, modifier = Modifier.size(80.dp))
        }
    }
//    LazyColumn(modifier = Modifier ){
//        items(10){ i->
//Icon(imageVector = Icons.Default.Add , contentDescription = null, modifier = Modifier.size(30.dp))
//        }
//    }
//Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)

//    Box(
//
//
////        horizontalArrangement = Arrangement.End,
//                modifier = Modifier.size(400.dp),
////        modifier=Modifier.background(color = Color.Red)
////        modifier = Modifier.fillMaxSize()
//// contentAlignment = Alignment.Center
//
//
//    ){
////        modifier=Modifier.background()
//        Text(
//            text = "Hello $name!",
//            color = Color.Blue,
//            fontWeight = FontWeight.Bold,
//            modifier = Modifier.align(alignment = Alignment.BottomEnd)
//
//        )
//        Text(
//            text = "Hello Welcome",
//            color = Color.Blue,
//            fontWeight = FontWeight.Bold,
////            modifier = Modifier.background(color = Color.Cyan)
//
//        )
//    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyFirstJetPackCOmposeAppTheme {
        Greeting("Android")
    }
}