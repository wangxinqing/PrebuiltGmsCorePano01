package defpackage;

import java.util.Calendar;
import java.util.List;

/* renamed from: ahxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahxt {
    public final List a;
    private final aizy b;
    private final ahxb c;

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ff A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0110 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.ahxs b(java.util.Calendar r21) {
        /*
            r20 = this;
            r0 = r20
            r8 = r21
            ahxb r1 = r0.c
            aqek r1 = r1.d()
            r2 = 0
            r9 = 1
            if (r1 == 0) goto L_0x0014
            long r4 = r1.c(r9)
            goto L_0x0015
        L_0x0014:
            r4 = r2
        L_0x0015:
            r6 = -1
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x001d
            r4 = r2
            goto L_0x001e
        L_0x001d:
        L_0x001e:
            java.util.Calendar r10 = java.util.Calendar.getInstance()
            r10.setTimeInMillis(r4)
            boolean r1 = r10.after(r8)
            if (r1 == 0) goto L_0x003a
            r1 = 12
            r4 = -5
            r10.add(r1, r4)
            boolean r1 = r10.after(r8)
            if (r1 == 0) goto L_0x003a
            r10.setTimeInMillis(r2)
        L_0x003a:
            boolean r11 = defpackage.ahyw.a((java.util.Calendar) r8, (java.util.Calendar) r10)
            java.util.List r12 = r0.a
            int r13 = r12.size()
            r14 = 0
            r15 = 0
        L_0x0046:
            r16 = 0
            if (r15 >= r13) goto L_0x0115
            java.lang.Object r1 = r12.get(r15)
            r2 = r1
            ahyw r2 = (defpackage.ahyw) r2
            boolean r1 = r2.a((java.util.Calendar) r8)
            if (r1 == 0) goto L_0x005b
            r19 = r15
            goto L_0x0110
        L_0x005b:
            if (r11 != 0) goto L_0x005e
            goto L_0x0064
        L_0x005e:
            boolean r1 = r2.b((java.util.Calendar) r10)
            if (r1 != 0) goto L_0x010e
        L_0x0064:
            aizy r1 = r0.b
            long r6 = r1.d()
            java.util.List r1 = r0.a
            java.lang.Object r1 = r1.get(r14)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00d6
            ahxb r1 = r0.c
            java.util.Map r1 = r1.n()
            if (r1 == 0) goto L_0x00d3
            r3 = 7
            int r4 = r8.get(r3)
            if (r4 == r3) goto L_0x00d0
            int r3 = r8.get(r3)
            if (r3 == r9) goto L_0x00cd
            java.lang.Object r3 = r21.clone()
            java.util.Calendar r3 = (java.util.Calendar) r3
            long r4 = r2.a
            defpackage.ahyw.a((java.util.Calendar) r3, (long) r4)
            java.util.Random r4 = new java.util.Random
            long r17 = r3.getTimeInMillis()
            r19 = r15
            long r14 = r6 ^ r17
            r4.<init>(r14)
            double r3 = r4.nextDouble()
            r14 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x00b1
            goto L_0x00d8
        L_0x00b1:
            defpackage.amrl.a((java.lang.Object) r1)
            ahxv r14 = new ahxv
            java.util.TimeZone r3 = r21.getTimeZone()
            java.lang.String r3 = r3.getID()
            java.lang.Object r1 = r1.get(r3)
            r3 = r1
            amzy r3 = (defpackage.amzy) r3
            r4 = 2
            r1 = r14
            r5 = r21
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x00e2
        L_0x00cd:
            r19 = r15
            goto L_0x00d8
        L_0x00d0:
            r19 = r15
            goto L_0x00d8
        L_0x00d3:
            r19 = r15
            goto L_0x00d8
        L_0x00d6:
            r19 = r15
        L_0x00d8:
            ahxv r14 = new ahxv
            r3 = 0
            r4 = 1
            r1 = r14
            r5 = r21
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x00e2:
            amzy r1 = r14.b
            anhk r1 = r1.listIterator()
        L_0x00e8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00fb
            java.lang.Object r2 = r1.next()
            ahyw r2 = (defpackage.ahyw) r2
            boolean r3 = r2.a((java.util.Calendar) r8)
            if (r3 != 0) goto L_0x00e8
            goto L_0x00fd
        L_0x00fb:
            r2 = r16
        L_0x00fd:
            if (r2 == 0) goto L_0x0110
            int r1 = r14.c
            if (r1 == r9) goto L_0x0106
            ahxq r1 = defpackage.ahxq.USING_IN_OUTDOOR_HINTS
            goto L_0x0108
        L_0x0106:
            ahxq r1 = defpackage.ahxq.USING_FULL_TIME_SPANS
        L_0x0108:
            ahxs r3 = new ahxs
            r3.<init>(r2, r1)
            return r3
        L_0x010e:
            r19 = r15
        L_0x0110:
            int r15 = r19 + 1
            r14 = 0
            goto L_0x0046
        L_0x0115:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxt.b(java.util.Calendar):ahxs");
    }

    public final long a(Calendar calendar) {
        return b(calendar, false);
    }

    public ahxt(List list, aizy aizy, ahxb ahxb) {
        this.a = list;
        this.b = aizy;
        this.c = ahxb;
    }

    public final ahxr a(Calendar calendar, boolean z) {
        ahxs ahxs;
        ahxq ahxq;
        boolean z2;
        ahyw ahyw = null;
        if (z) {
            ahxq = ahxq.FORCED_COLLECTION_FOR_TESTING;
            ahxs = null;
            z2 = true;
        } else {
            ahxs = b(calendar);
            if (ahxs != null) {
                boolean b2 = ahxs.a.b(calendar);
                if (b2) {
                    z2 = b2;
                    ahxq = ahxs.b;
                } else {
                    z2 = b2;
                    ahxq = null;
                }
            } else {
                ahxq = null;
                z2 = false;
            }
        }
        if (ahxs != null) {
            ahyw = ahxs.a;
        }
        return new ahxr(z2, ahxq, ahyw);
    }

    public final long b(Calendar calendar, boolean z) {
        boolean z2;
        ahxs b2 = b(calendar);
        if (b2 == null) {
            Calendar calendar2 = (Calendar) calendar.clone();
            calendar2.add(5, 1);
            ahyw.a(calendar2, 0);
            b2 = b(calendar2);
            z2 = true;
        } else {
            z2 = false;
        }
        Calendar calendar3 = (Calendar) calendar.clone();
        if (z2) {
            calendar3.add(5, 1);
        }
        amrl.a((Object) b2);
        amrl.a((Object) b2.a);
        ahyw.a(calendar3, z ? b2.a.a : b2.a.b);
        return calendar3.getTimeInMillis() - this.b.d();
    }
}
