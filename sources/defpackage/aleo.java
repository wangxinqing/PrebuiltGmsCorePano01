package defpackage;

import android.location.Location;
import android.util.Log;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* renamed from: aleo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aleo implements alfq {
    public final aleu a;
    public final icc b;
    public final icc c;
    public final LatLngBounds d;
    public alen e;
    public alek f;
    public alel g;
    public alem h;
    public icf i;
    public LatLngBounds j;
    public LatLngBounds k;
    public List l;
    public boolean m;
    public boolean n = true;
    public final rei o = new alef(this);
    public final rjl p;
    private final ales q;
    private boolean r = true;
    private boolean s = false;
    private boolean t = false;

    public aleo(aleu aleu, aldi aldi, ales ales, LatLngBounds latLngBounds, rjl rjl, boolean z) {
        this.a = aleu;
        this.b = aldi.a;
        this.c = aldi.c;
        this.q = ales;
        this.d = latLngBounds;
        this.p = rjl;
        this.n = z;
    }

    public static float a(LatLng latLng, LatLng latLng2) {
        Location location = new Location("");
        location.setLatitude(latLng.a);
        location.setLongitude(latLng.b);
        Location location2 = new Location("");
        location2.setLatitude(latLng2.a);
        location2.setLongitude(latLng2.b);
        return location.distanceTo(location2);
    }

    public final LatLng b() {
        Location a2 = rfw.a(this.c);
        if (a2 != null) {
            return new LatLng(a2.getLatitude(), a2.getLongitude());
        }
        return null;
    }

    public final void c() {
        this.e.a(false);
    }

    public final void a() {
        alel alel;
        if (this.c.i() && (alel = this.g) != null) {
            icc icc = this.c;
            icc.b((idf) new rfq(icc, alel.b(), this.o));
        } else if (this.c.j()) {
            this.c.a((ica) new aleh(this));
        }
    }

    public final void b(alfg alfg) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (alfg == alfg.COLLAPSED) {
            z = true;
        } else {
            z = false;
        }
        this.r = z;
        if (alfg == alfg.FULLY_EXPANDED) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.t = z2;
        if (alfg == alfg.FULLY_EXPANDED || alfg == alfg.EXPANDED) {
            z3 = true;
        }
        this.s = z3;
        this.e.a(this.r);
        this.f.b(this.t);
        this.f.a(this.s);
    }

    public final void a(alek alek) {
        float f2;
        this.f = alek;
        if (alek != null) {
            if (!this.s) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            alek.a(f2);
            this.f.a(this.s);
            this.f.b(this.t);
            List list = this.l;
            if (list != null) {
                ((aldu) this.f).b.a(list);
            }
        }
    }

    public final void a(alen alen) {
        this.e = alen;
        if (alen != null) {
            alen.a(this.r);
        }
    }

    public final void a(alfg alfg) {
        if (alfg == alfg.COLLAPSED) {
            this.e.a(true);
        }
    }

    public final void a(alfg alfg, float f2) {
        if (alfg == alfg.EXPANDED || alfg == alfg.FULLY_EXPANDED) {
            this.f.a(1.0f);
        } else if (alfg == alfg.COLLAPSED) {
            this.f.a(f2);
        }
    }

    public final void a(rhq rhq) {
        int indexOf = this.l.indexOf(rhq);
        if (indexOf == -1) {
            Log.wtf("Places", "Selected place did not come from most recent results");
        }
        ales ales = this.q;
        ales.a();
        aucd aucd = ales.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aodu aodu = (aodu) aucd.b;
        aodu aodu2 = aodu.f;
        aodu.c = 2;
        aodu.a |= 64;
        aucd aucd2 = ales.a;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aodu aodu3 = (aodu) aucd2.b;
        aodu3.e = 0;
        aodu3.a |= 512;
        aucd aucd3 = ales.a;
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        aodu aodu4 = (aodu) aucd3.b;
        aodu4.a |= 128;
        aodu4.d = indexOf;
        this.a.a(rhq);
    }
}
