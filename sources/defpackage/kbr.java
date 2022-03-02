package defpackage;

import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.model.File;
import com.google.android.gms.drive.internal.model.ParentReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: kbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kbr extends kbm {
    final Set g;

    public kbr(kkz kkz, AppIdentity appIdentity, knc knc, Set set, Set set2, kbi kbi) {
        super(kaj.SET_RESOURCE_PARENTS, kkz, appIdentity, knc, set2, kbi);
        iva.a((Object) set);
        this.g = set;
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext, String str) {
        lnn lnn = kan.a.i;
        Set<String> d = kbm.d(this.g);
        if (d.isEmpty()) {
            Set d2 = kbm.d(this.i);
            lnv lnv = new lnv(lnn.a(clientContext, 2834));
            try {
                ClientContext clientContext2 = clientContext;
                String str2 = str;
                lnv.a(clientContext2, str2, (String) null, lnn.a(d2), (File) null, new iyu());
            } catch (VolleyError e) {
                lry.a(e);
                throw e;
            }
        } else {
            lnv lnv2 = new lnv(lnn.a(clientContext, 2835));
            try {
                File file = new File();
                ArrayList arrayList = new ArrayList();
                for (String e2 : d) {
                    ParentReference parentReference = new ParentReference();
                    parentReference.e(e2);
                    arrayList.add(parentReference);
                }
                file.a((List) arrayList);
                lnv2.a(clientContext, str, (String) null, (String) null, file, new iyu());
            } catch (VolleyError e3) {
                lry.a(e3);
                throw e3;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b(kan kan) {
        super.b(kan);
        a(kan.a.d, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass() || !a((kac) obj)) {
            return false;
        }
        return ius.a(this.g, ((kbr) obj).g);
    }

    public final JSONObject h() {
        JSONObject h = super.h();
        Set set = this.g;
        if (set != null) {
            h.put("parentIds", lrv.a(set));
        }
        return h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(n()), this.g});
    }

    /* access modifiers changed from: protected */
    public final Set p() {
        HashSet hashSet = new HashSet();
        for (DriveId driveId : this.g) {
            hashSet.add(knc.a(driveId.b));
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public final Set q() {
        HashSet hashSet = new HashSet();
        for (DriveId driveId : this.g) {
            if (!this.i.contains(driveId)) {
                hashSet.add(driveId);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public final Set r() {
        HashSet hashSet = new HashSet();
        for (DriveId driveId : this.i) {
            if (!this.g.contains(driveId)) {
                hashSet.add(driveId);
            }
        }
        return hashSet;
    }

    public final String toString() {
        return String.format(Locale.US, "SetResourceParentsAction [%s, mParentIds=%s, mOldParentIds=%s, mSpaces=%s]", new Object[]{m(), this.g, this.i, this.j});
    }

    public kbr(kkz kkz, JSONObject jSONObject) {
        super(kaj.SET_RESOURCE_PARENTS, kkz, jSONObject);
        this.g = lrv.a(jSONObject.getJSONArray("parentIds"));
        if (this.f == null) {
            b(t());
        }
    }
}
