package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.config.InvalidConfigException;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: hfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hfz extends bjx {
    private static volatile hfz f;
    public final Object e = new Object();
    private hfg g;

    public hfz(Context context) {
        super(context, "stored_modulesets.pb");
    }

    public static int a(String str, List list) {
        for (int i = 0; i < list.size(); i++) {
            hfg hfg = ((hfi) ((hfj) list.get(i)).a.get(0)).b;
            if (hfg == null) {
                hfg = hfg.d;
            }
            if (str.equals(((ansk) hfg.a.get(0)).b)) {
                return i;
            }
        }
        return -1;
    }

    static hfk e() {
        aucd o = hfk.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        hfk hfk = (hfk) o.b;
        hfk.a |= 1;
        hfk.b = 2;
        return (hfk) o.i();
    }

    public static int h() {
        int z = (int) awxo.a.a().z();
        if (z > 0) {
            return z;
        }
        StringBuilder sb = new StringBuilder(51);
        sb.append("maxModuleSetHistoryLen=");
        sb.append(z);
        sb.append(". Setting it to 1");
        Log.w("ModuleSetMgr", sb.toString());
        return 1;
    }

    static final long i() {
        return System.currentTimeMillis() / 1000;
    }

    public final bpw b(anax anax) {
        hfk d;
        if (b()) {
            Log.e("ModuleSetMgr", "not migrated with user locked");
            return null;
        }
        synchronized (this.e) {
            d = d();
        }
        hgh a = a(d, hgi.a(blu.a(this.a).h()), anax, anax.isEmpty(), d.f);
        if (a != null) {
            return a.a;
        }
        return null;
    }

    public final hfk d() {
        hfk hfk;
        File a = a(this.b);
        if (c()) {
            File a2 = a(bkq.a(blb.a(this.a)));
            if (a2.exists()) {
                try {
                    bma.a(a2, a, new byte[FragmentTransaction.TRANSIT_EXIT_MASK]);
                } catch (IOException e2) {
                    String valueOf = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                    sb.append("Failed to migrate moduleset config: ");
                    sb.append(valueOf);
                    Log.w("ModuleSetMgr", sb.toString());
                }
                a2.delete();
            }
            this.d = true;
        }
        if (!a() || a.exists()) {
            byte[] a3 = bkq.a(a);
            if (a3 != null) {
                try {
                    hfk = (hfk) aucj.a((aucj) hfk.g, a3, aubs.b());
                } catch (auda e3) {
                    String valueOf2 = String.valueOf(e3.getMessage());
                    Log.e("ModuleSetMgr", valueOf2.length() == 0 ? new String("Failed to read modulesets file: ") : "Failed to read modulesets file: ".concat(valueOf2));
                    hfk = null;
                }
                if (hfk != null) {
                    int i = hfk.b;
                    if (i == 2) {
                        return hfk;
                    }
                    StringBuilder sb2 = new StringBuilder(53);
                    sb2.append("Discarding config with unexpected version ");
                    sb2.append(i);
                    sb2.toString();
                }
            }
            return e();
        }
        hfk e4 = e();
        a(e4);
        return e4;
    }

    public final void f() {
        blu.a(this.a).g();
        hey.a(false);
    }

    public final synchronized hfg g() {
        hfg hfg;
        hfg = this.g;
        if (hfg == null) {
            hfg a = hgi.a(this.a.getResources());
            if (a == null) {
                a = hgi.b("container-missing");
            }
            this.g = a;
            hfg = this.g;
        }
        return hfg;
    }

    public static hfg a(hfg hfg, Map map) {
        hfg hfg2 = (hfg) map.get("container");
        if (hfg2 != null && !hgi.a(hfg2, hfg)) {
            return hfg2;
        }
        map.put("container", hfg);
        return hfg;
    }

    public static hfi a(hfg hfg, long j) {
        aucd o = hfi.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        hfi hfi = (hfi) o.b;
        hfg.getClass();
        hfi.b = hfg;
        int i = hfi.a | 1;
        hfi.a = i;
        hfi.a = i | 8;
        hfi.e = j;
        return (hfi) o.i();
    }

    public static hfz a(Context context) {
        hfz hfz = f;
        if (hfz == null) {
            synchronized (hfz.class) {
                hfz = f;
                if (hfz == null) {
                    hfz = new hfz(context);
                    f = hfz;
                }
            }
        }
        return hfz;
    }

    private static final File a(File file) {
        if (file != null) {
            return new File(file, "stored_modulesets.pb");
        }
        return new File("stored_modulesets.pb");
    }

    public static nz a(hgh hgh, Map map, anax anax) {
        nz nzVar = new nz(((ou) map).h);
        for (hfg hfg : map.values()) {
            ansk ansk = (ansk) hfg.a.get(0);
            nzVar.put(ansk.b, ansk);
        }
        bpw bpw = hgh.a;
        int size = bpw.size();
        for (int i = 0; i < size; i++) {
            ansk ansk2 = (ansk) bpw.get(i);
            String str = ansk2.b;
            if (!"container-missing".equals(str)) {
                hfg hfg2 = (hfg) map.get(str);
                amtf.a((Object) hfg2);
                anax j = hgh.c.keySet();
                aucx aucx = hfg2.b;
                int size2 = aucx.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    bmr a = hgi.a((hfp) aucx.get(i2));
                    if (j.contains(a) && !anax.contains(a)) {
                        break;
                    }
                    i2++;
                }
            }
            nzVar.remove(ansk2.b);
        }
        return nzVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f1, code lost:
        if (r1 != 1) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011e, code lost:
        if (r1 != 1) goto L_0x013c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(java.util.List r18, defpackage.amrm r19, boolean r20, java.util.Map r21) {
        /*
            awxs r0 = defpackage.awxs.a
            awxt r0 = r0.a()
            long r0 = r0.F()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0016
            long r2 = i()
            long r2 = r2 - r0
            goto L_0x001b
        L_0x0016:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x001b:
            awxs r0 = defpackage.awxs.a
            awxt r0 = r0.a()
            long r0 = r0.i()
            int r1 = (int) r0
            int r0 = defpackage.hfm.a(r1)
            if (r0 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r0 = 1
        L_0x002e:
            awxs r4 = defpackage.awxs.a
            awxt r4 = r4.a()
            long r4 = r4.j()
            int r5 = (int) r4
            int r4 = defpackage.hfo.a(r5)
            if (r4 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r4 = 1
        L_0x0041:
            int r5 = r18.size()
            r6 = 0
            r7 = 0
        L_0x0047:
            if (r7 >= r5) goto L_0x01c3
            r8 = r18
            java.lang.Object r9 = r8.get(r7)
            hfj r9 = (defpackage.hfj) r9
            aucx r9 = r9.a
            int r10 = r9.size()
            r11 = 0
        L_0x0058:
            if (r11 >= r10) goto L_0x01b3
            java.lang.Object r12 = r9.get(r11)
            hfi r12 = (defpackage.hfi) r12
            boolean r13 = r12.c
            if (r13 == 0) goto L_0x006e
            r14 = r19
            r6 = r21
            r16 = r5
            r1 = 0
            r5 = r0
            goto L_0x01ab
        L_0x006e:
            if (r20 != 0) goto L_0x0071
            goto L_0x007f
        L_0x0071:
            boolean r13 = r12.d
            if (r13 == 0) goto L_0x007f
            r14 = r19
            r6 = r21
            r16 = r5
            r1 = 0
            r5 = r0
            goto L_0x01ab
        L_0x007f:
            hfg r13 = r12.b
            if (r13 != 0) goto L_0x0085
            hfg r13 = defpackage.hfg.d
        L_0x0085:
            r14 = r19
            boolean r15 = r14.a(r13)
            if (r15 != 0) goto L_0x01a5
            aucx r9 = r13.a
            java.lang.Object r9 = r9.get(r6)
            ansk r9 = (defpackage.ansk) r9
            java.lang.String r9 = r9.b
            hfg r10 = r12.b
            if (r10 == 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            hfg r10 = defpackage.hfg.d
        L_0x009e:
            r11 = 5
            java.lang.Object r13 = r10.c(r11)
            aucd r13 = (defpackage.aucd) r13
            r13.a((defpackage.aucj) r10)
            boolean r10 = r13.c
            if (r10 != 0) goto L_0x00ae
            goto L_0x00b3
        L_0x00ae:
            r13.c()
            r13.c = r6
        L_0x00b3:
            aucj r10 = r13.b
            hfg r10 = (defpackage.hfg) r10
            aucx r15 = defpackage.aucj.s()
            r10.b = r15
            hfg r10 = r12.b
            if (r10 == 0) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            hfg r10 = defpackage.hfg.d
        L_0x00c4:
            aucx r10 = r10.b
            int r15 = r10.size()
        L_0x00ca:
            if (r6 >= r15) goto L_0x0195
            java.lang.Object r16 = r10.get(r6)
            r1 = r16
            hfp r1 = (defpackage.hfp) r1
            java.lang.Object r16 = r1.c(r11)
            r11 = r16
            aucd r11 = (defpackage.aucd) r11
            r11.a((defpackage.aucj) r1)
            aucj r1 = r11.b
            hfp r1 = (defpackage.hfp) r1
            int r1 = r1.e
            int r1 = defpackage.hfm.a(r1)
            if (r1 != 0) goto L_0x00ee
            r16 = r5
            goto L_0x00f4
        L_0x00ee:
            r16 = r5
            r5 = 1
            if (r1 == r5) goto L_0x00f4
            goto L_0x010f
        L_0x00f4:
            boolean r1 = r11.c
            if (r1 != 0) goto L_0x00f9
            goto L_0x00ff
        L_0x00f9:
            r11.c()
            r1 = 0
            r11.c = r1
        L_0x00ff:
            aucj r1 = r11.b
            hfp r1 = (defpackage.hfp) r1
            hfp r5 = defpackage.hfp.g
            int r5 = r0 + -1
            r1.e = r5
            int r5 = r1.a
            r5 = r5 | 8
            r1.a = r5
        L_0x010f:
            aucj r1 = r11.b
            hfp r1 = (defpackage.hfp) r1
            int r1 = r1.f
            int r1 = defpackage.hfo.a(r1)
            if (r1 != 0) goto L_0x011d
            r5 = 1
            goto L_0x0121
        L_0x011d:
            r5 = 1
            if (r1 == r5) goto L_0x0121
            goto L_0x013c
        L_0x0121:
            boolean r1 = r11.c
            if (r1 != 0) goto L_0x0126
            goto L_0x012c
        L_0x0126:
            r11.c()
            r1 = 0
            r11.c = r1
        L_0x012c:
            aucj r1 = r11.b
            hfp r1 = (defpackage.hfp) r1
            hfp r17 = defpackage.hfp.g
            int r5 = r4 + -1
            r1.f = r5
            int r5 = r1.a
            r5 = r5 | 16
            r1.a = r5
        L_0x013c:
            r5 = r0
            long r0 = r12.e
            int r17 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r17 > 0) goto L_0x016c
            aucj r0 = r11.b
            hfp r0 = (defpackage.hfp) r0
            int r0 = r0.f
            int r0 = defpackage.hfo.a(r0)
            if (r0 != 0) goto L_0x0150
            goto L_0x016c
        L_0x0150:
            r1 = 3
            if (r0 != r1) goto L_0x016c
            boolean r0 = r11.c
            if (r0 != 0) goto L_0x0158
            goto L_0x015e
        L_0x0158:
            r11.c()
            r0 = 0
            r11.c = r0
        L_0x015e:
            aucj r0 = r11.b
            hfp r0 = (defpackage.hfp) r0
            hfp r17 = defpackage.hfp.g
            r0.e = r1
            int r1 = r0.a
            r1 = r1 | 8
            r0.a = r1
        L_0x016c:
            aucj r0 = r11.i()
            hfp r0 = (defpackage.hfp) r0
            boolean r1 = r13.c
            if (r1 != 0) goto L_0x0178
            r1 = 0
            goto L_0x017e
        L_0x0178:
            r13.c()
            r1 = 0
            r13.c = r1
        L_0x017e:
            aucj r11 = r13.b
            hfg r11 = (defpackage.hfg) r11
            r0.getClass()
            r11.b()
            aucx r11 = r11.b
            r11.add(r0)
            int r6 = r6 + 1
            r0 = r5
            r5 = r16
            r11 = 5
            goto L_0x00ca
        L_0x0195:
            r16 = r5
            r1 = 0
            r5 = r0
            aucj r0 = r13.i()
            hfg r0 = (defpackage.hfg) r0
            r6 = r21
            r6.put(r9, r0)
            goto L_0x01bb
        L_0x01a5:
            r6 = r21
            r16 = r5
            r1 = 0
            r5 = r0
        L_0x01ab:
            int r11 = r11 + 1
            r0 = r5
            r5 = r16
            r6 = 0
            goto L_0x0058
        L_0x01b3:
            r14 = r19
            r6 = r21
            r16 = r5
            r1 = 0
            r5 = r0
        L_0x01bb:
            int r7 = r7 + 1
            r0 = r5
            r5 = r16
            r6 = 0
            goto L_0x0047
        L_0x01c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfz.a(java.util.List, amrm, boolean, java.util.Map):void");
    }

    public static boolean a(hfg hfg) {
        return hfg.c.isEmpty() && hfg.b.isEmpty();
    }

    public static boolean a(hfg hfg, Collection collection) {
        ansk ansk = (ansk) hfg.a.get(0);
        String str = ansk.b;
        long j = ansk.e;
        int i = ansk.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ansk ansk2 = (ansk) it.next();
            if (str.equals(ansk2.b) && j == ansk2.e && i == ansk2.d) {
                return true;
            }
        }
        return false;
    }

    public final hgh a(hfk hfk, anax anax, anax anax2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        hfk hfk2 = hfk;
        nz nzVar = new nz();
        a(hfk2.c, hfs.a, true, nzVar);
        hfg a = a(g(), (Map) nzVar);
        if (!z2 || !awxo.d()) {
            z3 = false;
        } else {
            z3 = true;
        }
        hgk hgk = new hgk(hfk, z2, anax, anax2, z3);
        hgh a2 = a((Map) nzVar, (hgm) hgk);
        if (a2 == null) {
            return null;
        }
        int i = 128;
        if (z) {
            nz a3 = a(a2, (Map) nzVar, anax);
            nz nzVar2 = new nz();
            a(hfk2.c, amrq.ALWAYS_FALSE, true, nzVar2);
            bpw a4 = bpw.a(a2.a, bmy.b);
            ob obVar = new ob();
            ob obVar2 = new ob();
            int i2 = 0;
            for (hfg hfg : nzVar2.values()) {
                if (hgi.a(hfg, i)) {
                    i2++;
                    String str = ((ansk) hfg.a.get(0)).b;
                    if (a3.containsKey(str)) {
                        obVar.add((ansk) hfg.a.get(0));
                    } else if (nzVar.containsKey(str)) {
                        int a5 = a4.a((Object) (ansk) ((hfg) nzVar.get(str)).a.get(0));
                        if (a5 >= 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        amtf.a(z4);
                        obVar2.add((ansk) a4.get(a5));
                    }
                    i = 128;
                } else {
                    i = 128;
                }
            }
            if (obVar.b != i2) {
                nzVar.clear();
                a(hfk2.c, new hft(obVar), true, nzVar);
                hfg a6 = a(g(), (Map) nzVar);
                hgh a7 = a((Map) nzVar, (hgm) hgk);
                if (a7 == null) {
                    return null;
                }
                a = a6;
                a2 = a7;
            }
            if (!obVar2.isEmpty()) {
                a2 = a2.a(obVar2);
            }
        }
        Context context = this.a;
        Collection<hfg> values = nzVar.values();
        bpw bpw = a2.a;
        hhr hhr = new hhr();
        for (hfg hfg2 : values) {
            aucx aucx = hfg2.a;
            int size = aucx.size();
            for (int i3 = 0; i3 < size; i3++) {
                ansk ansk = (ansk) aucx.get(i3);
                if (!bpw.contains(ansk)) {
                    hhr.a(ansk, 14);
                }
            }
        }
        hhr.a(context);
        if (z2 && !hgi.a(a, 128)) {
            if (awxo.d()) {
                Log.i("ModuleSetMgr", "Container features not yet downloaded are disabled.");
            } else {
                Log.i("ModuleSetMgr", "Discarding container Zapp APKs.");
                anab a8 = anaf.a(a2.e.size());
                anhj a9 = a2.e.iterator();
                while (a9.hasNext()) {
                    bmr bmr = (bmr) a9.next();
                    hfp hfp = (hfp) a2.c.get(bmr);
                    amtf.a((Object) hfp);
                    a8.a(bmr, hfp);
                }
                return new hgh(a2.a, a2.b, a8.a(), anfv.a, a2.e);
            }
        }
        return a2;
    }

    public final hgh a(Map map, hgm hgm) {
        try {
            return hgi.a(map, g(), hgm);
        } catch (InvalidConfigException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("Failed to merge module sets: ");
            sb.append(valueOf);
            Log.e("ModuleSetMgr", sb.toString());
            hem.a().a(this.a, 22, "merge");
            hgi.a(this.a, map.values(), 4, true);
            return null;
        }
    }

    public final Collection a(anax anax) {
        Collection h = blu.a(this.a).h();
        Set a = a(anax, anax.isEmpty(), hgi.a(h));
        if (a != null) {
            hgi.a(this.a, (Collection) a, h);
        }
        return a;
    }

    public final Set a(anax anax, boolean z, anax anax2) {
        hfk d;
        if (b()) {
            Log.e("ModuleSetMgr", "not migrated with user locked");
            return null;
        }
        synchronized (this.e) {
            d = d();
        }
        hgh a = a(d, anax2, anax, z, d.f);
        if (a != null) {
            return hgi.a(a, (Set) anax2, !anax.isEmpty());
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(hfk hfk) {
        byte[] k = hfk.k();
        File file = new File(this.b, "pending_modulesets.pb");
        File a = a(this.b);
        new File(this.b, "current_modulesets.pb").delete();
        boolean z = false;
        if (bkq.a(k, file, a, false) > 0) {
            z = true;
        }
        if (aekv.a() && z) {
            this.d = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01c9, code lost:
        if (r15 == false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01cb, code lost:
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r21).length() + 23) + java.lang.String.valueOf(r22).length());
        r5.append(r0);
        r5.append(":");
        r5.append(r2);
        r5.append(" ingested successfully");
        r5.toString();
        r3 = defpackage.hem.a();
        r5 = r20.a;
        r8 = new java.lang.StringBuilder((java.lang.String.valueOf(r21).length() + 1) + java.lang.String.valueOf(r22).length());
        r8.append(r0);
        r8.append(":");
        r8.append(r2);
        r3.a(r5, 21, r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x022a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x022b, code lost:
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r21, java.lang.String r22, java.io.File r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            java.lang.String r3 = java.lang.String.valueOf(r21)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r22)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 32
            int r3 = r3 + r6
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r3 = "Processing download for module "
            r5.append(r3)
            r5.append(r0)
            java.lang.String r3 = ":"
            r5.append(r3)
            r5.append(r2)
            r5.toString()
            long r3 = r23.length()
            android.content.Context r5 = r1.a
            blu r5 = defpackage.blu.a((android.content.Context) r5)
            java.io.File r5 = r5.d()
            if (r5 == 0) goto L_0x0047
            long r7 = r5.getUsableSpace()
            goto L_0x0049
        L_0x0047:
            r7 = 0
        L_0x0049:
            ikz r5 = defpackage.heh.i
            java.lang.Object r5 = r5.c()
            java.lang.Long r5 = (java.lang.Long) r5
            long r9 = r5.longValue()
            long r9 = r9 * r3
            r3 = 100
            long r9 = r9 / r3
            r3 = 0
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x0237
            bmr r4 = new bmr
            r4.<init>(r0, r2)
            android.content.Context r5 = r1.a
            blu r5 = defpackage.blu.a((android.content.Context) r5)
            boolean r7 = r5.b()
            if (r7 != 0) goto L_0x0235
            java.lang.Object r16 = defpackage.blu.f
            monitor-enter(r16)
            bpu r13 = defpackage.bkn.a()     // Catch:{ all -> 0x0232 }
            java.io.File r14 = r5.d()     // Catch:{ all -> 0x0232 }
            r15 = 1
            if (r14 != 0) goto L_0x0081
            r1 = 1
            goto L_0x01c0
        L_0x0081:
            boolean r7 = r14.isDirectory()     // Catch:{ all -> 0x0232 }
            if (r7 == 0) goto L_0x01bf
            bpe r7 = r5.k()     // Catch:{ all -> 0x022e }
            r8 = 5
            java.lang.Object r8 = r7.c(r8)     // Catch:{ all -> 0x022e }
            r12 = r8
            aucd r12 = (defpackage.aucd) r12     // Catch:{ all -> 0x022e }
            r12.a((defpackage.aucj) r7)     // Catch:{ all -> 0x022e }
            bkw r10 = new bkw     // Catch:{ all -> 0x022e }
            android.content.Context r7 = r5.a     // Catch:{ all -> 0x022e }
            r10.<init>(r7)     // Catch:{ all -> 0x022e }
            r11 = 0
            r7 = r5
            r8 = r12
            r9 = r14
            r6 = r12
            r12 = r13
            r7.a((defpackage.aucd) r8, (java.io.File) r9, (defpackage.bkw) r10, (java.util.Set) r11, (defpackage.bpu) r12)     // Catch:{ all -> 0x022e }
            android.net.Uri$Builder r7 = new android.net.Uri$Builder     // Catch:{ all -> 0x022e }
            r7.<init>()     // Catch:{ all -> 0x022e }
            java.lang.String r8 = "download"
            android.net.Uri$Builder r7 = r7.scheme(r8)     // Catch:{ all -> 0x022e }
            java.lang.String r8 = r4.a     // Catch:{ all -> 0x022e }
            android.net.Uri$Builder r7 = r7.appendPath(r8)     // Catch:{ all -> 0x022e }
            java.lang.String r8 = r4.b     // Catch:{ all -> 0x022e }
            android.net.Uri$Builder r7 = r7.appendPath(r8)     // Catch:{ all -> 0x022e }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x022e }
            bpd r8 = defpackage.bpd.j     // Catch:{ all -> 0x022e }
            aucd r12 = r8.o()     // Catch:{ all -> 0x022e }
            boolean r8 = r12.c     // Catch:{ all -> 0x022e }
            if (r8 != 0) goto L_0x00cc
            goto L_0x00d1
        L_0x00cc:
            r12.c()     // Catch:{ all -> 0x022e }
            r12.c = r3     // Catch:{ all -> 0x022e }
        L_0x00d1:
            aucj r8 = r12.b     // Catch:{ all -> 0x022e }
            bpd r8 = (defpackage.bpd) r8     // Catch:{ all -> 0x022e }
            r7.getClass()     // Catch:{ all -> 0x022e }
            int r9 = r8.a     // Catch:{ all -> 0x022e }
            r9 = r9 | r15
            r8.a = r9     // Catch:{ all -> 0x022e }
            r8.b = r7     // Catch:{ all -> 0x022e }
            r10 = 2
            r8.g = r10     // Catch:{ all -> 0x022e }
            r9 = r9 | 16
            r8.a = r9     // Catch:{ all -> 0x022e }
            aucj r8 = r6.b     // Catch:{ all -> 0x022e }
            bpe r8 = (defpackage.bpe) r8     // Catch:{ all -> 0x022e }
            aucx r8 = r8.c     // Catch:{ all -> 0x022e }
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)     // Catch:{ all -> 0x022e }
            aucj r9 = r12.i()     // Catch:{ all -> 0x022e }
            bpd r9 = (defpackage.bpd) r9     // Catch:{ all -> 0x022e }
            java.util.Comparator r10 = defpackage.blz.c     // Catch:{ all -> 0x022e }
            int r8 = java.util.Collections.binarySearch(r8, r9, r10)     // Catch:{ all -> 0x022e }
            if (r8 < 0) goto L_0x0135
            defpackage.bkn.b()     // Catch:{ all -> 0x0232 }
            awxo r9 = defpackage.awxo.a     // Catch:{ all -> 0x0232 }
            awxv r9 = r9.a()     // Catch:{ all -> 0x0232 }
            boolean r9 = r9.a()     // Catch:{ all -> 0x0232 }
            if (r9 != 0) goto L_0x010e
            goto L_0x0117
        L_0x010e:
            bpd r9 = r6.c((int) r8)     // Catch:{ all -> 0x0232 }
            boolean r9 = r9.d     // Catch:{ all -> 0x0232 }
            if (r9 != 0) goto L_0x0117
            goto L_0x0135
        L_0x0117:
            java.lang.String r4 = "FileApkMgr"
            java.lang.String r5 = "Ignoring attempt to re-stage previously ingested download: "
            java.lang.String r6 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0232 }
            int r7 = r6.length()     // Catch:{ all -> 0x0232 }
            if (r7 != 0) goto L_0x012b
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0232 }
            r6.<init>(r5)     // Catch:{ all -> 0x0232 }
            goto L_0x012f
        L_0x012b:
            java.lang.String r6 = r5.concat(r6)     // Catch:{ all -> 0x0232 }
        L_0x012f:
            android.util.Log.w(r4, r6)     // Catch:{ all -> 0x0232 }
            r1 = 1
            goto L_0x01c8
        L_0x0135:
            if (r8 >= 0) goto L_0x0143
            aucj r7 = r12.i()     // Catch:{ all -> 0x0232 }
            bpd r7 = (defpackage.bpd) r7     // Catch:{ all -> 0x0232 }
            int r8 = defpackage.blz.a((defpackage.aucd) r6, (int) r8, (defpackage.bpd) r7)     // Catch:{ all -> 0x0232 }
            r11 = r8
            goto L_0x0144
        L_0x0143:
            r11 = r8
        L_0x0144:
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x022e }
            java.lang.String r8 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x022e }
            int r8 = r8.length()     // Catch:{ all -> 0x022e }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x022e }
            int r8 = r8 + 9
            r9.<init>(r8)     // Catch:{ all -> 0x022e }
            java.lang.String r8 = "Staging: "
            r9.append(r8)     // Catch:{ all -> 0x022e }
            r9.append(r7)     // Catch:{ all -> 0x022e }
            r9.toString()     // Catch:{ all -> 0x022e }
            bls r7 = new bls     // Catch:{ all -> 0x022e }
            r8 = r23
            r7.<init>(r8, r4)     // Catch:{ all -> 0x022e }
            r9 = 1
            java.util.List r17 = java.util.Collections.singletonList(r7)     // Catch:{ all -> 0x022e }
            r18 = 0
            r7 = r5
            r8 = r13
            r10 = r6
            r13 = r11
            r11 = r12
            r19 = r12
            r12 = r13
            r3 = r13
            r13 = r17
            r1 = 1
            r15 = r18
            boolean r7 = r7.a(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x022e }
            if (r7 == 0) goto L_0x01b2
            aucj r4 = r19.i()     // Catch:{ all -> 0x022e }
            bpd r4 = (defpackage.bpd) r4     // Catch:{ all -> 0x022e }
            r6.a((int) r3, (defpackage.bpd) r4)     // Catch:{ all -> 0x022e }
            defpackage.blz.a((defpackage.aucd) r6)     // Catch:{ all -> 0x022e }
            java.io.File r3 = r5.b     // Catch:{ all -> 0x022e }
            aucj r4 = r6.i()     // Catch:{ all -> 0x022e }
            bpe r4 = (defpackage.bpe) r4     // Catch:{ all -> 0x022e }
            boolean r3 = r5.a((java.io.File) r3, (defpackage.bpe) r4, (boolean) r1)     // Catch:{ all -> 0x022e }
            if (r3 != 0) goto L_0x01b0
            java.lang.String r3 = "FileApkMgr"
            java.lang.String r4 = "Failed to write config file"
            android.util.Log.e(r3, r4)     // Catch:{ all -> 0x022e }
            android.content.Context r3 = r5.a     // Catch:{ all -> 0x022e }
            java.lang.String r4 = "fileapk"
            r5 = 32
            defpackage.bla.a(r3, r5, r4)     // Catch:{ all -> 0x022e }
            r15 = 0
            goto L_0x01c8
        L_0x01b0:
            r15 = 1
            goto L_0x01c8
        L_0x01b2:
            android.content.Context r3 = r5.a     // Catch:{ all -> 0x022e }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x022e }
            r5 = 46
            defpackage.bla.a(r3, r5, r4)     // Catch:{ all -> 0x022e }
            r15 = 0
            goto L_0x01c8
        L_0x01bf:
            r1 = 1
        L_0x01c0:
            java.lang.String r3 = "FileApkMgr"
            java.lang.String r4 = "Failed to get module files directory"
            android.util.Log.e(r3, r4)     // Catch:{ all -> 0x022e }
            r15 = 0
        L_0x01c8:
            monitor-exit(r16)     // Catch:{ all -> 0x022e }
            if (r15 == 0) goto L_0x022b
            java.lang.String r3 = java.lang.String.valueOf(r21)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r22)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 23
            int r3 = r3 + r4
            r5.<init>(r3)
            r5.append(r0)
            java.lang.String r3 = ":"
            r5.append(r3)
            r5.append(r2)
            java.lang.String r3 = " ingested successfully"
            r5.append(r3)
            r5.toString()
            hem r3 = defpackage.hem.a()
            r4 = 1
            r1 = r20
            android.content.Context r5 = r1.a
            java.lang.String r6 = java.lang.String.valueOf(r21)
            int r6 = r6.length()
            java.lang.String r7 = java.lang.String.valueOf(r22)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r6 = r6 + r4
            int r6 = r6 + r7
            r8.<init>(r6)
            r8.append(r0)
            java.lang.String r0 = ":"
            r8.append(r0)
            r8.append(r2)
            r0 = 21
            java.lang.String r2 = r8.toString()
            r3.a(r5, r0, r2)
            return r4
        L_0x022b:
            r1 = r20
            goto L_0x0235
        L_0x022e:
            r0 = move-exception
            r1 = r20
            goto L_0x0233
        L_0x0232:
            r0 = move-exception
        L_0x0233:
            monitor-exit(r16)     // Catch:{ all -> 0x0232 }
            throw r0
        L_0x0235:
            r0 = 0
            return r0
        L_0x0237:
            r0 = 0
            hem r2 = defpackage.hem.a()
            android.content.Context r3 = r1.a
            r4 = 35
            r2.a(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hfz.a(java.lang.String, java.lang.String, java.io.File):boolean");
    }
}
