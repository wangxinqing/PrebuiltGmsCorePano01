package defpackage;

import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.model.File;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: kbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kbu extends kaf {
    private static final ith g = new ith("SetSubscribedAction", "");
    private final boolean h;

    public kbu(kkz kkz, AppIdentity appIdentity, knc knc, boolean z, kbi kbi) {
        super(kaj.SET_SUBSCRIBED, kkz, appIdentity, knc, kbi);
        this.h = z;
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext, String str) {
        boolean z;
        lsm lsm = kan.a;
        kkf kkf = lsm.d;
        String str2 = d(kkf).b;
        ClientContext a = khq.a(this.b).a(lsm.b);
        lnk lnk = new lnk(905, 2, false, false);
        lnn lnn = lsm.i;
        boolean z2 = this.h;
        iva.b(lnn.a(a), "User subscription state can only be modified from internal");
        lnv lnv = new lnv(lnn.a(a, 2833));
        try {
            iyu iyu = new iyu();
            iyu.a(lnn.a(File.class, true));
            Boolean bool = lnk.e;
            Boolean bool2 = lnk.d;
            Boolean bool3 = lnk.c;
            String a2 = lnk.a();
            Integer num = lnk.b;
            File file = new File();
            file.Q = z2;
            file.a.add(69);
            lnl lnl = new lnl(lnv.a(a, str, (Boolean) null, bool, (String) null, bool2, (Boolean) null, (Boolean) null, bool3, (Boolean) null, a2, (Boolean) null, num, (Boolean) null, false, file, iyu), a, (String) null);
            kkf.d();
            try {
                kmp e = e(kkf);
                kju.a(kkf, (lnj) lnl, e, str2);
                e.i(this.h);
                if (lnl.V() == null || lnl.V().booleanValue() == this.h) {
                    z = false;
                } else {
                    z = false;
                    g.b("Server returned unexpected updated field %s, expected=%s", lnl.V(), Boolean.valueOf(this.h));
                    e.i(lnl.V().booleanValue());
                }
                e.n(z);
                kkf.f();
            } finally {
                kkf.e();
            }
        } catch (eif e2) {
            throw new AuthFailureError("Auth failure", e2);
        } catch (VolleyError e3) {
            lry.a(e3);
            throw e3;
        }
    }

    /* access modifiers changed from: protected */
    public final kah b(kam kam, khq khq, kmp kmp) {
        a(kmp, kam.c, (kap) new kbs(kam.a, khq.a));
        boolean af = kmp.af();
        boolean z = this.h;
        if (af == z) {
            return new kbh(khq.a, khq.c, kbi.NONE);
        }
        kmp.h(z);
        kmp.m(true);
        return new kbu(khq.a, khq.c, this.e, af, kbi.NONE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            kbu kbu = (kbu) obj;
            return a((kac) kbu) && this.h == kbu.h;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        return this.h;
    }

    public final JSONObject h() {
        JSONObject h2 = super.h();
        h2.put("newSubscribedValue", this.h);
        return h2;
    }

    public final int hashCode() {
        return (n() * 31) + (this.h ? 1 : 0);
    }

    public final String toString() {
        return String.format(Locale.US, "SetSubscribedAction [%s, newSubscribedValue=%s]", new Object[]{m(), Boolean.valueOf(this.h)});
    }

    public kbu(kkz kkz, JSONObject jSONObject) {
        super(kaj.SET_SUBSCRIBED, kkz, jSONObject);
        this.h = jSONObject.getBoolean("newSubscribedValue");
    }
}
