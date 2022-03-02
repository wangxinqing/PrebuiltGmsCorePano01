package defpackage;

/* renamed from: yit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yit {
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    int f = 0;
    int g = 0;

    /* access modifiers changed from: package-private */
    public final boolean a() {
        int i = this.d;
        if (!(i == 1 && this.c == 1 && (this.e == 0 || this.g == 1))) {
            if (this.a <= 0) {
                return false;
            }
            int i2 = this.c;
            if (i2 != 1) {
                if (i2 > 1) {
                    return this.b == 0 || b() == 0;
                }
                return false;
            } else if (!(i == 0 && this.b == 0)) {
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.e - this.g;
    }
}
