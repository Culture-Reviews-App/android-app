package com.eb.culturereviews.view.home

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.StarHalf
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eb.culturereviews.model.Review
import com.eb.culturereviews.ui.theme.BlackColor
import com.eb.culturereviews.ui.theme.DarkGreenColor
import com.eb.culturereviews.ui.theme.DarkerGreenColor
import com.eb.culturereviews.ui.theme.PaleBlackColor

@Composable
fun ReviewPreviewCard(
    review: Review,
    onClick: () -> Unit = { },
) {
    Card(
        modifier = Modifier
            .padding(horizontal = 10.dp)
            .padding(bottom = 10.dp)
            .fillMaxWidth()
            .height(140.dp)
            .border(
                width = 1.dp,
                color = DarkerGreenColor,
                shape = RoundedCornerShape(16.dp)
            )
            .clickable { onClick() },
        colors = CardDefaults.cardColors(containerColor = DarkGreenColor),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
            ) {
                Text(
                    text = review.reviewName,
                    style = MaterialTheme.typography.bodyMedium.copy(color = BlackColor)
                )

                Spacer(modifier = Modifier.weight(1f))

//                Text(
//                    text = "${review.point}/10",
//                    style = MaterialTheme.typography.bodySmall.copy(color = DarkerGreenColor)
//                )
                
                StarRating(rating = review.point)
            }

            Text(
                text = review.reviewText,
                style = MaterialTheme.typography.bodySmall.copy(color = PaleBlackColor),
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .padding(top = 4.dp)
                    .weight(1f)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
            ) {
                Text(
                    text = review.userName,
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = DarkerGreenColor,
                        fontSize = 11.5.sp
                    )
                )

                Spacer(modifier = Modifier.weight(1f))

                Text(
                    text = review.type.replaceFirstChar { it.uppercase() },
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = DarkerGreenColor,
                        fontSize = 11.5.sp
                    )
                )
            }


        }
    }
}

@Composable
fun StarRating(rating: Int) {
    Row {
        for (i in 1..5) {
            when {
                i <= rating / 2 -> {
                    Icon(
                        imageVector = Icons.Filled.Star,
                        contentDescription = "Full Star",
                        tint = Color.Yellow
                    )
                }
                i == (rating / 2) + 1 && rating % 2 != 0 -> {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.StarHalf,
                        contentDescription = "Half Star",
                        tint = Color.Yellow
                    )
                }
                else -> {
                    Icon(
                        imageVector = Icons.Filled.StarBorder,
                        contentDescription = "Empty Star",
                        tint = Color.Yellow
                    )
                }
            }
        }
    }
}

/*
film!
sinema
tiyatro!
kitap!
konser
dizi
manga
 */