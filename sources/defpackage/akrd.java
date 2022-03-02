package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.maps.model.LatLng;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: akrd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akrd extends akrh implements akyl {
    private final akyn b;
    private final Bundle c;
    private final Map d = new HashMap();

    public akrd(akrg akrg, akyn akyn) {
        super(akrg);
        this.b = akyn;
        Bundle bundle = new Bundle();
        this.c = bundle;
        bundle.putString("nearby_alert_module_name", "Distance");
    }

    private static final Pair a(akri akri) {
        return new Pair(akri.a, new LatLng(akri.b, akri.c));
    }

    public final void a(aklk aklk) {
    }

    public final void a(rdu rdu) {
    }

    public final void b() {
        this.b.b(this);
        this.d.clear();
    }

    private final void a(String str, LatLng latLng, akrc akrc, int i) {
        LatLng latLng2 = latLng;
        akrc akrc2 = akrc;
        akri akri = new akri(str, latLng2.a, latLng2.b, akrc2.g, akrc2.e);
        HashSet hashSet = new HashSet();
        hashSet.add(akri);
        this.a.a(0, new akrf(hashSet, i, akrc2.b, akrc2.f, akrc2.c, akrc2.d), this.c);
    }

    public final void b(akrf akrf) {
        Set<akri> set = akrf.a;
        HashSet hashSet = new HashSet();
        for (akri akri : set) {
            List list = (List) this.d.get(a(akri));
            if (!jir.a((Collection) list)) {
                list.remove(new akrc(akrf.b, akrf.c, akrf.e, akrf.f, akri.e, akrf.d, akri.d));
                hashSet.add(akri);
                if (list.isEmpty()) {
                    this.d.remove(a(akri));
                }
            } else {
                return;
            }
        }
        this.a.a(0, new akrf(hashSet, 2, akrf.c, akrf.d, akrf.e, akrf.f), this.c);
    }

    public final void a() {
        this.b.a((akyl) this);
    }

    public final void a(akrf akrf) {
        for (akri akri : akrf.a) {
            akrc akrc = new akrc(akrf.b, akrf.c, akrf.e, akrf.f, akri.e, akrf.d, akri.d);
            if (this.d.containsKey(a(akri))) {
                ((List) this.d.get(a(akri))).add(akrc);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(akrc);
                this.d.put(a(akri), arrayList);
            }
        }
        Location a = this.b.a();
        if (a != null) {
            a(a);
        }
    }

    public final void a(Location location) {
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        for (Pair pair : this.d.keySet()) {
            double a = rls.a(latLng, (LatLng) pair.second);
            for (akrc akrc : (List) this.d.get(pair)) {
                if (a > ((double) akrc.g)) {
                    a((String) pair.first, (LatLng) pair.second, akrc, 2);
                } else {
                    a((String) pair.first, (LatLng) pair.second, akrc, 1);
                }
            }
        }
    }

    public final void a(Location location, akoh akoh, boolean z, aklh aklh) {
        a(location);
    }

    public final void a(PrintWriter printWriter) {
        printWriter.println(String.format(Locale.US, "\n    Total %d places tracked in distance module:\n", new Object[]{Integer.valueOf(this.d.size())}));
        printWriter.println("place id --> number of tracked subscriptions:");
        for (Pair pair : this.d.keySet()) {
            String str = (String) pair.first;
            int size = ((List) this.d.get(pair)).size();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16);
            sb.append(str);
            sb.append(" --> ");
            sb.append(size);
            printWriter.println(sb.toString());
        }
    }
}
