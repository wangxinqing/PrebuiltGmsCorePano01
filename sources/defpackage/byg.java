package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: byg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class byg implements byo {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final byp d;
    public final clg e;
    public final Map f;
    public final amxb g = amzg.q();
    private final cla h;

    public byg(Context context, byf byf, but but) {
        cla cla = new cla();
        this.h = cla;
        cla.a(byf, but);
        this.d = new byp(context, this, but);
        this.e = new clg();
        this.f = new IdentityHashMap();
    }

    public final bwc a(String str) {
        return (bwc) this.a.get(str);
    }

    public final bzm b(String str) {
        new Object[1][0] = this.a.keySet();
        bwc bwc = (bwc) this.a.get(str);
        if (bwc != null) {
            return bwc.b(str);
        }
        return null;
    }

    public final Set c(String str) {
        if (this.g.d(str)) {
            return new HashSet(this.g.c((Object) str));
        }
        return null;
    }

    public final bzm d(String str) {
        bwc bwc = (bwc) this.a.get(str);
        if (bwc == null) {
            return null;
        }
        bzm a2 = bwc.a(str);
        if (a2 != null) {
            b(a2);
            c(a2);
            e(str);
            if (bwc.e()) {
                this.c.remove(bwc.a);
            }
        }
        this.d.a(str);
        return a2;
    }

    public final void e(String str) {
        this.a.remove(str);
        Set<ParcelableGeofence> b2 = this.g.e(str);
        if (b2 != null) {
            for (ParcelableGeofence parcelableGeofence : b2) {
                this.b.remove(parcelableGeofence.a);
            }
        }
    }

    public final Collection a() {
        return this.c.values();
    }

    public final List a(ContextManagerClientInfo contextManagerClientInfo) {
        new Object[1][0] = this.a.keySet();
        ArrayList arrayList = null;
        for (String b2 : this.a.keySet()) {
            bzm b3 = b(b2);
            if (b3 != null && TextUtils.equals(contextManagerClientInfo.b, b3.f) && TextUtils.equals(contextManagerClientInfo.a, b3.g) && TextUtils.equals(contextManagerClientInfo.d, b3.h)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(b3);
            }
        }
        return arrayList;
    }

    public final Set b() {
        return this.f.keySet();
    }

    public final void c() {
        this.d.a();
    }

    public final void b(bzm bzm) {
        clg clg = bzm.i;
        for (int i = 0; i < clg.size(); i++) {
            a((Set) clg.valueAt(i));
        }
    }

    public final void c(bzm bzm) {
        this.f.remove(bzm.b);
        bzm.a(bzm, 3);
    }

    public final void a(bzk bzk) {
        bzm bzm = (bzm) this.f.get(bzk);
        if (bzm == null) {
            ((anih) ((anih) bxk.a.c()).a("byg", "a", 356, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceMapping] Did not find registration record for fence");
        } else {
            bzm.a((List) null);
        }
    }

    public final void a(bzm bzm) {
        clg clg = bzm.i;
        if (clg != null) {
            for (int i = 0; i < clg.size(); i++) {
                for (cas cas : (Set) clg.valueAt(i)) {
                    this.e.a(cas.b().bA, cas);
                }
            }
        }
    }

    public final void a(Collection collection) {
        this.h.a((cky) new bye(collection));
    }

    public final void a(Set set) {
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                cas cas = (cas) it.next();
                this.e.b(cas.b().bA, cas);
            }
        }
    }
}
