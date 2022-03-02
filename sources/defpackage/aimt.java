package defpackage;

import android.location.Location;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: aimt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aimt extends aimp {
    public final aimd d = this.b.k;
    final /* synthetic */ aing e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aimt(aing aing, aiml aiml) {
        super(aing, aiml);
        this.e = aing;
    }

    public final aoaq a() {
        return aoaq.CHRE_GEOFENCING;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return this.d.f() ? -1 : 180;
    }

    /* access modifiers changed from: protected */
    public final int c() {
        return this.d.f() ? -1 : 20;
    }

    /* access modifiers changed from: protected */
    public final void c(boolean z) {
    }

    /* access modifiers changed from: protected */
    public final int d() {
        return this.d.f() ? -1 : 20;
    }

    public final String g() {
        return "ChreGeofencingState";
    }

    /* access modifiers changed from: protected */
    public final double h() {
        return 1.5d;
    }

    public final void k() {
        this.b.e();
        super.k();
    }

    public final void l() {
        if (axyu.a.a().bugFixUnloadFromChreWhenNlpTurnsOff()) {
            this.d.a((Runnable) new aims(this));
        } else {
            this.d.d();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(aijq aijq) {
        aimd aimd = this.d;
        ArrayList<aijt> arrayList = aijq.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (aimd.a) {
            Iterator it = aimd.e.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (((aijt) it.next()).a() != 0) {
                    it.remove();
                    z = true;
                }
            }
            Iterator it2 = aimd.f.iterator();
            while (it2.hasNext()) {
                if (!((aijt) it2.next()).c()) {
                    it2.remove();
                    z = true;
                }
            }
            if (arrayList != null) {
                for (aijt aijt : arrayList) {
                    if (aijt.c()) {
                        aimd.f.add(aijt);
                    }
                }
            }
            if (z && aimd.a(elapsedRealtime)) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                aimd.b(arrayList2, arrayList3);
                aimd.a(arrayList2, arrayList3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean b(aimy aimy) {
        if (aimy.c != null) {
            a(aimy);
            if (!aimy.d) {
                return true;
            }
            d(false);
            return true;
        }
        if (!aybx.b()) {
            aiko.a.a((aikn) new aikm(1143824402, aimy.b, "CHRE drops location without transition"));
        } else {
            aiko.a.a(186236805, aimy.b, 8);
        }
        boolean z = aikq.a;
        return false;
    }

    /* access modifiers changed from: protected */
    public final void d(boolean z) {
        Location location;
        aikk aikk;
        Pair pair = this.b.c.b;
        long j = 1;
        if (pair == null) {
            location = new Location("none");
            location.setLatitude(0.0d);
            location.setLongitude(0.0d);
            location.setTime(1);
            location.setElapsedRealtimeNanos(1);
        } else {
            j = ((Long) pair.first).longValue();
            location = (Location) pair.second;
        }
        List b = this.b.b();
        if (b != null) {
            aimd aimd = this.d;
            nz b2 = aimd.b();
            if (z || !b2.keySet().containsAll(b) || b2.h != b.size()) {
                int b3 = aimd.g - ((int) axza.b());
                if (!(!aybr.b() || aimd.y == null || (aikk = aimd.x) == null)) {
                    aikk.c();
                }
                aimd.y = null;
                aiko.a.a(2015944242, 4, (aijt) null);
                if (b.size() <= b3) {
                    aimd.a(b);
                } else {
                    int i = b3 - 1;
                    List a = anfk.a((Comparator) new aima(location)).a((Iterable) b, b3);
                    ArrayList arrayList = new ArrayList(a.subList(0, i));
                    boolean z2 = aikq.a;
                    aimd.f.clear();
                    aimd.e.clear();
                    for (int i2 = i; i2 < a.size(); i2++) {
                        aijt aijt = (aijt) a.get(i2);
                        if (aijt.a() == 0) {
                            aimd.e.add(aijt);
                        } else if (aijt.c()) {
                            aimd.f.add(aijt);
                        }
                    }
                    aijt aijt2 = (aijt) a.get(i);
                    aikk aikk2 = aimd.x;
                    if (aikk2 != null) {
                        aikk2.c();
                    }
                    aimd.y = arli.l.o();
                    aucd aucd = aimd.y;
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    arli arli = (arli) aucd.b;
                    arli.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    arli.j = -2;
                    aucd aucd2 = aimd.y;
                    int latitude = (int) (location.getLatitude() * 1.0E7d);
                    if (aucd2.c) {
                        aucd2.c();
                        aucd2.c = false;
                    }
                    arli arli2 = (arli) aucd2.b;
                    arli2.a |= 1;
                    arli2.b = latitude;
                    aucd aucd3 = aimd.y;
                    int longitude = (int) (location.getLongitude() * 1.0E7d);
                    if (aucd3.c) {
                        aucd3.c();
                        aucd3.c = false;
                    }
                    arli arli3 = (arli) aucd3.b;
                    arli3.a |= 2;
                    arli3.c = longitude;
                    aucd aucd4 = aimd.y;
                    int a2 = (int) aijt2.a(location);
                    if (aucd4.c) {
                        aucd4.c();
                        aucd4.c = false;
                    }
                    arli arli4 = (arli) aucd4.b;
                    arli4.a |= 4;
                    arli4.d = a2;
                    aucd aucd5 = aimd.y;
                    if (aucd5.c) {
                        aucd5.c();
                        aucd5.c = false;
                    }
                    arli arli5 = (arli) aucd5.b;
                    arli5.a |= 8;
                    arli5.e = 0;
                    aimd.a(j);
                    aikp aikp = aiko.a;
                    aucd aucd6 = aimd.y;
                    if (aybx.d()) {
                        if (aucd6 != null) {
                            aucd o = ailt.k.o();
                            aucd o2 = ails.l.o();
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            ails ails = (ails) o2.b;
                            ails.b = 1;
                            int i3 = ails.a | 1;
                            ails.a = i3;
                            arli arli6 = (arli) aucd6.b;
                            int i4 = arli6.b;
                            int i5 = i3 | 2;
                            ails.a = i5;
                            double d2 = (double) i4;
                            Double.isNaN(d2);
                            ails.c = d2 / 1.0E7d;
                            arli arli7 = arli6;
                            int i6 = arli7.c;
                            int i7 = i5 | 4;
                            arli arli8 = arli7;
                            ails.a = i7;
                            double d3 = (double) i6;
                            Double.isNaN(d3);
                            ails ails2 = ails;
                            ails2.d = d3 / 1.0E7d;
                            int i8 = arli8.d;
                            ails2.a = i7 | 8;
                            ails2.e = (float) i8;
                            String valueOf = String.valueOf(arli8.j);
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            ails ails3 = (ails) o2.b;
                            valueOf.getClass();
                            int i9 = ails3.a | 32;
                            ails3.a = i9;
                            ails3.g = valueOf;
                            arli arli9 = (arli) aucd6.b;
                            int i10 = arli9.g;
                            int i11 = i9 | 64;
                            ails3.a = i11;
                            ails3.h = i10;
                            int i12 = arli9.e;
                            int i13 = i11 | 128;
                            ails3.a = i13;
                            ails3.i = i12 * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
                            int i14 = arli9.f;
                            int i15 = i13 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            ails3.a = i15;
                            ails3.j = i14 * ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
                            int i16 = arli9.i;
                            ails3.a = i15 | 512;
                            ails3.k = i16;
                            ails ails4 = (ails) o2.i();
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            ailt ailt = (ailt) o.b;
                            ails4.getClass();
                            ailt.b = ails4;
                            int i17 = ailt.a | 1;
                            ailt.a = i17;
                            ailt.d = 0;
                            int i18 = i17 | 4;
                            ailt.a = i18;
                            ailt.e = 0;
                            int i19 = i18 | 8;
                            ailt.a = i19;
                            int i20 = i19 | 32;
                            ailt.a = i20;
                            ailt.g = false;
                            int i21 = i20 | 64;
                            ailt.a = i21;
                            ailt.h = false;
                            int i22 = ((arli) aucd6.b).j;
                            ailt.a = i21 | 128;
                            ailt.i = i22;
                            aikp.a((aiky) new aikz(-1798342140, (ailt) o.i(), 4));
                        } else {
                            aikp.a((aiky) new aikz(-1798342140, (ailt) null, 4));
                        }
                    }
                    boolean z3 = aikq.a;
                    aimd.a((List) arrayList);
                }
                aimd.e();
            } else {
                boolean z4 = aikq.a;
            }
        }
        if (!this.d.f()) {
            super.d(z);
        }
    }

    public final void a(PrintWriter printWriter) {
        super.a(printWriter);
        printWriter.print("\n    Using CHRE geofencing");
    }

    public final boolean a(aily aily) {
        boolean z = aikq.a;
        Pair a = this.b.a(aily.a, aily.b);
        aily.a((Object) Integer.valueOf(((Integer) a.first).intValue()));
        if (a.second == null || !a(ajqj.a(aily.b), aily.a, (List) a.second)) {
            return false;
        }
        d(false);
        return true;
    }

    public final boolean a(ainr ainr) {
        boolean z = aikq.a;
        Pair a = this.e.m.a(ainr);
        ainr.a((Object) Integer.valueOf(((Integer) a.first).intValue()));
        if (a.second != null) {
            boolean a2 = a(ainr.b, (List) a.second);
            aikk aikk = this.e.q;
            if (aikk != null) {
                aikk.a(ainr.b, ainr.a, ((List) a.second).size());
            }
            if (a2) {
                d(false);
                return true;
            }
        }
        return false;
    }

    public final boolean a(Message message) {
        boolean z = aikq.a;
        int i = message.what;
        if (i == 4) {
            a((aily) message.obj);
            return true;
        } else if (i == 5) {
            a((ainr) message.obj);
            return true;
        } else if (i != 154) {
            return super.a(message);
        } else {
            aing aing = this.e;
            aing.b((ains) aing.c);
            this.e.d(8);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(Pair pair) {
        this.b.e();
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str, GeofencingRequest geofencingRequest, List list) {
        boolean z;
        Iterator it;
        String str2 = str;
        GeofencingRequest geofencingRequest2 = geofencingRequest;
        List list2 = list;
        if (this.e.q != null) {
            Pair pair = this.b.c.b;
            if (pair == null || pair.second == null) {
                this.e.q.a(str2, geofencingRequest2, list2, (Location) null);
            } else {
                this.e.q.a(str2, geofencingRequest2, list2, (Location) pair.second);
            }
            this.e.q.a(str2, geofencingRequest2, this.b.a(str2, geofencingRequest2.c), this.b.d());
        }
        aimd aimd = this.d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (axza.b() != 0) {
            synchronized (aimd.a) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    aijt aijt = (aijt) it2.next();
                    aucd aucd = aimd.y;
                    if (aucd != null) {
                        ParcelableGeofence parcelableGeofence = aijt.a;
                        it = it2;
                        double d2 = parcelableGeofence.d;
                        double d3 = parcelableGeofence.e;
                        arli arli = (arli) aucd.b;
                        int i = arli.b;
                        int i2 = arli.c;
                        double d4 = (double) i;
                        Double.isNaN(d4);
                        double d5 = d4 / 1.0E7d;
                        double d6 = (double) i2;
                        Double.isNaN(d6);
                        double b = aell.b(d2, d3, d5, d6 / 1.0E7d);
                        double d7 = (double) aijt.a.f;
                        Double.isNaN(d7);
                        if (Math.abs(d7 - b) >= ((double) ((arli) aimd.y.b).d)) {
                            arrayList3.add(aijt);
                            String str3 = str;
                            it2 = it;
                        }
                    } else {
                        it = it2;
                    }
                    arrayList2.add(aijt);
                    String str4 = str;
                    it2 = it;
                }
                if (arrayList2.size() <= aimd.c.size()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        aijt aijt2 = (aijt) it3.next();
                        ArrayList arrayList5 = aimd.c;
                        int intValue = ((Integer) arrayList5.remove(arrayList5.size() - 1)).intValue();
                        arrayList4.add(new aimb(intValue, aijt2));
                        aimd.a(arrayList, arrayList4, aijt2.a(intValue));
                    }
                    if (!arrayList3.isEmpty()) {
                        aimd.e.addAll(arrayList3);
                        if (aimd.a(elapsedRealtime)) {
                            aimd.b(arrayList, arrayList4);
                        }
                    }
                    aimd.a(arrayList, arrayList4);
                    aimd.e();
                    z = false;
                } else {
                    z = true;
                }
            }
        } else {
            z = true;
        }
        if (!aybx.b()) {
            aiko.a.a((aikn) new aikl(1994801178, str, list, "Geofences added to CHRE", z));
        } else {
            aiko.a.a(121165822, str, list, 6, z);
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public final boolean a(String str, List list) {
        aimd aimd = this.d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        if (axza.b() != 0) {
            synchronized (aimd.a) {
                ArrayList arrayList = new ArrayList();
                nz b = aimd.b();
                Iterator it = list.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    aijt aijt = (aijt) it.next();
                    z2 = z2 | aimd.e.remove(aijt) | aimd.f.remove(aijt);
                    Integer num = (Integer) b.get(aijt);
                    if (num != null) {
                        arrayList.add(new aimb(num.intValue(), aijt));
                    }
                }
                aimd.a(arrayList);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (z2) {
                    if (aimd.a(elapsedRealtime)) {
                        aimd.b(arrayList2, arrayList3);
                    }
                }
                aimd.a(arrayList2, arrayList3);
                aimd.e();
            }
        } else {
            z = true;
        }
        if (!aybx.b()) {
            aiko.a.a((aikn) new aikl(875464514, str, list, "Geofences removed from CHRE", z));
        } else {
            aiko.a.a(2123333319, str, list, 7, z);
        }
        return z;
    }
}
