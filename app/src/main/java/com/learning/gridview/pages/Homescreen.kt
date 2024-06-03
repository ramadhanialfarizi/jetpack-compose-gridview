package com.learning.gridview.pages

import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.learning.gridview.R
import com.learning.gridview.data.Datasource
import com.learning.gridview.pages.components.CardComponents

class Homescreen : ComponentActivity() {
    @Composable
    fun AppHomeScreen(modifier: Modifier = Modifier) {
        LazyVerticalGrid(
            modifier = modifier,
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
            horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
        ) {
            // must using items not item
            items(Datasource().loadData()) { topic ->
                CardComponents().CardView(dataModel = topic)
            }
        }
    }
}