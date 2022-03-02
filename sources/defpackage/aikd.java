package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import android.os.SystemClock;
import android.util.Log;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: aikd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aikd implements aijs {
    final ArrayList c;
    aijt d = null;
    private final ArrayList e;
    private final ArrayList f = new ArrayList(1);
    private final aijn g = new aijn();
    private Location h = null;
    private long i = -1;
    private double j = 1.0d;
    private int k = 0;
    private final aikk l;

    public aikd(aikk aikk) {
        ArrayList arrayList = new ArrayList(100);
        this.c = arrayList;
        this.f.add(arrayList);
        this.e = new ArrayList();
        this.l = aikk;
    }

    private final void a(Iterable iterable, int i2, long j2, Location location) {
        int i3 = i2;
        ArrayList arrayList = new ArrayList(i3);
        this.e.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            for (aijt aijt : (Iterable) it.next()) {
                if (aijt.b() != Double.MAX_VALUE) {
                    arrayList.add(aijt);
                }
                if (aijt.c()) {
                    this.e.add(aijt);
                }
            }
        }
        if (arrayList.size() <= 100) {
            int size = arrayList.size();
            StringBuilder sb = new StringBuilder(148);
            sb.append("Number of Geofences with known distances (");
            sb.append(size);
            sb.append(") is not larger than mMaxGeofencesToTrack (100). setUpdateWindow() shouldn't be called.");
            Log.wtf("NearbyLocationUpdater", new IllegalStateException(sb.toString()));
        }
        if (arrayList.size() != i3) {
            int size2 = arrayList.size();
            StringBuilder sb2 = new StringBuilder(162);
            sb2.append("All Geofences should have known distances when setUpdateWindow() is called. Number of Geofences with known distances is ");
            sb2.append(size2);
            sb2.append(", expected value is ");
            sb2.append(i3);
            Log.wtf("NearbyLocationUpdater", new IllegalStateException(sb2.toString()));
        }
        this.c.clear();
        List a = anfk.a(a).a((Iterable) arrayList, 101);
        for (int i4 = 0; i4 < 100; i4++) {
            this.c.add((aijt) a.get(i4));
        }
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            aijt aijt2 = (aijt) it2.next();
            if (!this.c.contains(aijt2)) {
                this.c.add(aijt2);
            } else {
                it2.remove();
            }
        }
        aijt aijt3 = (aijt) a.get(a.size() - 1);
        aikk aikk = this.l;
        if (aikk != null) {
            aikk.b();
        }
        double b = aijt3.b();
        rdo rdo = new rdo();
        rdo.b();
        ParcelableGeofence parcelableGeofence = aijt3.a;
        String format = String.format(Locale.US, "Sentinel of '%s (%.6f, %.6f) %.0fm, %ds, %.0fm to boundary'", new Object[]{parcelableGeofence.a, Double.valueOf(parcelableGeofence.d), Double.valueOf(parcelableGeofence.e), Float.valueOf(parcelableGeofence.f), Integer.valueOf(parcelableGeofence.h / ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS), Double.valueOf(aijt3.b())});
        rdo.a = format.substring(0, Math.min(100, format.length()));
        rdo.b = 3;
        rdo.a(location.getLatitude(), location.getLongitude(), (float) b);
        aijt aijt4 = new aijt(rdo.a(), 5, (PendingIntent) null, -3, "");
        this.d = aijt4;
        aijt4.a(j2, location);
        aiko.a.a(15824420, 3, this.d);
        boolean z = aikq.a;
        this.k = 0;
        ArrayList arrayList2 = this.c;
        Iterator it3 = iterable.iterator();
        while (it3.hasNext()) {
            for (aijt aijt5 : (Iterable) it3.next()) {
                if (!arrayList2.contains(aijt5)) {
                    aijt5.k.c = Double.MAX_VALUE;
                    aijt5.f = false;
                }
            }
        }
    }

    public final List b(Iterable iterable, int i2) {
        return a(iterable, i2, a);
    }

    public final List c(Iterable iterable, int i2) {
        if (!a()) {
            return this.g.c(iterable, i2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.c;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            aijt aijt = (aijt) arrayList2.get(i3);
            if (aijt.c()) {
                arrayList.add(aijt);
            }
        }
        if (arrayList.size() != 0) {
            return anfk.a(b).a((Iterable) arrayList, i2);
        }
        return null;
    }

    private final boolean a() {
        return this.c.size() > 0;
    }

    public final aijq a(Iterable iterable, int i2, long j2, Location location, double d2, Map map) {
        aijq aijq;
        boolean z;
        ArrayList arrayList;
        aikk aikk;
        long j3 = j2;
        Location location2 = location;
        double d3 = d2;
        SystemClock.elapsedRealtime();
        if (i2 <= 100) {
            if (!(!aybr.b() || this.d == null || (aikk = this.l) == null)) {
                aikk.b();
            }
            this.c.clear();
            this.d = null;
            aiko.a.a(-807398311, 3, this.d);
            aijq = this.g.a(iterable, i2, j2, location, d2, map);
            this.k = 0;
        } else {
            irk.a(this.c.size() == 0 || this.c.size() >= 100);
            irk.a((this.c.size() == 0) == (this.d == null));
            Iterator it = iterable.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                for (aijt aijt : (Iterable) it.next()) {
                    if (aijt.b() == Double.MAX_VALUE && aijt.f) {
                        i3++;
                    }
                }
            }
            boolean a = a();
            aijt aijt2 = this.d;
            if (aijt2 != null) {
                ParcelableGeofence parcelableGeofence = aijt2.a;
                z = aell.b(parcelableGeofence.d, parcelableGeofence.e, location.getLatitude(), location.getLongitude()) < ((double) parcelableGeofence.f);
            } else {
                z = false;
            }
            int i4 = this.k;
            boolean z2 = aikq.a;
            if (i3 != 0) {
                Iterable iterable2 = iterable;
            } else if (!a || !z || i4 >= 5) {
                Iterable iterable3 = iterable;
            } else {
                aijq = this.g.a(this.f, this.c.size(), j2, location, d2, map);
                this.d.a(j3, location2);
                List a2 = a(iterable, d3, 1);
                if (a2 != null && a2.size() == 1 && a2.get(0) == this.d) {
                    this.k++;
                    boolean z3 = aikq.a;
                } else {
                    this.k = 0;
                }
                if (!(aijq == null || (arrayList = aijq.c) == null || arrayList.size() <= 0)) {
                    Iterator it2 = this.c.iterator();
                    while (it2.hasNext()) {
                        aijt aijt3 = (aijt) it2.next();
                        if (!aijt3.c() && this.e.contains(aijt3)) {
                            it2.remove();
                            this.e.remove(aijt3);
                            boolean z4 = aikq.a;
                        }
                    }
                }
            }
            aijq = this.g.a(iterable, i2, j2, location, d2, map);
            a(iterable, i2, j2, location);
        }
        boolean z5 = aikq.a;
        this.h = location2;
        this.i = j3;
        this.j = d3;
        return aijq;
    }

    public final List a(Iterable iterable) {
        return this.g.a(iterable);
    }

    public final List a(Iterable iterable, double d2, int i2) {
        return a(iterable, i2, (Comparator) new aijr(d2));
    }

    /* access modifiers changed from: package-private */
    public final List a(Iterable iterable, int i2, Comparator comparator) {
        if (!a()) {
            return this.g.a(iterable, i2, comparator);
        }
        ArrayList arrayList = new ArrayList(this.c.size() + 1);
        arrayList.addAll(this.c);
        arrayList.add(this.d);
        return anfk.a(comparator).a((Iterable) arrayList, i2);
    }

    public final void a(PrintWriter printWriter) {
        printWriter.println("Location updater: NearbyGeofenceLocationUpdater.");
        if (this.c.size() == 0) {
            printWriter.println("    Monitoring all now.");
        } else {
            printWriter.println("    Monitoring:");
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String valueOf = String.valueOf((aijt) arrayList.get(i2));
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4);
                sb.append("    ");
                sb.append(valueOf);
                printWriter.println(sb.toString());
            }
        }
        String valueOf2 = String.valueOf(this.d);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 23);
        sb2.append("    Sentinel geofence: ");
        sb2.append(valueOf2);
        printWriter.println(sb2.toString());
    }

    public final void a(Iterable iterable, int i2) {
        Location location;
        this.g.a();
        if (i2 > 100 && (location = this.h) != null) {
            this.g.a(iterable, i2, this.i, location, this.j, (Map) null);
            a(iterable, i2, this.i, this.h);
            return;
        }
        this.c.clear();
        this.d = null;
        this.k = 0;
    }
}
