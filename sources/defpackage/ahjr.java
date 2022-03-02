package defpackage;

import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: ahjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahjr {
    public static final int[] a = {9, 15};
    public ActivityRecognitionResult b = null;
    public ActivityRecognitionResult c = null;
    public long d = 0;
    public int e = 0;
    private boolean f;

    public ahjr(boolean z) {
        this.f = z;
    }

    public final boolean a() {
        ActivityRecognitionResult activityRecognitionResult;
        boolean z = true;
        if (!this.f) {
            ActivityRecognitionResult activityRecognitionResult2 = this.b;
            if (activityRecognitionResult2 == null || (activityRecognitionResult = this.c) == null || activityRecognitionResult.c - activityRecognitionResult2.c < 480000 || this.e < 3) {
                z = false;
            }
            StringBuilder sb = new StringBuilder(37);
            sb.append("isCurrentlyInDeepStill result = ");
            sb.append(z);
            sb.toString();
        }
        return z;
    }

    public final void b() {
        this.b = null;
        this.c = null;
        this.e = 0;
        this.f = false;
        StringBuilder sb = new StringBuilder(63);
        sb.append("shouldSwitchToDeepStill: clear. consecutiveStills = 0");
        sb.toString();
    }
}
