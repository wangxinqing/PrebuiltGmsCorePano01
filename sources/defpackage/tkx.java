package defpackage;

import android.os.SystemClock;
import com.google.android.gms.nearby.connection.Strategy;
import java.util.List;

/* renamed from: tkx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tkx {
    public final String a;
    private final tgj b;
    private final ou c = new ou();
    private final ou d = new ou();
    private final ou e = new ou();
    private final ou f = new ou();
    private asko g;
    private long h = 0;
    private long i = 0;
    private Strategy j;
    private boolean k = false;
    private final aucd l;
    private aucd m;
    private aucd n;

    public tkx(tgj tgj, String str, String str2) {
        this.b = tgj;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + str2.length());
            sb.append("0p:");
            sb.append(str);
            sb.append(".");
            sb.append(str2);
            str = sb.toString();
        }
        this.a = str;
        jjg jjg = tky.a;
        aucd o = askg.d.o();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (o.c) {
            o.c();
            o.c = false;
        }
        askg askg = (askg) o.b;
        askg.a |= 1;
        askg.b = elapsedRealtime;
        this.l = o;
        if (h("constructor")) {
            c(this.a, 3);
        }
    }

    private static int a(int i2) {
        int i3 = i2 - 1;
        asoj asoj = asoj.UNKNOWN_SESSION_ROLE;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 1) {
            return 2;
        } else {
            if (i3 != 2) {
                return i3 != 3 ? 1 : 4;
            }
            return 3;
        }
    }

    private final void b(String str, int i2) {
        if (this.d.containsKey(str)) {
            aucd aucd = (aucd) this.d.get(str);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aski aski = (aski) aucd.b;
            aski aski2 = aski.f;
            aski.e = i2 - 1;
            aski.a |= 8;
            if (b(aucd)) {
                this.d.remove(str);
            }
        } else if (this.c.containsKey(str)) {
            aucd aucd2 = (aucd) this.c.get(str);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aski aski3 = (aski) aucd2.b;
            aski aski4 = aski.f;
            aski3.e = i2 - 1;
            aski3.a |= 8;
            if (a(aucd2)) {
                this.c.remove(str);
            }
        }
    }

    private final void c(String str, int i2) {
        tgj tgj = this.b;
        aucd o = askq.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        askq askq = (askq) o.b;
        askq.b = i2 - 1;
        askq.a |= 1;
        tgj.a(str, (askq) o.i());
    }

    private final void d() {
        aucd aucd = this.m;
        if (aucd == null) {
            ((anih) ((anih) tky.a.d()).a("tkx", "d", 198, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to record advertising phase duration due to null currentAdvertisingPhase");
        } else if ((((aske) aucd.b).a & 1) == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.h;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aske aske = (aske) aucd.b;
            aske aske2 = aske.e;
            aske.a |= 1;
            aske.b = elapsedRealtime;
        }
    }

    private final void e() {
        aucd aucd = this.n;
        if (aucd == null) {
            ((anih) ((anih) tky.a.d()).a("tkx", "e", 228, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to record discovery phase duration due to null currentDiscoveryPhase");
        } else if ((((askk) aucd.b).a & 1) == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.i;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            askk askk = (askk) aucd.b;
            askk askk2 = askk.f;
            askk.a |= 1;
            askk.b = elapsedRealtime;
        }
    }

    private final void f() {
        if (this.m != null) {
            int i2 = 0;
            while (true) {
                ou ouVar = this.c;
                if (i2 >= ouVar.h) {
                    break;
                }
                aucd aucd = (aucd) ouVar.c(i2);
                d(aucd);
                a(aucd);
                i2++;
            }
            d();
            asko asko = this.g;
            aucd aucd2 = this.m;
            if (asko.c) {
                asko.c();
                asko.c = false;
            }
            askp askp = (askp) asko.b;
            aske aske = (aske) aucd2.i();
            auct auct = askp.e;
            aske.getClass();
            if (!askp.g.a()) {
                askp.g = aucj.a(askp.g);
            }
            askp.g.add(aske);
            this.m = null;
        }
        this.c.clear();
    }

    private final void g() {
        if (this.n != null) {
            int i2 = 0;
            while (true) {
                ou ouVar = this.d;
                if (i2 >= ouVar.h) {
                    break;
                }
                aucd aucd = (aucd) ouVar.c(i2);
                d(aucd);
                b(aucd);
                i2++;
            }
            e();
            asko asko = this.g;
            aucd aucd2 = this.n;
            if (asko.c) {
                asko.c();
                asko.c = false;
            }
            askp askp = (askp) asko.b;
            askk askk = (askk) aucd2.i();
            auct auct = askp.e;
            askk.getClass();
            if (!askp.f.a()) {
                askp.f = aucj.a(askp.f);
            }
            askp.f.add(askk);
            this.n = null;
        }
        this.d.clear();
    }

    private final void h() {
        ou ouVar;
        ou ouVar2;
        if (this.g != null) {
            f();
            g();
            int i2 = 0;
            while (true) {
                ouVar = this.e;
                if (i2 >= ouVar.h) {
                    break;
                }
                tkv tkv = (tkv) ouVar.c(i2);
                int i3 = 0;
                while (true) {
                    ou ouVar3 = tkv.a;
                    if (i3 >= ouVar3.h) {
                        break;
                    }
                    aucd aucd = (aucd) ouVar3.c(i3);
                    if ((((askl) aucd.b).a & 4) == 0) {
                        tkv.a(aucd, 7);
                    }
                    i3++;
                }
                tkv.d = null;
                this.g.a((Iterable) tkv.a());
                i2++;
            }
            ouVar.clear();
            int i4 = 0;
            while (true) {
                ouVar2 = this.f;
                if (i4 >= ouVar2.h) {
                    break;
                }
                a((aucd) ouVar2.c(i4), asnt.UNFINISHED_ERROR, 8);
                i4++;
            }
            ouVar2.clear();
            asko asko = this.g;
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((askp) this.g.b).b;
            if (asko.c) {
                asko.c();
                asko.c = false;
            }
            askp askp = (askp) asko.b;
            auct auct = askp.e;
            askp.a |= 1;
            askp.b = elapsedRealtime;
            aucd aucd2 = this.l;
            asko asko2 = this.g;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            askg askg = (askg) aucd2.b;
            askp askp2 = (askp) asko2.i();
            askg askg2 = askg.d;
            askp2.getClass();
            if (!askg.c.a()) {
                askg.c = aucj.a(askg.c);
            }
            askg.c.add(askp2);
            this.g = null;
            this.j = null;
            c(this.a, 6);
        }
    }

    private final void a(aucd aucd, asnt asnt, int i2) {
        if (this.g == null) {
            ((anih) ((anih) tky.a.d()).a("tkx", "a", 688, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to record upgrade attempt due to null strategySession");
            return;
        }
        if (i2 != 0) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            askf askf = (askf) aucd.b;
            askf askf2 = askf.h;
            askf.g = i2 - 1;
            askf.a |= 32;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - ((askf) aucd.b).c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        askf askf3 = (askf) aucd.b;
        askf askf4 = askf.h;
        int i3 = askf3.a | 2;
        askf3.a = i3;
        askf3.c = elapsedRealtime;
        askf3.f = asnt.j;
        askf3.a = i3 | 16;
        asko asko = this.g;
        if (asko.c) {
            asko.c();
            asko.c = false;
        }
        askp askp = (askp) asko.b;
        askf askf5 = (askf) aucd.i();
        auct auct = askp.e;
        askf5.getClass();
        if (!askp.j.a()) {
            askp.j = aucj.a(askp.j);
        }
        askp.j.add(askf5);
    }

    private static final boolean c(aucd aucd) {
        int i2 = ((aski) aucd.b).a;
        return ((i2 & 4) == 0 || (i2 & 8) == 0) ? false : true;
    }

    private static void d(aucd aucd) {
        if ((((aski) aucd.b).a & 4) == 0) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aski aski = (aski) aucd.b;
            aski aski2 = aski.f;
            aski.d = 3;
            aski.a |= 4;
        }
        if ((((aski) aucd.b).a & 8) == 0) {
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aski aski3 = (aski) aucd.b;
            aski aski4 = aski.f;
            aski3.e = 3;
            aski3.a |= 8;
        }
    }

    private static void e(aucd aucd) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - ((aski) aucd.b).b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aski aski = (aski) aucd.b;
        aski aski2 = aski.f;
        aski.a |= 1;
        aski.b = elapsedRealtime;
    }

    public final synchronized void c() {
        if (h("logSession")) {
            h();
            aucd aucd = this.l;
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((askg) this.l.b).b;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            askg askg = (askg) aucd.b;
            askg askg2 = askg.d;
            askg.a |= 1;
            askg.b = elapsedRealtime;
            String str = this.a;
            askg askg3 = (askg) this.l.i();
            tgj tgj = this.b;
            aucd o = askq.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            askq askq = (askq) o.b;
            askq.b = 1;
            int i2 = askq.a | 1;
            askq.a = i2;
            askg3.getClass();
            askq.c = askg3;
            askq.a = i2 | 2;
            askq askq2 = (askq) o.i();
            if (askg3.b <= 5356800000L) {
                tgj.a(str, askq2);
            } else {
                jjg jjg = tgb.a;
            }
            c(this.a, 4);
            this.k = true;
        }
    }

    public final synchronized void e(String str) {
        if (h("onRemoteEndpointRejected")) {
            b(str, 3);
        }
    }

    private final boolean b(aucd aucd) {
        int a2;
        if (this.n == null) {
            ((anih) ((anih) tky.a.d()).a("tkx", "b", 430, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to record discoverer connection request due to null currentDiscoveryPhase");
            return false;
        } else if (!c(aucd) && ((a2 = asny.a(((aski) aucd.b).d)) == 0 || a2 != 5)) {
            return false;
        } else {
            aucd aucd2 = this.n;
            e(aucd);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            askk askk = (askk) aucd2.b;
            aski aski = (aski) aucd.i();
            askk askk2 = askk.f;
            aski.getClass();
            if (!askk.e.a()) {
                askk.e = aucj.a(askk.e);
            }
            askk.e.add(aski);
            return true;
        }
    }

    public final synchronized void f(String str) {
        if (h("onLocalEndpointRejected")) {
            a(str, 3);
        }
    }

    public final synchronized void g(String str) {
        if (h("onBandwidthUpgradeSuccess") && this.f.containsKey(str)) {
            a((aucd) this.f.remove(str), asnt.UPGRADE_RESULT_SUCCESS, 9);
        }
    }

    private final void a(Strategy strategy, asoj asoj) {
        int i2 = 1;
        if (!strategy.equals(this.j)) {
            this.j = strategy;
            h();
            c(this.a, 5);
            asko asko = (asko) askp.k.o();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (asko.c) {
                asko.c();
                asko.c = false;
            }
            askp askp = (askp) asko.b;
            askp.a |= 1;
            askp.b = elapsedRealtime;
            if (Strategy.a.equals(strategy)) {
                i2 = 4;
            } else if (Strategy.b.equals(strategy)) {
                i2 = 5;
            } else if (Strategy.c.equals(strategy)) {
                i2 = 6;
            }
            if (asko.c) {
                asko.c();
                asko.c = false;
            }
            askp askp2 = (askp) asko.b;
            askp2.c = i2 - 1;
            askp2.a = 2 | askp2.a;
            asko.a(asoj);
            this.g = asko;
        } else if (new aucu(((askp) this.g.b).d, askp.e).contains(asoj)) {
            asoj asoj2 = asoj.UNKNOWN_SESSION_ROLE;
            int ordinal = asoj.ordinal();
            if (ordinal == 1) {
                f();
            } else if (ordinal == 2) {
                g();
            }
        } else {
            this.g.a(asoj);
        }
    }

    public final synchronized void d(String str) {
        if (h("onLocalEndpointAccepted")) {
            a(str, 2);
        }
    }

    private final boolean h(String str) {
        if (!this.k) {
            return true;
        }
        ((anih) ((anih) tky.a.d()).a("tkx", "h", 741, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unexpected call to %s after session has already been logged", (Object) str);
        return false;
    }

    public final synchronized void b() {
        if (h("onStopDiscovery")) {
            e();
        }
    }

    public final synchronized void c(String str) {
        if (h("onRemoteEndpointAccepted")) {
            b(str, 2);
        }
    }

    public final synchronized void b(Strategy strategy, List list) {
        if (h("onStartDiscovery")) {
            a(strategy, asoj.DISCOVERER);
            this.i = SystemClock.elapsedRealtime();
            aucd o = askk.f.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            askk askk = (askk) o.b;
            if (!askk.c.a()) {
                askk.c = aucj.a(askk.c);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                askk.c.d(((asoe) list.get(i2)).k);
            }
            this.n = o;
        }
    }

    public final synchronized void b(String str) {
        if (h("onConnectionRequestReceived")) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ou ouVar = this.c;
            aucd o = aski.f.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aski aski = (aski) o.b;
            int i2 = aski.a | 1;
            aski.a = i2;
            aski.b = elapsedRealtime;
            long j2 = this.h;
            aski.a = i2 | 2;
            aski.c = elapsedRealtime - j2;
            ouVar.put(str, o);
        }
    }

    private final void a(String str, int i2) {
        if (this.d.containsKey(str)) {
            aucd aucd = (aucd) this.d.get(str);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            aski aski = (aski) aucd.b;
            aski aski2 = aski.f;
            aski.d = i2 - 1;
            aski.a |= 4;
            if (b(aucd)) {
                this.d.remove(str);
            }
        } else if (this.c.containsKey(str)) {
            aucd aucd2 = (aucd) this.c.get(str);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aski aski3 = (aski) aucd2.b;
            aski aski4 = aski.f;
            aski3.d = i2 - 1;
            aski3.a |= 4;
            if (a(aucd2)) {
                this.c.remove(str);
            }
        }
    }

    public final synchronized void b(String str, long j2, long j3) {
        if (h("onPayloadChunkReceived") && this.e.containsKey(str)) {
            tkv tkv = (tkv) this.e.get(str);
            ou ouVar = tkv.c;
            Long valueOf = Long.valueOf(j2);
            if (ouVar.containsKey(valueOf)) {
                ((tkw) tkv.c.get(valueOf)).a(j3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(java.lang.String r3, long r4, defpackage.asog r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "onIncomingPayloadDone"
            boolean r0 = r2.h(r0)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0095
            ou r0 = r2.e     // Catch:{ all -> 0x0097 }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0095
            ou r0 = r2.e     // Catch:{ all -> 0x0097 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0097 }
            tkv r3 = (defpackage.tkv) r3     // Catch:{ all -> 0x0097 }
            ou r0 = r3.c     // Catch:{ all -> 0x0097 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0097 }
            boolean r5 = r0.containsKey(r4)     // Catch:{ all -> 0x0097 }
            if (r5 == 0) goto L_0x0095
            asoe r5 = r3.d     // Catch:{ all -> 0x0097 }
            if (r5 == 0) goto L_0x007a
            ou r0 = r3.a     // Catch:{ all -> 0x0097 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0097 }
            aucd r5 = (defpackage.aucd) r5     // Catch:{ all -> 0x0097 }
            ou r3 = r3.c     // Catch:{ all -> 0x0097 }
            java.lang.Object r3 = r3.remove(r4)     // Catch:{ all -> 0x0097 }
            tkw r3 = (defpackage.tkw) r3     // Catch:{ all -> 0x0097 }
            aucd r3 = r3.a()     // Catch:{ all -> 0x0097 }
            boolean r4 = r3.c     // Catch:{ all -> 0x0097 }
            r0 = 0
            if (r4 == 0) goto L_0x0047
            r3.c()     // Catch:{ all -> 0x0097 }
            r3.c = r0     // Catch:{ all -> 0x0097 }
        L_0x0047:
            aucj r4 = r3.b     // Catch:{ all -> 0x0097 }
            askm r4 = (defpackage.askm) r4     // Catch:{ all -> 0x0097 }
            askm r1 = defpackage.askm.h     // Catch:{ all -> 0x0097 }
            int r6 = r6.j     // Catch:{ all -> 0x0097 }
            r4.g = r6     // Catch:{ all -> 0x0097 }
            int r6 = r4.a     // Catch:{ all -> 0x0097 }
            r6 = r6 | 32
            r4.a = r6     // Catch:{ all -> 0x0097 }
            boolean r4 = r5.c     // Catch:{ all -> 0x0097 }
            if (r4 != 0) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            r5.c()     // Catch:{ all -> 0x0097 }
            r5.c = r0     // Catch:{ all -> 0x0097 }
        L_0x0061:
            aucj r4 = r5.b     // Catch:{ all -> 0x0097 }
            askl r4 = (defpackage.askl) r4     // Catch:{ all -> 0x0097 }
            aucj r3 = r3.i()     // Catch:{ all -> 0x0097 }
            askm r3 = (defpackage.askm) r3     // Catch:{ all -> 0x0097 }
            askl r5 = defpackage.askl.g     // Catch:{ all -> 0x0097 }
            r3.getClass()     // Catch:{ all -> 0x0097 }
            r4.b()     // Catch:{ all -> 0x0097 }
            aucx r4 = r4.e     // Catch:{ all -> 0x0097 }
            r4.add(r3)     // Catch:{ all -> 0x0097 }
            monitor-exit(r2)
            return
        L_0x007a:
            jjg r3 = defpackage.tky.a     // Catch:{ all -> 0x0097 }
            anie r3 = r3.c()     // Catch:{ all -> 0x0097 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0097 }
            java.lang.String r4 = "tkv"
            java.lang.String r5 = "b"
            r6 = 927(0x39f, float:1.299E-42)
            java.lang.String r0 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r3 = r3.a((java.lang.String) r4, (java.lang.String) r5, (int) r6, (java.lang.String) r0)     // Catch:{ all -> 0x0097 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0097 }
            java.lang.String r4 = "Unexpected call to incomingPayloadDone() while NearbyRecorder has no active current medium."
            r3.a((java.lang.String) r4)     // Catch:{ all -> 0x0097 }
        L_0x0095:
            monitor-exit(r2)
            return
        L_0x0097:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkx.b(java.lang.String, long, asog):void");
    }

    private final boolean a(aucd aucd) {
        if (this.m == null) {
            ((anih) ((anih) tky.a.d()).a("tkx", "a", 416, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to record advertiser connection request due to null currentAdvertisingPhase");
            return false;
        } else if (!c(aucd)) {
            return false;
        } else {
            aucd aucd2 = this.m;
            e(aucd);
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aske aske = (aske) aucd2.b;
            aski aski = (aski) aucd.i();
            aske aske2 = aske.e;
            aski.getClass();
            if (!aske.d.a()) {
                aske.d = aucj.a(aske.d);
            }
            aske.d.add(aski);
            return true;
        }
    }

    public final synchronized void a() {
        if (h("onStopAdvertising")) {
            d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(java.lang.String r3, defpackage.asoe r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "onConnectionEstablished"
            boolean r0 = r2.h(r0)     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0028
            ou r0 = r2.e     // Catch:{ all -> 0x002a }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x001e
            ou r0 = r2.e     // Catch:{ all -> 0x002a }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x002a }
            tkv r3 = (defpackage.tkv) r3     // Catch:{ all -> 0x002a }
            r3.a(r4)     // Catch:{ all -> 0x002a }
            monitor-exit(r2)
            return
        L_0x001e:
            ou r0 = r2.e     // Catch:{ all -> 0x002a }
            tkv r1 = new tkv     // Catch:{ all -> 0x002a }
            r1.<init>(r4)     // Catch:{ all -> 0x002a }
            r0.put(r3, r1)     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r2)
            return
        L_0x002a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkx.b(java.lang.String, asoe):void");
    }

    public final synchronized void a(int i2, asoe asoe, int i3, long j2) {
        if (h("onIncomingConnectionAttempt")) {
            asko asko = this.g;
            if (asko == null) {
                ((anih) ((anih) tky.a.d()).a("tkx", "a", 458, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to record incoming connection attempt due to null strategySession");
                return;
            }
            aucd o = askh.g.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            askh askh = (askh) o.b;
            int i4 = askh.a | 1;
            askh.a = i4;
            askh.b = j2;
            int i5 = i2 - 1;
            if (i2 != 0) {
                askh.c = i5;
                int i6 = i4 | 2;
                askh.a = i6;
                askh.d = 1;
                int i7 = i6 | 4;
                askh.a = i7;
                askh.e = asoe.k;
                int i8 = i7 | 8;
                askh.a = i8;
                int i9 = i3 - 1;
                if (i3 != 0) {
                    askh.f = i9;
                    askh.a = i8 | 16;
                    asko.a(o);
                    return;
                }
                throw null;
            }
            throw null;
        }
    }

    public final synchronized void a(Strategy strategy, List list) {
        if (h("onStartAdvertising")) {
            a(strategy, asoj.ADVERTISER);
            this.h = SystemClock.elapsedRealtime();
            aucd o = aske.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aske aske = (aske) o.b;
            if (!aske.c.a()) {
                aske.c = aucj.a(aske.c);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                aske.c.d(((asoe) list.get(i2)).k);
            }
            this.m = o;
        }
    }

    public final synchronized void a(String str) {
        if (h("onConnectionRequestSent")) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ou ouVar = this.d;
            aucd o = aski.f.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aski aski = (aski) o.b;
            int i2 = aski.a | 1;
            aski.a = i2;
            aski.b = elapsedRealtime;
            long j2 = this.i;
            aski.a = i2 | 2;
            aski.c = elapsedRealtime - j2;
            ouVar.put(str, o);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r7, int r8, defpackage.asoe r9, int r10, long r11) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "onOutgoingConnectionAttempt"
            boolean r0 = r6.h(r0)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x00a3
            asko r0 = r6.g     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x002a
            jjg r7 = defpackage.tky.a     // Catch:{ all -> 0x00a7 }
            anie r7 = r7.d()     // Catch:{ all -> 0x00a7 }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x00a7 }
            java.lang.String r8 = "tkx"
            java.lang.String r9 = "a"
            r10 = 482(0x1e2, float:6.75E-43)
            java.lang.String r11 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r7 = r7.a((java.lang.String) r8, (java.lang.String) r9, (int) r10, (java.lang.String) r11)     // Catch:{ all -> 0x00a7 }
            anih r7 = (defpackage.anih) r7     // Catch:{ all -> 0x00a7 }
            java.lang.String r8 = "Unable to record outgoing connection attempt due to null strategySession"
            r7.a((java.lang.String) r8)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r6)
            return
        L_0x002a:
            askh r1 = defpackage.askh.g     // Catch:{ all -> 0x00a7 }
            aucd r1 = r1.o()     // Catch:{ all -> 0x00a7 }
            boolean r2 = r1.c     // Catch:{ all -> 0x00a7 }
            r3 = 0
            if (r2 != 0) goto L_0x0036
            goto L_0x003b
        L_0x0036:
            r1.c()     // Catch:{ all -> 0x00a7 }
            r1.c = r3     // Catch:{ all -> 0x00a7 }
        L_0x003b:
            aucj r2 = r1.b     // Catch:{ all -> 0x00a7 }
            askh r2 = (defpackage.askh) r2     // Catch:{ all -> 0x00a7 }
            int r4 = r2.a     // Catch:{ all -> 0x00a7 }
            r4 = r4 | 1
            r2.a = r4     // Catch:{ all -> 0x00a7 }
            r2.b = r11     // Catch:{ all -> 0x00a7 }
            int r11 = r8 + -1
            r12 = 0
            if (r8 == 0) goto L_0x00a6
            r2.c = r11     // Catch:{ all -> 0x00a7 }
            r11 = 2
            r4 = r4 | r11
            r2.a = r4     // Catch:{ all -> 0x00a7 }
            r2.d = r11     // Catch:{ all -> 0x00a7 }
            r5 = 4
            r4 = r4 | r5
            r2.a = r4     // Catch:{ all -> 0x00a7 }
            int r9 = r9.k     // Catch:{ all -> 0x00a7 }
            r2.e = r9     // Catch:{ all -> 0x00a7 }
            r9 = r4 | 8
            r2.a = r9     // Catch:{ all -> 0x00a7 }
            int r4 = r10 + -1
            if (r10 == 0) goto L_0x00a5
            r2.f = r4     // Catch:{ all -> 0x00a7 }
            r9 = r9 | 16
            r2.a = r9     // Catch:{ all -> 0x00a7 }
            r0.a((defpackage.aucd) r1)     // Catch:{ all -> 0x00a7 }
            if (r8 != r11) goto L_0x00a3
            if (r10 == r11) goto L_0x00a3
            ou r8 = r6.d     // Catch:{ all -> 0x00a7 }
            boolean r8 = r8.containsKey(r7)     // Catch:{ all -> 0x00a7 }
            if (r8 == 0) goto L_0x00a3
            ou r8 = r6.d     // Catch:{ all -> 0x00a7 }
            java.lang.Object r7 = r8.remove(r7)     // Catch:{ all -> 0x00a7 }
            aucd r7 = (defpackage.aucd) r7     // Catch:{ all -> 0x00a7 }
            boolean r8 = r7.c     // Catch:{ all -> 0x00a7 }
            if (r8 != 0) goto L_0x0086
            goto L_0x008b
        L_0x0086:
            r7.c()     // Catch:{ all -> 0x00a7 }
            r7.c = r3     // Catch:{ all -> 0x00a7 }
        L_0x008b:
            aucj r8 = r7.b     // Catch:{ all -> 0x00a7 }
            aski r8 = (defpackage.aski) r8     // Catch:{ all -> 0x00a7 }
            aski r9 = defpackage.aski.f     // Catch:{ all -> 0x00a7 }
            r8.d = r5     // Catch:{ all -> 0x00a7 }
            int r9 = r8.a     // Catch:{ all -> 0x00a7 }
            r9 = r9 | r5
            r8.a = r9     // Catch:{ all -> 0x00a7 }
            r8.e = r5     // Catch:{ all -> 0x00a7 }
            r9 = r9 | 8
            r8.a = r9     // Catch:{ all -> 0x00a7 }
            r6.b((defpackage.aucd) r7)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r6)
            return
        L_0x00a3:
            monitor-exit(r6)
            return
        L_0x00a5:
            throw r12     // Catch:{ all -> 0x00a7 }
        L_0x00a6:
            throw r12     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkx.a(java.lang.String, int, asoe, int, long):void");
    }

    public final synchronized void a(String str, long j2, int i2, long j3) {
        if (h("onIncomingPayloadStarted") && this.e.containsKey(str)) {
            ((tkv) this.e.get(str)).c.put(Long.valueOf(j2), new tkw(a(i2), j3));
        }
    }

    public final synchronized void a(String str, long j2, long j3) {
        if (h("onPayloadChunkSent") && this.e.containsKey(str)) {
            tkv tkv = (tkv) this.e.get(str);
            ou ouVar = tkv.b;
            Long valueOf = Long.valueOf(j2);
            if (ouVar.containsKey(valueOf)) {
                ((tkw) tkv.b.get(valueOf)).a(j3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r3, long r4, defpackage.asog r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "onOutgoingPayloadDone"
            boolean r0 = r2.h(r0)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0095
            ou r0 = r2.e     // Catch:{ all -> 0x0097 }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0095
            ou r0 = r2.e     // Catch:{ all -> 0x0097 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0097 }
            tkv r3 = (defpackage.tkv) r3     // Catch:{ all -> 0x0097 }
            ou r0 = r3.b     // Catch:{ all -> 0x0097 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0097 }
            boolean r5 = r0.containsKey(r4)     // Catch:{ all -> 0x0097 }
            if (r5 == 0) goto L_0x0095
            asoe r5 = r3.d     // Catch:{ all -> 0x0097 }
            if (r5 == 0) goto L_0x007a
            ou r0 = r3.a     // Catch:{ all -> 0x0097 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0097 }
            aucd r5 = (defpackage.aucd) r5     // Catch:{ all -> 0x0097 }
            ou r3 = r3.b     // Catch:{ all -> 0x0097 }
            java.lang.Object r3 = r3.remove(r4)     // Catch:{ all -> 0x0097 }
            tkw r3 = (defpackage.tkw) r3     // Catch:{ all -> 0x0097 }
            aucd r3 = r3.a()     // Catch:{ all -> 0x0097 }
            boolean r4 = r3.c     // Catch:{ all -> 0x0097 }
            r0 = 0
            if (r4 == 0) goto L_0x0047
            r3.c()     // Catch:{ all -> 0x0097 }
            r3.c = r0     // Catch:{ all -> 0x0097 }
        L_0x0047:
            aucj r4 = r3.b     // Catch:{ all -> 0x0097 }
            askm r4 = (defpackage.askm) r4     // Catch:{ all -> 0x0097 }
            askm r1 = defpackage.askm.h     // Catch:{ all -> 0x0097 }
            int r6 = r6.j     // Catch:{ all -> 0x0097 }
            r4.g = r6     // Catch:{ all -> 0x0097 }
            int r6 = r4.a     // Catch:{ all -> 0x0097 }
            r6 = r6 | 32
            r4.a = r6     // Catch:{ all -> 0x0097 }
            boolean r4 = r5.c     // Catch:{ all -> 0x0097 }
            if (r4 != 0) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            r5.c()     // Catch:{ all -> 0x0097 }
            r5.c = r0     // Catch:{ all -> 0x0097 }
        L_0x0061:
            aucj r4 = r5.b     // Catch:{ all -> 0x0097 }
            askl r4 = (defpackage.askl) r4     // Catch:{ all -> 0x0097 }
            aucj r3 = r3.i()     // Catch:{ all -> 0x0097 }
            askm r3 = (defpackage.askm) r3     // Catch:{ all -> 0x0097 }
            askl r5 = defpackage.askl.g     // Catch:{ all -> 0x0097 }
            r3.getClass()     // Catch:{ all -> 0x0097 }
            r4.a()     // Catch:{ all -> 0x0097 }
            aucx r4 = r4.d     // Catch:{ all -> 0x0097 }
            r4.add(r3)     // Catch:{ all -> 0x0097 }
            monitor-exit(r2)
            return
        L_0x007a:
            jjg r3 = defpackage.tky.a     // Catch:{ all -> 0x0097 }
            anie r3 = r3.c()     // Catch:{ all -> 0x0097 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0097 }
            java.lang.String r4 = "tkv"
            java.lang.String r5 = "a"
            r6 = 900(0x384, float:1.261E-42)
            java.lang.String r0 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r3 = r3.a((java.lang.String) r4, (java.lang.String) r5, (int) r6, (java.lang.String) r0)     // Catch:{ all -> 0x0097 }
            anih r3 = (defpackage.anih) r3     // Catch:{ all -> 0x0097 }
            java.lang.String r4 = "Unexpected call to outgoingPayloadDone() while NearbyRecorder has no active current medium."
            r3.a((java.lang.String) r4)     // Catch:{ all -> 0x0097 }
        L_0x0095:
            monitor-exit(r2)
            return
        L_0x0097:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkx.a(java.lang.String, long, asog):void");
    }

    public final synchronized void a(String str, asnt asnt, int i2) {
        if (h("onBandwidthUpgradeError") && this.f.containsKey(str)) {
            a((aucd) this.f.remove(str), asnt, i2);
        }
    }

    public final synchronized void a(String str, asoe asoe) {
        if (h("onEndpointFound")) {
            aucd aucd = this.n;
            if (aucd == null) {
                ((anih) ((anih) tky.a.d()).a("tkx", "a", 316, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to record discovered endpoint due to null currentDiscoveryPhase");
                return;
            }
            aucd o = askj.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            askj askj = (askj) o.b;
            askj.b = asoe.k;
            askj.a |= 1;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.i;
            if (o.c) {
                o.c();
                o.c = false;
            }
            askj askj2 = (askj) o.b;
            askj2.a |= 2;
            askj2.c = elapsedRealtime;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            askk askk = (askk) aucd.b;
            askj askj3 = (askj) o.i();
            askk askk2 = askk.f;
            askj3.getClass();
            if (!askk.d.a()) {
                askk.d = aucj.a(askk.d);
            }
            askk.d.add(askj3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ea, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ec, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r9, defpackage.asoe r10, int r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "onConnectionClosed"
            boolean r0 = r8.h(r0)     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x00eb
            ou r0 = r8.e     // Catch:{ all -> 0x00ed }
            boolean r0 = r0.containsKey(r9)     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x00eb
            ou r0 = r8.e     // Catch:{ all -> 0x00ed }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x00ed }
            tkv r0 = (defpackage.tkv) r0     // Catch:{ all -> 0x00ed }
            asoe r1 = r0.d     // Catch:{ all -> 0x00ed }
            java.lang.String r2 = "tkv"
            java.lang.String r3 = "a"
            java.lang.String r4 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            if (r1 != 0) goto L_0x003d
            jjg r1 = defpackage.tky.a     // Catch:{ all -> 0x00ed }
            anie r1 = r1.c()     // Catch:{ all -> 0x00ed }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x00ed }
            r5 = 813(0x32d, float:1.139E-42)
            anie r1 = r1.a((java.lang.String) r2, (java.lang.String) r3, (int) r5, (java.lang.String) r4)     // Catch:{ all -> 0x00ed }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x00ed }
            java.lang.String r5 = "Unexpected call to physicalConnectionClosed() for medium %s while NearbyRecorder has no active current medium"
            java.lang.String r6 = r10.name()     // Catch:{ all -> 0x00ed }
            r1.a((java.lang.String) r5, (java.lang.Object) r6)     // Catch:{ all -> 0x00ed }
            goto L_0x005e
        L_0x003d:
            if (r1 == r10) goto L_0x005e
            jjg r1 = defpackage.tky.a     // Catch:{ all -> 0x00ed }
            anie r1 = r1.c()     // Catch:{ all -> 0x00ed }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x00ed }
            r5 = 818(0x332, float:1.146E-42)
            anie r1 = r1.a((java.lang.String) r2, (java.lang.String) r3, (int) r5, (java.lang.String) r4)     // Catch:{ all -> 0x00ed }
            anih r1 = (defpackage.anih) r1     // Catch:{ all -> 0x00ed }
            java.lang.String r5 = "Unexpected call to physicalConnectionClosed() for medium %s while NearbyRecorder has active medium %s"
            java.lang.String r6 = r10.name()     // Catch:{ all -> 0x00ed }
            asoe r7 = r0.d     // Catch:{ all -> 0x00ed }
            java.lang.String r7 = r7.name()     // Catch:{ all -> 0x00ed }
            r1.a((java.lang.String) r5, (java.lang.Object) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x00ed }
        L_0x005e:
            ou r1 = r0.a     // Catch:{ all -> 0x00ed }
            java.lang.Object r1 = r1.get(r10)     // Catch:{ all -> 0x00ed }
            aucd r1 = (defpackage.aucd) r1     // Catch:{ all -> 0x00ed }
            if (r1 != 0) goto L_0x0082
            jjg r0 = defpackage.tky.a     // Catch:{ all -> 0x00ed }
            anie r0 = r0.c()     // Catch:{ all -> 0x00ed }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00ed }
            r1 = 826(0x33a, float:1.157E-42)
            anie r0 = r0.a((java.lang.String) r2, (java.lang.String) r3, (int) r1, (java.lang.String) r4)     // Catch:{ all -> 0x00ed }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00ed }
            java.lang.String r1 = "Unexpected call to physicalConnectionClosed() for medium %s with no corresponding EstablishedConnection that was previously opened."
            java.lang.String r10 = r10.name()     // Catch:{ all -> 0x00ed }
            r0.a((java.lang.String) r1, (java.lang.Object) r10)     // Catch:{ all -> 0x00ed }
            goto L_0x00d5
        L_0x0082:
            aucj r5 = r1.b     // Catch:{ all -> 0x00ed }
            askl r5 = (defpackage.askl) r5     // Catch:{ all -> 0x00ed }
            int r5 = r5.a     // Catch:{ all -> 0x00ed }
            r5 = r5 & 4
            if (r5 != 0) goto L_0x0097
            r0.a((defpackage.aucd) r1, (int) r11)     // Catch:{ all -> 0x00ed }
            asoe r1 = r0.d     // Catch:{ all -> 0x00ed }
            if (r10 != r1) goto L_0x00d5
            r10 = 0
            r0.d = r10     // Catch:{ all -> 0x00ed }
            goto L_0x00d5
        L_0x0097:
            jjg r0 = defpackage.tky.a     // Catch:{ all -> 0x00ed }
            anie r0 = r0.c()     // Catch:{ all -> 0x00ed }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00ed }
            r5 = 833(0x341, float:1.167E-42)
            anie r0 = r0.a((java.lang.String) r2, (java.lang.String) r3, (int) r5, (java.lang.String) r4)     // Catch:{ all -> 0x00ed }
            anih r0 = (defpackage.anih) r0     // Catch:{ all -> 0x00ed }
            java.lang.String r10 = r10.name()     // Catch:{ all -> 0x00ed }
            aucj r1 = r1.b     // Catch:{ all -> 0x00ed }
            askl r1 = (defpackage.askl) r1     // Catch:{ all -> 0x00ed }
            int r1 = r1.f     // Catch:{ all -> 0x00ed }
            int r1 = defpackage.asob.a(r1)     // Catch:{ all -> 0x00ed }
            if (r1 == 0) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r1 = 1
        L_0x00b9:
            switch(r1) {
                case 1: goto L_0x00ce;
                case 2: goto L_0x00cb;
                case 3: goto L_0x00c8;
                case 4: goto L_0x00c5;
                case 5: goto L_0x00c2;
                case 6: goto L_0x00bf;
                default: goto L_0x00bc;
            }     // Catch:{ all -> 0x00ed }
        L_0x00bc:
            java.lang.String r1 = "UNFINISHED"
            goto L_0x00d0
        L_0x00bf:
            java.lang.String r1 = "SHUTDOWN"
            goto L_0x00d0
        L_0x00c2:
            java.lang.String r1 = "UPGRADED"
            goto L_0x00d0
        L_0x00c5:
            java.lang.String r1 = "IO_ERROR"
            goto L_0x00d0
        L_0x00c8:
            java.lang.String r1 = "REMOTE_DISCONNECTION"
            goto L_0x00d0
        L_0x00cb:
            java.lang.String r1 = "LOCAL_DISCONNECTION"
            goto L_0x00d0
        L_0x00ce:
            java.lang.String r1 = "UNKNOWN_DISCONNECTION_REASON"
        L_0x00d0:
            java.lang.String r2 = "Unexpected call to physicalConnectionClosed() for medium %s which already has disconnection reason %s"
            r0.a((java.lang.String) r2, (java.lang.Object) r10, (java.lang.Object) r1)     // Catch:{ all -> 0x00ed }
        L_0x00d5:
            r10 = 5
            if (r11 == r10) goto L_0x00e9
            asko r10 = r8.g     // Catch:{ all -> 0x00ed }
            ou r11 = r8.e     // Catch:{ all -> 0x00ed }
            java.lang.Object r9 = r11.remove(r9)     // Catch:{ all -> 0x00ed }
            tkv r9 = (defpackage.tkv) r9     // Catch:{ all -> 0x00ed }
            java.util.List r9 = r9.a()     // Catch:{ all -> 0x00ed }
            r10.a((java.lang.Iterable) r9)     // Catch:{ all -> 0x00ed }
        L_0x00e9:
            monitor-exit(r8)
            return
        L_0x00eb:
            monitor-exit(r8)
            return
        L_0x00ed:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkx.a(java.lang.String, asoe, int):void");
    }

    public final synchronized void a(String str, asoe asoe, asoe asoe2, int i2) {
        if (h("onBandwidthUpgradeStarted")) {
            ou ouVar = this.f;
            aucd o = askf.h.o();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (o.c) {
                o.c();
                o.c = false;
            }
            askf askf = (askf) o.b;
            int i3 = askf.a | 2;
            askf.a = i3;
            askf.c = elapsedRealtime;
            askf.d = asoe.k;
            int i4 = i3 | 4;
            askf.a = i4;
            askf.e = asoe2.k;
            int i5 = i4 | 8;
            askf.a = i5;
            askf.b = i2 - 1;
            askf.a = i5 | 1;
            ouVar.put(str, o);
        }
    }

    public final synchronized void a(String[] strArr, long j2, int i2, long j3) {
        if (h("onOutgoingPayloadStarted")) {
            for (String str : strArr) {
                if (this.e.containsKey(str)) {
                    ((tkv) this.e.get(str)).b.put(Long.valueOf(j2), new tkw(a(i2), j3));
                }
            }
        }
    }
}
