package com.example.danhthiep

import android.R.id.text2
import android.os.Bundle
import android.provider.ContactsContract
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danhthiep.ui.theme.DanhThiepTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DanhThiepTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(210,232,212)
                ) {
                    Danhthiep(
                        ten = stringResource(R.string.ten),
                        lop = stringResource(R.string.lop),
                        sdt = stringResource(R.string.sdt),
                        contact = stringResource(R.string.contact),
                        email = stringResource(R.string.email)
                    )
                }
            }
        }
    }
}
@Composable
fun Danhthiep(ten: String, lop: String, sdt: String, contact: String, email: String, modifier: Modifier = Modifier) {
    val anh = painterResource(R.drawable.android_logo)
    Box(
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.align(alignment = Alignment.Center)
        ) {
            Image(
                painter = anh,
                contentDescription = null,
                modifier = Modifier
                    .background(color = Color(7, 48, 66))
                    .height(100.dp)

                )
            Text(
                text = ten,
                fontSize = 30.sp,
                modifier = Modifier.padding(5.dp)
            )
            Text(
                text = lop,
                fontWeight = FontWeight.Bold,
                color = Color(17,112,62)
            )
        }
        Column(
            modifier = Modifier
                .align(alignment = Alignment.BottomCenter)
                .padding(bottom = 40.dp)
        ) {
            Row {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = null,
                    tint = Color(15,111,58)
                )
                Spacer(Modifier.width(20.dp))
                Text(
                    text = sdt
                )
            }
            Row {
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = null,
                    tint = Color(15,111,58)
                )
                Spacer(Modifier.width(20.dp))
                Text(
                    text = contact
                )
            }
            Row {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = null,
                    tint = Color(15,111,58)
                )
                Spacer(Modifier.width(20.dp))
                Text(
                    text = email
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    DanhThiepTheme {

    }
}