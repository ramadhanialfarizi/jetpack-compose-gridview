package com.learning.gridview.pages.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.learning.gridview.R
import com.learning.gridview.data.DataModel

class CardComponents {
    @Composable
    fun CardView(dataModel: DataModel, modifier: Modifier = Modifier) {
        Card(modifier = modifier) {
            Row {
                Box {
                    Image(
                        painter = painterResource(dataModel.imageResourceId),
                        contentDescription = stringResource(dataModel.stringResourceId),
                        modifier = modifier
                            .size(width = 68.dp, height = 68.dp)
                            .aspectRatio(1f),
                        contentScale = ContentScale.Crop
                    )
                }
                Column {
                    Text(
                        text = LocalContext.current.getString(dataModel.stringResourceId),
                        modifier = Modifier.padding(16.dp),
                        style = MaterialTheme.typography.headlineSmall
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(R.drawable.ic_grain),
                            contentDescription = null,
                            modifier = Modifier
                                .padding(start = dimensionResource(R.dimen.padding_medium))
                        )
                        Text(
                            text = dataModel.scores.toString(),
                            style = MaterialTheme.typography.labelMedium,
                            modifier = Modifier.padding(start = dimensionResource(R.dimen.padding_small))
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun cardViewPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        CardComponents().CardView(
            DataModel(
                imageResourceId = com.learning.gridview.R.drawable.architecture,
                scores = 270,
                stringResourceId = com.learning.gridview.R.string.architecture,
            )
        )
    }
}