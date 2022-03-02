package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: zmo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zmo implements ica, icb, wln {
    final /* synthetic */ zmr a;

    public zmo(zmr zmr) {
        this.a = zmr;
    }

    private final void a() {
        zmr zmr = this.a;
        if (zmr.o == null) {
            ibq ibq = wlt.a;
            xcy.a(zmr.d, zmr.j, zmr.g.b()).a(this.a.z);
        } else {
            zmr.a(Status.a, this.a.o);
        }
        if (this.a.g.c() && !TextUtils.isEmpty(this.a.g.b.d)) {
            zmr zmr2 = this.a;
            zmr2.q = zmr2.g.b.d;
        }
        if (TextUtils.isEmpty(this.a.q)) {
            ibq ibq2 = wlt.a;
            zmr zmr3 = this.a;
            xco.a(zmr3.d, zmr3.j, zmr3.g.b()).a(this.a.A);
        } else {
            zmr zmr4 = this.a;
            if (zmr4.r == null) {
                ibq ibq3 = wlt.a;
                xdh.a(zmr4.d, zmr4.q, 1, 1).a(this.a.B);
            }
        }
        zmq zmq = this.a.f;
        if (zmq == null) {
            return;
        }
        if (!zmq.f().b()) {
            ibq ibq4 = wlt.a;
            zmr zmr5 = this.a;
            icc icc = zmr5.d;
            String str = zmr5.j;
            String b = zmr5.g.b();
            wkx wkx = new wkx();
            wkx.b = null;
            wkx.c = false;
            wkx.a = -1;
            xco.a(icc, str, b, wkx).a(this.a.C);
        } else if (this.a.f.f().a()) {
            this.a.f.a(Status.a, this.a.f.f());
        }
    }

    public final void a(ConnectionResult connectionResult) {
    }

    public final void b() {
        a();
    }

    public final void g(Bundle bundle) {
        ibq ibq = wlt.a;
        zmr zmr = this.a;
        xdp.a(zmr.d, this, zmr.j, zmr.g.b(), 2);
        zmr zmr2 = this.a;
        xdr.a(zmr2.d, zmr2.j, zmr2.g.b(), this.a.y);
        a();
        zmr zmr3 = this.a;
        if (zmr3.s) {
            zmr3.s = false;
            zmr zmr4 = this.a;
            xcy.a(zmr4.d, zmr4.j, zmr4.g.b(), this.a.t).a(this.a.D);
        }
        zmr zmr5 = this.a;
        if (zmr5.u) {
            zmr5.u = false;
            zmr5.b();
        }
    }

    public final void a(int i) {
        zmq zmq;
        if (!TextUtils.isEmpty(this.a.q)) {
            zmr zmr = this.a;
            if (zmr.r != null && ((zmq = zmr.f) == null || zmq.f().b())) {
                return;
            }
        }
        this.a.d.e();
    }
}
