package defpackage;

/* renamed from: awbi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awbi {
    public final batd a;

    public awbi(batd batd) {
        this.a = batd;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, int i2) {
        if (i >= i2) {
            this.a.h(i2);
            int i3 = i - i2;
            while (i3 >= 128) {
                this.a.h(128 | (i3 & 127));
                i3 >>>= 7;
            }
            this.a.h(i3);
            return;
        }
        this.a.h(i);
    }

    /* access modifiers changed from: package-private */
    public final void a(batg batg) {
        a(batg.e(), 127);
        this.a.b(batg);
    }
}
