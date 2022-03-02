package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.userlocation.UserLocationNearbyAlertFilter;
import com.google.android.gms.userlocation.UserLocationNearbyAlertRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: akrv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akrv implements akrn, akyl {
    public final akrq a;
    public akru b;
    public int c = -1;
    public akrj d;
    public LatLngBounds e;
    private final Handler f;
    private final akyn g;
    private final akhj h;
    private float i;
    private Runnable j;
    private boolean k;
    private final akoc l;

    public akrv(Handler handler, akyn akyn, akrq akrq, akoc akoc, akhj akhj) {
        this.f = handler;
        this.g = akyn;
        this.a = akrq;
        this.l = akoc;
        this.h = akhj;
    }

    private final void b() {
        if (this.d != null && this.c == 110) {
            this.a.a();
        }
        this.d = null;
        this.e = null;
    }

    public final void a() {
        this.f.removeCallbacks(this.j);
        b();
        this.k = false;
        this.a.e = null;
        this.g.b(this);
    }

    public final void a(aklk aklk) {
    }

    public final void a(rdu rdu) {
    }

    public final void a(int i2) {
        akrj akrj;
        int i3 = this.c;
        if (i2 != i3) {
            if (i3 == 100) {
                this.g.b(this);
            } else if (i3 == 110 && this.d != null) {
                this.a.a();
            }
            this.c = i2;
            if (i2 == 100) {
                this.g.a((akyl) this);
            } else if (i2 == 110 && (akrj = this.d) != null) {
                this.a.a(akrj);
            }
        }
    }

    public final void a(int i2, Location location, boolean z) {
        if (this.d == null) {
            if (Log.isLoggable("Places", 5)) {
                alfy.c("Places", "Ignoring RefreshPlaceGeofenceEvent: no refresh geofence is set.");
            }
        } else if (i2 == 0) {
            if (!azbk.a.a().z() || !z) {
                if (Log.isLoggable("Places", 4)) {
                    alfy.b("Places", "NearbyAlerts refresh bounds exited, updating bounds now.");
                }
                a(location);
                if (azbe.b()) {
                    this.h.a(akig.a(akig.b(2, PlacesParams.a)));
                }
            } else if (Log.isLoggable("Places", 5)) {
                alfy.c("Places", "Ignoring RefreshPlaceGeofenceEvent: flagged off.");
            }
        } else if (i2 == 9101) {
            this.a.a();
            a((Location) null);
        } else if (Log.isLoggable("Places", 5)) {
            StringBuilder sb = new StringBuilder(59);
            sb.append("Ignoring RefreshPlaceGeofenceEvent with status: ");
            sb.append(i2);
            alfy.c("Places", sb.toString());
        }
    }

    public final void a(long j2, Location location) {
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        String str4;
        long j3 = j2;
        if (this.e == null) {
            Location a2 = location == null ? this.g.a() : location;
            if (a2 != null) {
                LatLng latLng = new LatLng(a2.getLatitude(), a2.getLongitude());
                float q = (float) azbk.a.a().q();
                this.i = q;
                this.e = rls.a(latLng, (double) q);
                akrj akrj = new akrj(latLng, this.i);
                this.d = akrj;
                if (this.c == 110) {
                    this.a.a(akrj);
                }
                akru akru = this.b;
                if (akru != null) {
                    LatLngBounds latLngBounds = this.e;
                    akpb akpb = (akpb) akru;
                    ArrayList arrayList2 = new ArrayList(akpb.e.size());
                    ArrayList arrayList3 = new ArrayList(akpb.e.size());
                    for (akpd akpd : akpb.e.keySet()) {
                        UserLocationNearbyAlertFilter userLocationNearbyAlertFilter = akpd.b.c;
                        if (!userLocationNearbyAlertFilter.a.isEmpty()) {
                            akpb.b.a(akpd, akpb.a.e);
                        } else if (!userLocationNearbyAlertFilter.d) {
                            if (userLocationNearbyAlertFilter.b.isEmpty()) {
                                if (azbk.a.a().x()) {
                                    arrayList3.add(akpd);
                                } else {
                                    arrayList2.add(akpd);
                                }
                            } else if (!azbk.a.a().k()) {
                                akpb.b.a(akpd, akpb.a.e);
                            } else {
                                arrayList3.add(akpd);
                            }
                        } else if (!azbk.a.a().j()) {
                            akpb.b.a(akpd, akpb.a.e);
                        } else {
                            arrayList3.add(akpd);
                        }
                    }
                    String str5 = "";
                    if (!arrayList2.isEmpty()) {
                        akpt akpt = akpb.b;
                        LatLngBounds latLngBounds2 = akpb.a.e;
                        ou ouVar = new ou();
                        ArrayList arrayList4 = new ArrayList(arrayList2.size());
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            akpd akpd2 = (akpd) arrayList2.get(i2);
                            if (akpt.a.add(akpd2)) {
                                if (!TextUtils.isEmpty(akpd2.a().d)) {
                                    str4 = akpd2.a().d;
                                } else {
                                    str4 = str5;
                                }
                                if (ouVar.containsKey(str4)) {
                                    ((List) ouVar.get(str4)).add(akpd2);
                                    arrayList = arrayList2;
                                    str3 = str5;
                                } else {
                                    arrayList = arrayList2;
                                    str3 = str5;
                                    ouVar.put(str4, new ArrayList(Arrays.asList(new akpd[]{akpd2})));
                                }
                                arrayList4.add(akpd2);
                            } else {
                                arrayList = arrayList2;
                                str3 = str5;
                            }
                            i2++;
                            arrayList2 = arrayList;
                            str5 = str3;
                        }
                        str = str5;
                        if (!azbt.b()) {
                            new akpj(akpt, "", arrayList4, latLngBounds2, azbk.i()).b();
                        } else {
                            int i3 = 0;
                            while (i3 < ouVar.h) {
                                new akpj(akpt, (String) ouVar.b(i3), (List) ouVar.c(i3), latLngBounds2, azbk.i()).b();
                                i3++;
                                latLngBounds2 = latLngBounds2;
                                ouVar = ouVar;
                            }
                        }
                    } else {
                        str = str5;
                    }
                    if (!arrayList3.isEmpty()) {
                        akpt akpt2 = akpb.b;
                        LatLngBounds latLngBounds3 = akpb.a.e;
                        ou ouVar2 = new ou();
                        ArrayList arrayList5 = new ArrayList(arrayList3.size());
                        int size2 = arrayList3.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            akpd akpd3 = (akpd) arrayList3.get(i4);
                            if (akpt2.a.add(akpd3)) {
                                if (!TextUtils.isEmpty(akpd3.a().d)) {
                                    str2 = akpd3.a().d;
                                } else {
                                    str2 = str;
                                }
                                if (ouVar2.containsKey(str2)) {
                                    ((List) ouVar2.get(str2)).add(akpd3);
                                } else {
                                    ouVar2.put(str2, new ArrayList(Arrays.asList(new akpd[]{akpd3})));
                                }
                                arrayList5.add(akpd3);
                            }
                        }
                        if (!azbt.b()) {
                            new akpm(akpt2, "", arrayList5, latLngBounds3, azbk.i()).b();
                        } else {
                            for (int i5 = 0; i5 < ouVar2.h; i5++) {
                                new akpm(akpt2, (String) ouVar2.b(i5), (List) ouVar2.c(i5), latLngBounds3, azbk.i()).b();
                            }
                        }
                    }
                    if (azbk.a.a().K()) {
                        ArrayList arrayList6 = new ArrayList();
                        for (akpd akpd4 : akpb.e.keySet()) {
                            for (akpu akpu : (List) akpb.e.get(akpd4)) {
                                akri akri = akpu.a;
                                if (!latLngBounds.a(new LatLng(akri.b, akri.c))) {
                                    HashSet hashSet = new HashSet();
                                    hashSet.add(akpu.a);
                                    UserLocationNearbyAlertRequest userLocationNearbyAlertRequest = akpd4.b;
                                    int i6 = userLocationNearbyAlertRequest.e;
                                    int i7 = userLocationNearbyAlertRequest.b;
                                    UserLocationNearbyAlertFilter userLocationNearbyAlertFilter2 = userLocationNearbyAlertRequest.c;
                                    arrayList6.add(new akrf(hashSet, 2, i6, i7, userLocationNearbyAlertFilter2.c, userLocationNearbyAlertFilter2.d));
                                }
                            }
                        }
                        int size3 = arrayList6.size();
                        for (int i8 = 0; i8 < size3; i8++) {
                            akpb.a(0, (akrf) arrayList6.get(i8), (Bundle) null);
                        }
                    }
                }
                this.k = false;
                return;
            }
            akrt akrt = new akrt(this, Math.min(azbk.k() * j3, azbk.j()));
            this.j = akrt;
            this.f.postDelayed(akrt, j3);
        }
    }

    public final void a(Location location) {
        if (!this.k) {
            this.k = true;
            b();
            a(azbk.i(), location);
        }
    }

    public final void a(Location location, akoh akoh, boolean z, aklh aklh) {
        float f2;
        String str;
        String str2;
        if (azbk.a.a().u()) {
            long time = location.getTime();
            int latitude = (int) (location.getLatitude() * 1.0E7d);
            int longitude = (int) (location.getLongitude() * 1.0E7d);
            double accuracy = (double) location.getAccuracy();
            Double.isNaN(accuracy);
            int i2 = (int) (accuracy * 1000.0d);
            if (location.hasAltitude()) {
                f2 = (float) location.getAltitude();
            } else {
                f2 = Float.NaN;
            }
            Bundle extras = location.getExtras();
            if (extras == null) {
                str = "unknown";
            } else {
                int i3 = extras.getInt("locationType", 0);
                if (i3 == 1) {
                    str2 = "gps";
                } else if (i3 == 2) {
                    str2 = "cell";
                } else if (i3 != 3) {
                    str = "unknown";
                } else {
                    str2 = "wifi";
                }
                str = str2;
            }
            if (((double) this.l.a(new akln(new aklr(latitude, longitude, i2, f2, str, time, location.hasSpeed() ? location.getSpeed() : -1.0f), akoh, (aklk) null, aklh, z, false)).a) > azbk.a.a().m()) {
                return;
            }
        }
        if (this.e == null) {
            if (this.k) {
                this.k = false;
            }
            a(location);
            if (azbe.b()) {
                this.h.a(akig.a(akig.b(3, PlacesParams.a)));
            }
        } else if (this.c == 100 && Double.valueOf(rls.a(new LatLng(location.getLatitude(), location.getLongitude()), this.e.a())).doubleValue() > ((double) this.i)) {
            a(location);
            if (azbe.b()) {
                this.h.a(akig.a(akig.b(5, PlacesParams.a)));
            }
        }
    }
}
