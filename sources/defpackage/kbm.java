package defpackage;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: kbm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kbm extends kaf {
    private boolean g;
    public Set i;
    final Set j;

    public kbm(kaj kaj, kkz kkz, AppIdentity appIdentity, knc knc, Set set, kbi kbi) {
        super(kaj, kkz, appIdentity, knc, kbi);
        this.i = Collections.emptySet();
        this.g = false;
        iva.a((Object) set);
        this.j = set;
    }

    protected static final Set d(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((DriveId) it.next()).a);
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    public final void a(kkf kkf, Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DriveId driveId = (DriveId) it.next();
            if (driveId.a == null) {
                String a = kkf.a(this.b, driveId);
                if (a != null) {
                    hashSet.add(new DriveId(a, driveId.b, driveId.c, 1));
                } else {
                    throw new kcu(driveId);
                }
            } else {
                hashSet.add(driveId);
            }
        }
        set.clear();
        set.addAll(hashSet);
    }

    /* access modifiers changed from: protected */
    public final kah b(kam kam, khq khq, kmp kmp) {
        kkf kkf = kam.a;
        kkz kkz = khq.a;
        AppIdentity appIdentity = khq.c;
        Set aj = kmp.aj();
        c(new HashSet(kkf.a(khq, kmp)));
        this.i.addAll(kkf.b(khq, kmp));
        HashSet hashSet = new HashSet(this.i);
        boolean z = false;
        for (DriveId driveId : q()) {
            if (hashSet.add(driveId)) {
                kkf.a(kmp, driveId.b);
                z = true;
            }
        }
        knc a = kmp.a();
        for (DriveId driveId2 : r()) {
            if (hashSet.remove(driveId2)) {
                kkf.a(a, driveId2.b);
                z = true;
            }
        }
        lfq lfq = kam.c;
        kap kap = new kap(kkf, this.b, false);
        try {
            kap.d(kmp);
            Set t = t();
            t.addAll(kap.b());
            int i2 = kap.c + 1;
            if (lfq != null) {
                lfq.b(t.size(), i2);
            }
            b(t);
            if (!z) {
                return new kbh(kkz, appIdentity, kbi.NONE);
            }
            kmp.k(this.j.contains(DriveSpace.a));
            kmp.m(true);
            kbr kbr = new kbr(kkz, appIdentity, a, this.i, aj, kbi.NONE);
            kbr.c(hashSet);
            return kbr;
        } catch (lsj e) {
            throw new RuntimeException("Unexpected TraversalException!", e);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(Set set) {
        this.i = set;
        this.g = true;
    }

    public JSONObject h() {
        JSONObject h = super.h();
        if (this.g) {
            h.put("oldParentIds", lrv.a(this.i));
        }
        JSONArray jSONArray = new JSONArray();
        for (DriveSpace driveSpace : this.j) {
            jSONArray.put(driveSpace.f);
        }
        h.put("spaces", jSONArray);
        return h;
    }

    public final int n() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.n()), this.j});
    }

    /* access modifiers changed from: protected */
    public abstract Set p();

    /* access modifiers changed from: protected */
    public abstract Set q();

    /* access modifiers changed from: protected */
    public abstract Set r();

    /* access modifiers changed from: protected */
    public final Set t() {
        iva.a(this.g, (Object) "Affected entry specs can only be resolved once old parent drive Ids are known");
        Set p = p();
        for (DriveId driveId : this.i) {
            p.add(knc.a(driveId.b));
        }
        p.add(this.e);
        return p;
    }

    public kbm(kaj kaj, kkz kkz, JSONObject jSONObject) {
        super(kaj, kkz, jSONObject);
        this.i = Collections.emptySet();
        this.g = false;
        c(lrv.a(jSONObject.getJSONArray("oldParentIds")));
        this.j = new ob();
        JSONArray jSONArray = jSONObject.getJSONArray("spaces");
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            this.j.add(DriveSpace.a(jSONArray.getString(i2)));
        }
    }

    public final boolean a(kac kac) {
        return super.a(kac) && ius.a(this.j, ((kbm) kac).j);
    }
}
