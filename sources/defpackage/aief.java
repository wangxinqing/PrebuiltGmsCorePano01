package defpackage;

import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.location.LocationAvailability;
import java.util.Iterator;
import java.util.List;

/* renamed from: aief  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aief implements aiew {
    final /* synthetic */ aiei a;

    public aief(aiei aiei) {
        this.a = aiei;
    }

    public final void a(LocationAvailability locationAvailability) {
        LocationAvailability locationAvailability2;
        LocationAvailability locationAvailability3;
        int i;
        int i2;
        aiei aiei = this.a;
        if (aiei.g.a()) {
            long j = locationAvailability.c;
            int i3 = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
            if (j == 0 && locationAvailability.a == 1 && locationAvailability.b == 1 && ((i2 = locationAvailability.d) == 0 || i2 == 1000)) {
                locationAvailability2 = locationAvailability;
            } else {
                if (locationAvailability.a()) {
                    i3 = 0;
                }
                locationAvailability2 = LocationAvailability.a(i3, 1, 1, 0);
            }
            aiei.w = locationAvailability;
            aiei.x = locationAvailability2;
            for (aidd aidd : aiei.j.c()) {
                if (!aidd.e) {
                    locationAvailability3 = locationAvailability2;
                } else {
                    locationAvailability3 = locationAvailability;
                }
                if (aidd.b(locationAvailability3)) {
                    aidf aidf = aiei.u;
                    List list = aidd.c.c;
                    if (!locationAvailability3.a()) {
                        i = 17;
                    } else {
                        i = 16;
                    }
                    aidf.a(i, aidf.k.a((Object) list));
                }
            }
        }
    }

    public final void e(List list) {
        boolean z;
        List list2;
        aiei aiei = this.a;
        if (aiei.g.a()) {
            aiei.v.a();
            boolean b = rns.b(aiei.f);
            if (!aiei.k.a("gps") || !aiei.k.a("network")) {
                Iterator it = aiei.j.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((aidd) it.next()).c.i) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            for (aidd aidd : aiei.j.c()) {
                long b2 = aidd.c.b.b();
                if (b2 >= 0 && b2 < Long.MAX_VALUE) {
                    boolean z2 = aidd.e;
                    if (z2 && aidd.d) {
                        list2 = aiei.s.a(list, aiei.h, true, true, aidd.c.i, z, b);
                    } else if (aidd.d) {
                        list2 = aiei.s.a(list, aiei.h, false, true, aidd.c.i, z, b);
                    } else {
                        list2 = aiei.s.a(list, aiei.i, z2, false, aidd.c.i, z, b);
                    }
                    aiei.a(list2, aidd);
                }
            }
            aiei.h.clear();
            aiei.i.clear();
        }
    }
}
