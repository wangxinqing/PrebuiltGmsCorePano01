package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: aifj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aifj {
    private final ajpt a;
    private final rns b;
    private WeakReference c = new WeakReference((Object) null);
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private WeakReference i = new WeakReference((Object) null);

    public aifj(Context context, rns rns, Looper looper) {
        this.a = new ajpt(context, new qvr(looper));
        this.b = rns;
    }

    public static Location a(Location location, boolean z) {
        Location location2 = new Location(location);
        location2.setExtras((Bundle) null);
        if (rev.b(location)) {
            rev.b(location2, rev.a(location));
        }
        if (rev.c(location)) {
            rev.a(location2, rev.d(location));
        }
        if (rev.g(location)) {
            rev.a(location2, rev.h(location));
        }
        if (z) {
            rev.k(location2);
        }
        return location2;
    }

    public final Location a(Location location, boolean z, boolean z2) {
        Location location2;
        Location a2;
        if (location == null) {
            return null;
        }
        if (z && z2) {
            return location;
        }
        boolean j = rev.j(location);
        if (z2 || j) {
            return a(location, j);
        }
        if (ayap.l()) {
            location2 = a(location, false);
        } else {
            location2 = rev.a(location, "noGPSLocation");
        }
        if (location2 == null) {
            return null;
        }
        ajpt ajpt = this.a;
        synchronized (ajpt.a) {
            a2 = rev.a(location2, "coarseLocation");
            if (a2 == null) {
                a2 = ajpt.a(location2);
            } else if (a2.getAccuracy() < ajpt.b) {
                a2 = ajpt.a(location2);
            }
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final List a(List list, List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        List list3;
        if (this.c.get() == list && this.d == z && this.e == z2 && this.f == z3 && this.g == z4 && this.h == z5 && (list3 = (List) this.i.get()) != null) {
            return list3;
        }
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Location location = (Location) it.next();
            Location location2 = null;
            if (location != null) {
                if (!rev.j(location) && !z3) {
                    if (z4) {
                        String provider = location.getProvider();
                        if ("fused".equals(provider)) {
                        }
                    }
                }
                location2 = a(location, z, z2);
            }
            if (location2 != null) {
                list2.add(location2);
            }
        }
        this.c = new WeakReference(list);
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = new WeakReference(list2);
        return list2;
    }
}
