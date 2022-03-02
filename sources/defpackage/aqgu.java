package defpackage;

/* renamed from: aqgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqgu {
    public final aqgy a;
    public final aqgv b;
    public final aqgx c;
    public final aqgt d;

    public aqgu(aqgy aqgy, aqgv aqgv, aqgx aqgx, aqgt aqgt) {
        this.a = aqgy;
        this.b = aqgv;
        this.c = aqgx;
        this.d = aqgt;
    }

    public final void a(int i) {
        aqgy aqgy = this.a;
        if (aqgy != null) {
            aqgy.b = i;
        }
        aqgv aqgv = this.b;
        if (aqgv != null) {
            aqgv.b = i;
        }
        this.c.b = i;
        this.d.b = i;
        for (aqjv aqjv : aqju.a) {
        }
    }
}
