package com.google.android.gms.feedback;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PreviewScreenshotChimeraActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView((int) R.layout.preview_ui);
        ImageView imageView = (ImageView) findViewById(R.id.gf_screenshot_view);
        Bitmap bitmap = FeedbackChimeraActivity.e;
        if (bitmap != null) {
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int[] iArr = {point.x, point.y};
            int width = (int) (((float) bitmap.getWidth()) * 1.5f);
            int height = (int) (((float) bitmap.getHeight()) * 1.5f);
            if (width < iArr[0] && height < iArr[1]) {
                bitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
            }
            imageView.setImageBitmap(bitmap);
            return;
        }
        finish();
    }
}
