package defpackage;

/* renamed from: afm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afm {
    int a = 0;
    int b;
    int c;
    int d;
    int e;

    static final int a(int i, int i2) {
        if (i <= i2) {
            return i != i2 ? 4 : 2;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.a = 0;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        this.a = i | this.a;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        int i = this.a;
        if ((i & 7) != 0 && (i & a(this.d, this.b)) == 0) {
            return false;
        }
        int i2 = this.a;
        if ((i2 & 112) != 0 && (i2 & (a(this.d, this.c) << 4)) == 0) {
            return false;
        }
        int i3 = this.a;
        if ((i3 & 1792) != 0 && (i3 & (a(this.e, this.b) << 8)) == 0) {
            return false;
        }
        int i4 = this.a;
        if ((i4 & 28672) == 0 || (i4 & (a(this.e, this.c) << 12)) != 0) {
            return true;
        }
        return false;
    }
}
