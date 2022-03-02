package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import android.util.Log;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.RemoveGeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: akrq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akrq implements akyl {
    public final akyn a;
    public final Set b = new HashSet();
    public final ClientIdentity c;
    public akrm d;
    public akrn e;
    public boolean f;
    private final akhj g;
    private final Set h = new HashSet();
    private final ArrayDeque i = new ArrayDeque();
    private akrj j;
    private akrj k;
    private akrr l;

    public akrq(akyn akyn, akhj akhj, int i2) {
        this.a = akyn;
        this.g = akhj;
        this.c = new ClientIdentity(i2, "com.google.android.gms");
        this.f = false;
    }

    private final Set a(Set set) {
        LatLng latLng;
        HashSet hashSet;
        Location a2 = this.a.a();
        if (a2 != null) {
            latLng = new LatLng(a2.getLatitude(), a2.getLongitude());
        } else {
            latLng = null;
        }
        int C = (int) (azbk.a.a().C() - 1);
        if (set.size() <= C) {
            this.j = null;
            hashSet = new HashSet(set);
        } else {
            if (latLng == null) {
                akrj akrj = this.k;
                if (akrj == null) {
                    return this.b;
                }
                latLng = akrj.b;
            }
            ArrayList arrayList = new ArrayList(set);
            Collections.sort(arrayList, new akrl(latLng));
            int i2 = C - 1;
            HashSet hashSet2 = new HashSet(arrayList.subList(0, i2));
            akrj akrj2 = (akrj) arrayList.get(i2);
            float[] fArr = new float[1];
            double d2 = latLng.a;
            double d3 = latLng.b;
            LatLng latLng2 = akrj2.b;
            Location.distanceBetween(d2, d3, latLng2.a, latLng2.b, fArr);
            akrj akrj3 = new akrj(latLng, Math.max(fArr[0] - akrj2.c, 100.0f));
            this.j = akrj3;
            hashSet2.add(akrj3);
            hashSet = hashSet2;
        }
        akrj akrj4 = this.k;
        if (akrj4 != null) {
            hashSet.add(akrj4);
        }
        return hashSet;
    }

    private final void b() {
        this.l = null;
        if (!this.i.isEmpty()) {
            akrr akrr = (akrr) this.i.poll();
            this.l = akrr;
            d(akrr);
        }
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [java.util.List, java.util.Collection] */
    private final void d(akrr akrr) {
        akrm akrm;
        if (akrr == null) {
            return;
        }
        if (akrr.a) {
            akro akro = new akro(this, akrr);
            akyn akyn = this.a;
            PendingIntent pendingIntent = akyn.j;
            iva.a((Object) pendingIntent, (Object) "PendingIntent can not be null.");
            iva.a((Object) "places", (Object) "tag can not be null");
            iva.b(true, "tag can not be empty string");
            RemoveGeofencingRequest removeGeofencingRequest = new RemoveGeofencingRequest((List) null, pendingIntent, "places");
            icc icc = akyn.k;
            icc.a((ica) new akyh(akyn, icc, removeGeofencingRequest, akro));
            return;
        }
        Collection collection = akrr.b;
        if (!(collection == null || collection.isEmpty() || (akrm = this.d) == null)) {
            akrm.a(0, 2, new ArrayList(akrr.b));
        }
        this.h.removeAll(akrr.b);
        this.h.addAll(akrr.c);
        Set<akrj> a2 = a(this.h);
        ArrayList arrayList = new ArrayList();
        for (akrj akrj : this.b) {
            if (!a2.contains(akrj)) {
                arrayList.add(akrj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (akrj akrj2 : a2) {
            if (!this.b.contains(akrj2)) {
                arrayList2.add(akrj2);
            }
        }
        akrr.f = a2;
        akrr.g = arrayList;
        akrr.h = arrayList2;
        if (!akrr.g.isEmpty()) {
            akrp akrp = new akrp(this, akrr);
            ArrayList arrayList3 = new ArrayList(akrr.g.size());
            ? r13 = akrr.g;
            int size = r13.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList3.add(((akrj) r13.get(i2)).a);
            }
            String[] strArr = (String[]) arrayList3.toArray(new String[arrayList3.size()]);
            akyn akyn2 = this.a;
            List asList = Arrays.asList(strArr);
            iva.a((Object) asList, (Object) "geofence can't be null.");
            iva.b(!asList.isEmpty(), "Geofences must contains at least one id.");
            iva.a((Object) "places", (Object) "tag can not be null");
            iva.b(true, "tag can not be empty string");
            RemoveGeofencingRequest removeGeofencingRequest2 = new RemoveGeofencingRequest(asList, (PendingIntent) null, "places");
            icc icc2 = akyn2.k;
            int length = strArr.length;
            StringBuilder sb = new StringBuilder(28);
            sb.append("Remove ");
            sb.append(length);
            sb.append(" geofences");
            sb.toString();
            icc2.a((ica) new akyf(akyn2, icc2, removeGeofencingRequest2, akrp));
            return;
        }
        a(akrr);
    }

    public final void a(aklk aklk) {
    }

    public final void c(akrr akrr) {
        a(akrr, false);
        switch (akrr.d.i) {
            case ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS:
                this.b.clear();
                a(9102);
                b();
                return;
            case 1001:
                if (!akrr.a && ((long) akrr.e) < azbk.a.a().D()) {
                    akrr akrr2 = new akrr(true, (Collection) null, (Collection) null);
                    akrr a2 = akrr.a(Collections.emptyList(), a(this.h));
                    a2.e = akrr.e + 1;
                    this.i.addFirst(a2);
                    this.i.addFirst(akrr2);
                }
                b();
                return;
            case 1002:
                a(9102);
                b();
                return;
            default:
                b();
                return;
        }
    }

    public final void b(akrr akrr) {
        a(akrr, true);
        b();
    }

    private final void a(int i2) {
        akrm akrm = this.d;
        if (akrm != null) {
            akrm.a(i2, 0, (Collection) null);
        }
        akrn akrn = this.e;
        if (akrn != null) {
            akrn.a(i2, (Location) null, true);
        }
    }

    private final void a(int i2, List list, Location location) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ParcelableGeofence parcelableGeofence = (ParcelableGeofence) list.get(i3);
            for (akrj akrj : this.h) {
                if (akrj.a.equals(parcelableGeofence.a)) {
                    arrayList.add(akrj);
                }
            }
            akrj akrj2 = this.j;
            if (akrj2 != null && akrj2.a.equals(parcelableGeofence.a)) {
                z = true;
            }
            akrj akrj3 = this.k;
            if (akrj3 != null && akrj3.a.equals(parcelableGeofence.a)) {
                z2 = true;
            }
        }
        if (this.d == null) {
            if (Log.isLoggable("Places", 6)) {
                alfy.a("Places", "No PlaceGeofenceEventListener is registered to PlaceGeofencer.");
            }
        } else if (!arrayList.isEmpty()) {
            this.d.a(0, i2, arrayList);
        } else if ((z || z2) && Log.isLoggable("Places", 4)) {
            StringBuilder sb = new StringBuilder(106);
            sb.append("Skipping call to PlaceGeofenceEventListener. Update fence triggered: ");
            sb.append(z);
            sb.append(", Refresh fence triggered: ");
            sb.append(z2);
            alfy.b("Places", sb.toString());
        } else if (Log.isLoggable("Places", 5)) {
            alfy.c("Places", "Geofences did not trigger any PlaceGeofences.");
        }
        if (z && i2 == 2) {
            a((Collection) Collections.emptyList(), (Collection) Collections.emptyList());
        }
        if (z2 && i2 == 2) {
            akrn akrn = this.e;
            if (akrn != null) {
                akrn.a(0, location, true);
            } else if (Log.isLoggable("Places", 6)) {
                alfy.a("Places", "No RefreshPlaceGeofenceEventListener is registered to PlaceGeofencer.");
            }
        }
    }

    private final void a(akrr akrr, boolean z) {
        int i2;
        int i3;
        int size = this.b.size();
        if (z) {
            this.b.clear();
            if (!akrr.a) {
                this.b.addAll(akrr.f);
            }
        }
        if (!akrr.a) {
            i2 = akrr.b.size();
            i3 = akrr.c.size();
        } else {
            i2 = size;
            i3 = 0;
        }
        if (azbk.a.a().s()) {
            PlacesParams placesParams = PlacesParams.a;
            int size2 = this.b.size();
            int i4 = akrr.d.i;
            aoei c2 = akig.c(11, placesParams);
            aucd aucd = (aucd) c2.c(5);
            aucd.a((aucj) c2);
            aucd o = aoej.g.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoej aoej = (aoej) o.b;
            int i5 = 1;
            int i6 = aoej.a | 1;
            aoej.a = i6;
            aoej.b = size;
            int i7 = i6 | 2;
            aoej.a = i7;
            aoej.c = i3;
            int i8 = i7 | 4;
            aoej.a = i8;
            aoej.d = i2;
            int i9 = i8 | 8;
            aoej.a = i9;
            aoej.e = size2;
            if (i4 != 0) {
                switch (i4) {
                    case ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS:
                        i5 = 1001;
                        break;
                    case 1001:
                        i5 = 1002;
                        break;
                    case 1002:
                        i5 = 1003;
                        break;
                    case 1003:
                        i5 = 1004;
                        break;
                    default:
                        i5 = 0;
                        break;
                }
            }
            if (i5 != 0) {
                aoej.f = i5 - 1;
                aoej.a = i9 | 16;
            }
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aoei aoei = (aoei) aucd.b;
            aoej aoej2 = (aoej) o.i();
            aoei aoei2 = aoei.w;
            aoej2.getClass();
            aoei.r = aoej2;
            aoei.a |= 32768;
            this.g.a(akig.a((aoei) aucd.i()));
        }
    }

    public final void a() {
        if (this.k != null) {
            this.k = null;
            a((Collection) Collections.emptyList(), (Collection) Collections.emptyList());
        }
    }

    public final void a(akrj akrj) {
        iva.a((Object) akrj);
        this.k = akrj;
        a((Collection) Collections.emptyList(), (Collection) Collections.emptyList());
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [java.util.List, java.util.Collection] */
    public final void a(akrr akrr) {
        float f2;
        int i2;
        if (!akrr.h.isEmpty()) {
            akrk akrk = new akrk(this, akrr);
            ArrayList arrayList = new ArrayList(akrr.h.size());
            ? r13 = akrr.h;
            int size = r13.size();
            for (int i3 = 0; i3 < size; i3++) {
                akrj akrj = (akrj) r13.get(i3);
                rdo rdo = new rdo();
                LatLng latLng = akrj.b;
                float f3 = akrj.c;
                if (f3 <= 0.0f) {
                    f2 = (float) azbk.f();
                } else {
                    f2 = f3;
                }
                rdo.a(latLng.a, latLng.b, f2);
                rdo.a = akrj.a;
                rdo.b();
                int i4 = akrj.e;
                if (i4 > 0) {
                    rdo.e = i4;
                    i2 = 7;
                } else {
                    i2 = 3;
                }
                rdo.b = i2;
                rdo.d = (int) azbk.a.a().o();
                arrayList.add(rdo.a());
            }
            akyn akyn = this.a;
            rdv rdv = new rdv();
            rdv.a((List) arrayList);
            rdv.b(5);
            iva.a((Object) "places", (Object) "Can not set tag to null");
            iva.b(true, "Can not use empty string for tag");
            rdv.a = "places";
            icc icc = akyn.k;
            int size2 = arrayList.size();
            StringBuilder sb = new StringBuilder(25);
            sb.append("Add ");
            sb.append(size2);
            sb.append(" geofences");
            sb.toString();
            icc.a((ica) new akyd(akyn, icc, rdv, akrk));
            return;
        }
        akrr.d = new Status(0);
        b(akrr);
    }

    public final void a(Location location, akoh akoh, boolean z, aklh aklh) {
        if (location != null) {
            LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
            if (this.k != null && this.e != null && azbk.a.a().v() && Double.valueOf(rls.a(latLng, this.k.b)).doubleValue() > azbk.a.a().J()) {
                if (Log.isLoggable("Places", 4)) {
                    Log.i("Places", String.format("Using passive location updates to trigger refresh geofence. Fence was centered at: %s, Location update reported at: %s.", new Object[]{this.k.b, latLng}));
                }
                this.e.a(0, location, false);
                if (azbe.b()) {
                    this.g.a(akig.a(akig.b(4, PlacesParams.a)));
                }
            }
            if (this.j != null && azbk.a.a().w() && Double.valueOf(rls.a(latLng, this.j.b)).doubleValue() > ((double) this.j.c)) {
                if (Log.isLoggable("Places", 4)) {
                    Log.i("Places", String.format("Using passive location updates to trigger update geofence. Fence was centered at: %s, Location update reported at: %s.", new Object[]{this.j.b, latLng}));
                }
                a((Collection) Collections.emptyList(), (Collection) Collections.emptyList());
            }
        } else if (Log.isLoggable("Places", 5)) {
            Log.w("Places", "PlaceGeofencer ignoring null location from SignalManager.");
        }
    }

    public final void a(Collection collection, Collection collection2) {
        akrr a2 = akrr.a(collection, collection2);
        if (this.l == null) {
            this.l = a2;
            d(a2);
            return;
        }
        this.i.add(a2);
    }

    public final void a(rdu rdu) {
        if (rdu.a()) {
            int i2 = rdu.a;
            if (i2 == 1000) {
                List list = rdu.c;
                if (list != null) {
                    a(8, list, rdu.d);
                }
                a(9102);
            } else if (i2 == 1003) {
                List list2 = rdu.c;
                if (list2 != null) {
                    a(8, list2, rdu.d);
                }
                a(9101);
            } else if (Log.isLoggable("Places", 5)) {
                int i3 = rdu.a;
                StringBuilder sb = new StringBuilder(49);
                sb.append("Received unknown error from geofence: ");
                sb.append(i3);
                alfy.c("Places", sb.toString());
            }
        } else {
            List list3 = rdu.c;
            if (list3 != null) {
                a(rdu.b, list3, rdu.d);
            }
        }
    }
}
