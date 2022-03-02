package defpackage;

import android.location.Location;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: akpd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akpd implements jio, akhu {
    public final boolean a;
    public final UserLocationNearbyAlertRequest b;
    public final akpc c;
    private final akpb d;
    private final int e;
    private final String f;
    private final String[] g = {"android:monitor_location"};

    public akpd(akpb akpb, int i, String str, akpc akpc, UserLocationNearbyAlertRequest userLocationNearbyAlertRequest, boolean z) {
        this.d = akpb;
        this.e = i;
        this.f = str;
        this.c = akpc;
        this.b = userLocationNearbyAlertRequest;
        this.a = z;
    }

    public final PlacesParams a() {
        return this.c.a();
    }

    public final void b() {
        akpb akpb = this.d;
        if (!akpb.e.containsKey(this)) {
            akpb.e.put(this, new ArrayList());
        }
        if (akpb.e.size() == 1) {
            akrv akrv = akpb.a;
            akrq akrq = akrv.a;
            akrq.e = akrv;
            if (!akrq.f) {
                akrq.a.a((akyl) akrq);
                akrq.a.a(0, (long) ((int) azbk.a.a().I()), akrq.c);
                akrq.f = true;
            }
            akrv.a((Location) null);
        } else {
            LatLngBounds latLngBounds = akpb.a.e;
            if (latLngBounds != null) {
                akpb.b.a(this, latLngBounds);
            }
        }
        if (akpb.f < d()) {
            akpb.f = d();
            akpb.a.a(d());
        }
    }

    public final void c() {
        akpb akpb = this.d;
        if (akpb.e.containsKey(this)) {
            akpb.e.remove(this);
            int i = -1;
            for (akpd d2 : akpb.e.keySet()) {
                i = Math.max(i, d2.d());
            }
            if (i != akpb.f) {
                akpb.f = i;
                akpb.a.a(i);
            }
            akpa akpa = akpb.c;
            int i2 = this.b.f;
            HashSet hashSet = new HashSet();
            if (akpb.e.containsKey(this)) {
                for (akpu akpu : (List) akpb.e.get(this)) {
                    hashSet.add(akpu.a);
                }
            }
            UserLocationNearbyAlertRequest userLocationNearbyAlertRequest = this.b;
            int i3 = userLocationNearbyAlertRequest.a;
            int i4 = userLocationNearbyAlertRequest.e;
            int i5 = userLocationNearbyAlertRequest.b;
            UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = userLocationNearbyAlertRequest.c;
            akpa.a(i2, new akrf(hashSet, i3, i4, i5, userLocationNearbyAlertFilter.c, userLocationNearbyAlertFilter.d));
            if (akpb.e.size() == 0) {
                akpb.a.a();
            }
            akpb.b.a(this);
        }
    }

    public final int d() {
        return this.b.f;
    }

    public final int j() {
        return this.e;
    }

    public final String k() {
        return this.f;
    }

    public final String l() {
        return null;
    }

    public final String[] m() {
        return this.g;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("nearbyAlertRequest", this.b);
        return a2.toString();
    }
}
