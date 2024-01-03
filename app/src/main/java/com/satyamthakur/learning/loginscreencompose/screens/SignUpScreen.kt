package com.satyamthakur.learning.loginscreencompose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SignUpScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(4.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            NormalTextView(value = "Hey there,")
            CreateAccount(value = "Create an Account")

            Spacer(modifier = Modifier.height(32.dp))

            MyTextFieldComponent(label = "First name", Icons.Outlined.Person)
            MyTextFieldComponent(label = "Last name", Icons.Outlined.Person)
            MyTextFieldComponent(label = "Email", Icons.Outlined.Email)
            PasswordTextFieldComponent(label = "Password", Icons.Outlined.Lock)
            
            CheckboxComponent(value = "By continuing you accept our Privacy Policy and Terms of Use")
        }
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DefaultPrev() {
    SignUpScreen()
}