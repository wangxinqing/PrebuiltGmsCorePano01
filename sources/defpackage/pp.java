package defpackage;

/* renamed from: pp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pp {
    private int a;
    private int b;

    public final int a() {
        return this.a | this.b;
    }

    public final void a(int i) {
        if (i != 1) {
            this.a = 0;
        } else {
            this.b = 0;
        }
    }

    public final void a(int i, int i2) {
        if (i2 != 1) {
            this.a = i;
        } else {
            this.b = i;
        }
    }

    public final void b(int i) {
        a(i, 0);
    }
}
