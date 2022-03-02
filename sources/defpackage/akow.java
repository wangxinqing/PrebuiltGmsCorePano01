package defpackage;

/* renamed from: akow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akow extends akoq {
    private static final ou d;
    private static final ou e;
    private static final ou f;
    private float g;
    private long h;
    private akor i;
    private akos j;
    private akou k;

    static {
        ou ouVar = new ou();
        ouVar.put(1, 0);
        ouVar.put(4, 0);
        ouVar.put(2, 0);
        ouVar.put(3, 0);
        d = ouVar;
        ou ouVar2 = new ou();
        ouVar2.put(1, 0);
        ouVar2.put(4, 1);
        ouVar2.put(2, 1);
        ouVar2.put(3, 0);
        e = ouVar2;
        ou ouVar3 = new ou();
        ouVar3.put(1, 0);
        ouVar3.put(4, 0);
        ouVar3.put(2, 1);
        ouVar3.put(3, 1);
        f = ouVar3;
    }

    public akow(akma akma, akuo akuo) {
        super(akma, akuo);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: akov} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: aklm} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02e9, code lost:
        if (r0 != 4) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x028d, code lost:
        if (r2 > ((float) defpackage.azbz.a.a().e())) goto L_0x028f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0310 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.akor a(defpackage.akln r21) {
        /*
            r20 = this;
            r7 = r20
            r0 = r21
            akou r1 = r7.k
            aklr r2 = r0.a
            r1.l = r2
            akls r2 = r1.a
            aklr r3 = r1.l
            long r4 = r3.f
            int r3 = r3.e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 68
            r6.<init>(r8)
            java.lang.String r8 = "Segmenter: input time "
            r6.append(r8)
            r6.append(r4)
            java.lang.String r4 = ", input source "
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r2.a(r3)
            int r2 = r1.b
            r3 = 1
            int r2 = r2 + r3
            r1.b = r2
            int r2 = r1.c
            int r2 = r2 + r3
            r1.c = r2
            int r2 = r1.d
            int r2 = r2 + r3
            r1.d = r2
            int r2 = r1.e
            int r2 = r2 + r3
            r1.e = r2
            long r4 = r1.j
            r8 = 0
            r2 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0060
            aklr r6 = r0.a
            long r10 = r6.f
            akuo r6 = r1.n
            long r12 = defpackage.akuo.e()
            long r10 = r10 - r12
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 < 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r1.m = r2
        L_0x0060:
            aklh r4 = r0.d
            r5 = 3
            r6 = 0
            if (r4 != 0) goto L_0x0068
            goto L_0x00f1
        L_0x0068:
            java.util.List r4 = r4.a
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x00f1
            aklh r4 = r0.d
            long r10 = r4.b
            aklr r4 = r1.l
            long r12 = r4.f
            akuo r4 = r1.n
            long r14 = defpackage.akuo.e()
            long r12 = r12 - r14
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 < 0) goto L_0x00f1
            aklh r4 = r0.d
            long r10 = r4.b
            r1.j = r10
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            r12 = r2
            r11 = 0
        L_0x008d:
            java.util.List r13 = r4.a
            int r13 = r13.size()
            if (r11 >= r13) goto L_0x00b2
            java.util.List r13 = r4.a
            java.lang.Object r13 = r13.get(r11)
            aklm r13 = (defpackage.aklm) r13
            float r13 = r13.b
            int r14 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r14 <= 0) goto L_0x00ae
            java.util.List r10 = r4.a
            java.lang.Object r10 = r10.get(r11)
            r12 = r10
            aklm r12 = (defpackage.aklm) r12
            r10 = r13
            goto L_0x00af
        L_0x00ae:
        L_0x00af:
            int r11 = r11 + 1
            goto L_0x008d
        L_0x00b2:
            r1.m = r12
            aklm r4 = r1.m
            long r10 = r1.j
            akls r12 = r1.a
            int r13 = r4.a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r15 = 31
            r14.<init>(r15)
            java.lang.String r15 = ", detected activity "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r12.a(r13)
            int r4 = r4.a
            if (r4 == 0) goto L_0x00ed
            if (r4 == r3) goto L_0x00e8
            if (r4 == r5) goto L_0x00e3
            r12 = 6
            if (r4 == r12) goto L_0x00de
            goto L_0x00f1
        L_0x00de:
            r1.h = r10
            r1.d = r6
            goto L_0x00f1
        L_0x00e3:
            r1.f = r10
            r1.b = r6
            goto L_0x00f1
        L_0x00e8:
            r1.g = r10
            r1.c = r6
            goto L_0x00f1
        L_0x00ed:
            r1.i = r10
            r1.e = r6
        L_0x00f1:
            aklr r1 = r0.a
            long r10 = r1.f
            akor r4 = r7.i
            if (r4 == 0) goto L_0x0103
            akop r12 = r4.b
            long r12 = r12.b
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x0103
            goto L_0x03f1
        L_0x0103:
            long r12 = r7.h
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x03f1
            int r1 = r1.e
            if (r4 != 0) goto L_0x010e
            goto L_0x011f
        L_0x010e:
            akop r4 = r4.b
            aocj r4 = r4.a
            aocj r12 = defpackage.aocj.AT_PLACE
            if (r4 == r12) goto L_0x011f
            float r4 = r7.g
            float r1 = defpackage.akot.a((int) r1)
            float r4 = r4 + r1
            r7.g = r4
        L_0x011f:
            akou r1 = r7.k
            akos r4 = r7.j
            aklr r12 = r0.a
            aklx r12 = defpackage.aklx.a(r12)
            aklr r13 = r0.a
            int r13 = r13.e
            akov r14 = r4.c
            akuo r15 = r4.g
            azbz r15 = defpackage.azbz.a
            azca r15 = r15.a()
            double r5 = r15.f()
            float r5 = (float) r5
            r6 = 875071765(0x34288915, float:1.569609E-7)
            float r5 = r5 * r6
            double r5 = (double) r5
            akov r15 = r4.d
            boolean r15 = r15.b()
            if (r15 != 0) goto L_0x016a
            akov r15 = r4.d
            double r16 = defpackage.akot.a(r15, r12, r13)
            int r15 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r15 > 0) goto L_0x016a
            akov r5 = r4.d
            r5.a(r0)
            akov r0 = r4.d
            r4.f = r0
            akls r0 = r4.a
            java.lang.String r5 = r4.a()
            r0.a(r5)
            akov r0 = r4.f
            goto L_0x020a
        L_0x016a:
            boolean r15 = r14.b()
            if (r15 == 0) goto L_0x0171
            goto L_0x01b9
        L_0x0171:
            double r16 = defpackage.akot.a(r14, r12, r13)
            int r15 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r15 > 0) goto L_0x01b9
            akuo r5 = r4.g
            long r5 = defpackage.akuo.c()
            int r12 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x01a8
            long r5 = r14.a()
            akuo r8 = r4.g
            long r8 = defpackage.akuo.c()
            r12 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r12
            int r12 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r12 >= 0) goto L_0x0196
            goto L_0x01a8
        L_0x0196:
            akov r5 = new akov
            r5.<init>()
            r5.a(r0)
            r4.a(r5)
            r4.f = r5
            akov r0 = r4.f
            r4.d = r0
            goto L_0x020a
        L_0x01a8:
            r14.a(r0)
            r4.f = r14
            akls r0 = r4.a
            java.lang.String r5 = r4.a()
            r0.a(r5)
            akov r0 = r4.f
            goto L_0x020a
        L_0x01b9:
            java.util.ArrayList r8 = r4.b
            int r9 = r8.size()
            r15 = r2
            r14 = 0
        L_0x01c1:
            if (r14 >= r9) goto L_0x01df
            java.lang.Object r16 = r8.get(r14)
            r2 = r16
            akov r2 = (defpackage.akov) r2
            double r18 = defpackage.akot.a(r2, r12, r13)
            int r16 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r16 <= 0) goto L_0x01d4
            goto L_0x01d5
        L_0x01d4:
            r15 = r2
        L_0x01d5:
            int r2 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x01db
            r5 = r18
        L_0x01db:
            int r14 = r14 + 1
            r2 = 0
            goto L_0x01c1
        L_0x01df:
            if (r15 != 0) goto L_0x01fa
            akov r2 = new akov
            r2.<init>()
            r2.a(r0)
            r4.a(r2)
            r4.f = r2
            akls r0 = r4.a
            java.lang.String r2 = r4.a()
            r0.a(r2)
            akov r0 = r4.f
            goto L_0x020a
        L_0x01fa:
            r15.a(r0)
            r4.f = r15
            akls r0 = r4.a
            java.lang.String r2 = r4.a()
            r0.a(r2)
            akov r0 = r4.f
        L_0x020a:
            akos r2 = r7.j
            akov r4 = r2.c
            akov r2 = r2.f
            boolean r2 = r4.equals(r2)
            akos r4 = r7.j
            float r5 = r7.g
            akov r6 = r4.c
            boolean r6 = r6.b()
            r8 = 1073741824(0x40000000, float:2.0)
            if (r6 != 0) goto L_0x0242
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 < 0) goto L_0x0240
            akov r5 = r4.c
            long r5 = r5.c()
            akuo r4 = r4.g
            long r5 = r10 - r5
            azbz r4 = defpackage.azbz.a
            azca r4 = r4.a()
            long r12 = r4.h()
            int r4 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x0242
            r6 = 0
            goto L_0x0243
        L_0x0240:
            r6 = 0
            goto L_0x0243
        L_0x0242:
            r6 = 1
        L_0x0243:
            akls r4 = r1.a
            java.lang.String r5 = ", return code "
            r4.a(r5)
            r4 = 2
            r5 = 4
            if (r2 == 0) goto L_0x025b
            akls r0 = r1.a
            java.lang.String r2 = "0"
            r0.a(r2)
            r1.b()
            r0 = 4
            goto L_0x02e4
        L_0x025b:
            long r12 = r1.i
            int r2 = r1.e
            boolean r2 = r1.a(r12, r2)
            if (r2 != 0) goto L_0x028f
            long r12 = r1.h
            int r2 = r1.d
            boolean r2 = r1.a(r12, r2)
            if (r2 != 0) goto L_0x028f
            long r12 = r1.g
            int r2 = r1.c
            boolean r2 = r1.a(r12, r2)
            if (r2 == 0) goto L_0x027a
            goto L_0x028f
        L_0x027a:
            aklr r2 = r1.l
            float r2 = r2.g
            akuo r9 = r1.n
            azbz r9 = defpackage.azbz.a
            azca r9 = r9.a()
            double r12 = r9.e()
            float r9 = (float) r12
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x02a5
        L_0x028f:
            long r12 = r1.f
            int r2 = r1.b
            boolean r2 = r1.a(r12, r2)
            if (r2 != 0) goto L_0x02a5
            akls r0 = r1.a
            java.lang.String r2 = "1"
            r0.a(r2)
            r1.a()
            r0 = 3
            goto L_0x02e4
        L_0x02a5:
            float r2 = r0.a
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x02cb
            long r8 = r0.a()
            akuo r0 = r1.n
            azbz r0 = defpackage.azbz.a
            azca r0 = r0.a()
            long r12 = r0.i()
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x02cb
            akls r0 = r1.a
            java.lang.String r2 = "2"
            r0.a(r2)
            r1.b()
            r0 = 1
            goto L_0x02e4
        L_0x02cb:
            if (r6 != 0) goto L_0x02d9
            akls r0 = r1.a
            java.lang.String r2 = "3"
            r0.a(r2)
            r1.a()
            r0 = 2
            goto L_0x02e4
        L_0x02d9:
            akls r0 = r1.a
            java.lang.String r2 = "4"
            r0.a(r2)
            r1.a()
            r0 = 3
        L_0x02e4:
            if (r0 == r3) goto L_0x02fa
            r1 = 3
            if (r0 == r1) goto L_0x02ec
            if (r0 == r5) goto L_0x02fa
            goto L_0x030e
        L_0x02ec:
            akos r1 = r7.j
            akov r2 = new akov
            r2.<init>()
            akov r6 = r1.c
            r1.e = r6
            r1.c = r2
            goto L_0x030e
        L_0x02fa:
            akos r1 = r7.j
            akov r2 = r1.c
            r1.e = r2
            akov r2 = r1.f
            r1.c = r2
            akov r2 = new akov
            r2.<init>()
            r1.d = r2
            r1 = 0
            r7.g = r1
        L_0x030e:
            if (r0 == r3) goto L_0x0318
            if (r0 == r4) goto L_0x0318
            if (r0 == r5) goto L_0x0318
            aocj r1 = defpackage.aocj.IN_TRANSIT
            r2 = r1
            goto L_0x031b
        L_0x0318:
            aocj r1 = defpackage.aocj.AT_PLACE
            r2 = r1
        L_0x031b:
            azbb r1 = defpackage.azbb.a
            azbc r1 = r1.a()
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x032c
            int r1 = r7.a((defpackage.aocj) r2)
            goto L_0x0383
        L_0x032c:
            akor r1 = r7.b
            if (r1 != 0) goto L_0x0341
            ou r1 = d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0383
        L_0x0341:
            akop r1 = r1.b
            aocj r1 = r1.a
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x0373
            if (r1 == r3) goto L_0x0362
            if (r1 == r4) goto L_0x0351
            r1 = 1
            goto L_0x0383
        L_0x0351:
            ou r1 = f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0383
        L_0x0362:
            ou r1 = e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0383
        L_0x0373:
            ou r1 = d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L_0x0383:
            if (r1 != 0) goto L_0x0390
            akor r4 = r7.i
            if (r4 == 0) goto L_0x0390
            akos r4 = r7.j
            java.util.ArrayList r4 = r4.b
            r4.clear()
        L_0x0390:
            if (r0 == r3) goto L_0x039e
            r3 = 3
            if (r0 == r3) goto L_0x0399
            if (r0 == r5) goto L_0x039e
            r3 = r10
            goto L_0x03ae
        L_0x0399:
            akou r0 = r7.k
            long r3 = r0.k
            goto L_0x03ae
        L_0x039e:
            akos r0 = r7.j
            akov r3 = r0.c
            long r3 = r3.b
            akov r0 = r0.e
            long r5 = r0.c()
            long r3 = java.lang.Math.max(r3, r5)
        L_0x03ae:
            akos r0 = r7.j
            akov r5 = r0.c
            boolean r5 = r5.b()
            if (r5 != 0) goto L_0x03c2
            akov r0 = r0.c
            aklx r0 = r0.c
            aklr r0 = r0.a()
            r5 = r0
            goto L_0x03c3
        L_0x03c2:
            r5 = 0
        L_0x03c3:
            akos r0 = r7.j
            akov r0 = r0.c
            akli r6 = r0.d
            r0 = r20
            akor r0 = r0.a(r1, r2, r3, r5, r6)
            r7.i = r0
            akls r1 = r7.a
            java.lang.String r2 = r0.toString()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "\n"
            int r4 = r2.length()
            if (r4 != 0) goto L_0x03e9
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
            goto L_0x03ed
        L_0x03e9:
            java.lang.String r2 = r3.concat(r2)
        L_0x03ed:
            r1.a(r2)
            return r0
        L_0x03f1:
            akof r0 = defpackage.aklz.a()
            long r1 = r7.h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 119(0x77, float:1.67E-43)
            r3.<init>(r4)
            java.lang.String r4 = "Position timestamp out of order. Previous: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ", Current: "
            r3.append(r1)
            r3.append(r10)
            java.lang.String r1 = ". Skipping this Position."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.c(r1)
            akor r0 = r7.i
            if (r0 != 0) goto L_0x042e
            r1 = 0
            aocj r2 = defpackage.aocj.IN_TRANSIT
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 0
            r6 = 0
            r0 = r20
            akor r0 = r0.a(r1, r2, r3, r5, r6)
            goto L_0x044c
        L_0x042e:
            akop r0 = r0.b
            aocj r0 = r0.a
            aocj r1 = defpackage.aocj.AT_PLACE
            if (r0 != r1) goto L_0x044a
            aocj r2 = defpackage.aocj.AT_PLACE
            akor r0 = r7.i
            akop r0 = r0.b
            r1 = 1
            long r3 = r0.b
            aklr r5 = r0.c
            akli r6 = r0.d
            r0 = r20
            akor r0 = r0.a(r1, r2, r3, r5, r6)
            goto L_0x044c
        L_0x044a:
            akor r0 = r7.i
        L_0x044c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akow.a(akln):akor");
    }

    public final void a() {
        super.a();
        this.g = 0.0f;
        this.i = null;
        this.h = -1;
        this.j = new akos(this.c, this.a);
        this.k = new akou(this.c, this.a);
    }

    /* access modifiers changed from: protected */
    public final void a(akma akma, akln akln, akor akor) {
        akln akln2 = akln;
        akor akor2 = akor;
        aklr aklr = akln2.a;
        long j2 = aklr.f;
        long j3 = this.h;
        long j4 = -1;
        int i2 = j3 != -1 ? (int) ((j2 - j3) / 1000) : -1;
        boolean z = akln2.d != null;
        boolean z2 = akln2.b != null;
        boolean z3 = aklr.g != -1.0f;
        if (akor2.a == 1) {
            akop akop = akor2.b;
            aocj aocj = akop.a;
            long j5 = akop.b;
            aucd o = aocn.h.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aocn aocn = (aocn) o.b;
            aocn.b = 2;
            aocn.a |= 1;
            aucd o2 = aock.d.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aock aock = (aock) o2.b;
            int i3 = aock.a | 2;
            aock.a = i3;
            aock.c = j5;
            if (aocj != null) {
                aock.b = aocj.d;
                aock.a = i3 | 1;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            aocn aocn2 = (aocn) o.b;
            aock aock2 = (aock) o2.i();
            aock2.getClass();
            aocn2.c = aock2;
            aocn2.a |= 2;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aocn aocn3 = (aocn) o.b;
            aocn3.e = 1;
            aocn3.a |= 8;
            aucd o3 = aoco.f.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            aoco aoco = (aoco) o3.b;
            int i4 = 1 | aoco.a;
            aoco.a = i4;
            aoco.b = i2;
            int i5 = i4 | 2;
            aoco.a = i5;
            aoco.c = z;
            int i6 = i5 | 4;
            aoco.a = i6;
            aoco.d = z2;
            aoco.a = i6 | 8;
            aoco.e = z3;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aocn aocn4 = (aocn) o.b;
            aoco aoco2 = (aoco) o3.i();
            aoco2.getClass();
            aocn4.f = aoco2;
            aocn4.a |= 16;
            o.i();
            akun akun = (akun) akma;
            akun.a(akun.a((aocn) o.i()));
        } else {
            akop akop2 = akor2.b;
            aocj aocj2 = akop2.a;
            long j6 = akop2.b;
            akop akop3 = akor2.c;
            aocj aocj3 = akop3 != null ? akop3.a : aocj.UNKNOWN;
            akop akop4 = akor2.c;
            if (akop4 != null) {
                j4 = akop4.b;
            }
            aucd o4 = aocn.h.o();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            aocn aocn5 = (aocn) o4.b;
            aocn5.b = 1;
            aocn5.a |= 1;
            aucd o5 = aock.d.o();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            aock aock3 = (aock) o5.b;
            int i7 = aock3.a | 2;
            aock3.a = i7;
            aock3.c = j4;
            if (aocj3 != null) {
                aock3.b = aocj3.d;
                aock3.a = i7 | 1;
            }
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            aocn aocn6 = (aocn) o4.b;
            aock aock4 = (aock) o5.i();
            aock4.getClass();
            aocn6.c = aock4;
            aocn6.a |= 2;
            aucd o6 = aock.d.o();
            if (o6.c) {
                o6.c();
                o6.c = false;
            }
            aock aock5 = (aock) o6.b;
            int i8 = aock5.a | 2;
            aock5.a = i8;
            aock5.c = j6;
            if (aocj2 != null) {
                aock5.b = aocj2.d;
                aock5.a = i8 | 1;
            }
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            aocn aocn7 = (aocn) o4.b;
            aock aock6 = (aock) o6.i();
            aock6.getClass();
            aocn7.d = aock6;
            aocn7.a |= 4;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            aocn aocn8 = (aocn) o4.b;
            aocn8.e = 1;
            aocn8.a |= 8;
            aucd o7 = aoco.f.o();
            if (o7.c) {
                o7.c();
                o7.c = false;
            }
            aoco aoco3 = (aoco) o7.b;
            int i9 = aoco3.a | 1;
            aoco3.a = i9;
            aoco3.b = i2;
            int i10 = 2 | i9;
            aoco3.a = i10;
            aoco3.c = z;
            int i11 = i10 | 4;
            aoco3.a = i11;
            aoco3.d = z2;
            aoco3.a = i11 | 8;
            aoco3.e = z3;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            aocn aocn9 = (aocn) o4.b;
            aoco aoco4 = (aoco) o7.i();
            aoco4.getClass();
            aocn9.f = aoco4;
            aocn9.a |= 16;
            o4.i();
            akun akun2 = (akun) akma;
            akun2.a(akun2.a((aocn) o4.i()));
        }
        this.h = j2;
    }
}
