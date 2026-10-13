import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true)
@Composable
fun Incrementador() {
    var contador1 by rememberSaveable { mutableStateOf(1) }
    var contador2 by rememberSaveable { mutableStateOf(2) }
    var contador3 by rememberSaveable { mutableStateOf(3) }
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally)
    {
        Button({
            contador1 += 1
            contador2 += 1
            contador3 += 1
        })
        {
            Text("Pulsar")
        }
        Text(text = "Tarea ${contador1}")
        Text(text = "Tarea ${contador2}")
        Text(text = "Tarea ${contador3}")

    }
}

@Preview(showSystemUi = true)
@Composable
fun MYStateHosting ()
{
    var cont1 by rememberSaveable{ mutableStateOf(0) }
    var cont2 by rememberSaveable{ mutableStateOf(0) }

    var NumImpar = 0
    if (cont1 == 0) NumImpar = 0
    else NumImpar = 2 * cont1 - 1

    var NumPar = 2 * cont2

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        MYStateHosting1(NumImpar, onClick = {cont1++})
        MYStateHosting1(NumPar, onClick = {cont2++})
    }
}

@Composable
fun MYStateHosting1(cont: Int,onClick:()->Unit)
{
    Button(onClick = onClick )
    {
        Text("Pulsar")
    }
    Text("He sido pulsado ${cont} veces")
}