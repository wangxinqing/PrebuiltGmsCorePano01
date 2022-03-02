package defpackage;

import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.model.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: kar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kar extends kbm {
    final Set g;
    final Set h;

    public kar(kkz kkz, AppIdentity appIdentity, knc knc, Set set, Set set2, Set set3) {
        super(kaj.CHANGE_RESOURCE_PARENTS, kkz, appIdentity, knc, set3, kbi.NORMAL);
        iva.a((Object) set);
        this.g = set;
        iva.a((Object) set2);
        this.h = set2;
    }

    private static Set a(JSONObject jSONObject, String str) {
        return lrv.a(jSONObject.getJSONArray(str));
    }

    /* access modifiers changed from: protected */
    public final void b(kan kan) {
        super.b(kan);
        kkf kkf = kan.a.d;
        a(kkf, this.g);
        a(kkf, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass() && a((kac) obj)) {
            kar kar = (kar) obj;
            return ius.a(this.g, kar.g) && ius.a(this.h, kar.h);
        }
    }

    public final JSONObject h() {
        JSONObject h2 = super.h();
        Set set = this.g;
        if (set != null) {
            h2.put("parentIdsToAdd", lrv.a(set));
        }
        Set set2 = this.h;
        if (set2 != null) {
            h2.put("parentIdsToRemove", lrv.a(set2));
        }
        return h2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(n()), this.g, this.h});
    }

    /* access modifiers changed from: protected */
    public final Set p() {
        HashSet hashSet = new HashSet();
        for (DriveId driveId : this.g) {
            hashSet.add(knc.a(driveId.b));
        }
        for (DriveId driveId2 : this.h) {
            hashSet.add(knc.a(driveId2.b));
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public final Set q() {
        return this.g;
    }

    /* access modifiers changed from: protected */
    public final Set r() {
        return this.h;
    }

    public final String toString() {
        return String.format(Locale.US, "ChangeResourceParentsAction [%s, mParentIdsToAdd=%s, mParentIdsToRemove=%s, mOldParentIds=%s, mSpaces=%s]", new Object[]{m(), this.g, this.h, this.i, this.j});
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext, String str) {
        lnn lnn = kan.a.i;
        Set d = kbm.d(this.g);
        Set d2 = kbm.d(this.h);
        try {
            new lnv(lnn.a(clientContext, 2836)).a(clientContext, str, lnn.a(d), lnn.a(d2), (File) null, new iyu());
        } catch (VolleyError e) {
            lry.a(e);
            throw e;
        }
    }

    public kar(kkz kkz, JSONObject jSONObject) {
        super(kaj.CHANGE_RESOURCE_PARENTS, kkz, jSONObject);
        this.g = a(jSONObject, "parentIdsToAdd");
        this.h = a(jSONObject, "parentIdsToRemove");
    }
}
