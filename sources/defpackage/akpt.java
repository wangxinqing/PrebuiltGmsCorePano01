package defpackage;

import android.os.Handler;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: akpt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akpt {
    public final Set a = new HashSet();
    public final Handler b;
    public final aksc c;
    public final aktg d;
    public final aksa e;
    public final akhw f;
    public final akhj g;
    public boolean h;
    public akpe i;
    public final akpy j;

    public akpt(aksc aksc, aktg aktg, aksa aksa, Handler handler, akhw akhw, akpy akpy, akhj akhj) {
        this.c = aksc;
        this.d = aktg;
        this.e = aksa;
        this.b = handler;
        this.f = akhw;
        this.j = akpy;
        this.g = akhj;
    }

    /* access modifiers changed from: package-private */
    public final void a(akpd akpd) {
        this.a.remove(akpd);
    }

    public final void a(akpd akpd, LatLngBounds latLngBounds) {
        if (this.a.add(akpd)) {
            new akps(this, akpd, latLngBounds, azbk.i()).b();
        }
    }

    public final void a(List list, akpd akpd, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((akri) it.next()).a);
        }
        if (!list.isEmpty()) {
            int i2 = akpd.b.e;
            if (i2 == 2) {
                akrw.a(list, 80.0f);
                this.i.a(akpd, list);
            } else if (i2 == 4) {
                akrw.a(list, 150.0f);
                this.i.a(akpd, list);
            } else if (azbk.a.a().L() && akpd.b.f == 100) {
                akrw.a(list, (float) azbk.a.a().y());
                this.i.a(akpd, list);
            } else if (z && azbk.a.a().M()) {
                this.i.a(akpd, list);
            } else if (!azda.a.a().f()) {
                aksf aksf = new aksf(this, list, akpd, list);
                this.e.a(new aksj(this.c, arrayList, PlacesParams.a), aksf);
                if (azbe.b()) {
                    this.g.a(akig.a(akig.a(arrayList.size(), PlacesParams.a)));
                }
            } else {
                aktk aktk = new aktk(this, list, akpd, list);
                this.e.a(new aktp(this.d, arrayList, PlacesParams.a), aktk);
                if (azbe.b()) {
                    this.g.a(akig.a(akig.a(arrayList.size(), PlacesParams.a)));
                }
            }
        } else {
            this.i.a(akpd, new ArrayList());
        }
    }
}
