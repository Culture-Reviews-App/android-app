package com.eb.culturecritics.view.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.eb.culturecritics.R
import com.eb.culturecritics.ui.theme.CultureCriticsTheme
import com.eb.culturecritics.ui.theme.PurpleGrey40
import com.eb.culturecritics.ui.theme.PurpleGrey80
import com.eb.culturecritics.ui.theme.RedColor
import com.eb.culturecritics.ui.theme.Typography

@Composable
fun LoginScreen(
    onLoginSuccess: () -> Unit
) {

    val emailState = remember { mutableStateOf(TextFieldValue("")) }
    val passwordState = remember { mutableStateOf(TextFieldValue("")) }

    val (showError, setShowError) = remember { mutableStateOf(false) }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .padding(horizontal = 15.dp)
                .padding(top = 200.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.app_name),
                style = Typography.titleMedium
            )

            CustomTextField(
                placeholderText = R.string.e_mail,
                isPasswordField = false,
                onTextChange = { emailState.value = it }
            )

            CustomTextField(
                placeholderText = R.string.password,
                isPasswordField = true,
                onTextChange = { passwordState.value = it }
            )

            if (showError) {
                Text(
                    text = stringResource(id = R.string.password_or_email_is_wrong),
                    color = RedColor,
                    modifier = Modifier.padding(top = 9.dp),
                    style = Typography.bodyMedium.copy(
                        fontSize = 14.sp,
                    )
                )
            }

            Button(
                onClick = {
                    if (emailState.value.text == "test" && passwordState.value.text == "test") {
                        onLoginSuccess()
                    } else {
                        setShowError(true)
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = PurpleGrey40
                ),
                modifier = Modifier.padding(top = 30.dp).width(150.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.log_in),
                    style = Typography.bodyMedium.copy(
                        fontWeight = FontWeight.Bold,
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }

        }
    }
}

@Composable
fun CustomTextField(
    placeholderText: Int,
    isPasswordField: Boolean,
    onTextChange: (TextFieldValue) -> Unit
) {

    val newTextStateContent = remember { mutableStateOf("") }
    val textVisibility = remember { mutableStateOf(!isPasswordField) }

    Box(
        modifier = Modifier
            .padding(top = 22.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(color = PurpleGrey80),
    ) {
        TextField(
            value = newTextStateContent.value,
            onValueChange = { newInput ->
                newTextStateContent.value = newInput
                onTextChange(TextFieldValue(newInput))
            },
            textStyle = Typography.bodyMedium,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(30.dp)),
            placeholder = {
                Text(
                    text = stringResource(id = placeholderText),
                    style = Typography.bodyMedium
                )
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            visualTransformation = if (textVisibility.value) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                if (isPasswordField && newTextStateContent.value.isNotEmpty()) {
                    val image = if (textVisibility.value)
                        Icons.Default.Visibility
                    else Icons.Default.VisibilityOff

                    IconButton(onClick = {
                        textVisibility.value = !textVisibility.value
                    }) {
                        Icon(imageVector = image, contentDescription = "Toggle Password Visibility")
                    }
                }
            }
        )
    }

}
