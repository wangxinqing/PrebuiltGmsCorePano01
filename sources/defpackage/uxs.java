package defpackage;

/* renamed from: uxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uxs extends arwm {
    final /* synthetic */ vgr a;
    final /* synthetic */ asgd b;
    final /* synthetic */ uxu c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uxs(uxu uxu, String str, vgr vgr, asgd asgd) {
        super(str);
        this.c = uxu;
        this.a = vgr;
        this.b = asgd;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0328, code lost:
        if (r9 < (r10.h.intValue() - r10.b.intValue())) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03b0, code lost:
        if (r14 > (r12 + r4)) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a0, code lost:
        if (r12 == 1) goto L_0x01a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r35 = this;
            r0 = r35
            uxu r1 = r0.c
            vgr r2 = r0.a
            asgd r3 = r0.b
            asev r3 = r3.d
            if (r3 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            asev r3 = defpackage.asev.h
        L_0x000f:
            asgb r4 = defpackage.asgb.OPERATION_STATUS_UNKNOWN
            avch r4 = defpackage.avch.TOKEN_MEDIUM_UNKNOWN
            int r4 = r3.f
            int r4 = defpackage.asfc.a(r4)
            r5 = 1
            if (r4 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r4 = 1
        L_0x001e:
            int r4 = r4 + -1
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 0
            if (r4 == r5) goto L_0x00aa
            if (r4 == r7) goto L_0x003b
            if (r4 == r6) goto L_0x0035
            jjg r1 = defpackage.tgc.a
            int r1 = r3.a
            r1 = r1 & 16
            if (r1 == 0) goto L_0x0600
            int r1 = r3.f
            return
        L_0x0035:
            vak r1 = r1.g
            r1.b()
            return
        L_0x003b:
            vak r1 = r1.g
            asft r2 = r3.c
            if (r2 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            asft r2 = defpackage.asft.c
        L_0x0044:
            auay r2 = r2.b
            byte[] r2 = r2.k()
            java.lang.String r2 = defpackage.asgt.a((byte[]) r2)
            arwg r3 = r1.l
            r3.b()
            uzy r3 = r1.b
            vab r3 = r3.a
            java.util.Map r4 = r3.a
            r4.remove(r2)
            java.util.Map r4 = r3.i
            r4.remove(r2)
            java.lang.String r4 = r3.g
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x006a
            goto L_0x0072
        L_0x006a:
            r3.g = r9
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r3.h = r4
        L_0x0072:
            java.util.Map r3 = r1.g
            java.lang.Object r2 = r3.remove(r2)
            vai r2 = (defpackage.vai) r2
            if (r2 == 0) goto L_0x0600
            jjg r3 = defpackage.tgc.a
            java.util.Set r3 = r2.b()
            java.util.Iterator r3 = r3.iterator()
        L_0x0086:
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L_0x00a0
            java.util.Collection r1 = r1.k
            int r3 = r1.size()
        L_0x0092:
            if (r8 >= r3) goto L_0x0600
            java.lang.Object r4 = r1.get(r8)
            vaj r4 = (defpackage.vaj) r4
            r4.a(r2)
            int r8 = r8 + 1
            goto L_0x0092
        L_0x00a0:
            java.lang.Object r4 = r3.next()
            auzf r4 = (defpackage.auzf) r4
            r1.a((defpackage.auzf) r4, (defpackage.vai) r9)
            goto L_0x0086
        L_0x00aa:
            asfp r4 = r3.b
            if (r4 == 0) goto L_0x00af
            goto L_0x00b1
        L_0x00af:
            asfp r4 = defpackage.asfp.c
        L_0x00b1:
            auay r4 = r4.b
            byte[] r4 = r4.k()
            gti r4 = defpackage.gti.a((byte[]) r4)
            tgh r4 = defpackage.uyw.a(r4)
            if (r4 == 0) goto L_0x00ca
            avch r10 = defpackage.avch.BLE_ADVERTISING_PACKET
            aval r10 = defpackage.uxu.a((defpackage.avch) r10, (defpackage.tgh) r4)
            r2.a(r4, r10)
        L_0x00ca:
            vak r1 = r1.g
            arwg r2 = r1.l
            r2.b()
            asft r2 = r3.c
            if (r2 == 0) goto L_0x00d6
            goto L_0x00d8
        L_0x00d6:
            asft r2 = defpackage.asft.c
        L_0x00d8:
            auay r2 = r2.b
            byte[] r2 = r2.k()
            java.lang.String r2 = defpackage.asgt.a((byte[]) r2)
            asfp r4 = r3.b
            if (r4 == 0) goto L_0x00e7
            goto L_0x00e9
        L_0x00e7:
            asfp r4 = defpackage.asfp.c
        L_0x00e9:
            auay r4 = r4.b
            byte[] r4 = r4.k()
            uzx r4 = defpackage.uzx.a((byte[]) r4)
            arwg r10 = r1.l
            r10.b()
            java.util.Map r10 = r1.g
            java.lang.Object r10 = r10.get(r2)
            vai r10 = (defpackage.vai) r10
            if (r10 != 0) goto L_0x0122
            java.util.Map r11 = r1.g
            int r11 = r11.size()
            int r12 = r1.f
            if (r11 >= r12) goto L_0x011b
            vai r10 = new vai
            long r11 = android.os.SystemClock.elapsedRealtime()
            r10.<init>(r11, r2)
            java.util.Map r11 = r1.g
            r11.put(r2, r10)
            goto L_0x0122
        L_0x011b:
            jjg r11 = defpackage.tgc.a
            java.util.Map r11 = r1.g
            r11.size()
        L_0x0122:
            if (r10 == 0) goto L_0x012b
            vai r11 = new vai
            r11.<init>(r10)
            r10 = r11
            goto L_0x012c
        L_0x012b:
            r10 = r9
        L_0x012c:
            if (r10 == 0) goto L_0x0600
            asfp r11 = r3.b
            if (r11 == 0) goto L_0x0133
            goto L_0x0135
        L_0x0133:
            asfp r11 = defpackage.asfp.c
        L_0x0135:
            auay r11 = r11.b
            byte[] r11 = r11.k()
            gti r15 = defpackage.gti.a((byte[]) r11)
            gtu r11 = r1.c
            gtt r11 = r11.a(r15)
            android.content.Context r12 = r1.d
            boolean r12 = defpackage.tga.a((android.content.Context) r12)
            if (r12 != 0) goto L_0x014e
            goto L_0x0160
        L_0x014e:
            if (r11 != 0) goto L_0x0160
            android.os.ParcelUuid r11 = defpackage.tga.a
            byte[] r11 = r15.a((android.os.ParcelUuid) r11)
            boolean r11 = defpackage.tga.b((byte[]) r11)
            if (r11 == 0) goto L_0x015f
            tga r11 = defpackage.vak.a
            goto L_0x0160
        L_0x015f:
            r11 = r9
        L_0x0160:
            if (r11 == 0) goto L_0x01a2
            boolean r12 = r11.c()
            if (r12 == 0) goto L_0x01a2
            int r12 = r11.a()
            if (r12 == r5) goto L_0x017e
            if (r12 == r7) goto L_0x017d
            if (r12 == r6) goto L_0x017b
            r6 = 106(0x6a, float:1.49E-43)
            if (r12 == r6) goto L_0x0178
            r6 = 1
            goto L_0x017f
        L_0x0178:
            r6 = 107(0x6b, float:1.5E-43)
            goto L_0x017f
        L_0x017b:
            r6 = 5
            goto L_0x017f
        L_0x017d:
            goto L_0x017f
        L_0x017e:
            r6 = 2
        L_0x017f:
            android.content.Context r12 = r1.d
            vav r13 = r1.e
            boolean r12 = defpackage.uxu.a((android.content.Context) r12, (defpackage.vav) r13, (int) r6)
            if (r12 == 0) goto L_0x01a2
            byte[] r12 = r11.a((defpackage.gti) r15)
            auzf r6 = defpackage.uzu.a(r6, r12)
            int r12 = r6.a
            r12 = r12 & r7
            if (r12 == 0) goto L_0x01a2
            int r12 = r6.b
            int r12 = defpackage.avaw.a(r12)
            if (r12 != 0) goto L_0x01a0
            r6 = r9
            goto L_0x01a3
        L_0x01a0:
            if (r12 != r5) goto L_0x01a3
        L_0x01a2:
            r6 = r9
        L_0x01a3:
            int r12 = r3.a
            r12 = r12 & 8
            r16 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 != 0) goto L_0x01bf
            r28 = r3
            r29 = r4
            r20 = r6
            r21 = r10
            r26 = r15
            r4 = r16
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0401
        L_0x01bf:
            if (r6 == 0) goto L_0x01f5
            java.util.Map r12 = r1.i
            boolean r12 = r12.containsKey(r6)
            if (r12 != 0) goto L_0x01ec
            vah r12 = r1.j
            vag r14 = new vag
            r14.<init>((defpackage.auzf) r6)
            boolean r19 = r12.c()
            if (r19 == 0) goto L_0x01e3
            aiss r12 = r12.a((defpackage.vag) r14)
            if (r12 == 0) goto L_0x01e3
            auze r12 = r12.d
            if (r12 != 0) goto L_0x01e4
            auze r12 = defpackage.auze.d
            goto L_0x01e4
        L_0x01e3:
            r12 = r9
        L_0x01e4:
            if (r12 != 0) goto L_0x01e7
            goto L_0x01ec
        L_0x01e7:
            java.util.Map r14 = r1.i
            r14.put(r6, r12)
        L_0x01ec:
            java.util.Map r12 = r1.i
            java.lang.Object r12 = r12.get(r6)
            auze r12 = (defpackage.auze) r12
            goto L_0x01f6
        L_0x01f5:
            r12 = r9
        L_0x01f6:
            if (r12 == 0) goto L_0x0204
            int r14 = r12.a
            r14 = r14 & r7
            if (r14 == 0) goto L_0x0204
            int r14 = r12.c
            int r14 = com.google.android.gms.nearby.messages.internal.BleSignalImpl.b(r14)
            goto L_0x0220
        L_0x0204:
            if (r11 == 0) goto L_0x020b
            java.lang.Integer r14 = r11.b(r15)
            goto L_0x020c
        L_0x020b:
            r14 = r9
        L_0x020c:
            if (r14 != 0) goto L_0x0218
            int r14 = r15.c
            int r14 = com.google.android.gms.nearby.messages.internal.BleSignalImpl.b(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
        L_0x0218:
            int r14 = r14.intValue()
            int r14 = com.google.android.gms.nearby.messages.internal.BleSignalImpl.a(r14)
        L_0x0220:
            if (r12 != 0) goto L_0x0223
            goto L_0x022c
        L_0x0223:
            int r12 = r12.a
            r12 = r12 & r7
            if (r12 == 0) goto L_0x022c
            r20 = r6
            r6 = r14
            goto L_0x023a
        L_0x022c:
            aync r12 = defpackage.aync.a
            aynd r12 = r12.a()
            r20 = r6
            long r5 = r12.X()
            int r6 = (int) r5
            int r6 = r6 + r14
        L_0x023a:
            aync r5 = defpackage.aync.a
            aynd r5 = r5.a()
            r21 = r10
            long r9 = r5.P()
            int r5 = (int) r9
            int r9 = r3.e
            uzy r10 = r1.b
            int r9 = r9 + r5
            if (r6 == r13) goto L_0x0250
            r12 = r6
            goto L_0x0254
        L_0x0250:
            r22 = -77
            r12 = -77
        L_0x0254:
            vab r10 = r10.a
            java.lang.String r13 = r10.g
            int r7 = defpackage.guq.a((int) r9, (int) r12)
            double r23 = defpackage.guq.b(r9, r12)
            int r25 = defpackage.guq.a(r23)
            java.util.Map r8 = r10.i
            java.lang.Object r8 = r8.get(r2)
            if (r8 != 0) goto L_0x0276
            java.util.Map r8 = r10.i
            vaa r0 = new vaa
            r0.<init>()
            r8.put(r2, r0)
        L_0x0276:
            java.util.Map r0 = r10.i
            java.lang.Object r0 = r0.get(r2)
            vaa r0 = (defpackage.vaa) r0
            double r8 = (double) r9
            r27 = r14
            r26 = r15
            long r14 = android.os.SystemClock.elapsedRealtime()
            r0.d = r8
            r28 = r3
            boolean r3 = r0.f
            r29 = r4
            r30 = r5
            if (r3 != 0) goto L_0x02c9
            long r4 = r0.c
            long r4 = r14 - r4
            r3 = r6
            r33 = r7
            double r6 = r0.e
            int r34 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r34 >= 0) goto L_0x02a3
            int r6 = r0.a
            goto L_0x02a5
        L_0x02a3:
            int r6 = r0.b
        L_0x02a5:
            if (r6 == 0) goto L_0x02b7
            double r4 = (double) r4
            double r6 = (double) r6
            java.lang.Double.isNaN(r4)
            java.lang.Double.isNaN(r6)
            double r4 = r4 / r6
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r31 = java.lang.Math.min(r4, r6)
            goto L_0x02bb
        L_0x02b7:
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r31 = r6
        L_0x02bb:
            double r4 = r0.d
            double r4 = r4 * r31
            double r8 = r6 - r31
            double r6 = r0.e
            double r8 = r8 * r6
            double r8 = r8 + r4
            r0.e = r8
            goto L_0x02d1
        L_0x02c9:
            r3 = r6
            r33 = r7
            r0.e = r8
            r4 = 0
            r0.f = r4
        L_0x02d1:
            r0.c = r14
            int r0 = (int) r8
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r6 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x02df
            int r6 = defpackage.guq.a((int) r0, (int) r12)
            goto L_0x02e1
        L_0x02df:
            r6 = r33
        L_0x02e1:
            int r7 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x02ea
            double r7 = defpackage.guq.b(r0, r12)
            goto L_0x02ec
        L_0x02ea:
            r7 = r23
        L_0x02ec:
            int r0 = (r23 > r4 ? 1 : (r23 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x02f5
            int r0 = defpackage.guq.a(r7)
            goto L_0x02f7
        L_0x02f5:
            r0 = r25
        L_0x02f7:
            boolean r4 = r2.equals(r13)
            if (r4 == 0) goto L_0x0312
            if (r25 == 0) goto L_0x030a
            r4 = 0
            r10.g = r4
            r5 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r10.h = r9
            goto L_0x0335
        L_0x030a:
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r33)
            r10.h = r5
            goto L_0x0335
        L_0x0312:
            r4 = 0
            if (r25 != 0) goto L_0x0335
            java.lang.String r5 = r10.g
            if (r5 == 0) goto L_0x032b
            java.lang.Integer r5 = r10.h
            int r5 = r5.intValue()
            java.lang.Integer r9 = r10.b
            int r9 = r9.intValue()
            int r5 = r5 - r9
            r9 = r33
            if (r9 >= r5) goto L_0x0335
            goto L_0x032d
        L_0x032b:
            r9 = r33
        L_0x032d:
            r10.g = r2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r10.h = r5
        L_0x0335:
            java.util.Map r5 = r10.a
            boolean r5 = r5.containsKey(r2)
            if (r5 != 0) goto L_0x0349
            java.util.Map r5 = r10.a
            uzz r6 = new uzz
            r6.<init>(r0, r7)
            r5.put(r2, r6)
            goto L_0x03cb
        L_0x0349:
            java.util.Map r5 = r10.a
            java.lang.Object r5 = r5.get(r2)
            uzz r5 = (defpackage.uzz) r5
            int r9 = r5.a
            r5.b = r7
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r7 = defpackage.guq.a((double) r7, (int) r12)
            int r7 = defpackage.guq.a((int) r7, (int) r12)
            double r7 = (double) r7
            r13 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r13 = defpackage.guq.a((double) r13, (int) r12)
            int r12 = defpackage.guq.a((int) r13, (int) r12)
            double r12 = (double) r12
            if (r0 == r9) goto L_0x03cb
            if (r9 == 0) goto L_0x03b5
            r14 = 1
            if (r9 == r14) goto L_0x038c
            r14 = 2
            if (r9 == r14) goto L_0x0376
            goto L_0x03cb
        L_0x0376:
            double r6 = (double) r6
            java.lang.Integer r8 = r10.d
            int r8 = r8.intValue()
            double r8 = (double) r8
            java.lang.Double.isNaN(r12)
            java.lang.Double.isNaN(r8)
            double r12 = r12 - r8
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 >= 0) goto L_0x03cb
            r5.a = r0
            goto L_0x03cb
        L_0x038c:
            double r14 = (double) r6
            java.lang.Integer r6 = r10.c
            int r6 = r6.intValue()
            r9 = r5
            double r4 = (double) r6
            java.lang.Double.isNaN(r7)
            java.lang.Double.isNaN(r4)
            double r7 = r7 - r4
            int r4 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x03b2
            java.lang.Integer r4 = r10.f
            int r4 = r4.intValue()
            double r4 = (double) r4
            java.lang.Double.isNaN(r12)
            java.lang.Double.isNaN(r4)
            double r12 = r12 + r4
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x03cb
        L_0x03b2:
            r9.a = r0
            goto L_0x03cb
        L_0x03b5:
            r9 = r5
            double r4 = (double) r6
            java.lang.Integer r6 = r10.e
            int r6 = r6.intValue()
            double r12 = (double) r6
            java.lang.Double.isNaN(r7)
            java.lang.Double.isNaN(r12)
            double r7 = r7 + r12
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x03cb
            r9.a = r0
        L_0x03cb:
            uzy r0 = r1.b
            vab r0 = r0.a
            java.util.Map r0 = r0.i
            java.lang.Object r0 = r0.get(r2)
            vaa r0 = (defpackage.vaa) r0
            double r4 = r0.e
            int r0 = (int) r4
            int r0 = r0 - r30
            uzy r4 = r1.b
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r5) goto L_0x03fc
            vab r3 = r4.a
            java.util.Map r4 = r3.a
            boolean r4 = r4.containsKey(r2)
            if (r4 == 0) goto L_0x03f9
            java.util.Map r3 = r3.a
            java.lang.Object r3 = r3.get(r2)
            uzz r3 = (defpackage.uzz) r3
            double r3 = r3.b
            r16 = r3
            goto L_0x03fd
        L_0x03f9:
            r16 = 0
            goto L_0x03fd
        L_0x03fc:
        L_0x03fd:
            r4 = r16
            r3 = r27
        L_0x0401:
            boolean r6 = java.lang.Double.isNaN(r4)
            if (r6 != 0) goto L_0x043c
            r9 = r21
            double r6 = r9.g
            boolean r8 = java.lang.Double.isNaN(r6)
            if (r8 == 0) goto L_0x0417
            boolean r8 = java.lang.Double.isNaN(r4)
            if (r8 != 0) goto L_0x043e
        L_0x0417:
            boolean r8 = java.lang.Double.isNaN(r6)
            if (r8 == 0) goto L_0x041e
            goto L_0x0438
        L_0x041e:
            boolean r8 = java.lang.Double.isNaN(r4)
            if (r8 != 0) goto L_0x0438
            double r6 = r6 - r4
            double r6 = java.lang.Math.abs(r6)
            aync r8 = defpackage.aync.a
            aynd r8 = r8.a()
            double r12 = r8.p()
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 >= 0) goto L_0x0438
            goto L_0x043e
        L_0x0438:
            r9.g = r4
            r6 = 4
            goto L_0x043f
        L_0x043c:
            r9 = r21
        L_0x043e:
            r6 = 0
        L_0x043f:
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r7) goto L_0x044a
            com.google.android.gms.nearby.messages.internal.BleSignalImpl r7 = new com.google.android.gms.nearby.messages.internal.BleSignalImpl
            r8 = 1
            r7.<init>(r8, r0, r3)
            goto L_0x044b
        L_0x044a:
            r7 = 0
        L_0x044b:
            java.util.LinkedHashMap r8 = r9.e
            int r8 = r8.size()
            long r12 = (long) r8
            aync r8 = defpackage.aync.a
            aynd r8 = r8.a()
            long r14 = r8.z()
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 < 0) goto L_0x047a
            java.util.LinkedHashMap r8 = r9.e
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
            java.lang.Object r8 = r8.next()
            uzx r8 = (defpackage.uzx) r8
            java.util.LinkedHashMap r10 = r9.e
            r10.remove(r8)
            jjg r8 = defpackage.tgc.a
            r8 = 64
            goto L_0x047b
        L_0x047a:
            r8 = 0
        L_0x047b:
            java.util.LinkedHashMap r10 = r9.e
            r12 = 32
            r13 = r29
            int r10 = defpackage.vai.a(r13, r7, r10, r12)
            r8 = r8 | r10
            r6 = r6 | r8
            if (r11 == 0) goto L_0x04f8
            android.content.Context r8 = r1.d
            vav r10 = r1.e
            r12 = 104(0x68, float:1.46E-43)
            boolean r8 = defpackage.uxu.a((android.content.Context) r8, (defpackage.vav) r10, (int) r12)
            if (r8 == 0) goto L_0x049d
            r8 = r26
            java.lang.String r10 = r11.d(r8)
            r15 = r10
            goto L_0x04a0
        L_0x049d:
            r8 = r26
            r15 = 0
        L_0x04a0:
            byte[] r16 = r11.c(r8)
            r11 = r1
            r12 = r9
            r13 = r7
            r10 = 107(0x6b, float:1.5E-43)
            r14 = r20
            int r11 = r11.a(r12, r13, r14, r15, r16)
            r6 = r6 | r11
            if (r20 == 0) goto L_0x04f5
            r15 = r20
            int r11 = r15.b
            int r11 = defpackage.avaw.a(r11)
            if (r11 != 0) goto L_0x04bf
            r10 = r28
            goto L_0x04fc
        L_0x04bf:
            if (r11 != r10) goto L_0x04f2
            auzf r14 = r9.i()
            r10 = 0
            r16 = 0
            r11 = r1
            r12 = r9
            r13 = r7
            r17 = r15
            r15 = r10
            int r10 = r11.a(r12, r13, r14, r15, r16)
            r6 = r6 | r10
            r10 = 1
            boolean r11 = defpackage.vak.a((int) r6, (int) r10)
            if (r11 == 0) goto L_0x04fa
            r10 = r28
            int r11 = r10.g
            int r11 = defpackage.avay.b(r11)
            if (r11 == 0) goto L_0x04e7
            r18 = r11
            goto L_0x04e9
        L_0x04e7:
            r18 = 1
        L_0x04e9:
            r11 = r1
            r12 = r2
            r13 = r0
            r14 = r3
            r15 = r4
            r11.a(r12, r13, r14, r15, r17, r18)
            goto L_0x04fc
        L_0x04f2:
            r10 = r28
            goto L_0x04fc
        L_0x04f5:
            r10 = r28
            goto L_0x04fc
        L_0x04f8:
            r8 = r26
        L_0x04fa:
            r10 = r28
        L_0x04fc:
            android.content.Context r11 = r1.d
            boolean r11 = defpackage.tga.a((android.content.Context) r11)
            if (r11 == 0) goto L_0x05d8
            boolean r11 = defpackage.aymw.ab()
            if (r11 != 0) goto L_0x05d8
            android.os.ParcelUuid r11 = defpackage.tga.a
            byte[] r11 = r8.a((android.os.ParcelUuid) r11)
            r15 = 0
            byte[] r11 = defpackage.tga.a(r11, r15)
            if (r11 != 0) goto L_0x051d
            byte[] r11 = defpackage.tga.e((defpackage.gti) r8)
            r12 = 1
            goto L_0x051e
        L_0x051d:
            r12 = 0
        L_0x051e:
            if (r11 == 0) goto L_0x05d8
            byte[] r13 = defpackage.tga.g(r8)
            android.content.Context r14 = r1.d
            android.content.Intent r15 = new android.content.Intent
            r17 = r3
            java.lang.String r3 = "com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_BLOOM_FILTER_DETECTED"
            r15.<init>(r3)
            java.lang.String r3 = "com.google.android.gms"
            r18 = r0
            java.lang.String r0 = "com.google.android.gms.nearby.discovery.service.DiscoveryService"
            android.content.Intent r0 = r15.setClassName(r3, r0)
            java.lang.String r3 = "com.google.android.gms.nearby.discovery.BLOOM_FILTER"
            android.content.Intent r0 = r0.putExtra(r3, r11)
            java.lang.String r3 = "com.google.android.gms.nearby.discovery.BLOOM_FILTER_SUPPRESS_NOTIFICATION"
            android.content.Intent r0 = r0.putExtra(r3, r12)
            android.os.ParcelUuid r3 = defpackage.tga.a
            byte[] r3 = r8.a((android.os.ParcelUuid) r3)
            r11 = 1
            byte[] r3 = defpackage.tga.a(r3, r11)
            java.lang.String r11 = "com.google.android.gms.nearby.discovery.BLOOM_FILTER_SALT"
            android.content.Intent r0 = r0.putExtra(r11, r3)
            if (r13 != 0) goto L_0x0559
            goto L_0x055e
        L_0x0559:
            int r3 = r13.length
            if (r3 <= 0) goto L_0x055e
            r3 = r13
            goto L_0x0562
        L_0x055e:
            byte[] r3 = defpackage.tga.f(r8)
        L_0x0562:
            java.lang.String r8 = "com.google.android.gms.nearby.discovery.BATTERY_VALUES"
            android.content.Intent r0 = r0.putExtra(r8, r3)
            if (r13 == 0) goto L_0x0570
            int r3 = r13.length
            if (r3 <= 0) goto L_0x0570
            r3 = 1
            goto L_0x0571
        L_0x0570:
            r3 = 0
        L_0x0571:
            java.lang.String r8 = "com.google.android.gms.nearby.discovery.BATTERY_SUPPRESS_NOTIFICATION"
            android.content.Intent r0 = r0.putExtra(r8, r3)
            java.lang.String r3 = "com.google.android.gms.nearby.discovery.BLE_ADDRESS"
            android.content.Intent r0 = r0.putExtra(r3, r2)
            java.lang.String r3 = "com.google.android.gms.nearby.discovery.DISTANCE_ESTIMATE"
            android.content.Intent r0 = r0.putExtra(r3, r4)
            r14.startService(r0)
            aync r0 = defpackage.aync.a
            aynd r0 = r0.a()
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x05d8
            aync r0 = defpackage.aync.a
            aynd r0 = r0.a()
            long r11 = r0.x()
            double r11 = (double) r11
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x05d8
            auzf r14 = r9.i()
            r15 = 0
            r16 = 0
            r11 = r1
            r12 = r9
            r13 = r7
            r0 = 0
            int r3 = r11.a(r12, r13, r14, r15, r16)
            r6 = r6 | r3
            r3 = 1
            boolean r7 = defpackage.vak.a((int) r6, (int) r3)
            if (r7 == 0) goto L_0x05d7
            auzf r7 = r9.i()
            int r8 = r10.g
            int r8 = defpackage.avay.b(r8)
            if (r8 == 0) goto L_0x05c7
            r3 = r8
            goto L_0x05c8
        L_0x05c7:
        L_0x05c8:
            r11 = r1
            r12 = r2
            r13 = r18
            r14 = r17
            r15 = r4
            r17 = r7
            r18 = r3
            r11.a(r12, r13, r14, r15, r17, r18)
            goto L_0x05da
        L_0x05d7:
            goto L_0x05da
        L_0x05d8:
            r0 = 0
            goto L_0x05d7
        L_0x05da:
            arwg r3 = r1.l
            r3.b()
            java.util.Map r3 = r1.g
            java.lang.Object r2 = r3.put(r2, r9)
            vai r2 = (defpackage.vai) r2
            r3 = r6 & 55
            if (r3 == 0) goto L_0x0600
            java.util.Collection r1 = r1.k
            int r3 = r1.size()
            r8 = 0
        L_0x05f2:
            if (r8 >= r3) goto L_0x0600
            java.lang.Object r0 = r1.get(r8)
            vaj r0 = (defpackage.vaj) r0
            r0.a(r2, r9, r6)
            int r8 = r8 + 1
            goto L_0x05f2
        L_0x0600:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uxs.run():void");
    }
}
