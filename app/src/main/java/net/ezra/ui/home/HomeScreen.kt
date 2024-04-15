package net.ezra.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS

@Composable
fun HomeScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(10.dp)
            .padding(top = 10.dp)

    ){
        Text(text = stringResource(id = R.string.mit))
        Text(text = "this is the homepage")

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_ABOUT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "about"
        )

        Button(onClick = {
            navController.navigate(ROUTE_ABOUT) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            }
        }) {

            Text(text = "sketchy about")

        }

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_CONTACT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "Contact"
        )

        Card(
            colors = CardDefaults.cardColors(Color(0xffE52C04)),
            elevation = CardDefaults.cardElevation(5.dp)

        ) {



        }


        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_PRODUCTS) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "go to products screen"

        )

        Button(onClick = {
            navController.navigate(ROUTE_MIT) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            }}) {

            Text(text = "fuurye")

        }

        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_MIT) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "go to mit",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )

        Text(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_SHOP) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
            text = "go to shop screen",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )
        
        Spacer(modifier = Modifier.height(10.dp))


        
        OutlinedButton(onClick = {

            navController.navigate(ROUTE_ADD_STUDENTS) {
                popUpTo(ROUTE_HOME) { inclusive = true }
            }

        }) {

            Text(text = "Add Students")

        }







    }

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

