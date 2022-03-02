package defpackage;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: arpt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arpt implements arpm {
    private static final Comparator a = arpo.a;
    private final float[] b = new float[19];
    private final float[] c = new float[6];
    private final float[] d = new float[6];
    private final float[] e = new float[24];
    private SoftReference f = new SoftReference((Object) null);
    private SoftReference g = new SoftReference((Object) null);
    private final ajaa h;
    private final arsg i;

    public arpt(ajaa ajaa, arsg arsg) {
        this.h = ajaa;
        this.i = arsg;
    }

    public static double a(List list, arpp arpp) {
        ArrayList arrayList = new ArrayList();
        for (Object a2 : list) {
            arrayList.add(Double.valueOf(arpp.a(a2)));
        }
        Collections.sort(arrayList);
        return ((Double) arrayList.get(arrayList.size() / 2)).doubleValue();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized defpackage.aibe a(java.util.Set r18, defpackage.arrc r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r19
            monitor-enter(r17)
            boolean r0 = r18.isEmpty()     // Catch:{ all -> 0x01d6 }
            r3 = 2
            if (r0 != 0) goto L_0x01c5
            monitor-enter(r17)     // Catch:{ IOException -> 0x01ab, NegativeArraySizeException -> 0x01a9, ArrayIndexOutOfBoundsException -> 0x01a7 }
            java.lang.ref.SoftReference r0 = r1.f     // Catch:{ all -> 0x01a4 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01a4 }
            arrb r0 = (defpackage.arrb) r0     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x003f
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ all -> 0x01a4 }
            ajaa r0 = r1.h     // Catch:{ all -> 0x01a4 }
            java.lang.String r6 = "locationmodel/wifi_location.model.uncompressed"
            java.io.InputStream r0 = r0.a((java.lang.String) r6)     // Catch:{ all -> 0x01a4 }
            r5.<init>(r0)     // Catch:{ all -> 0x01a4 }
            arrb r0 = defpackage.arrb.a((java.io.DataInputStream) r5)     // Catch:{ all -> 0x0033 }
            java.lang.ref.SoftReference r6 = new java.lang.ref.SoftReference     // Catch:{ all -> 0x0033 }
            r6.<init>(r0)     // Catch:{ all -> 0x0033 }
            r1.f = r6     // Catch:{ all -> 0x0033 }
            r5.close()     // Catch:{ all -> 0x01a4 }
            goto L_0x003f
        L_0x0033:
            r0 = move-exception
            r3 = r0
            r5.close()     // Catch:{ all -> 0x0039 }
            goto L_0x003e
        L_0x0039:
            r0 = move-exception
            r5 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r5)     // Catch:{ all -> 0x01a4 }
        L_0x003e:
            throw r3     // Catch:{ all -> 0x01a4 }
        L_0x003f:
            monitor-exit(r17)     // Catch:{ all -> 0x01a4 }
            monitor-enter(r17)     // Catch:{ IOException -> 0x01ab, NegativeArraySizeException -> 0x01a9, ArrayIndexOutOfBoundsException -> 0x01a7 }
            java.lang.ref.SoftReference r5 = r1.g     // Catch:{ all -> 0x01a1 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x01a1 }
            arrb r5 = (defpackage.arrb) r5     // Catch:{ all -> 0x01a1 }
            if (r5 != 0) goto L_0x0074
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ all -> 0x01a1 }
            ajaa r6 = r1.h     // Catch:{ all -> 0x01a1 }
            java.lang.String r7 = "locationmodel/wifi_accuracy.model.uncompressed"
            java.io.InputStream r6 = r6.a((java.lang.String) r7)     // Catch:{ all -> 0x01a1 }
            r5.<init>(r6)     // Catch:{ all -> 0x01a1 }
            arrb r6 = defpackage.arrb.a((java.io.DataInputStream) r5)     // Catch:{ all -> 0x0068 }
            java.lang.ref.SoftReference r7 = new java.lang.ref.SoftReference     // Catch:{ all -> 0x0068 }
            r7.<init>(r6)     // Catch:{ all -> 0x0068 }
            r1.g = r7     // Catch:{ all -> 0x0068 }
            r5.close()     // Catch:{ all -> 0x01a1 }
            r5 = r6
            goto L_0x0074
        L_0x0068:
            r0 = move-exception
            r3 = r0
            r5.close()     // Catch:{ all -> 0x006e }
            goto L_0x0073
        L_0x006e:
            r0 = move-exception
            r5 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r5)     // Catch:{ all -> 0x01a1 }
        L_0x0073:
            throw r3     // Catch:{ all -> 0x01a1 }
        L_0x0074:
            monitor-exit(r17)     // Catch:{ all -> 0x01a1 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x01d6 }
            r6 = r18
            r2.<init>(r6)     // Catch:{ all -> 0x01d6 }
            java.util.Comparator r6 = a     // Catch:{ all -> 0x01d6 }
            java.util.Collections.sort(r2, r6)     // Catch:{ all -> 0x01d6 }
            int r6 = r2.size()     // Catch:{ all -> 0x01d6 }
            r7 = 20
            int r6 = java.lang.Math.min(r6, r7)     // Catch:{ all -> 0x01d6 }
            r8 = 0
            java.util.List r2 = r2.subList(r8, r6)     // Catch:{ all -> 0x01d6 }
            arps r6 = new arps     // Catch:{ all -> 0x01d6 }
            r6.<init>(r2)     // Catch:{ all -> 0x01d6 }
            float[] r9 = r1.c     // Catch:{ all -> 0x01d6 }
            r10 = 0
            java.util.Arrays.fill(r9, r10)     // Catch:{ all -> 0x01d6 }
            float[] r9 = r1.d     // Catch:{ all -> 0x01d6 }
            java.util.Arrays.fill(r9, r10)     // Catch:{ all -> 0x01d6 }
            r9 = 0
            r11 = 0
        L_0x00a2:
            r12 = 1068708659(0x3fb33333, float:1.4)
            if (r9 == r7) goto L_0x0156
            int r11 = r2.size()     // Catch:{ all -> 0x01d6 }
            if (r9 >= r11) goto L_0x00b4
            java.lang.Object r11 = r2.get(r9)     // Catch:{ all -> 0x01d6 }
            arpu r11 = (defpackage.arpu) r11     // Catch:{ all -> 0x01d6 }
            goto L_0x00b5
        L_0x00b4:
            r11 = 0
        L_0x00b5:
            float r13 = (float) r9     // Catch:{ all -> 0x01d6 }
            int r14 = r2.size()     // Catch:{ all -> 0x01d6 }
            float r14 = (float) r14     // Catch:{ all -> 0x01d6 }
            float[] r15 = r1.b     // Catch:{ all -> 0x01d6 }
            if (r11 == 0) goto L_0x00c2
            float r7 = r11.f     // Catch:{ all -> 0x01d6 }
            goto L_0x00c4
        L_0x00c2:
            r7 = -1026424832(0xffffffffc2d20000, float:-105.0)
        L_0x00c4:
            r15[r8] = r7     // Catch:{ all -> 0x01d6 }
            if (r11 == 0) goto L_0x00cc
            float r7 = r11.c     // Catch:{ all -> 0x01d6 }
            goto L_0x00ce
        L_0x00cc:
            r7 = -1034158080(0xffffffffc25c0000, float:-55.0)
        L_0x00ce:
            r16 = 1
            r15[r16] = r7     // Catch:{ all -> 0x01d6 }
            if (r11 == 0) goto L_0x00d8
            float r12 = r11.d     // Catch:{ all -> 0x01d6 }
            goto L_0x00d9
        L_0x00d8:
        L_0x00d9:
            r15[r3] = r12     // Catch:{ all -> 0x01d6 }
            if (r11 == 0) goto L_0x00eb
            double r3 = r11.k     // Catch:{ all -> 0x01d6 }
            double r7 = r6.b     // Catch:{ all -> 0x01d6 }
            double r3 = r3 - r7
            double r7 = r11.j     // Catch:{ all -> 0x01d6 }
            double r3 = defpackage.aell.a(r3, r7)     // Catch:{ all -> 0x01d6 }
            float r3 = (float) r3     // Catch:{ all -> 0x01d6 }
            goto L_0x00ec
        L_0x00eb:
            r3 = 0
        L_0x00ec:
            r4 = 3
            r15[r4] = r3     // Catch:{ all -> 0x01d6 }
            float[] r3 = r1.b     // Catch:{ all -> 0x01d6 }
            if (r11 == 0) goto L_0x00fe
            double r7 = r11.j     // Catch:{ all -> 0x01d6 }
            double r10 = r6.a     // Catch:{ all -> 0x01d6 }
            double r7 = r7 - r10
            double r7 = defpackage.aell.d(r7)     // Catch:{ all -> 0x01d6 }
            float r7 = (float) r7     // Catch:{ all -> 0x01d6 }
            goto L_0x00ff
        L_0x00fe:
            r7 = 0
        L_0x00ff:
            r8 = 4
            r3[r8] = r7     // Catch:{ all -> 0x01d6 }
            float[] r3 = r1.b     // Catch:{ all -> 0x01d6 }
            r7 = 5
            r3[r7] = r13     // Catch:{ all -> 0x01d6 }
            r7 = 6
            r3[r7] = r14     // Catch:{ all -> 0x01d6 }
            r3 = 7
            r3 = 0
            r10 = 7
        L_0x010e:
            if (r3 >= r7) goto L_0x011e
            int r11 = r10 + 1
            float[] r13 = r1.b     // Catch:{ all -> 0x01d6 }
            float[] r14 = r1.c     // Catch:{ all -> 0x01d6 }
            r14 = r14[r3]     // Catch:{ all -> 0x01d6 }
            r13[r10] = r14     // Catch:{ all -> 0x01d6 }
            int r3 = r3 + 1
            r10 = r11
            goto L_0x010e
        L_0x011e:
            r3 = 0
        L_0x011f:
            if (r3 >= r7) goto L_0x012f
            int r11 = r10 + 1
            float[] r13 = r1.b     // Catch:{ all -> 0x01d6 }
            float[] r14 = r1.d     // Catch:{ all -> 0x01d6 }
            r14 = r14[r3]     // Catch:{ all -> 0x01d6 }
            r13[r10] = r14     // Catch:{ all -> 0x01d6 }
            int r3 = r3 + 1
            r10 = r11
            goto L_0x011f
        L_0x012f:
            float[] r3 = r1.b     // Catch:{ all -> 0x01d6 }
            float[] r11 = r0.a((float[]) r3)     // Catch:{ all -> 0x01d6 }
            float[] r3 = r1.d     // Catch:{ all -> 0x01d6 }
            float[] r10 = r1.c     // Catch:{ all -> 0x01d6 }
            r13 = 0
            java.lang.System.arraycopy(r3, r13, r10, r13, r7)     // Catch:{ all -> 0x01d6 }
            float[] r3 = r1.d     // Catch:{ all -> 0x01d6 }
            java.lang.System.arraycopy(r11, r13, r3, r13, r7)     // Catch:{ all -> 0x01d6 }
            if (r9 < r8) goto L_0x0145
            goto L_0x014d
        L_0x0145:
            float[] r3 = r1.e     // Catch:{ all -> 0x01d6 }
            int r8 = r9 * 6
            r10 = 0
            java.lang.System.arraycopy(r11, r10, r3, r8, r7)     // Catch:{ all -> 0x01d6 }
        L_0x014d:
            int r9 = r9 + 1
            r3 = 2
            r7 = 20
            r8 = 0
            r10 = 0
            goto L_0x00a2
        L_0x0156:
            int r0 = r11.length     // Catch:{ all -> 0x01d6 }
            int r2 = r0 + -2
            r2 = r11[r2]     // Catch:{ all -> 0x01d6 }
            int r0 = r0 + -1
            r0 = r11[r0]     // Catch:{ all -> 0x01d6 }
            float[] r3 = r1.e     // Catch:{ all -> 0x01d6 }
            float[] r3 = r5.a((float[]) r3)     // Catch:{ all -> 0x01d6 }
            r4 = 0
            r3 = r3[r4]     // Catch:{ all -> 0x01d6 }
            r4 = 1125515264(0x43160000, float:150.0)
            float r3 = java.lang.Math.min(r3, r4)     // Catch:{ all -> 0x01d6 }
            r4 = 1077936128(0x40400000, float:3.0)
            float r3 = java.lang.Math.max(r3, r4)     // Catch:{ all -> 0x01d6 }
            double r4 = (double) r0     // Catch:{ all -> 0x01d6 }
            aibe r0 = new aibe     // Catch:{ all -> 0x01d6 }
            double r7 = r6.a     // Catch:{ all -> 0x01d6 }
            double r9 = defpackage.aell.e(r4)     // Catch:{ all -> 0x01d6 }
            double r7 = r7 + r9
            int r7 = defpackage.aell.a((double) r7)     // Catch:{ all -> 0x01d6 }
            double r8 = r6.b     // Catch:{ all -> 0x01d6 }
            double r10 = (double) r2     // Catch:{ all -> 0x01d6 }
            double r4 = defpackage.aell.e(r4)     // Catch:{ all -> 0x01d6 }
            double r13 = r6.a     // Catch:{ all -> 0x01d6 }
            double r4 = r4 + r13
            double r4 = defpackage.aell.b(r10, r4)     // Catch:{ all -> 0x01d6 }
            double r8 = r8 + r4
            int r2 = defpackage.aell.a((double) r8)     // Catch:{ all -> 0x01d6 }
            float r3 = r3 * r12
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 * r4
            int r3 = (int) r3     // Catch:{ all -> 0x01d6 }
            r0.<init>(r7, r2, r3)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r17)
            return r0
        L_0x01a1:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x01a1 }
            throw r0     // Catch:{ IOException -> 0x01ab, NegativeArraySizeException -> 0x01a9, ArrayIndexOutOfBoundsException -> 0x01a7 }
        L_0x01a4:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x01a4 }
            throw r0     // Catch:{ IOException -> 0x01ab, NegativeArraySizeException -> 0x01a9, ArrayIndexOutOfBoundsException -> 0x01a7 }
        L_0x01a7:
            r0 = move-exception
            goto L_0x01ac
        L_0x01a9:
            r0 = move-exception
            goto L_0x01ac
        L_0x01ab:
            r0 = move-exception
        L_0x01ac:
            boolean r0 = r0 instanceof java.io.IOException     // Catch:{ all -> 0x01d6 }
            if (r0 != 0) goto L_0x01b3
            r0 = 9
            goto L_0x01b5
        L_0x01b3:
            r0 = 8
        L_0x01b5:
            arsg r3 = r1.i     // Catch:{ all -> 0x01d6 }
            arsf r3 = (defpackage.arsf) r3     // Catch:{ all -> 0x01d6 }
            aizy r3 = r3.c     // Catch:{ all -> 0x01d6 }
            long r3 = r3.b()     // Catch:{ all -> 0x01d6 }
            r2.a(r0, r3)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r17)
            r2 = 0
            return r2
        L_0x01c5:
            arsg r0 = r1.i     // Catch:{ all -> 0x01d6 }
            arsf r0 = (defpackage.arsf) r0     // Catch:{ all -> 0x01d6 }
            aizy r0 = r0.c     // Catch:{ all -> 0x01d6 }
            long r3 = r0.b()     // Catch:{ all -> 0x01d6 }
            r0 = 2
            r2.a(r0, r3)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r17)
            r2 = 0
            return r2
        L_0x01d6:
            r0 = move-exception
            monitor-exit(r17)
            goto L_0x01da
        L_0x01d9:
            throw r0
        L_0x01da:
            goto L_0x01d9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arpt.a(java.util.Set, arrc):aibe");
    }
}
