package defpackage;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import com.google.android.gms.googlehelp.feedback.Screenshot;

/* renamed from: mvv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mvv extends AsyncTask {
    final /* synthetic */ ErrorReport a;
    final /* synthetic */ Pair b;
    final /* synthetic */ Screenshot c;
    final /* synthetic */ Pair d;
    final /* synthetic */ FeedbackChimeraActivity e;

    public mvv(FeedbackChimeraActivity feedbackChimeraActivity, ErrorReport errorReport, Pair pair, Screenshot screenshot, Pair pair2) {
        this.e = feedbackChimeraActivity;
        this.a = errorReport;
        this.b = pair;
        this.c = screenshot;
        this.d = pair2;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        boolean z;
        byte[] bArr;
        boolean z2;
        Void[] voidArr = (Void[]) objArr;
        FeedbackChimeraActivity feedbackChimeraActivity = this.e;
        mwg mwg = FeedbackChimeraActivity.d;
        feedbackChimeraActivity.i = false;
        if (this.a.v == null) {
            if (mwj.a(this.b, this.c)) {
                this.e.i = true;
                z = true;
            } else {
                z = false;
            }
            bArr = Base64.decode(this.c.c, 0);
        } else {
            if (mwj.a(this.b, this.c)) {
                this.e.i = true;
                z2 = true;
            } else {
                z2 = false;
            }
            bArr = this.a.v;
        }
        if (this.e.k()) {
            if (!FeedbackChimeraActivity.m()) {
                FeedbackChimeraActivity.e = Bitmap.createScaledBitmap(Screenshot.a(bArr, false), ((Integer) this.d.first).intValue(), ((Integer) this.d.second).intValue(), true);
            }
            this.e.f = Bitmap.createScaledBitmap(FeedbackChimeraActivity.e, FeedbackChimeraActivity.e.getWidth() / 2, FeedbackChimeraActivity.e.getHeight() / 2, true);
        } else {
            FeedbackChimeraActivity.e = Screenshot.a(bArr, z);
            this.e.f = FeedbackChimeraActivity.e;
        }
        return this.e.f;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        FeedbackChimeraActivity feedbackChimeraActivity = this.e;
        mwb mwb = feedbackChimeraActivity.b;
        if (!mwb.isDetached() && !mwb.isRemoving() && mwb.isResumed()) {
            feedbackChimeraActivity.b.a(bitmap, feedbackChimeraActivity.k());
        } else {
            feedbackChimeraActivity.c = true;
        }
    }
}
