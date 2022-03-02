package defpackage;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: ahlg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahlg extends ahjs {
    public ahlg(ahix ahix) {
        super(ahix, false);
    }

    /* access modifiers changed from: protected */
    public final void a(long j) {
        if (!this.b) {
            a((ahle) new ahkz(this.d));
        }
    }

    public final void b(ActivityRecognitionResult activityRecognitionResult) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    public final int c() {
        return 5;
    }

    /* access modifiers changed from: protected */
    public final ahil d() {
        if (!this.d.B.d()) {
            return this.d.P;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String f() {
        return "TiltDetector";
    }

    /* access modifiers changed from: protected */
    public final void i() {
        this.d.al = SystemClock.elapsedRealtime();
    }

    public final String p() {
        return "TiltDetectingInFutureState";
    }
}
