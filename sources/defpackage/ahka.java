package defpackage;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: ahka  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahka extends ahkc {
    private boolean k = false;

    public ahka(ahix ahix) {
        super(ahix, true);
    }

    public final void d(ActivityRecognitionResult activityRecognitionResult) {
        if (!this.b && !this.k) {
            this.d.a(activityRecognitionResult);
            this.k = true;
            o();
        }
    }

    /* access modifiers changed from: protected */
    public final String f() {
        return "FullAndOffBodyDetectorInPast";
    }

    /* access modifiers changed from: protected */
    public final void i() {
        super.i();
        this.d.am = SystemClock.elapsedRealtime();
    }

    public final String p() {
        return "FullAndOffBodyDetectingInPastState";
    }
}
