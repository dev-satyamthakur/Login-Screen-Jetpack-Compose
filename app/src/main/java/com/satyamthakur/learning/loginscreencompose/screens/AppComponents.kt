package com.satyamthakur.learning.loginscreencompose.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.satyamthakur.learning.loginscreencompose.ui.theme.Primary

@Composable
fun MyTextFieldComponent(label: String) {
    val textValue = remember { mutableStateOf("") }

    OutlinedTextField(
        label = { Text(text = label) },
        colors  = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Primary,
            focusedLabelColor = Primary,
            cursorColor = Primary
        ),
        keyboardOptions = KeyboardOptions.Default,
        value = textValue.value,
        onValueChange = { textValue.value = it }
    )

}

@Composable
fun GreetTextView(value: String) {
    Text(
        modifier = Modifier.fillMaxWidth(),
        text = value,
        style = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal
        ),
        textAlign = TextAlign.Center
    )
}

@Composable
fun CreateAccount(value: String) {
    Text(
        modifier = Modifier.fillMaxWidth(),
        text = value,
        style = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold
        ),
        textAlign = TextAlign.Center
    )
}