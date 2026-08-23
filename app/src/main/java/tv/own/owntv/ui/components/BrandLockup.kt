package tv.own.owntv.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import tv.own.owntv.R

/** LEVEL FIVE TV branded lockup using the supplied transparent logo. */
@Composable
fun BrandLockup(
    modifier: Modifier = Modifier,
    markSize: Int = 36,
    textSize: Int = 26,
) {
    // markSize/textSize are retained for source compatibility with existing call sites.
    Image(
        painter = painterResource(R.drawable.level_five_logo),
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = modifier.size((markSize * 2.25f).dp),
    )
}
