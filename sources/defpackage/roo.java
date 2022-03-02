package defpackage;

import android.os.Looper;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: roo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class roo {
    public Collection a;
    private final rom b;
    private final reh c;
    private final Looper d;
    private Collection e;
    private LocationResult f;
    private final iby g;

    public roo(iby iby, reh reh, Looper looper) {
        this.g = iby;
        this.b = null;
        this.c = reh;
        this.d = looper;
        this.a = Collections.emptyList();
        this.e = Collections.emptyList();
        this.f = null;
    }

    public final synchronized void a(LocationResult locationResult) {
        LocationResult locationResult2 = this.f;
        if (locationResult2 != null) {
            if (locationResult2.equals(locationResult)) {
                return;
            }
        }
        this.c.a(locationResult);
        this.f = locationResult;
    }

    public final synchronized void a(Collection collection, boolean z) {
        List list;
        List<LocationRequestInternal> list2;
        if (!z) {
            if (this.a.equals(collection)) {
                return;
            }
        }
        if (collection.isEmpty()) {
            list2 = Collections.emptyList();
            list = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(collection);
            ArrayList arrayList2 = new ArrayList(collection.size());
            list2 = arrayList;
            list = arrayList2;
        }
        for (LocationRequestInternal locationRequestInternal : list2) {
            ron ron = new ron(this);
            list.add(ron);
            rom rom = this.b;
            if (rom != null) {
                rom.a(locationRequestInternal, ron, this.d);
            } else {
                iby iby = this.g;
                ige a2 = igf.a(ron, rop.a(this.d), reh.class.getSimpleName());
                rdh rdh = new rdh(a2);
                rde rde = new rde(iby, rdh, ron, locationRequestInternal, a2);
                ign a3 = igo.a();
                a3.a = rde;
                a3.b = rdh;
                a3.c = a2;
                iby.a(a3.a());
            }
        }
        for (reh reh : this.e) {
            rom rom2 = this.b;
            if (rom2 != null) {
                rom2.a(reh);
            } else {
                this.g.a(reh);
            }
        }
        this.a = list2;
        this.e = list;
        this.f = null;
    }

    @Deprecated
    public roo(rom rom, reh reh, Looper looper) {
        this.b = rom;
        this.g = null;
        this.c = reh;
        this.d = looper;
        this.a = Collections.emptyList();
        this.e = Collections.emptyList();
        this.f = null;
    }
}
