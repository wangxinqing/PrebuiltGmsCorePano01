package defpackage;

import android.location.Location;
import android.os.Bundle;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.location.WifiScan;
import com.google.android.gms.location.places.NearbyAlertFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;

/* renamed from: akig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akig {
    public static final Random a = new Random();

    public static int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 2) {
            return i != 4 ? 0 : 5;
        }
        return 3;
    }

    public static int b(String str) {
        return akrw.a(str) ? 3 : 2;
    }

    public static aoei c(int i, PlacesParams placesParams) {
        return a(i, placesParams.b, 0, placesParams.f, placesParams.e, placesParams.g);
    }

    public static anui a(int i, int i2, int i3, PlacesParams placesParams, int i4) {
        aoei c = c(16, placesParams);
        aucd aucd = (aucd) c.c(5);
        aucd.a((aucj) c);
        aucd o = aodn.q.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aodn aodn = (aodn) o.b;
        int i5 = aodn.a | 4;
        aodn.a = i5;
        aodn.d = i3;
        aodn.b = i - 1;
        int i6 = i5 | 1;
        aodn.a = i6;
        if (i2 != 0) {
            aodn.c = i2 - 1;
            i6 |= 2;
            aodn.a = i6;
        }
        aodn.e = 0;
        int i7 = i6 | 8;
        aodn.a = i7;
        aodn.f = 0;
        int i8 = i7 | 16;
        aodn.a = i8;
        aodn.p = i4 - 1;
        aodn.a = i8 | 16384;
        aodn aodn2 = (aodn) o.i();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoei aoei = (aoei) aucd.b;
        aoei aoei2 = aoei.w;
        aodn2.getClass();
        aoei.v = aodn2;
        aoei.a |= 8388608;
        return a((aoei) aucd.i());
    }

    public static aoei b(int i, PlacesParams placesParams) {
        aoei c = c(14, placesParams);
        aucd aucd = (aucd) c.c(5);
        aucd.a((aucj) c);
        aucd o = aodw.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aodw aodw = (aodw) o.b;
        aodw.b = i - 1;
        aodw.a |= 1;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoei aoei = (aoei) aucd.b;
        aodw aodw2 = (aodw) o.i();
        aoei aoei2 = aoei.w;
        aodw2.getClass();
        aoei.s = aodw2;
        aoei.a |= 262144;
        return (aoei) aucd.i();
    }

    public static aoei b(PlacesParams placesParams, boolean z) {
        return a(placesParams, !z ? 5 : 4);
    }

    public static anui a(aoei aoei) {
        aucd o = anui.p.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        anui anui = (anui) o.b;
        anui.b = 1;
        int i = 1 | anui.a;
        anui.a = i;
        aoei.getClass();
        anui.c = aoei;
        anui.a = i | 2;
        return (anui) o.i();
    }

    public static aoct a(int i, String str) {
        aucd o = aoct.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoct aoct = (aoct) o.b;
        aoct.c = i - 1;
        aoct.a |= 2;
        if (str != null) {
            aoct aoct2 = (aoct) o.b;
            str.getClass();
            aoct2.a |= 1;
            aoct2.b = str;
        }
        return (aoct) o.i();
    }

    public static aodr a(Collection collection, boolean z) {
        aodq aodq = (aodq) aodr.d.o();
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                aodq.a(akic.a(((Integer) it.next()).intValue()));
            }
        }
        if (aodq.c) {
            aodq.c();
            aodq.c = false;
        }
        aodr aodr = (aodr) aodq.b;
        aodr.a |= 8;
        aodr.c = z;
        return (aodr) aodq.i();
    }

    public static aoei a(int i, int i2, PlacesParams placesParams) {
        aoei c = c(1, placesParams);
        aucd aucd = (aucd) c.c(5);
        aucd.a((aucj) c);
        aofe a2 = a(5, placesParams.c, Locale.getDefault().toString());
        aucd aucd2 = (aucd) a2.c(5);
        aucd2.a((aucj) a2);
        aucd o = aoem.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoem aoem = (aoem) o.b;
        int i3 = aoem.a | 2;
        aoem.a = i3;
        aoem.c = i;
        aoem.b = i2 - 1;
        aoem.a = i3 | 1;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aofe aofe = (aofe) aucd2.b;
        aoem aoem2 = (aoem) o.i();
        aofe aofe2 = aofe.s;
        aoem2.getClass();
        aofe.h = aoem2;
        aofe.a |= 128;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoei aoei = (aoei) aucd.b;
        aofe aofe3 = (aofe) aucd2.i();
        aoei aoei2 = aoei.w;
        aofe3.getClass();
        aoei.i = aofe3;
        aoei.a |= 64;
        return (aoei) aucd.i();
    }

    public static aoei a(int i, PlacesParams placesParams) {
        aoei c = c(1, placesParams);
        aucd aucd = (aucd) c.c(5);
        aucd.a((aucj) c);
        aofe a2 = a(13, placesParams.c, Locale.getDefault().toString());
        aucd aucd2 = (aucd) a2.c(5);
        aucd2.a((aucj) a2);
        aucd o = aoex.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoex aoex = (aoex) o.b;
        aoex.a = 1 | aoex.a;
        aoex.b = i;
        aoex aoex2 = (aoex) o.i();
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aofe aofe = (aofe) aucd2.b;
        aofe aofe2 = aofe.s;
        aoex2.getClass();
        aofe.p = aoex2;
        aofe.a |= 65536;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoei aoei = (aoei) aucd.b;
        aofe aofe3 = (aofe) aucd2.i();
        aoei aoei2 = aoei.w;
        aofe3.getClass();
        aoei.i = aofe3;
        aoei.a |= 64;
        return (aoei) aucd.i();
    }

    public static aoei a(int i, String str, int i2, int i3, String str2, int i4) {
        aucd o = aoei.w.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoei aoei = (aoei) o.b;
        aoei.c = i;
        aoei.a |= 2;
        aucd o2 = anyc.j.o();
        if (str != null) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            anyc anyc = (anyc) o2.b;
            str.getClass();
            anyc.a |= 1;
            anyc.b = str;
        }
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        anyc anyc2 = (anyc) o2.b;
        int i5 = anyc2.a | 2;
        anyc2.a = i5;
        anyc2.c = i2;
        int i6 = i5 | 4;
        anyc2.a = i6;
        anyc2.d = i3;
        if (str2 != null) {
            str2.getClass();
            i6 |= 8;
            anyc2.a = i6;
            anyc2.e = str2;
        }
        anyc2.a = i6 | 16;
        anyc2.f = i4;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoei aoei2 = (aoei) o.b;
        anyc anyc3 = (anyc) o2.i();
        anyc3.getClass();
        aoei2.d = anyc3;
        aoei2.a |= 4;
        return (aoei) o.i();
    }

    public static aoei a(NearbyAlertRequest nearbyAlertRequest, PlacesParams placesParams, boolean z) {
        aodf aodf;
        aoei c = c(7, placesParams);
        aucd aucd = (aucd) c.c(5);
        aucd.a((aucj) c);
        aucd o = aoew.i.o();
        int i = 2;
        if (nearbyAlertRequest != null) {
            NearbyAlertFilter nearbyAlertFilter = nearbyAlertRequest.c;
            aucd o2 = aodf.f.o();
            int i2 = 1;
            if (nearbyAlertFilter == null) {
                aodf = (aodf) o2.i();
            } else {
                String str = nearbyAlertFilter.c;
                if (str != null) {
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aodf aodf2 = (aodf) o2.b;
                    str.getClass();
                    aodf2.a |= 1;
                    aodf2.c = str;
                }
                boolean z2 = nearbyAlertFilter.d;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aodf aodf3 = (aodf) o2.b;
                aodf3.a |= 2;
                aodf3.d = z2;
                if (!nearbyAlertFilter.e.isEmpty()) {
                    int size = nearbyAlertFilter.e.size();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aodf aodf4 = (aodf) o2.b;
                    aodf4.a |= 4;
                    aodf4.e = size;
                }
                if (!nearbyAlertFilter.f.isEmpty()) {
                    Set set = nearbyAlertFilter.f;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aodf aodf5 = (aodf) o2.b;
                    if (!aodf5.b.a()) {
                        aodf5.b = aucj.a(aodf5.b);
                    }
                    auab.a((Iterable) set, (List) aodf5.b);
                }
                aodf = (aodf) o2.i();
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoew aoew = (aoew) o.b;
            aodf.getClass();
            aoew.b = aodf;
            aoew.a |= 1;
            int a2 = a(nearbyAlertRequest.e);
            if (a2 != 0) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aoew aoew2 = (aoew) o.b;
                aoew2.c = a2 - 1;
                aoew2.a |= 4;
            }
            int i3 = nearbyAlertRequest.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoew aoew3 = (aoew) o.b;
            int i4 = aoew3.a | 64;
            aoew3.a = i4;
            aoew3.g = i3;
            boolean z3 = nearbyAlertRequest.d;
            int i5 = i4 | 8;
            aoew3.a = i5;
            aoew3.d = z3;
            int i6 = nearbyAlertRequest.b;
            int i7 = i5 | 16;
            aoew3.a = i7;
            aoew3.e = (long) i6;
            int i8 = nearbyAlertRequest.f;
            if (i8 != -1) {
                if (i8 != 100) {
                    i2 = i8 != 110 ? 2 : 112;
                } else {
                    i2 = 102;
                }
            }
            aoew3.f = i2 - 2;
            aoew3.a = i7 | 32;
        }
        if (!z) {
            i = 3;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoew aoew4 = (aoew) o.b;
        aoew4.h = i - 1;
        aoew4.a |= 128;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoei aoei = (aoei) aucd.b;
        aoew aoew5 = (aoew) o.i();
        aoei aoei2 = aoei.w;
        aoew5.getClass();
        aoei.n = aoew5;
        aoei.a |= 2048;
        return (aoei) aucd.i();
    }

    public static aoei a(PlaceFilter placeFilter, PlacesParams placesParams) {
        aoei c = c(1, placesParams);
        aucd aucd = (aucd) c.c(5);
        aucd.a((aucj) c);
        aofe a2 = a(3, placesParams.c, Locale.getDefault().toString());
        aucd aucd2 = (aucd) a2.c(5);
        aucd2.a((aucj) a2);
        aodr a3 = a((Collection) placeFilter.e, placeFilter.b);
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aofe aofe = (aofe) aucd2.b;
        aofe aofe2 = aofe.s;
        a3.getClass();
        aofe.e = a3;
        aofe.a |= 8;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoei aoei = (aoei) aucd.b;
        aofe aofe3 = (aofe) aucd2.i();
        aoei aoei2 = aoei.w;
        aofe3.getClass();
        aoei.i = aofe3;
        aoei.a |= 64;
        return (aoei) aucd.i();
    }

    public static aoei a(PlacesParams placesParams, int i) {
        aoei c = c(17, placesParams);
        aucd aucd = (aucd) c.c(5);
        aucd.a((aucj) c);
        aucd o = aofu.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aofu aofu = (aofu) o.b;
        aofu.b = i - 1;
        aofu.a |= 1;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoei aoei = (aoei) aucd.b;
        aofu aofu2 = (aofu) o.i();
        aoei aoei2 = aoei.w;
        aofu2.getClass();
        aoei.u = aofu2;
        aoei.a |= 1048576;
        return (aoei) aucd.i();
    }

    public static aoei a(PlacesParams placesParams, List list) {
        aoei c = c(1, placesParams);
        aucd aucd = (aucd) c.c(5);
        aucd.a((aucj) c);
        aofe a2 = a(7, placesParams.c, Locale.getDefault().toString());
        aucd aucd2 = (aucd) a2.c(5);
        aucd2.a((aucj) a2);
        aoek aoek = (aoek) aoel.b.o();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if ("Home".equals(str)) {
                aoek.a(aocr.HOME);
            } else if ("Work".equals(str)) {
                aoek.a(aocr.WORK);
            } else {
                aoek.a(aocr.NICKNAME);
            }
        }
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aofe aofe = (aofe) aucd2.b;
        aoel aoel = (aoel) aoek.i();
        aofe aofe2 = aofe.s;
        aoel.getClass();
        aofe.j = aoel;
        aofe.a |= 512;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoei aoei = (aoei) aucd.b;
        aofe aofe3 = (aofe) aucd2.i();
        aoei aoei2 = aoei.w;
        aofe3.getClass();
        aoei.i = aofe3;
        aoei.a |= 64;
        return (aoei) aucd.i();
    }

    public static aoei a(PlacesParams placesParams, boolean z) {
        return a(placesParams, !z ? 3 : 2);
    }

    public static aoei a(Integer num, Long l, PlacesParams placesParams, boolean z) {
        aoei c = c(9, placesParams);
        int i = 5;
        aucd aucd = (aucd) c.c(5);
        aucd.a((aucj) c);
        aucd o = aofb.e.o();
        int i2 = 3;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 100) {
                i = 2;
            } else if (intValue == 102) {
                i = 3;
            } else if (intValue == 104) {
                i = 4;
            } else if (intValue != 105) {
                i = 1;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            aofb aofb = (aofb) o.b;
            aofb.b = i - 1;
            aofb.a |= 1;
        }
        if (l != null) {
            long longValue = l.longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aofb aofb2 = (aofb) o.b;
            aofb2.a |= 2;
            aofb2.c = longValue;
        }
        if (z) {
            i2 = 2;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aofb aofb3 = (aofb) o.b;
        aofb3.d = i2 - 1;
        aofb3.a |= 4;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoei aoei = (aoei) aucd.b;
        aofb aofb4 = (aofb) o.i();
        aoei aoei2 = aoei.w;
        aofb4.getClass();
        aoei.p = aofb4;
        aoei.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
        return (aoei) aucd.i();
    }

    public static aoei a(List list, PlacesParams placesParams) {
        aoei c = c(1, placesParams);
        aucd aucd = (aucd) c.c(5);
        aucd.a((aucj) c);
        aofe a2 = a(12, placesParams.c, Locale.getDefault().toString());
        aucd aucd2 = (aucd) a2.c(5);
        aucd2.a((aucj) a2);
        aucd o = aofg.b.o();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aofg aofg = (aofg) o.b;
                str.getClass();
                if (!aofg.a.a()) {
                    aofg.a = aucj.a(aofg.a);
                }
                aofg.a.add(str);
            }
        }
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aofe aofe = (aofe) aucd2.b;
        aofg aofg2 = (aofg) o.i();
        aofe aofe2 = aofe.s;
        aofg2.getClass();
        aofe.o = aofg2;
        aofe.a |= 32768;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoei aoei = (aoei) aucd.b;
        aofe aofe3 = (aofe) aucd2.i();
        aoei aoei2 = aoei.w;
        aofe3.getClass();
        aoei.i = aofe3;
        aoei.a |= 64;
        return (aoei) aucd.i();
    }

    public static aofe a(int i, String str, String str2) {
        aucd o = aofe.s.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aofe aofe = (aofe) o.b;
        aofe.b = i - 1;
        aofe.a |= 1;
        if (str != null) {
            aofe aofe2 = (aofe) o.b;
            str.getClass();
            aofe2.a |= 2;
            aofe2.c = str;
        }
        if (str != null && !str.equals(str2)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aofe aofe3 = (aofe) o.b;
            str2.getClass();
            aofe3.a |= 4;
            aofe3.d = str2;
        }
        return (aofe) o.i();
    }

    public static String a(String str) {
        return !str.matches("_.+_") ? "realchain" : str;
    }

    public static void a(aucd aucd, Location location, WifiScan wifiScan) {
        aucd o = anze.d.o();
        int latitude = (int) (location.getLatitude() * 1.0E7d);
        if (o.c) {
            o.c();
            o.c = false;
        }
        anze anze = (anze) o.b;
        anze.a |= 1;
        anze.b = latitude;
        int longitude = (int) (location.getLongitude() * 1.0E7d);
        if (o.c) {
            o.c();
            o.c = false;
        }
        anze anze2 = (anze) o.b;
        anze2.a |= 2;
        anze2.c = longitude;
        anze anze3 = (anze) o.i();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoei aoei = (aoei) aucd.b;
        aoei aoei2 = aoei.w;
        anze3.getClass();
        aoei.e = anze3;
        aoei.a |= 8;
        if (location.hasAccuracy()) {
            float accuracy = location.getAccuracy();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aoei aoei3 = (aoei) aucd.b;
            aoei3.a |= 32;
            aoei3.g = accuracy;
        }
        Bundle extras = location.getExtras();
        if (extras != null && extras.containsKey("locationType")) {
            int i = extras.getInt("locationType");
            int i2 = 3;
            if (i == 1) {
                i2 = 2;
            } else if (i == 2) {
                i2 = 4;
            } else if (i != 3) {
                i2 = 1;
            }
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aoei aoei4 = (aoei) aucd.b;
            aoei4.f = i2 - 1;
            aoei4.a |= 16;
        }
        if (wifiScan != null) {
            aofx[] aofxArr = new aofx[wifiScan.a()];
            for (int i3 = 0; i3 < wifiScan.a(); i3++) {
                aucd o2 = aofx.d.o();
                long a2 = wifiScan.a(i3);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aofx aofx = (aofx) o2.b;
                aofx.a |= 1;
                aofx.b = a2;
                byte b = wifiScan.b(i3);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aofx aofx2 = (aofx) o2.b;
                aofx2.a |= 2;
                aofx2.c = b;
                aofxArr[i3] = (aofx) o2.i();
            }
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ((aoei) aucd.b).h = aucj.s();
            List asList = Arrays.asList(aofxArr);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aoei aoei5 = (aoei) aucd.b;
            if (!aoei5.h.a()) {
                aoei5.h = aucj.a(aoei5.h);
            }
            auab.a((Iterable) asList, (List) aoei5.h);
        }
    }
}
