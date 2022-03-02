package defpackage;

import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.model.Permission;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: kbl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kbl extends kaf {
    private final String g;

    public kbl(kkz kkz, AppIdentity appIdentity, knc knc, String str, kdo kdo) {
        super(kaj.REMOVE_PERMISSION, kkz, appIdentity, knc, kbi.NORMAL, kdo);
        this.g = str;
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext, String str) {
        lsm lsm = kan.a;
        lnn lnn = lsm.i;
        kkf kkf = lsm.d;
        kmp e = e(kkf);
        iva.a((Object) e);
        kmu a = kkf.a(e, this.g);
        iva.a((Object) a);
        iva.a((Object) a.a);
        String str2 = a.a;
        lnw lnw = new lnw(lnn.a(clientContext, 2842));
        iyu iyu = new iyu();
        try {
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("files/%1$s/permissions/%2$s", new Object[]{iyv.a(str), iyv.a(str2)});
            iyu.a(sb);
            lnw.a.a(clientContext, 3, sb.toString(), (Object) null);
            lrz.a(lsm, this.b, this.e, kan.b, this.g, (Permission) null);
            if (this.b.a.equals(this.g)) {
                lsm.p.a();
            }
        } catch (VolleyError e2) {
            lry.a(e2);
            throw e2;
        }
    }

    /* access modifiers changed from: protected */
    public final kah b(kam kam, khq khq, kmp kmp) {
        kkf kkf = kam.a;
        long j = kam.b;
        kmu a = kkf.a(kmp, this.g);
        if (a != null) {
            a.a(-100, j);
            a.t();
            if (this.b.a.equals(this.g)) {
                iva.a(kmp.k(), (Object) "Only writer can remove self role");
                kmp.a(true, j);
            } else if (kmp.R()) {
                int i = 0;
                for (kmu b : kmp.ak()) {
                    if (!b.b()) {
                        i++;
                    }
                }
                if (i == 1) {
                    knl a2 = lrt.a(kkf, kmp);
                    kns l = a2.l();
                    if (l.a()) {
                        l.a(j);
                    } else {
                        l.a((Object) Boolean.valueOf(kmp.R()), j);
                    }
                    a2.t();
                    kmp.c(false);
                }
            }
            kmp.m(true);
            a(kmp, kam.c, new kap(kkf, khq.a, false));
            return new kch(khq.a, khq.c);
        }
        throw new kcv(kmp);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            kbl kbl = (kbl) obj;
            return a((kac) kbl) && ius.a(this.g, kbl.g);
        }
    }

    public final JSONObject h() {
        JSONObject h = super.h();
        lrv.a(h, "PermissionAccountIdentifier", this.g);
        return h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(n()), this.g});
    }

    public final String toString() {
        return String.format(Locale.US, "RemovePermissionAction [%s, accountIdentifier=%s]", new Object[]{m(), this.g});
    }

    public kbl(kkz kkz, JSONObject jSONObject) {
        super(kaj.REMOVE_PERMISSION, kkz, jSONObject);
        this.g = lrv.a(jSONObject, "PermissionAccountIdentifier");
    }

    /* access modifiers changed from: protected */
    public final void b(kan kan) {
        super.b(kan);
        kkf kkf = kan.a.d;
        kmp e = e(kkf);
        kmu a = kkf.a(e, this.g);
        if (a == null) {
            throw new kcv(e);
        } else if (a.a == null) {
            throw new kcw(e, this.g);
        }
    }
}
