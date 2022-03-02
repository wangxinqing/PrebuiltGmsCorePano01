package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.location.fused.bluepixel.BluePixelNanoAdapterReal$1;
import com.google.android.location.fused.bluepixel.BluePixelNanoAdapterReal$RequestTimeoutAlarmListener;
import com.google.location.bluemoon.inertialanchor.Pose;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: aihg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aihg extends aihe {
    public static final /* synthetic */ int d = 0;
    private static final arkb e;
    public final PowerManager a;
    final jgw b = new BluePixelNanoAdapterReal$RequestTimeoutAlarmListener(this);
    public final aiho c = new aiho();
    private final Context f;
    private final BroadcastReceiver g = new BluePixelNanoAdapterReal$1(this, "location");
    private final arnh h;
    private final qvr i;
    private final jgy j;
    private final aiha k;
    private aihi l;
    private arce m;
    private final List n = new ArrayList();
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private final Pose r = Pose.a();
    private arkb s;
    private final aihm t;
    private final arcf u = new arcf();

    static {
        aucd o2 = arkb.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        arkb arkb = (arkb) o2.b;
        arkb.b = 1;
        int i2 = 1 | arkb.a;
        arkb.a = i2;
        arkb.a = i2 | 2;
        arkb.c = false;
        e = (arkb) o2.i();
    }

    public aihg(Context context, arnh arnh, qvr qvr, jgy jgy, aiha aiha) {
        this.f = context;
        this.h = arnh;
        this.i = qvr;
        this.j = jgy;
        this.k = aiha;
        arnh.a(this, qvr);
        this.t = new aihm(context, qvr, this);
        this.s = e;
        this.a = (PowerManager) context.getSystemService("power");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.phenotype.COMMITTED");
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        context.registerReceiver(this.g, intentFilter, (String) null, qvr);
    }

    public static String a(arke arke) {
        int i2 = arke.b;
        return i2 != 2 ? i2 != 4 ? i2 != 5 ? i2 != 3 ? i2 == 6 ? "Config" : "unknown" : "StopCollect" : "StopDelivery" : "StartDelivery" : "StartCollect";
    }

    private final void b(arke arke) {
        arnk a2 = this.h.a(1, 0, arke.k());
        if (a2 == null) {
            new Object[1][0] = a(arke);
        } else {
            a2.a(new aihf(arke));
        }
    }

    private final boolean h() {
        if (!this.o) {
            return false;
        }
        aiha aiha = this.k;
        if (axxm.f()) {
            if (aiha.p > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - aiha.p;
                aiha.j = (int) (elapsedRealtime / 1000);
                if (axxm.d()) {
                    aiha.k += elapsedRealtime;
                    if (aiha.l < elapsedRealtime) {
                        aiha.l = elapsedRealtime;
                    }
                }
            }
            aiha.p = 0;
        }
        this.o = false;
        this.q = false;
        a(axxm.h(), axxm.j());
        a(2, this.s.c);
        if (!l()) {
            return true;
        }
        this.l.a();
        return true;
    }

    private final boolean i() {
        if (!this.p) {
            return false;
        }
        if (axxm.d()) {
            aiha aiha = this.k;
            if (axxm.f()) {
                if (aiha.q > 0) {
                    long elapsedRealtime = (long) ((int) (SystemClock.elapsedRealtime() - aiha.q));
                    aiha.m += elapsedRealtime;
                    if (aiha.n < elapsedRealtime) {
                        aiha.n = elapsedRealtime;
                    }
                }
                aiha.q = 0;
            }
        }
        this.p = false;
        int a2 = arka.a(this.s.b);
        if (a2 == 0) {
            a2 = 1;
        }
        a(a2, false);
        return true;
    }

    private final void j() {
        aucd o2 = arke.e.o();
        aucd o3 = arkc.a.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        arke arke = (arke) o2.b;
        arkc arkc = (arkc) o3.i();
        arkc.getClass();
        arke.c = arkc;
        arke.b = 3;
        a((arke) o2.i(), 1);
    }

    private final boolean k() {
        return !axxm.k() || !rns.b(this.f) || this.a.isPowerSaveMode();
    }

    private final boolean l() {
        return this.l != null;
    }

    private final boolean m() {
        return this.m != null;
    }

    public final void a(aihc aihc) {
        aihi aihi = this.l;
        if (aihi != null) {
            aihi.g = aihc;
        }
    }

    public final aift b() {
        return this.l;
    }

    public final void be() {
        List list = this.n;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((aihb) list.get(i2)).be();
        }
        this.c.a();
        if (l()) {
            f();
            d();
            this.t.b();
        }
        if (m()) {
            g();
        }
    }

    public final boolean c(int i2) {
        if (axxm.b() && k()) {
            return false;
        }
        if (i2 - 1 != 1) {
            if (!rns.b(this.f) || !m() || this.p) {
                return false;
            }
            if (axxm.d()) {
                aiha aiha = this.k;
                if (axxm.f()) {
                    aiha.q = SystemClock.elapsedRealtime();
                    aiha.f++;
                }
            }
            aucd o2 = arkb.d.o();
            int a2 = arka.a(this.s.b);
            if (a2 == 0) {
                a2 = 1;
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arkb arkb = (arkb) o2.b;
            arkb.b = a2 - 1;
            int i3 = arkb.a | 1;
            arkb.a = i3;
            arkb.a = 2 | i3;
            arkb.c = true;
            this.s = (arkb) o2.i();
            aucd o3 = arke.e.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            arke arke = (arke) o3.b;
            arke.a |= 1;
            arke.d = 2;
            arkb arkb2 = this.s;
            arkb2.getClass();
            arke.c = arkb2;
            arke.b = 4;
            a((arke) o3.i(), 3);
            this.p = true;
            return true;
        } else if (!rns.b(this.f) || !l() || this.o) {
            return false;
        } else {
            aiha aiha2 = this.k;
            if (axxm.f()) {
                aiha2.p = SystemClock.elapsedRealtime();
            }
            aiha aiha3 = this.k;
            if (axxm.f()) {
                aiha3.o = SystemClock.elapsedRealtime();
                aiha3.c++;
            }
            aucd o4 = arkb.d.o();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            arkb arkb3 = (arkb) o4.b;
            arkb3.b = 3;
            int i4 = arkb3.a | 1;
            arkb3.a = i4;
            boolean z = this.s.c;
            arkb3.a = i4 | 2;
            arkb3.c = z;
            this.s = (arkb) o4.i();
            aucd o5 = arke.e.o();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            arke arke2 = (arke) o5.b;
            arke2.a |= 1;
            arke2.d = 1;
            arkb arkb4 = this.s;
            arkb4.getClass();
            arke2.c = arkb4;
            arke2.b = 4;
            a((arke) o5.i(), 2);
            this.o = true;
            return true;
        }
    }

    public final void d() {
        if (!k()) {
            a(axxm.h(), axxm.j());
            if (axxm.a.a().conveyGatingOffHysteresisEnabled()) {
                aucd o2 = arke.e.o();
                aucd o3 = arjy.i.o();
                boolean g2 = axxm.g();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                arjy arjy = (arjy) o3.b;
                arjy.a |= 1;
                arjy.b = g2;
                long i2 = axxm.i();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                arjy arjy2 = (arjy) o3.b;
                arjy2.a |= 2;
                arjy2.c = i2;
                long gatingOffHysteresisNanos = axxm.a.a().gatingOffHysteresisNanos();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                arjy arjy3 = (arjy) o3.b;
                arjy3.a |= 8;
                arjy3.d = gatingOffHysteresisNanos;
                boolean b2 = axxm.b();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                arjy arjy4 = (arjy) o3.b;
                arjy4.a |= 16;
                arjy4.e = b2;
                long c2 = axxm.c();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                arjy arjy5 = (arjy) o3.b;
                arjy5.a |= 32;
                arjy5.f = c2;
                int m2 = (int) axxm.m();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                arjy arjy6 = (arjy) o3.b;
                arjy6.a |= 64;
                arjy6.g = m2;
                int o4 = (int) axxm.o();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                arjy arjy7 = (arjy) o3.b;
                arjy7.a |= 128;
                arjy7.h = o4;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                arke arke = (arke) o2.b;
                arjy arjy8 = (arjy) o3.i();
                arjy8.getClass();
                arke.c = arjy8;
                arke.b = 2;
                a((arke) o2.i(), 1);
            } else {
                aucd o5 = arke.e.o();
                aucd o6 = arjy.i.o();
                boolean g3 = axxm.g();
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                arjy arjy9 = (arjy) o6.b;
                arjy9.a |= 1;
                arjy9.b = g3;
                long i3 = axxm.i();
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                arjy arjy10 = (arjy) o6.b;
                arjy10.a |= 2;
                arjy10.c = i3;
                boolean b3 = axxm.b();
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                arjy arjy11 = (arjy) o6.b;
                arjy11.a |= 16;
                arjy11.e = b3;
                long c3 = axxm.c();
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                arjy arjy12 = (arjy) o6.b;
                arjy12.a |= 32;
                arjy12.f = c3;
                int m3 = (int) axxm.m();
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                arjy arjy13 = (arjy) o6.b;
                arjy13.a |= 64;
                arjy13.g = m3;
                int o7 = (int) axxm.o();
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                arjy arjy14 = (arjy) o6.b;
                arjy14.a |= 128;
                arjy14.h = o7;
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                arke arke2 = (arke) o5.b;
                arjy arjy15 = (arjy) o6.i();
                arjy15.getClass();
                arke2.c = arjy15;
                arke2.b = 2;
                a((arke) o5.i(), 1);
            }
            if (axxm.a.a().fopIaUseGcoreConfig() && this.h.c() >= 14) {
                try {
                    arcr a2 = arcd.a(this.f, Integer.valueOf((int) axxm.a.a().fopIaGcoreConfigIndex()));
                    aucd o8 = arke.e.o();
                    aucd o9 = arjx.e.o();
                    aucd o10 = arjp.d.o();
                    if (o10.c) {
                        o10.c();
                        o10.c = false;
                    }
                    arjp arjp = (arjp) o10.b;
                    a2.getClass();
                    arjp.b = a2;
                    arjp.a |= 8;
                    arjp arjp2 = (arjp) o10.i();
                    if (o9.c) {
                        o9.c();
                        o9.c = false;
                    }
                    arjx arjx = (arjx) o9.b;
                    arjp2.getClass();
                    arjx.b = arjp2;
                    arjx.a |= 1;
                    arjx arjx2 = (arjx) o9.i();
                    if (o8.c) {
                        o8.c();
                        o8.c = false;
                    }
                    arke arke3 = (arke) o8.b;
                    arjx2.getClass();
                    arke3.c = arjx2;
                    arke3.b = 6;
                    a((arke) o8.i(), 1);
                } catch (IOException e2) {
                    String valueOf = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
                    sb.append("Error loading Inertial Anchor config for BluePixel. \n");
                    sb.append(valueOf);
                    aihr.a(sb.toString(), new Object[0]);
                }
            }
        }
    }

    public final void e() {
        g();
        f();
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        h();
        j();
        if (l()) {
            this.l.a();
        }
    }

    public final void g() {
        if (axxm.a.a().deliverFopDataNotStartedOnFopReset()) {
            List list = this.n;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((aihb) list.get(i2)).a(false);
            }
        }
        i();
    }

    private final void a(int i2, boolean z) {
        aucd o2 = arkb.d.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        arkb arkb = (arkb) o2.b;
        arkb.b = i2 - 1;
        int i3 = arkb.a | 1;
        arkb.a = i3;
        arkb.a = i3 | 2;
        arkb.c = z;
        arkb arkb2 = (arkb) o2.i();
        this.s = arkb2;
        int a2 = arka.a(arkb2.b);
        if (a2 != 0 && a2 == 2 && !this.s.c) {
            aucd o3 = arke.e.o();
            aucd o4 = arkd.a.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            arke arke = (arke) o3.b;
            arkd arkd = (arkd) o4.i();
            arkd.getClass();
            arke.c = arkd;
            arke.b = 5;
            a((arke) o3.i(), 1);
            return;
        }
        aucd o5 = arke.e.o();
        arkb arkb3 = this.s;
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        arke arke2 = (arke) o5.b;
        arkb3.getClass();
        arke2.c = arkb3;
        arke2.b = 4;
        a((arke) o5.i(), 1);
    }

    public final void e(int i2) {
        List list = this.n;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((aihb) list.get(i3)).a(i2);
        }
        this.j.a(this.b);
        if (l()) {
            this.l.a();
        }
        this.c.a();
        this.o = false;
        this.q = false;
        this.p = false;
        this.s = e;
    }

    public final void b(int i2) {
        List list = this.n;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((aihb) list.get(i3)).b(i2);
        }
    }

    private final void a(long j2, long j3) {
        aucd o2 = arke.e.o();
        aucd o3 = arjx.e.o();
        aucd o4 = arjn.d.o();
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        arjn arjn = (arjn) o4.b;
        arjn.a |= 2;
        arjn.c = j2;
        arjn arjn2 = (arjn) o4.i();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        arjx arjx = (arjx) o3.b;
        arjn2.getClass();
        arjx.c = arjn2;
        arjx.a |= 2;
        aucd o5 = arkh.d.o();
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        arkh arkh = (arkh) o5.b;
        arkh.a |= 2;
        arkh.c = j3;
        arkh arkh2 = (arkh) o5.i();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        arjx arjx2 = (arjx) o3.b;
        arkh2.getClass();
        arjx2.d = arkh2;
        arjx2.a |= 4;
        arjx arjx3 = (arjx) o3.i();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        arke arke = (arke) o2.b;
        arjx3.getClass();
        arke.c = arjx3;
        arke.b = 6;
        a((arke) o2.i(), 1);
    }

    public final long a() {
        if (l()) {
            return this.l.c;
        }
        return -1;
    }

    public final void a(int i2) {
        e(i2);
        if (i2 == 2) {
            aihm aihm = this.t;
            if (aihm.c) {
                aihm.b.a(aihm.d);
                aihm.b.a(aihm.e);
                aihm.a.unregisterReceiver(aihm.g);
                int i3 = Build.VERSION.SDK_INT;
                aihm.a.getContentResolver().unregisterContentObserver(aihm.f);
                aihm.c = false;
            }
        }
    }

    public final void a(aihb aihb) {
        if (!this.n.contains(aihb)) {
            this.n.add(aihb);
        }
    }

    public final void a(Location location) {
        arcv a2 = this.u.a(location);
        if (a2 != null) {
            aucd o2 = arke.e.o();
            aucd o3 = arjx.e.o();
            aucd o4 = arjp.d.o();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            arjp arjp = (arjp) o4.b;
            a2.getClass();
            arjp.c = a2;
            arjp.a |= 16;
            arjp arjp2 = (arjp) o4.i();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            arjx arjx = (arjx) o3.b;
            arjp2.getClass();
            arjx.b = arjp2;
            arjx.a |= 1;
            arjx arjx2 = (arjx) o3.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            arke arke = (arke) o2.b;
            arjx2.getClass();
            arke.c = arjx2;
            arke.b = 6;
            a((arke) o2.i(), 1);
        }
    }

    public final void a(aqgg aqgg, aqgu aqgu) {
        this.l = new aihi(this.f, aqgg, aqgu, this.k);
        f();
        d();
        this.t.b();
    }

    public final void a(arce arce) {
        this.m = arce;
        g();
    }

    /* access modifiers changed from: package-private */
    public final void a(arke arke, int i2) {
        aucd aucd = (aucd) arke.c(5);
        aucd.a((aucj) arke);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        arke arke2 = (arke) aucd.b;
        arke arke3 = arke.e;
        arke2.a |= 1;
        arke2.d = elapsedRealtime;
        arke arke4 = (arke) aucd.i();
        aiho aiho = this.c;
        if (((long) aiho.a.size()) < axxm.a.a().requestQueueMaxSize()) {
            aiho.a.add(new aihn(arke4, i2));
            this.j.a("BluePixelNanoAppRequestAlarm", 3, SystemClock.elapsedRealtime() + axxm.a.a().requestQueueTimeoutMs(), this.b, (Handler) this.i, (WorkSource) null);
            if (this.c.a.size() == 1) {
                b(arke4);
                return;
            }
            return;
        }
        e(2);
        j();
    }

    public final boolean d(int i2) {
        if (i2 - 1 != 1) {
            return i();
        }
        return h();
    }

    public final void a(arnd arnd, arnh arnh, arnt arnt) {
        arke arke;
        anyd anyd;
        anye anye;
        boolean z;
        long j2;
        int i2;
        arjv arjv;
        arjv arjv2;
        arjq arjq;
        arjv arjv3;
        arjq arjq2;
        arjv arjv4;
        arjq arjq3;
        arjv arjv5;
        arjq arjq4;
        arnt arnt2 = arnt;
        if (arnh.a() == 5147455389092024339L) {
            int i3 = 2;
            if (arnt2.a == 2) {
                aiho aiho = this.c;
                long j3 = ((arkf) arnt2.a((auef) arkf.c.c(7))).a;
                if (aiho.a.isEmpty() || ((aihn) aiho.a.getFirst()).a.d != j3) {
                    e(2);
                    return;
                }
            }
            int i4 = 3;
            int i5 = 1;
            if (m()) {
                int i6 = arnt2.a;
                if (i6 == 2) {
                    arkf arkf = (arkf) arnt2.a((auef) arkf.c.c(7));
                    if (this.c.a(3)) {
                        if (!arkf.b) {
                            d(3);
                        }
                        List list = this.n;
                        int size = list.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            ((aihb) list.get(i7)).a(arkf.b);
                        }
                    }
                } else if (i6 == 3 && this.p) {
                    aucx aucx = ((arjm) arnt2.a((auef) arjm.b.c(7))).a;
                    int size2 = aucx.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        arjk arjk = (arjk) aucx.get(i8);
                        if (arjj.a(arjk.a) != i5) {
                            i2 = size2;
                        } else {
                            if (arjk.a == i3) {
                                arjv = (arjv) arjk.b;
                            } else {
                                arjv = arjv.c;
                            }
                            if (arjt.a(arjv.a) == i4) {
                                Pose pose = this.r;
                                if (arjk.a == i3) {
                                    arjv2 = (arjv) arjk.b;
                                } else {
                                    arjv2 = arjv.c;
                                }
                                if (arjv2.a == i4) {
                                    arjq = (arjq) arjv2.b;
                                } else {
                                    arjq = arjq.b;
                                }
                                arjw arjw = arjq.a;
                                if (arjw == null) {
                                    arjw = arjw.e;
                                }
                                double d2 = (double) arjw.b;
                                if (arjk.a == i3) {
                                    arjv3 = (arjv) arjk.b;
                                } else {
                                    arjv3 = arjv.c;
                                }
                                if (arjv3.a == i4) {
                                    arjq2 = (arjq) arjv3.b;
                                } else {
                                    arjq2 = arjq.b;
                                }
                                arjw arjw2 = arjq2.a;
                                if (arjw2 == null) {
                                    arjw2 = arjw.e;
                                }
                                i2 = size2;
                                double d3 = (double) arjw2.c;
                                if (arjk.a == i3) {
                                    arjv4 = (arjv) arjk.b;
                                } else {
                                    arjv4 = arjv.c;
                                }
                                if (arjv4.a == i4) {
                                    arjq3 = (arjq) arjv4.b;
                                } else {
                                    arjq3 = arjq.b;
                                }
                                arjw arjw3 = arjq3.a;
                                if (arjw3 == null) {
                                    arjw3 = arjw.e;
                                }
                                double d4 = d3;
                                double d5 = (double) arjw3.d;
                                if (arjk.a == i3) {
                                    arjv5 = (arjv) arjk.b;
                                } else {
                                    arjv5 = arjv.c;
                                }
                                if (arjv5.a == i4) {
                                    arjq4 = (arjq) arjv5.b;
                                } else {
                                    arjq4 = arjq.b;
                                }
                                arjw arjw4 = arjq4.a;
                                if (arjw4 == null) {
                                    arjw4 = arjw.e;
                                }
                                pose.setAttitude(d2, d4, d5, (double) arjw4.a);
                                Pose pose2 = this.r;
                                pose2.timestampNanos = arjk.c;
                                this.m.a(pose2);
                            } else {
                                i2 = size2;
                            }
                        }
                        i8++;
                        size2 = i2;
                        i3 = 2;
                        i4 = 3;
                        i5 = 1;
                    }
                }
            }
            if (l()) {
                int i9 = arnt2.a;
                if (i9 == 2) {
                    arkf arkf2 = (arkf) arnt2.a((auef) arkf.c.c(7));
                    if (this.c.a(2)) {
                        if (arkf2.b) {
                            this.q = true;
                            aihi aihi = this.l;
                            if (!aihi.d.a()) {
                                aihi.a();
                                z = false;
                            } else {
                                aigy aigy = aihi.d;
                                if (aigy.a()) {
                                    j2 = ((arjk) aigy.b.getLast()).c;
                                } else {
                                    j2 = -1;
                                }
                                aihi.c = j2;
                                aihi.f.a(2);
                                aihi.e.d();
                                arjl arjl = (arjl) arjm.b.o();
                                Iterator b2 = aihi.d.b();
                                while (b2.hasNext()) {
                                    arjk arjk2 = (arjk) b2.next();
                                    if (arjk2.a == 4) {
                                        arjl.a(arjk2);
                                    }
                                }
                                if (((arjm) arjl.b).a.size() <= 0) {
                                    aihi.a(Collections.emptyList());
                                    z = true;
                                } else {
                                    aihi.b = SystemClock.elapsedRealtime() * 1000000;
                                    aihi.b((arjm) arjl.i());
                                    z = true;
                                }
                            }
                            if (z) {
                                a(axxm.a.a().flpBluePixelNanoAppGnssStreamIntervalMs(), axxm.a.a().flpBluePixelNanoAppWifiStreamIntervalMs());
                            } else {
                                d(2);
                            }
                            if (axxm.d()) {
                                this.k.a(true, z);
                            } else {
                                this.k.a(z);
                            }
                        } else {
                            if (axxm.d()) {
                                this.k.a(false, false);
                            } else {
                                this.k.a(false);
                            }
                            d(2);
                        }
                    }
                } else if (i9 == 3) {
                    arjm arjm = (arjm) arnt2.a((auef) arjm.b.c(7));
                    if (this.q) {
                        aihi aihi2 = this.l;
                        if (SystemClock.elapsedRealtime() * 1000000 >= aihi2.b + ((Long) aihi2.a.a()).longValue()) {
                            if (!aihi2.d.d()) {
                                aihi2.b(Collections.emptyList());
                            }
                            aucx aucx2 = arjm.a;
                            int size3 = aucx2.size();
                            for (int i10 = 0; i10 < size3; i10++) {
                                arjk arjk3 = (arjk) aucx2.get(i10);
                                if (arjk3.a != 4) {
                                    aihi2.a(arjk3);
                                } else {
                                    arjl arjl2 = (arjl) arjm.b.o();
                                    arjl2.a(arjk3);
                                    aihi2.b((arjm) arjl2.i());
                                }
                            }
                        } else {
                            aihi2.a(arjm);
                        }
                    } else if (this.o) {
                        this.l.a(arjm);
                    }
                }
            }
            if (axxm.f() && arnt2.a == 4 && (anyd = (anyd) arnt2.a((auef) anyd.d.c(7))) != null && (anyd.a & 1) != 0) {
                anyf anyf = anyd.b;
                if (anyf == null) {
                    anyf = anyf.c;
                }
                if (axxm.d() && (anyf.a & 16) == 0) {
                    aucd aucd = (aucd) anyf.c(5);
                    aucd.a((aucj) anyf);
                    int c2 = this.h.c();
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    anyf anyf2 = (anyf) aucd.b;
                    anyf2.a |= 16;
                    anyf2.b = c2;
                    anyf = (anyf) aucd.i();
                }
                aiha aiha = this.k;
                if (axxm.d()) {
                    aucd o2 = anye.n.o();
                    int min = Math.min(aiha.c, 14400);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anye anye2 = (anye) o2.b;
                    anye2.a |= 1;
                    anye2.b = min;
                    int min2 = Math.min(aiha.d, 14400);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anye anye3 = (anye) o2.b;
                    anye3.a |= 2;
                    anye3.c = min2;
                    int min3 = Math.min(aiha.g, 60000);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anye anye4 = (anye) o2.b;
                    anye4.a = 4 | anye4.a;
                    anye4.d = min3;
                    int min4 = Math.min(aiha.h, 2880);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anye anye5 = (anye) o2.b;
                    anye5.a |= 8;
                    anye5.e = min4;
                    int min5 = Math.min(aiha.i, 2880);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anye anye6 = (anye) o2.b;
                    anye6.a |= 16;
                    anye6.f = min5;
                    int min6 = Math.min(aiha.j, 3600);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anye anye7 = (anye) o2.b;
                    anye7.a |= 32;
                    anye7.g = min6;
                    int min7 = Math.min(aiha.e, 14400);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anye anye8 = (anye) o2.b;
                    anye8.a |= 64;
                    anye8.h = min7;
                    int min8 = Math.min(aiha.f, 14400);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anye anye9 = (anye) o2.b;
                    anye9.a |= 128;
                    anye9.i = min8;
                    int min9 = Math.min((int) (aiha.k / 1000), 86400);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anye anye10 = (anye) o2.b;
                    anye10.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    anye10.j = min9;
                    int min10 = Math.min((int) (aiha.l / 1000), 3600);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anye anye11 = (anye) o2.b;
                    anye11.a |= 512;
                    anye11.k = min10;
                    int min11 = Math.min((int) (aiha.m / 1000), 86400);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anye anye12 = (anye) o2.b;
                    anye12.a |= 1024;
                    anye12.l = min11;
                    int min12 = Math.min((int) (aiha.n / 1000), 3600);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    anye anye13 = (anye) o2.b;
                    anye13.a |= 2048;
                    anye13.m = min12;
                    anye = (anye) o2.i();
                } else {
                    aucd o3 = anye.n.o();
                    int i11 = aiha.c;
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    anye anye14 = (anye) o3.b;
                    int i12 = anye14.a | 1;
                    anye14.a = i12;
                    anye14.b = i11;
                    int i13 = aiha.d;
                    int i14 = i12 | 2;
                    anye14.a = i14;
                    anye14.c = i13;
                    int i15 = aiha.g;
                    int i16 = 4 | i14;
                    anye14.a = i16;
                    anye14.d = i15;
                    int i17 = aiha.h;
                    int i18 = i16 | 8;
                    anye14.a = i18;
                    anye14.e = i17;
                    int i19 = aiha.i;
                    int i20 = i18 | 16;
                    anye14.a = i20;
                    anye14.f = i19;
                    int i21 = aiha.j;
                    anye14.a = i20 | 32;
                    anye14.g = i21;
                    anye = (anye) o3.i();
                }
                aucd o4 = anyd.d.o();
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                anyd anyd2 = (anyd) o4.b;
                anyf.getClass();
                anyd2.b = anyf;
                int i22 = anyd2.a | 1;
                anyd2.a = i22;
                anye.getClass();
                anyd2.c = anye;
                anyd2.a = i22 | 2;
                anyd anyd3 = (anyd) o4.i();
                if (!axxm.a.a().restrictClearcutToCheckboxConsent()) {
                    if (axxm.f()) {
                        aucd o5 = anui.p.o();
                        if (o5.c) {
                            o5.c();
                            o5.c = false;
                        }
                        anui anui = (anui) o5.b;
                        anui.b = 14;
                        int i23 = anui.a | 1;
                        anui.a = i23;
                        anyd3.getClass();
                        anui.n = anyd3;
                        anui.a = i23 | 16384;
                        aiha.a.a((audx) (anui) o5.i()).b();
                    }
                } else if (axxm.f() && ((double) aiha.b.nextFloat()) < axxm.a.a().clearcutSamplingRate()) {
                    aiha.r.o().a((acvv) new aigz(aiha, anyd3));
                }
                aiha.c = 0;
                aiha.d = 0;
                aiha.g = 0;
                aiha.h = 0;
                aiha.i = 0;
                aiha.j = 0;
                aiha.e = 0;
                aiha.f = 0;
                aiha.k = 0;
                aiha.l = 0;
                aiha.m = 0;
                aiha.n = 0;
            }
            if (arnt2.a == 2) {
                aiho aiho2 = this.c;
                if (!aiho2.a.isEmpty()) {
                    aiho2.a.removeFirst();
                }
                if (!aiho2.a.isEmpty()) {
                    arke = ((aihn) aiho2.a.getFirst()).a;
                } else {
                    arke = null;
                }
                if (arke == null) {
                    this.j.a(this.b);
                } else {
                    b(arke);
                }
            }
        }
    }

    public final void a(PrintWriter printWriter) {
        if (printWriter != null) {
            printWriter.printf("FLP registered: %b%n", new Object[]{Boolean.valueOf(l())});
            printWriter.printf("FOP registered: %b%n", new Object[]{Boolean.valueOf(m())});
            printWriter.println();
            printWriter.printf("FLP delivering: %b%n", new Object[]{Boolean.valueOf(this.o)});
            printWriter.printf("FLP batch received: %b%n", new Object[]{Boolean.valueOf(this.q)});
            printWriter.println();
            printWriter.printf("FOP delivering: %b%n", new Object[]{Boolean.valueOf(this.p)});
        }
    }
}
