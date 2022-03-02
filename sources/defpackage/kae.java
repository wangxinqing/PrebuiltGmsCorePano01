package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: kae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kae extends kac {
    public final knc e;

    protected kae(kaj kaj, kkz kkz, AppIdentity appIdentity, knc knc, kbi kbi) {
        this(kaj, kkz, appIdentity, knc, kbi, kdo.a);
    }

    /* access modifiers changed from: protected */
    public final kah a(kam kam, khq khq) {
        kmp a = kam.a.a(khq, this.e);
        if (a != null && !a.A()) {
            return a(kam, khq, a);
        }
        throw new kcs(this.e);
    }

    /* access modifiers changed from: protected */
    public abstract kah a(kam kam, khq khq, kmp kmp);

    /* access modifiers changed from: protected */
    public abstract void a(kan kan, ClientContext clientContext, String str);

    public final DriveId b(kkf kkf) {
        try {
            return e(kkf).g();
        } catch (kcs e2) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final kmp e(kkf kkf) {
        return kkf.a(d(kkf), this.e);
    }

    public JSONObject h() {
        JSONObject h = super.h();
        h.put("entrySqlId", this.e.a);
        return h;
    }

    /* access modifiers changed from: protected */
    public int n() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.n()), this.e});
    }

    public final knc s() {
        return this.e;
    }

    protected kae(kaj kaj, kkz kkz, AppIdentity appIdentity, knc knc, kbi kbi, kdo kdo) {
        super(kaj, kkz, appIdentity, kbi, kdo);
        iva.a((Object) knc, (Object) "Entryspec must not be null");
        this.e = knc;
    }

    /* access modifiers changed from: protected */
    public void b(kan kan) {
        kmp kmp;
        lsm lsm = kan.a;
        khq d = d(lsm.d);
        knc knc = this.e;
        kkf kkf = lsm.d;
        kmh d2 = kkf.d(knc.a);
        try {
            kmp = kkf.a(d, knc);
        } catch (kcs e2) {
            kmp = null;
        }
        if (!(d2 == null || d2.b == null || (kmp != null && kmp.N()))) {
            String str = d2.b;
            try {
                lsm.z.a(d, str, new lnk(302, 2, false, false));
                kmp = kkf.a(d, knc);
            } catch (eif e3) {
                throw new kcm(d.c);
            }
        }
        if (kmp == null || !kmp.N()) {
            throw new kcs(knc);
        } else if (kmp.i() == null) {
            throw new kct(knc);
        }
    }

    protected kae(kaj kaj, kkz kkz, JSONObject jSONObject) {
        super(kaj, kkz, jSONObject);
        this.e = knc.a(jSONObject.getLong("entrySqlId"));
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext) {
        lsm lsm = kan.a;
        kmp a = lsm.d.a(d(lsm.d), this.e);
        kan.d.a(a);
        a(kan, clientContext, a.i());
    }

    /* access modifiers changed from: protected */
    public boolean a(kac kac) {
        return super.a(kac) && this.e.equals(kac.s());
    }
}
