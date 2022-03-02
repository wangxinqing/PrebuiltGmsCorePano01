package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.location.geofencer.service.BlockingChreGeofenceHardware$1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: aimd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aimd implements arne, arnb, arni {
    public static final aimc w = new aimc();
    public final ArrayList a = new ArrayList();
    public final nz b = new nz();
    public final ArrayList c = new ArrayList();
    public arlu[] d;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public int g = -1;
    public arnd h = null;
    public arnh i = null;
    public final aing j;
    public Location k = null;
    public final aijt l = new aijt(this.z, 0, (PendingIntent) null, -2, "");
    public final jbs m;
    public final jgy n;
    public final jbr o;
    public final jgw p;
    public int q;
    public int r = 0;
    public Runnable s = null;
    public final boolean t;
    public final ArrayDeque u = new ArrayDeque();
    public final ArrayDeque v = new ArrayDeque();
    public final aikk x;
    public aucd y;
    private final ParcelableGeofence z = new ParcelableGeofence("<Sentinel>", 1, 1, 0.0d, 0.0d, 1000.0f, 0, 0, 0);

    public aimd(Context context, aing aing, jbs jbs, jgy jgy, aikk aikk) {
        this.j = aing;
        this.m = jbs;
        this.n = jgy;
        boolean f2 = jgu.f(context);
        this.t = f2;
        if (f2) {
            this.h = new aipq().a(context);
        }
        if (!this.t || !jkr.c()) {
            this.o = null;
            this.p = null;
        } else if (!axyu.c()) {
            this.p = null;
            this.o = jbr.a("location", "BlockingChreGeofenceHardware", new ailz(this));
        } else {
            this.p = new BlockingChreGeofenceHardware$1(this, "location");
            this.o = null;
        }
        this.x = aikk;
    }

    public final void a() {
        synchronized (this.a) {
            this.a.clear();
            int i2 = this.g;
            if (i2 > 0) {
                this.a.addAll(Collections.nCopies(i2, (Object) null));
                this.d = new arlu[this.g];
            }
            this.b.clear();
            this.c.clear();
            for (int i3 = 0; i3 < this.g; i3++) {
                this.c.add(Integer.valueOf(i3));
            }
            this.v.clear();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List, java.util.Collection] */
    public final nz b() {
        nz nzVar = new nz((ou) this.b);
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            aimc aimc = (aimc) it.next();
            ? r3 = aimc.a;
            if (r3 != 0) {
                int size = r3.size();
                for (int i2 = 0; i2 < size; i2++) {
                    aimb aimb = (aimb) r3.get(i2);
                    nzVar.put(aimb.b, Integer.valueOf(aimb.a));
                }
            }
            ? r2 = aimc.b;
            if (r2 != 0) {
                int size2 = r2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    nzVar.remove(((aimb) r2.get(i3)).b);
                }
            }
        }
        return nzVar;
    }

    public final void be() {
        if (Log.isLoggable("ChreGeofenceHardware", 5)) {
            aikq.c("ChreGeofenceHardware", "Geofence app available.");
        }
        this.j.d(154);
    }

    public final void d() {
        arlm arlm = (arlm) arlo.e.o();
        this.u.clear();
        this.v.clear();
        if (arlm.c) {
            arlm.c();
            arlm.c = false;
        }
        arlo arlo = (arlo) arlm.b;
        arlo.b = 0;
        arlo.a |= 1;
        a((arlo) arlm.i(), w);
        a();
    }

    public final void e() {
        arlm arlm = (arlm) arlo.e.o();
        if (arlm.c) {
            arlm.c();
            arlm.c = false;
        }
        arlo arlo = (arlo) arlm.b;
        arlo.b = 2;
        arlo.a |= 1;
        a((arlo) arlm.i(), w);
    }

    /* access modifiers changed from: package-private */
    public final boolean f() {
        return this.g > 0 && this.r == 3;
    }

    public final void b(int i2) {
        if (this.i != null) {
            arlm arlm = (arlm) arlo.e.o();
            if (arlm.c) {
                arlm.c();
                arlm.c = false;
            }
            arlo arlo = (arlo) arlm.b;
            arlo.b = 0;
            arlo.a |= 1;
            a((arlo) arlm.i());
        }
    }

    public final void a(int i2) {
        if (i2 != 1) {
            if (Log.isLoggable("ChreGeofenceHardware", 5)) {
                aikq.c("ChreGeofenceHardware", "Geofence app unavailable.");
            }
            this.j.d(154);
        }
    }

    public final void a(arlo arlo) {
        arnh arnh = this.i;
        if (arnh != null) {
            arnh.a(0, 1, (audx) arlo);
            if (axyu.c() && this.p != null) {
                this.n.a("BlockingChreGeofenceHardware", 2, SystemClock.elapsedRealtime() + 5000, this.p, (Handler) null, (WorkSource) null);
                return;
            }
            this.m.a("BlockingChreGeofenceHardware", 2, SystemClock.elapsedRealtime() + 5000, this.o, (String) null);
        }
    }

    public final void b(ArrayList arrayList, ArrayList arrayList2) {
        aucd aucd = this.y;
        if (aucd != null) {
            arrayList2.add(new aimb(((arli) aucd.b).h, this.l));
            a(arrayList, arrayList2, (arli) this.y.i());
        }
    }

    public final void a(arlo arlo, aimc aimc) {
        this.u.add(arlo);
        if (this.v.isEmpty()) {
            this.j.d(150);
        }
        this.v.add(aimc);
    }

    public final void a(arnd arnd, arnh arnh, arnt arnt) {
        if (arnh.a() == 5147455389092024324L) {
            try {
                int a2 = armf.a(arnt.a);
                if (a2 != 0) {
                    int i2 = a2 - 1;
                    if (i2 == 1) {
                        arlp arlp = (arlp) arnt.a((auef) arlp.d.c(7));
                        if (arlp != null) {
                            this.j.b(152, arlp);
                        } else {
                            boolean z2 = aikq.a;
                        }
                    } else if (i2 == 2) {
                        arlw arlw = (arlw) arnt.a((auef) arlw.c.c(7));
                        if (arlw != null) {
                            this.j.b(151, arlw);
                        } else {
                            boolean z3 = aikq.a;
                        }
                    } else if (i2 != 3) {
                        boolean z4 = aikq.a;
                    } else if (((arlj) arnt.a((auef) arlj.a.c(7))) != null) {
                        this.j.a(LocationAvailability.a(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, 1, 1, SystemClock.elapsedRealtimeNanos()));
                    } else {
                        boolean z5 = aikq.a;
                    }
                } else {
                    boolean z6 = aikq.a;
                }
            } catch (Exception e2) {
                if (Log.isLoggable("ChreGeofenceHardware", 6)) {
                    String valueOf = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                    sb.append("Error on message received: ");
                    sb.append(valueOf);
                    aikq.b("ChreGeofenceHardware", sb.toString());
                }
            }
        }
    }

    public final void a(Runnable runnable) {
        if (this.q >= 131072 && f()) {
            Arrays.fill(this.d, (Object) null);
            arlm arlm = (arlm) arlo.e.o();
            if (arlm.c) {
                arlm.c();
                arlm.c = false;
            }
            arlo arlo = (arlo) arlm.b;
            arlo.b = 3;
            arlo.a |= 1;
            a((arlo) arlm.i());
            this.s = runnable;
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            aimc aimc = new aimc();
            aimc.b = arrayList;
            arlm arlm = (arlm) arlo.e.o();
            if (arlm.c) {
                arlm.c();
                arlm.c = false;
            }
            arlo arlo = (arlo) arlm.b;
            arlo.b = 2;
            arlo.a |= 1;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                aimb aimb = (aimb) arrayList.get(i2);
                arlm.a(aimb.a);
                this.c.add(Integer.valueOf(aimb.a));
            }
            a((arlo) arlm.i(), aimc);
        }
    }

    public final void a(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            aimc aimc = new aimc();
            aimc.a = new ArrayList(arrayList2);
            arlm arlm = (arlm) arlo.e.o();
            if (arlm.c) {
                arlm.c();
                arlm.c = false;
            }
            arlo arlo = (arlo) arlm.b;
            arlo.b = 1;
            arlo.a = 1 | arlo.a;
            if (!arlo.c.a()) {
                arlo.c = aucj.a(arlo.c);
            }
            auab.a((Iterable) arrayList, (List) arlo.c);
            a((arlo) arlm.i(), aimc);
            arrayList2.clear();
            arrayList.clear();
        }
    }

    public final void a(ArrayList arrayList, ArrayList arrayList2, arli arli) {
        arrayList.add(arli);
        if (arrayList.size() == 25) {
            a(arrayList, arrayList2);
        }
    }

    public final void a(List list) {
        nz b2 = b();
        nz nzVar = new nz((ou) b2);
        oo.a((Map) nzVar, (Collection) list);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : nzVar.entrySet()) {
            arrayList.add(new aimb(((Integer) entry.getValue()).intValue(), (aijt) entry.getKey()));
        }
        a(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aijt aijt = (aijt) it.next();
            if (!b2.containsKey(aijt)) {
                ArrayList arrayList4 = this.c;
                int intValue = ((Integer) arrayList4.remove(arrayList4.size() - 1)).intValue();
                arrayList3.add(new aimb(intValue, aijt));
                a(arrayList2, arrayList3, aijt.a(intValue));
            }
        }
        if (this.y != null) {
            ArrayList arrayList5 = this.c;
            int intValue2 = ((Integer) arrayList5.remove(arrayList5.size() - 1)).intValue();
            aucd aucd = this.y;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            arli arli = (arli) aucd.b;
            arli arli2 = arli.l;
            arli.a |= 64;
            arli.h = intValue2;
            arrayList3.add(new aimb(intValue2, this.l));
            a(arrayList2, arrayList3, (arli) this.y.i());
        }
        a(arrayList2, arrayList3);
    }

    public final void a(List list, boolean z2) {
        aijt aijt;
        byte b2;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arll arll = (arll) list.get(i2);
            int i3 = arll.a;
            if ((i3 & 1) == 0 || (i3 & 2) == 0 || (i3 & 4) == 0) {
                boolean z3 = aikq.a;
            } else {
                int i4 = arll.b;
                if (i4 < 0 || i4 >= this.a.size()) {
                    boolean z4 = aikq.a;
                } else {
                    if (!z2) {
                        aijt = (aijt) this.j.m.j.get(Integer.valueOf(arll.c));
                    } else {
                        aijt = (aijt) this.a.get(arll.b);
                        if (!(aijt == null || aijt.j == arll.c)) {
                            aijt = null;
                        }
                    }
                    if (!(aijt == null || aijt == this.l)) {
                        boolean z5 = aikq.a;
                        arlu arlu = arll.d;
                        if (arlu == null) {
                            arlu = arlu.f;
                        }
                        int i5 = arlu.a;
                        if ((i5 & 8) != 0) {
                            aijt.i = arlu.e;
                        }
                        if ((i5 & 1) != 0) {
                            int a2 = arlt.a(arlu.b);
                            if (a2 == 0) {
                                a2 = 1;
                            }
                            int i6 = a2 - 1;
                            if (i6 != 0) {
                                b2 = i6 != 1 ? i6 != 2 ? (byte) 3 : 2 : 1;
                            } else {
                                b2 = 0;
                            }
                            aijt.k.b = b2;
                        }
                        if ((arlu.a & 2) != 0) {
                            int a3 = arlr.a(arlu.c);
                            if (a3 == 0) {
                                a3 = 1;
                            }
                            int i7 = a3 - 1;
                            if (i7 == 0) {
                                aijt.h = false;
                            } else if (i7 == 1) {
                                aijt.h = false;
                                aijt.e = 1;
                            } else if (i7 != 2) {
                                aijt.h = true;
                                aijt.g = -1;
                                aijt.e = 1;
                            } else {
                                aijt.i = true;
                                aijt.h = false;
                                aijt.g = -1;
                                aijt.e = 2;
                            }
                        }
                        if ((arlu.a & 4) != 0) {
                            aijt.g = ((long) arlu.d) * 1000;
                            if (aijt.h || aijt.e != 1) {
                                Log.wtf("GeofenceState", new IllegalStateException("dwellCheckStartPlatformSec shouldn't be set if already dwelled or not inside."));
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean a(long j2) {
        int i2;
        int i3;
        boolean z2;
        if (this.y == null) {
            return false;
        }
        if (!this.e.isEmpty()) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        long j3 = Long.MAX_VALUE;
        for (int i4 = 0; i4 < size; i4++) {
            aijt aijt = (aijt) arrayList.get(i4);
            long j4 = aijt.c() ? (aijt.g + ((long) aijt.a.i)) - j2 : -1;
            if (j4 < j3) {
                j3 = j4;
            }
        }
        if (j3 != Long.MAX_VALUE) {
            i2 |= 4;
        }
        if (j3 != Long.MAX_VALUE) {
            i3 = ((int) (j3 / 1000)) + 1;
        } else {
            i3 = -1;
        }
        aucd aucd = this.y;
        arli arli = (arli) aucd.b;
        if ((arli.a & 16) != 0 && arli.f == i3) {
            z2 = false;
        } else {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            arli arli2 = (arli) aucd.b;
            arli arli3 = arli.l;
            arli2.a |= 16;
            arli2.f = i3;
            z2 = true;
        }
        aucd aucd2 = this.y;
        arli arli4 = (arli) aucd2.b;
        if ((arli4.a & 32) != 0 && arli4.g == i2) {
            return z2;
        }
        if (aucd2.c) {
            aucd2.c();
            aucd2.c = false;
        }
        arli arli5 = (arli) aucd2.b;
        arli arli6 = arli.l;
        arli5.a |= 32;
        arli5.g = i2;
        aucd aucd3 = this.y;
        if (aucd3.c) {
            aucd3.c();
            aucd3.c = false;
        }
        arli arli7 = (arli) aucd3.b;
        arli7.a |= 128;
        arli7.i = i2;
        return true;
    }
}
