package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.google.android.gms.feedback.AnnotateScreenshotChimeraActivity;
import com.google.android.gms.feedback.DrawableView;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import java.util.ArrayList;

/* renamed from: muh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class muh implements View.OnClickListener {
    final /* synthetic */ AnnotateScreenshotChimeraActivity a;

    public muh(AnnotateScreenshotChimeraActivity annotateScreenshotChimeraActivity) {
        this.a = annotateScreenshotChimeraActivity;
    }

    public void onClick(View view) {
        AnnotateScreenshotChimeraActivity annotateScreenshotChimeraActivity = this.a;
        FeedbackChimeraActivity.a(annotateScreenshotChimeraActivity.a.b);
        DrawableView drawableView = annotateScreenshotChimeraActivity.a;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < drawableView.f.size(); i++) {
            if (((long) ((Integer) drawableView.h.get(i)).intValue()) < axgy.c()) {
                RectF rectF = new RectF();
                ((Path) drawableView.f.get(i)).computeBounds(rectF, true);
                float f = ((float) drawableView.i) / 2.0f;
                rectF.top -= f;
                rectF.bottom += f;
                rectF.left -= f;
                rectF.right += f;
                arrayList.add(rectF);
            }
        }
        if (FeedbackChimeraActivity.d != null) {
            if (FeedbackChimeraActivity.g == null) {
                FeedbackChimeraActivity.g = new ArrayList();
            }
            FeedbackChimeraActivity.g.addAll(arrayList);
            FeedbackChimeraActivity.d.g().ad = FeedbackChimeraActivity.g;
        }
        annotateScreenshotChimeraActivity.finish();
    }
}
