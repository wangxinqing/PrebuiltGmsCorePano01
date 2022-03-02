package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: bze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class bze {
    private final long a;

    public bze(long j) {
        this.a = j;
    }

    static final boolean a(bzc bzc, bzc bzc2) {
        if (!bzc.c(bzc2.a) && !bzc.c(bzc2.b) && !bzc2.c(bzc.a) && !bzc2.c(bzc.b)) {
            return false;
        }
        bzc.a = Math.min(bzc.a, bzc2.a);
        bzc.b = Math.max(bzc.b, bzc2.b);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0005 A[LOOP:0: B:1:0x0005->B:4:0x0015, LOOP_START, PHI: r1 
      PHI: (r1v1 boolean) = (r1v0 boolean), (r1v6 boolean) binds: [B:0:0x0000, B:4:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(defpackage.bzc r4, java.util.Set r5) {
        /*
            java.util.Iterator r0 = r5.iterator()
            r1 = 0
        L_0x0005:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0017
            java.lang.Object r1 = r0.next()
            bzc r1 = (defpackage.bzc) r1
            boolean r1 = a((defpackage.bzc) r1, (defpackage.bzc) r4)
            if (r1 == 0) goto L_0x0005
        L_0x0017:
            if (r1 == 0) goto L_0x004a
            java.util.Iterator r4 = r5.iterator()
        L_0x001d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r0 = r4.next()
            bzc r0 = (defpackage.bzc) r0
            java.util.Iterator r1 = r5.iterator()
        L_0x002d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x001d
            java.lang.Object r2 = r1.next()
            bzc r2 = (defpackage.bzc) r2
            boolean r3 = r0.equals(r2)
            if (r3 != 0) goto L_0x002d
            boolean r2 = a((defpackage.bzc) r2, (defpackage.bzc) r0)
            if (r2 == 0) goto L_0x002d
            r4.remove()
            goto L_0x001d
        L_0x0049:
            return
        L_0x004a:
            r5.add(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bze.b(bzc, java.util.Set):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(bzc bzc, Set set) {
        long j;
        bzc bzc2 = bzc;
        Set set2 = set;
        TreeSet<bzc> treeSet = new TreeSet<>();
        if (!bzc2.e(this.a)) {
            while (bzc2.a < 0) {
                bzc2.a(this.a);
            }
            while (true) {
                long j2 = bzc2.a;
                j = this.a;
                if (j2 <= j) {
                    break;
                }
                bzc2.a(-j);
            }
            if (bzc2.e(j)) {
                treeSet.add(bzc2);
            } else {
                long j3 = bzc2.b;
                if (j3 > this.a) {
                    while (true) {
                        long j4 = this.a;
                        if (j3 <= j4) {
                            break;
                        }
                        j3 -= j4;
                    }
                    treeSet.add(bzc.a(0, j3));
                    treeSet.add(bzc.a(bzc2.a, this.a));
                }
            }
        } else {
            treeSet.add(bzc2);
        }
        for (bzc bzc3 : treeSet) {
            Iterator it = set.iterator();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            while (it.hasNext()) {
                bzc bzc4 = (bzc) it.next();
                long j5 = bzc4.a;
                long j6 = bzc3.a;
                if (j5 > j6 || j6 >= bzc4.b) {
                    long j7 = bzc3.b;
                    if ((j5 >= j7 || j7 >= bzc4.b) && (j5 <= j6 || j5 >= j7)) {
                        if (z) {
                            break;
                        }
                    }
                }
                long min = Math.min(j5, j6);
                long max = Math.max(bzc4.a, bzc3.a);
                long min2 = Math.min(bzc4.b, bzc3.b);
                long max2 = Math.max(bzc4.b, bzc3.b);
                if (min < max) {
                    arrayList.add(new bzc(min, max));
                }
                if (max < min2) {
                    arrayList.add(new bzc(max, min2));
                }
                bzc3.a = min2;
                bzc3.b = max2;
                it.remove();
                z = true;
            }
            set2.addAll(arrayList);
            if (bzc3.b - bzc3.a > 0) {
                set2.add(bzc3);
            }
        }
    }
}
