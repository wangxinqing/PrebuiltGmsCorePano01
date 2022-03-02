package defpackage;

import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.Permission;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: kal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kal extends kaf {
    private final int g;
    private final String h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final String l;

    public kal(kkz kkz, AppIdentity appIdentity, knc knc, Permission permission, boolean z, String str, kdo kdo) {
        super(kaj.ADD_PERMISSION, kkz, appIdentity, knc, kbi.NORMAL, kdo);
        this.g = permission.b();
        this.h = permission.a();
        this.i = permission.c();
        this.j = permission.c;
        this.k = z;
        this.l = str;
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext, String str) {
        kan kan2 = kan;
        lsm lsm = kan2.a;
        lnn lnn = lsm.i;
        String str2 = this.h;
        int i2 = this.g;
        int i3 = this.i;
        boolean z = this.j;
        boolean z2 = this.k;
        String str3 = this.l;
        com.google.android.gms.drive.internal.model.Permission permission = new com.google.android.gms.drive.internal.model.Permission();
        switch (i2) {
            case PSKKeyManager.MAX_KEY_LENGTH_BYTES /*256*/:
                permission.f("user");
                permission.g(str2);
                break;
            case 257:
                permission.f("domain");
                permission.g(str2);
                break;
            case 258:
                permission.f("anyone");
                break;
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Invalid accountType value:");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
        }
        lnn.a(i3, permission);
        permission.k = z;
        permission.a.add(16);
        lnw lnw = new lnw(lnn.a(clientContext, 2840));
        iyu iyu = new iyu();
        iyu.a(lnn.a(com.google.android.gms.drive.internal.model.Permission.class, lnn.a(clientContext)));
        try {
            Boolean valueOf = Boolean.valueOf(z2);
            StringBuilder sb2 = new StringBuilder();
            new Formatter(sb2).format("files/%1$s/permissions", new Object[]{iyv.a(str)});
            iyu.a(sb2);
            if (str3 != null) {
                iyv.a(sb2, "emailMessage", iyv.a(str3));
            }
            iyv.a(sb2, "sendNotificationEmails", String.valueOf(valueOf));
            ClientContext clientContext2 = clientContext;
            lrz.a(lsm, this.b, this.e, kan2.b, this.h, (com.google.android.gms.drive.internal.model.Permission) lnw.a.a(clientContext2, 1, sb2.toString(), (Object) permission, com.google.android.gms.drive.internal.model.Permission.class));
        } catch (VolleyError e) {
            lry.a(e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public final kah b(kam kam, khq khq, kmp kmp) {
        knl knl;
        boolean z;
        kkf kkf = kam.a;
        long j2 = kam.b;
        kmu a = kkf.a(kmp, this.h);
        if (a == null) {
            kmp.a(this.h, this.g, this.i, this.j, j2);
        } else {
            int i2 = a.f;
            int i3 = this.i;
            if (i2 == i3 && a.i == this.j) {
                return new kbh(this.b, this.c, kbi.NONE);
            }
            a.a(i3, j2);
            a.a(this.j, j2);
            a.t();
        }
        if (!kmp.R()) {
            knl = lrt.a(kkf, kmp);
            kns l2 = knl.l();
            if (l2.a()) {
                l2.a(j2);
            } else {
                l2.a((Object) Boolean.valueOf(kmp.R()), j2);
            }
            kmp.c(true);
        } else {
            knl = null;
        }
        if (!kmp.aj().contains(DriveSpace.a)) {
            if (knl == null) {
                knl = lrt.a(kkf, kmp);
            }
            kns j3 = knl.j();
            if (j3.a()) {
                j3.a(j2);
            } else {
                j3.a((Object) false, j2);
            }
            kmp.k(true);
        }
        if (this.i == 3) {
            iva.a(kmp.j(), (Object) "Only owner can add new owner");
            kmu a2 = kkf.a(kmp, this.b.a);
            a2.a(2, j2);
            a2.t();
            if (knl == null) {
                knl = lrt.a(kkf, kmp);
            }
            lrz.a(kmp, knl, j2, this.h);
        } else if (this.b.a.equals(this.h)) {
            iva.a(kmp.k(), (Object) "Only writer can change self role");
            int i4 = this.i;
            if (i4 == 0) {
                z = true;
            } else {
                z = i4 == 1;
            }
            iva.a(z, (Object) "Self role can only be updated from writer to reader/commenter");
            if (knl == null) {
                knl = lrt.a(kkf, kmp);
            }
            lrz.a(kmp, knl, j2);
        }
        if (knl != null) {
            knl.t();
        }
        kmp.m(true);
        a(kmp, kam.c, new kap(kkf, khq.a, false));
        return new kch(khq.a, khq.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            kal kal = (kal) obj;
            return a((kac) kal) && this.g == kal.g && ius.a(this.h, kal.h) && this.i == kal.i && this.j == kal.j && this.k == kal.k && ius.a(this.l, kal.l);
        }
    }

    public final JSONObject h() {
        JSONObject h2 = super.h();
        h2.put("PermissionAccountType", this.g);
        lrv.a(h2, "PermissionAccountIdentifier", this.h);
        h2.put("PermissionRole", this.i);
        h2.put("PermissionIsLinkRequired", this.j);
        h2.put("PermissionSendEmails", this.k);
        lrv.a(h2, "PermissionEmailMessage", this.l);
        return h2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(n()), Integer.valueOf(this.g), this.h, Integer.valueOf(this.i), Boolean.valueOf(this.j), Boolean.valueOf(this.k), this.l});
    }

    public final String toString() {
        return String.format(Locale.US, "AddPermissionAction [%s, accountType=%d, accountIdentifier=%s, role=%d, isLinkRequired=%s, sendNotificationEmails=%s, EmailMessage=%s]", new Object[]{m(), Integer.valueOf(this.g), this.h, Integer.valueOf(this.i), Boolean.valueOf(this.j), Boolean.valueOf(this.k), this.l});
    }

    public kal(kkz kkz, JSONObject jSONObject) {
        super(kaj.ADD_PERMISSION, kkz, jSONObject);
        this.g = jSONObject.getInt("PermissionAccountType");
        this.h = lrv.a(jSONObject, "PermissionAccountIdentifier");
        this.i = jSONObject.getInt("PermissionRole");
        this.j = jSONObject.getBoolean("PermissionIsLinkRequired");
        this.k = jSONObject.getBoolean("PermissionSendEmails");
        this.l = lrv.a(jSONObject, "PermissionEmailMessage");
    }
}
