package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* renamed from: ifm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ifm implements irr {
    public final ibo a;
    public final ida b;
    public itm c = null;
    public Set d = null;
    public boolean e = false;
    final /* synthetic */ ifn f;

    public ifm(ifn ifn, ibo ibo, ida ida) {
        this.f = ifn;
        this.a = ibo;
        this.b = ida;
    }

    public final void a() {
        itm itm;
        if (this.e && (itm = this.c) != null) {
            this.a.a(itm, this.d);
        }
    }

    public final void b(ConnectionResult connectionResult) {
        ifn ifn = this.f;
        Status status = ifn.a;
        ifj ifj = (ifj) ifn.l.get(this.b);
        iva.a(ifj.h.o);
        ifj.b.j();
        ifj.a(connectionResult);
    }

    public final void a(ConnectionResult connectionResult) {
        ifn ifn = this.f;
        Status status = ifn.a;
        ifn.o.post(new ifl(this, connectionResult));
    }
}
