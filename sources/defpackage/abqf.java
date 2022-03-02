package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;

/* renamed from: abqf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abqf extends iby {
    public final abxv a = abxv.a();

    public abqf(Context context) {
        super(context, abmp.b, (ibm) null, ibx.a);
    }

    public final abxb a(abpw abpw) {
        return new abxa(new abzb(this, abpw));
    }

    public final void g(String str) {
        this.a.b(this, str);
    }

    public final void p() {
        g("source-bootstrap-scan");
        iha b = ihb.b();
        b.a = abyo.a;
        b(b.a());
    }

    public final acwa a() {
        g("source-bootstrap-api");
        iha b = ihb.b();
        b.a = abyl.a;
        return b(b.a());
    }

    public final acwa a(ConnectionRequest connectionRequest, abpw abpw) {
        iha b = ihb.b();
        b.b = new Feature[]{abmo.d};
        b.a = new abyr(this, connectionRequest, abpw);
        acwa b2 = b(b.a());
        b2.a((acvv) new abys(this));
        return b2;
    }

    public final void a(abst abst) {
        iha b = ihb.b();
        b.a = new abyk(abst);
        b(b.a()).a((acvv) new abyn(this));
    }

    public final void a(String str) {
        acwa acwa;
        if (this.a.a(str)) {
            acwa = this.a.b(this, str);
        } else {
            acwa = acws.a((Object) null);
        }
        acwa.a((acvp) new abym(this, str));
    }
}
