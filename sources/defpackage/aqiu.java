package defpackage;

/* renamed from: aqiu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqiu extends aqjm {
    public final void a() {
        boolean z;
        if (this.d.c == 6) {
            z = true;
        } else {
            z = false;
        }
        ativ.a(z, "Expected type# %s, but got type# %s.", 6, Integer.valueOf(this.d.c));
    }

    public final void a(aqjc aqjc) {
        aqjb aqjb = this.d;
        aqjc.a = aqjb.d;
        double[] dArr = aqjc.b;
        dArr[2] = dArr[2] + aqjb.a(1);
    }
}
