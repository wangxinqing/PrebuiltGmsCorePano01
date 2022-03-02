package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: pak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pak extends ppr {
    private final Context a;
    private final owg b;
    private final orf c;
    private final ozi d;
    private final ozb e;
    private final oyq f;
    private final NativeIndex n;
    private final AtomicBoolean o;
    private final Map p = new HashMap();
    private final Map q = new HashMap();
    private final Map r = new HashMap();

    public pak(Context context, owg owg, orf orf, ozi ozi, ozb ozb, oyq oyq, NativeIndex nativeIndex, AtomicBoolean atomicBoolean) {
        super(aonk.DRAIN_REQUEST_QUEUE, 2, 3, (String) null, psd.b(context));
        this.a = context;
        this.b = owg;
        this.c = orf;
        this.d = ozi;
        this.e = ozb;
        this.f = oyq;
        this.n = nativeIndex;
        this.o = atomicBoolean;
    }

    private final long a(pao pao, ota ota) {
        osz osz = ota.b;
        if (osz == null) {
            osz = osz.s;
        }
        Long l = (Long) this.p.get(pao);
        if (l == null) {
            l = Long.valueOf(this.n.a(osz.b, false));
            this.p.put(pao, l);
        }
        return l.longValue();
    }

    private final pxh b(pao pao) {
        pxh pxh = (pxh) this.r.get(pao);
        if (pxh != null) {
            return pxh;
        }
        pxh pxh2 = new pxh();
        this.r.put(pao, pxh2);
        return pxh2;
    }

    private final void c(pao pao) {
        ota a2;
        pxh pxh = (pxh) this.r.get(pao);
        if (pxh != null && (a2 = a(pao)) != null) {
            otg otg = a2.c;
            if (otg == null) {
                otg = otg.h;
            }
            aucd aucd = (aucd) otg.c(5);
            aucd.a((aucj) otg);
            List a3 = pxh.a(Collections.unmodifiableList(((otg) aucd.b).b));
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ((otg) aucd.b).b = aucj.s();
            aucd.L(a3);
            this.d.a().c(pao, (otg) aucd.i());
        }
    }

    private final amzy a(String str) {
        oyz d2 = this.e.d(str);
        if (d2 != null) {
            return this.d.b.a(d2);
        }
        oso.a("Package %s not found in client registry", (Object) str);
        return amzy.h();
    }

    private final aond a(ota ota, aojr aojr) {
        if (aojr == null) {
            return aond.PROTO_PARSE_ERROR;
        }
        aucd o2 = aojq.d.o();
        osz osz = ota.b;
        if (osz == null) {
            osz = osz.s;
        }
        String str = osz.e;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aojq aojq = (aojq) o2.b;
        str.getClass();
        aojq.a |= 1;
        aojq.b = str;
        osz osz2 = ota.b;
        if (osz2 == null) {
            osz2 = osz.s;
        }
        String a2 = pxa.a(osz2);
        if (a2 != null && !TextUtils.isEmpty(a2)) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aojq aojq2 = (aojq) o2.b;
            a2.getClass();
            aojq2.a |= 2;
            aojq2.c = a2;
        }
        aucd aucd = (aucd) aojr.c(5);
        aucd.a((aucj) aojr);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aojr aojr2 = (aojr) aucd.b;
        aojq aojq3 = (aojq) o2.i();
        aojq3.getClass();
        aojr2.b = aojq3;
        aojr2.a |= 64;
        this.f.a((aojr) aucd.i());
        aond a3 = aond.a(aojr.c);
        return a3 == null ? aond.OK : a3;
    }

    private final ota a(pao pao) {
        ota ota = (ota) this.q.get(pao);
        if (ota == null) {
            ota = this.d.b.b(pao);
            if (ota != null) {
                otg otg = ota.c;
                if (otg == null) {
                    otg = otg.h;
                }
                int a2 = otf.a(otg.c);
                if (a2 == 0 || a2 == 1) {
                    osz osz = ota.b;
                    if (osz == null) {
                        osz = osz.s;
                    }
                    if (!oxe.a(osz.c)) {
                        return null;
                    }
                    String str = osz.e;
                    oyz d2 = this.e.d(str);
                    if (d2 == null || !d2.e()) {
                        oso.c("Not indexing corpus from package %s as it has never connected", (Object) str);
                        return null;
                    }
                    this.q.put(pao, ota);
                }
            }
            oso.a("Corpus no longer exists %s", (Object) pao.b());
            return null;
        }
        return ota;
    }

    private final void a(String str, String str2) {
        pao pao = new pao(str, str2);
        c(pao);
        this.c.a(str, str2);
        this.p.remove(pao);
        this.q.remove(pao);
        this.r.remove(pao);
    }

    private final void a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        anhk i = a(str).listIterator();
        boolean z = false;
        while (i.hasNext()) {
            pao pao = (pao) i.next();
            ota a2 = a(pao);
            if (a2 != null) {
                osz osz = a2.b;
                if (osz == null) {
                    osz = osz.s;
                }
                if (!osz.c.equals(str3)) {
                    long a3 = a(pao, a2);
                    pxh b2 = b(pao);
                    arrayList.add(b2);
                    NativeIndex nativeIndex = this.n;
                    osz osz2 = a2.b;
                    if (osz2 == null) {
                        osz2 = osz.s;
                    }
                    aond a4 = nativeIndex.a(a3, osz2.b, str2);
                    if (!aond.ERROR_URI_NOT_FOUND.equals(a4)) {
                        String valueOf = String.valueOf(NativeIndex.a(a4));
                        b2.a(valueOf.length() == 0 ? new String("delete ") : "delete ".concat(valueOf));
                        z = true;
                    }
                }
            }
        }
        if (str3 == null && !z) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                pxh pxh = (pxh) arrayList.get(i2);
                String valueOf2 = String.valueOf(NativeIndex.a(aond.ERROR_URI_NOT_FOUND));
                pxh.a(valueOf2.length() == 0 ? new String("delete ") : "delete ".concat(valueOf2));
            }
        }
    }

    private final void a(ore ore, boolean z) {
        osz osz;
        osz osz2;
        pao pao = new pao(ore.a, ore.b);
        ota a2 = a(pao);
        if (a2 != null) {
            long a3 = a(pao, a2);
            oso.d("Indexing %s from %s using seqno %d", pao.b(), ore.a, Long.valueOf(a3));
            pxh b2 = b(pao);
            if (!z) {
                String str = ore.a;
                avqi avqi = ore.c;
                if (avqi == null) {
                    avqi = avqi.f;
                }
                String str2 = avqi.c;
                osz osz3 = a2.b;
                if (osz3 == null) {
                    osz3 = osz.s;
                }
                a(str, str2, osz3.c);
                NativeIndex nativeIndex = this.n;
                byte[] k = avqi.k();
                plf a4 = pap.a(a2);
                osz osz4 = a2.b;
                if (osz4 != null) {
                    osz2 = osz4;
                } else {
                    osz2 = osz.s;
                }
                aond a5 = a(a2, nativeIndex.a(a3, k, a4, osz2, ozy.a()));
                String valueOf = String.valueOf(NativeIndex.a(a5));
                b2.a(valueOf.length() == 0 ? new String("index ") : "index ".concat(valueOf));
                String valueOf2 = String.valueOf(NativeIndex.a(a5));
                b2.a(valueOf2.length() == 0 ? new String("index-thing ") : "index-thing ".concat(valueOf2));
                return;
            }
            avqi avqi2 = ore.c;
            if (avqi2 == null) {
                avqi2 = avqi.f;
            }
            if (!pba.h()) {
                b2.a("patch disabled");
                return;
            }
            NativeIndex nativeIndex2 = this.n;
            byte[] k2 = avqi2.k();
            plf a6 = pap.a(a2);
            osz osz5 = a2.b;
            if (osz5 == null) {
                osz = osz.s;
            } else {
                osz = osz5;
            }
            String valueOf3 = String.valueOf(NativeIndex.a(a(a2, nativeIndex2.b(a3, k2, a6, osz, ozy.a()))));
            b2.a(valueOf3.length() == 0 ? new String("modify ") : "modify ".concat(valueOf3));
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    protected final /* bridge */ /* synthetic */ java.lang.Object a() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "DrainRequestQueueTask starting"
            defpackage.oso.a(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.o
            r2 = 0
            r0.set(r2)
            axsm r0 = defpackage.axsm.a
            axsn r0 = r0.a()
            long r3 = r0.b()
            int r0 = (int) r3
            r3 = 1
            int r4 = java.lang.Math.max(r3, r0)
            long r5 = java.lang.System.currentTimeMillis()
            r7 = 0
        L_0x0022:
            owg r0 = r1.b
            r9 = 2
            r10 = 0
            owf r0 = (defpackage.owf) r0     // Catch:{ IOException -> 0x022c }
            owe r11 = r0.a     // Catch:{ IOException -> 0x022c }
            java.lang.Object r12 = r11.g     // Catch:{ IOException -> 0x022c }
            monitor-enter(r12)     // Catch:{ IOException -> 0x022c }
        L_0x002d:
            owc r0 = r11.h     // Catch:{ all -> 0x0229 }
            if (r0 == 0) goto L_0x0134
            java.lang.String r0 = r0.a     // Catch:{ IOException -> 0x011d }
            java.lang.String r13 = r11.j     // Catch:{ IOException -> 0x011d }
            boolean r0 = r0.equals(r13)     // Catch:{ IOException -> 0x011d }
            if (r0 == 0) goto L_0x007f
            java.lang.Object r13 = r11.d     // Catch:{ IOException -> 0x011d }
            monitor-enter(r13)     // Catch:{ IOException -> 0x011d }
            owc r0 = r11.h     // Catch:{ all -> 0x007c }
            java.lang.String r0 = r0.a     // Catch:{ all -> 0x007c }
            java.lang.String r14 = r11.j     // Catch:{ all -> 0x007c }
            boolean r0 = r0.equals(r14)     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0078
            owc r0 = r11.h     // Catch:{ all -> 0x007c }
            aubc r0 = r0.d     // Catch:{ all -> 0x007c }
            boolean r0 = r0.z()     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0075
            owc r0 = r11.h     // Catch:{ all -> 0x007c }
            aubc r0 = r0.d     // Catch:{ all -> 0x007c }
            long r14 = r0.e()     // Catch:{ all -> 0x007c }
            owc r0 = r11.h     // Catch:{ all -> 0x007c }
            aubc r0 = r0.d     // Catch:{ all -> 0x007c }
            byte[] r0 = r0.m()     // Catch:{ all -> 0x007c }
            android.util.Pair r8 = new android.util.Pair     // Catch:{ all -> 0x007c }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x007c }
            r8.<init>(r14, r0)     // Catch:{ all -> 0x007c }
            owc r0 = r11.h     // Catch:{ all -> 0x007c }
            aubc r0 = r0.d     // Catch:{ all -> 0x007c }
            r0.y()     // Catch:{ all -> 0x007c }
            goto L_0x0076
        L_0x0075:
            r8 = r10
        L_0x0076:
            r0 = 1
            goto L_0x007a
        L_0x0078:
            r8 = r10
            r0 = 0
        L_0x007a:
            monitor-exit(r13)     // Catch:{ all -> 0x007c }
            goto L_0x0081
        L_0x007c:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ IOException -> 0x011d }
        L_0x007f:
            r8 = r10
            r0 = 0
        L_0x0081:
            if (r0 != 0) goto L_0x00a4
            owc r8 = r11.h     // Catch:{ IOException -> 0x011d }
            aubc r8 = r8.d     // Catch:{ IOException -> 0x011d }
            long r13 = r8.e()     // Catch:{ IOException -> 0x011d }
            owc r8 = r11.h     // Catch:{ IOException -> 0x011d }
            aubc r8 = r8.d     // Catch:{ IOException -> 0x011d }
            byte[] r8 = r8.m()     // Catch:{ IOException -> 0x011d }
            owc r15 = r11.h     // Catch:{ IOException -> 0x011d }
            aubc r15 = r15.d     // Catch:{ IOException -> 0x011d }
            r15.y()     // Catch:{ IOException -> 0x011d }
            android.util.Pair r15 = new android.util.Pair     // Catch:{ IOException -> 0x011d }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ IOException -> 0x011d }
            r15.<init>(r13, r8)     // Catch:{ IOException -> 0x011d }
            r8 = r15
        L_0x00a4:
            if (r0 != 0) goto L_0x00bd
            owc r0 = r11.h     // Catch:{ all -> 0x0229 }
            aubc r0 = r0.d     // Catch:{ all -> 0x0229 }
            boolean r0 = r0.z()     // Catch:{ all -> 0x0229 }
            if (r0 == 0) goto L_0x00bd
            owc r0 = r11.h     // Catch:{ all -> 0x0229 }
            r0.close()     // Catch:{ all -> 0x0229 }
            owc r0 = r11.h     // Catch:{ all -> 0x0229 }
            java.lang.String r0 = r0.a     // Catch:{ all -> 0x0229 }
            r11.i = r0     // Catch:{ all -> 0x0229 }
            r11.h = r10     // Catch:{ all -> 0x0229 }
        L_0x00bd:
            monitor-exit(r12)     // Catch:{ all -> 0x0229 }
            if (r8 == 0) goto L_0x011a
            java.lang.Object r0 = r8.first     // Catch:{ IOException -> 0x022c }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ IOException -> 0x022c }
            long r12 = r0.longValue()     // Catch:{ IOException -> 0x022c }
            java.lang.Object r0 = r8.second     // Catch:{ IOException -> 0x022c }
            byte[] r0 = (byte[]) r0     // Catch:{ IOException -> 0x022c }
            java.util.zip.CRC32 r8 = new java.util.zip.CRC32     // Catch:{ IOException -> 0x022c }
            r8.<init>()     // Catch:{ IOException -> 0x022c }
            r8.update(r0)     // Catch:{ IOException -> 0x022c }
            long r14 = r8.getValue()     // Catch:{ IOException -> 0x022c }
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 != 0) goto L_0x010d
            auef r8 = r11.b     // Catch:{ IOException -> 0x022c }
            java.lang.Object r0 = r8.a((byte[]) r0)     // Catch:{ IOException -> 0x022c }
            audx r0 = (defpackage.audx) r0     // Catch:{ IOException -> 0x022c }
            aucd r8 = r11.k     // Catch:{ IOException -> 0x022c }
            monitor-enter(r8)     // Catch:{ IOException -> 0x022c }
            aucd r11 = r11.k     // Catch:{ all -> 0x010a }
            aucj r12 = r11.b     // Catch:{ all -> 0x010a }
            aokz r12 = (defpackage.aokz) r12     // Catch:{ all -> 0x010a }
            int r12 = r12.d     // Catch:{ all -> 0x010a }
            int r12 = r12 + r3
            boolean r13 = r11.c     // Catch:{ all -> 0x010a }
            if (r13 != 0) goto L_0x00f5
            goto L_0x00fa
        L_0x00f5:
            r11.c()     // Catch:{ all -> 0x010a }
            r11.c = r2     // Catch:{ all -> 0x010a }
        L_0x00fa:
            aucj r11 = r11.b     // Catch:{ all -> 0x010a }
            aokz r11 = (defpackage.aokz) r11     // Catch:{ all -> 0x010a }
            aokz r13 = defpackage.aokz.f     // Catch:{ all -> 0x010a }
            int r13 = r11.a     // Catch:{ all -> 0x010a }
            r13 = r13 | r9
            r11.a = r13     // Catch:{ all -> 0x010a }
            r11.d = r12     // Catch:{ all -> 0x010a }
            monitor-exit(r8)     // Catch:{ all -> 0x010a }
            goto L_0x0226
        L_0x010a:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x010a }
            throw r0     // Catch:{ IOException -> 0x022c }
        L_0x010d:
            aonh r0 = defpackage.aonh.CRC_MISMATCH     // Catch:{ IOException -> 0x022c }
            r11.a((defpackage.aonh) r0)     // Catch:{ IOException -> 0x022c }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x022c }
            java.lang.String r8 = "CRC Mismatch"
            r0.<init>(r8)     // Catch:{ IOException -> 0x022c }
            throw r0     // Catch:{ IOException -> 0x022c }
        L_0x011a:
            r0 = r10
            goto L_0x0226
        L_0x011d:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ all -> 0x0229 }
            owc r13 = r11.h     // Catch:{ all -> 0x0229 }
            java.io.File r13 = r13.b     // Catch:{ all -> 0x0229 }
            r8[r2] = r13     // Catch:{ all -> 0x0229 }
            java.lang.String r13 = "Got IOException trying to read shard %s"
            defpackage.oso.b((java.lang.Throwable) r0, (java.lang.String) r13, (java.lang.Object[]) r8)     // Catch:{ all -> 0x0229 }
            aonh r8 = defpackage.aonh.SHARD_READ_FAILED     // Catch:{ all -> 0x0229 }
            r11.a((defpackage.aonh) r8)     // Catch:{ all -> 0x0229 }
            r11.b()     // Catch:{ all -> 0x0229 }
            throw r0     // Catch:{ all -> 0x0229 }
        L_0x0134:
            java.util.TreeSet r0 = r11.a()     // Catch:{ all -> 0x0229 }
            boolean r8 = r0.isEmpty()     // Catch:{ all -> 0x0229 }
            if (r8 != 0) goto L_0x0224
            java.lang.String r8 = r11.i     // Catch:{ all -> 0x0229 }
            if (r8 == 0) goto L_0x014c
            java.lang.String r8 = r11.i     // Catch:{ all -> 0x0229 }
            java.lang.Object r0 = r0.higher(r8)     // Catch:{ all -> 0x0229 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0229 }
            r8 = r0
            goto L_0x0153
        L_0x014c:
            java.lang.Object r0 = r0.first()     // Catch:{ all -> 0x0229 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0229 }
            r8 = r0
        L_0x0153:
            if (r8 == 0) goto L_0x0221
            java.io.File r13 = new java.io.File     // Catch:{ all -> 0x0229 }
            java.io.File r0 = r11.a     // Catch:{ all -> 0x0229 }
            r13.<init>(r0, r8)     // Catch:{ all -> 0x0229 }
            java.lang.Long r0 = defpackage.owe.a((java.lang.String) r8)     // Catch:{ all -> 0x0229 }
            if (r0 == 0) goto L_0x01e5
            owc r0 = new owc     // Catch:{ IOException -> 0x01bd }
            r0.<init>(r8, r13)     // Catch:{ IOException -> 0x01bd }
            r11.h = r0     // Catch:{ IOException -> 0x01bd }
            owc r0 = r11.h     // Catch:{ IOException -> 0x01bd }
            java.lang.String r0 = r0.a     // Catch:{ IOException -> 0x01bd }
            java.lang.String r14 = r11.j     // Catch:{ IOException -> 0x01bd }
            boolean r0 = r0.equals(r14)     // Catch:{ IOException -> 0x01bd }
            if (r0 != 0) goto L_0x0176
            goto L_0x0190
        L_0x0176:
            java.lang.Object r14 = r11.d     // Catch:{ IOException -> 0x01bd }
            monitor-enter(r14)     // Catch:{ IOException -> 0x01bd }
            owc r0 = r11.h     // Catch:{ all -> 0x01ba }
            java.lang.String r0 = r0.a     // Catch:{ all -> 0x01ba }
            java.lang.String r15 = r11.j     // Catch:{ all -> 0x01ba }
            boolean r0 = r0.equals(r15)     // Catch:{ all -> 0x01ba }
            if (r0 == 0) goto L_0x018f
            owc r0 = r11.h     // Catch:{ all -> 0x01ba }
            aubc r0 = r0.d     // Catch:{ all -> 0x01ba }
            int r0 = r0.h()     // Catch:{ all -> 0x01ba }
            monitor-exit(r14)     // Catch:{ all -> 0x01ba }
            goto L_0x0198
        L_0x018f:
            monitor-exit(r14)     // Catch:{ all -> 0x01ba }
        L_0x0190:
            owc r0 = r11.h     // Catch:{ IOException -> 0x01bd }
            aubc r0 = r0.d     // Catch:{ IOException -> 0x01bd }
            int r0 = r0.h()     // Catch:{ IOException -> 0x01bd }
        L_0x0198:
            if (r0 == r3) goto L_0x002d
            r14 = 3
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ IOException -> 0x01bd }
            r15[r2] = r8     // Catch:{ IOException -> 0x01bd }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x01bd }
            r15[r3] = r14     // Catch:{ IOException -> 0x01bd }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x01bd }
            r15[r9] = r0     // Catch:{ IOException -> 0x01bd }
            java.lang.String r0 = "Shard %s skipped due to invalid format (expected %d, got %d)"
            defpackage.oso.f(r0, r15)     // Catch:{ IOException -> 0x01bd }
            aonh r0 = defpackage.aonh.INVALID_SHARD_FORMAT     // Catch:{ IOException -> 0x01bd }
            r11.a((defpackage.aonh) r0)     // Catch:{ IOException -> 0x01bd }
            r11.b()     // Catch:{ IOException -> 0x01bd }
            goto L_0x002d
        L_0x01ba:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ IOException -> 0x01bd }
        L_0x01bd:
            r0 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r3]     // Catch:{ all -> 0x0229 }
            r14[r2] = r8     // Catch:{ all -> 0x0229 }
            java.lang.String r8 = "Failed to open shard %s for reading"
            defpackage.oso.b((java.lang.Throwable) r0, (java.lang.String) r8, (java.lang.Object[]) r14)     // Catch:{ all -> 0x0229 }
            aonh r8 = defpackage.aonh.SHARD_OPEN_FAILED     // Catch:{ all -> 0x0229 }
            r11.a((defpackage.aonh) r8)     // Catch:{ all -> 0x0229 }
            owc r8 = r11.h     // Catch:{ all -> 0x0229 }
            if (r8 != 0) goto L_0x01e1
            boolean r8 = r13.delete()     // Catch:{ all -> 0x0229 }
            if (r8 != 0) goto L_0x01e4
            java.lang.String r8 = "Failed to delete file %s"
            defpackage.oso.e((java.lang.String) r8, (java.lang.Object) r13)     // Catch:{ all -> 0x0229 }
            aonh r8 = defpackage.aonh.SHARD_DELETE_FAILED     // Catch:{ all -> 0x0229 }
            r11.a((defpackage.aonh) r8)     // Catch:{ all -> 0x0229 }
            goto L_0x01e4
        L_0x01e1:
            r11.b()     // Catch:{ all -> 0x0229 }
        L_0x01e4:
            throw r0     // Catch:{ all -> 0x0229 }
        L_0x01e5:
            java.lang.String r0 = "Invalid shard name: %s. Shard will be skipped and deleted."
            defpackage.oso.e((java.lang.String) r0, (java.lang.Object) r8)     // Catch:{ all -> 0x0229 }
            aonh r0 = defpackage.aonh.INVALID_SHARD_NAME     // Catch:{ all -> 0x0229 }
            r11.a((defpackage.aonh) r0)     // Catch:{ all -> 0x0229 }
            boolean r0 = r13.delete()     // Catch:{ all -> 0x0229 }
            if (r0 == 0) goto L_0x01f7
            goto L_0x002d
        L_0x01f7:
            aonh r0 = defpackage.aonh.SHARD_DELETE_FAILED     // Catch:{ all -> 0x0229 }
            r11.a((defpackage.aonh) r0)     // Catch:{ all -> 0x0229 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0229 }
            java.lang.String r8 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0229 }
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0229 }
            int r11 = r11.length()     // Catch:{ all -> 0x0229 }
            int r11 = r11 + 23
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0229 }
            r13.<init>(r11)     // Catch:{ all -> 0x0229 }
            java.lang.String r11 = "Failed to delete file: "
            r13.append(r11)     // Catch:{ all -> 0x0229 }
            r13.append(r8)     // Catch:{ all -> 0x0229 }
            java.lang.String r8 = r13.toString()     // Catch:{ all -> 0x0229 }
            r0.<init>(r8)     // Catch:{ all -> 0x0229 }
            throw r0     // Catch:{ all -> 0x0229 }
        L_0x0221:
            monitor-exit(r12)     // Catch:{ all -> 0x0229 }
            r0 = r10
            goto L_0x0226
        L_0x0224:
            monitor-exit(r12)     // Catch:{ all -> 0x0229 }
            r0 = r10
        L_0x0226:
            ora r0 = (defpackage.ora) r0     // Catch:{ IOException -> 0x022c }
            goto L_0x0233
        L_0x0229:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0229 }
            throw r0     // Catch:{ IOException -> 0x022c }
        L_0x022c:
            r0 = move-exception
            java.lang.String r8 = "Failed to take from request queue"
            defpackage.oso.a((java.lang.Throwable) r0, (java.lang.String) r8)
            r0 = r10
        L_0x0233:
            r8 = 5
            r11 = 4
            if (r0 == 0) goto L_0x0362
            int r12 = r0.a
            oqz r12 = defpackage.oqz.a(r12)
            java.lang.String r13 = "RequestQueue processing mutation request, type: %s"
            defpackage.oso.d((java.lang.String) r13, (java.lang.Object) r12)
            int r12 = r0.a
            oqz r12 = defpackage.oqz.a(r12)
            int r12 = r12.ordinal()
            if (r12 == 0) goto L_0x0341
            if (r12 == r3) goto L_0x0331
            if (r12 == r9) goto L_0x0311
            r9 = 3
            if (r12 == r9) goto L_0x02dc
            if (r12 == r11) goto L_0x027f
            if (r12 == r8) goto L_0x026d
            int r0 = r0.a
            oqz r0 = defpackage.oqz.a(r0)
            java.lang.String r8 = "Unhandled mutation type %s"
            defpackage.oso.b((java.lang.String) r8, (java.lang.Object) r0)
            oyq r0 = r1.f
            java.lang.String r8 = "bad_mutation_type"
            r0.a((java.lang.String) r8)
            goto L_0x0350
        L_0x026d:
            int r8 = r0.a
            r9 = 6
            if (r8 != r9) goto L_0x0277
            java.lang.Object r0 = r0.b
            ore r0 = (defpackage.ore) r0
            goto L_0x0279
        L_0x0277:
            ore r0 = defpackage.ore.d
        L_0x0279:
            r1.a((defpackage.ore) r0, (boolean) r2)
            goto L_0x0350
        L_0x027f:
            int r9 = r0.a
            if (r9 != r8) goto L_0x0288
            java.lang.Object r0 = r0.b
            ord r0 = (defpackage.ord) r0
            goto L_0x028a
        L_0x0288:
            ord r0 = defpackage.ord.c
        L_0x028a:
            java.lang.String r8 = r0.a
            amzy r8 = r1.a((java.lang.String) r8)
            anhk r8 = r8.listIterator()
        L_0x0294:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0350
            java.lang.Object r9 = r8.next()
            pao r9 = (defpackage.pao) r9
            ota r9 = r1.a((defpackage.pao) r9)
            if (r9 == 0) goto L_0x0294
            osz r10 = r9.b
            if (r10 == 0) goto L_0x02ab
            goto L_0x02ad
        L_0x02ab:
            osz r10 = defpackage.osz.s
        L_0x02ad:
            java.lang.String r10 = r10.c
            osz r11 = r9.b
            if (r11 == 0) goto L_0x02b4
            goto L_0x02b6
        L_0x02b4:
            osz r11 = defpackage.osz.s
        L_0x02b6:
            java.lang.String r11 = r11.e
            android.content.Context r12 = r1.a
            oyb r12 = defpackage.oyb.a((android.content.Context) r12)
            oxe r10 = defpackage.oxe.a(r10, r11, r12)
            ovo r10 = r10.a
            java.lang.String r10 = r10.b
            java.lang.String r11 = r0.b
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0294
            java.lang.String r10 = r0.a
            osz r9 = r9.b
            if (r9 != 0) goto L_0x02d6
            osz r9 = defpackage.osz.s
        L_0x02d6:
            java.lang.String r9 = r9.c
            r1.a((java.lang.String) r10, (java.lang.String) r9)
            goto L_0x0294
        L_0x02dc:
            int r8 = r0.a
            if (r8 != r11) goto L_0x02e5
            java.lang.Object r0 = r0.b
            orb r0 = (defpackage.orb) r0
            goto L_0x02e7
        L_0x02e5:
            orb r0 = defpackage.orb.b
        L_0x02e7:
            java.lang.String r8 = r0.a
            amzy r8 = r1.a((java.lang.String) r8)
            anhk r8 = r8.listIterator()
        L_0x02f1:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0350
            java.lang.Object r9 = r8.next()
            pao r9 = (defpackage.pao) r9
            ota r9 = r1.a((defpackage.pao) r9)
            if (r9 == 0) goto L_0x02f1
            java.lang.String r10 = r0.a
            osz r9 = r9.b
            if (r9 != 0) goto L_0x030b
            osz r9 = defpackage.osz.s
        L_0x030b:
            java.lang.String r9 = r9.c
            r1.a((java.lang.String) r10, (java.lang.String) r9)
            goto L_0x02f1
        L_0x0311:
            int r8 = r0.a
            r9 = 3
            if (r8 != r9) goto L_0x031b
            java.lang.Object r8 = r0.b
            orc r8 = (defpackage.orc) r8
            goto L_0x031d
        L_0x031b:
            orc r8 = defpackage.orc.c
        L_0x031d:
            java.lang.String r8 = r8.a
            int r9 = r0.a
            r11 = 3
            if (r9 != r11) goto L_0x0329
            java.lang.Object r0 = r0.b
            orc r0 = (defpackage.orc) r0
            goto L_0x032b
        L_0x0329:
            orc r0 = defpackage.orc.c
        L_0x032b:
            java.lang.String r0 = r0.b
            r1.a(r8, r0, r10)
            goto L_0x0350
        L_0x0331:
            int r8 = r0.a
            if (r8 != r9) goto L_0x033a
            java.lang.Object r0 = r0.b
            ore r0 = (defpackage.ore) r0
            goto L_0x033c
        L_0x033a:
            ore r0 = defpackage.ore.d
        L_0x033c:
            r1.a((defpackage.ore) r0, (boolean) r3)
            goto L_0x0350
        L_0x0341:
            int r8 = r0.a
            if (r8 != r3) goto L_0x034a
            java.lang.Object r0 = r0.b
            ore r0 = (defpackage.ore) r0
            goto L_0x034c
        L_0x034a:
            ore r0 = defpackage.ore.d
        L_0x034c:
            r1.a((defpackage.ore) r0, (boolean) r2)
        L_0x0350:
            int r7 = r7 + 1
            int r0 = r7 % r4
            if (r0 != 0) goto L_0x0022
            com.google.android.gms.icing.nativeindex.NativeIndex r0 = r1.n
            r0.c()
            owg r0 = r1.b
            r0.a()
            goto L_0x0022
        L_0x0362:
            int r0 = r7 % r4
            if (r0 == 0) goto L_0x0370
            com.google.android.gms.icing.nativeindex.NativeIndex r0 = r1.n
            r0.c()
            owg r0 = r1.b
            r0.a()
        L_0x0370:
            java.util.Map r0 = r1.r
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x037a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x038a
            java.lang.Object r3 = r0.next()
            pao r3 = (defpackage.pao) r3
            r1.c(r3)
            goto L_0x037a
        L_0x038a:
            owg r0 = r1.b
            owf r0 = (defpackage.owf) r0
            owe r0 = r0.a
            aucd r3 = r0.k
            monitor-enter(r3)
            aucd r4 = r0.k     // Catch:{ all -> 0x0413 }
            aucj r4 = r4.i()     // Catch:{ all -> 0x0413 }
            aokz r4 = (defpackage.aokz) r4     // Catch:{ all -> 0x0413 }
            aucd r0 = r0.k     // Catch:{ all -> 0x0413 }
            aucj r9 = r0.b     // Catch:{ all -> 0x0413 }
            java.lang.Object r9 = r9.c(r11)     // Catch:{ all -> 0x0413 }
            aucj r9 = (defpackage.aucj) r9     // Catch:{ all -> 0x0413 }
            r0.b = r9     // Catch:{ all -> 0x0413 }
            monitor-exit(r3)     // Catch:{ all -> 0x0413 }
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r5
            oyq r0 = r1.f
            java.lang.Object r3 = r4.c(r8)
            aucd r3 = (defpackage.aucd) r3
            r3.a((defpackage.aucj) r4)
            boolean r4 = r3.c
            if (r4 != 0) goto L_0x03bd
            goto L_0x03c2
        L_0x03bd:
            r3.c()
            r3.c = r2
        L_0x03c2:
            aucj r4 = r3.b
            aokz r4 = (defpackage.aokz) r4
            aokz r5 = defpackage.aokz.f
            int r5 = r4.a
            r5 = r5 | r11
            r4.a = r5
            r4.e = r12
            aucj r3 = r3.i()
            aokz r3 = (defpackage.aokz) r3
            long r4 = defpackage.axrp.c()
            boolean r6 = r0.a((long) r4)
            if (r6 == 0) goto L_0x0404
            aoji r6 = defpackage.aoji.R
            aucd r6 = r6.o()
            boolean r8 = r6.c
            if (r8 != 0) goto L_0x03ea
            goto L_0x03ef
        L_0x03ea:
            r6.c()
            r6.c = r2
        L_0x03ef:
            aucj r2 = r6.b
            aoji r2 = (defpackage.aoji) r2
            r3.getClass()
            r2.N = r3
            int r3 = r2.b
            r8 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 | r8
            r2.b = r3
            r2 = 6013(0x177d, float:8.426E-42)
            r0.a((int) r2, (defpackage.aucd) r6, (long) r4)
        L_0x0404:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Long r2 = java.lang.Long.valueOf(r12)
            java.lang.String r3 = "Indexing done. Processed %d requests in %d ms"
            defpackage.oso.a((java.lang.String) r3, (java.lang.Object) r0, (java.lang.Object) r2)
            return r10
        L_0x0413:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0413 }
            goto L_0x0417
        L_0x0416:
            throw r0
        L_0x0417:
            goto L_0x0416
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pak.a():java.lang.Object");
    }
}
