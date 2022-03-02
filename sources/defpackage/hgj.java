package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: hgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hgj {
    public static hfg a(hfg hfg, hfg hfg2) {
        List a = a(hfg.a, hfg2.a, bmy.b);
        List a2 = a(hfg.b, hfg2.b, hgi.a);
        List a3 = a(hfg.c, hfg2.c, blj.a);
        aucd o = hfg.d.o();
        o.A((Iterable) a);
        o.z((Iterable) a3);
        o.B((Iterable) a2);
        return (hfg) o.i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00da, code lost:
        r10.add(r7);
        r4 = r7.c;
        r6 = r4.size();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e4, code lost:
        if (r7 >= r6) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e6, code lost:
        r9.add(defpackage.hgc.a((defpackage.boc) r4.get(r7)));
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f6, code lost:
        r15 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.hfg a(java.util.Collection r22, defpackage.hgm r23) {
        /*
            r0 = r23
            ou r1 = new ou
            r1.<init>()
            ou r2 = new ou
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r22.size()
            r3.<init>(r4)
            java.util.Iterator r4 = r22.iterator()
        L_0x0019:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01fb
            java.lang.Object r5 = r4.next()
            hfg r5 = (defpackage.hfg) r5
            ob r9 = new ob
            r9.<init>()
            boolean r10 = r23.a()
            if (r10 != 0) goto L_0x0055
            aucx r10 = r5.c
            int r11 = r10.size()
            r12 = 0
        L_0x0037:
            if (r12 < r11) goto L_0x003a
            goto L_0x0079
        L_0x003a:
            java.lang.Object r13 = r10.get(r12)
            bob r13 = (defpackage.bob) r13
            boolean r14 = r13.d
            if (r14 == 0) goto L_0x004b
            boolean r14 = r0.a((defpackage.bob) r13, (defpackage.hfg) r5)
            if (r14 != 0) goto L_0x004b
            goto L_0x0052
        L_0x004b:
            hgc r13 = defpackage.hgc.a((defpackage.bob) r13)
            r9.add(r13)
        L_0x0052:
            int r12 = r12 + 1
            goto L_0x0037
        L_0x0055:
            aucx r10 = r5.c
            int r11 = r10.size()
            r12 = 0
        L_0x005c:
            if (r12 >= r11) goto L_0x0079
            java.lang.Object r13 = r10.get(r12)
            bob r13 = (defpackage.bob) r13
            boolean r14 = r13.d
            if (r14 != 0) goto L_0x0069
            goto L_0x0076
        L_0x0069:
            boolean r14 = r0.a((defpackage.bob) r13, (defpackage.hfg) r5)
            if (r14 == 0) goto L_0x0076
            hgc r13 = defpackage.hgc.a((defpackage.bob) r13)
            r9.add(r13)
        L_0x0076:
            int r12 = r12 + 1
            goto L_0x005c
        L_0x0079:
            ob r10 = new ob
            r10.<init>()
            bob r11 = defpackage.bob.f
            hgc r11 = defpackage.hgc.a((defpackage.bob) r11)
        L_0x0084:
            aucx r12 = r5.b
            int r13 = r12.size()
            r14 = 0
            r15 = 1
        L_0x008c:
            if (r14 >= r13) goto L_0x00fe
            java.lang.Object r16 = r12.get(r14)
            r7 = r16
            hfp r7 = (defpackage.hfp) r7
            boolean r16 = r10.contains(r7)
            if (r16 == 0) goto L_0x00a1
            r17 = r4
            r18 = r12
            goto L_0x00f7
        L_0x00a1:
            boolean r16 = r23.a()
            if (r16 != 0) goto L_0x00b1
            aucx r6 = r7.c
            int r6 = r6.size()
            if (r6 != 0) goto L_0x00b1
            r6 = 1
            goto L_0x00b2
        L_0x00b1:
            r6 = 0
        L_0x00b2:
            aucx r8 = r7.c
            r17 = r4
            int r4 = r8.size()
            r18 = r12
            r12 = 0
        L_0x00bd:
            if (r12 >= r4) goto L_0x00d8
            java.lang.Object r19 = r8.get(r12)
            r20 = r4
            r4 = r19
            boc r4 = (defpackage.boc) r4
            r11.b((defpackage.boc) r4)
            int r12 = r12 + 1
            boolean r4 = r9.contains(r11)
            if (r4 == 0) goto L_0x00d5
            goto L_0x00da
        L_0x00d5:
            r4 = r20
            goto L_0x00bd
        L_0x00d8:
            if (r6 == 0) goto L_0x00f7
        L_0x00da:
            r10.add(r7)
            aucx r4 = r7.c
            int r6 = r4.size()
            r7 = 0
        L_0x00e4:
            if (r7 >= r6) goto L_0x00f6
            java.lang.Object r8 = r4.get(r7)
            boc r8 = (defpackage.boc) r8
            hgc r8 = defpackage.hgc.a((defpackage.boc) r8)
            r9.add(r8)
            int r7 = r7 + 1
            goto L_0x00e4
        L_0x00f6:
            r15 = 0
        L_0x00f7:
            int r14 = r14 + 1
            r4 = r17
            r12 = r18
            goto L_0x008c
        L_0x00fe:
            r17 = r4
            if (r15 == 0) goto L_0x01f7
            hfg r4 = defpackage.hfg.d
            aucd r4 = r4.o()
            aucx r6 = r5.a
            r7 = 0
            java.lang.Object r6 = r6.get(r7)
            ansk r6 = (defpackage.ansk) r6
            boolean r6 = defpackage.hgi.a((defpackage.ansk) r6, (boolean) r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            aucx r8 = r5.c
            int r11 = r8.size()
            r12 = 0
        L_0x0121:
            if (r12 >= r11) goto L_0x017a
            java.lang.Object r13 = r8.get(r12)
            bob r13 = (defpackage.bob) r13
            hgc r14 = defpackage.hgc.a((defpackage.bob) r13)
            boolean r15 = r13.d
            if (r15 == 0) goto L_0x0171
            boolean r15 = r9.contains(r14)
            if (r15 == 0) goto L_0x0167
            a(r1, r14, r4, r6)
            r14 = 5
            java.lang.Object r15 = r13.c(r14)
            aucd r15 = (defpackage.aucd) r15
            r15.a((defpackage.aucj) r13)
            boolean r13 = r15.c
            if (r13 != 0) goto L_0x014a
            r13 = 0
            goto L_0x0150
        L_0x014a:
            r15.c()
            r13 = 0
            r15.c = r13
        L_0x0150:
            aucj r14 = r15.b
            bob r14 = (defpackage.bob) r14
            int r13 = r14.a
            r13 = r13 | 4
            r14.a = r13
            r13 = 0
            r14.d = r13
            aucj r13 = r15.i()
            bob r13 = (defpackage.bob) r13
            r7.add(r13)
            goto L_0x0177
        L_0x0167:
            boolean r14 = r0.a((defpackage.hgc) r14, (boolean) r6)
            if (r14 == 0) goto L_0x0177
            r7.add(r13)
            goto L_0x0177
        L_0x0171:
            a(r2, r14, r4, r6)
            r7.add(r13)
        L_0x0177:
            int r12 = r12 + 1
            goto L_0x0121
        L_0x017a:
            java.util.Comparator r6 = defpackage.blj.a
            java.util.Collections.sort(r7, r6)
            boolean r6 = r4.c
            if (r6 == 0) goto L_0x0189
            r4.c()
            r6 = 0
            r4.c = r6
        L_0x0189:
            aucj r6 = r4.b
            hfg r6 = (defpackage.hfg) r6
            aucx r8 = defpackage.aucj.s()
            r6.b = r8
            r4.B((java.lang.Iterable) r10)
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x019b
            goto L_0x01a1
        L_0x019b:
            r4.c()
            r6 = 0
            r4.c = r6
        L_0x01a1:
            aucj r6 = r4.b
            hfg r6 = (defpackage.hfg) r6
            aucx r8 = defpackage.aucj.s()
            r6.c = r8
            r4.z((java.lang.Iterable) r7)
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x01b4
            r6 = 0
            goto L_0x01ba
        L_0x01b4:
            r4.c()
            r6 = 0
            r4.c = r6
        L_0x01ba:
            aucj r7 = r4.b
            hfg r7 = (defpackage.hfg) r7
            aucx r8 = defpackage.aucj.s()
            r7.a = r8
            aucx r5 = r5.a
            java.lang.Object r5 = r5.get(r6)
            ansk r5 = (defpackage.ansk) r5
            r6 = 5
            java.lang.Object r6 = r5.c(r6)
            aucd r6 = (defpackage.aucd) r6
            r6.a((defpackage.aucj) r5)
            boolean r5 = r6.c
            if (r5 != 0) goto L_0x01db
            goto L_0x01e1
        L_0x01db:
            r6.c()
            r5 = 0
            r6.c = r5
        L_0x01e1:
            aucj r5 = r6.b
            ansk r5 = (defpackage.ansk) r5
            ansk r7 = defpackage.ansk.g
            aucx r7 = defpackage.aucj.s()
            r5.f = r7
            r4.l((defpackage.aucd) r6)
            r3.add(r4)
            r4 = r17
            goto L_0x0019
        L_0x01f7:
            r4 = r17
            goto L_0x0084
        L_0x01fb:
            amzt r0 = defpackage.amzy.j()
            int r4 = r3.size()
            r7 = 0
        L_0x0204:
            if (r7 < r4) goto L_0x0413
            amzy r0 = r0.a()
            bpw r5 = defpackage.blj.a((java.util.List) r0)
            ob r6 = new ob
            r6.<init>()
            java.util.Set r8 = defpackage.qug.b()
            bob r0 = defpackage.bob.f
            hgc r0 = defpackage.hgc.a((defpackage.bob) r0)
            int r4 = r5.size()
            r7 = 0
        L_0x0222:
            if (r7 >= r4) goto L_0x037f
            java.lang.Object r9 = r5.get(r7)
            bob r9 = (defpackage.bob) r9
            boolean r10 = r9.d
            if (r10 != 0) goto L_0x036a
            r0.b((defpackage.bob) r9)
            java.lang.Object r10 = r2.get(r0)
            aucd r10 = (defpackage.aucd) r10
            if (r10 != 0) goto L_0x0268
            java.lang.Object r10 = r1.get(r0)
            aucd r10 = (defpackage.aucd) r10
            if (r10 == 0) goto L_0x0243
            r11 = 1
            goto L_0x0269
        L_0x0243:
            com.google.android.chimera.config.InvalidConfigException r1 = new com.google.android.chimera.config.InvalidConfigException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 21
            r3.<init>(r2)
            java.lang.String r2 = "Feature not provided:"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0268:
            r11 = 0
        L_0x0269:
            aucj r12 = r10.b
            hfg r12 = (defpackage.hfg) r12
            aucx r12 = r12.b
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            java.util.Iterator r12 = r12.iterator()
        L_0x0277:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x02d6
            java.lang.Object r13 = r12.next()
            hfp r13 = (defpackage.hfp) r13
            aucx r14 = r13.c
            int r15 = r14.size()
            r23 = r0
            r0 = 0
        L_0x028c:
            if (r0 >= r15) goto L_0x02cd
            java.lang.Object r17 = r14.get(r0)
            r18 = r1
            r1 = r17
            boc r1 = (defpackage.boc) r1
            r17 = r2
            java.lang.String r2 = r1.b
            r19 = r4
            java.lang.String r4 = r9.b
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x02be
            long r1 = r1.c
            r4 = r14
            r20 = r15
            long r14 = r9.c
            int r21 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r21 == 0) goto L_0x02b2
            goto L_0x02c1
        L_0x02b2:
            r8.add(r13)
            r0 = r23
            r2 = r17
            r1 = r18
            r4 = r19
            goto L_0x0277
        L_0x02be:
            r4 = r14
            r20 = r15
        L_0x02c1:
            int r0 = r0 + 1
            r14 = r4
            r2 = r17
            r1 = r18
            r4 = r19
            r15 = r20
            goto L_0x028c
        L_0x02cd:
            r18 = r1
            r17 = r2
            r19 = r4
            r0 = r23
            goto L_0x0277
        L_0x02d6:
            r23 = r0
            r18 = r1
            r17 = r2
            r19 = r4
            if (r11 == 0) goto L_0x035f
            ansk r0 = r10.k()
            r1 = 5
            java.lang.Object r2 = r0.c(r1)
            aucd r2 = (defpackage.aucd) r2
            r2.a((defpackage.aucj) r0)
            java.lang.String r0 = r9.b
            aucj r4 = r2.b
            ansk r4 = (defpackage.ansk) r4
            aucx r4 = r4.f
            java.util.List r4 = java.util.Collections.unmodifiableList(r4)
            int r9 = java.util.Collections.binarySearch(r4, r0)
            if (r9 >= 0) goto L_0x0303
            int r9 = r9 + 1
            int r9 = -r9
        L_0x0303:
            boolean r11 = r2.c
            if (r11 != 0) goto L_0x0309
            r11 = 0
            goto L_0x030f
        L_0x0309:
            r2.c()
            r11 = 0
            r2.c = r11
        L_0x030f:
            aucj r12 = r2.b
            ansk r12 = (defpackage.ansk) r12
            ansk r13 = defpackage.ansk.g
            aucx r13 = defpackage.aucj.s()
            r12.f = r13
            java.util.List r12 = r4.subList(r11, r9)
            r2.ak(r12)
            boolean r12 = r2.c
            if (r12 != 0) goto L_0x0327
            goto L_0x032c
        L_0x0327:
            r2.c()
            r2.c = r11
        L_0x032c:
            aucj r11 = r2.b
            ansk r11 = (defpackage.ansk) r11
            r0.getClass()
            r11.a()
            aucx r11 = r11.f
            r11.add(r0)
            int r0 = r4.size()
            java.util.List r0 = r4.subList(r9, r0)
            r2.ak(r0)
            boolean r0 = r10.c
            if (r0 != 0) goto L_0x034b
            goto L_0x0351
        L_0x034b:
            r10.c()
            r0 = 0
            r10.c = r0
        L_0x0351:
            aucj r0 = r10.b
            hfg r0 = (defpackage.hfg) r0
            aucj r2 = r2.i()
            ansk r2 = (defpackage.ansk) r2
            defpackage.hfg.a((defpackage.hfg) r0, (defpackage.ansk) r2)
            goto L_0x0360
        L_0x035f:
            r1 = 5
        L_0x0360:
            ansk r0 = r10.k()
            java.lang.String r0 = r0.b
            r6.add(r0)
            goto L_0x0373
        L_0x036a:
            r23 = r0
            r18 = r1
            r17 = r2
            r19 = r4
            r1 = 5
        L_0x0373:
            int r7 = r7 + 1
            r0 = r23
            r2 = r17
            r1 = r18
            r4 = r19
            goto L_0x0222
        L_0x037f:
            int r2 = r3.size()
            r7 = 0
        L_0x0384:
            if (r7 < r2) goto L_0x03d8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r8)
            java.util.Comparator r1 = defpackage.hgi.a
            java.util.Collections.sort(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r3.size()
            r7 = 0
        L_0x039a:
            if (r7 >= r2) goto L_0x03bd
            java.lang.Object r4 = r3.get(r7)
            aucd r4 = (defpackage.aucd) r4
            ansk r4 = r4.k()
            java.lang.String r8 = r4.b
            boolean r8 = r6.contains(r8)
            if (r8 != 0) goto L_0x03b6
            r9 = 0
            boolean r8 = defpackage.hgi.a((defpackage.ansk) r4, (boolean) r9)
            if (r8 != 0) goto L_0x03b7
            goto L_0x03ba
        L_0x03b6:
            r9 = 0
        L_0x03b7:
            r1.add(r4)
        L_0x03ba:
            int r7 = r7 + 1
            goto L_0x039a
        L_0x03bd:
            java.util.Comparator r2 = defpackage.bmy.a
            java.util.Collections.sort(r1, r2)
            hfg r2 = defpackage.hfg.d
            aucd r2 = r2.o()
            r2.z((java.lang.Iterable) r5)
            r2.B((java.lang.Iterable) r0)
            r2.A((java.lang.Iterable) r1)
            aucj r0 = r2.i()
            hfg r0 = (defpackage.hfg) r0
            return r0
        L_0x03d8:
            r9 = 0
            java.lang.Object r0 = r3.get(r7)
            aucd r0 = (defpackage.aucd) r0
            aucj r1 = r0.b
            hfg r1 = (defpackage.hfg) r1
            aucx r1 = r1.b
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x03ed:
            int r4 = r7 + 1
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x0410
            java.lang.Object r4 = r1.next()
            hfp r4 = (defpackage.hfp) r4
            aucx r10 = r4.c
            int r10 = r10.size()
            if (r10 != 0) goto L_0x03ed
            r8.add(r4)
            ansk r4 = r0.k()
            java.lang.String r4 = r4.b
            r6.add(r4)
            goto L_0x03ed
        L_0x0410:
            r7 = r4
            goto L_0x0384
        L_0x0413:
            r18 = r1
            r17 = r2
            r1 = 5
            r9 = 0
            java.lang.Object r2 = r3.get(r7)
            aucd r2 = (defpackage.aucd) r2
            aucj r2 = r2.b
            hfg r2 = (defpackage.hfg) r2
            aucx r2 = r2.c
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r0.c(r2)
            int r7 = r7 + 1
            r2 = r17
            r1 = r18
            goto L_0x0204
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgj.a(java.util.Collection, hgm):hfg");
    }

    private static List a(List list, List list2, Comparator comparator) {
        if (list.isEmpty() || list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        int i2 = 0;
        while (i < list.size() && i2 < list2.size()) {
            int compare = comparator.compare(list.get(i), list2.get(i2));
            if (compare == 0) {
                i++;
                i2++;
            } else if (compare < 0) {
                arrayList.add(list.get(i));
                i++;
            } else {
                i2++;
            }
        }
        while (i < list.size()) {
            arrayList.add(list.get(i));
            i++;
        }
        return arrayList;
    }

    private static void a(ou ouVar, hgc hgc, aucd aucd, boolean z) {
        if (!z || ouVar.get(hgc) == null) {
            ouVar.put(hgc, aucd);
        }
    }
}
