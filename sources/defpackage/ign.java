package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: ign  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ign {
    public igp a;
    public igp b;
    public ige c;
    public Feature[] d;
    private final Runnable e = igk.a;

    public final igo a() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.a != null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Must set register function");
        if (this.b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        iva.b(z2, "Must set unregister function");
        if (this.c == null) {
            z3 = false;
        }
        iva.b(z3, "Must set holder");
        igc igc = this.c.b;
        iva.a((Object) igc, (Object) "Key must not be null");
        return new igo(new igl(this, this.c, this.d), new igm(this, igc), this.e);
    }
}
