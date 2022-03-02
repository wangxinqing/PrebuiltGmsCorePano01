package defpackage;

import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: ahkg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahkg extends ahjs {
    private boolean k = true;

    public ahkg(ahix ahix) {
        super(ahix, false);
    }

    /* access modifiers changed from: protected */
    public final void a(long j) {
        if (this.b) {
            return;
        }
        if (!this.k) {
            this.d.a(false, true);
            a((ahle) new ahkb(this.d));
            return;
        }
        a((ahle) new ahkz(this.d));
    }

    public final void b(ActivityRecognitionResult activityRecognitionResult) {
        boolean z;
        ativ.a((Object) activityRecognitionResult);
        if (!this.b) {
            e(activityRecognitionResult);
            boolean z2 = this.k;
            if (activityRecognitionResult.a().a() == 3) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = z2 & z;
            this.k = z3;
            if (z3) {
                String valueOf = String.valueOf(activityRecognitionResult);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                sb.append("Low power still detected. Reporting: ");
                sb.append(valueOf);
                sb.toString();
                this.d.a(activityRecognitionResult);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int c() {
        return 5;
    }

    /* access modifiers changed from: protected */
    public final ahil d() {
        if (!this.d.B.d()) {
            return this.d.O;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String f() {
        return "LowPowerDetector";
    }

    /* access modifiers changed from: protected */
    public final double l() {
        return 8.0d;
    }

    public final String p() {
        return "LowPowerStationaryDetectingState";
    }

    public final void c(ActivityRecognitionResult activityRecognitionResult) {
        super.c(activityRecognitionResult);
        if (!this.b && activityRecognitionResult.a().a() == 5) {
            this.k = false;
        }
    }
}
