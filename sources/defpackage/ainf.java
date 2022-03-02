package defpackage;

/* renamed from: ainf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ainf extends aimp {
    public ainf(aing aing, aiml aiml) {
        super(aing, aiml);
    }

    public final aoaq a() {
        return aoaq.WALKING_ACTIVITY;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        if (this.b.a()) {
            return 300;
        }
        if (this.b.b(100000.0d)) {
            return -1;
        }
        if (!this.b.b(3333.3333333333335d)) {
            return 180;
        }
        return 300;
    }

    /* access modifiers changed from: protected */
    public final int c() {
        if (this.b.a()) {
            return 60;
        }
        if (!this.b.b(100000.0d)) {
            return Math.max(20, Math.min(1800, this.b.a));
        }
        return 1800;
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
        return "WalkingActivityState";
    }

    /* access modifiers changed from: protected */
    public final double h() {
        return 1.5d;
    }
}
