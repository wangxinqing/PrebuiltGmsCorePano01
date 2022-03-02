package defpackage;

/* renamed from: aqip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqip extends aqjh {
    private static final double k = Math.toRadians(5.0d);
    public final Object a = new Object();
    public final aqix b;
    public final aqiq c;
    public final aqim d;
    public final aqin e;
    private final aqiz l = new aqiz(this.f);
    private final aqiy m = new aqiy(this.f);
    private final aqiv n = new aqiv(this.f);
    private final aqiw o;
    private final aqiu p = new aqiu();
    private final aqit q = new aqit(this.f, k);
    private final aqjz r;
    private final aqjz s;
    private final aqjx t;
    private aqis u;
    private final aqhw v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aqip(aqhw aqhw, aqis aqis) {
        super(aqhw.a(), aqhw.b(), aqhw.c());
        this.c = new aqiq(aqhw.E());
        this.o = new aqiw(this.f, aqhw.d(), aqhw.e());
        this.b = new aqix(this.f, aqhw.h(), aqhw.i());
        this.r = new aqjz(aqhw.f(), aqhw.o(), aqhw.p());
        this.s = new aqjz(aqhw.g(), aqhw.o(), aqhw.p());
        if (aqhw.z()) {
            this.t = new aqjx(aqhw.F());
        } else {
            this.t = null;
        }
        a(aqis);
        if (aqhw.x()) {
            this.d = new aqim("FLP", aqhw.H(), aqhw.I(), aqhw.J());
        } else {
            this.d = null;
        }
        this.e = new aqin(aqhw.G());
        this.v = aqhw;
    }

    public final void a(aqis aqis) {
        this.u = aqis;
        aqjx aqjx = this.t;
        if (aqjx != null) {
            aqis.a(aqjx);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01db, code lost:
        if (r10 == false) goto L_0x01dd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.aqjb r22) {
        /*
            r21 = this;
            r1 = r21
            defpackage.aqju.a()
            java.util.ArrayDeque r0 = r1.j
            r2 = r22
            r0.add(r2)
        L_0x000c:
            java.util.ArrayDeque r0 = r1.j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x048d
            java.util.ArrayList r0 = r1.h
            r0.clear()
            java.util.ArrayList r0 = r1.i
            r0.clear()
            java.lang.Object r2 = r1.a
            monitor-enter(r2)
            java.util.ArrayDeque r0 = r1.j     // Catch:{ all -> 0x048a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x048a }
            r3 = 0
            r4 = 0
            r6 = 1
            r7 = 0
            if (r0 != 0) goto L_0x022d
            java.util.ArrayDeque r0 = r1.j     // Catch:{ all -> 0x048a }
            java.lang.Object r0 = r0.remove()     // Catch:{ all -> 0x048a }
            aqjb r0 = (defpackage.aqjb) r0     // Catch:{ all -> 0x048a }
            double r8 = r0.d     // Catch:{ all -> 0x048a }
            aqin r10 = r1.e     // Catch:{ all -> 0x048a }
            boolean r11 = r10.a()     // Catch:{ all -> 0x048a }
            if (r11 != 0) goto L_0x0046
            r10.b = r8     // Catch:{ all -> 0x048a }
            r10.e = r8     // Catch:{ all -> 0x048a }
            r10.f = r8     // Catch:{ all -> 0x048a }
        L_0x0046:
            int r10 = r0.c     // Catch:{ all -> 0x048a }
            switch(r10) {
                case 1: goto L_0x00b0;
                case 2: goto L_0x009d;
                case 3: goto L_0x004b;
                case 4: goto L_0x008b;
                case 5: goto L_0x0078;
                case 6: goto L_0x0072;
                case 7: goto L_0x0069;
                case 8: goto L_0x005b;
                case 9: goto L_0x004e;
                default: goto L_0x004b;
            }     // Catch:{ all -> 0x048a }
        L_0x004b:
            aqiq r10 = r1.c     // Catch:{ all -> 0x048a }
            goto L_0x00b9
        L_0x004e:
            aqiq r10 = r1.c     // Catch:{ all -> 0x048a }
            double r11 = r0.d     // Catch:{ all -> 0x048a }
            r10.g = r11     // Catch:{ all -> 0x048a }
            r10.a((double) r11)     // Catch:{ all -> 0x048a }
            r1.a((defpackage.aqjb) r0)     // Catch:{ all -> 0x048a }
            goto L_0x00bc
        L_0x005b:
            aqiq r10 = r1.c     // Catch:{ all -> 0x048a }
            r11 = r0
            aqik r11 = (defpackage.aqik) r11     // Catch:{ all -> 0x048a }
            aqjb r11 = r11.a     // Catch:{ all -> 0x048a }
            r10.c((defpackage.aqjb) r11)     // Catch:{ all -> 0x048a }
            r1.a((defpackage.aqjb) r0)     // Catch:{ all -> 0x048a }
            goto L_0x00bc
        L_0x0069:
            aqiq r10 = r1.c     // Catch:{ all -> 0x048a }
            r10.a((defpackage.aqjb) r0)     // Catch:{ all -> 0x048a }
            r1.a((defpackage.aqjb) r0)     // Catch:{ all -> 0x048a }
            goto L_0x00bc
        L_0x0072:
            aqiq r10 = r1.c     // Catch:{ all -> 0x048a }
            r10.e(r0)     // Catch:{ all -> 0x048a }
            goto L_0x00bc
        L_0x0078:
            aqiq r10 = r1.c     // Catch:{ all -> 0x048a }
            r10.a((defpackage.aqjb) r0)     // Catch:{ all -> 0x048a }
            aqiq r10 = r1.c     // Catch:{ all -> 0x048a }
            r10.a((boolean) r7)     // Catch:{ all -> 0x048a }
            aqiq r10 = r1.c     // Catch:{ all -> 0x048a }
            r10.e(r3)     // Catch:{ all -> 0x048a }
            r1.a((defpackage.aqjb) r0)     // Catch:{ all -> 0x048a }
            goto L_0x00bc
        L_0x008b:
            aqiq r10 = r1.c     // Catch:{ all -> 0x048a }
            r10.k = r0     // Catch:{ all -> 0x048a }
            r10.a((defpackage.aqjb) r0)     // Catch:{ all -> 0x048a }
            aqiq r10 = r1.c     // Catch:{ all -> 0x048a }
            aqjb r10 = r10.h     // Catch:{ all -> 0x048a }
            r1.a((defpackage.aqjb) r10)     // Catch:{ all -> 0x048a }
            r1.a((defpackage.aqjb) r0)     // Catch:{ all -> 0x048a }
            goto L_0x00bc
        L_0x009d:
            aqiq r10 = r1.c     // Catch:{ all -> 0x048a }
            r10.d(r0)     // Catch:{ all -> 0x048a }
            r10.a((defpackage.aqjb) r0)     // Catch:{ all -> 0x048a }
            aqiq r10 = r1.c     // Catch:{ all -> 0x048a }
            aqjb r10 = r10.h     // Catch:{ all -> 0x048a }
            r1.a((defpackage.aqjb) r10)     // Catch:{ all -> 0x048a }
            r1.a((defpackage.aqjb) r0)     // Catch:{ all -> 0x048a }
            goto L_0x00bc
        L_0x00b0:
            aqiq r10 = r1.c     // Catch:{ all -> 0x048a }
            r10.c((defpackage.aqjb) r0)     // Catch:{ all -> 0x048a }
            r1.a((defpackage.aqjb) r0)     // Catch:{ all -> 0x048a }
            goto L_0x00bc
        L_0x00b9:
            r10.a((defpackage.aqjb) r0)     // Catch:{ all -> 0x048a }
        L_0x00bc:
            aqiq r10 = r1.c     // Catch:{ all -> 0x048a }
            boolean r10 = r10.d()     // Catch:{ all -> 0x048a }
            if (r10 == 0) goto L_0x01ab
            java.util.ArrayList r10 = r1.h     // Catch:{ all -> 0x048a }
            aqix r11 = r1.b     // Catch:{ all -> 0x048a }
            r11.d = r0     // Catch:{ all -> 0x048a }
            r10.add(r11)     // Catch:{ all -> 0x048a }
            int r10 = r0.c     // Catch:{ all -> 0x048a }
            switch(r10) {
                case 1: goto L_0x019b;
                case 2: goto L_0x0190;
                case 3: goto L_0x00d2;
                case 4: goto L_0x0185;
                case 5: goto L_0x00d2;
                case 6: goto L_0x017a;
                case 7: goto L_0x016f;
                case 8: goto L_0x00e1;
                case 9: goto L_0x00d4;
                default: goto L_0x00d2;
            }     // Catch:{ all -> 0x048a }
        L_0x00d2:
            goto L_0x022f
        L_0x00d4:
            aqjx r10 = r1.t     // Catch:{ all -> 0x048a }
            if (r10 == 0) goto L_0x00df
            java.util.ArrayList r11 = r1.i     // Catch:{ all -> 0x048a }
            r10.a = r0     // Catch:{ all -> 0x048a }
            r11.add(r10)     // Catch:{ all -> 0x048a }
        L_0x00df:
            goto L_0x022f
        L_0x00e1:
            aqik r0 = (defpackage.aqik) r0     // Catch:{ all -> 0x048a }
            aqhw r10 = r1.v     // Catch:{ all -> 0x048a }
            boolean r10 = r10.q()     // Catch:{ all -> 0x048a }
            if (r10 == 0) goto L_0x015d
            aqjb r10 = r0.a     // Catch:{ all -> 0x048a }
            r11 = 2
            double r10 = r10.a(r11)     // Catch:{ all -> 0x048a }
            aqhw r12 = r1.v     // Catch:{ all -> 0x048a }
            double r12 = r12.r()     // Catch:{ all -> 0x048a }
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x00fd
            goto L_0x015d
        L_0x00fd:
            double r10 = r0.a(r7)     // Catch:{ all -> 0x048a }
            boolean r10 = java.lang.Double.isNaN(r10)     // Catch:{ all -> 0x048a }
            if (r10 != 0) goto L_0x015d
            aqhw r10 = r1.v     // Catch:{ all -> 0x048a }
            double r10 = r10.s()     // Catch:{ all -> 0x048a }
            aqhw r12 = r1.v     // Catch:{ all -> 0x048a }
            double r12 = r12.B()     // Catch:{ all -> 0x048a }
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 <= 0) goto L_0x013a
            aqiq r12 = r1.c     // Catch:{ all -> 0x048a }
            double r12 = r12.g     // Catch:{ all -> 0x048a }
            boolean r12 = java.lang.Double.isNaN(r12)     // Catch:{ all -> 0x048a }
            if (r12 != 0) goto L_0x013a
            double r12 = r0.d     // Catch:{ all -> 0x048a }
            aqiq r14 = r1.c     // Catch:{ all -> 0x048a }
            double r14 = r14.g     // Catch:{ all -> 0x048a }
            double r12 = r12 - r14
            aqhw r14 = r1.v     // Catch:{ all -> 0x048a }
            double r14 = r14.B()     // Catch:{ all -> 0x048a }
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x013a
            aqhw r10 = r1.v     // Catch:{ all -> 0x048a }
            double r10 = r10.t()     // Catch:{ all -> 0x048a }
            goto L_0x013b
        L_0x013a:
        L_0x013b:
            double r12 = r0.a(r7)     // Catch:{ all -> 0x048a }
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 < 0) goto L_0x015d
            java.util.ArrayList r10 = r1.h     // Catch:{ all -> 0x048a }
            aqiv r11 = r1.n     // Catch:{ all -> 0x048a }
            r11.d = r0     // Catch:{ all -> 0x048a }
            r10.add(r11)     // Catch:{ all -> 0x048a }
            aqjk r0 = r1.g     // Catch:{ all -> 0x048a }
            aqje r0 = r0.h     // Catch:{ all -> 0x048a }
            double[] r0 = r0.a     // Catch:{ all -> 0x048a }
            defpackage.aqjf.c(r0)     // Catch:{ all -> 0x048a }
            aqiq r0 = r1.c     // Catch:{ all -> 0x048a }
            r0.c((boolean) r6)     // Catch:{ all -> 0x048a }
            goto L_0x022f
        L_0x015d:
            java.util.ArrayList r10 = r1.i     // Catch:{ all -> 0x048a }
            aqjz r11 = r1.r     // Catch:{ all -> 0x048a }
            aqjb r0 = r0.a     // Catch:{ all -> 0x048a }
            r11.a = r0     // Catch:{ all -> 0x048a }
            r10.add(r11)     // Catch:{ all -> 0x048a }
            aqiq r0 = r1.c     // Catch:{ all -> 0x048a }
            r0.c((boolean) r7)     // Catch:{ all -> 0x048a }
            goto L_0x022f
        L_0x016f:
            java.util.ArrayList r10 = r1.h     // Catch:{ all -> 0x048a }
            aqit r11 = r1.q     // Catch:{ all -> 0x048a }
            r11.d = r0     // Catch:{ all -> 0x048a }
            r10.add(r11)     // Catch:{ all -> 0x048a }
            goto L_0x022f
        L_0x017a:
            java.util.ArrayList r10 = r1.h     // Catch:{ all -> 0x048a }
            aqiu r11 = r1.p     // Catch:{ all -> 0x048a }
            r11.d = r0     // Catch:{ all -> 0x048a }
            r10.add(r11)     // Catch:{ all -> 0x048a }
            goto L_0x022f
        L_0x0185:
            java.util.ArrayList r10 = r1.h     // Catch:{ all -> 0x048a }
            aqiw r11 = r1.o     // Catch:{ all -> 0x048a }
            r11.d = r0     // Catch:{ all -> 0x048a }
            r10.add(r11)     // Catch:{ all -> 0x048a }
            goto L_0x022f
        L_0x0190:
            java.util.ArrayList r10 = r1.i     // Catch:{ all -> 0x048a }
            aqjz r11 = r1.s     // Catch:{ all -> 0x048a }
            r11.a = r0     // Catch:{ all -> 0x048a }
            r10.add(r11)     // Catch:{ all -> 0x048a }
            goto L_0x022f
        L_0x019b:
            java.util.ArrayList r10 = r1.i     // Catch:{ all -> 0x048a }
            aqjz r11 = r1.r     // Catch:{ all -> 0x048a }
            r11.a = r0     // Catch:{ all -> 0x048a }
            r10.add(r11)     // Catch:{ all -> 0x048a }
            aqiq r0 = r1.c     // Catch:{ all -> 0x048a }
            r0.c((boolean) r7)     // Catch:{ all -> 0x048a }
            goto L_0x022f
        L_0x01ab:
            aqiq r0 = r1.c     // Catch:{ all -> 0x048a }
            boolean r10 = r0.b()     // Catch:{ all -> 0x048a }
            if (r10 == 0) goto L_0x01b4
        L_0x01b3:
            goto L_0x01bc
        L_0x01b4:
            boolean r10 = r0.a()     // Catch:{ all -> 0x048a }
            if (r10 != 0) goto L_0x01b3
            r10 = 0
            goto L_0x01ce
        L_0x01bc:
            double r10 = r0.f     // Catch:{ all -> 0x048a }
            double r12 = r0.e     // Catch:{ all -> 0x048a }
            aqic r14 = r0.a     // Catch:{ all -> 0x048a }
            double r14 = r14.c()     // Catch:{ all -> 0x048a }
            double r12 = r12 + r14
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x01cd
            r10 = 1
            goto L_0x01ce
        L_0x01cd:
            r10 = 0
        L_0x01ce:
            boolean r11 = r0.b()     // Catch:{ all -> 0x048a }
            if (r11 == 0) goto L_0x01db
            boolean r11 = r0.a()     // Catch:{ all -> 0x048a }
            if (r11 == 0) goto L_0x01db
            goto L_0x01de
        L_0x01db:
            if (r10 != 0) goto L_0x01de
        L_0x01dd:
            goto L_0x022f
        L_0x01de:
            aqjb r0 = r0.h     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x01dd
            aqiq r0 = r1.c     // Catch:{ all -> 0x048a }
            boolean r10 = r0.c     // Catch:{ all -> 0x048a }
            if (r10 == 0) goto L_0x01e9
            goto L_0x021a
        L_0x01e9:
            aqil r10 = new aqil     // Catch:{ all -> 0x048a }
            aqjb r0 = r0.e()     // Catch:{ all -> 0x048a }
            aqiq r11 = r1.c     // Catch:{ all -> 0x048a }
            aqjb r11 = r11.f()     // Catch:{ all -> 0x048a }
            r10.<init>(r8, r0, r11)     // Catch:{ all -> 0x048a }
            java.util.ArrayList r0 = r1.h     // Catch:{ all -> 0x048a }
            aqiz r11 = r1.l     // Catch:{ all -> 0x048a }
            r11.d = r10     // Catch:{ all -> 0x048a }
            r0.add(r11)     // Catch:{ all -> 0x048a }
            r1.a((defpackage.aqjb) r10)     // Catch:{ all -> 0x048a }
            defpackage.aqju.a()     // Catch:{ all -> 0x048a }
            aqjk r0 = r1.g     // Catch:{ all -> 0x048a }
            aqje r0 = r0.h     // Catch:{ all -> 0x048a }
            double[] r0 = r0.a     // Catch:{ all -> 0x048a }
            defpackage.aqjf.c(r0)     // Catch:{ all -> 0x048a }
            aqiq r0 = r1.c     // Catch:{ all -> 0x048a }
            r0.b((boolean) r6)     // Catch:{ all -> 0x048a }
            aqiq r0 = r1.c     // Catch:{ all -> 0x048a }
            r0.a((boolean) r7)     // Catch:{ all -> 0x048a }
        L_0x021a:
            aqiq r0 = r1.c     // Catch:{ all -> 0x048a }
            boolean r0 = r0.b     // Catch:{ all -> 0x048a }
            if (r0 != 0) goto L_0x022c
            java.util.ArrayList r0 = r1.h     // Catch:{ all -> 0x048a }
            aqiy r10 = r1.m     // Catch:{ all -> 0x048a }
            r0.add(r10)     // Catch:{ all -> 0x048a }
            aqiq r0 = r1.c     // Catch:{ all -> 0x048a }
            r0.a((boolean) r6)     // Catch:{ all -> 0x048a }
        L_0x022c:
            goto L_0x022f
        L_0x022d:
            r8 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L_0x022f:
            monitor-exit(r2)     // Catch:{ all -> 0x048a }
            aqjk r0 = r1.g
            java.util.ArrayList r2 = r1.h
            java.util.ArrayList r10 = r1.i
            r0.d = r2
            r0.e = r10
            r0.a = r8
            r2 = 0
        L_0x023d:
            java.util.ArrayList r8 = r0.d
            int r8 = r8.size()
            if (r2 >= r8) goto L_0x0253
            java.util.ArrayList r8 = r0.d
            java.lang.Object r8 = r8.get(r2)
            aqjn r8 = (defpackage.aqjn) r8
            r8.a()
            int r2 = r2 + 1
            goto L_0x023d
        L_0x0253:
            r2 = 0
        L_0x0254:
            java.util.ArrayList r8 = r0.e
            int r8 = r8.size()
            if (r2 >= r8) goto L_0x026a
            java.util.ArrayList r8 = r0.e
            java.lang.Object r8 = r8.get(r2)
            aqjr r8 = (defpackage.aqjr) r8
            r8.a()
            int r2 = r2 + 1
            goto L_0x0254
        L_0x026a:
            aqje r2 = r0.h
            aqjd[] r2 = r2.b
            int r8 = r0.b
            int r9 = r2.length
            if (r8 != r9) goto L_0x0469
            r8 = 0
        L_0x0274:
            int r9 = r0.b
            if (r8 < r9) goto L_0x040b
            aqje r2 = r0.h
            double r8 = r0.c
            aqjg r10 = r2.e
            double[] r11 = r2.a
            int[] r12 = r2.d
            if (r11 != 0) goto L_0x0287
            r6 = 0
            goto L_0x030d
        L_0x0287:
            if (r12 == 0) goto L_0x030c
            int r13 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r13 < 0) goto L_0x030c
            int r13 = r11.length
            r15 = r4
            r17 = r15
            r14 = 0
        L_0x0292:
            if (r14 >= r13) goto L_0x029f
            r19 = r11[r14]
            double r17 = r17 + r19
            double r19 = r19 * r19
            double r15 = r15 + r19
            int r14 = r14 + 1
            goto L_0x0292
        L_0x029f:
            r13 = 3110860544497550640(0x2b2bff2ee48e0530, double:1.0E-100)
            int r19 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r19 < 0) goto L_0x02ad
            double r17 = r17 * r17
            double r4 = r17 / r15
            goto L_0x02ae
        L_0x02ad:
        L_0x02ae:
            int r13 = r11.length
            double r14 = (double) r13
            java.lang.Double.isNaN(r14)
            double r8 = r8 * r14
            int r16 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r16 < 0) goto L_0x02d0
            double r4 = defpackage.aqjf.a(r11)
            r8 = 3125919792542303038(0x2b617f7d4ed8c33e, double:1.0E-99)
            java.lang.Double.isNaN(r14)
            double r8 = r8 * r14
            int r16 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r16 <= 0) goto L_0x02d0
            defpackage.aqjf.b(r11)
            r6 = 0
            goto L_0x030d
        L_0x02d0:
            if (r13 == 0) goto L_0x0309
            int r4 = r12.length
            if (r13 != r4) goto L_0x0309
            defpackage.aqjf.b(r11)
            java.util.Random r4 = r10.a
            double r4 = r4.nextDouble()
            java.lang.Double.isNaN(r14)
            double r4 = r4 / r14
            r8 = r11[r7]
            r10 = 0
            r13 = 0
        L_0x02e6:
            double r6 = (double) r10
            int r17 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r17 >= 0) goto L_0x0305
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r14)
            double r6 = r6 / r14
            double r6 = r6 + r4
        L_0x02f3:
            int r17 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r17 <= 0) goto L_0x02fe
            int r13 = r13 + 1
            r17 = r11[r13]
            double r8 = r8 + r17
            goto L_0x02f3
        L_0x02fe:
            r12[r10] = r13
            int r10 = r10 + 1
            r6 = 1
            r7 = 0
            goto L_0x02e6
        L_0x0305:
            defpackage.aqjf.c(r11)
            goto L_0x030a
        L_0x0309:
        L_0x030a:
            r6 = 1
            goto L_0x030d
        L_0x030c:
            r6 = 0
        L_0x030d:
            if (r6 == 0) goto L_0x0341
            r4 = 0
        L_0x0310:
            int[] r5 = r2.d
            int r7 = r5.length
            if (r4 >= r7) goto L_0x0339
            aqjd[] r7 = r2.c
            r7 = r7[r4]
            aqjd[] r8 = r2.b
            r5 = r5[r4]
            r5 = r8[r5]
            aqjc r8 = r5.a
            if (r8 != 0) goto L_0x0324
            goto L_0x0336
        L_0x0324:
            aqjc r9 = r7.a
            if (r9 == 0) goto L_0x0329
            goto L_0x032f
        L_0x0329:
            aqjc r8 = r8.clone()
            r7.a = r8
        L_0x032f:
            aqjc r7 = r7.a
            aqjc r5 = r5.a
            r7.a(r5)
        L_0x0336:
            int r4 = r4 + 1
            goto L_0x0310
        L_0x0339:
            aqjd[] r4 = r2.b
            aqjd[] r5 = r2.c
            r2.b = r5
            r2.c = r4
        L_0x0341:
            if (r6 == 0) goto L_0x035a
            java.util.ArrayList r2 = r0.g
            int r4 = r2.size()
            r5 = 0
        L_0x034a:
            if (r5 >= r4) goto L_0x0358
            java.lang.Object r7 = r2.get(r5)
            aqjj r7 = (defpackage.aqjj) r7
            r7.a()
            int r5 = r5 + 1
            goto L_0x034a
        L_0x0358:
            r2 = 0
            goto L_0x035b
        L_0x035a:
            r2 = 0
        L_0x035b:
            java.util.ArrayList r4 = r0.d
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x0371
            java.util.ArrayList r4 = r0.d
            java.lang.Object r4 = r4.get(r2)
            aqjn r4 = (defpackage.aqjn) r4
            r4.b()
            int r2 = r2 + 1
            goto L_0x035b
        L_0x0371:
            r2 = 0
        L_0x0372:
            java.util.ArrayList r4 = r0.e
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x0388
            java.util.ArrayList r4 = r0.e
            java.lang.Object r4 = r4.get(r2)
            aqjr r4 = (defpackage.aqjr) r4
            r4.b()
            int r2 = r2 + 1
            goto L_0x0372
        L_0x0388:
            r2 = 0
        L_0x0389:
            java.util.ArrayList r4 = r0.f
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x03a3
            java.util.ArrayList r4 = r0.f
            java.lang.Object r4 = r4.get(r2)
            aqji r4 = (defpackage.aqji) r4
            double r7 = r0.a
            aqje r5 = r0.h
            r4.a(r7, r5)
            int r2 = r2 + 1
            goto L_0x0389
        L_0x03a3:
            if (r6 == 0) goto L_0x03b8
            java.util.Set r2 = defpackage.aqju.a
            java.util.Iterator r2 = r2.iterator()
        L_0x03ab:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03b8
            java.lang.Object r4 = r2.next()
            aqjv r4 = (defpackage.aqjv) r4
            goto L_0x03ab
        L_0x03b8:
            java.util.Set r2 = defpackage.aqju.a
            java.util.Iterator r2 = r2.iterator()
        L_0x03be:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03cb
            java.lang.Object r4 = r2.next()
            aqjv r4 = (defpackage.aqjv) r4
            goto L_0x03be
        L_0x03cb:
            java.util.Set r2 = defpackage.aqju.a
            java.util.Iterator r2 = r2.iterator()
        L_0x03d1:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03de
            java.lang.Object r4 = r2.next()
            aqjv r4 = (defpackage.aqjv) r4
            goto L_0x03d1
        L_0x03de:
            r2 = 0
        L_0x03df:
            java.util.ArrayList r4 = r0.d
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x03f5
            java.util.ArrayList r4 = r0.d
            java.lang.Object r4 = r4.get(r2)
            aqjn r4 = (defpackage.aqjn) r4
            r4.c()
            int r2 = r2 + 1
            goto L_0x03df
        L_0x03f5:
            r7 = 0
        L_0x03f6:
            java.util.ArrayList r2 = r0.e
            int r2 = r2.size()
            if (r7 >= r2) goto L_0x000c
            java.util.ArrayList r2 = r0.e
            java.lang.Object r2 = r2.get(r7)
            aqjr r2 = (defpackage.aqjr) r2
            r2.a = r3
            int r7 = r7 + 1
            goto L_0x03f6
        L_0x040b:
            r6 = r2[r8]
            r7 = 0
        L_0x040e:
            java.util.ArrayList r9 = r0.d
            int r9 = r9.size()
            if (r7 >= r9) goto L_0x0426
            java.util.ArrayList r9 = r0.d
            java.lang.Object r9 = r9.get(r7)
            aqjn r9 = (defpackage.aqjn) r9
            aqjc r10 = r6.a
            r9.a(r10)
            int r7 = r7 + 1
            goto L_0x040e
        L_0x0426:
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r7 = 0
        L_0x0429:
            java.util.ArrayList r11 = r0.e
            int r11 = r11.size()
            if (r7 >= r11) goto L_0x044f
            java.util.ArrayList r11 = r0.e
            java.lang.Object r11 = r11.get(r7)
            aqjr r11 = (defpackage.aqjr) r11
            aqjc r12 = r6.a
            double r11 = r11.a(r12)
            double r9 = r9 * r11
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 < 0) goto L_0x044b
            boolean r11 = java.lang.Double.isNaN(r9)
            if (r11 == 0) goto L_0x044c
        L_0x044b:
            r9 = r4
        L_0x044c:
            int r7 = r7 + 1
            goto L_0x0429
        L_0x044f:
            aqje r6 = r0.h
            double[] r6 = r6.a
            int r7 = r6.length
            if (r8 < r7) goto L_0x0457
        L_0x0456:
            goto L_0x0463
        L_0x0457:
            if (r8 < 0) goto L_0x0456
            int r7 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x0456
            r11 = r6[r8]
            double r11 = r11 * r9
            r6[r8] = r11
        L_0x0463:
            int r8 = r8 + 1
            r6 = 1
            r7 = 0
            goto L_0x0274
        L_0x0469:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 64
            r2.<init>(r3)
            java.lang.String r3 = " Particle population size "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = " smcf expecting "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x048a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x048a }
            throw r0
        L_0x048d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqip.b(aqjb):void");
    }

    public final boolean b() {
        return this.d != null;
    }

    public final void a(aqjb aqjb) {
        aqjb aqjb2;
        int i;
        aqjb aqjb3 = aqjb;
        if (aqjb3 != null) {
            if (b()) {
                int i2 = aqjb3.c;
                if (i2 == 1 || i2 == 2) {
                    aqjb2 = aqjb3;
                } else if (i2 == 8) {
                    aqjb2 = ((aqik) aqjb3).a;
                } else {
                    this.d.a(aqjb3);
                }
                aqim aqim = this.d;
                aqis aqis = this.u;
                aqjb aqjb4 = null;
                if (aqis.a()) {
                    int i3 = aqjb2.c;
                    if (i3 == 1) {
                        i = 101;
                    } else if (i3 == 2) {
                        i = 102;
                    }
                    aqjb4 = new aqjb(i, aqjb2.d, aell.b(aqis.b.a(aqjb2.a(1))), aell.b(aqis.b.b(aqjb2.a(0))), aqjb2.a(2), (byte[]) null);
                }
                aqim.a(aqjb4);
            }
            aqin aqin = this.e;
            if (aqin.a()) {
                double d2 = aqjb3.d;
                int i4 = aqjb3.c;
                if (i4 == 3) {
                    if (!Double.isNaN(aqin.d)) {
                        aqin.a.b(aqjs.b(d2 - aqin.d));
                    }
                    aqin.d = d2;
                } else if (i4 == 7) {
                    aqin.a.c(aqjs.b(d2 - aqin.e));
                    aqin.e = d2;
                } else if (i4 == 9) {
                    aqin.a.a();
                } else if (i4 == 100) {
                    aqin.c = d2;
                } else if (i4 == 103) {
                    aqin.a.d(aqjs.b(d2 - aqin.f));
                    aqin.f = d2;
                }
            }
        }
    }

    public final boolean a() {
        return this.c.d();
    }
}
