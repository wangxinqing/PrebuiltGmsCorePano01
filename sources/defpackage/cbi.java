package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import android.os.WorkSource;
import android.util.SparseArray;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* renamed from: cbi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cbi extends cbe {
    private static cbi J;
    protected static nix a;
    protected btw A;
    protected clj B;
    protected btq C;
    protected byd D;
    protected buc E;
    protected bti F;
    protected btx G;
    protected ccq H;
    protected cbe I;
    protected final Context b;
    protected Context c;
    protected String d = null;
    protected int e = -1;
    protected Integer f;
    protected final jiq g;
    protected cce h;
    protected bwn i;
    protected bxr j;
    protected bwg k;
    protected civ l;
    protected cjd m;
    protected cjo n;
    protected cap o;
    protected cba p;
    protected cat q;
    protected ccg r;
    protected bxo s;
    protected chn t;
    protected cbl u;
    protected btg v;
    protected bte w;
    protected bsx x;
    protected cjz y;
    protected ckr z;

    protected cbi(Context context, jiq jiq) {
        this.b = context;
        this.g = jiq;
    }

    public static synchronized ckr A() {
        ckr Z;
        synchronized (cbi.class) {
            Z = a().Z();
        }
        return Z;
    }

    public static synchronized btw B() {
        btw aa;
        synchronized (cbi.class) {
            aa = a().aa();
        }
        return aa;
    }

    public static synchronized clj C() {
        clj ab;
        synchronized (cbi.class) {
            ab = a().ab();
        }
        return ab;
    }

    public static synchronized clj D() {
        clj ab;
        synchronized (cbi.class) {
            ab = J != null ? a().ab() : null;
        }
        return ab;
    }

    public static synchronized byd E() {
        byd ac;
        synchronized (cbi.class) {
            ac = a().ac();
        }
        return ac;
    }

    public static synchronized buc F() {
        buc ad;
        synchronized (cbi.class) {
            ad = a().ad();
        }
        return ad;
    }

    public static synchronized btx G() {
        btx ae;
        synchronized (cbi.class) {
            ae = a().ae();
        }
        return ae;
    }

    public static synchronized ccq H() {
        ccq ccq;
        synchronized (cbi.class) {
            cbi a2 = a();
            if (a2.H == null) {
                a2.H = new ccq();
            }
            ccq = a2.H;
        }
        return ccq;
    }

    protected static cbi a() {
        if (J == null) {
            cbi cbi = new cbi(ihs.b(), jiu.a);
            J = cbi;
            bxk.b("Modules", "Modules.init() called.", new Object[0]);
            cbi.I();
            cbi.K();
            cbi.L();
            cbi.N();
            cbi.M();
            cbi.O();
            cbi.P();
            cbi.Q();
            cbi.R();
            ag();
            cbi.S();
            cbi.T();
            cbi.U();
            cbi.V();
            cbi.W();
            if (cbi.I == null) {
                cbi.I = new cbe();
                new chp().a(bvq.a("Prune"));
            }
            cbi.X();
            cbi.Y();
            cbi.Z();
            cbi.aa();
            cbi.ab();
            cbi.ah();
            cbi.ac();
            cbi.ad();
            cbi.J();
            bwn k2 = k();
            A().a(k2.c, k2);
            jwu.a = new cbf();
            for (bsz bsz : y().a()) {
                if (!bsz.b()) {
                    cap r2 = r();
                    caq caq = new caq("user_location", atjv.USER_LOCATION, cbb.c(), a(bsz, "com.google.android.contextmanager.interest.InterestManager"));
                    long aQ = awuz.a.a().aQ();
                    aucd o2 = atkp.e.o();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    atkp atkp = (atkp) o2.b;
                    atkp.b = 1;
                    int i2 = atkp.a | 1;
                    atkp.a = i2;
                    atkp.a = 2 | i2;
                    atkp.c = aQ;
                    cbd cbd = new cbd((atkp) o2.i());
                    iva.a((Object) cbd);
                    caq.b = cbd;
                    caq.a = true;
                    r2.a(caq.a());
                }
            }
            jtm jtm = new jtm();
            jtm.a(10002);
            jtn a2 = jtm.a();
            for (bsz bsz2 : y().a()) {
                if (!bsz2.b()) {
                    WriteBatchImpl b2 = juc.b();
                    cjb a3 = p().a((ContextDataFilterImpl) a2, a(bsz2, "ContextManagerInitializer"));
                    if (a3.a != 0) {
                        ((anih) ((anih) bxk.a.c()).a("cbh", "a", 107, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextManagerInitializer] Unable to read from store for account %s, status code is %s", (Object) bsz2, a3.a);
                    } else {
                        ArrayList arrayList = a3.b;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            ArrayList arrayList2 = a3.b;
                            int size = arrayList2.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                ContextData contextData = (ContextData) arrayList2.get(i3);
                                jut a4 = bvl.a(contextData.j());
                                if (a4 != null) {
                                    ((anih) ((anih) bxk.a.c()).a("cbh", "a", 118, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextManagerInitializer] Fixing UDC Model timestamps");
                                    jti jti = new jti(contextData);
                                    jti.a(a4);
                                    b2.a(jti.a());
                                }
                            }
                        }
                        p().a(b2, a(bsz2, "ContextManagerInitializer"));
                    }
                }
            }
            ContextData.c = new cbg();
            clj ab = J.ab();
            iva.c("ContextManagerStarted");
            ab.c(new bvp("ContextManagerStarted", (WorkSource) null, 0, 0, 0, "com.google.android.gms"));
            J.ae().a(2);
        }
        return J;
    }

    public static synchronized void af() {
        synchronized (cbi.class) {
            a().ah();
        }
    }

    public static synchronized void ag() {
        synchronized (cbi.class) {
            cbi a2 = a();
            if (a2.q == null) {
                a2.q = new cat();
                a2.Q().a((cao) a2.q, (but) a2.I());
            }
        }
    }

    public static synchronized nix b() {
        nix nix;
        synchronized (cbi.class) {
            nix = a;
        }
        return nix;
    }

    public static synchronized String c() {
        String str;
        synchronized (cbi.class) {
            str = a().d;
        }
        return str;
    }

    public static synchronized int d() {
        int i2;
        synchronized (cbi.class) {
            i2 = a().e;
        }
        return i2;
    }

    public static synchronized void e() {
        synchronized (cbi.class) {
            J = null;
        }
    }

    public static synchronized Context f() {
        Context context;
        synchronized (cbi.class) {
            context = a().b;
        }
        return context;
    }

    public static synchronized Context g() {
        Context context;
        synchronized (cbi.class) {
            context = a().c;
        }
        return context;
    }

    public static synchronized int h() {
        int intValue;
        synchronized (cbi.class) {
            cbi a2 = a();
            if (a2.f == null) {
                hxj hxj = hxj.a;
                a2.f = Integer.valueOf(hxz.j(a2.b));
            }
            intValue = a2.f.intValue();
        }
        return intValue;
    }

    public static jiq i() {
        return a().g;
    }

    public static synchronized cce j() {
        cce N;
        synchronized (cbi.class) {
            N = a().N();
        }
        return N;
    }

    public static synchronized bwn k() {
        bwn I2;
        synchronized (cbi.class) {
            I2 = a().I();
        }
        return I2;
    }

    public static synchronized bti l() {
        bti J2;
        synchronized (cbi.class) {
            J2 = a().J();
        }
        return J2;
    }

    public static synchronized bxr m() {
        bxr K;
        synchronized (cbi.class) {
            K = a().K();
        }
        return K;
    }

    public static synchronized bwg n() {
        bwg L;
        synchronized (cbi.class) {
            L = a().L();
        }
        return L;
    }

    public static synchronized civ o() {
        civ M;
        synchronized (cbi.class) {
            M = a().M();
        }
        return M;
    }

    public static synchronized cjd p() {
        cjd O;
        synchronized (cbi.class) {
            O = a().O();
        }
        return O;
    }

    public static synchronized cjo q() {
        cjo P;
        synchronized (cbi.class) {
            P = a().P();
        }
        return P;
    }

    public static synchronized cap r() {
        cap Q;
        synchronized (cbi.class) {
            Q = a().Q();
        }
        return Q;
    }

    public static synchronized cba s() {
        cba R;
        synchronized (cbi.class) {
            R = a().R();
        }
        return R;
    }

    public static synchronized ccg t() {
        ccg S;
        synchronized (cbi.class) {
            S = a().S();
        }
        return S;
    }

    public static synchronized bxo u() {
        bxo T;
        synchronized (cbi.class) {
            T = a().T();
        }
        return T;
    }

    public static synchronized chn v() {
        chn U;
        synchronized (cbi.class) {
            U = a().U();
        }
        return U;
    }

    public static synchronized cbl w() {
        cbl V;
        synchronized (cbi.class) {
            V = a().V();
        }
        return V;
    }

    public static synchronized bte x() {
        bte W;
        synchronized (cbi.class) {
            W = a().W();
        }
        return W;
    }

    public static synchronized bsx y() {
        bsx X;
        synchronized (cbi.class) {
            X = a().X();
        }
        return X;
    }

    public static synchronized cjz z() {
        cjz Y;
        synchronized (cbi.class) {
            Y = a().Y();
        }
        return Y;
    }

    /* access modifiers changed from: protected */
    public final bwn I() {
        if (this.i == null) {
            this.i = new bwn(this.b, false);
        }
        return this.i;
    }

    /* access modifiers changed from: protected */
    public final bti J() {
        if (this.F == null) {
            this.F = new bti(this.b);
        }
        return this.F;
    }

    /* access modifiers changed from: protected */
    public final bxr K() {
        if (this.j == null) {
            this.j = new bxr();
        }
        return this.j;
    }

    /* access modifiers changed from: protected */
    public final bwg L() {
        if (this.k == null) {
            this.k = new bwg(this.b);
        }
        return this.k;
    }

    /* access modifiers changed from: protected */
    public final civ M() {
        if (this.l == null) {
            this.l = new civ(this.b);
        }
        return this.l;
    }

    /* access modifiers changed from: protected */
    public final cce N() {
        if (this.h == null) {
            this.h = new cce(this.b);
        }
        return this.h;
    }

    /* access modifiers changed from: protected */
    public final cjd O() {
        jtn jtn;
        if (this.m == null) {
            this.m = new cjd();
            for (bsz a2 : X().a()) {
                cjd cjd = this.m;
                ContextManagerClientInfo a3 = a(a2, "Modules");
                for (int b2 : jtj.a) {
                    atjv b3 = jtj.b(b2);
                    if (cil.a(b3) == 0) {
                        jtm jtm = new jtm();
                        int i2 = b3.bA;
                        juu juu = new juu();
                        juu.a(2);
                        jtm.a(i2, juu.a());
                        jtn = jtm.a();
                    } else {
                        jtm jtm2 = new jtm();
                        jtm2.a(b3.bA);
                        jtm2.b(1);
                        jtn = jtm2.a();
                    }
                    ArrayList b4 = cjd.a.b((ContextDataFilterImpl) jtn, a3.a());
                    ArrayList arrayList = new ArrayList(b4.size());
                    int size = b4.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        arrayList.add(new cij((ContextData) b4.get(i3), false));
                    }
                    cjd.b.a(a3.a(), (List) arrayList);
                }
            }
            Q().a((cao) this.m, (but) I());
        }
        return this.m;
    }

    /* access modifiers changed from: protected */
    public final cjo P() {
        if (this.n == null) {
            cjo cjo = new cjo(M());
            this.n = cjo;
            cjo.a(8, 0, (bsz) null);
        }
        return this.n;
    }

    /* access modifiers changed from: protected */
    public final cap Q() {
        if (this.o == null) {
            this.o = new cap();
            if (awuz.o()) {
                cap cap = this.o;
                long a2 = i().a();
                for (bsz bsz : y().a()) {
                    juj a3 = q().a(bsz, 14);
                    if (a3 != null) {
                        try {
                            jye jye = (jye) aucj.a((aucj) jye.b, a3.c());
                            if (jye != null && !jir.a((Collection) jye.a)) {
                                aucx aucx = jye.a;
                                int size = aucx.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    atke atke = (atke) aucx.get(i2);
                                    atkd atkd = atke.h;
                                    if (atkd == null) {
                                        atkd = atkd.e;
                                    }
                                    cas cas = new cas(atke, new car(atkd, jhg.a, bsz));
                                    if (!cas.a(cas, a2)) {
                                        cap.b.a(cas);
                                    }
                                }
                            }
                        } catch (auda e2) {
                            anih anih = (anih) bxk.a.b();
                            anih.a((Throwable) e2);
                            ((anih) anih.a("cap", "b", 573, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[InterestManager] Could not deserialize proto.");
                        }
                    }
                }
            }
        }
        return this.o;
    }

    /* access modifiers changed from: protected */
    public final cba R() {
        int i2;
        if (this.p == null) {
            cba cba = new cba();
            this.p = cba;
            caz caz = cba.a;
            HashSet hashSet = new HashSet();
            aucx aucx = awup.a.a().c().a;
            int size = aucx.size();
            for (int i3 = 0; i3 < size; i3++) {
                atjv a2 = atjv.a(((atox) aucx.get(i3)).a);
                if (a2 == null) {
                    a2 = atjv.UNKNOWN_CONTEXT_NAME;
                }
                hashSet.add(Integer.valueOf(a2.bA));
            }
            Set set = caz.b;
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            HashSet hashSet4 = new HashSet();
            if (!cks.a(hashSet) || !cks.a(set)) {
                if (cks.a(hashSet)) {
                    hashSet3.addAll(set);
                } else if (cks.a(set)) {
                    hashSet2.addAll(hashSet);
                } else {
                    for (Object next : hashSet) {
                        if (set.contains(next)) {
                            hashSet4.add(next);
                        } else {
                            hashSet2.add(next);
                        }
                    }
                    for (Object next2 : set) {
                        if (!hashSet.contains(next2)) {
                            hashSet3.add(next2);
                        }
                    }
                }
            }
            cks cks = new cks(hashSet2, hashSet3);
            for (SparseArray sparseArray : caz.c.values()) {
                for (Integer intValue : cks.b) {
                    cay cay = (cay) sparseArray.get(intValue.intValue());
                    if (cay != null) {
                        cay.c = false;
                        if (cay.d != 3) {
                            cay.b(3);
                        }
                    }
                }
            }
            caz.b.removeAll(cks.b);
            caz.b.addAll(hashSet);
            cap r2 = r();
            for (bsz bsz : r2.a()) {
                for (Integer intValue2 : cks.a) {
                    int intValue3 = intValue2.intValue();
                    if (!((cax) r2.a.get(bsz)).a(intValue3)) {
                        i2 = 3;
                    } else {
                        i2 = 2;
                    }
                    caz.a(bsz, intValue3, i2);
                }
            }
            Q().a((cao) this.p, (but) I());
            P().a.add(11);
        }
        return this.p;
    }

    /* access modifiers changed from: protected */
    public final ccg S() {
        if (this.r == null) {
            ccg ccg = new ccg(this.b);
            this.r = ccg;
            ccg.a(cdm.b);
            this.r.a(cet.b);
            this.r.a(cfq.b);
            this.r.a(cev.b);
            this.r.a(ceq.b);
            this.r.a(cga.b);
            this.r.a(cen.b);
            this.r.a(cct.b);
            this.r.a(cej.b);
            this.r.a(cdu.b);
            this.r.a(cef.b);
            this.r.a(cfv.b);
            this.r.a(cfm.b);
            this.r.a(ced.b);
            this.r.a(ceb.b);
            this.r.a(ceh.b);
            this.r.a(cfj.b);
            this.r.a(cez.b);
            this.r.a(cfo.b);
            this.r.a(cft.b);
            this.r.a(cdz.k);
            this.r.a(cdg.L);
            this.r.a(cfx.b);
            if (!awuz.a.a().v()) {
                this.r.a(cgc.l);
                this.r.a(cex.b);
            }
            Q().a((cao) this.r, (but) I());
        }
        return this.r;
    }

    /* access modifiers changed from: protected */
    public final bxo T() {
        if (this.s == null) {
            this.s = new bxo();
            O().a((cja) this.s, (but) I());
            Q().a((cao) this.s, (but) I());
            bxo bxo = this.s;
            cap r2 = r();
            for (bsz bsz : r2.a()) {
                Collection<cas> a2 = r2.a(bsz);
                if (a2 != null && !a2.isEmpty()) {
                    bxm bxm = (bxm) bxo.a.get(bsz);
                    if (bxm == null) {
                        bxm = new bxm();
                        bxo.a.put(bsz, bxm);
                    }
                    for (cas a3 : a2) {
                        bxm.a(a3);
                    }
                }
            }
        }
        return this.s;
    }

    /* access modifiers changed from: protected */
    public final chn U() {
        if (this.t == null) {
            this.t = new chn(this.b);
            cjo P = P();
            P.b.a(this.t, I());
        }
        return this.t;
    }

    /* access modifiers changed from: protected */
    public final cbl V() {
        if (this.u == null) {
            this.u = new cbl(this.b);
        }
        return this.u;
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* access modifiers changed from: protected */
    public final bte W() {
        Set set;
        if (this.w == null) {
            if (this.v == null) {
                btg btg = new btg();
                this.v = btg;
                btg.a = x();
                Set<bsz> a2 = y().a();
                if (a2 != null && !a2.isEmpty()) {
                    for (bsz bsz : a2) {
                        cap r2 = r();
                        ContextManagerClientInfo a3 = a(bsz, "AclUpdateManager");
                        cax cax = (cax) r2.a.get(bsz);
                        if (cax != null) {
                            if (cax.d.d("AclUpdateManager")) {
                                set = cax.d.c((Object) "AclUpdateManager");
                            } else {
                                set = null;
                            }
                            if (set != null) {
                                r2.b((Collection) new ArrayList(set));
                            }
                        }
                        int[] iArr = jtj.a;
                        int length = iArr.length;
                        ? r9 = 0;
                        int i2 = 0;
                        while (i2 < length) {
                            int i3 = iArr[i2];
                            if (btg.a.a(a3, jtj.b(i3))) {
                                new Object[1][r9] = Integer.toString(i3);
                                caq caq = new caq(Integer.toString(i3), jtj.b(i3), cbb.c(), a3);
                                agvx agvx = awvb.t;
                                caq caq2 = caq;
                                long longValue = ((Long) agvx.c()).longValue();
                                aucd o2 = atkc.d.o();
                                if (o2.c) {
                                    o2.c();
                                    o2.c = r9;
                                }
                                atkc atkc = (atkc) o2.b;
                                atkc.b = 2;
                                int i4 = atkc.a | 1;
                                atkc.a = i4;
                                atkc.a = i4 | 2;
                                atkc.c = longValue;
                                caq caq3 = caq2;
                                caq3.a(new cai((atkc) o2.i(), agvx));
                                caq3.a(bvw.c(), (jwi) null);
                                r2.a(caq3.a());
                            }
                            i2++;
                            r9 = 0;
                        }
                    }
                }
            }
            this.w = new bte(this.v);
        }
        return this.w;
    }

    /* access modifiers changed from: protected */
    public final bsx X() {
        if (this.x == null) {
            this.x = new bsx(this.b);
        }
        return this.x;
    }

    /* access modifiers changed from: protected */
    public final cjz Y() {
        if (this.y == null) {
            Random random = new Random();
            this.y = new cjz();
            O().a((cja) this.y, (but) I());
            Q().a((cao) this.y, (but) I());
            ckb ckb = this.y.b;
            cap r2 = r();
            for (bsz bsz : r2.a()) {
                Collection<cas> a2 = r2.a(bsz);
                if (a2 != null && !a2.isEmpty()) {
                    ckc ckc = (ckc) ckb.a.get(bsz);
                    if (ckc == null) {
                        ckc = new ckc();
                        ckb.a.put(bsz, ckc);
                    }
                    for (cas a3 : a2) {
                        ckc.a(a3);
                    }
                }
            }
            bvk bvk = this.y.a;
            if (bvk != null) {
                bvk.b.b();
            }
            cjz cjz = this.y;
            double r3 = (double) awuz.r();
            double nextDouble = random.nextDouble();
            Double.isNaN(r3);
            cjz.a((long) (r3 * nextDouble));
            this.y.b(awuz.r());
            cjz cjz2 = this.y;
            double s2 = (double) awuz.s();
            double nextDouble2 = random.nextDouble();
            Double.isNaN(s2);
            cjz2.c((long) (s2 * nextDouble2));
            this.y.d((long) new Random().nextInt((int) awuz.d()));
        }
        return this.y;
    }

    /* access modifiers changed from: protected */
    public final ckr Z() {
        if (this.z == null) {
            this.z = new ckr();
        }
        return this.z;
    }

    /* access modifiers changed from: protected */
    public final btw aa() {
        if (this.A == null) {
            btw btw = new btw(this.b);
            this.A = btw;
            IntentFilter intentFilter = new IntentFilter("com.google.android.gms.location.reporting.SETTINGS_CHANGED");
            intentFilter.addAction("com.google.android.gms.udc.action.SETTING_CHANGED");
            btw.a.registerReceiver(btw.b, intentFilter);
            for (bsz btt : y().a()) {
                k().a(new btt(btw, btt), bvq.a("ulrUdcConsentChangeIntent"));
            }
        }
        return this.A;
    }

    /* access modifiers changed from: protected */
    public final clj ab() {
        if (this.B == null) {
            clj clj = new clj();
            this.B = clj;
            clj.a();
        }
        return this.B;
    }

    /* access modifiers changed from: protected */
    public final byd ac() {
        if (this.D == null) {
            this.D = new byd(this.b);
        }
        return this.D;
    }

    /* access modifiers changed from: protected */
    public final buc ad() {
        if (this.E == null) {
            this.E = new buc();
            Q().a((cao) this.E, (but) I());
            O().a((cja) this.E, (but) I());
        }
        return this.E;
    }

    /* access modifiers changed from: protected */
    public final btx ae() {
        if (this.G == null) {
            this.G = new btx();
        }
        return this.G;
    }

    /* access modifiers changed from: protected */
    public final void ah() {
        if (this.C == null) {
            this.C = new btq();
        }
    }

    /* access modifiers changed from: protected */
    public final void b(Context context) {
        this.c = context;
        try {
            ModuleManager.ModuleInfo currentModule = ModuleManager.get(context).getCurrentModule();
            this.d = currentModule.moduleId;
            this.e = currentModule.moduleVersion;
        } catch (IllegalStateException e2) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("cbi", "b", 427, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[Modules] Chimera context was not passed in.");
        }
    }

    public static ContextManagerClientInfo a(bsz bsz, String str) {
        return new ContextManagerClientInfo(bsz.b, "com.google.android.gms", jhg.a, str, h(), 0, Process.myPid());
    }

    public static synchronized void a(Context context) {
        synchronized (cbi.class) {
            cbi a2 = a();
            a2.c = context;
            try {
                ModuleManager.ModuleInfo currentModule = ModuleManager.get(context).getCurrentModule();
                a2.d = currentModule.moduleId;
                a2.e = currentModule.moduleVersion;
            } catch (IllegalStateException e2) {
                anih anih = (anih) bxk.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("cbi", "b", 427, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[Modules] Chimera context was not passed in.");
            }
        }
    }

    public static synchronized void a(nix nix) {
        synchronized (cbi.class) {
            a = nix;
            bsx y2 = y();
            for (bsz bsz : y2.a()) {
                if (!bsz.b() && !y2.b(bsz)) {
                    String valueOf = String.valueOf(bsz.b);
                    if (valueOf.length() == 0) {
                        new String("Removing account: ");
                    } else {
                        "Removing account: ".concat(valueOf);
                    }
                    new bwq(bsz).a(bvq.a("ContextManagerInitializer_remove_deleted_accounts"));
                }
            }
        }
    }
}
