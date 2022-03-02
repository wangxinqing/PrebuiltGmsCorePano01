package defpackage;

import android.location.Location;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: aijn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aijn implements aijs {
    private Location c = null;
    private final ArrayList d = new ArrayList();

    private final List a(Iterable iterable, boolean z) {
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                for (aijt add : (Iterable) it.next()) {
                    arrayList.add(add);
                }
            }
            return arrayList;
        }
        if (this.d.size() == 0) {
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                for (aijt aijt : (Iterable) it2.next()) {
                    if (aijt.b() != Double.MAX_VALUE) {
                        this.d.add(aijt);
                    }
                }
            }
        }
        return this.d;
    }

    public final List a(Iterable iterable, double d2, int i) {
        throw null;
    }

    public final void a(PrintWriter printWriter) {
        throw null;
    }

    public final void a(Iterable iterable, int i) {
        throw null;
    }

    public final List b(Iterable iterable, int i) {
        throw null;
    }

    public final List c(Iterable iterable, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            for (aijt aijt : (Iterable) it.next()) {
                if (aijt.c()) {
                    arrayList.add(aijt);
                }
            }
        }
        if (arrayList.size() != 0) {
            return anfk.a(b).a((Iterable) arrayList, i);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.aijq a(java.lang.Iterable r18, int r19, long r20, android.location.Location r22, double r23, java.util.Map r25) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            r3 = r22
            r4 = r25
            r17.a()
            java.util.Iterator r5 = r18.iterator()
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0012:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x00c7
            java.lang.Object r10 = r5.next()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x0022:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00c1
            java.lang.Object r11 = r10.next()
            aijt r11 = (defpackage.aijt) r11
            double r12 = r11.b()
            r14 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            android.location.Location r12 = r0.c
            if (r12 == r3) goto L_0x00bb
        L_0x0040:
            r12 = 4
            r13 = 2
            r14 = 1
            if (r4 != 0) goto L_0x0048
            r19 = r5
            goto L_0x0086
        L_0x0048:
            boolean r15 = r4.containsKey(r11)
            if (r15 == 0) goto L_0x0084
            java.lang.Object r15 = r4.get(r11)
            java.lang.Byte r15 = (java.lang.Byte) r15
            byte r15 = r15.byteValue()
            r11.f = r14
            aijz r6 = r11.k
            r6.a(r3)
            if (r15 == r14) goto L_0x0079
            r19 = r5
            r4 = -1
            if (r15 == r13) goto L_0x006f
            if (r15 == r12) goto L_0x006a
            goto L_0x007f
        L_0x006a:
            r11.h = r14
            r11.g = r4
            goto L_0x007f
        L_0x006f:
            r11.e = r13
            r11.i = r14
            r11.g = r4
            r4 = 0
            r11.h = r4
            goto L_0x007f
        L_0x0079:
            r19 = r5
            r11.e = r14
            r11.g = r1
        L_0x007f:
            byte r4 = r11.a((byte) r15)
            goto L_0x008a
        L_0x0084:
            r19 = r5
        L_0x0086:
            byte r4 = r11.a(r1, r3)
        L_0x008a:
            if (r4 != r14) goto L_0x0098
            if (r7 == 0) goto L_0x008f
            goto L_0x0094
        L_0x008f:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0094:
            r7.add(r11)
            goto L_0x00b5
        L_0x0098:
            if (r4 == r13) goto L_0x00a9
            if (r4 == r12) goto L_0x009d
            goto L_0x00b5
        L_0x009d:
            if (r9 == 0) goto L_0x00a0
            goto L_0x00a5
        L_0x00a0:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00a5:
            r9.add(r11)
            goto L_0x00b5
        L_0x00a9:
            if (r8 != 0) goto L_0x00b1
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            goto L_0x00b2
        L_0x00b1:
        L_0x00b2:
            r8.add(r11)
        L_0x00b5:
            r5 = r19
            r4 = r25
            goto L_0x0022
        L_0x00bb:
            r19 = r5
            r4 = r25
            goto L_0x0022
        L_0x00c1:
            r19 = r5
            r4 = r25
            goto L_0x0012
        L_0x00c7:
            r0.c = r3
            if (r7 == 0) goto L_0x00cc
            goto L_0x00d2
        L_0x00cc:
            if (r8 != 0) goto L_0x00d2
            if (r9 != 0) goto L_0x00d2
            r1 = 0
            return r1
        L_0x00d2:
            aijq r1 = new aijq
            r1.<init>(r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aijn.a(java.lang.Iterable, int, long, android.location.Location, double, java.util.Map):aijq");
    }

    public final List a(Iterable iterable) {
        List a = a(iterable, true);
        if (a.size() == 0) {
            return null;
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    public final List a(Iterable iterable, int i, Comparator comparator) {
        a(iterable, false);
        if (this.d.size() != 0) {
            return anfk.a(comparator).a((Iterable) this.d, i);
        }
        return null;
    }

    public final void a() {
        this.d.clear();
    }
}
