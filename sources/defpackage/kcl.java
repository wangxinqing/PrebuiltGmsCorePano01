package defpackage;

import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.model.Permission;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: kcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kcl extends kaf {
    private final String g;
    private final int h;

    public kcl(kkz kkz, AppIdentity appIdentity, knc knc, String str, int i, kdo kdo) {
        super(kaj.UPDATE_PERMISSION, kkz, appIdentity, knc, kbi.NORMAL, kdo);
        this.g = str;
        this.h = i;
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
        int i = this.h;
        Permission permission = new Permission();
        lnn.a(i, permission);
        lnw lnw = new lnw(lnn.a(clientContext, 2841));
        iyu iyu = new iyu();
        iyu.a(lnn.a(Permission.class, lnn.a(clientContext)));
        try {
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("files/%1$s/permissions/%2$s", new Object[]{iyv.a(str), iyv.a(str2)});
            iyu.a(sb);
            iyv.a(sb, "transferOwnership", String.valueOf(true));
            ClientContext clientContext2 = clientContext;
            lrz.a(lsm, this.b, this.e, kan.b, this.g, (Permission) lnw.a.a(clientContext2, 2, sb.toString(), (Object) permission, Permission.class));
        } catch (VolleyError e2) {
            lry.a(e2);
            throw e2;
        }
    }

    /* access modifiers changed from: protected */
    public final kah b(kam kam, khq khq, kmp kmp) {
        boolean z;
        kkf kkf = kam.a;
        long j = kam.b;
        kmu a = kkf.a(kmp, this.g);
        if (a != null) {
            int i = a.f;
            int i2 = this.h;
            if (i == i2) {
                return new kbh(this.b, this.c, kbi.NONE);
            }
            a.a(i2, j);
            a.t();
            if (this.h == 3) {
                iva.a(kmp.j(), (Object) "Only owner can add new owner");
                kmu a2 = kkf.a(kmp, this.b.a);
                a2.a(2, j);
                a2.t();
                knl a3 = lrt.a(kkf, kmp);
                lrz.a(kmp, a3, j, this.g);
                a3.t();
            } else if (this.b.a.equals(this.g)) {
                iva.a(kmp.k(), (Object) "Only writer can change self role");
                int i3 = this.h;
                if (i3 == 0) {
                    z = true;
                } else {
                    z = i3 == 1;
                }
                iva.a(z, (Object) "Self role can only be updated from writer to reader/commenter");
                knl a4 = lrt.a(kkf, kmp);
                lrz.a(kmp, a4, j);
                a4.t();
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
            kcl kcl = (kcl) obj;
            return a((kac) kcl) && ius.a(this.g, kcl.g) && this.h == kcl.h;
        }
    }

    public final JSONObject h() {
        JSONObject h2 = super.h();
        lrv.a(h2, "PermissionAccountIdentifier", this.g);
        h2.put("PermissionRole", this.h);
        return h2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(n()), this.g, Integer.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.US, "UpdatePermissionAction [%s, accountIdentifier=%s, newRole=%d]", new Object[]{m(), this.g, Integer.valueOf(this.h)});
    }

    public kcl(kkz kkz, JSONObject jSONObject) {
        super(kaj.UPDATE_PERMISSION, kkz, jSONObject);
        this.g = lrv.a(jSONObject, "PermissionAccountIdentifier");
        this.h = jSONObject.getInt("PermissionRole");
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
