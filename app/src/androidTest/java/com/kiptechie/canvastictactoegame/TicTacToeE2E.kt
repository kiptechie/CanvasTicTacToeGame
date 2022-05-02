package com.kiptechie.canvastictactoegame

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.test.click
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performGesture
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.kiptechie.canvastictactoegame.components.TicTacToeCanvas
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TicTacToeE2E {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun initialize() {
        composeTestRule.setContent {
            TicTacToeGameScreen()
        }
    }

    @Test
    fun ticTacToeCanvasExists() {
        composeTestRule.onNodeWithTag(testTag = "tic_tac_toe_canvas").assertExists()
    }

}