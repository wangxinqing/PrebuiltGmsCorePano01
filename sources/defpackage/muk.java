package defpackage;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Base64;
import com.google.android.gms.feedback.AnnotateScreenshotChimeraActivity;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import java.lang.ref.WeakReference;

/* renamed from: muk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class muk extends AsyncTask {
    private final WeakReference a;
    private final int b;
    private final int c;

    public muk(AnnotateScreenshotChimeraActivity annotateScreenshotChimeraActivity, int i, int i2) {
        this.a = new WeakReference(annotateScreenshotChimeraActivity);
        this.b = i2;
        this.c = i;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (((AnnotateScreenshotChimeraActivity) this.a.get()) == null) {
            return null;
        }
        mwg mwg = FeedbackChimeraActivity.d;
        ErrorReport g = mwg.g();
        Screenshot screenshot = mwg.b;
        byte[] bArr = g.v;
        if (bArr == null) {
            bArr = Base64.decode(screenshot.c, 0);
        }
        return Bitmap.createScaledBitmap(Screenshot.a(bArr, false), this.c, this.b, true);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        AnnotateScreenshotChimeraActivity annotateScreenshotChimeraActivity = (AnnotateScreenshotChimeraActivity) this.a.get();
        if (annotateScreenshotChimeraActivity != null && bitmap != null) {
            FeedbackChimeraActivity.l = true;
            FeedbackChimeraActivity.a(bitmap.copy(bitmap.getConfig(), true));
            annotateScreenshotChimeraActivity.a(FeedbackChimeraActivity.e);
            annotateScreenshotChimeraActivity.a.invalidate();
        }
    }
}
