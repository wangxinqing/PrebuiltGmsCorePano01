package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import com.google.android.gms.feedback.AnnotateScreenshotChimeraActivity;
import com.google.android.gms.feedback.DrawableView;
import java.util.ArrayList;

/* renamed from: mug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mug implements View.OnClickListener {
    final /* synthetic */ AnnotateScreenshotChimeraActivity a;

    public mug(AnnotateScreenshotChimeraActivity annotateScreenshotChimeraActivity) {
        this.a = annotateScreenshotChimeraActivity;
    }

    public void onClick(View view) {
        AnnotateScreenshotChimeraActivity annotateScreenshotChimeraActivity = this.a;
        DrawableView drawableView = annotateScreenshotChimeraActivity.a;
        Canvas canvas = new Canvas(drawableView.e);
        if (!drawableView.f.isEmpty()) {
            ArrayList arrayList = drawableView.f;
            arrayList.remove(arrayList.size() - 1);
            ArrayList arrayList2 = drawableView.g;
            arrayList2.remove(arrayList2.size() - 1);
            ArrayList arrayList3 = drawableView.h;
            arrayList3.remove(arrayList3.size() - 1);
            Bitmap bitmap = drawableView.e;
            drawableView.b = bitmap;
            drawableView.e = bitmap.copy(bitmap.getConfig(), true);
            drawableView.c = canvas;
            drawableView.c.drawBitmap(drawableView.b, 0.0f, 0.0f, drawableView.a);
            for (int i = 0; i < drawableView.f.size(); i++) {
                drawableView.a(((Integer) drawableView.g.get(i)).intValue(), ((Integer) drawableView.h.get(i)).intValue());
                drawableView.c.drawPath((Path) drawableView.f.get(i), drawableView.d);
            }
            drawableView.invalidate();
        }
        if (drawableView.d.getAlpha() < ((int) axgy.c())) {
            annotateScreenshotChimeraActivity.b();
        } else {
            annotateScreenshotChimeraActivity.a();
        }
    }
}
