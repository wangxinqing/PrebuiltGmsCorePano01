package defpackage;

import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.model.File;
import java.util.Arrays;
import java.util.Formatter;
import org.json.JSONObject;

/* renamed from: kbp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kbp extends kae {
    private final String f;
    private final khi g;

    public kbp(kkz kkz, AppIdentity appIdentity, knc knc, String str, khi khi, kbi kbi) {
        super(kaj.SET_APP_AUTH_STATE, kkz, appIdentity, knc, kbi);
        iva.a((Object) str);
        this.f = str;
        iva.a((Object) khi);
        this.g = khi;
    }

    /* access modifiers changed from: protected */
    public final kah a(kam kam, khq khq, kmp kmp) {
        khi khi;
        kky a;
        khi khi2;
        kkf kkf = kam.a;
        String str = this.f;
        khi khi3 = this.g;
        iva.b(kmp.x(), "entry must be saved to database before setting auth state");
        kkb kkb = ((kjp) kkf).a;
        kqy b = kms.SDK_APP_ID.c.b(str);
        kkb.b();
        try {
            khi khi4 = khi.AUTHORIZED;
            int ordinal = khi3.ordinal();
            if (ordinal == 0) {
                a = ((kjp) kkf).a(kmp, b);
                if (a.isEmpty()) {
                    khi2 = khi.UNAUTHORIZED;
                } else {
                    khi2 = khi.AUTHORIZED;
                }
                a.close();
                if (khi2 == khi.UNAUTHORIZED) {
                    new kmq(kkb, kmp.h(), str).t();
                }
                khi = khi2;
            } else if (ordinal == 1) {
                if (kkb.a(kmt.a, kqz.a(b, kms.ENTRY_ID.c.e(kmp.h()))) == 0) {
                    khi = khi.UNAUTHORIZED;
                } else {
                    khi = khi.AUTHORIZED;
                }
            } else {
                throw new AssertionError();
            }
            kkb.f();
            kkb.d();
            if (khi.equals(this.g)) {
                return new kbh(khq.a, khq.c, kbi.NONE);
            }
            return new kbp(khq.a, khq.c, this.e, this.f, khi, kbi.NONE);
        } catch (Throwable th) {
            kkb.d();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            kbp kbp = (kbp) obj;
            return a((kac) kbp) && this.f.equals(kbp.f) && this.g == kbp.g;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        return this.g == khi.AUTHORIZED;
    }

    public final JSONObject h() {
        JSONObject h = super.h();
        h.put("packagingId", this.f);
        h.put("isAuthorized", this.g.equals(khi.AUTHORIZED));
        return h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(n()), this.f, this.g});
    }

    public final String toString() {
        return String.format("SetAppAuthStateAction [%s, sdkAppId=%s, authState=%s]", new Object[]{m(), this.f, this.g});
    }

    public kbp(kkz kkz, JSONObject jSONObject) {
        super(kaj.SET_APP_AUTH_STATE, kkz, jSONObject);
        this.f = jSONObject.getString("packagingId");
        this.g = jSONObject.getBoolean("isAuthorized") ? khi.AUTHORIZED : khi.UNAUTHORIZED;
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext, String str) {
        lsm lsm = kan.a;
        khi khi = khi.AUTHORIZED;
        int ordinal = this.g.ordinal();
        if (ordinal == 0) {
            lnk lnk = new lnk(118, 2, false, false);
            lnn lnn = lsm.i;
            String str2 = this.f;
            iva.a(lnn.a(clientContext));
            lnv lnv = new lnv(lnn.a(clientContext, 2828));
            try {
                iyu iyu = new iyu();
                iyu.a(lnn.a(File.class, true));
                Boolean bool = lnk.e;
                Boolean bool2 = lnk.d;
                Boolean bool3 = lnk.c;
                Boolean bool4 = (Boolean) jzq.ao.c();
                String a = lnk.a();
                Integer num = lnk.b;
                StringBuilder sb = new StringBuilder();
                new Formatter(sb).format("files/%1$s/authorize", new Object[]{iyv.a(str)});
                iyu.a(sb);
                iyv.a(sb, "appId", iyv.a(str2));
                if (bool != null) {
                    iyv.a(sb, "errorRecovery", String.valueOf(bool));
                }
                if (bool2 != null) {
                    iyv.a(sb, "mutationPrecondition", String.valueOf(bool2));
                }
                if (bool3 != null) {
                    iyv.a(sb, "openDrive", String.valueOf(bool3));
                }
                if (bool4 != null) {
                    iyv.a(sb, "propagate", String.valueOf(bool4));
                }
                if (a != null) {
                    iyv.a(sb, "reason", iyv.a(a));
                }
                if (num != null) {
                    iyv.a(sb, "syncType", String.valueOf(num));
                }
                ClientContext clientContext2 = clientContext;
                new lnl((File) lnv.a.a(clientContext2, 1, sb.toString(), (Object) null, File.class), clientContext, (String) null);
            } catch (VolleyError e) {
                lry.a(e);
                throw e;
            }
        } else if (ordinal != 1) {
            throw new AssertionError();
        } else {
            throw new UnsupportedOperationException("No server API to deauthorize files.");
        }
    }
}
