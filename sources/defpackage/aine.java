package defpackage;

import android.os.SystemClock;

/* renamed from: aine  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aine extends aimp {
    public aine(aing aing, aiml aiml) {
        super(aing, aiml);
    }

    public final aoaq a() {
        return aoaq.UNKNOWN_ACTIVITY;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return 180;
    }

    /* access modifiers changed from: protected */
    public final int c() {
        long j;
        if (this.b.a()) {
            return 60;
        }
        if (!this.b.c.a(SystemClock.elapsedRealtime(), 900000, 720000, 6)) {
            j = 60;
        } else {
            j = 120;
        }
        boolean z = aikq.a;
        return (int) Math.max(j, (long) Math.min(1800, this.b.a));
    }

    /* access modifiers changed from: protected */
    public final int d() {
        int i = this.b.b;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }

    public final String g() {
        return "UnknownActivityState";
    }

    /* access modifiers changed from: protected */
    public final double h() {
        return 1.5d;
    }
}
