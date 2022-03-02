package defpackage;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;

/* renamed from: ahws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahws {
    public final ajbd a;
    public boolean b = false;
    public boolean c = true;
    public boolean d = false;
    public boolean e = true;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public int i = -1;
    public long j = -1;
    public long k = -1;
    public boolean l = false;
    public long m = -1;
    public boolean n = false;
    public long o = -1;
    public ajca p = null;
    public boolean q = false;
    public int r = 1;
    private final List s;
    private final aizy t;
    private final ajbg u;
    private final aizk v;
    private final ajbx w;
    private final ahqp x;
    private final Random y;
    private final Calendar z = Calendar.getInstance();

    public ahws(ajbd ajbd, aizy aizy, ajbg ajbg, ajbx ajbx, ahqp ahqp, aizk aizk) {
        Random random = new Random();
        this.v = aizk;
        this.a = ajbd;
        this.t = aizy;
        this.u = ajbg;
        this.x = ahqp;
        this.w = ajbx;
        this.y = random;
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new ahyw(6, 45, 10));
        arrayList.add(new ahyw(15, 30, 19));
        this.s = Collections.unmodifiableList(arrayList);
    }

    private final void a(long j2, long j3) {
        this.j = j2;
        this.u.a(ajbe.BURST_COLLECTION_TRIGGER, this.j, (aizx) null);
        String valueOf = String.valueOf(new Date(j3 + this.j));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Alarm scheduled at ");
        sb.append(valueOf);
        sb.toString();
    }

    private final boolean a(long j2) {
        return j2 >= this.j + -2000;
    }

    private final void b(long j2, boolean z2) {
        this.u.a(ajbe.BURST_COLLECTION_TRIGGER);
        this.j = -1;
        e();
        this.h = false;
        this.i = -1;
        this.f = false;
        this.g = false;
        if (z2) {
            this.o = -1;
            this.p = null;
        }
        if (this.r != 1) {
            this.r = 1;
            this.k = j2;
        }
        d();
    }

    private final void c() {
        if (!this.n) {
            this.u.b(ajbe.BURST_COLLECTION_TRIGGER, 60000, (aizx) null);
            this.n = true;
        }
    }

    private final void d() {
        if (this.n) {
            this.u.c(ajbe.BURST_COLLECTION_TRIGGER);
            this.n = false;
        }
    }

    private final void e() {
        if (this.l) {
            amrl.b(this.m != -1);
            this.v.c(this.m);
            this.l = false;
            this.m = -1;
        }
    }

    private final void a(Calendar calendar, long j2) {
        ahyw.a(calendar, ((ahyw) this.s.get(0)).a);
        this.z.add(6, 1);
        b(this.z, j2);
    }

    private final void a(Calendar calendar, ahyw ahyw, long j2) {
        if (!ahyw.b(calendar)) {
            ahyw.a(calendar, ahyw.a);
        }
        if (this.k != -1) {
            long timeInMillis = calendar.getTimeInMillis();
            long j3 = this.k + 600000;
            if (j3 > timeInMillis - j2) {
                calendar.setTimeInMillis(j3 + j2);
            }
            if (ahyw.b(calendar)) {
                b(calendar, j2);
            } else if (ahyw == this.s.get(0)) {
                ahyw.a(calendar, ((ahyw) this.s.get(1)).a);
                a(calendar, (ahyw) this.s.get(1), j2);
            } else {
                a(calendar, j2);
            }
        } else {
            b(calendar, j2);
        }
    }

    private final void b(Calendar calendar, long j2) {
        a(calendar.getTimeInMillis() - j2, j2);
    }

    public final void b() {
        int i2 = this.r;
        if (i2 == 4 || i2 == 5) {
            this.f = true;
            a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(long r11, boolean r13) {
        /*
            r10 = this;
            ajbd r0 = r10.a
            ajac r0 = r0.l()
            boolean r0 = r0.bf()
            ahqp r1 = r10.x
            boolean r1 = r1.f()
            r2 = 2
            boolean r3 = defpackage.ahxc.a(r2)
            r4 = 4
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0022
            boolean r3 = defpackage.ahxc.a(r4)
            if (r3 == 0) goto L_0x0022
            r3 = 1
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            boolean r7 = r10.b
            if (r7 == 0) goto L_0x0045
            boolean r7 = r10.e
            if (r7 == 0) goto L_0x0045
            boolean r7 = defpackage.ahwx.a()
            if (r7 == 0) goto L_0x0045
            boolean r7 = r10.q
            if (r7 == 0) goto L_0x0037
            r7 = 0
            goto L_0x0046
        L_0x0037:
            if (r1 != 0) goto L_0x003a
            goto L_0x0045
        L_0x003a:
            if (r3 != 0) goto L_0x003d
            goto L_0x0045
        L_0x003d:
            if (r0 == 0) goto L_0x0045
            boolean r7 = r10.d
            if (r7 == 0) goto L_0x0045
            r7 = 1
            goto L_0x0046
        L_0x0045:
            r7 = 0
        L_0x0046:
            int r8 = r10.r
            int r9 = r8 + -1
            if (r8 == 0) goto L_0x00d4
            if (r9 == 0) goto L_0x007e
            if (r9 == r5) goto L_0x0077
            r8 = 3
            if (r9 == r2) goto L_0x006a
            if (r9 == r8) goto L_0x006a
            if (r9 == r4) goto L_0x0059
        L_0x0057:
            goto L_0x00d3
        L_0x0059:
            if (r7 == 0) goto L_0x0080
            boolean r2 = r10.f
            if (r2 != 0) goto L_0x0080
            boolean r2 = r10.c
            if (r2 != 0) goto L_0x0080
            boolean r2 = r10.a(r11)
            if (r2 != 0) goto L_0x0080
            goto L_0x0076
        L_0x006a:
            if (r7 == 0) goto L_0x0080
            int r2 = r10.i
            if (r2 == 0) goto L_0x0072
            if (r2 != r8) goto L_0x0080
        L_0x0072:
            boolean r2 = r10.f
            if (r2 != 0) goto L_0x0080
        L_0x0076:
            goto L_0x007d
        L_0x0077:
            if (r7 == 0) goto L_0x0080
            boolean r2 = r10.f
            if (r2 != 0) goto L_0x0080
        L_0x007d:
            goto L_0x00d3
        L_0x007e:
            if (r7 != 0) goto L_0x0057
        L_0x0080:
            boolean r2 = r10.b
            boolean r4 = r10.c
            boolean r6 = r10.d
            boolean r7 = r10.f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 158(0x9e, float:2.21E-43)
            r8.<init>(r9)
            java.lang.String r9 = "[fullCollectionEnabled="
            r8.append(r9)
            r8.append(r2)
            java.lang.String r2 = ", screenOn="
            r8.append(r2)
            r8.append(r4)
            java.lang.String r2 = ", isBatteryHealthy="
            r8.append(r2)
            r8.append(r6)
            java.lang.String r2 = ", collectionCanceled="
            r8.append(r2)
            r8.append(r7)
            java.lang.String r2 = ", serverEnabled="
            r8.append(r2)
            r8.append(r1)
            java.lang.String r1 = ", gservicesEnabled="
            r8.append(r1)
            r8.append(r3)
            java.lang.String r1 = ", gpsEnabled="
            r8.append(r1)
            r8.append(r0)
            java.lang.String r0 = "]"
            r8.append(r0)
            r8.toString()
            r10.b((long) r11, (boolean) r13)
            return r5
        L_0x00d3:
            return r6
        L_0x00d4:
            r11 = 0
            goto L_0x00d7
        L_0x00d6:
            throw r11
        L_0x00d7:
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahws.a(long, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x0256 A[EDGE_INSN: B:122:0x0256->B:89:0x0256 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0239  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r19 = this;
            r0 = r19
            r1 = 0
            r2 = 0
        L_0x0004:
            aizy r3 = r0.t
            long r3 = r3.c()
            int r5 = r0.r
            int r6 = r5 + -1
            r7 = 0
            if (r5 == 0) goto L_0x0282
            r8 = -1
            r5 = 2
            r10 = 1
            if (r6 == 0) goto L_0x0196
            r11 = 3
            if (r6 == r10) goto L_0x014a
            r12 = 4
            if (r6 == r5) goto L_0x011b
            if (r6 == r11) goto L_0x007b
            if (r6 == r12) goto L_0x0023
            goto L_0x027f
        L_0x0023:
            boolean r2 = r0.a((long) r3, (boolean) r1)
            if (r2 == 0) goto L_0x006f
            long r11 = r0.o
            long r11 = r11 - r3
            r2 = 0
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0034
            goto L_0x005d
        L_0x0034:
            ajbx r4 = r0.w
            ajca r6 = r0.p
            if (r6 == 0) goto L_0x005d
            long r13 = r6.a(r11)
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
            r5[r1] = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            r5[r10] = r6
            int r5 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x005d
            ajbz r2 = r4.a
            aizy r3 = r4.f
            long r3 = r3.c()
            r2.a((long) r3)
        L_0x005d:
            ajbd r2 = r0.a
            ajac r2 = r2.l()
            ajbe r3 = defpackage.ajbe.BURST_COLLECTION_TRIGGER
            r2.a(r3, r1)
            r0.o = r8
            r0.p = r7
            r2 = 1
            goto L_0x027f
        L_0x006f:
            ajbg r2 = r0.u
            ajbe r3 = defpackage.ajbe.BURST_COLLECTION_TRIGGER
            long r4 = r0.j
            r2.a(r3, r4, r7)
            r2 = 0
            goto L_0x027f
        L_0x007b:
            boolean r2 = r0.a((long) r3, (boolean) r10)
            if (r2 != 0) goto L_0x0117
            boolean r2 = r0.g
            if (r2 == 0) goto L_0x0114
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x010f
            r19.c()
            ajbx r2 = r0.w
            ajbz r6 = r2.a
            ajcc r6 = r6.e
            aizy r2 = r2.f
            long r7 = r2.c()
            long r6 = r6.b(r7)
            r8 = 120000(0x1d4c0, double:5.9288E-319)
            long r6 = java.lang.Math.min(r6, r8)
            r8 = 58000(0xe290, double:2.8656E-319)
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b4
            r0.b((long) r3, (boolean) r10)
            r19.d()
            r2 = 1
            goto L_0x027f
        L_0x00b4:
            ajbx r2 = r0.w
            ajcc r8 = r2.e
            aizy r9 = r2.f
            long r11 = r9.c()
            ajca r9 = r8.a((long) r6, (long) r11)
            java.util.Locale r13 = java.util.Locale.ENGLISH
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Long r13 = java.lang.Long.valueOf(r6)
            r5[r1] = r13
            long r13 = r8.c
            java.lang.Long r8 = java.lang.Long.valueOf(r13)
            r5[r10] = r8
            if (r9 != 0) goto L_0x00d7
            goto L_0x00dc
        L_0x00d7:
            ajbz r2 = r2.a
            r2.a((long) r11)
        L_0x00dc:
            r0.p = r9
            if (r9 == 0) goto L_0x0105
            aizy r2 = r0.t
            long r2 = r2.c()
            long r2 = r2 + r6
            r0.o = r2
            ajbd r2 = r0.a
            ajac r2 = r2.l()
            ajbe r3 = defpackage.ajbe.BURST_COLLECTION_TRIGGER
            r2.a(r3, r10)
            long r2 = r0.o
            aizy r4 = r0.t
            long r4 = r4.d()
            r0.a((long) r2, (long) r4)
            r2 = 5
            r0.r = r2
            r2 = 1
            goto L_0x027f
        L_0x0105:
            r0.b((long) r3, (boolean) r10)
            r19.d()
            r2 = 1
            goto L_0x027f
        L_0x010f:
            r0.b((long) r3, (boolean) r10)
            goto L_0x0118
        L_0x0114:
            r2 = 0
            goto L_0x027f
        L_0x0117:
        L_0x0118:
            r2 = 1
            goto L_0x027f
        L_0x011b:
            boolean r2 = r0.a((long) r3, (boolean) r10)
            if (r2 != 0) goto L_0x0147
            boolean r2 = r0.a(r3)
            if (r2 == 0) goto L_0x013b
            ajbd r2 = r0.a
            ajbg r2 = r2.k()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r2.a((java.lang.Object) r3)
            r19.e()
            r0.r = r12
            r2 = 1
            goto L_0x027f
        L_0x013b:
            ajbg r2 = r0.u
            ajbe r3 = defpackage.ajbe.BURST_COLLECTION_TRIGGER
            long r4 = r0.j
            r2.a(r3, r4, r7)
            r2 = 0
            goto L_0x027f
        L_0x0147:
            r2 = 1
            goto L_0x027f
        L_0x014a:
            boolean r2 = r0.a((long) r3, (boolean) r10)
            if (r2 != 0) goto L_0x0193
            boolean r2 = r0.h
            if (r2 == 0) goto L_0x017b
            java.util.Random r2 = r0.y
            ahqp r5 = r0.x
            int r5 = r5.i()
            int r2 = r2.nextInt(r5)
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r5[r1] = r6
            long r5 = (long) r2
            long r3 = r3 + r5
            aizy r2 = r0.t
            long r5 = r2.d()
            r0.a((long) r3, (long) r5)
            r0.r = r11
            r2 = 1
            goto L_0x027f
        L_0x017b:
            boolean r2 = r0.a(r3)
            if (r2 == 0) goto L_0x0187
            r0.b((long) r3, (boolean) r10)
            r2 = 1
            goto L_0x027f
        L_0x0187:
            ajbg r2 = r0.u
            ajbe r3 = defpackage.ajbe.BURST_COLLECTION_TRIGGER
            long r4 = r0.j
            r2.a(r3, r4, r7)
            r2 = 0
            goto L_0x027f
        L_0x0193:
            r2 = 1
            goto L_0x027f
        L_0x0196:
            boolean r2 = r0.a((long) r3, (boolean) r10)
            if (r2 != 0) goto L_0x027d
            aizy r2 = r0.t
            long r11 = r2.d()
            long r13 = r0.j
            int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0227
            boolean r2 = r0.a(r3)
            if (r2 == 0) goto L_0x021c
            java.util.Calendar r2 = r0.z
            long r13 = r0.j
            long r13 = r13 + r11
            r2.setTimeInMillis(r13)
            java.util.Calendar r2 = r0.z
            java.util.List r6 = r0.s
            java.util.Iterator r6 = r6.iterator()
        L_0x01be:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x01d2
            java.lang.Object r13 = r6.next()
            ahyw r13 = (defpackage.ahyw) r13
            boolean r14 = r13.b((java.util.Calendar) r2)
            if (r14 == 0) goto L_0x01be
            r7 = r13
            goto L_0x01d3
        L_0x01d2:
        L_0x01d3:
            if (r7 == 0) goto L_0x0216
            r19.c()
            boolean r2 = r0.l
            if (r2 == 0) goto L_0x01dd
            goto L_0x01fd
        L_0x01dd:
            long r2 = r0.m
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x01e5
            r2 = 1
            goto L_0x01e6
        L_0x01e5:
            r2 = 0
        L_0x01e6:
            defpackage.amrl.b(r2)
            ahqp r2 = r0.x
            int r2 = r2.h()
            long r2 = (long) r2
            r8 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r8
            r0.m = r2
            aizk r4 = r0.v
            r4.a(r2, r10)
            r0.l = r10
        L_0x01fd:
            java.util.Calendar r2 = r0.z
            long r3 = r7.b
            defpackage.ahyw.a((java.util.Calendar) r2, (long) r3)
            java.util.Calendar r2 = r0.z
            long r2 = r2.getTimeInMillis()
            long r2 = r2 - r11
            r0.a((long) r2, (long) r11)
            r0.r = r5
            r19.d()
            r2 = 1
            goto L_0x027f
        L_0x0216:
            r0.b((long) r3, (boolean) r10)
            r2 = 1
            goto L_0x027f
        L_0x021c:
            ajbg r2 = r0.u
            ajbe r3 = defpackage.ajbe.BURST_COLLECTION_TRIGGER
            long r4 = r0.j
            r2.a(r3, r4, r7)
            r2 = 0
            goto L_0x027f
        L_0x0227:
            java.util.Calendar r2 = r0.z
            long r3 = r3 + r11
            r2.setTimeInMillis(r3)
            java.util.List r2 = r0.s
            java.util.Iterator r2 = r2.iterator()
        L_0x0233:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0255
            java.lang.Object r3 = r2.next()
            ahyw r3 = (defpackage.ahyw) r3
            java.util.Calendar r4 = r0.z
            long r4 = defpackage.ahyw.c((java.util.Calendar) r4)
            boolean r6 = r3.a((long) r4)
            if (r6 != 0) goto L_0x0252
            long r8 = r3.a
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0233
            goto L_0x0253
        L_0x0252:
        L_0x0253:
            r7 = r3
            goto L_0x0256
        L_0x0255:
        L_0x0256:
            ajbx r2 = r0.w
            ajbz r3 = r2.a
            ajcc r13 = r3.e
            r14 = 58000(0xe290, double:2.8656E-319)
            aizy r2 = r2.f
            long r16 = r2.c()
            r18 = 0
            boolean r2 = r13.a(r14, r16, r18)
            if (r7 != 0) goto L_0x026e
            goto L_0x0276
        L_0x026e:
            if (r2 == 0) goto L_0x0276
            java.util.Calendar r2 = r0.z
            r0.a(r2, r7, r11)
            goto L_0x027e
        L_0x0276:
            java.util.Calendar r2 = r0.z
            r0.a((java.util.Calendar) r2, (long) r11)
            r2 = 0
            goto L_0x027f
        L_0x027d:
        L_0x027e:
            r2 = 0
        L_0x027f:
            if (r2 != 0) goto L_0x0004
            return
        L_0x0282:
            goto L_0x0285
        L_0x0284:
            throw r7
        L_0x0285:
            goto L_0x0284
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahws.a():void");
    }
}
