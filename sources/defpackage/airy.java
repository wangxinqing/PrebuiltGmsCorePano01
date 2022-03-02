package defpackage;

/* renamed from: airy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class airy {
    private static final aiam L = new aiam(20000);
    public boolean A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    boolean F = false;
    final aibb G;
    public final airs H = new airx(this);
    public final aiai I;
    public final airr J;
    public aiwz K;
    private final airv M;
    private long N = 0;
    private aiay O = null;
    public final ajbd a;
    final ahqj b;
    public final airz c;
    public aiat d;
    public final airo e;
    protected aiax f = new aiax((aiav) null, (aibo) null);
    public long g = 0;
    public long h = 0;
    public boolean i;
    protected boolean j = false;
    boolean k = false;
    public boolean l = false;
    public boolean m;
    protected final aiaq n;
    public long o = -1;
    protected boolean p = false;
    protected long q = -1;
    protected long r = -1;
    public final aiam s = new aiam(30000);
    public long t = -1;
    public int u = 0;
    public boolean v = false;
    public boolean w = false;
    public long x = -1;
    public aibr y;
    aibr[] z;

    public airy(ajbd ajbd, airo airo, aibb aibb, airv airv, aiai aiai, ahqj ahqj, airz airz) {
        this.a = ajbd;
        this.e = airo;
        this.G = aibb;
        this.M = airv;
        this.I = aiai;
        this.d = new aiat(Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE);
        this.J = new airr();
        this.n = new aiaq();
        this.b = ahqj;
        this.c = airz;
        this.y = aibr.a(-20000);
    }

    private final void a(boolean z2, int i2, long j2) {
        this.a.o().a(aico.WIFI_BATCH_MODE_CHANGED, z2 ? 1 : 0, i2, (int) j2);
    }

    public final boolean a() {
        return this.q > this.r;
    }

    public final boolean b() {
        long j2 = this.x;
        return j2 != -1 && this.w && j2 > this.h;
    }

    public final void a(long j2) {
        this.r = j2;
        this.q = Math.min(this.q, j2 - 1);
        this.a.k().c(ajbe.LOCATOR);
    }

    public final void a(aizy aizy, aiat aiat, boolean z2) {
        long c2 = aizy.c();
        String valueOf = String.valueOf(aiat);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("PassivePos: setPeriod, locatorParams: ");
        sb.append(valueOf);
        sb.toString();
        aiat aiat2 = this.d;
        boolean z3 = this.v;
        boolean z4 = this.w;
        if ((!z3 && !z4) || !aiat.b()) {
            aiat.g = aiat2.g;
        } else {
            aiat.g = Math.min(aiat2.g, !z2 ? aiat.a(c2) : 0);
        }
        if (z3 && aiat.c()) {
            aiat.f = Math.min(aiat.f, !z2 ? aiat.b(c2) : 0);
        } else {
            aiat.f = aiat2.f;
        }
        aiat aiat3 = this.d;
        this.d = aiat;
        boolean z5 = this.w && aiat.d();
        boolean a2 = this.a.n().a();
        this.A = !z5 ? false : a2;
        if (a2 && aiat3.d()) {
            a(false, 0, 0);
            ajbl n2 = this.a.n();
            long j2 = aiat3.a;
            boolean z6 = aiat3.h;
            aizx aizx = aiat3.e;
            n2.a(false, j2, 0, z6);
        }
        if (this.A) {
            this.a.n().b();
            a(true, this.d.e(), this.d.a);
            ajbl n3 = this.a.n();
            aiat aiat4 = this.d;
            long j3 = aiat4.a;
            int e2 = aiat4.e();
            aiat aiat5 = this.d;
            boolean z7 = aiat5.h;
            aizx aizx2 = aiat5.e;
            n3.a(true, j3, e2, z7);
        }
        a(aizy, (aibr[]) null, false);
    }

    public final void a(aizy aizy, boolean z2, boolean z3) {
        boolean z4;
        boolean z5 = z2;
        boolean z6 = z3;
        aiat aiat = this.d;
        long c2 = aizy.c();
        boolean z7 = this.v;
        boolean z8 = this.w;
        boolean z9 = true;
        if (z7) {
            z4 = true;
        } else {
            z4 = z8;
        }
        if (!z5 && !z6) {
            z9 = false;
        }
        if (z4 != z9) {
            if (!z9 || !aiat.b()) {
                aiat.g = Long.MAX_VALUE;
            } else {
                aiat.g = c2 - 1;
            }
        }
        if (z7 != z5) {
            if (!z5 || !aiat.c()) {
                aiat.f = Long.MAX_VALUE;
            } else {
                aiat.f = c2 - 1;
            }
        }
        this.v = z5;
        this.w = z6;
        a(aizy, (aibr[]) null, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v77, resolved type: aiah} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v78, resolved type: aiah} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v79, resolved type: aibo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v80, resolved type: aiah} */
    /* JADX WARNING: type inference failed for: r3v22, types: [java.lang.Object[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x032c, code lost:
        if (r11 < (r5 * 0.9d)) goto L_0x0332;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x014f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x035b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x04be A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x052b  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x05a0  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x05a8  */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x05aa  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x05c6  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x05e8  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x05ea  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0608  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x060a  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0617  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0619  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x062a  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x062c  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x063d  */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x063f  */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0654  */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0656  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x0659  */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x065b  */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x0667  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0669  */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0677  */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x0679  */
    /* JADX WARNING: Removed duplicated region for block: B:461:0x0684 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:464:0x068a  */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x068c  */
    /* JADX WARNING: Removed duplicated region for block: B:470:0x0697  */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x0699  */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x06a4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:479:0x06aa  */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x06ac  */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x06b1  */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x06ce  */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x06d3  */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x06d9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:492:0x06e5  */
    /* JADX WARNING: Removed duplicated region for block: B:498:0x06f9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:501:0x070e  */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x071f  */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x0734  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:599:0x0931  */
    /* JADX WARNING: Removed duplicated region for block: B:602:0x0945  */
    /* JADX WARNING: Removed duplicated region for block: B:603:0x0949  */
    /* JADX WARNING: Removed duplicated region for block: B:607:0x095c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:620:0x09a1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:696:0x0b1c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00de A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:786:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.aizy r54, defpackage.aibr[] r55, boolean r56) {
        /*
            r53 = this;
            r0 = r53
            r1 = r54
            r2 = r55
            long r3 = r54.c()
            r5 = -1
            if (r2 == 0) goto L_0x0014
            int r7 = r2.length
            if (r7 == 0) goto L_0x0014
            int r7 = r7 + r5
            r7 = r2[r7]
            goto L_0x0015
        L_0x0014:
            r7 = 0
        L_0x0015:
            if (r7 != 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            r0.y = r7
            r0.z = r2
        L_0x001c:
            ahqj r2 = r0.b
            boolean r7 = r2.j
            if (r7 == 0) goto L_0x0036
            aizy r7 = r2.b
            long r7 = r7.b()
            long r9 = r2.e
            long r9 = r7 - r9
            r11 = 3600000(0x36ee80, double:1.7786363E-317)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x0036
            r2.a((long) r7)
        L_0x0036:
            long r7 = r0.q
            long r7 = r3 - r7
            long r9 = r0.h
            long r9 = r3 - r9
            aiam r2 = r0.s
            aiaj r2 = r2.a
            aiat r11 = r0.d
            long r12 = r11.g
            long r14 = r11.f
            int r17 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r17 >= 0) goto L_0x0053
            int r17 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r17 >= 0) goto L_0x0053
            r17 = 0
            goto L_0x0055
        L_0x0053:
            r17 = 1
        L_0x0055:
            r18 = 20000(0x4e20, double:9.8813E-320)
            if (r2 == 0) goto L_0x006b
            boolean r20 = r2.e()
            if (r20 == 0) goto L_0x006b
            r21 = r7
            long r6 = r2.g
            long r6 = r3 - r6
            int r8 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r8 >= 0) goto L_0x006d
            r6 = 1
            goto L_0x006e
        L_0x006b:
            r21 = r7
        L_0x006d:
            r6 = 0
        L_0x006e:
            boolean r7 = r53.b()
            r23 = 5000(0x1388, double:2.4703E-320)
            if (r7 == 0) goto L_0x0081
            long r7 = r0.x
            long r7 = r3 - r7
            int r25 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r25 > 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            r0.h = r3
        L_0x0081:
            r7 = 0
            int r25 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r25 >= 0) goto L_0x009b
            r26 = r12
            long r11 = r0.g
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 == 0) goto L_0x0099
            long r11 = r0.h
            long r7 = r0.N
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 <= 0) goto L_0x009d
            r7 = 1
            goto L_0x009e
        L_0x0099:
            r7 = 1
            goto L_0x009e
        L_0x009b:
            r26 = r12
        L_0x009d:
            r7 = 0
        L_0x009e:
            if (r6 == 0) goto L_0x00b6
            aiai r8 = r0.I
            boolean r8 = r8.b()
            if (r8 == 0) goto L_0x00b6
            aiax r8 = r0.f
            aiah r8 = r8.c
            if (r8 == 0) goto L_0x00b1
            aiaj r8 = r8.b
            goto L_0x00b2
        L_0x00b1:
            r8 = 0
        L_0x00b2:
            if (r2 == r8) goto L_0x00b6
            r8 = 1
            goto L_0x00b7
        L_0x00b6:
            r8 = 0
        L_0x00b7:
            if (r17 == 0) goto L_0x00cf
            boolean r11 = r0.v
            if (r11 == 0) goto L_0x00cf
            boolean r11 = r0.i
            if (r11 != 0) goto L_0x00cf
            ajbd r11 = r0.a
            aizp r11 = r11.d()
            boolean r11 = r11.a()
            if (r11 == 0) goto L_0x00cf
            r11 = 1
            goto L_0x00d0
        L_0x00cf:
            r11 = 0
        L_0x00d0:
            int r12 = (r3 > r26 ? 1 : (r3 == r26 ? 0 : -1))
            if (r12 < 0) goto L_0x00ea
            boolean r12 = r0.w
            if (r12 == 0) goto L_0x00ea
            boolean r12 = r0.i
            if (r12 == 0) goto L_0x00de
            r12 = 0
            goto L_0x00eb
        L_0x00de:
            if (r7 == 0) goto L_0x00e8
            long r12 = r18 - r9
            r28 = 200(0xc8, double:9.9E-322)
            int r25 = (r12 > r28 ? 1 : (r12 == r28 ? 0 : -1))
            if (r25 >= 0) goto L_0x00ea
        L_0x00e8:
            r12 = 1
            goto L_0x00eb
        L_0x00ea:
            r12 = 0
        L_0x00eb:
            r25 = r6
            r5 = -1
            if (r11 != 0) goto L_0x0105
            r28 = r14
            long r13 = r0.t
            int r30 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r30 != 0) goto L_0x00fb
            r2 = 0
            goto L_0x0108
        L_0x00fb:
            if (r2 == 0) goto L_0x0107
            long r5 = r2.g
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0107
            r2 = 0
            goto L_0x0108
        L_0x0105:
            r28 = r14
        L_0x0107:
            r2 = 1
        L_0x0108:
            if (r12 != 0) goto L_0x0112
            boolean r5 = r53.b()
            if (r5 != 0) goto L_0x0112
            r5 = 0
            goto L_0x0113
        L_0x0112:
            r5 = 1
        L_0x0113:
            if (r2 != 0) goto L_0x0117
            r6 = 0
            goto L_0x0125
        L_0x0117:
            if (r11 != 0) goto L_0x0124
            long r13 = r0.t
            long r13 = r3 - r13
            int r6 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r6 >= 0) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r6 = 0
            goto L_0x0125
        L_0x0124:
            r6 = 1
        L_0x0125:
            if (r5 != 0) goto L_0x0129
            r13 = 0
            goto L_0x0137
        L_0x0129:
            if (r12 != 0) goto L_0x0136
            long r13 = r0.x
            long r13 = r3 - r13
            int r31 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r31 >= 0) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            r13 = 0
            goto L_0x0137
        L_0x0136:
            r13 = 1
        L_0x0137:
            if (r6 == 0) goto L_0x013b
            r13 = 1
            goto L_0x0140
        L_0x013b:
            if (r13 != 0) goto L_0x013f
            r13 = 0
            goto L_0x0140
        L_0x013f:
            r13 = 1
        L_0x0140:
            if (r8 != 0) goto L_0x0145
            if (r7 != 0) goto L_0x0145
            goto L_0x0149
        L_0x0145:
            if (r13 != 0) goto L_0x0149
        L_0x0147:
            r6 = 1
            goto L_0x0156
        L_0x0149:
            boolean r13 = r0.w
            if (r13 == 0) goto L_0x014f
            r6 = 0
            goto L_0x0156
        L_0x014f:
            if (r25 != 0) goto L_0x0153
        L_0x0151:
            r6 = 0
            goto L_0x0156
        L_0x0153:
            if (r6 == 0) goto L_0x0147
            goto L_0x0151
        L_0x0156:
            if (r56 == 0) goto L_0x015a
            r6 = 1
            goto L_0x016a
        L_0x015a:
            if (r17 != 0) goto L_0x0161
            boolean r13 = r0.j
            if (r13 != 0) goto L_0x0161
            goto L_0x0165
        L_0x0161:
            if (r6 == 0) goto L_0x0165
        L_0x0163:
            r6 = 1
            goto L_0x016a
        L_0x0165:
            boolean r6 = r0.E
            if (r6 != 0) goto L_0x0163
            r6 = 0
        L_0x016a:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r13 = 4
            if (r6 == 0) goto L_0x052b
            long r14 = defpackage.aydu.j()
            int r15 = (int) r14
            r14 = r15 & 4
            if (r14 == 0) goto L_0x0185
            aiat r14 = r0.d
            boolean r14 = r14.d()
            if (r14 == 0) goto L_0x0185
            r14 = 1
            goto L_0x0186
        L_0x0185:
            r14 = 0
        L_0x0186:
            if (r14 != 0) goto L_0x01ae
            aibr[] r15 = r0.z
            if (r15 != 0) goto L_0x0195
            r35 = r11
            r38 = r12
            r31 = r14
            r1 = 0
            goto L_0x02c0
        L_0x0195:
            int r15 = r15.length
            if (r15 <= 0) goto L_0x01a5
            r31 = r14
            long r13 = r0.h
            r0.N = r13
            r35 = r11
            r38 = r12
            r14 = r31
            goto L_0x01ab
        L_0x01a5:
            r31 = r14
            r35 = r11
            r38 = r12
        L_0x01ab:
            r1 = 0
            goto L_0x02c0
        L_0x01ae:
            r31 = r14
            if (r7 != 0) goto L_0x01c5
            boolean r13 = r0.E
            if (r13 != 0) goto L_0x01c5
            r13 = 1
            aibr[] r14 = new defpackage.aibr[r13]
            aibr r13 = defpackage.aibr.a((long) r3)
            r25 = 0
            r14[r25] = r13
            r15 = 4
            r0.z = r14
            goto L_0x01c6
        L_0x01c5:
            r15 = 4
        L_0x01c6:
            if (r56 == 0) goto L_0x01ce
            r35 = r11
            r38 = r12
            goto L_0x0268
        L_0x01ce:
            boolean r13 = r0.A
            if (r13 != 0) goto L_0x0264
            aibr[] r13 = r0.z
            if (r13 == 0) goto L_0x0264
            defpackage.amrl.a((java.lang.Object) r13)
            aibr[] r13 = r0.z
            int r15 = r13.length
            r14 = 0
            r33 = 0
        L_0x01df:
            if (r14 < r15) goto L_0x0231
            aibb r13 = r0.G
            int r14 = r13.a()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r14)
            aiqp r13 = (defpackage.aiqp) r13
            java.util.ArrayList r14 = r13.a
            int r1 = r14.size()
            r35 = r11
            r11 = 0
        L_0x01f7:
            if (r11 >= r1) goto L_0x0220
            java.lang.Object r36 = r14.get(r11)
            r37 = r1
            r1 = r36
            aibr r1 = (defpackage.aibr) r1
            r36 = r14
            com.google.android.location.utils.ParcelableByteArray r14 = new com.google.android.location.utils.ParcelableByteArray
            r38 = r12
            int r12 = r1.b()
            byte[] r1 = r1.d(r12)
            r14.<init>((byte[]) r1)
            r15.add(r14)
            int r11 = r11 + 1
            r14 = r36
            r1 = r37
            r12 = r38
            goto L_0x01f7
        L_0x0220:
            r38 = r12
            ikh r1 = r13.b
            r1.a((java.util.Collection) r15)
            if (r33 == 0) goto L_0x022d
            long r11 = r0.h
            r0.N = r11
        L_0x022d:
            r1 = 0
            r0.z = r1
            goto L_0x0268
        L_0x0231:
            r35 = r11
            r38 = r12
            r1 = r13[r14]
            if (r1 == 0) goto L_0x025a
            aibb r11 = r0.G
            java.util.ArrayList r11 = r11.a
            r11.add(r1)
            aibb r1 = r0.G
            int r1 = r1.a()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r12 = 48
            r11.<init>(r12)
            java.lang.String r12 = "BATCH: appending a scan, size is now "
            r11.append(r12)
            r11.append(r1)
            r11.toString()
            r33 = 1
        L_0x025a:
            int r14 = r14 + 1
            r1 = r54
            r11 = r35
            r12 = r38
            goto L_0x01df
        L_0x0264:
            r35 = r11
            r38 = r12
        L_0x0268:
            aibb r1 = r0.G
            int r1 = r1.a()
            aiat r11 = r0.d
            int r11 = r11.e()
            if (r1 >= r11) goto L_0x027c
            boolean r1 = r0.E
            if (r1 != 0) goto L_0x027c
            r1 = 0
            goto L_0x027d
        L_0x027c:
            r1 = 1
        L_0x027d:
            boolean r11 = r0.A
            if (r11 == 0) goto L_0x0283
            r1 = 1
            goto L_0x028a
        L_0x0283:
            if (r1 == 0) goto L_0x0287
        L_0x0285:
            r1 = 1
            goto L_0x028a
        L_0x0287:
            if (r56 != 0) goto L_0x0285
            r1 = 0
        L_0x028a:
            if (r56 == 0) goto L_0x028e
        L_0x028c:
            r14 = 1
            goto L_0x02c0
        L_0x028e:
            if (r1 != 0) goto L_0x0291
            goto L_0x028c
        L_0x0291:
            if (r11 != 0) goto L_0x02be
            aibb r11 = r0.G
            java.util.ArrayList r11 = r11.a
            int r12 = r11.size()
            aibr[] r12 = new defpackage.aibr[r12]
            java.lang.Object[] r11 = r11.toArray(r12)
            aibr[] r11 = (defpackage.aibr[]) r11
            r0.z = r11
            int r11 = r11.length
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r13 = 48
            r12.<init>(r13)
            java.lang.String r13 = "BATCH: unpack list of scans, size is "
            r12.append(r13)
            r12.append(r11)
            r12.toString()
            aibb r11 = r0.G
            r11.b()
            goto L_0x02bf
        L_0x02be:
        L_0x02bf:
            r14 = 1
        L_0x02c0:
            aiax r11 = r0.f
            if (r11 == 0) goto L_0x02ce
            aiav r11 = r11.a
            if (r11 == 0) goto L_0x02ce
            aibe r12 = r11.c
            r13 = r12
            long r11 = r11.e
            goto L_0x02d1
        L_0x02ce:
            r11 = -1
            r13 = 0
        L_0x02d1:
            aiwz r15 = r0.K
            r33 = 90000(0x15f90, double:4.4466E-319)
            if (r15 == 0) goto L_0x0308
            r36 = r5
            r37 = r6
            long r5 = r15.b
            long r5 = r3 - r5
            int r39 = (r5 > r33 ? 1 : (r5 == r33 ? 0 : -1))
            if (r39 >= 0) goto L_0x0305
            aibe r5 = new aibe
            double r39 = r15.b()
            int r6 = defpackage.aell.b((double) r39)
            double r39 = r15.c()
            r41 = r2
            int r2 = defpackage.aell.b((double) r39)
            float r15 = r15.a()
            r39 = 1148846080(0x447a0000, float:1000.0)
            float r15 = r15 * r39
            int r15 = (int) r15
            r5.<init>(r6, r2, r15)
            goto L_0x030f
        L_0x0305:
            r41 = r2
            goto L_0x030e
        L_0x0308:
            r41 = r2
            r36 = r5
            r37 = r6
        L_0x030e:
            r5 = 0
        L_0x030f:
            if (r13 == 0) goto L_0x032f
            long r11 = r3 - r11
            int r2 = (r11 > r33 ? 1 : (r11 == r33 ? 0 : -1))
            if (r2 >= 0) goto L_0x032f
            int r2 = r13.d
            if (r5 == 0) goto L_0x032e
            double r11 = (double) r2
            int r2 = r5.d
            r15 = r5
            double r5 = (double) r2
            r33 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r33
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0330
        L_0x032e:
            goto L_0x0332
        L_0x032f:
            r15 = r5
        L_0x0330:
            r13 = r15
        L_0x0332:
            if (r13 == 0) goto L_0x0355
            int r2 = r13.d
            r5 = 500000(0x7a120, float:7.00649E-40)
            if (r2 < r5) goto L_0x0348
            r5 = 10000000(0x989680, float:1.4012985E-38)
            if (r2 >= r5) goto L_0x0344
            r2 = 50000000(0x2faf080, float:3.6872239E-37)
            goto L_0x034b
        L_0x0344:
            r2 = 100000000(0x5f5e100, float:2.3122341E-35)
            goto L_0x034b
        L_0x0348:
            r2 = 4000000(0x3d0900, float:5.605194E-39)
        L_0x034b:
            aibe r5 = new aibe
            int r6 = r13.b
            int r11 = r13.c
            r5.<init>(r6, r11, r2)
            goto L_0x0356
        L_0x0355:
            r5 = 0
        L_0x0356:
            int r2 = (r3 > r28 ? 1 : (r3 == r28 ? 0 : -1))
            if (r2 >= 0) goto L_0x035b
            goto L_0x035e
        L_0x035b:
            if (r17 != 0) goto L_0x035e
            goto L_0x0364
        L_0x035e:
            boolean r2 = r0.k
            if (r2 != 0) goto L_0x0364
            r2 = 0
            goto L_0x0365
        L_0x0364:
            r2 = 1
        L_0x0365:
            aiaq r6 = r0.n
            r6.a()
            int r6 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r6 >= 0) goto L_0x0371
            aibr[] r6 = r0.z
            goto L_0x0372
        L_0x0371:
            r6 = 0
        L_0x0372:
            boolean r9 = defpackage.aydu.f()
            if (r9 == 0) goto L_0x03a3
            ahqj r9 = r0.b
            if (r6 != 0) goto L_0x037f
            r18 = r3
            goto L_0x03a5
        L_0x037f:
            if (r14 == 0) goto L_0x0386
            int r10 = r6.length
            r11 = -1
            int r13 = r10 + -1
            goto L_0x0387
        L_0x0386:
            r13 = 0
        L_0x0387:
            if (r13 < 0) goto L_0x03a3
            r10 = r6[r13]
            long r10 = r10.d()
            r18 = r3
            long r3 = r9.d
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 <= 0) goto L_0x039e
            r9.d = r10
            r3 = 31
            r9.a((int) r3)
        L_0x039e:
            int r13 = r13 + -1
            r3 = r18
            goto L_0x0387
        L_0x03a3:
            r18 = r3
        L_0x03a5:
            airo r3 = r0.e
            if (r8 != 0) goto L_0x03ac
            aiam r4 = L
            goto L_0x03ae
        L_0x03ac:
            aiam r4 = r0.s
        L_0x03ae:
            aiaq r9 = r0.n
            if (r6 == 0) goto L_0x03c7
            int r10 = r6.length
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r12 = 18
            r11.<init>(r12)
            java.lang.String r12 = "length "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            goto L_0x03c9
        L_0x03c7:
            java.lang.String r10 = "NONE"
        L_0x03c9:
            java.lang.String r11 = java.lang.String.valueOf(r4)
            java.lang.String r12 = java.lang.String.valueOf(r10)
            int r12 = r12.length()
            java.lang.String r13 = java.lang.String.valueOf(r11)
            int r13 = r13.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r12 = r12 + 66
            int r12 = r12 + r13
            r15.<init>(r12)
            java.lang.String r12 = "batchMode is "
            r15.append(r12)
            r15.append(r14)
            java.lang.String r12 = ", scans is "
            r15.append(r12)
            r15.append(r10)
            java.lang.String r10 = " cellStatus is "
            r15.append(r10)
            r15.append(r11)
            java.lang.String r10 = " batchExpired is "
            r15.append(r10)
            r15.append(r1)
            r15.toString()
            if (r14 == 0) goto L_0x0493
            aiae r10 = r3.c
            if (r6 == 0) goto L_0x0447
            int r11 = r6.length
            if (r11 <= 0) goto L_0x0447
            java.util.ArrayList r11 = r10.a
            int r11 = r11.size()
            if (r11 == 0) goto L_0x0428
            java.util.ArrayList r12 = r10.a
            r13 = -1
            int r11 = r11 + r13
            java.lang.Object r11 = r12.get(r11)
            aibw r11 = (defpackage.aibw) r11
            long r11 = r11.d()
            goto L_0x042a
        L_0x0428:
            r11 = 0
        L_0x042a:
            r13 = 0
        L_0x042b:
            int r15 = r6.length
            if (r13 >= r15) goto L_0x0447
            r15 = r6[r13]
            long r33 = r15.d()
            int r39 = (r11 > r33 ? 1 : (r11 == r33 ? 0 : -1))
            if (r39 >= 0) goto L_0x043e
            java.util.ArrayList r11 = r10.a
            r11.add(r15)
            goto L_0x0442
        L_0x043e:
            int r15 = (r11 > r33 ? 1 : (r11 == r33 ? 0 : -1))
            if (r15 <= 0) goto L_0x0444
        L_0x0442:
            r11 = r33
        L_0x0444:
            int r13 = r13 + 1
            goto L_0x042b
        L_0x0447:
            if (r4 != 0) goto L_0x044a
            goto L_0x0477
        L_0x044a:
            aiaj r11 = r4.a
            if (r11 == 0) goto L_0x0477
            long r11 = r4.a()
            java.util.ArrayList r13 = r10.b
            int r13 = r13.size()
            if (r13 == 0) goto L_0x046e
            java.util.ArrayList r15 = r10.b
            r16 = -1
            int r13 = r13 + -1
            java.lang.Object r13 = r15.get(r13)
            aiam r13 = (defpackage.aiam) r13
            long r33 = r13.a()
            int r13 = (r33 > r11 ? 1 : (r33 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0477
        L_0x046e:
            java.util.ArrayList r11 = r10.b
            java.lang.Object r4 = r4.clone()
            r11.add(r4)
        L_0x0477:
            r10.c = r5
            r10.d = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            if (r6 == 0) goto L_0x0481
            int r13 = r6.length
            goto L_0x0482
        L_0x0481:
            r13 = 0
        L_0x0482:
            r2.<init>(r13)
            if (r1 == 0) goto L_0x0492
            aiae r4 = r3.c
            aiad r5 = new aiad
            r5.<init>(r3, r9, r2)
            r4.a(r5)
            goto L_0x04b8
        L_0x0492:
            goto L_0x04b8
        L_0x0493:
            if (r6 == 0) goto L_0x049e
            int r10 = r6.length
            if (r10 == 0) goto L_0x049e
            r10 = 0
            r6 = r6[r10]
            r43 = r6
            goto L_0x04a0
        L_0x049e:
            r43 = 0
        L_0x04a0:
            java.util.ArrayList r6 = new java.util.ArrayList
            r10 = 1
            r6.<init>(r10)
            r42 = r3
            r44 = r4
            r45 = r9
            r46 = r5
            r47 = r2
            aiax r2 = r42.a(r43, r44, r45, r46, r47)
            r6.add(r2)
            r2 = r6
        L_0x04b8:
            boolean r3 = defpackage.aybc.c()
            if (r3 != 0) goto L_0x051e
            if (r56 == 0) goto L_0x051e
            r3 = 0
        L_0x04c1:
            int r4 = r2.size()
            if (r3 >= r4) goto L_0x051c
            java.lang.Object r4 = r2.get(r3)
            aiax r4 = (defpackage.aiax) r4
            aibo r5 = r4.b
            aiah r6 = r4.c
            aiav r9 = r4.a
            if (r5 == 0) goto L_0x04e8
            aiau r10 = r5.d
            aiau r11 = defpackage.aiau.CACHE_MISS
            if (r10 != r11) goto L_0x04e8
            aiau r10 = defpackage.aiau.GLS_ERROR
            long r11 = r5.e
            aibw r15 = r5.b
            aibo r10 = defpackage.aibo.a(r10, r11, r15)
            r11 = r10
            r10 = 1
            goto L_0x04ea
        L_0x04e8:
            r11 = r5
            r10 = 0
        L_0x04ea:
            if (r6 == 0) goto L_0x0500
            aiau r12 = r6.d
            aiau r15 = defpackage.aiau.CACHE_MISS
            if (r12 != r15) goto L_0x0500
            aiau r10 = defpackage.aiau.GLS_ERROR
            r12 = r14
            long r13 = r6.e
            aiaj r15 = r6.b
            aiah r10 = defpackage.aiah.a((defpackage.aiau) r10, (long) r13, (defpackage.aiaj) r15)
            r13 = r10
            r10 = 1
            goto L_0x0502
        L_0x0500:
            r12 = r14
            r13 = r6
        L_0x0502:
            if (r10 != 0) goto L_0x0505
            goto L_0x0518
        L_0x0505:
            boolean r4 = r4.d
            if (r9 != r6) goto L_0x050b
            r5 = r13
            goto L_0x0510
        L_0x050b:
            if (r9 != r5) goto L_0x050f
            r5 = r11
            goto L_0x0510
        L_0x050f:
            r5 = 0
        L_0x0510:
            aiax r6 = new aiax
            r6.<init>(r5, r11, r13, r4)
            r2.set(r3, r6)
        L_0x0518:
            int r3 = r3 + 1
            r14 = r12
            goto L_0x04c1
        L_0x051c:
            r12 = r14
            goto L_0x051f
        L_0x051e:
            r12 = r14
        L_0x051f:
            if (r12 != 0) goto L_0x0522
            goto L_0x0527
        L_0x0522:
            if (r1 == 0) goto L_0x0527
            r1 = 0
            r0.z = r1
        L_0x0527:
            r14 = r2
            r49 = r31
            goto L_0x0539
        L_0x052b:
            r41 = r2
            r18 = r3
            r36 = r5
            r37 = r6
            r35 = r11
            r38 = r12
            r49 = 0
        L_0x0539:
            int r1 = r14.size()
            if (r1 <= 0) goto L_0x05a0
            r2 = 1
            r3 = r56 ^ 1
            r2 = -1
            int r1 = r1 + r2
            java.lang.Object r1 = r14.get(r1)
            aiax r1 = (defpackage.aiax) r1
            int r2 = r14.size()
            r4 = 0
            r5 = 0
            r6 = 0
            r13 = 0
        L_0x0552:
            if (r13 >= r2) goto L_0x059e
            java.lang.Object r9 = r14.get(r13)
            aiax r9 = (defpackage.aiax) r9
            aiav r10 = r9.a
            if (r10 == 0) goto L_0x0560
            r11 = 0
            goto L_0x0561
        L_0x0560:
            r11 = 1
        L_0x0561:
            r12 = 1
            r11 = r11 ^ r12
            r6 = r6 | r11
            if (r10 != 0) goto L_0x0567
            goto L_0x0568
        L_0x0567:
            r1 = r9
        L_0x0568:
            boolean r10 = defpackage.aybc.c()
            if (r10 == 0) goto L_0x0583
            aibo r10 = r9.b
            if (r10 != 0) goto L_0x0573
            goto L_0x0578
        L_0x0573:
            boolean r10 = r10.f
            if (r10 == 0) goto L_0x0578
            r5 = r3
        L_0x0578:
            aiah r9 = r9.c
            if (r9 != 0) goto L_0x057d
        L_0x057c:
            goto L_0x059b
        L_0x057d:
            boolean r9 = r9.f
            if (r9 == 0) goto L_0x057c
            r4 = r3
            goto L_0x059b
        L_0x0583:
            aibo r10 = r9.b
            if (r10 == 0) goto L_0x058f
            aiau r10 = r10.d
            aiau r11 = defpackage.aiau.CACHE_MISS
            if (r10 != r11) goto L_0x058f
            r5 = r3
            goto L_0x0590
        L_0x058f:
        L_0x0590:
            aiah r9 = r9.c
            if (r9 == 0) goto L_0x059b
            aiau r9 = r9.d
            aiau r10 = defpackage.aiau.CACHE_MISS
            if (r9 != r10) goto L_0x059b
            r4 = r3
        L_0x059b:
            int r13 = r13 + 1
            goto L_0x0552
        L_0x059e:
            r13 = r4
            goto L_0x05a4
        L_0x05a0:
            r1 = 0
            r5 = 0
            r6 = 0
            r13 = 0
        L_0x05a4:
            boolean r2 = r0.m
            if (r2 == 0) goto L_0x05aa
            r2 = 0
            goto L_0x05be
        L_0x05aa:
            if (r17 != 0) goto L_0x05b2
            boolean r2 = r0.p
            if (r2 != 0) goto L_0x05b2
        L_0x05b0:
            r2 = 0
            goto L_0x05be
        L_0x05b2:
            if (r13 == 0) goto L_0x05b8
            if (r8 == 0) goto L_0x05b8
        L_0x05b6:
            r2 = 1
            goto L_0x05be
        L_0x05b8:
            if (r5 != 0) goto L_0x05bb
            goto L_0x05b0
        L_0x05bb:
            if (r7 == 0) goto L_0x05b0
            goto L_0x05b6
        L_0x05be:
            airr r3 = r0.J
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x05e5
            long r4 = r3.b
            long r4 = r18 - r4
            boolean r9 = r3.f
            if (r9 != 0) goto L_0x05e3
            boolean r9 = r3.c
            if (r9 == 0) goto L_0x05e3
            boolean r3 = r3.e
            if (r3 != 0) goto L_0x05da
            r9 = 900000(0xdbba0, double:4.44659E-318)
            goto L_0x05dd
        L_0x05da:
            r9 = 300000(0x493e0, double:1.482197E-318)
        L_0x05dd:
            int r3 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r3 < 0) goto L_0x05e5
            r3 = 1
            goto L_0x05e6
        L_0x05e3:
            r3 = 1
            goto L_0x05e6
        L_0x05e5:
            r3 = 0
        L_0x05e6:
            if (r2 != 0) goto L_0x05ea
            r4 = 0
            goto L_0x05ef
        L_0x05ea:
            if (r3 == 0) goto L_0x05ee
            r4 = 1
            goto L_0x05ef
        L_0x05ee:
            r4 = 0
        L_0x05ef:
            if (r2 == 0) goto L_0x0606
            airr r2 = r0.J
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x0606
            if (r3 != 0) goto L_0x0606
            ajbd r2 = r0.a
            aicn r2 = r2.o()
            aico r3 = defpackage.aico.GLS_QUERY_THROTTLED
            r2.a((defpackage.aico) r3)
        L_0x0606:
            if (r4 == 0) goto L_0x060a
            r2 = 1
            goto L_0x060f
        L_0x060a:
            if (r6 != 0) goto L_0x060e
            r2 = 0
            goto L_0x060f
        L_0x060e:
            r2 = 1
        L_0x060f:
            aiat r3 = r0.d
            boolean r3 = r3.a()
            if (r3 != 0) goto L_0x0619
            r3 = 0
            goto L_0x0624
        L_0x0619:
            if (r4 == 0) goto L_0x061d
        L_0x061b:
            r3 = 0
            goto L_0x0624
        L_0x061d:
            if (r6 != 0) goto L_0x0623
            boolean r3 = r0.E
            if (r3 == 0) goto L_0x061b
        L_0x0623:
            r3 = 1
        L_0x0624:
            boolean r5 = r53.a()
            if (r5 == 0) goto L_0x062c
            r6 = 0
            goto L_0x0631
        L_0x062c:
            if (r17 == 0) goto L_0x0630
            r6 = 1
            goto L_0x0631
        L_0x0630:
            r6 = 0
        L_0x0631:
            boolean r9 = r0.m
            if (r9 == 0) goto L_0x063f
            long r9 = r0.o
            long r11 = r0.q
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x063f
            r9 = 1
            goto L_0x0644
        L_0x063f:
            if (r4 != 0) goto L_0x0643
            r9 = 0
            goto L_0x0644
        L_0x0643:
            r9 = 1
        L_0x0644:
            boolean r10 = r0.w
            if (r10 == 0) goto L_0x0656
            ajbd r10 = r0.a
            ajbl r10 = r10.n()
            boolean r10 = r10.a()
            if (r10 != 0) goto L_0x0656
            r10 = 1
            goto L_0x0657
        L_0x0656:
            r10 = 0
        L_0x0657:
            if (r41 == 0) goto L_0x065b
            r9 = 1
            goto L_0x0665
        L_0x065b:
            if (r10 == 0) goto L_0x0660
            if (r36 == 0) goto L_0x0660
            goto L_0x0664
        L_0x0660:
            if (r9 != 0) goto L_0x0664
            r9 = 0
            goto L_0x0665
        L_0x0664:
            r9 = 1
        L_0x0665:
            if (r5 != 0) goto L_0x0669
            r9 = 0
            goto L_0x0675
        L_0x0669:
            if (r17 != 0) goto L_0x0674
            int r10 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r10 < 0) goto L_0x0671
        L_0x066f:
            r9 = 1
            goto L_0x0675
        L_0x0671:
            if (r9 != 0) goto L_0x0674
            goto L_0x066f
        L_0x0674:
            r9 = 0
        L_0x0675:
            if (r5 != 0) goto L_0x0679
            r5 = 0
            goto L_0x0680
        L_0x0679:
            if (r17 != 0) goto L_0x067d
        L_0x067b:
            r5 = 0
            goto L_0x0680
        L_0x067d:
            if (r9 != 0) goto L_0x067b
            r5 = 1
        L_0x0680:
            boolean r10 = r0.j
            if (r10 != 0) goto L_0x0688
            if (r17 != 0) goto L_0x0688
            r10 = 0
            goto L_0x068d
        L_0x0688:
            if (r37 != 0) goto L_0x068c
            r10 = 1
            goto L_0x068d
        L_0x068c:
            r10 = 0
        L_0x068d:
            r0.j = r10
            boolean r10 = r0.k
            if (r10 != 0) goto L_0x0699
            int r10 = (r18 > r28 ? 1 : (r18 == r28 ? 0 : -1))
            if (r10 >= 0) goto L_0x0699
            r10 = 0
            goto L_0x069e
        L_0x0699:
            if (r37 != 0) goto L_0x069d
            r10 = 1
            goto L_0x069e
        L_0x069d:
            r10 = 0
        L_0x069e:
            r0.k = r10
            boolean r10 = r0.p
            if (r10 != 0) goto L_0x06a8
            if (r17 != 0) goto L_0x06a8
            r2 = 0
            goto L_0x06ad
        L_0x06a8:
            if (r2 != 0) goto L_0x06ac
            r2 = 1
            goto L_0x06ad
        L_0x06ac:
            r2 = 0
        L_0x06ad:
            r0.p = r2
            if (r6 == 0) goto L_0x06ce
            ajbd r2 = r0.a
            ajbg r2 = r2.k()
            ajbe r6 = defpackage.ajbe.LOCATOR
            r10 = 60000(0xea60, double:2.9644E-319)
            aiat r12 = r0.d
            aizx r12 = r12.e
            r2.b(r6, r10, r12)
            r10 = -1
            r0.r = r10
            long r10 = r54.c()
            r0.q = r10
            goto L_0x06d0
        L_0x06ce:
            r10 = r18
        L_0x06d0:
            if (r5 != 0) goto L_0x06d3
            goto L_0x06d5
        L_0x06d3:
            r0.q = r10
        L_0x06d5:
            int r2 = (r18 > r26 ? 1 : (r18 == r26 ? 0 : -1))
            if (r2 < 0) goto L_0x06e1
            aiat r2 = r0.d
            long r5 = r2.a(r10)
            r2.g = r5
        L_0x06e1:
            int r2 = (r18 > r28 ? 1 : (r18 == r28 ? 0 : -1))
            if (r2 < 0) goto L_0x06ed
            aiat r2 = r0.d
            long r5 = r2.b(r10)
            r2.f = r5
        L_0x06ed:
            if (r38 == 0) goto L_0x070c
            boolean r2 = r53.b()
            if (r2 != 0) goto L_0x070c
            boolean r2 = r0.A
            if (r2 != 0) goto L_0x070a
            ajbd r2 = r0.a
            ajbl r2 = r2.n()
            ajbe r5 = defpackage.ajbe.LOCATOR
            aiat r6 = r0.d
            boolean r12 = r6.h
            aizx r6 = r6.e
            r2.a(r5, r12, r6)
        L_0x070a:
            r0.x = r10
        L_0x070c:
            if (r35 == 0) goto L_0x071d
            ajbd r2 = r0.a
            aizp r2 = r2.d()
            aiat r5 = r0.d
            aizx r5 = r5.e
            r2.a(r5)
            r0.t = r10
        L_0x071d:
            if (r4 == 0) goto L_0x0731
            r2 = 1
            r0.m = r2
            r0.o = r10
            airv r2 = r0.M
            aiaq r5 = r0.n
            aiat r6 = r0.d
            aizx r6 = r6.e
            airs r12 = r0.H
            r2.a(r5, r6, r12)
        L_0x0731:
            r2 = 5
            if (r3 == 0) goto L_0x0931
            aiat r3 = r0.d
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r6 = r6 + 43
            r12.<init>(r6)
            java.lang.String r6 = "PassivePos: reportLocation, locatorParams: "
            r12.append(r6)
            r12.append(r3)
            r12.toString()
            boolean r3 = r0.E
            r0.F = r3
            r3 = 0
            r0.E = r3
            if (r1 == 0) goto L_0x077f
            aiav r3 = r1.a
            if (r3 == 0) goto L_0x077f
            ajbd r3 = r0.a
            ajas r3 = r3.i()
            aibr r6 = r0.y
            aibl r3 = r3.a(r1, r6)
            ajbd r6 = r0.a
            ajas r6 = r6.i()
            r6.a((defpackage.aibl) r3)
            if (r3 == 0) goto L_0x077b
            int r3 = r3.b
            goto L_0x077c
        L_0x077b:
            r3 = 0
        L_0x077c:
            r0.f = r1
            goto L_0x0780
        L_0x077f:
            r3 = 0
        L_0x0780:
            long r5 = r0.g
            r17 = 0
            int r1 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r1 == 0) goto L_0x0790
            long r7 = r0.o
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0790
            r1 = 1
            goto L_0x0791
        L_0x0790:
            r1 = 0
        L_0x0791:
            r0.g = r10
            airo r5 = r0.e
            aiae r5 = r5.c
            java.util.ArrayList r6 = r5.a
            r6.clear()
            java.util.ArrayList r6 = r5.b
            r6.clear()
            r6 = 0
            r5.c = r6
            r7 = 0
            r5.d = r7
            ajbd r5 = r0.a
            aicn r5 = r5.o()
            int r7 = r14.size()
            r8 = 0
        L_0x07b2:
            if (r8 < r7) goto L_0x08e8
            ajbd r5 = r0.a
            ajas r5 = r5.i()
            r5.b(r14, r3)
            boolean r3 = defpackage.aydu.f()
            r8 = 24
            r12 = 25
            if (r3 == 0) goto L_0x0837
            ahqj r3 = r0.b
            int r15 = r14.size()
            r6 = 0
        L_0x07ce:
            if (r6 >= r15) goto L_0x0891
            java.lang.Object r19 = r14.get(r6)
            r13 = r19
            aiax r13 = (defpackage.aiax) r13
            aibo r5 = r13.b
            if (r5 == 0) goto L_0x0802
            aiau r26 = defpackage.aiau.OK
            aiau r5 = r5.d
            int r5 = r5.ordinal()
            r7 = 1
            if (r5 == r7) goto L_0x07fb
            r7 = 3
            if (r5 == r7) goto L_0x07f4
            r7 = 4
            if (r5 == r7) goto L_0x07ee
            goto L_0x0803
        L_0x07ee:
            r5 = 32
            r3.a((int) r5)
            goto L_0x0803
        L_0x07f4:
            r7 = 4
            r5 = 34
            r3.a((int) r5)
            goto L_0x0803
        L_0x07fb:
            r7 = 4
            r5 = 33
            r3.a((int) r5)
            goto L_0x0803
        L_0x0802:
            r7 = 4
        L_0x0803:
            aiav r5 = r13.a
            if (r5 != 0) goto L_0x0808
            goto L_0x0834
        L_0x0808:
            aiah r7 = r13.c
            if (r5 != r7) goto L_0x0810
            r3.a((int) r12)
            goto L_0x0834
        L_0x0810:
            aibo r7 = r13.b
            if (r5 != r7) goto L_0x0834
            r3.a((int) r8)
            aibo r5 = r13.b
            int r5 = r5.a
            if (r5 == r2) goto L_0x081e
            goto L_0x0834
        L_0x081e:
            r5 = 22
            r3.a((int) r5)
            aibo r5 = r13.b
            aibe r5 = r5.c
            if (r5 == 0) goto L_0x0834
            boolean r5 = r5.b()
            if (r5 == 0) goto L_0x0834
            r5 = 30
            r3.a((int) r5)
        L_0x0834:
            int r6 = r6 + 1
            goto L_0x07ce
        L_0x0837:
            ahqj r3 = r0.b
            int r5 = r14.size()
            r13 = 0
        L_0x083e:
            if (r13 >= r5) goto L_0x0891
            java.lang.Object r6 = r14.get(r13)
            aiax r6 = (defpackage.aiax) r6
            aiav r7 = r6.a
            if (r7 != 0) goto L_0x084f
            r6 = 30
            r7 = 22
            goto L_0x088e
        L_0x084f:
            aiah r15 = r6.c
            if (r7 != r15) goto L_0x085b
            r3.a((int) r12)
            r6 = 30
            r7 = 22
            goto L_0x088e
        L_0x085b:
            aibo r15 = r6.b
            if (r7 != r15) goto L_0x088a
            r3.a((int) r8)
            aibo r7 = r6.b
            int r7 = r7.a
            if (r7 == r2) goto L_0x086d
            r6 = 30
            r7 = 22
            goto L_0x088e
        L_0x086d:
            r7 = 22
            r3.a((int) r7)
            aibo r6 = r6.b
            aibe r6 = r6.c
            if (r6 == 0) goto L_0x0887
            boolean r6 = r6.b()
            if (r6 == 0) goto L_0x0884
            r6 = 30
            r3.a((int) r6)
            goto L_0x088e
        L_0x0884:
            r6 = 30
            goto L_0x088e
        L_0x0887:
            r6 = 30
            goto L_0x088e
        L_0x088a:
            r6 = 30
            r7 = 22
        L_0x088e:
            int r13 = r13 + 1
            goto L_0x083e
        L_0x0891:
            boolean r3 = r0.A
            if (r3 == 0) goto L_0x0896
            goto L_0x0898
        L_0x0896:
            if (r49 == 0) goto L_0x08dd
        L_0x0898:
            r5 = 35
            if (r3 == 0) goto L_0x08ba
            int r3 = r14.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Hardware batch count is "
            r6.append(r5)
            r6.append(r3)
            r6.toString()
            int r3 = r0.C
            int r5 = r14.size()
            int r3 = r3 + r5
            r0.C = r3
            goto L_0x08d7
        L_0x08ba:
            int r3 = r14.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Software batch count is "
            r6.append(r5)
            r6.append(r3)
            r6.toString()
            int r3 = r0.B
            int r5 = r14.size()
            int r3 = r3 + r5
            r0.B = r3
        L_0x08d7:
            int r3 = r0.D
            r5 = 1
            int r3 = r3 + r5
            r0.D = r3
        L_0x08dd:
            ajbd r3 = r0.a
            aizm r3 = r3.c()
            r3.a(r10)
            r15 = 1
            goto L_0x0935
        L_0x08e8:
            r6 = 4
            java.lang.Object r12 = r14.get(r8)
            aiax r12 = (defpackage.aiax) r12
            aibo r13 = r12.b
            if (r13 == 0) goto L_0x08fc
            aiau r13 = r13.d
            int r13 = r13.ordinal()
            r35 = r13
            goto L_0x08fe
        L_0x08fc:
            r35 = -1
        L_0x08fe:
            aiah r13 = r12.c
            if (r13 == 0) goto L_0x090b
            aiau r13 = r13.d
            int r13 = r13.ordinal()
            r36 = r13
            goto L_0x090d
        L_0x090b:
            r36 = -1
        L_0x090d:
            boolean r13 = r12.d
            aiav r15 = r12.a
            aibo r6 = r12.b
            if (r15 != r6) goto L_0x0917
            r6 = 2
            goto L_0x0918
        L_0x0917:
            r6 = 0
        L_0x0918:
            airw r15 = new airw
            aico r32 = defpackage.aico.LOCATION_REPORT
            long r33 = r5.b()
            r37 = r13 | r6
            r31 = r15
            r38 = r12
            r31.<init>(r32, r33, r35, r36, r37, r38)
            r5.a((defpackage.aicl) r15)
            int r8 = r8 + 1
            r6 = 0
            goto L_0x07b2
        L_0x0931:
            r17 = 0
            r1 = 0
            r15 = 0
        L_0x0935:
            aiat r3 = r0.d
            long r5 = r3.g
            long r7 = r3.f
            long r5 = java.lang.Math.min(r5, r7)
            boolean r3 = r53.a()
            if (r3 != 0) goto L_0x0949
            r33 = r5
            r3 = 0
            goto L_0x095a
        L_0x0949:
            if (r9 != 0) goto L_0x0957
            long r7 = r0.q
            long r7 = r7 + r23
            long r5 = java.lang.Math.min(r5, r7)
            r33 = r5
            r3 = 1
            goto L_0x095a
        L_0x0957:
            r33 = r5
            r3 = 0
        L_0x095a:
            if (r3 != 0) goto L_0x0979
            aiat r3 = r0.d
            boolean r5 = r3.a()
            if (r5 == 0) goto L_0x0979
            long r5 = r3.a
            long r7 = r3.c
            long r5 = java.lang.Math.min(r5, r7)
            r7 = 8
            long r5 = r5 / r7
            r7 = 300000(0x493e0, double:1.482197E-318)
            long r7 = java.lang.Math.min(r5, r7)
            r35 = r7
            goto L_0x097b
        L_0x0979:
            r35 = r17
        L_0x097b:
            ajbd r3 = r0.a
            ajbg r31 = r3.k()
            ajbe r32 = defpackage.ajbe.LOCATOR
            aiat r3 = r0.d
            aizx r3 = r3.e
            r37 = r3
            r31.a(r32, r33, r35, r37)
            if (r9 != 0) goto L_0x0998
            boolean r3 = r0.i
            if (r3 == 0) goto L_0x099b
            boolean r3 = r53.a()
            if (r3 == 0) goto L_0x099b
        L_0x0998:
            r0.a(r10)
        L_0x099b:
            boolean r3 = r14.isEmpty()
            if (r3 != 0) goto L_0x0b16
            if (r4 != 0) goto L_0x0b16
            aiay r3 = r0.O
            boolean r4 = r0.F
            if (r4 != 0) goto L_0x09aa
            goto L_0x09c1
        L_0x09aa:
            int r4 = r14.size()
            r5 = 1
            if (r4 != r5) goto L_0x09c1
            r4 = 0
            java.lang.Object r5 = r14.get(r4)
            aiax r5 = (defpackage.aiax) r5
            aiav r4 = r5.a
            if (r4 != 0) goto L_0x09c1
            r6 = 0
            r17 = -1
            goto L_0x0acf
        L_0x09c1:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = r14.isEmpty()
            if (r5 != 0) goto L_0x0a90
            int r5 = r14.size()
            r6 = 0
        L_0x09d1:
            if (r6 < r5) goto L_0x0a22
            aisa r5 = new aisa
            r5.<init>()
            java.util.Collections.sort(r4, r5)
            java.util.Iterator r5 = r4.iterator()
        L_0x09df:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0a1e
            java.lang.Object r6 = r5.next()
            aiay r6 = (defpackage.aiay) r6
            if (r3 == 0) goto L_0x0a1b
            int r7 = r6.b
            int r8 = r3.b
            if (r7 != r8) goto L_0x0a1b
            int r7 = r6.a
            int r3 = r3.a
            if (r7 != r3) goto L_0x0a1b
            java.lang.String r3 = java.lang.String.valueOf(r6)
            java.lang.String r7 = java.lang.String.valueOf(r3)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 14
            r8.<init>(r7)
            java.lang.String r7 = "Remove Status:"
            r8.append(r7)
            r8.append(r3)
            r8.toString()
            r5.remove()
            goto L_0x0a1c
        L_0x0a1b:
        L_0x0a1c:
            r3 = r6
            goto L_0x09df
        L_0x0a1e:
            r17 = -1
            goto L_0x0aba
        L_0x0a22:
            java.lang.Object r7 = r14.get(r6)
            aiax r7 = (defpackage.aiax) r7
            if (r7 != 0) goto L_0x0a2f
            r12 = r54
            r17 = -1
            goto L_0x0a8c
        L_0x0a2f:
            aiav r8 = r7.a
            if (r8 == 0) goto L_0x0a36
            long r8 = r8.e
            goto L_0x0a46
        L_0x0a36:
            aibo r8 = r7.b
            if (r8 == 0) goto L_0x0a3d
            long r8 = r8.e
            goto L_0x0a46
        L_0x0a3d:
            aiah r8 = r7.c
            if (r8 == 0) goto L_0x0a44
            long r8 = r8.e
            goto L_0x0a46
        L_0x0a44:
            r8 = -1
        L_0x0a46:
            r17 = -1
            int r12 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r12 == 0) goto L_0x0a53
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r8 = r12.toNanos(r8)
            goto L_0x0a5c
        L_0x0a53:
            if (r49 != 0) goto L_0x0a5a
            long r8 = r54.a()
            goto L_0x0a5c
        L_0x0a5a:
            r8 = r17
        L_0x0a5c:
            r12 = r54
            long r24 = defpackage.aisb.a(r8, r12)
            aiah r13 = r7.c
            if (r13 == 0) goto L_0x0a6f
            aiau r13 = r13.d
            int r13 = defpackage.aisb.a(r13)
            r23 = r13
            goto L_0x0a71
        L_0x0a6f:
            r23 = 1
        L_0x0a71:
            aibo r7 = r7.b
            if (r7 == 0) goto L_0x0a7e
            aiau r7 = r7.d
            int r13 = defpackage.aisb.a(r7)
            r22 = r13
            goto L_0x0a80
        L_0x0a7e:
            r22 = 1
        L_0x0a80:
            aiay r7 = new aiay
            r21 = r7
            r26 = r8
            r21.<init>(r22, r23, r24, r26)
            r4.add(r7)
        L_0x0a8c:
            int r6 = r6 + 1
            goto L_0x09d1
        L_0x0a90:
            r12 = r54
            r17 = -1
            if (r3 != 0) goto L_0x0a97
            goto L_0x0aa2
        L_0x0a97:
            int r5 = r3.a
            r6 = 2
            if (r5 != r6) goto L_0x0aa2
            int r3 = r3.b
            if (r3 != r6) goto L_0x0aa2
            r6 = 0
            goto L_0x0acf
        L_0x0aa2:
            long r5 = r54.a()
            long r24 = defpackage.aisb.a(r5, r12)
            aiay r3 = new aiay
            r22 = 2
            r23 = 2
            r21 = r3
            r26 = r5
            r21.<init>(r22, r23, r24, r26)
            r4.add(r3)
        L_0x0aba:
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x0ace
            int r3 = r4.size()
            aiay[] r3 = new defpackage.aiay[r3]
            java.lang.Object[] r3 = r4.toArray(r3)
            r6 = r3
            aiay[] r6 = (defpackage.aiay[]) r6
            goto L_0x0acf
        L_0x0ace:
            r6 = 0
        L_0x0acf:
            r3 = 0
            r0.F = r3
            if (r6 == 0) goto L_0x0b14
            int r4 = r6.length
            if (r4 <= 0) goto L_0x0b14
            r5 = 0
        L_0x0ad8:
            if (r5 >= r4) goto L_0x0b03
            r7 = r6[r5]
            ajbd r8 = r0.a
            aicn r8 = r8.o()
            int r9 = r7.a
            int r7 = r7.b
            aicl r12 = new aicl
            aico r20 = defpackage.aico.STATUS_REPORT
            long r21 = r8.b()
            r24 = 0
            r27 = 0
            java.lang.String r23 = "wifiLocationStatus %2$d cellLocationStatus %3$d"
            r19 = r12
            r25 = r9
            r26 = r7
            r19.<init>(r20, r21, r23, r24, r25, r26, r27)
            r8.a((defpackage.aicl) r12)
            int r5 = r5 + 1
            goto L_0x0ad8
        L_0x0b03:
            ajbd r4 = r0.a
            ajas r4 = r4.i()
            r4.a((defpackage.aiay[]) r6)
            int r4 = r6.length
            r5 = -1
            int r4 = r4 + r5
            r4 = r6[r4]
            r0.O = r4
            goto L_0x0b1a
        L_0x0b14:
            r5 = -1
            goto L_0x0b1a
        L_0x0b16:
            r3 = 0
            r5 = -1
            r17 = -1
        L_0x0b1a:
            if (r15 == 0) goto L_0x0b9e
            airz r4 = r0.c
            r6 = 1
            r48 = r1 ^ 1
            aiay r1 = r0.O
            aiat r6 = r0.d
            aizw r7 = r4.a
            if (r7 == 0) goto L_0x0b9e
            double r7 = defpackage.aydu.b()
            boolean r7 = defpackage.ahym.a(r7)
            if (r7 == 0) goto L_0x0b9e
            int r50 = r14.size()
            int r7 = r14.size()
            r45 = 0
        L_0x0b3d:
            if (r3 >= r7) goto L_0x0b73
            java.lang.Object r8 = r14.get(r3)
            aiax r8 = (defpackage.aiax) r8
            aiav r9 = r8.a
            aibo r12 = r8.b
            if (r9 == r12) goto L_0x0b4c
            goto L_0x0b5b
        L_0x0b4c:
            if (r12 == 0) goto L_0x0b5b
            int r8 = r12.a
            if (r8 != r2) goto L_0x0b55
            r8 = r45 | 2
            goto L_0x0b57
        L_0x0b55:
            r8 = r45 | 4
        L_0x0b57:
            r45 = r8
        L_0x0b59:
            r9 = 2
            goto L_0x0b70
        L_0x0b5b:
            aiah r8 = r8.c
            if (r9 == r8) goto L_0x0b60
            goto L_0x0b59
        L_0x0b60:
            if (r8 == 0) goto L_0x0b6f
            int r8 = r8.a
            r9 = 2
            if (r8 == r9) goto L_0x0b6a
            r8 = r45 | 16
            goto L_0x0b6c
        L_0x0b6a:
            r8 = r45 | 8
        L_0x0b6c:
            r45 = r8
            goto L_0x0b70
        L_0x0b6f:
            r9 = 2
        L_0x0b70:
            int r3 = r3 + 1
            goto L_0x0b3d
        L_0x0b73:
            aizw r2 = r4.a
            long r7 = r4.b
            long r43 = r10 - r7
            if (r6 == 0) goto L_0x0b80
            long r6 = r6.a
            r46 = r6
            goto L_0x0b82
        L_0x0b80:
            r46 = r17
        L_0x0b82:
            if (r1 == 0) goto L_0x0b89
            int r11 = r1.a
            r51 = r11
            goto L_0x0b8b
        L_0x0b89:
            r51 = -1
        L_0x0b8b:
            if (r1 == 0) goto L_0x0b92
            int r5 = r1.b
            r52 = r5
            goto L_0x0b94
        L_0x0b92:
            r52 = -1
        L_0x0b94:
            r42 = r2
            r42.a(r43, r45, r46, r48, r49, r50, r51, r52)
            aizw r1 = r4.a
            r1.a()
        L_0x0b9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.airy.a(aizy, aibr[], boolean):void");
    }
}
