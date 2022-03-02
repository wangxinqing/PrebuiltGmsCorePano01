package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.location.places.fencing.PlaceIdCollection;
import com.google.android.gms.location.places.fencing.PlacefencingFilter;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: akue  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akue implements akhu, akpc, akin {
    private static final String[] e = {"android:monitor_location"};
    public final akhm a;
    public final int b;
    public final String c;
    public final PlacefencingRequest d;
    private final akud f;
    private final HashSet g = new HashSet();
    private final HashSet h = new HashSet();
    private final HashSet i = new HashSet();
    private final HashSet j = new HashSet();

    public akue(akhm akhm, int i2, String str, akud akud, PlacefencingRequest placefencingRequest) {
        this.a = akhm;
        this.b = i2;
        this.c = str;
        this.f = akud;
        this.d = placefencingRequest;
    }

    public final akpd a(akpc akpc, UserLocationNearbyAlertRequest userLocationNearbyAlertRequest) {
        return new akpd(this.a.a, this.b, this.c, akpc, userLocationNearbyAlertRequest, userLocationNearbyAlertRequest.d);
    }

    public final PlacesParams a() {
        return ((akuf) this.f).c.b;
    }

    public final void b() {
        List<akpd> list;
        akuc akuc = this.a.c;
        if (!akuc.a.containsKey(this)) {
            PlacefencingRequest placefencingRequest = this.d;
            PlacefencingFilter placefencingFilter = placefencingRequest.b;
            int i2 = placefencingRequest.f;
            int i3 = i2 + i2;
            int i4 = (placefencingRequest.c & 12) == 0 ? 3 : 7;
            if (!placefencingFilter.c.isEmpty()) {
                list = new ArrayList<>(placefencingFilter.c.size());
                for (String str : placefencingFilter.c) {
                    if (!TextUtils.isEmpty(str)) {
                        list.add(a(this, UserLocationNearbyAlertRequest.a(i4, new UserLocationNearbyAlertFilter((List) null, (List) null, str, false), i3, false, 0, 110)));
                    } else {
                        throw new IllegalArgumentException("Filter must contain a non empty chain name to match results with.");
                    }
                }
            } else if (!placefencingFilter.a.isEmpty()) {
                list = new ArrayList<>(1);
                HashSet<String> hashSet = new HashSet<>();
                for (PlaceIdCollection placeIdCollection : placefencingFilter.a) {
                    hashSet.addAll(placeIdCollection.a);
                }
                ArrayList arrayList = new ArrayList(hashSet.size());
                for (String str2 : hashSet) {
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList.add(str2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    list.add(a(this, UserLocationNearbyAlertRequest.a(i4, new UserLocationNearbyAlertFilter(arrayList, (List) null, (String) null, false), i3, false, 0, 110)));
                } else {
                    throw new IllegalArgumentException("Filter must contain at least one place ID to match results with.");
                }
            } else if (!placefencingFilter.b.isEmpty()) {
                list = new ArrayList<>(1);
                list.add(a(this, UserLocationNearbyAlertRequest.a(i4, UserLocationNearbyAlertFilter.a(placefencingFilter.b), i3, false, 0, 110)));
            } else {
                if (Log.isLoggable("Places", 5)) {
                    alfy.c("Places", "Unknown placefencing request type. Failed to create nearby alert request");
                }
                list = Collections.emptyList();
            }
            akuc.a.put(this, list);
            for (akpd b2 : list) {
                b2.b();
            }
        }
    }

    public final void c() {
        akuc akuc = this.a.c;
        akuc.b(this);
        List<akpd> list = (List) akuc.a.remove(this);
        if (list != null) {
            for (akpd c2 : list) {
                c2.c();
            }
        }
    }

    public final int j() {
        return this.b;
    }

    public final String k() {
        return this.c;
    }

    public final String l() {
        return null;
    }

    public final String[] m() {
        return e;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("client", this.c);
        a2.a("requestId", this.d.a);
        a2.a("confidence", Integer.valueOf(this.d.e));
        if (!this.g.isEmpty()) {
            a2.a("nearbyEntered", this.g);
        }
        if (!this.h.isEmpty()) {
            a2.a("nearbyDwelled", this.h);
        }
        if (!this.i.isEmpty()) {
            a2.a("puEntered", this.i);
        }
        if (!this.j.isEmpty()) {
            a2.a("puDwelled", this.j);
        }
        return a2.toString();
    }

    public final void a(int i2, int i3, List list, Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (i3 != 0) {
            arrayList.addAll(this.g);
            this.g.clear();
            this.h.clear();
            i2 = 2;
        } else if (i2 == 1) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                String str = ((akri) list.get(i4)).a;
                if (this.g.add(str)) {
                    arrayList.add(str);
                }
            }
        } else if (i2 == 4) {
            int size2 = list.size();
            for (int i5 = 0; i5 < size2; i5++) {
                String str2 = ((akri) list.get(i5)).a;
                if (this.h.add(str2)) {
                    arrayList.add(str2);
                }
            }
        } else if (i2 == 2) {
            int size3 = list.size();
            for (int i6 = 0; i6 < size3; i6++) {
                String str3 = ((akri) list.get(i6)).a;
                if (this.g.remove(str3)) {
                    arrayList.add(str3);
                }
                if (this.h.remove(str3)) {
                    arrayList2.add(str3);
                }
            }
        }
        if (this.d.e == 0) {
            if (!arrayList2.isEmpty() && this.d.a(8)) {
                this.f.a(i3, 8, this.d.a, arrayList2);
            }
            if (!arrayList.isEmpty() && this.d.a(i2)) {
                this.f.a(i3, i2, this.d.a, arrayList);
            }
        }
        if (!arrayList.isEmpty() && this.d.e > 0 && i2 == 2) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int size4 = arrayList.size();
            for (int i7 = 0; i7 < size4; i7++) {
                String str4 = (String) arrayList.get(i7);
                if (this.i.remove(str4)) {
                    arrayList3.add(str4);
                }
                if (this.j.remove(str4)) {
                    arrayList4.add(str4);
                }
            }
            if (!arrayList4.isEmpty() && this.d.a(8)) {
                this.f.a(i3, 8, this.d.a, arrayList4);
            }
            if (!arrayList3.isEmpty() && this.d.a(2)) {
                this.f.a(i3, 2, this.d.a, arrayList3);
            }
        }
        if (!arrayList.isEmpty() && this.d.e > 0 && i2 == 4) {
            ArrayList arrayList5 = new ArrayList();
            int size5 = arrayList.size();
            for (int i8 = 0; i8 < size5; i8++) {
                String str5 = (String) arrayList.get(i8);
                if (this.i.contains(str5) && this.j.add(str5)) {
                    arrayList5.add(str5);
                }
            }
            if (!arrayList5.isEmpty() && this.d.a(4)) {
                this.f.a(i3, 4, this.d.a, arrayList5);
            }
        }
        if (this.d.e > 0 && !arrayList.isEmpty()) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 4) {
                        this.a.c.a(this);
                    }
                } else if (this.g.isEmpty() || (this.h.isEmpty() && this.d.a())) {
                    this.a.c.b(this);
                }
            } else if (!this.d.a()) {
                this.a.c.a(this);
            }
        }
    }

    public final void a(akip akip) {
        double d2;
        int i2;
        int i3 = akip.g;
        List<akhx> list = akip.c.b;
        if (i3 == 0 && list != null && !list.isEmpty()) {
            int i4 = this.d.e;
            if (i4 == 1) {
                i2 = (int) azbt.a.a().e();
                d2 = azbt.a.a().i();
            } else if (i4 == 2) {
                i2 = (int) azbt.a.a().c();
                d2 = azbt.a.a().g();
            } else if (i4 == 3) {
                i2 = (int) azbt.a.a().d();
                d2 = azbt.a.a().h();
            } else if (i4 == 4) {
                i2 = (int) azbt.a.a().f();
                d2 = azbt.a.a().j();
            } else {
                return;
            }
            HashSet<String> hashSet = new HashSet<>();
            int i5 = 0;
            for (akhx akhx : list) {
                i5++;
                if (i5 > i2) {
                    break;
                } else if (this.g.contains(akhx.b) && ((double) akhx.e) > d2) {
                    hashSet.add(akhx.b);
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!hashSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            this.i.removeAll(arrayList);
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                String str2 = (String) arrayList.get(i6);
                if (this.j.remove(str2)) {
                    arrayList4.add(str2);
                }
            }
            for (String str3 : hashSet) {
                if (this.g.contains(str3) && this.i.add(str3)) {
                    arrayList2.add(str3);
                }
                if (this.h.contains(str3) && this.j.add(str3)) {
                    arrayList3.add(str3);
                }
            }
            if (!arrayList2.isEmpty() && this.d.a(1)) {
                this.f.a(0, 1, this.d.a, arrayList2);
            }
            if (!arrayList3.isEmpty() && this.d.a(4)) {
                this.f.a(0, 4, this.d.a, arrayList3);
            }
            if (!arrayList4.isEmpty() && this.d.a(8)) {
                this.f.a(0, 8, this.d.a, arrayList4);
            }
            if (!arrayList.isEmpty() && this.d.a(2)) {
                this.f.a(0, 2, this.d.a, arrayList);
            }
        }
    }
}
