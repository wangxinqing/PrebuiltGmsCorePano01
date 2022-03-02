package defpackage;

import android.content.Context;
import android.media.AudioFormat;

/* renamed from: ahvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahvo extends ahvs {
    private long d;

    public ahvo(Context context, ahsr ahsr, ahss ahss, ajrh ajrh, aizy aizy) {
        super(context, ahsr, ahss, ajrh);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    protected final boolean a(int r44, int r45, long r46) {
        /*
            r43 = this;
            r1 = r43
            r2 = r44
            r3 = r46
            r1.d = r3
            ahvn r5 = new ahvn
            r5.<init>(r2)
            r5.j = r3
            short[] r3 = new short[r2]
        L_0x0011:
            boolean r0 = defpackage.ahvs.a
            r4 = 1
            if (r0 == 0) goto L_0x0667
            android.media.AudioRecord r0 = defpackage.ahvs.b
            r6 = 0
            int r0 = r0.read(r3, r6, r2, r6)
            if (r0 < 0) goto L_0x0658
            ahwk r7 = r5.b
            ahwi r8 = r7.b
            defpackage.amrl.a((boolean) r4)
            r8.a(r6, r0, r2)
            r9 = 0
        L_0x002a:
            if (r9 >= r0) goto L_0x003c
            int r10 = r8.d
            int r10 = r10 + r9
            int r10 = r8.a(r10)
            short[] r11 = r8.a
            short r12 = r3[r9]
            r11[r10] = r12
            int r9 = r9 + 1
            goto L_0x002a
        L_0x003c:
            r8.b(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0044:
            ahwi r8 = r7.b
            int r9 = r8.d
            int r10 = r7.a
            if (r9 < r10) goto L_0x006b
            short[] r11 = new short[r10]
            int r9 = java.lang.Math.min(r10, r9)
            r12 = 0
        L_0x0053:
            if (r12 >= r9) goto L_0x0062
            short[] r13 = r8.a
            int r14 = r8.a(r12)
            short r13 = r13[r14]
            r11[r12] = r13
            int r12 = r12 + 1
            goto L_0x0053
        L_0x0062:
            ahwi r8 = r7.b
            r8.c(r10)
            r0.add(r11)
            goto L_0x0044
        L_0x006b:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r8 = r0.size()
            r9 = 0
        L_0x0075:
            if (r9 >= r8) goto L_0x0595
            java.lang.Object r10 = r0.get(r9)
            short[] r10 = (short[]) r10
            int r11 = r10.length
            double[] r12 = new double[r11]
            r13 = 0
        L_0x0081:
            int r14 = r10.length
            if (r13 >= r14) goto L_0x0093
            short r14 = r10[r13]
            double r14 = (double) r14
            r16 = 4674736413210574848(0x40e0000000000000, double:32768.0)
            java.lang.Double.isNaN(r14)
            double r14 = r14 / r16
            r12[r13] = r14
            int r13 = r13 + 1
            goto L_0x0081
        L_0x0093:
            int r10 = r5.g
            if (r10 == 0) goto L_0x0098
            goto L_0x009e
        L_0x0098:
            long r13 = android.os.SystemClock.elapsedRealtime()
            r5.i = r13
        L_0x009e:
            java.lang.String r10 = android.os.Build.MODEL
            java.lang.String r13 = "Nexus 5"
            r13.equals(r10)
            java.lang.String r10 = android.os.Build.MODEL
            java.lang.String r13 = "Gear Live"
            boolean r10 = r13.equals(r10)
            if (r10 != 0) goto L_0x00b6
            r13 = 4681608360884174848(0x40f86a0000000000, double:100000.0)
            goto L_0x00bb
        L_0x00b6:
            r13 = 4690615560138915840(0x41186a0000000000, double:400000.0)
        L_0x00bb:
            double[] r10 = new double[r11]
            r15 = 0
        L_0x00bf:
            if (r15 < r11) goto L_0x0572
            ahvp r12 = defpackage.ahvn.a
            ahtd r12 = new ahtd
            r12.<init>()
            double[] r13 = new double[r11]
            r14 = 0
        L_0x00cb:
            if (r14 >= r11) goto L_0x00da
            r15 = r10[r14]
            double[] r17 = defpackage.ahvn.d
            r18 = r17[r14]
            double r15 = r15 * r18
            r13[r14] = r15
            int r14 = r14 + 1
            goto L_0x00cb
        L_0x00da:
            if (r11 <= 0) goto L_0x056a
            int r14 = r11 + -1
            r14 = r14 & r11
            if (r14 != 0) goto L_0x056a
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r15 = 0
        L_0x00e7:
            if (r15 >= r11) goto L_0x00f6
            r16 = r13[r15]
            java.lang.Double r4 = java.lang.Double.valueOf(r16)
            r14.add(r4)
            int r15 = r15 + 1
            r4 = 1
            goto L_0x00e7
        L_0x00f6:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r13 = r14.size()
            r15 = 0
        L_0x0100:
            r47 = r7
            if (r15 >= r13) goto L_0x0128
            java.lang.Object r16 = r14.get(r15)
            java.lang.Double r16 = (java.lang.Double) r16
            double r6 = r16.doubleValue()
            r16 = r0
            ahtc r0 = new ahtc
            r19 = r3
            r2 = 0
            r0.<init>(r6, r2)
            r4.add(r0)
            int r15 = r15 + 1
            r2 = r44
            r7 = r47
            r0 = r16
            r3 = r19
            r6 = 0
            goto L_0x0100
        L_0x0128:
            r16 = r0
            r19 = r3
            java.util.List r0 = r12.a(r4)
            int r2 = r14.size()
            r3 = 2
            int r2 = r2 / r3
            r4 = 0
            java.util.List r0 = r0.subList(r4, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4 = 0
        L_0x0141:
            int r6 = r0.size()
            if (r4 >= r6) goto L_0x0160
            java.lang.Object r6 = r0.get(r4)
            ahtc r6 = (defpackage.ahtc) r6
            double r12 = r6.a
            double r6 = r6.b
            double r12 = r12 * r12
            double r6 = r6 * r6
            double r12 = r12 + r6
            java.lang.Double r6 = java.lang.Double.valueOf(r12)
            r2.add(r6)
            int r4 = r4 + 1
            goto L_0x0141
        L_0x0160:
            r5.c = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.add(r2)
            r2 = 0
            r12 = 4602678819172646912(0x3fe0000000000000, double:0.5)
        L_0x0172:
            r14 = 512(0x200, float:7.175E-43)
            if (r2 < r14) goto L_0x0178
            goto L_0x0207
        L_0x0178:
            double[] r15 = defpackage.ahvn.f
            if (r15 == 0) goto L_0x017f
            r21 = r5
            goto L_0x01c3
        L_0x017f:
            double[] r15 = new double[r14]
            defpackage.ahvn.f = r15
            r3 = 0
        L_0x0185:
            if (r3 >= r14) goto L_0x01c1
            r21 = r5
            double r4 = (double) r3
            r23 = 4631257875157614592(0x4045888000000000, double:43.06640625)
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r23
            r23 = 4560148986019581086(0x3f48e757928e0c9e, double:7.6E-4)
            double r23 = r23 * r4
            double r23 = java.lang.Math.atan(r23)
            r25 = 4623507967449235456(0x402a000000000000, double:13.0)
            double r23 = r23 * r25
            r25 = 4664968351909412864(0x40bd4c0000000000, double:7500.0)
            double r4 = r4 / r25
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r4, r6)
            double r4 = java.lang.Math.atan(r4)
            r6 = 4615063718147915776(0x400c000000000000, double:3.5)
            double r4 = r4 * r6
            double r23 = r23 + r4
            r15[r3] = r23
            int r3 = r3 + 1
            r5 = r21
            goto L_0x0185
        L_0x01c1:
            r21 = r5
        L_0x01c3:
            r3 = r15[r2]
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x01ce
            r5 = r21
            goto L_0x01eb
        L_0x01ce:
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 > 0) goto L_0x01ef
            int r3 = r0.size()
            int r3 = r3 + -1
            java.lang.Object r3 = r0.get(r3)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r5 = r21
            java.util.List r4 = r5.c
            java.lang.Object r4 = r4.get(r2)
            java.lang.Double r4 = (java.lang.Double) r4
            r3.add(r4)
        L_0x01eb:
            int r2 = r2 + 1
            r3 = 2
            goto L_0x0172
        L_0x01ef:
            r5 = r21
            int r6 = r0.size()
            r7 = 23
            if (r6 == r7) goto L_0x0207
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 + r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.add(r6)
            r21 = r5
            goto L_0x01ce
        L_0x0207:
            int r2 = r0.size()
            r3 = 23
            if (r2 >= r3) goto L_0x0218
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.add(r2)
            goto L_0x0207
        L_0x0218:
            int r2 = r0.size()
            double[][] r3 = new double[r2][]
            r4 = 0
        L_0x021f:
            int r6 = r0.size()
            if (r4 >= r6) goto L_0x0251
            java.lang.Object r6 = r0.get(r4)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
            double[] r6 = new double[r6]
            r3[r4] = r6
            r6 = 0
        L_0x0234:
            r7 = r3[r4]
            int r12 = r7.length
            if (r6 >= r12) goto L_0x024e
            java.lang.Object r12 = r0.get(r4)
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r12 = r12.get(r6)
            java.lang.Double r12 = (java.lang.Double) r12
            double r12 = r12.doubleValue()
            r7[r6] = r12
            int r6 = r6 + 1
            goto L_0x0234
        L_0x024e:
            int r4 = r4 + 1
            goto L_0x021f
        L_0x0251:
            double[] r0 = new double[r2]
            double[] r4 = new double[r2]
            double[] r6 = new double[r2]
            r12 = 4671221274536574976(0x40d3830000000000, double:19980.0)
            double r12 = defpackage.ahvn.a((double) r12)
            r14 = 4630967054332067840(0x4044800000000000, double:41.0)
            double r12 = r12 / r14
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r14 = 0
        L_0x026d:
            r15 = 41
            if (r14 > r15) goto L_0x0291
            r21 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r21 = defpackage.ahvn.a((double) r21)
            r23 = r8
            r24 = r9
            double r8 = (double) r14
            java.lang.Double.isNaN(r8)
            double r8 = r8 * r12
            double r21 = r21 + r8
            java.lang.Double r8 = java.lang.Double.valueOf(r21)
            r7.add(r8)
            int r14 = r14 + 1
            r8 = r23
            r9 = r24
            goto L_0x026d
        L_0x0291:
            r23 = r8
            r24 = r9
            r8 = 40
            double[] r9 = new double[r8]
            r12 = 1
        L_0x029a:
            if (r12 > r8) goto L_0x0372
            int r13 = r12 + -1
            java.lang.Object r14 = r7.get(r13)
            java.lang.Double r14 = (java.lang.Double) r14
            double r14 = r14.doubleValue()
            double r14 = defpackage.ahvn.b((double) r14)
            int r14 = defpackage.ahvn.d(r14)
            java.lang.Object r15 = r7.get(r12)
            java.lang.Double r15 = (java.lang.Double) r15
            double r21 = r15.doubleValue()
            double r21 = defpackage.ahvn.b((double) r21)
            int r15 = defpackage.ahvn.d(r21)
            int r12 = r12 + 1
            java.lang.Object r21 = r7.get(r12)
            java.lang.Double r21 = (java.lang.Double) r21
            double r21 = r21.doubleValue()
            double r21 = defpackage.ahvn.b((double) r21)
            int r8 = defpackage.ahvn.d(r21)
            r28 = r7
            r7 = r14
            r21 = 0
        L_0x02db:
            r29 = r12
            int r12 = r15 + -1
            if (r7 > r12) goto L_0x0317
            java.util.List r12 = r5.c
            java.lang.Object r12 = r12.get(r7)
            java.lang.Double r12 = (java.lang.Double) r12
            double r30 = r12.doubleValue()
            int r12 = r7 - r14
            r33 = r10
            r32 = r11
            double r10 = (double) r12
            java.lang.Double.isNaN(r10)
            double r30 = r30 * r10
            double r10 = (double) r15
            java.lang.Double.isNaN(r10)
            r17 = 0
            double r10 = r10 + r17
            r12 = r0
            double r0 = (double) r14
            java.lang.Double.isNaN(r0)
            double r10 = r10 - r0
            double r30 = r30 / r10
            double r21 = r21 + r30
            int r7 = r7 + 1
            r1 = r43
            r0 = r12
            r12 = r29
            r11 = r32
            r10 = r33
            goto L_0x02db
        L_0x0317:
            r12 = r0
            r33 = r10
            r32 = r11
            java.util.List r0 = r5.c
            java.lang.Object r0 = r0.get(r15)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            double r21 = r21 + r0
            int r0 = r15 + 1
        L_0x032c:
            if (r0 > r8) goto L_0x035e
            java.util.List r1 = r5.c
            java.lang.Object r1 = r1.get(r0)
            java.lang.Double r1 = (java.lang.Double) r1
            double r10 = r1.doubleValue()
            int r1 = r8 - r0
            r7 = r5
            r14 = r6
            double r5 = (double) r1
            java.lang.Double.isNaN(r5)
            double r10 = r10 * r5
            double r5 = (double) r8
            java.lang.Double.isNaN(r5)
            r17 = 0
            double r5 = r5 + r17
            r42 = r7
            r1 = r8
            double r7 = (double) r15
            java.lang.Double.isNaN(r7)
            double r5 = r5 - r7
            double r10 = r10 / r5
            double r21 = r21 + r10
            int r0 = r0 + 1
            r8 = r1
            r6 = r14
            r5 = r42
            goto L_0x032c
        L_0x035e:
            r42 = r5
            r14 = r6
            r9[r13] = r21
            r1 = r43
            r0 = r12
            r7 = r28
            r12 = r29
            r11 = r32
            r10 = r33
            r8 = 40
            goto L_0x029a
        L_0x0372:
            r12 = r0
            r42 = r5
            r14 = r6
            r33 = r10
            r32 = r11
            r0 = 40
            double[] r1 = new double[r0]
            r5 = 0
        L_0x037f:
            if (r5 >= r0) goto L_0x0394
            r6 = r9[r5]
            double r6 = java.lang.Math.log(r6)
            r10 = -4586634745500139520(0xc059000000000000, double:-100.0)
            double r6 = java.lang.Math.max(r6, r10)
            r1[r5] = r6
            int r5 = r5 + 1
            r0 = 40
            goto L_0x037f
        L_0x0394:
            double[][] r0 = defpackage.ahvn.e
            if (r0 != 0) goto L_0x0399
            goto L_0x03a0
        L_0x0399:
            double[][] r0 = defpackage.ahvn.e
            int r0 = r0.length
            r5 = 40
            if (r0 == r5) goto L_0x0409
        L_0x03a0:
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {40, 40} // fill-array
            java.lang.Class<double> r5 = double.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r5, r0)
            double[][] r0 = (double[][]) r0
            defpackage.ahvn.e = r0
            r0 = 0
        L_0x03b2:
            r5 = 40
            if (r0 < r5) goto L_0x03cf
            r0 = 0
        L_0x03b7:
            if (r0 >= r5) goto L_0x0409
            double[][] r5 = defpackage.ahvn.e
            r6 = 0
            r5 = r5[r6]
            r6 = r5[r0]
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r10 = java.lang.Math.sqrt(r8)
            double r6 = r6 * r10
            r5[r0] = r6
            int r0 = r0 + 1
            r5 = 40
            goto L_0x03b7
        L_0x03cf:
            r5 = 0
        L_0x03d0:
            r6 = 40
            if (r5 >= r6) goto L_0x0404
            double[][] r6 = defpackage.ahvn.e
            r6 = r6[r0]
            double r7 = (double) r0
            double r9 = (double) r5
            java.lang.Double.isNaN(r9)
            r20 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r9 = r9 + r20
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r9
            r9 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r7 = r7 * r9
            r9 = 4630826316843712512(0x4044000000000000, double:40.0)
            double r7 = r7 / r9
            double r7 = java.lang.Math.cos(r7)
            r9 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            double r9 = java.lang.Math.sqrt(r9)
            double r7 = r7 * r9
            r6[r5] = r7
            int r5 = r5 + 1
            goto L_0x03d0
        L_0x0404:
            r20 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = r0 + 1
            goto L_0x03b2
        L_0x0409:
            r0 = 40
            double[] r5 = new double[r0]
            r6 = 0
        L_0x040f:
            if (r6 >= r0) goto L_0x0429
            r7 = 0
            r8 = 0
        L_0x0414:
            if (r7 >= r0) goto L_0x0424
            r10 = r1[r7]
            double[][] r13 = defpackage.ahvn.e
            r13 = r13[r6]
            r20 = r13[r7]
            double r10 = r10 * r20
            double r8 = r8 + r10
            int r7 = r7 + 1
            goto L_0x0414
        L_0x0424:
            r5[r6] = r8
            int r6 = r6 + 1
            goto L_0x040f
        L_0x0429:
            r0 = 0
        L_0x042a:
            if (r0 >= r2) goto L_0x0447
            r1 = r3[r0]
            double r6 = defpackage.ahvn.a((double[]) r1)
            r12[r0] = r6
            r1 = r3[r0]
            double r6 = defpackage.ahvn.a(r1, r6)
            r4[r0] = r6
            r1 = r3[r0]
            double r6 = defpackage.ahvn.b((double[]) r1)
            r14[r0] = r6
            int r0 = r0 + 1
            goto L_0x042a
        L_0x0447:
            r0 = r32
            double[] r1 = new double[r0]
            r2 = 0
        L_0x044d:
            if (r2 < r0) goto L_0x055a
            double r6 = defpackage.ahvn.a((double[]) r1)
            double r8 = defpackage.ahvn.a(r1, r6)
            double r34 = defpackage.ahvn.b((double[]) r1)
            r0 = 1
            r1 = 0
        L_0x045d:
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L_0x053b
            ahvm r0 = new ahvm
            double r1 = (double) r1
            r10 = 4652218415073722368(0x4090000000000000, double:1024.0)
            java.lang.Double.isNaN(r1)
            double r1 = r1 / r10
            r10 = 4676293871431319552(0x40e5888000000000, double:44100.0)
            double r30 = r1 * r10
            r3 = r42
            long r1 = r3.j
            r27 = r0
            r28 = r6
            r32 = r8
            r36 = r5
            r37 = r12
            r38 = r4
            r39 = r14
            r40 = r1
            r27.<init>(r28, r30, r32, r34, r36, r37, r38, r39, r40)
            long r1 = r3.j
            r4 = 23
            long r1 = r1 + r4
            r3.j = r1
            double[] r1 = r3.h
            int r2 = r3.g
            r1[r2] = r6
            r1 = 1
            int r2 = r2 + r1
            r3.g = r2
            r1 = 199(0xc7, float:2.79E-43)
            if (r2 < r1) goto L_0x0524
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r4 = r3.i
            long r1 = r1 - r4
            double r1 = (double) r1
            r4 = 4662132459605790339(0x40b338c55e9f0e83, double:4920.770975056689)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x04d9
            java.lang.String r1 = java.lang.Double.toString(r1)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 65
            r4.<init>(r2)
            java.lang.String r2 = "Sound processing speed is too slow... "
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = " > "
            r4.append(r1)
            r1 = 4661802606117457539(0x40b20cc55e9f0e83, double:4620.770975056689)
            r4.append(r1)
            r4.toString()
        L_0x04d9:
            double[] r1 = r3.h
            double r1 = defpackage.ahvn.a((double[]) r1)
            double[] r4 = r3.h
            double r4 = defpackage.ahvn.a(r4, r1)
            double r1 = defpackage.ahvn.c(r1)
            java.lang.String r1 = java.lang.Double.toString(r1)
            double r4 = defpackage.ahvn.c(r4)
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r6 = java.lang.String.valueOf(r1)
            int r6 = r6.length()
            java.lang.String r7 = java.lang.String.valueOf(r2)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r6 = r6 + 60
            int r6 = r6 + r7
            r8.<init>(r6)
            java.lang.String r6 = "calibration: volume level for 5 sec"
            r8.append(r6)
            r8.append(r1)
            java.lang.String r1 = " "
            r8.append(r1)
            r8.append(r4)
            r8.append(r2)
            r8.toString()
            r3.a()
        L_0x0524:
            r10 = r47
            r10.add(r0)
            int r9 = r24 + 1
            r1 = r43
            r2 = r44
            r5 = r3
            r7 = r10
            r0 = r16
            r3 = r19
            r8 = r23
            r4 = 1
            r6 = 0
            goto L_0x0075
        L_0x053b:
            r10 = r47
            r3 = r42
            int r2 = r0 + -1
            r20 = r33[r2]
            r17 = 0
            int r2 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r2 <= 0) goto L_0x054a
        L_0x0549:
            goto L_0x0552
        L_0x054a:
            r20 = r33[r0]
            int r2 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r2 <= 0) goto L_0x0549
            int r1 = r1 + 1
        L_0x0552:
            int r0 = r0 + 1
            r42 = r3
            r47 = r10
            goto L_0x045d
        L_0x055a:
            r10 = r47
            r3 = r42
            r17 = 0
            r6 = r33[r2]
            double r6 = r6 * r6
            r1[r2] = r6
            int r2 = r2 + 1
            goto L_0x044d
        L_0x056a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must be a power of 2"
            r0.<init>(r1)
            throw r0
        L_0x0572:
            r16 = r0
            r19 = r3
            r3 = r5
            r23 = r8
            r24 = r9
            r33 = r10
            r0 = r11
            r10 = r7
            r1 = r12[r15]
            double r1 = r1 * r13
            r33[r15] = r1
            int r15 = r15 + 1
            r1 = r43
            r2 = r44
            r0 = r16
            r3 = r19
            r10 = r33
            r4 = 1
            r6 = 0
            goto L_0x00bf
        L_0x0595:
            r19 = r3
            r3 = r5
            r10 = r7
            int r0 = r10.size()
            r1 = 0
        L_0x059e:
            if (r1 >= r0) goto L_0x05b0
            java.lang.Object r2 = r10.get(r1)
            ahvr r2 = (defpackage.ahvr) r2
            r4 = r43
            ahsr r5 = r4.h
            r2.a(r5)
            int r1 = r1 + 1
            goto L_0x059e
        L_0x05b0:
            r4 = r43
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r5 = r4.d
            long r0 = r0 - r5
            r5 = 7000(0x1b58, double:3.4585E-320)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0650
            android.media.AudioRecord r0 = defpackage.ahvs.b     // Catch:{ IllegalStateException -> 0x0647 }
            r0.stop()     // Catch:{ IllegalStateException -> 0x0647 }
            java.lang.Thread r1 = defpackage.ahvs.c     // Catch:{ InterruptedException -> 0x05e8 }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x05e8 }
            boolean r0 = defpackage.ahvs.a     // Catch:{ all -> 0x05e5 }
            if (r0 == 0) goto L_0x05e3
            java.util.Locale.getDefault()     // Catch:{ all -> 0x05e5 }
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x05e5 }
            r2 = 53000(0xcf08, float:7.4269E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x05e5 }
            r5 = 0
            r0[r5] = r2     // Catch:{ all -> 0x05e5 }
            java.lang.Thread r0 = defpackage.ahvs.c     // Catch:{ all -> 0x05e5 }
            r5 = 53000(0xcf08, double:2.61855E-319)
            r0.wait(r5)     // Catch:{ all -> 0x05e5 }
        L_0x05e3:
            monitor-exit(r1)     // Catch:{ all -> 0x05e5 }
            goto L_0x05e9
        L_0x05e5:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x05e5 }
            throw r0     // Catch:{ InterruptedException -> 0x05e8 }
        L_0x05e8:
            r0 = move-exception
        L_0x05e9:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x063e }
            r4.d = r0     // Catch:{ IllegalStateException -> 0x063e }
        L_0x05ef:
            android.media.AudioRecord r0 = defpackage.ahvs.b     // Catch:{ IllegalStateException -> 0x063e }
            r0.startRecording()     // Catch:{ IllegalStateException -> 0x063e }
            android.media.AudioRecord r0 = defpackage.ahvs.b     // Catch:{ IllegalStateException -> 0x063e }
            int r0 = r0.getRecordingState()     // Catch:{ IllegalStateException -> 0x063e }
            r1 = 3
            if (r0 != r1) goto L_0x05fe
            goto L_0x0627
        L_0x05fe:
            boolean r0 = defpackage.ahvs.a     // Catch:{ IllegalStateException -> 0x063e }
            if (r0 == 0) goto L_0x0627
            java.util.Locale.getDefault()     // Catch:{ IllegalStateException -> 0x063e }
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ IllegalStateException -> 0x063e }
            r1 = 60000(0xea60, float:8.4078E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IllegalStateException -> 0x063e }
            r2 = 0
            r0[r2] = r1     // Catch:{ IllegalStateException -> 0x063e }
            java.lang.Thread r1 = defpackage.ahvs.c     // Catch:{ InterruptedException -> 0x0626 }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x0626 }
            boolean r0 = defpackage.ahvs.a     // Catch:{ all -> 0x0623 }
            if (r0 == 0) goto L_0x0621
            java.lang.Thread r0 = defpackage.ahvs.c     // Catch:{ all -> 0x0623 }
            r5 = 60000(0xea60, double:2.9644E-319)
            r0.wait(r5)     // Catch:{ all -> 0x0623 }
        L_0x0621:
            monitor-exit(r1)     // Catch:{ all -> 0x0623 }
            goto L_0x05ef
        L_0x0623:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0623 }
            throw r0     // Catch:{ InterruptedException -> 0x0626 }
        L_0x0626:
            r0 = move-exception
        L_0x0627:
            ahwk r0 = r3.b     // Catch:{ IllegalStateException -> 0x063e }
            ahwi r0 = r0.b     // Catch:{ IllegalStateException -> 0x063e }
            r1 = 0
            r0.d = r1     // Catch:{ IllegalStateException -> 0x063e }
            r0.c = r1     // Catch:{ IllegalStateException -> 0x063e }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x063e }
            r3.j = r0     // Catch:{ IllegalStateException -> 0x063e }
            r2 = r44
            r5 = r3
            r1 = r4
            r3 = r19
            goto L_0x0011
        L_0x063e:
            r0 = move-exception
            r2 = r44
            r5 = r3
            r1 = r4
            r3 = r19
            goto L_0x0011
        L_0x0647:
            r0 = move-exception
            r2 = r44
            r5 = r3
            r1 = r4
            r3 = r19
            goto L_0x0011
        L_0x0650:
            r2 = r44
            r5 = r3
            r1 = r4
            r3 = r19
            goto L_0x0011
        L_0x0658:
            r4 = r1
            java.util.Locale.getDefault()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 0
            r1[r2] = r0
            return r2
        L_0x0667:
            r4 = r1
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahvo.a(int, int, long):boolean");
    }

    /* access modifiers changed from: protected */
    public final AudioFormat c() {
        return new AudioFormat.Builder().setEncoding(2).setSampleRate(44100).setChannelMask(16).build();
    }

    /* access modifiers changed from: protected */
    public final int d() {
        return 44100;
    }

    /* access modifiers changed from: protected */
    public final int e() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public final int f() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public final int g() {
        return 1;
    }
}
