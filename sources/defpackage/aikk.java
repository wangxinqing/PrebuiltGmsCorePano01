package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: aikk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aikk {
    public final aikh a;
    public final long b;
    public aoaq c = aoaq.INVALID_STATE;
    public long d;
    public boolean e = false;
    public long f;
    public int g = 0;
    public int h = 0;
    public final nz i = new nz();
    public final nz j = new nz();
    public final aucd k;
    public final aucd l;
    public final aucd m;
    public final aucd n = aoak.h.o();
    public final aucd o = aoan.d.o();
    private final Random p;
    private long q;
    private final aikj r;
    private boolean s = false;

    public aikk(Context context, aucd aucd, aucd aucd2, aucd aucd3, aikj aikj) {
        aikh aikh = new aikh(context);
        Random random = new Random();
        this.a = aikh;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.b = elapsedRealtime;
        this.k = aucd;
        this.l = aucd2;
        this.m = aucd3;
        this.p = random;
        this.r = aikj;
        this.q = elapsedRealtime;
        f();
    }

    public static final String a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    private final void f() {
        boolean z;
        if (this.p.nextDouble() < aybu.a.a().geofencerEventsSamplingRate()) {
            z = true;
        } else {
            z = false;
        }
        this.s = z;
        aucd aucd = this.n;
        aucd.b = (aucj) aucd.b.c(4);
        aucd aucd2 = this.n;
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        aoak aoak = (aoak) aucd2.b;
        aoak aoak2 = aoak.h;
        int i2 = aoak.a | 1;
        aoak.a = i2;
        aoak.b = 0;
        int i3 = i2 | 2;
        aoak.a = i3;
        aoak.c = 0;
        int i4 = i3 | 4;
        aoak.a = i4;
        aoak.d = 0;
        int i5 = i4 | 8;
        aoak.a = i5;
        aoak.e = 0;
        aoak.a = i5 | 16;
        aoak.f = 0;
        this.i.clear();
        aucd aucd3 = this.o;
        aucd3.b = (aucj) aucd3.b.c(4);
        aucd aucd4 = this.o;
        if (aucd4.c) {
            aucd4.c();
            aucd4.c = false;
        }
        aoan aoan = (aoan) aucd4.b;
        aoan aoan2 = aoan.d;
        aoan.a |= 1;
        aoan.c = 0;
        this.j.clear();
        long j2 = this.q;
        this.d = j2;
        this.f = j2;
        this.g = 0;
        this.h = 0;
    }

    public final void b() {
        a();
        aucd aucd = this.n;
        int i2 = ((aoak) aucd.b).d + 1;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoak aoak = (aoak) aucd.b;
        aoak aoak2 = aoak.h;
        aoak.a |= 4;
        aoak.d = i2;
    }

    public final void c() {
        a();
        aucd aucd = this.n;
        int i2 = ((aoak) aucd.b).e + 1;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoak aoak = (aoak) aucd.b;
        aoak aoak2 = aoak.h;
        aoak.a |= 8;
        aoak.e = i2;
    }

    public final boolean d() {
        a();
        this.g++;
        if (!this.s || ((long) this.h) >= aybu.a.a().geofencerMaximumEventsPerPeriod() || this.p.nextDouble() >= aybu.a.a().geofencerEventsPerDeviceSamplingRate()) {
            return false;
        }
        this.h++;
        return true;
    }

    public final aucd e() {
        aucd o2 = aoar.m.o();
        aucd aucd = this.m;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aoar aoar = (aoar) o2.b;
        aoau aoau = (aoau) aucd.i();
        aoau.getClass();
        aoar.e = aoau;
        aoar.a |= 8;
        aucd aucd2 = this.k;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aoar aoar2 = (aoar) o2.b;
        aoal aoal = (aoal) aucd2.i();
        aoal.getClass();
        aoar2.c = aoal;
        aoar2.a |= 2;
        aucd aucd3 = this.l;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aoar aoar3 = (aoar) o2.b;
        aoal aoal2 = (aoal) aucd3.i();
        aoal2.getClass();
        aoar3.d = aoal2;
        aoar3.a |= 4;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aoar aoar4 = (aoar) o2.b;
        aoar4.a |= 1;
        aoar4.b = elapsedRealtime;
        return o2;
    }

    public static final void a(aiki aiki, int i2, int i3) {
        oq a2 = oq.a(Integer.valueOf(i2), Integer.valueOf(i3));
        Integer num = (Integer) aiki.a.get(a2);
        if (num == null) {
            aiki.a.put(a2, 1);
        } else {
            aiki.a.put(a2, Integer.valueOf(num.intValue() + 1));
        }
    }

    public static final void a(PrintWriter printWriter, String str, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(str.length() + 38);
        sb.append("    ");
        sb.append(str);
        sb.append(": supported(");
        sb.append(z);
        sb.append("), enabled(");
        sb.append(z2);
        sb.append(")");
        printWriter.println(sb.toString());
    }

    private final void a(boolean z, long j2) {
        if (!z) {
            aucd aucd = this.o;
            long j3 = (((aoan) aucd.b).c - this.f) + j2;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aoan aoan = (aoan) aucd.b;
            aoan aoan2 = aoan.d;
            aoan.a |= 1;
            aoan.c = j3;
            return;
        }
        this.f = j2;
    }

    public final aiki a(String str) {
        aiki aiki = (aiki) this.i.get(str);
        if (aiki != null) {
            return aiki;
        }
        aiki aiki2 = new aiki(str);
        this.i.put(str, aiki2);
        return aiki2;
    }

    public final aiki a(String str, String str2, int i2) {
        aiki a2 = a(a(str, str2));
        aucd aucd = a2.b;
        if (((aoaj) aucd.b).i < i2) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aoaj aoaj = (aoaj) aucd.b;
            aoaj aoaj2 = aoaj.j;
            aoaj.a |= 64;
            aoaj.i = i2;
        }
        return a2;
    }

    public final void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long geofencerStatsCollectionPeriodMillis = aybu.a.a().geofencerStatsCollectionPeriodMillis();
        long j2 = this.q;
        if (elapsedRealtime - j2 > geofencerStatsCollectionPeriodMillis) {
            a(this.c, j2 + geofencerStatsCollectionPeriodMillis);
            if (this.e) {
                a(false, this.q + geofencerStatsCollectionPeriodMillis);
            }
            if (this.p.nextDouble() < aybu.a.a().geofencerStatsSamplingRate()) {
                aucd e2 = e();
                aucd o2 = aoao.d.o();
                for (aiki aiki : this.i.values()) {
                    for (Map.Entry entry : aiki.a.entrySet()) {
                        aucd o3 = aoai.e.o();
                        int intValue = ((Integer) ((oq) entry.getKey()).a).intValue();
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        aoai aoai = (aoai) o3.b;
                        aoai.a |= 1;
                        aoai.b = intValue;
                        int intValue2 = ((Integer) ((oq) entry.getKey()).b).intValue();
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        aoai aoai2 = (aoai) o3.b;
                        aoai2.a |= 2;
                        aoai2.c = intValue2;
                        int intValue3 = ((Integer) entry.getValue()).intValue();
                        if (o3.c) {
                            o3.c();
                            o3.c = false;
                        }
                        aoai aoai3 = (aoai) o3.b;
                        aoai3.a |= 4;
                        aoai3.d = intValue3;
                        aoai aoai4 = (aoai) o3.i();
                        aucd aucd = aiki.b;
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        aoaj aoaj = (aoaj) aucd.b;
                        aoaj aoaj2 = aoaj.j;
                        aoai4.getClass();
                        if (!aoaj.h.a()) {
                            aoaj.h = aucj.a(aoaj.h);
                        }
                        aoaj.h.add(aoai4);
                    }
                    aucd aucd2 = this.n;
                    aucd aucd3 = aiki.b;
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    aoak aoak = (aoak) aucd2.b;
                    aoaj aoaj3 = (aoaj) aucd3.i();
                    aoak aoak2 = aoak.h;
                    aoaj3.getClass();
                    if (!aoak.g.a()) {
                        aoak.g = aucj.a(aoak.g);
                    }
                    aoak.g.add(aoaj3);
                }
                aoak aoak3 = (aoak) this.n.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aoao aoao = (aoao) o2.b;
                aoak3.getClass();
                aoao.c = aoak3;
                aoao.a |= 2;
                for (Map.Entry entry2 : this.j.entrySet()) {
                    aucd o4 = aoam.d.o();
                    aoaq aoaq = (aoaq) entry2.getKey();
                    if (o4.c) {
                        o4.c();
                        o4.c = false;
                    }
                    aoam aoam = (aoam) o4.b;
                    aoam.b = aoaq.m;
                    aoam.a |= 1;
                    long longValue = ((Long) entry2.getValue()).longValue();
                    if (o4.c) {
                        o4.c();
                        o4.c = false;
                    }
                    aoam aoam2 = (aoam) o4.b;
                    aoam2.a |= 2;
                    aoam2.c = longValue;
                    aoam aoam3 = (aoam) o4.i();
                    aucd aucd4 = this.o;
                    if (aucd4.c) {
                        aucd4.c();
                        aucd4.c = false;
                    }
                    aoan aoan = (aoan) aucd4.b;
                    aoan aoan2 = aoan.d;
                    aoam3.getClass();
                    if (!aoan.b.a()) {
                        aoan.b = aucj.a(aoan.b);
                    }
                    aoan.b.add(aoam3);
                }
                aoan aoan3 = (aoan) this.o.i();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aoao aoao2 = (aoao) o2.b;
                aoan3.getClass();
                aoao2.b = aoan3;
                aoao2.a |= 1;
                aoao aoao3 = (aoao) o2.i();
                if (e2.c) {
                    e2.c();
                    e2.c = false;
                }
                aoar aoar = (aoar) e2.b;
                aoar aoar2 = aoar.m;
                aoao3.getClass();
                aoar.f = aoao3;
                aoar.a |= 16;
                this.a.a((aoar) e2.i());
            }
            while (true) {
                long j3 = this.q;
                if (elapsedRealtime - j3 <= geofencerStatsCollectionPeriodMillis) {
                    ((aing) this.r).m.j();
                    f();
                    this.q = SystemClock.elapsedRealtime();
                    return;
                }
                this.q = j3 + geofencerStatsCollectionPeriodMillis;
            }
        }
    }

    public final void a(int i2) {
        a();
        aucd aucd = this.n;
        if (((aoak) aucd.b).f < i2) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aoak aoak = (aoak) aucd.b;
            aoak aoak2 = aoak.h;
            aoak.a |= 16;
            aoak.f = i2;
        }
    }

    public final void a(aoaq aoaq, int i2, int i3) {
        if (d()) {
            aucd e2 = e();
            aucd o2 = aoax.e.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aoax aoax = (aoax) o2.b;
            aoax.b = aoaq.m;
            int i4 = aoax.a | 1;
            aoax.a = i4;
            int i5 = i4 | 2;
            aoax.a = i5;
            aoax.c = ((long) i2) * 1000;
            aoax.a = i5 | 4;
            aoax.d = ((long) i3) * 1000;
            aoax aoax2 = (aoax) o2.i();
            if (e2.c) {
                e2.c();
                e2.c = false;
            }
            aoar aoar = (aoar) e2.b;
            aoar aoar2 = aoar.m;
            aoax2.getClass();
            aoar.i = aoax2;
            aoar.a |= 128;
            this.a.a((aoar) e2.i());
        }
    }

    public final void a(aoaq aoaq, long j2) {
        if (!aoaq.equals(aoaq.INVALID_STATE)) {
            Long l2 = (Long) this.j.get(aoaq);
            this.j.put(aoaq, Long.valueOf(((l2 != null ? l2.longValue() : 0) - this.d) + j2));
        }
    }

    public final void a(String str, int i2, int i3) {
        if (d()) {
            aucd e2 = e();
            aucd o2 = aoaw.e.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aoaw aoaw = (aoaw) o2.b;
            str.getClass();
            int i4 = 4;
            int i5 = aoaw.a | 4;
            aoaw.a = i5;
            aoaw.d = str;
            if (i2 == 1) {
                i4 = 2;
            } else if (i2 != 2) {
                i4 = 3;
            }
            aoaw.b = i4 - 1;
            int i6 = 1 | i5;
            aoaw.a = i6;
            aoaw.a = i6 | 2;
            aoaw.c = i3;
            if (e2.c) {
                e2.c();
                e2.c = false;
            }
            aoar aoar = (aoar) e2.b;
            aoaw aoaw2 = (aoaw) o2.i();
            aoar aoar2 = aoar.m;
            aoaw2.getClass();
            aoar.h = aoaw2;
            aoar.a |= 64;
            this.a.a((aoar) e2.i());
        }
    }

    public final void a(String str, GeofencingRequest geofencingRequest, int i2, int i3) {
        a();
        aiki a2 = a(str, geofencingRequest.c, i2);
        aucd aucd = a2.b;
        int i4 = ((aoaj) aucd.b).c + 1;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoaj aoaj = (aoaj) aucd.b;
        aoaj aoaj2 = aoaj.j;
        aoaj.a |= 2;
        aoaj.c = i4;
        List list = geofencingRequest.a;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            a(a2, ((ParcelableGeofence) list.get(i5)).g, geofencingRequest.b);
        }
        a(i3);
    }

    public final void a(String str, GeofencingRequest geofencingRequest, List list, Location location) {
        int i2;
        List list2;
        int i3;
        GeofencingRequest geofencingRequest2 = geofencingRequest;
        if (d()) {
            aucd e2 = e();
            aucd o2 = aoag.e.o();
            nz nzVar = new nz();
            List list3 = geofencingRequest2.a;
            int size = list3.size();
            int i4 = 0;
            while (i4 < size) {
                ParcelableGeofence parcelableGeofence = (ParcelableGeofence) list3.get(i4);
                aucd o3 = aoaf.k.o();
                if (location != null) {
                    i3 = i4;
                    list2 = list3;
                    i2 = size;
                    float[] fArr = new float[1];
                    Location.distanceBetween(location.getLatitude(), location.getLongitude(), parcelableGeofence.d, parcelableGeofence.e, fArr);
                    float f2 = fArr[0];
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    aoaf aoaf = (aoaf) o3.b;
                    aoaf.a |= 1;
                    aoaf.b = f2;
                } else {
                    list2 = list3;
                    i2 = size;
                    i3 = i4;
                }
                long j2 = parcelableGeofence.b;
                float f3 = parcelableGeofence.f;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aoaf aoaf2 = (aoaf) o3.b;
                int i5 = aoaf2.a | 2;
                aoaf2.a = i5;
                aoaf2.c = f3;
                int i6 = parcelableGeofence.g;
                int i7 = i5 | 8;
                aoaf2.a = i7;
                aoaf2.e = i6;
                int i8 = parcelableGeofence.h;
                int i9 = i7 | 16;
                aoaf2.a = i9;
                aoaf2.f = (long) i8;
                int i10 = parcelableGeofence.i;
                aoaf2.a = i9 | 32;
                aoaf2.g = (long) i10;
                if (j2 > 0) {
                    j2 -= SystemClock.elapsedRealtime();
                }
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aoaf aoaf3 = (aoaf) o3.b;
                aoaf3.a |= 128;
                aoaf3.i = j2;
                nzVar.put(parcelableGeofence.a, o3);
                i4 = i3 + 1;
                list3 = list2;
                size = i2;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ParcelableGeofence parcelableGeofence2 = ((aijt) it.next()).a;
                aucd aucd = (aucd) nzVar.get(parcelableGeofence2.a);
                if (aucd != null) {
                    float f4 = parcelableGeofence2.f;
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    aoaf aoaf4 = (aoaf) aucd.b;
                    aoaf aoaf5 = aoaf.k;
                    int i11 = aoaf4.a | 4;
                    aoaf4.a = i11;
                    aoaf4.d = f4;
                    int i12 = parcelableGeofence2.h;
                    int i13 = i11 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    aoaf4.a = i13;
                    aoaf4.j = (long) i12;
                    int i14 = parcelableGeofence2.i;
                    aoaf4.a = i13 | 64;
                    aoaf4.h = (long) i14;
                }
            }
            String a2 = a(str, geofencingRequest2.c);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aoag aoag = (aoag) o2.b;
            a2.getClass();
            int i15 = aoag.a | 1;
            aoag.a = i15;
            aoag.b = a2;
            int i16 = geofencingRequest2.b;
            aoag.a = i15 | 2;
            aoag.c = i16;
            for (aucd aucd2 : nzVar.values()) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aoag aoag2 = (aoag) o2.b;
                aoaf aoaf6 = (aoaf) aucd2.i();
                aoaf6.getClass();
                if (!aoag2.d.a()) {
                    aoag2.d = aucj.a(aoag2.d);
                }
                aoag2.d.add(aoaf6);
            }
            if (e2.c) {
                e2.c();
                e2.c = false;
            }
            aoar aoar = (aoar) e2.b;
            aoag aoag3 = (aoag) o2.i();
            aoar aoar2 = aoar.m;
            aoag3.getClass();
            aoar.g = aoag3;
            aoar.a |= 32;
            this.a.a((aoar) e2.i());
            return;
        }
    }

    public final void a(boolean z) {
        a();
        if (this.e != z) {
            a(z, SystemClock.elapsedRealtime());
            this.e = z;
        }
    }
}
