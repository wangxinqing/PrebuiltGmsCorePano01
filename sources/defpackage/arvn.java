package defpackage;

/* renamed from: arvn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arvn {
    public final arvx a;
    public final arpv b;
    public final arvp c;
    public final arvt d;
    public int e = 0;
    public int f = 0;

    public arvn(arpv arpv, arvp arvp) {
        amrl.a(true);
        amrl.a(true);
        this.b = arpv;
        this.c = arvp;
        arvx arvx = new arvx(arvp.d, arvp.e, arvp.f);
        this.a = arvx;
        arvx.d = 3;
        int i = arvp.k;
        int i2 = i - 1;
        arvt arvt = null;
        if (i != 0) {
            if (i2 != 0 && i2 == 1) {
                arvt = new arvt();
            }
            this.d = arvt;
            return;
        }
        throw null;
    }
}
