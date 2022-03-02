package defpackage;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: ahkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahkb extends ahjs {
    public ahkb(ahix ahix) {
        super(ahix, false);
    }

    /* access modifiers changed from: protected */
    public final void D() {
        j();
    }

    /* access modifiers changed from: protected */
    public final void a(long j) {
        if (this.b) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            m();
        } else if (!this.j) {
            this.d.b(SystemClock.elapsedRealtime() + j);
        } else {
            n();
        }
    }

    public final void b(ActivityRecognitionResult activityRecognitionResult) {
        ativ.a((Object) activityRecognitionResult);
        if (!this.b) {
            this.d.a(activityRecognitionResult);
            e(activityRecognitionResult);
        }
    }

    /* access modifiers changed from: protected */
    public final ahil d() {
        if (!this.d.B.d()) {
            return this.d.K;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String f() {
        return "FullDetector";
    }

    public final void h() {
        super.h();
        ahix ahix = this.d;
        if (!ahix.r.a) {
            ahix.m();
        }
    }

    public final String p() {
        return "FullDetectingInFutureState";
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        new Object[1][0] = Boolean.valueOf(z);
        if (this.j && this.d.a(9)) {
            a((ahle) new ahjz(this.d));
        }
    }
}
