package defpackage;

import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: ahkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahkr extends ahjs {
    public ahkr(ahix ahix) {
        super(ahix, false);
    }

    /* access modifiers changed from: protected */
    public final void a(long j) {
        if (!this.b) {
            m();
        }
    }

    public final void b(ActivityRecognitionResult activityRecognitionResult) {
        ativ.a((Object) activityRecognitionResult);
    }

    /* access modifiers changed from: protected */
    public final ahil d() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final String f() {
        return "PhonePositionDetector";
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
        this.d.al = SystemClock.elapsedRealtime();
        this.d.an = SystemClock.elapsedRealtime();
    }

    public final String p() {
        return "PhonePositionDetectingInFutureState";
    }
}
