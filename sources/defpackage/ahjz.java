package defpackage;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: ahjz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahjz extends ahjs {
    private boolean k = false;

    public ahjz(ahix ahix) {
        super(ahix, true);
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
        return this.d.K;
    }

    /* access modifiers changed from: protected */
    public final String f() {
        return "FullAndOffBodyDetector";
    }

    public final void h() {
        super.h();
        ahix ahix = this.d;
        if (!ahix.r.a) {
            ahix.m();
        }
    }

    /* access modifiers changed from: protected */
    public final void i() {
        super.i();
        this.d.am = SystemClock.elapsedRealtime();
    }

    public final String p() {
        return "FullAndOffBodyDetectingInFutureState";
    }

    public final void d(ActivityRecognitionResult activityRecognitionResult) {
        if (!this.b && !this.k) {
            this.d.a(activityRecognitionResult);
            this.k = true;
            o();
        }
    }
}
