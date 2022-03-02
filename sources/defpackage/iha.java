package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: iha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iha {
    public igp a;
    public Feature[] b;

    public final ihb a() {
        boolean z;
        if (this.a != null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "execute parameter required");
        return new igz(this, this.b);
    }

    @Deprecated
    public final void a(jhz jhz) {
        this.a = new igy(jhz);
    }
}
