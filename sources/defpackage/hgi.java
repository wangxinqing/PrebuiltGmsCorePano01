package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: hgi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hgi {
    public static final Comparator a = hga.a;
    public static final Comparator b = hgb.a;
    private static final amsk c = amsk.a(',').b().a();
    private static final amsk d = amsk.a(':').b().a();

    public static anax a(Collection collection) {
        anav c2 = anax.c(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bmr bmr = ((blk) it.next()).i;
            if (bmr != null) {
                c2.b(bmr);
            }
        }
        return c2.a();
    }

    public static boolean a(long j, long j2) {
        return j / 1000000 < j2 / 1000000;
    }

    public static boolean a(ansk ansk, int i) {
        return (ansk.d & i) != 0;
    }

    public static hfg b(String str) {
        aucd o = hfg.d.o();
        o.a(a(str));
        return (hfg) o.i();
    }

    public static ancq a(bpw bpw, Set set, hhr hhr) {
        amxc p = amxc.p();
        boolean k = awxo.a.a().k();
        int size = bpw.size();
        for (int i = 0; i < size; i++) {
            hfg hfg = (hfg) bpw.get(i);
            if (a(hfg, hhr)) {
                String str = ((ansk) hfg.a.get(0)).b;
                if (set.contains(str)) {
                    hhr.a(hfg, 6);
                } else {
                    List a2 = p.a(str);
                    if (!k || a2.isEmpty() || a((hfg) a2.get(0), hfg)) {
                        a2.add(0, hfg);
                    }
                }
            }
        }
        return p;
    }

    public static String b(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            hfg hfg = (hfg) it.next();
            if (!z) {
                sb.append(";");
            }
            sb.append(bmy.a((List) hfg.a));
            z = false;
        }
        return sb.toString();
    }

    public static boolean b(hfg hfg, hfg hfg2) {
        String str = ((ansk) hfg.a.get(0)).b;
        String str2 = ((ansk) hfg2.a.get(0)).b;
        if (str.equals(str2)) {
            return a(hfg, hfg2);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length());
        sb.append("ModuleSetId not the same: ");
        sb.append(str);
        sb.append(" vs ");
        sb.append(str2);
        Log.e("ModuleSetUtils", sb.toString());
        return false;
    }

    public static ansk a(String str) {
        long j;
        int a2 = jjl.a(201216073);
        int i = 99;
        if (a2 <= 0) {
            a2 = 99;
        }
        int b2 = jjl.b("20.12.16 (080306-{{cl}})");
        int c2 = jjl.c("20.12.16 (080306-{{cl}})");
        int d2 = jjl.d("20.12.16 (080306-{{cl}})");
        if (b2 == -1 || c2 == -1 || d2 == -1) {
            d2 = 99;
            c2 = 99;
        } else {
            i = b2;
        }
        if (awxs.a.a().a()) {
            j = (((long) a2) * 10000000) + 9000000 + (((long) i) * 10000) + (((long) c2) * 100) + ((long) d2);
        } else {
            j = (((long) a2) * 1000000) + (((long) i) * 10000) + (((long) c2) * 100) + ((long) d2);
        }
        aucd o = ansk.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ansk ansk = (ansk) o.b;
        str.getClass();
        int i2 = ansk.a | 1;
        ansk.a = i2;
        ansk.b = str;
        int i3 = i2 | 2;
        ansk.a = i3;
        ansk.c = (int) (j / 10000);
        int i4 = i3 | 8;
        ansk.a = i4;
        ansk.e = j;
        ansk.a = i4 | 4;
        ansk.d = 64;
        return (ansk) o.i();
    }

    public static bmr a(hfp hfp) {
        return new bmr(hfp.b, hfp.d);
    }

    public static bpw a(List list) {
        return bpw.b(list, b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008e A[SYNTHETIC, Splitter:B:32:0x008e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.hfg a(android.content.res.Resources r7) {
        /*
            java.lang.String r0 = "ConfigFileUtils"
            java.lang.String r1 = "ChimeraModuleSet.pb"
            r2 = 0
            android.content.res.AssetManager r7 = r7.getAssets()     // Catch:{ IOException -> 0x0068 }
            r3 = 3
            java.io.InputStream r7 = r7.open(r1, r3)     // Catch:{ IOException -> 0x0068 }
            r3 = 4
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)     // Catch:{ all -> 0x005c }
            byte[] r4 = r3.array()     // Catch:{ all -> 0x005c }
            defpackage.bkq.a(r7, r4)     // Catch:{ all -> 0x005c }
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ all -> 0x005c }
            r3.order(r4)     // Catch:{ all -> 0x005c }
            int r3 = r3.getInt()     // Catch:{ all -> 0x005c }
            if (r3 >= 0) goto L_0x0026
            goto L_0x0035
        L_0x0026:
            r4 = 10000(0x2710, float:1.4013E-41)
            if (r3 > r4) goto L_0x0035
            byte[] r1 = new byte[r3]     // Catch:{ all -> 0x005c }
            defpackage.bkq.a(r7, r1)     // Catch:{ all -> 0x005c }
            if (r7 == 0) goto L_0x0034
            r7.close()     // Catch:{ IOException -> 0x0068 }
        L_0x0034:
            goto L_0x008c
        L_0x0035:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r5 = 62
            r4.<init>(r5)     // Catch:{ all -> 0x005c }
            java.lang.String r5 = "Asset "
            r4.append(r5)     // Catch:{ all -> 0x005c }
            r4.append(r1)     // Catch:{ all -> 0x005c }
            java.lang.String r1 = " has bad prefixed length: "
            r4.append(r1)     // Catch:{ all -> 0x005c }
            r4.append(r3)     // Catch:{ all -> 0x005c }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x005c }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x005c }
            if (r7 == 0) goto L_0x005a
            r7.close()     // Catch:{ IOException -> 0x0068 }
            r1 = r2
            goto L_0x008c
        L_0x005a:
            r1 = r2
            goto L_0x008c
        L_0x005c:
            r1 = move-exception
            if (r7 == 0) goto L_0x0067
            r7.close()     // Catch:{ all -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            r7 = move-exception
            defpackage.apev.a((java.lang.Throwable) r1, (java.lang.Throwable) r7)     // Catch:{ IOException -> 0x0068 }
        L_0x0067:
            throw r1     // Catch:{ IOException -> 0x0068 }
        L_0x0068:
            r7 = move-exception
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r1 = java.lang.String.valueOf(r7)
            int r1 = r1.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 42
            r3.<init>(r1)
            java.lang.String r1 = "Failed to read asset ChimeraModuleSet.pb: "
            r3.append(r1)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.e(r0, r7)
            r1 = r2
        L_0x008c:
            if (r1 == 0) goto L_0x0152
            hfg r7 = defpackage.hfg.d     // Catch:{ auda -> 0x012d }
            aucd r7 = r7.o()     // Catch:{ auda -> 0x012d }
            aubs r0 = defpackage.aubs.b()     // Catch:{ auda -> 0x012d }
            r7.b(r1, r0)     // Catch:{ auda -> 0x012d }
            aucj r7 = r7.i()     // Catch:{ auda -> 0x012d }
            hfg r7 = (defpackage.hfg) r7     // Catch:{ auda -> 0x012d }
            r0 = 5
            java.lang.Object r1 = r7.c(r0)     // Catch:{ auda -> 0x012d }
            aucd r1 = (defpackage.aucd) r1     // Catch:{ auda -> 0x012d }
            r1.a((defpackage.aucj) r7)     // Catch:{ auda -> 0x012d }
            boolean r7 = r1.c     // Catch:{ auda -> 0x012d }
            r3 = 0
            if (r7 != 0) goto L_0x00b1
            goto L_0x00b6
        L_0x00b1:
            r1.c()     // Catch:{ auda -> 0x012d }
            r1.c = r3     // Catch:{ auda -> 0x012d }
        L_0x00b6:
            aucj r7 = r1.b     // Catch:{ auda -> 0x012d }
            hfg r7 = (defpackage.hfg) r7     // Catch:{ auda -> 0x012d }
            aucx r4 = defpackage.aucj.s()     // Catch:{ auda -> 0x012d }
            r7.a = r4     // Catch:{ auda -> 0x012d }
            java.lang.String r7 = "container"
            ansk r7 = a((java.lang.String) r7)     // Catch:{ auda -> 0x012d }
            r1.a((defpackage.ansk) r7)     // Catch:{ auda -> 0x012d }
            r7 = 0
        L_0x00ca:
            aucj r4 = r1.b     // Catch:{ auda -> 0x012d }
            hfg r4 = (defpackage.hfg) r4     // Catch:{ auda -> 0x012d }
            aucx r4 = r4.c     // Catch:{ auda -> 0x012d }
            int r4 = r4.size()     // Catch:{ auda -> 0x012d }
            if (r7 >= r4) goto L_0x0126
            aucj r4 = r1.b     // Catch:{ auda -> 0x012d }
            hfg r4 = (defpackage.hfg) r4     // Catch:{ auda -> 0x012d }
            aucx r4 = r4.c     // Catch:{ auda -> 0x012d }
            java.lang.Object r4 = r4.get(r7)     // Catch:{ auda -> 0x012d }
            bob r4 = (defpackage.bob) r4     // Catch:{ auda -> 0x012d }
            java.lang.Object r5 = r4.c(r0)     // Catch:{ auda -> 0x012d }
            aucd r5 = (defpackage.aucd) r5     // Catch:{ auda -> 0x012d }
            r5.a((defpackage.aucj) r4)     // Catch:{ auda -> 0x012d }
            boolean r4 = r5.c     // Catch:{ auda -> 0x012d }
            if (r4 != 0) goto L_0x00f0
            goto L_0x00f5
        L_0x00f0:
            r5.c()     // Catch:{ auda -> 0x012d }
            r5.c = r3     // Catch:{ auda -> 0x012d }
        L_0x00f5:
            aucj r4 = r5.b     // Catch:{ auda -> 0x012d }
            bob r4 = (defpackage.bob) r4     // Catch:{ auda -> 0x012d }
            bob r6 = defpackage.bob.f     // Catch:{ auda -> 0x012d }
            int r6 = r4.a     // Catch:{ auda -> 0x012d }
            r6 = r6 | 8
            r4.a = r6     // Catch:{ auda -> 0x012d }
            r6 = 1
            r4.e = r6     // Catch:{ auda -> 0x012d }
            aucj r4 = r5.i()     // Catch:{ auda -> 0x012d }
            bob r4 = (defpackage.bob) r4     // Catch:{ auda -> 0x012d }
            boolean r5 = r1.c     // Catch:{ auda -> 0x012d }
            if (r5 != 0) goto L_0x010f
            goto L_0x0114
        L_0x010f:
            r1.c()     // Catch:{ auda -> 0x012d }
            r1.c = r3     // Catch:{ auda -> 0x012d }
        L_0x0114:
            aucj r5 = r1.b     // Catch:{ auda -> 0x012d }
            hfg r5 = (defpackage.hfg) r5     // Catch:{ auda -> 0x012d }
            r4.getClass()     // Catch:{ auda -> 0x012d }
            r5.c()     // Catch:{ auda -> 0x012d }
            aucx r5 = r5.c     // Catch:{ auda -> 0x012d }
            r5.set(r7, r4)     // Catch:{ auda -> 0x012d }
            int r7 = r7 + 1
            goto L_0x00ca
        L_0x0126:
            aucj r7 = r1.i()     // Catch:{ auda -> 0x012d }
            hfg r7 = (defpackage.hfg) r7     // Catch:{ auda -> 0x012d }
            return r7
        L_0x012d:
            r7 = move-exception
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 37
            r1.<init>(r0)
            java.lang.String r0 = "Invalid container module set format: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r0 = "ModuleSetUtils"
            android.util.Log.e(r0, r7)
        L_0x0152:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgi.a(android.content.res.Resources):hfg");
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [aucj] */
    /* JADX WARNING: type inference failed for: r1v41, types: [aucj] */
    /* JADX WARNING: type inference failed for: r0v29, types: [aucj] */
    /* JADX WARNING: type inference failed for: r0v36, types: [aucj] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0220 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x022e A[LOOP:8: B:74:0x022c->B:75:0x022e, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.hgh a(java.util.Map r25, defpackage.hfg r26, defpackage.hgm r27) {
        /*
            r0 = r25
            r1 = r26
            r2 = r27
            awxs r3 = defpackage.awxs.a
            awxt r3 = r3.a()
            boolean r3 = r3.I()
            java.lang.String r4 = "Can't locate container module set"
            java.lang.String r5 = "container"
            r7 = 0
            if (r3 == 0) goto L_0x04b9
            java.util.Collection r3 = r25.values()
            ou r8 = new ou
            r8.<init>()
            ou r9 = new ou
            r9.<init>()
            boolean r0 = r27.a()
            ou r10 = new ou
            r10.<init>()
            ou r11 = new ou
            r11.<init>()
            ou r12 = new ou
            r12.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r13 = r3.size()
            r1.<init>(r13)
            java.util.Iterator r13 = r3.iterator()
        L_0x0045:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x015d
            java.lang.Object r14 = r13.next()
            hfg r14 = (defpackage.hfg) r14
            aucx r15 = r14.a
            java.lang.Object r15 = r15.get(r7)
            ansk r15 = (defpackage.ansk) r15
            java.lang.String r6 = r15.b
            boolean r15 = a((defpackage.ansk) r15, (boolean) r7)
            aucx r7 = r14.c
            int r7 = r7.size()
            amzt r7 = defpackage.amzy.b((int) r7)
            r25 = r13
            aucx r13 = r14.c
            r17 = r4
            int r4 = r13.size()
            r18 = r5
            r5 = 0
        L_0x0076:
            if (r5 >= r4) goto L_0x0149
            java.lang.Object r19 = r13.get(r5)
            r26 = r4
            r4 = r19
            bob r4 = (defpackage.bob) r4
            r19 = r13
            hgc r13 = defpackage.hgc.a((defpackage.bob) r4)
            if (r0 == 0) goto L_0x00dd
            boolean r20 = r2.a((defpackage.bob) r4, (defpackage.hfg) r14)
            if (r20 != 0) goto L_0x0096
            r20 = r0
            r22 = 0
            goto L_0x0139
        L_0x0096:
            r20 = r0
            boolean r0 = r4.d
            if (r0 != 0) goto L_0x009e
            r0 = r10
            goto L_0x009f
        L_0x009e:
            r0 = r11
        L_0x009f:
            boolean r0 = a((defpackage.ou) r0, (defpackage.hgc) r13, (java.lang.String) r6, (boolean) r15)
            if (r0 == 0) goto L_0x00da
            boolean r13 = r4.d
            if (r13 == 0) goto L_0x00da
            r13 = 5
            java.lang.Object r21 = r4.c(r13)
            r13 = r21
            aucd r13 = (defpackage.aucd) r13
            r13.a((defpackage.aucj) r4)
            boolean r4 = r13.c
            if (r4 != 0) goto L_0x00bb
            r4 = 0
            goto L_0x00c1
        L_0x00bb:
            r13.c()
            r4 = 0
            r13.c = r4
        L_0x00c1:
            aucj r4 = r13.b
            bob r4 = (defpackage.bob) r4
            bob r21 = defpackage.bob.f
            r22 = r0
            int r0 = r4.a
            r0 = r0 | 4
            r4.a = r0
            r0 = 0
            r4.d = r0
            aucj r0 = r13.i()
            r4 = r0
            bob r4 = (defpackage.bob) r4
            goto L_0x0139
        L_0x00da:
            r22 = r0
            goto L_0x0139
        L_0x00dd:
            r20 = r0
            boolean r0 = r4.d
            if (r0 == 0) goto L_0x0133
            boolean r0 = r2.a((defpackage.bob) r4, (defpackage.hfg) r14)
            if (r0 == 0) goto L_0x0123
            boolean r0 = a((defpackage.ou) r11, (defpackage.hgc) r13, (java.lang.String) r6, (boolean) r15)
            if (r0 == 0) goto L_0x0120
            r13 = 5
            java.lang.Object r21 = r4.c(r13)
            r13 = r21
            aucd r13 = (defpackage.aucd) r13
            r13.a((defpackage.aucj) r4)
            boolean r4 = r13.c
            if (r4 != 0) goto L_0x0101
            r4 = 0
            goto L_0x0107
        L_0x0101:
            r13.c()
            r4 = 0
            r13.c = r4
        L_0x0107:
            aucj r4 = r13.b
            bob r4 = (defpackage.bob) r4
            bob r21 = defpackage.bob.f
            r22 = r0
            int r0 = r4.a
            r0 = r0 | 4
            r4.a = r0
            r0 = 0
            r4.d = r0
            aucj r0 = r13.i()
            r4 = r0
            bob r4 = (defpackage.bob) r4
            goto L_0x0139
        L_0x0120:
            r22 = r0
            goto L_0x0139
        L_0x0123:
            boolean r0 = r2.a((defpackage.hgc) r13, (boolean) r15)
            if (r0 == 0) goto L_0x0130
            boolean r0 = a((defpackage.ou) r12, (defpackage.hgc) r13, (java.lang.String) r6, (boolean) r15)
            r22 = r0
            goto L_0x0139
        L_0x0130:
            r22 = 0
            goto L_0x0139
        L_0x0133:
            boolean r0 = a((defpackage.ou) r10, (defpackage.hgc) r13, (java.lang.String) r6, (boolean) r15)
            r22 = r0
        L_0x0139:
            if (r22 != 0) goto L_0x013c
            goto L_0x013f
        L_0x013c:
            r7.c(r4)
        L_0x013f:
            int r5 = r5 + 1
            r4 = r26
            r13 = r19
            r0 = r20
            goto L_0x0076
        L_0x0149:
            r20 = r0
            amzy r0 = r7.a()
            r1.add(r0)
            r13 = r25
            r4 = r17
            r5 = r18
            r0 = r20
            r7 = 0
            goto L_0x0045
        L_0x015d:
            r17 = r4
            r18 = r5
            bpw r4 = defpackage.blj.a((java.util.List) r1)
            hgc r5 = new hgc
            r5.<init>()
            int r6 = r4.size()
            r0 = 0
        L_0x016f:
            if (r0 < r6) goto L_0x0462
            nz r0 = new nz
            int r4 = r3.size()
            r0.<init>((int) r4)
            boolean r2 = r27.a()
            java.util.Iterator r3 = r3.iterator()
        L_0x0182:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x036f
            java.lang.Object r4 = r3.next()
            hfg r4 = (defpackage.hfg) r4
            aucx r5 = r4.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            ansk r5 = (defpackage.ansk) r5
            java.lang.String r5 = r5.b
            hfg r7 = defpackage.hfg.d
            aucd r7 = r7.o()
            aucx r10 = r4.a
            java.lang.Object r10 = r10.get(r6)
            ansk r10 = (defpackage.ansk) r10
            java.lang.String r6 = r10.b
            ob r11 = new ob
            aucx r12 = r4.c
            int r12 = r12.size()
            r11.<init>((int) r12)
            r12 = 0
        L_0x01b5:
            int r13 = r8.h
            if (r12 < r13) goto L_0x034e
            ob r13 = new ob
            r13.<init>()
            hgc r14 = new hgc
            r14.<init>()
        L_0x01c3:
            aucx r12 = r4.b
            int r15 = r12.size()
            r1 = 0
            r19 = 1
        L_0x01cc:
            if (r1 >= r15) goto L_0x024e
            java.lang.Object r20 = r12.get(r1)
            r26 = r3
            r3 = r20
            hfp r3 = (defpackage.hfp) r3
            boolean r20 = r13.contains(r3)
            if (r20 == 0) goto L_0x01e7
            r27 = r2
            r22 = r8
            r20 = r12
            r21 = r15
            goto L_0x0240
        L_0x01e7:
            if (r2 != 0) goto L_0x01f5
            r27 = r2
            aucx r2 = r3.c
            int r2 = r2.size()
            if (r2 != 0) goto L_0x01f7
            r2 = 1
            goto L_0x01f8
        L_0x01f5:
            r27 = r2
        L_0x01f7:
            r2 = 0
        L_0x01f8:
            r20 = r12
            aucx r12 = r3.c
            r21 = r15
            int r15 = r12.size()
            r22 = r8
            r8 = 0
        L_0x0205:
            if (r8 >= r15) goto L_0x0220
            java.lang.Object r23 = r12.get(r8)
            r24 = r12
            r12 = r23
            boc r12 = (defpackage.boc) r12
            r14.b((defpackage.boc) r12)
            int r8 = r8 + 1
            boolean r12 = r11.contains(r14)
            if (r12 == 0) goto L_0x021d
            goto L_0x0222
        L_0x021d:
            r12 = r24
            goto L_0x0205
        L_0x0220:
            if (r2 == 0) goto L_0x0240
        L_0x0222:
            r13.add(r3)
            aucx r2 = r3.c
            int r3 = r2.size()
            r8 = 0
        L_0x022c:
            if (r8 >= r3) goto L_0x023e
            java.lang.Object r12 = r2.get(r8)
            boc r12 = (defpackage.boc) r12
            hgc r12 = defpackage.hgc.a((defpackage.boc) r12)
            r11.add(r12)
            int r8 = r8 + 1
            goto L_0x022c
        L_0x023e:
            r19 = 0
        L_0x0240:
            int r1 = r1 + 1
            r3 = r26
            r2 = r27
            r12 = r20
            r15 = r21
            r8 = r22
            goto L_0x01cc
        L_0x024e:
            r27 = r2
            r26 = r3
            r22 = r8
            if (r19 == 0) goto L_0x0346
            boolean r1 = r13.isEmpty()
            if (r1 != 0) goto L_0x0269
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r13)
            java.util.Comparator r2 = a
            java.util.Collections.sort(r1, r2)
            r7.B((java.lang.Iterable) r1)
        L_0x0269:
            aucx r1 = r4.c
            int r1 = r1.size()
            if (r1 > 0) goto L_0x0278
            amzy r1 = defpackage.amzy.h()
            r12 = 0
            goto L_0x02fb
        L_0x0278:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            aucx r1 = r4.c
            int r4 = r1.size()
            r8 = 0
            r12 = 0
        L_0x028a:
            if (r8 >= r4) goto L_0x02f2
            java.lang.Object r15 = r1.get(r8)
            bob r15 = (defpackage.bob) r15
            r14.b((defpackage.bob) r15)
            boolean r19 = r11.contains(r14)
            if (r19 != 0) goto L_0x02b0
            r19 = r1
            boolean r1 = r15.d
            if (r1 != 0) goto L_0x02a2
            goto L_0x02ed
        L_0x02a2:
            java.lang.Object r1 = r9.get(r14)
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x02ed
            r2.add(r15)
            goto L_0x02ed
        L_0x02b0:
            r19 = r1
            boolean r1 = r15.d
            if (r1 == 0) goto L_0x02e8
            r1 = 5
            java.lang.Object r12 = r15.c(r1)
            aucd r12 = (defpackage.aucd) r12
            r12.a((defpackage.aucj) r15)
            boolean r1 = r12.c
            if (r1 != 0) goto L_0x02c6
            r1 = 0
            goto L_0x02cc
        L_0x02c6:
            r12.c()
            r1 = 0
            r12.c = r1
        L_0x02cc:
            aucj r15 = r12.b
            bob r15 = (defpackage.bob) r15
            bob r16 = defpackage.bob.f
            int r1 = r15.a
            r1 = r1 | 4
            r15.a = r1
            r1 = 0
            r15.d = r1
            aucj r1 = r12.i()
            r15 = r1
            bob r15 = (defpackage.bob) r15
            java.lang.String r1 = r15.b
            r3.add(r1)
            goto L_0x02e9
        L_0x02e8:
        L_0x02e9:
            r2.add(r15)
            r12 = 1
        L_0x02ed:
            int r8 = r8 + 1
            r1 = r19
            goto L_0x028a
        L_0x02f2:
            java.util.Comparator r1 = defpackage.blj.a
            java.util.Collections.sort(r2, r1)
            r7.z((java.lang.Iterable) r2)
            r1 = r3
        L_0x02fb:
            if (r12 == 0) goto L_0x02fe
            goto L_0x030b
        L_0x02fe:
            boolean r2 = r13.isEmpty()
            if (r2 == 0) goto L_0x030b
            r2 = 0
            boolean r3 = a((defpackage.ansk) r10, (boolean) r2)
            if (r3 == 0) goto L_0x0335
        L_0x030b:
            java.util.Collections.sort(r1)
            r2 = 5
            java.lang.Object r3 = r10.c(r2)
            aucd r3 = (defpackage.aucd) r3
            r3.a((defpackage.aucj) r10)
            boolean r2 = r3.c
            if (r2 != 0) goto L_0x031d
            goto L_0x0323
        L_0x031d:
            r3.c()
            r2 = 0
            r3.c = r2
        L_0x0323:
            aucj r2 = r3.b
            ansk r2 = (defpackage.ansk) r2
            ansk r4 = defpackage.ansk.g
            aucx r4 = defpackage.aucj.s()
            r2.f = r4
            r3.ak(r1)
            r7.l((defpackage.aucd) r3)
        L_0x0335:
            aucj r1 = r7.i()
            hfg r1 = (defpackage.hfg) r1
            r0.put(r5, r1)
            r3 = r26
            r2 = r27
            r8 = r22
            goto L_0x0182
        L_0x0346:
            r3 = r26
            r2 = r27
            r8 = r22
            goto L_0x01c3
        L_0x034e:
            r27 = r2
            r26 = r3
            r22 = r8
            java.lang.Object r1 = r8.c(r12)
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0367
            java.lang.Object r1 = r8.b((int) r12)
            hgc r1 = (defpackage.hgc) r1
            r11.add(r1)
        L_0x0367:
            int r12 = r12 + 1
            r3 = r26
            r2 = r27
            goto L_0x01b5
        L_0x036f:
            r7 = r18
            java.lang.Object r1 = r0.remove(r7)
            hfg r1 = (defpackage.hfg) r1
            if (r1 != 0) goto L_0x0382
            java.lang.String r1 = "container-missing"
            java.lang.Object r1 = r0.remove(r1)
            hfg r1 = (defpackage.hfg) r1
        L_0x0382:
            if (r1 == 0) goto L_0x045a
            java.util.Collection r0 = r0.values()
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
            r4 = 0
        L_0x038e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x03a9
            java.lang.Object r5 = r2.next()
            hfg r5 = (defpackage.hfg) r5
            aucx r6 = r5.a
            int r6 = r6.size()
            int r3 = r3 + r6
            aucx r5 = r5.b
            int r5 = r5.size()
            int r4 = r4 + r5
            goto L_0x038e
        L_0x03a9:
            r2 = 1
            int r3 = r3 + r2
            amzt r2 = defpackage.amzy.b((int) r3)
            aucx r3 = r1.b
            int r3 = r3.size()
            int r3 = r3 + r4
            anab r3 = defpackage.anaf.a((int) r3)
            aucx r5 = r1.b
            int r5 = r5.size()
            anav r5 = defpackage.anax.c(r5)
            anav r4 = defpackage.anax.c(r4)
            int r6 = r0.size()
            r13 = 1
            int r6 = r6 + r13
            amzt r6 = defpackage.amzy.b((int) r6)
            aucx r7 = r1.a
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            ansk r7 = (defpackage.ansk) r7
            r2.c(r7)
            aucx r7 = r1.c
            r6.c(r7)
            aucx r1 = r1.b
            int r7 = r1.size()
            r8 = 0
        L_0x03ea:
            if (r8 >= r7) goto L_0x03ff
            java.lang.Object r9 = r1.get(r8)
            hfp r9 = (defpackage.hfp) r9
            bmr r10 = a((defpackage.hfp) r9)
            r3.a(r10, r9)
            r5.b(r10)
            int r8 = r8 + 1
            goto L_0x03ea
        L_0x03ff:
            java.util.Iterator r0 = r0.iterator()
        L_0x0403:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0435
            java.lang.Object r1 = r0.next()
            hfg r1 = (defpackage.hfg) r1
            aucx r7 = r1.a
            r2.b((java.lang.Iterable) r7)
            aucx r7 = r1.c
            r6.c(r7)
            aucx r1 = r1.b
            int r7 = r1.size()
            r8 = 0
        L_0x0420:
            if (r8 >= r7) goto L_0x0403
            java.lang.Object r9 = r1.get(r8)
            hfp r9 = (defpackage.hfp) r9
            bmr r10 = a((defpackage.hfp) r9)
            r3.a(r10, r9)
            r4.b(r10)
            int r8 = r8 + 1
            goto L_0x0420
        L_0x0435:
            hgh r0 = new hgh
            amzy r1 = r2.a()
            java.util.Comparator r2 = defpackage.bmy.a
            bpw r10 = defpackage.bpw.b(r1, r2)
            amzy r1 = r6.a()
            bpw r11 = defpackage.blj.a((java.util.List) r1)
            anaf r12 = r3.a()
            anax r13 = r5.a()
            anax r14 = r4.a()
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            return r0
        L_0x045a:
            com.google.android.chimera.config.InvalidConfigException r0 = new com.google.android.chimera.config.InvalidConfigException
            r14 = r17
            r0.<init>((java.lang.String) r14)
            throw r0
        L_0x0462:
            r14 = r17
            r7 = r18
            r13 = 1
            java.lang.Object r1 = r4.get(r0)
            bob r1 = (defpackage.bob) r1
            boolean r15 = r1.d
            if (r15 != 0) goto L_0x0473
            r13 = r8
            goto L_0x0474
        L_0x0473:
            r13 = r9
        L_0x0474:
            if (r15 != 0) goto L_0x0478
            r15 = r10
            goto L_0x0479
        L_0x0478:
            r15 = r12
        L_0x0479:
            r5.b((defpackage.bob) r1)
            int r17 = r15.a((java.lang.Object) r5)
            if (r17 < 0) goto L_0x0483
            goto L_0x0490
        L_0x0483:
            boolean r1 = r1.d
            if (r1 != 0) goto L_0x048f
            int r17 = r11.a((java.lang.Object) r5)
            r15 = r11
            r1 = r17
            goto L_0x0492
        L_0x048f:
        L_0x0490:
            r1 = r17
        L_0x0492:
            if (r1 < 0) goto L_0x0497
            r17 = 1
            goto L_0x0499
        L_0x0497:
            r17 = 0
        L_0x0499:
            defpackage.amtf.a((boolean) r17)
            java.lang.Object r17 = r15.b((int) r1)
            r18 = r3
            r3 = r17
            hgc r3 = (defpackage.hgc) r3
            java.lang.Object r1 = r15.c(r1)
            java.lang.String r1 = (java.lang.String) r1
            r13.put(r3, r1)
            int r0 = r0 + 1
            r17 = r14
            r3 = r18
            r18 = r7
            goto L_0x016f
        L_0x04b9:
            r14 = r4
            r7 = r5
            java.lang.Object r3 = r0.get(r7)
            hfg r3 = (defpackage.hfg) r3
            if (r3 == 0) goto L_0x05a7
            if (r3 == r1) goto L_0x0509
            r4 = 64
            boolean r4 = a((defpackage.hfg) r3, (int) r4)
            if (r4 != 0) goto L_0x0507
            r4 = 5
            java.lang.Object r4 = r3.c(r4)
            aucd r4 = (defpackage.aucd) r4
            r4.a((defpackage.aucj) r3)
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x04dd
            r5 = 0
            goto L_0x04e3
        L_0x04dd:
            r4.c()
            r5 = 0
            r4.c = r5
        L_0x04e3:
            aucj r6 = r4.b
            hfg r6 = (defpackage.hfg) r6
            aucx r8 = defpackage.aucj.s()
            r6.c = r8
            aucx r1 = r1.c
            aucx r3 = r3.c
            amzy r1 = defpackage.amzy.a((java.lang.Object) r1, (java.lang.Object) r3)
            bpw r1 = defpackage.blj.c(r1)
            r4.z((java.lang.Iterable) r1)
            aucj r1 = r4.i()
            r3 = r1
            hfg r3 = (defpackage.hfg) r3
            r0.put(r7, r3)
            goto L_0x050a
        L_0x0507:
            r5 = 0
            goto L_0x050a
        L_0x0509:
            r5 = 0
        L_0x050a:
            java.util.Collection r0 = r25.values()
            hfg r0 = defpackage.hgj.a((java.util.Collection) r0, (defpackage.hgm) r2)
            java.util.Set r1 = java.util.Collections.singleton(r3)
            hfg r1 = defpackage.hgj.a((java.util.Collection) r1, (defpackage.hgm) r2)
            hfg r1 = defpackage.hgj.a((defpackage.hfg) r0, (defpackage.hfg) r1)
            hfg r0 = defpackage.hgj.a((defpackage.hfg) r0, (defpackage.hfg) r1)
            aucx r2 = r0.b
            int r2 = r2.size()
            aucx r3 = r1.b
            int r3 = r3.size()
            int r2 = r2 + r3
            anab r2 = defpackage.anaf.a((int) r2)
            aucx r3 = r0.b
            int r3 = r3.size()
            anav r3 = defpackage.anax.c(r3)
            aucx r4 = r1.b
            int r4 = r4.size()
            anav r4 = defpackage.anax.c(r4)
            aucx r6 = r0.b
            int r7 = r6.size()
            r8 = 0
        L_0x054e:
            if (r8 >= r7) goto L_0x0563
            java.lang.Object r9 = r6.get(r8)
            hfp r9 = (defpackage.hfp) r9
            bmr r10 = a((defpackage.hfp) r9)
            r2.a(r10, r9)
            r3.b(r10)
            int r8 = r8 + 1
            goto L_0x054e
        L_0x0563:
            aucx r6 = r1.b
            int r7 = r6.size()
        L_0x0569:
            if (r5 >= r7) goto L_0x057e
            java.lang.Object r8 = r6.get(r5)
            hfp r8 = (defpackage.hfp) r8
            bmr r9 = a((defpackage.hfp) r8)
            r2.a(r9, r8)
            r4.b(r9)
            int r5 = r5 + 1
            goto L_0x0569
        L_0x057e:
            hgh r5 = new hgh
            hgd r6 = new hgd
            r6.<init>(r0, r1)
            java.util.Comparator r7 = defpackage.bmy.a
            bpw r9 = defpackage.bpw.b(r6, r7)
            hge r6 = new hge
            r6.<init>(r0, r1)
            java.util.Comparator r0 = defpackage.blj.a
            bpw r10 = defpackage.bpw.b(r6, r0)
            anaf r11 = r2.a()
            anax r12 = r3.a()
            anax r13 = r4.a()
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            return r5
        L_0x05a7:
            com.google.android.chimera.config.InvalidConfigException r0 = new com.google.android.chimera.config.InvalidConfigException
            r0.<init>((java.lang.String) r14)
            goto L_0x05ae
        L_0x05ad:
            throw r0
        L_0x05ae:
            goto L_0x05ad
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgi.a(java.util.Map, hfg, hgm):hgh");
    }

    public static Set a(hgh hgh, Set set, boolean z) {
        if (hgh.c.isEmpty()) {
            return Collections.emptySet();
        }
        String valueOf = String.valueOf(hgh.c.keySet());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("All Zapp modules in module sets: ");
        sb.append(valueOf);
        sb.toString();
        String valueOf2 = String.valueOf(set);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
        sb2.append("Already downloaded modules: ");
        sb2.append(valueOf2);
        sb2.toString();
        ob obVar = new ob(hgh.c.size());
        anhj a2 = hgh.c.keySet().iterator();
        while (a2.hasNext()) {
            bmr bmr = (bmr) a2.next();
            if (!set.contains(bmr)) {
                hfp hfp = (hfp) hgh.c.get(bmr);
                amtf.a((Object) hfp);
                String str = hfp.b;
                String str2 = hfp.d;
                int a3 = hfm.a(hfp.e);
                boolean z2 = true;
                if (a3 == 0) {
                    a3 = 1;
                }
                int i = a3 - 1;
                if (i == 1) {
                    z2 = z;
                } else if (i == 2) {
                    z2 = false;
                }
                obVar.add(new hfy(str, str2, z2));
            }
        }
        return obVar;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Set a(java.lang.Iterable r5) {
        /*
            ob r0 = new ob
            r0.<init>()
            int r1 = r5.size()
            r2 = 0
        L_0x000a:
            if (r2 >= r1) goto L_0x0021
            java.lang.Object r3 = r5.get(r2)
            ansk r3 = (defpackage.ansk) r3
            r4 = 128(0x80, float:1.794E-43)
            boolean r4 = a((defpackage.ansk) r3, (int) r4)
            if (r4 != 0) goto L_0x001b
            goto L_0x001e
        L_0x001b:
            r0.add(r3)
        L_0x001e:
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgi.a(java.lang.Iterable):java.util.Set");
    }

    public static void a(Context context, Collection collection, int i, boolean z) {
        hhr hhr = new hhr();
        if (z) {
            hhr.b();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hhr.a((hfg) it.next(), i);
        }
        hhr.a(context);
    }

    public static void a(Context context, Collection collection, Collection collection2) {
        bmr a2;
        if (!collection.isEmpty() && awxo.a.a().w()) {
            amxc a3 = amxc.a(collection.size(), 1);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                hfy hfy = (hfy) it.next();
                a3.a((Object) hfy.a, (Object) hfy);
            }
            anaq a4 = anau.a();
            for (String str : c.a((CharSequence) awxo.a.a().d())) {
                Iterator it2 = d.a((CharSequence) str).iterator();
                if (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (!it2.hasNext()) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 69);
                        sb.append("Blacklisted diffbase module specification ");
                        sb.append(str);
                        sb.append(" doesn't include a version.");
                        Log.w("ModuleSetUtils", sb.toString());
                    } else {
                        a4.b(str2, (String) it2.next());
                    }
                }
            }
            anau b2 = a4.b();
            Iterator it3 = collection2.iterator();
            while (it3.hasNext()) {
                blk blk = (blk) it3.next();
                bmr bmr = blk.i;
                if (bmr != null) {
                    if (b2.b.containsKey(bmr.a)) {
                        anhj a5 = b2.g(bmr.a).iterator();
                        while (true) {
                            if (!a5.hasNext()) {
                                break;
                            }
                            String str3 = (String) a5.next();
                            if (str3.equals("*")) {
                                break;
                            } else if (str3.contains("*")) {
                                int indexOf = str3.indexOf(42);
                                if (bmr.b.startsWith(str3.substring(0, indexOf)) && indexOf + 6 == bmr.b.length()) {
                                    break;
                                }
                            } else if (str3.equals(bmr.b)) {
                                break;
                            }
                        }
                    }
                    for (hfy hfy2 : a3.c((Object) bmr.a)) {
                        if (a(hfy2.b, hfy2.d, bmr.b)) {
                            hfy2.d = bmr.b;
                            hfy2.e = blk.d;
                        }
                    }
                }
            }
            String N = awxo.a.a().N();
            if (!N.isEmpty()) {
                for (String bmb : amsk.a(',').a((CharSequence) N)) {
                    String b3 = new bmb(context, 0, bmb).b();
                    if (!(b3 == null || (a2 = bmr.a(b3)) == null)) {
                        for (hfy hfy3 : a3.c((Object) a2.a)) {
                            if (a(hfy3.b, hfy3.d, a2.b)) {
                                hfy3.d = a2.b;
                                hfy3.e = b3;
                            }
                        }
                    }
                }
            }
            for (hfy hfy4 : a3.n()) {
                String str4 = hfy4.e;
                if (str4 != null) {
                    String str5 = hfy4.a;
                    String str6 = hfy4.b;
                    int length = str4.length();
                    StringBuilder sb2 = new StringBuilder(length + 20 + String.valueOf(str5).length() + String.valueOf(str6).length());
                    sb2.append("Use diff base ");
                    sb2.append(str4);
                    sb2.append(" for ");
                    sb2.append(str5);
                    sb2.append(":");
                    sb2.append(str6);
                    sb2.toString();
                } else {
                    String str7 = hfy4.a;
                    String str8 = hfy4.b;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str7).length() + 24 + String.valueOf(str8).length());
                    sb3.append("No diff base found for ");
                    sb3.append(str7);
                    sb3.append(":");
                    sb3.append(str8);
                    sb3.toString();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r4.equals("container-only") != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(defpackage.ansk r4, boolean r5) {
        /*
            java.lang.String r4 = r4.b
            java.lang.String r0 = "container"
            boolean r0 = r4.startsWith(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0023
            int r0 = r4.length()
            r3 = 9
            if (r0 != r3) goto L_0x0016
            r1 = 1
            goto L_0x0043
        L_0x0016:
            if (r5 == 0) goto L_0x0023
            java.lang.String r0 = "container-only"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 1
            goto L_0x0043
        L_0x0023:
            java.lang.String r0 = "container-missing"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x0042
            int r0 = r4.length()
            r3 = 17
            if (r0 != r3) goto L_0x0036
            r1 = 1
            goto L_0x0043
        L_0x0036:
            if (r5 == 0) goto L_0x0042
            java.lang.String r5 = "container-missing-only"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0041
            goto L_0x0021
        L_0x0041:
            return r1
        L_0x0042:
        L_0x0043:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgi.a(ansk, boolean):boolean");
    }

    public static boolean a(hfg hfg, int i) {
        return a((ansk) hfg.a.get(0), i);
    }

    public static boolean a(hfg hfg, hfg hfg2) {
        return a(((ansk) hfg.a.get(0)).e, ((ansk) hfg2.a.get(0)).e);
    }

    public static boolean a(hfg hfg, hhr hhr) {
        if ((((ansk) hfg.a.get(0)).d & -65536) != 0) {
            hhr.a(hfg, 15);
            return false;
        } else if (hfg.a.size() != 1) {
            String valueOf = String.valueOf(b((List) amzy.a((Object) hfg)));
            Log.e("ModuleSetUtils", valueOf.length() == 0 ? new String("Malformed module set. Expecting exactly one ChimeraModuleSetInfo entry:") : "Malformed module set. Expecting exactly one ChimeraModuleSetInfo entry:".concat(valueOf));
            hhr.a(hfg, 12);
            return false;
        } else if (!a(hfg, 64)) {
            return true;
        } else {
            String valueOf2 = String.valueOf(b((List) amzy.a((Object) hfg)));
            Log.e("ModuleSetUtils", valueOf2.length() == 0 ? new String("Rejecting server module set with TARGETING_TYPE_LOCAL:") : "Rejecting server module set with TARGETING_TYPE_LOCAL:".concat(valueOf2));
            hhr.a(hfg, 11);
            return false;
        }
    }

    public static boolean a(String str, String str2, String str3) {
        try {
            long parseLong = Long.parseLong(str);
            long parseLong2 = Long.parseLong(str3);
            if (str2 == null) {
                return true;
            }
            return Math.abs(parseLong - parseLong2) < Math.abs(parseLong - Long.parseLong(str2));
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean a(ou ouVar, hgc hgc, String str, boolean z) {
        if (z && ouVar.get(hgc) != null) {
            return false;
        }
        ouVar.put(hgc, str);
        return true;
    }
}
