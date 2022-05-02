package com.kiptechie.canvastictactoegame

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kiptechie.canvastictactoegame.components.TicTacToeCanvas
import com.kiptechie.canvastictactoegame.models.Player

@Composable
fun TicTacToeGameScreen() {
    var winningPlayer by remember {
        mutableStateOf<Player?>(null)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TicTacToeCanvas(
            onNewRound = {
                winningPlayer = null
            },
            onPlayerWin = {
                winningPlayer = it
            }
        )
        Spacer(modifier = Modifier.height(50.dp))
        winningPlayer?.let {
            Text(
                text = "Player ${it.symbol} has won!",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}