package com.boringxcompany.charts.currency.ui.screen

//import com.boringxcompany.charts.currency.ui.chart.CurrencyChart
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import coil3.compose.AsyncImage
import com.boringxcompany.charts.currency.data.domain.GeneralCoinInfo
import com.boringxcompany.charts.currency.viewmodel.HomeViewModel

@Composable
fun HomeScreen(viewModel: HomeViewModel) {
    val currencies = viewModel.currencies.collectAsState(listOf())
    Column {
        TopBar()
        LazyColumn {
            items(currencies.value) { currency ->
                CurrencyCard(currency)
            }
        }
    }
}

@Composable
private fun TopBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text("Image")
        Text(text = "Name")
        Text(text = "Price")
        Text(text = "24h%")
        Text(text = "Volume(24h)")
        Text(text = "marketCap")
    }
}

@Composable
private fun CurrencyCard(generalCoinInfo: GeneralCoinInfo, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        AsyncImage(
            model = generalCoinInfo.image,
            contentDescription = null,
        )
        println(generalCoinInfo.image.toString())
        Column {
            Text(text = generalCoinInfo.fullName.toString())
            Text(text = generalCoinInfo.name.toString())
        }
        Text(text = generalCoinInfo.price.toString())
        Text(text = generalCoinInfo.dailyPriceChangePercent.toString())
        Text(text = generalCoinInfo.dailyVolume.toString())
        Text(text = generalCoinInfo.marketCap.toString())

    }
}
