package defpackage;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;
import java.util.Collection;
import java.util.List;

/* renamed from: hwq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hwq {
    static String a = null;
    private static final Object b = new Object();
    private final Context c;
    private final hvg d;
    private final htg e;
    private final hsa f;
    private final hwe g;
    private final ModuleManager h;
    private final hwp i;

    public hwq(Context context, hvg hvg, hwe hwe, htg htg, hsa hsa, ModuleManager moduleManager, hwp hwp) {
        iva.a((Object) context);
        this.c = context;
        iva.a((Object) hvg);
        this.d = hvg;
        this.g = hwe;
        this.e = htg;
        this.f = hsa;
        this.h = moduleManager;
        this.i = hwp;
    }

    /* JADX WARNING: Removed duplicated region for block: B:138:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0436 A[EDGE_INSN: B:200:0x0436->B:179:0x0436 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.avrr a(defpackage.avtn r26, java.util.List r27, java.lang.String r28) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r3 = r28
            avrr r0 = defpackage.avrr.q
            aucd r0 = r0.o()
            r4 = r0
            aucf r4 = (defpackage.aucf) r4
            boolean r0 = defpackage.jkr.h()
            r5 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.String r7 = "Uploader"
            r8 = 0
            r12 = 2
            r13 = 4
            r14 = 1
            r15 = 0
            if (r0 == 0) goto L_0x00a2
            awtr r0 = defpackage.awtr.a
            awts r0 = r0.a()
            boolean r0 = r0.z()
            if (r0 == 0) goto L_0x0156
            java.time.Clock r0 = android.os.SystemClock.currentGnssTimeClock()     // Catch:{ Exception -> 0x009a }
            long r10 = r0.millis()     // Catch:{ Exception -> 0x009a }
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x003a
            goto L_0x0156
        L_0x003a:
            avrj r0 = defpackage.avrj.e     // Catch:{ Exception -> 0x009a }
            aucd r0 = r0.o()     // Catch:{ Exception -> 0x009a }
            boolean r8 = r0.c     // Catch:{ Exception -> 0x009a }
            if (r8 != 0) goto L_0x0045
            goto L_0x004a
        L_0x0045:
            r0.c()     // Catch:{ Exception -> 0x009a }
            r0.c = r15     // Catch:{ Exception -> 0x009a }
        L_0x004a:
            aucj r8 = r0.b     // Catch:{ Exception -> 0x009a }
            avrj r8 = (defpackage.avrj) r8     // Catch:{ Exception -> 0x009a }
            int r9 = r8.a     // Catch:{ Exception -> 0x009a }
            r9 = r9 | r14
            r8.a = r9     // Catch:{ Exception -> 0x009a }
            r8.b = r10     // Catch:{ Exception -> 0x009a }
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ Exception -> 0x009a }
            long r8 = r8 / r5
            boolean r5 = r0.c     // Catch:{ Exception -> 0x009a }
            if (r5 != 0) goto L_0x005f
            goto L_0x0064
        L_0x005f:
            r0.c()     // Catch:{ Exception -> 0x009a }
            r0.c = r15     // Catch:{ Exception -> 0x009a }
        L_0x0064:
            aucj r5 = r0.b     // Catch:{ Exception -> 0x009a }
            avrj r5 = (defpackage.avrj) r5     // Catch:{ Exception -> 0x009a }
            int r6 = r5.a     // Catch:{ Exception -> 0x009a }
            r6 = r6 | r12
            r5.a = r6     // Catch:{ Exception -> 0x009a }
            r5.c = r8     // Catch:{ Exception -> 0x009a }
            java.lang.String r8 = "GNSS"
            r8.getClass()     // Catch:{ Exception -> 0x009a }
            r6 = r6 | r13
            r5.a = r6     // Catch:{ Exception -> 0x009a }
            r5.d = r8     // Catch:{ Exception -> 0x009a }
            boolean r5 = r4.c     // Catch:{ Exception -> 0x009a }
            if (r5 != 0) goto L_0x007e
            goto L_0x0083
        L_0x007e:
            r4.c()     // Catch:{ Exception -> 0x009a }
            r4.c = r15     // Catch:{ Exception -> 0x009a }
        L_0x0083:
            aucj r5 = r4.b     // Catch:{ Exception -> 0x009a }
            avrr r5 = (defpackage.avrr) r5     // Catch:{ Exception -> 0x009a }
            aucj r0 = r0.i()     // Catch:{ Exception -> 0x009a }
            avrj r0 = (defpackage.avrj) r0     // Catch:{ Exception -> 0x009a }
            r0.getClass()     // Catch:{ Exception -> 0x009a }
            r5.n = r0     // Catch:{ Exception -> 0x009a }
            int r0 = r5.a     // Catch:{ Exception -> 0x009a }
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r5.a = r0     // Catch:{ Exception -> 0x009a }
            goto L_0x0156
        L_0x009a:
            r0 = move-exception
            boolean r5 = r0 instanceof java.time.DateTimeException
            if (r5 == 0) goto L_0x00a1
            goto L_0x0156
        L_0x00a1:
            throw r0
        L_0x00a2:
            int r0 = android.os.Build.VERSION.SDK_INT
            boolean r0 = defpackage.jkr.b()
            if (r0 == 0) goto L_0x00bf
            android.content.Context r0 = r1.c
            java.lang.String r8 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r0.checkSelfPermission(r8)
            r8 = -1
            if (r0 != r8) goto L_0x00bf
            android.content.Context r0 = r1.c
            java.lang.String r9 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = r0.checkSelfPermission(r9)
            if (r0 == r8) goto L_0x0156
        L_0x00bf:
            android.content.Context r0 = r1.c     // Catch:{ ClassCastException -> 0x00d8, IllegalArgumentException -> 0x00d6, IllegalStateException -> 0x00d4, NullPointerException -> 0x00d2, SecurityException -> 0x00d0 }
            java.lang.String r8 = "location"
            java.lang.Object r0 = r0.getSystemService(r8)     // Catch:{ ClassCastException -> 0x00d8, IllegalArgumentException -> 0x00d6, IllegalStateException -> 0x00d4, NullPointerException -> 0x00d2, SecurityException -> 0x00d0 }
            android.location.LocationManager r0 = (android.location.LocationManager) r0     // Catch:{ ClassCastException -> 0x00d8, IllegalArgumentException -> 0x00d6, IllegalStateException -> 0x00d4, NullPointerException -> 0x00d2, SecurityException -> 0x00d0 }
            java.lang.String r8 = "passive"
            android.location.Location r0 = r0.getLastKnownLocation(r8)     // Catch:{ ClassCastException -> 0x00d8, IllegalArgumentException -> 0x00d6, IllegalStateException -> 0x00d4, NullPointerException -> 0x00d2, SecurityException -> 0x00d0 }
            goto L_0x00df
        L_0x00d0:
            r0 = move-exception
            goto L_0x00d9
        L_0x00d2:
            r0 = move-exception
            goto L_0x00d9
        L_0x00d4:
            r0 = move-exception
            goto L_0x00d9
        L_0x00d6:
            r0 = move-exception
            goto L_0x00d9
        L_0x00d8:
            r0 = move-exception
        L_0x00d9:
            java.lang.String r8 = "Failed obtaining trusted timestamp"
            android.util.Log.e(r7, r8, r0)
            r0 = 0
        L_0x00df:
            if (r0 == 0) goto L_0x0156
            avrj r8 = defpackage.avrj.e
            aucd r8 = r8.o()
            long r9 = r0.getTime()
            boolean r11 = r8.c
            if (r11 != 0) goto L_0x00f0
            goto L_0x00f5
        L_0x00f0:
            r8.c()
            r8.c = r15
        L_0x00f5:
            aucj r11 = r8.b
            avrj r11 = (defpackage.avrj) r11
            int r13 = r11.a
            r13 = r13 | r14
            r11.a = r13
            r11.b = r9
            long r9 = r0.getElapsedRealtimeNanos()
            long r9 = r9 / r5
            boolean r5 = r8.c
            if (r5 != 0) goto L_0x010a
            goto L_0x010f
        L_0x010a:
            r8.c()
            r8.c = r15
        L_0x010f:
            aucj r5 = r8.b
            avrj r5 = (defpackage.avrj) r5
            int r6 = r5.a
            r6 = r6 | r12
            r5.a = r6
            r5.c = r9
            java.lang.String r0 = r0.getProvider()
            boolean r5 = r8.c
            if (r5 != 0) goto L_0x0123
            goto L_0x0128
        L_0x0123:
            r8.c()
            r8.c = r15
        L_0x0128:
            aucj r5 = r8.b
            avrj r5 = (defpackage.avrj) r5
            r0.getClass()
            int r6 = r5.a
            r9 = 4
            r6 = r6 | r9
            r5.a = r6
            r5.d = r0
            boolean r0 = r4.c
            if (r0 != 0) goto L_0x013c
            goto L_0x0141
        L_0x013c:
            r4.c()
            r4.c = r15
        L_0x0141:
            aucj r0 = r4.b
            avrr r0 = (defpackage.avrr) r0
            aucj r5 = r8.i()
            avrj r5 = (defpackage.avrj) r5
            r5.getClass()
            r0.n = r5
            int r5 = r0.a
            r5 = r5 | 1024(0x400, float:1.435E-42)
            r0.a = r5
        L_0x0156:
            avrf r0 = defpackage.avrf.e
            aucd r0 = r0.o()
            boolean r5 = r0.c
            if (r5 != 0) goto L_0x0161
            goto L_0x0166
        L_0x0161:
            r0.c()
            r0.c = r15
        L_0x0166:
            aucj r5 = r0.b
            avrf r5 = (defpackage.avrf) r5
            r6 = 4
            r5.b = r6
            int r6 = r5.a
            r6 = r6 | r14
            r5.a = r6
            int r5 = r2.a
            r5 = r5 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x017f
            avrb r5 = r2.l
            if (r5 != 0) goto L_0x01be
            avrb r5 = defpackage.avrb.C
            goto L_0x01be
        L_0x017f:
            android.content.Context r5 = r1.c
            int r5 = defpackage.jhg.d((android.content.Context) r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r5.intValue()
            r8 = -1
            if (r6 == r8) goto L_0x0193
            r22 = r5
            goto L_0x0195
        L_0x0193:
            r22 = 0
        L_0x0195:
            android.content.Context r5 = r1.c
            boolean r6 = r2.g
            int r8 = r2.a
            r8 = r8 & 32
            if (r8 == 0) goto L_0x01a4
            java.lang.String r10 = r2.f
            r20 = r10
            goto L_0x01a6
        L_0x01a4:
            r20 = 0
        L_0x01a6:
            int r8 = r2.c
            com.google.android.chimera.config.ModuleManager r9 = r1.h
            jik r23 = defpackage.jil.a((com.google.android.chimera.config.ModuleManager) r9)
            android.content.Context r9 = r1.c
            anoc r24 = defpackage.jgt.a((android.content.Context) r9)
            r18 = r5
            r19 = r6
            r21 = r8
            avrb r5 = defpackage.jhg.a(r18, r19, r20, r21, r22, r23, r24)
        L_0x01be:
            r6 = 5
            java.lang.Object r8 = r5.c(r6)
            aucd r8 = (defpackage.aucd) r8
            r8.a((defpackage.aucj) r5)
            aucf r8 = (defpackage.aucf) r8
            aucj r5 = r8.b
            avrb r5 = (defpackage.avrb) r5
            long r9 = r5.b
            r16 = 0
            int r5 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x01d8
            goto L_0x01f9
        L_0x01d8:
            boolean r5 = r2.g
            if (r5 == 0) goto L_0x01f9
            android.content.Context r5 = r1.c
            long r9 = defpackage.jhg.a((android.content.Context) r5)
            boolean r5 = r8.c
            if (r5 != 0) goto L_0x01e7
            goto L_0x01ec
        L_0x01e7:
            r8.c()
            r8.c = r15
        L_0x01ec:
            aucj r5 = r8.b
            avrb r5 = (defpackage.avrb) r5
            avrb r11 = defpackage.avrb.C
            int r11 = r5.a
            r11 = r11 | r14
            r5.a = r11
            r5.b = r9
        L_0x01f9:
            boolean r5 = r0.c
            if (r5 != 0) goto L_0x01fe
            goto L_0x0203
        L_0x01fe:
            r0.c()
            r0.c = r15
        L_0x0203:
            aucj r5 = r0.b
            avrf r5 = (defpackage.avrf) r5
            aucj r8 = r8.i()
            avrb r8 = (defpackage.avrb) r8
            r8.getClass()
            r5.c = r8
            int r8 = r5.a
            r8 = r8 | 8
            r5.a = r8
            long r8 = r2.m
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0237
            boolean r5 = r0.c
            if (r5 != 0) goto L_0x0225
            goto L_0x022a
        L_0x0225:
            r0.c()
            r0.c = r15
        L_0x022a:
            aucj r5 = r0.b
            avrf r5 = (defpackage.avrf) r5
            int r10 = r5.a
            r11 = 131072(0x20000, float:1.83671E-40)
            r10 = r10 | r11
            r5.a = r10
            r5.d = r8
        L_0x0237:
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x023c
            goto L_0x0241
        L_0x023c:
            r4.c()
            r4.c = r15
        L_0x0241:
            aucj r5 = r4.b
            avrr r5 = (defpackage.avrr) r5
            aucj r0 = r0.i()
            avrf r0 = (defpackage.avrf) r0
            r0.getClass()
            r5.d = r0
            int r0 = r5.a
            r8 = 4
            r0 = r0 | r8
            r5.a = r0
            int r0 = r2.d
            avrp r0 = defpackage.avrp.a(r0)
            if (r0 != 0) goto L_0x025f
            goto L_0x027b
        L_0x025f:
            avrp r5 = defpackage.avrp.UNKNOWN
            if (r0 == r5) goto L_0x027b
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x0268
            goto L_0x026d
        L_0x0268:
            r4.c()
            r4.c = r15
        L_0x026d:
            aucj r5 = r4.b
            avrr r5 = (defpackage.avrr) r5
            int r0 = r0.yv
            r5.e = r0
            int r0 = r5.a
            r0 = r0 | 8
            r5.a = r0
        L_0x027b:
            java.lang.String r0 = r2.i
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x029e
            java.lang.String r0 = r2.i
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x028a
            goto L_0x028f
        L_0x028a:
            r4.c()
            r4.c = r15
        L_0x028f:
            aucj r5 = r4.b
            avrr r5 = (defpackage.avrr) r5
            r0.getClass()
            int r8 = r5.a
            r8 = r8 | 16
            r5.a = r8
            r5.f = r0
        L_0x029e:
            int r0 = r2.a
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x02bf
            java.lang.String r0 = r2.h
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x02ab
            goto L_0x02b0
        L_0x02ab:
            r4.c()
            r4.c = r15
        L_0x02b0:
            aucj r5 = r4.b
            avrr r5 = (defpackage.avrr) r5
            r0.getClass()
            int r8 = r5.a
            r8 = r8 | 32
            r5.a = r8
            r5.g = r0
        L_0x02bf:
            int r0 = r27.size()
            r5 = 0
        L_0x02c4:
            if (r5 >= r0) goto L_0x02fa
            r8 = r27
            java.lang.Object r9 = r8.get(r5)
            huw r9 = (defpackage.huw) r9
            auay r9 = r9.b
            boolean r10 = r4.c
            if (r10 != 0) goto L_0x02d5
            goto L_0x02da
        L_0x02d5:
            r4.c()
            r4.c = r15
        L_0x02da:
            aucj r10 = r4.b
            avrr r10 = (defpackage.avrr) r10
            r9.getClass()
            aucx r11 = r10.i
            boolean r11 = r11.a()
            if (r11 == 0) goto L_0x02ea
            goto L_0x02f2
        L_0x02ea:
            aucx r11 = r10.i
            aucx r11 = defpackage.aucj.a((defpackage.aucx) r11)
            r10.i = r11
        L_0x02f2:
            aucx r10 = r10.i
            r10.add(r9)
            int r5 = r5 + 1
            goto L_0x02c4
        L_0x02fa:
            int r0 = r2.k
            avsd r0 = defpackage.avsd.a(r0)
            if (r0 != 0) goto L_0x0303
            goto L_0x031b
        L_0x0303:
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x0308
            goto L_0x030d
        L_0x0308:
            r4.c()
            r4.c = r15
        L_0x030d:
            aucj r5 = r4.b
            avrr r5 = (defpackage.avrr) r5
            int r0 = r0.f
            r5.j = r0
            int r0 = r5.a
            r0 = r0 | 128(0x80, float:1.794E-43)
            r5.a = r0
        L_0x031b:
            int r0 = r28.hashCode()
            r5 = -1146690621(0xffffffffbba6e3c3, float:-0.0050930693)
            if (r0 == r5) goto L_0x0343
            r5 = 760599219(0x2d55d2b3, float:1.2154433E-11)
            if (r0 == r5) goto L_0x0339
            r5 = 1595348501(0x5f171615, float:1.0886912E19)
            if (r0 == r5) goto L_0x032f
            goto L_0x034d
        L_0x032f:
            java.lang.String r0 = "qos_unmetered_periodic"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x034d
            r0 = 2
            goto L_0x034e
        L_0x0339:
            java.lang.String r0 = "qos_oneoff"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x034d
            r0 = 0
            goto L_0x034e
        L_0x0343:
            java.lang.String r0 = "qos_default_periodic"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x034d
            r0 = 1
            goto L_0x034e
        L_0x034d:
            r0 = -1
        L_0x034e:
            if (r0 == 0) goto L_0x035a
            if (r0 == r14) goto L_0x0358
            if (r0 == r12) goto L_0x0356
            r0 = 1
            goto L_0x035b
        L_0x0356:
            r0 = 6
            goto L_0x035b
        L_0x0358:
            r0 = 5
            goto L_0x035b
        L_0x035a:
            r0 = 4
        L_0x035b:
            boolean r3 = r4.c
            if (r3 != 0) goto L_0x0360
            goto L_0x0365
        L_0x0360:
            r4.c()
            r4.c = r15
        L_0x0365:
            aucj r3 = r4.b
            avrr r3 = (defpackage.avrr) r3
            r5 = -1
            int r0 = r0 + r5
            r3.k = r0
            int r0 = r3.a
            r0 = r0 | 256(0x100, float:3.59E-43)
            r3.a = r0
            avri r0 = defpackage.avri.f
            aucd r3 = r0.o()
            android.content.Context r0 = r1.c
            boolean r0 = defpackage.hwr.a(r0)
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x0384
            goto L_0x0389
        L_0x0384:
            r3.c()
            r3.c = r15
        L_0x0389:
            aucj r5 = r3.b
            avri r5 = (defpackage.avri) r5
            int r6 = r5.a
            r6 = r6 | r14
            r5.a = r6
            r5.b = r0
            android.content.Context r0 = r1.c
            boolean r0 = defpackage.hwr.b(r0)
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x039f
            goto L_0x03a4
        L_0x039f:
            r3.c()
            r3.c = r15
        L_0x03a4:
            aucj r5 = r3.b
            avri r5 = (defpackage.avri) r5
            int r6 = r5.a
            r6 = r6 | r12
            r5.a = r6
            r5.c = r0
            android.content.Context r0 = r1.c
            boolean r0 = defpackage.hwr.c(r0)
            if (r0 != 0) goto L_0x03b9
            r0 = 2
            goto L_0x03ba
        L_0x03b9:
            r0 = 3
        L_0x03ba:
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x03bf
            goto L_0x03c4
        L_0x03bf:
            r3.c()
            r3.c = r15
        L_0x03c4:
            aucj r5 = r3.b
            avri r5 = (defpackage.avri) r5
            r6 = -1
            int r0 = r0 + r6
            r5.d = r0
            int r0 = r5.a
            r6 = 4
            r0 = r0 | r6
            r5.a = r0
            android.content.Context r0 = r1.c
            java.lang.String r5 = r0.getPackageName()
            java.util.List r6 = java.util.Collections.emptyList()
            java.util.List r6 = defpackage.jgu.d(r0, r5)     // Catch:{ SecurityException -> 0x03e1 }
            goto L_0x03e8
        L_0x03e1:
            r0 = move-exception
            r5 = r0
            java.lang.String r0 = "Failed to get accounts."
            android.util.Log.w(r7, r0, r5)
        L_0x03e8:
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x03ed
            goto L_0x03f2
        L_0x03ed:
            r3.c()
            r3.c = r15
        L_0x03f2:
            aucj r0 = r3.b
            avri r0 = (defpackage.avri) r0
            int r5 = r0.a
            r5 = r5 | 8
            r0.a = r5
            r0.e = r15
            java.util.Iterator r0 = r6.iterator()
        L_0x0402:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0436
            java.lang.Object r5 = r0.next()
            android.accounts.Account r5 = (android.accounts.Account) r5
            java.lang.String r6 = r5.name
            if (r6 == 0) goto L_0x0402
            java.lang.String r5 = r5.name
            java.lang.String r5 = r5.toLowerCase()
            java.lang.String r6 = "@google.com"
            boolean r5 = r5.endsWith(r6)
            if (r5 == 0) goto L_0x0402
            boolean r0 = r3.c
            if (r0 != 0) goto L_0x0425
            goto L_0x042a
        L_0x0425:
            r3.c()
            r3.c = r15
        L_0x042a:
            aucj r0 = r3.b
            avri r0 = (defpackage.avri) r0
            int r5 = r0.a
            r5 = r5 | 8
            r0.a = r5
            r0.e = r14
        L_0x0436:
            aucj r0 = r3.i()
            avri r0 = (defpackage.avri) r0
            boolean r3 = r4.c
            if (r3 != 0) goto L_0x0441
            goto L_0x0446
        L_0x0441:
            r4.c()
            r4.c = r15
        L_0x0446:
            aucj r3 = r4.b
            avrr r3 = (defpackage.avrr) r3
            r0.getClass()
            r3.l = r0
            int r0 = r3.a
            r0 = r0 | 512(0x200, float:7.175E-43)
            r3.a = r0
            android.content.Context r0 = r1.c
            com.google.android.gms.clearcut.CollectForDebugParcelable r0 = defpackage.hpo.b(r0)
            avrg r3 = defpackage.avrg.e
            aucd r3 = r3.o()
            long r5 = r0.b
            boolean r7 = r3.c
            if (r7 != 0) goto L_0x0468
            goto L_0x046d
        L_0x0468:
            r3.c()
            r3.c = r15
        L_0x046d:
            aucj r7 = r3.b
            avrg r7 = (defpackage.avrg) r7
            int r8 = r7.a
            r8 = r8 | r14
            r7.a = r8
            r7.b = r5
            long r5 = r0.c
            r8 = r8 | r12
            r7.a = r8
            r7.c = r5
            boolean r0 = r0.a
            r5 = 4
            r5 = r5 | r8
            r7.a = r5
            r7.d = r0
            boolean r0 = r4.c
            if (r0 != 0) goto L_0x048c
            goto L_0x0491
        L_0x048c:
            r4.c()
            r4.c = r15
        L_0x0491:
            aucj r0 = r4.b
            avrr r0 = (defpackage.avrr) r0
            aucj r3 = r3.i()
            avrg r3 = (defpackage.avrg) r3
            r3.getClass()
            r0.o = r3
            int r3 = r0.a
            r3 = r3 | 2048(0x800, float:2.87E-42)
            r0.a = r3
            int r0 = r2.a
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x04c4
            int r0 = r2.n
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x04b3
            goto L_0x04b8
        L_0x04b3:
            r4.c()
            r4.c = r15
        L_0x04b8:
            aucj r2 = r4.b
            avrr r2 = (defpackage.avrr) r2
            int r3 = r2.a
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            r2.a = r3
            r2.p = r0
        L_0x04c4:
            aucj r0 = r4.i()
            avrr r0 = (defpackage.avrr) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwq.a(avtn, java.util.List, java.lang.String):avrr");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.hwq a(defpackage.hvg r9, defpackage.htg r10) {
        /*
            ihs r1 = defpackage.ihs.b()
            defpackage.iva.a((java.lang.Object) r1)
            awtr r0 = defpackage.awtr.a
            awts r0 = r0.a()
            java.lang.String r0 = r0.l()
            int r2 = r0.hashCode()
            r3 = -2106708891(0xffffffff826e2c65, float:-1.7498219E-37)
            r4 = -1
            r5 = 2
            r6 = 1
            if (r2 == r3) goto L_0x003c
            r3 = 1445949657(0x562f70d9, float:4.8224803E13)
            if (r2 == r3) goto L_0x0032
            r3 = 1996312509(0x76fd4fbd, float:2.5688836E33)
            if (r2 == r3) goto L_0x0028
            goto L_0x0046
        L_0x0028:
            java.lang.String r2 = "CRONET"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            r0 = 2
            goto L_0x0047
        L_0x0032:
            java.lang.String r2 = "APACHE_HTTP"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            r0 = 0
            goto L_0x0047
        L_0x003c:
            java.lang.String r2 = "HTTP_URL_CONNECTION"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x0046:
            r0 = -1
        L_0x0047:
            if (r0 == 0) goto L_0x0057
            if (r0 == r6) goto L_0x0055
            if (r0 != r5) goto L_0x004f
            r0 = 3
            goto L_0x0058
        L_0x004f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
        L_0x0055:
            r0 = 2
            goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            int r0 = r0 + r4
            if (r0 == r6) goto L_0x0073
            if (r0 == r5) goto L_0x0068
            hwb r0 = new hwb
            java.lang.String r2 = defpackage.awtr.b()
            r0.<init>(r1, r2, r10)
            r3 = r0
            goto L_0x007d
        L_0x0068:
            hwi r0 = new hwi
            java.lang.String r2 = defpackage.awtr.b()
            r0.<init>(r1, r2, r10)
            r3 = r0
            goto L_0x007d
        L_0x0073:
            hwm r0 = new hwm
            java.lang.String r2 = defpackage.awtr.b()
            r0.<init>(r1, r2, r10)
            r3 = r0
        L_0x007d:
            hwq r8 = new hwq
            hsa r5 = defpackage.hrw.a
            com.google.android.chimera.config.ModuleManager r6 = com.google.android.chimera.config.ModuleManager.get(r1)
            hwp r7 = new hwp
            r7.<init>(r1)
            r0 = r8
            r2 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwq.a(hvg, htg):hwq");
    }

    private static final String a() {
        String o = awtr.a.a().o();
        if (o.isEmpty()) {
            return awtr.a.a().b();
        }
        String valueOf = String.valueOf(o);
        return valueOf.length() == 0 ? new String("oauth2:") : "oauth2:".concat(valueOf);
    }

    private final void a(hwc hwc) {
        int b2 = hwc.b();
        StringBuilder sb = new StringBuilder(34);
        sb.append("Deleting ");
        sb.append(b2);
        sb.append(" LogEventSets.");
        sb.toString();
        this.d.a((Collection) hwc.c);
    }

    private final void a(List list, hry hry) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            hux hux = (hux) list.get(i2);
            String b2 = hwt.b(hux.b);
            if (awtf.f()) {
                hsa hsa = this.f;
                anhk i3 = hux.c.listIterator();
                int i4 = 0;
                while (i3.hasNext()) {
                    i4 += ((huw) i3.next()).c;
                }
                hsa.b(b2, hry, i4);
            } else {
                this.f.b(b2, hry, hux.c.size());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: hwd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v41, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: hwd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v18, resolved type: hwd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: hwd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: hwd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v71, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v72, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0695 A[LOOP:4: B:47:0x01df->B:264:0x0695, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0693 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r28, defpackage.amzy r29) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            java.lang.String r0 = java.lang.String.valueOf(r29)
            java.lang.String r3 = java.lang.String.valueOf(r28)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 32
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r3 = "schedulerTag: "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r3 = ", uploading tier: "
            r5.append(r3)
            r5.append(r0)
            r5.toString()
            hvg r0 = r1.d
            huz r3 = r0.h()
            hvg r0 = r1.d
            r4 = r29
            java.util.Map r0 = r0.a((defpackage.amzy) r4)
            int r4 = r0.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 33
            r5.<init>(r6)
            java.lang.String r6 = "UploadContextMap Size="
            r5.append(r6)
            r5.append(r4)
            r5.toString()
            java.util.Set r4 = r0.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x005f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x009c
            java.lang.Object r5 = r4.next()
            avtn r5 = (defpackage.avtn) r5
            java.lang.Object r6 = r0.get(r5)
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r6.size()
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 56
            r8.<init>(r7)
            java.lang.String r7 = "Upload context="
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = " ,PlayLoggerContext List size="
            r8.append(r5)
            r8.append(r6)
            r8.toString()
            goto L_0x005f
        L_0x009c:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x00a4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x06ba
            java.lang.Object r0 = r4.next()
            r6 = r0
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r0 = r6.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x06b2
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L_0x06aa
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            long r8 = defpackage.awtr.g()
            long r10 = defpackage.awua.c()
            hwc r12 = new hwc
            android.content.Context r13 = r1.c
            r12.<init>(r13)
            java.util.Iterator r0 = r0.iterator()
        L_0x00d7:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x01ca
            java.lang.Object r13 = r0.next()
            hvl r13 = (defpackage.hvl) r13
            java.lang.String r5 = java.lang.String.valueOf(r13)     // Catch:{ IOException -> 0x01bd }
            java.lang.String r16 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x01bd }
            int r16 = r16.length()     // Catch:{ IOException -> 0x01bd }
            int r14 = r16 + 111
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01bd }
            r15.<init>(r14)     // Catch:{ IOException -> 0x01bd }
            java.lang.String r14 = "Read data for PlayLoggerContext="
            r15.append(r14)     // Catch:{ IOException -> 0x01bd }
            r15.append(r5)     // Catch:{ IOException -> 0x01bd }
            java.lang.String r5 = ", remainingSize="
            r15.append(r5)     // Catch:{ IOException -> 0x01bd }
            r15.append(r8)     // Catch:{ IOException -> 0x01bd }
            java.lang.String r5 = ", remainingLogRequests="
            r15.append(r5)     // Catch:{ IOException -> 0x01bd }
            r15.append(r10)     // Catch:{ IOException -> 0x01bd }
            r15.toString()     // Catch:{ IOException -> 0x01bd }
            hux r5 = r3.a(r8, r13)     // Catch:{ IOException -> 0x01bd }
            amzy r14 = r5.c
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x0125
            amzy r14 = r5.d
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x00d7
        L_0x0125:
            avtn r14 = r5.b
            amzy r15 = r5.c
            avrr r14 = r1.a(r14, r15, r2)
            java.util.List r15 = r12.b
            r15.add(r14)
            java.util.List r14 = r12.a
            r14.add(r5)
            java.util.List r14 = r12.c
            r14.add(r5)
            r14 = -1
            long r10 = r10 + r14
            amzy r5 = r5.c
            anhk r5 = r5.listIterator()
            r14 = 0
        L_0x0147:
            boolean r16 = r5.hasNext()
            if (r16 == 0) goto L_0x016a
            java.lang.Object r16 = r5.next()
            r19 = r0
            r0 = r16
            huw r0 = (defpackage.huw) r0
            auay r0 = r0.b
            int r0 = r0.a()
            r16 = r3
            r20 = r4
            long r3 = (long) r0
            long r14 = r14 + r3
            r3 = r16
            r0 = r19
            r4 = r20
            goto L_0x0147
        L_0x016a:
            r19 = r0
            r16 = r3
            r20 = r4
            long r8 = r8 - r14
            r3 = 0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0179
            r0 = 0
            goto L_0x017a
        L_0x0179:
            r0 = 1
        L_0x017a:
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x017f
            goto L_0x0184
        L_0x017f:
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0184
            goto L_0x01b5
        L_0x0184:
            awua r3 = defpackage.awua.a
            awub r3 = r3.a()
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x01ce
            htg r3 = r1.e
            avtn r4 = r13.a
            r3.a((defpackage.avtn) r4, (int) r0)
            boolean r0 = r12.a()
            if (r0 != 0) goto L_0x01a3
            r12.e()
            r7.add(r12)
        L_0x01a3:
            hwc r0 = new hwc
            android.content.Context r3 = r1.c
            r0.<init>(r3)
            long r3 = defpackage.awtr.g()
            long r8 = defpackage.awua.c()
            r12 = r0
            r10 = r8
            r8 = r3
        L_0x01b5:
            r3 = r16
            r0 = r19
            r4 = r20
            goto L_0x00d7
        L_0x01bd:
            r0 = move-exception
            r16 = r3
            r20 = r4
            java.lang.String r3 = "Uploader"
            java.lang.String r4 = "Could not read logs"
            android.util.Log.w(r3, r4, r0)
            goto L_0x01ce
        L_0x01ca:
            r16 = r3
            r20 = r4
        L_0x01ce:
            boolean r0 = r12.a()
            if (r0 != 0) goto L_0x01da
            r12.e()
            r7.add(r12)
        L_0x01da:
            int r3 = r7.size()
            r4 = 0
        L_0x01df:
            if (r4 >= r3) goto L_0x06a2
            java.lang.Object r0 = r7.get(r4)
            r5 = r0
            hwc r5 = (defpackage.hwc) r5
            boolean r0 = defpackage.awsx.c()
            r8 = 0
            if (r0 == 0) goto L_0x0263
            boolean r0 = r5.a()
            if (r0 != 0) goto L_0x0263
            hsa r0 = r1.f
            avqu r0 = r0.c()
            if (r0 == 0) goto L_0x0263
            android.content.Context r9 = r1.c     // Catch:{ IOException -> 0x0254 }
            java.lang.String r10 = "CLEARCUT_FUNNEL"
            hol r11 = new hol     // Catch:{ IOException -> 0x0254 }
            r11.<init>(r9, r10, r8)     // Catch:{ IOException -> 0x0254 }
            byte[] r0 = r0.k()     // Catch:{ IOException -> 0x0254 }
            hoi r0 = r11.a((byte[]) r0)     // Catch:{ IOException -> 0x0254 }
            com.google.android.gms.clearcut.LogEventParcelable r0 = r0.a()     // Catch:{ IOException -> 0x0254 }
            htq r0 = defpackage.htr.a((android.content.Context) r9, (com.google.android.gms.clearcut.LogEventParcelable) r0)     // Catch:{ IOException -> 0x0254 }
            huw r9 = new huw     // Catch:{ IOException -> 0x0254 }
            auay r10 = r0.b     // Catch:{ IOException -> 0x0254 }
            r11 = 1
            r9.<init>(r8, r10, r11)     // Catch:{ IOException -> 0x0254 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ IOException -> 0x0254 }
            r10.<init>()     // Catch:{ IOException -> 0x0254 }
            r10.add(r9)     // Catch:{ IOException -> 0x0254 }
            hux r9 = new hux     // Catch:{ IOException -> 0x0254 }
            avtn r0 = r0.a     // Catch:{ IOException -> 0x0254 }
            r9.<init>(r0, r10)     // Catch:{ IOException -> 0x0254 }
            avtn r0 = r9.b
            java.lang.String r0 = r0.h
            hsa r10 = r1.f
            boolean r0 = r10.a((java.lang.String) r0)
            if (r0 != 0) goto L_0x0240
            hsa r0 = r1.f
            r0.d()
            r11 = 0
            goto L_0x0264
        L_0x0240:
            avtn r0 = r9.b
            amzy r10 = r9.c
            avrr r0 = r1.a(r0, r10, r2)
            java.util.List r10 = r5.b
            r10.add(r0)
            java.util.List r0 = r5.a
            r0.add(r9)
            r11 = 1
            goto L_0x0264
        L_0x0254:
            r0 = move-exception
            java.lang.String r9 = "Uploader"
            java.lang.String r10 = "failed to serialize funnel event"
            android.util.Log.e(r9, r10, r0)
            hsa r0 = r1.f
            r0.d()
            r11 = 0
            goto L_0x0264
        L_0x0263:
            r11 = 0
        L_0x0264:
            java.lang.Object r0 = r6.getKey()
            r9 = r0
            avtn r9 = (defpackage.avtn) r9
            long r12 = android.os.SystemClock.elapsedRealtime()
            boolean r10 = defpackage.awsx.c()
            java.lang.String r0 = r9.e
            boolean r14 = r0.isEmpty()
            if (r14 != 0) goto L_0x0362
            android.content.Context r14 = r1.c
            android.accounts.Account r8 = new android.accounts.Account
            java.lang.String r15 = "com.google"
            r8.<init>(r0, r15)
            boolean r8 = defpackage.jgu.a((android.content.Context) r14, (android.accounts.Account) r8)
            if (r8 == 0) goto L_0x02d3
            android.content.Context r8 = r1.c     // Catch:{ IOException -> 0x02a5, eif -> 0x02a3, SecurityException -> 0x02a1 }
            android.accounts.Account r14 = new android.accounts.Account     // Catch:{ IOException -> 0x02a5, eif -> 0x02a3, SecurityException -> 0x02a1 }
            java.lang.String r15 = "com.google"
            r14.<init>(r0, r15)     // Catch:{ IOException -> 0x02a5, eif -> 0x02a3, SecurityException -> 0x02a1 }
            java.lang.String r0 = a()     // Catch:{ IOException -> 0x02a5, eif -> 0x02a3, SecurityException -> 0x02a1 }
            java.lang.String r0 = defpackage.eig.b((android.content.Context) r8, (android.accounts.Account) r14, (java.lang.String) r0)     // Catch:{ IOException -> 0x02a5, eif -> 0x02a3, SecurityException -> 0x02a1 }
            r22 = r3
            r21 = r6
            goto L_0x0341
        L_0x02a1:
            r0 = move-exception
            goto L_0x02a6
        L_0x02a3:
            r0 = move-exception
            goto L_0x02a6
        L_0x02a5:
            r0 = move-exception
        L_0x02a6:
            htg r8 = r1.e
            r14 = 2
            r15 = 0
            r8.a((int) r14, (java.lang.String) r15)
            java.lang.String r8 = r0.getMessage()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r14 = "Failed to get auth token: "
            int r15 = r8.length()
            if (r15 != 0) goto L_0x02c3
            java.lang.String r8 = new java.lang.String
            r8.<init>(r14)
            goto L_0x02c7
        L_0x02c3:
            java.lang.String r8 = r14.concat(r8)
        L_0x02c7:
            java.lang.String r14 = "Uploader"
            android.util.Log.e(r14, r8, r0)
            r22 = r3
            r21 = r6
            r0 = 0
            goto L_0x0341
        L_0x02d3:
            htg r8 = r1.e
            r14 = 0
            r15 = 1
            r8.a((int) r15, (java.lang.String) r14)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.List r14 = r5.b
            int r15 = r14.size()
            r2 = 0
        L_0x02e6:
            if (r2 >= r15) goto L_0x0315
            java.lang.Object r21 = r14.get(r2)
            r22 = r3
            r3 = r21
            avrr r3 = (defpackage.avrr) r3
            r21 = r6
            java.lang.String r6 = r3.f
            boolean r23 = r6.isEmpty()
            if (r23 == 0) goto L_0x030b
            int r3 = r3.e
            avrp r3 = defpackage.avrp.a(r3)
            if (r3 == 0) goto L_0x0305
            goto L_0x0307
        L_0x0305:
            avrp r3 = defpackage.avrp.UNKNOWN
        L_0x0307:
            java.lang.String r6 = r3.toString()
        L_0x030b:
            r8.add(r6)
            int r2 = r2 + 1
            r6 = r21
            r3 = r22
            goto L_0x02e6
        L_0x0315:
            r22 = r3
            r21 = r6
            java.util.Iterator r2 = r8.iterator()
        L_0x031d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0330
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            htg r6 = r1.e
            r8 = 1
            r6.a((int) r8, (java.lang.String) r3)
            goto L_0x031d
        L_0x0330:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = " no longer exists, so no auth token."
            java.lang.String r0 = r0.concat(r2)
            java.lang.String r2 = "Uploader"
            android.util.Log.w(r2, r0)
            r0 = 0
        L_0x0341:
            if (r0 != 0) goto L_0x0345
            r15 = 0
            goto L_0x034c
        L_0x0345:
            htg r2 = r1.e
            r3 = 0
            r15 = 0
            r2.a((int) r3, (java.lang.String) r15)
        L_0x034c:
            awtr r2 = defpackage.awtr.a
            awts r2 = r2.a()
            boolean r2 = r2.x()
            if (r2 != 0) goto L_0x0359
            goto L_0x0360
        L_0x0359:
            if (r0 != 0) goto L_0x0360
            r11 = 1
            r17 = 0
            goto L_0x068f
        L_0x0360:
            r2 = r0
            goto L_0x0368
        L_0x0362:
            r22 = r3
            r21 = r6
            r15 = r8
            r2 = r15
        L_0x0368:
            long r23 = android.os.SystemClock.elapsedRealtime()
            r0 = 17195007(0x1065fff, float:2.4680787E-38)
            defpackage.izj.b(r0)     // Catch:{ IOException -> 0x03c2 }
            hwe r0 = r1.g     // Catch:{ IOException -> 0x03c2 }
            if (r2 == 0) goto L_0x03ad
            java.lang.String r3 = a()     // Catch:{ IOException -> 0x03c2 }
            if (r3 != 0) goto L_0x037d
            goto L_0x0399
        L_0x037d:
            java.lang.String r6 = "oauth2:"
            boolean r3 = r3.startsWith(r6)     // Catch:{ IOException -> 0x03c2 }
            if (r3 == 0) goto L_0x0399
            java.lang.String r3 = "Bearer "
            int r6 = r2.length()     // Catch:{ IOException -> 0x03c2 }
            if (r6 != 0) goto L_0x0394
            java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x03c2 }
            r6.<init>(r3)     // Catch:{ IOException -> 0x03c2 }
            r3 = r6
            goto L_0x03ae
        L_0x0394:
            java.lang.String r3 = r3.concat(r2)     // Catch:{ IOException -> 0x03c2 }
            goto L_0x03ae
        L_0x0399:
            java.lang.String r3 = "GoogleLogin auth="
            int r6 = r2.length()     // Catch:{ IOException -> 0x03c2 }
            if (r6 != 0) goto L_0x03a8
            java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x03c2 }
            r6.<init>(r3)     // Catch:{ IOException -> 0x03c2 }
            r3 = r6
            goto L_0x03ae
        L_0x03a8:
            java.lang.String r3 = r3.concat(r2)     // Catch:{ IOException -> 0x03c2 }
            goto L_0x03ae
        L_0x03ad:
            r3 = r15
        L_0x03ae:
            agvx r6 = defpackage.hpm.a     // Catch:{ IOException -> 0x03c2 }
            java.lang.Object r6 = r6.c()     // Catch:{ IOException -> 0x03c2 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x03c2 }
            hwd r0 = r0.a(r9, r5, r3, r6)     // Catch:{ IOException -> 0x03c2 }
            defpackage.izj.a()
            r3 = r0
            goto L_0x03e2
        L_0x03bf:
            r0 = move-exception
            goto L_0x069e
        L_0x03c2:
            r0 = move-exception
            r3 = 1
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x03bf }
            long r25 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03bf }
            long r25 = r25 - r23
            java.lang.Long r3 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x03bf }
            r8 = 0
            r6[r8] = r3     // Catch:{ all -> 0x03bf }
            java.lang.String r3 = "Uploader"
            java.lang.String r8 = "Clearcut transport failed to make network request. Use %d milliseconds."
            java.lang.String r6 = java.lang.String.format(r8, r6)     // Catch:{ all -> 0x03bf }
            android.util.Log.e(r3, r6, r0)     // Catch:{ all -> 0x03bf }
            defpackage.izj.a()
            r3 = r15
        L_0x03e2:
            r14 = 4
            if (r3 == 0) goto L_0x057a
            int r0 = r3.b
            r15 = 207(0xcf, float:2.9E-43)
            r23 = 3
            if (r0 == r15) goto L_0x04a2
            r15 = 200(0xc8, float:2.8E-43)
            if (r0 < r15) goto L_0x03fa
            r15 = 300(0x12c, float:4.2E-43)
            if (r0 < r15) goto L_0x03f6
            goto L_0x03fa
        L_0x03f6:
            r23 = 4
            goto L_0x04a5
        L_0x03fa:
            r15 = 400(0x190, float:5.6E-43)
            if (r0 != r15) goto L_0x0419
            java.lang.String r0 = "Uploader"
            java.lang.String r2 = "Server returned 400... deleting local malformed logs"
            android.util.Log.e(r0, r2)
            awsx r0 = defpackage.awsx.a
            awsy r0 = r0.a()
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0415
            r23 = 4
            goto L_0x04a5
        L_0x0415:
            r23 = 7
            goto L_0x04a5
        L_0x0419:
            r15 = 401(0x191, float:5.62E-43)
            if (r0 != r15) goto L_0x042b
            java.lang.String r0 = "Uploader"
            java.lang.String r15 = "Server returned 401... invalidating auth token"
            android.util.Log.w(r0, r15)
            android.content.Context r0 = r1.c
            defpackage.eig.a(r0, r2)
            goto L_0x04a5
        L_0x042b:
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 != r2) goto L_0x0438
            java.lang.String r0 = "Uploader"
            java.lang.String r2 = "Server returned 500... server crashed"
            android.util.Log.w(r0, r2)
            goto L_0x04a5
        L_0x0438:
            r2 = 501(0x1f5, float:7.02E-43)
            if (r0 != r2) goto L_0x0444
            java.lang.String r0 = "Uploader"
            java.lang.String r2 = "Server returned 501... service doesn't seem to exist"
            android.util.Log.w(r0, r2)
            goto L_0x04a5
        L_0x0444:
            r2 = 502(0x1f6, float:7.03E-43)
            if (r0 != r2) goto L_0x0450
            java.lang.String r0 = "Uploader"
            java.lang.String r2 = "Server returned 502... servers are down"
            android.util.Log.w(r0, r2)
            goto L_0x04a5
        L_0x0450:
            r2 = 503(0x1f7, float:7.05E-43)
            if (r0 != r2) goto L_0x045c
            java.lang.String r0 = "Uploader"
            java.lang.String r2 = "Server returned 503... service is unavailable"
            android.util.Log.w(r0, r2)
            goto L_0x04a5
        L_0x045c:
            r2 = 504(0x1f8, float:7.06E-43)
            if (r0 != r2) goto L_0x0468
            java.lang.String r0 = "Uploader"
            java.lang.String r2 = "Server returned 504... timeout"
            android.util.Log.w(r0, r2)
            goto L_0x04a5
        L_0x0468:
            r2 = 507(0x1fb, float:7.1E-43)
            if (r0 == r2) goto L_0x0497
            java.lang.String r2 = r3.c
            java.lang.String r15 = java.lang.String.valueOf(r2)
            int r15 = r15.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r15 = r15 + 51
            r6.<init>(r15)
            java.lang.String r15 = "Unexpected error received from server: "
            r6.append(r15)
            r6.append(r0)
            java.lang.String r0 = " "
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = r6.toString()
            java.lang.String r2 = "Uploader"
            android.util.Log.e(r2, r0)
            goto L_0x04a5
        L_0x0497:
            java.lang.String r0 = "Uploader"
            java.lang.String r2 = "Server returned 507... downstream dependency error"
            android.util.Log.w(r0, r2)
            r23 = 5
            goto L_0x04a5
        L_0x04a2:
            r0 = 6
            r23 = 6
        L_0x04a5:
            awtr r0 = defpackage.awtr.a
            awts r0 = r0.a()
            boolean r0 = r0.i()
            if (r0 != 0) goto L_0x0574
            byte[] r0 = r3.a
            if (r0 == 0) goto L_0x0574
            aubs r2 = defpackage.aubs.c()     // Catch:{ auda -> 0x055d }
            avrs r6 = defpackage.avrs.f     // Catch:{ auda -> 0x055d }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r6, (byte[]) r0, (defpackage.aubs) r2)     // Catch:{ auda -> 0x055d }
            avrs r0 = (defpackage.avrs) r0     // Catch:{ auda -> 0x055d }
            long r2 = r0.b
            r17 = 0
            int r6 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r6 < 0) goto L_0x04f2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r15 = 55
            r6.<init>(r15)
            java.lang.String r15 = "LogResponse: wait time in millis = "
            r6.append(r15)
            r6.append(r2)
            r6.toString()
            hwp r6 = r1.i
            android.content.Context r6 = r6.a
            java.lang.String r15 = "timing_control_pref"
            r8 = 0
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r15, r8)
            android.content.SharedPreferences$Editor r6 = r6.edit()
            java.lang.String r8 = "server_suggested_interval_millis"
            r6.putLong(r8, r2)
            r6.apply()
        L_0x04f2:
            int r2 = r0.a
            r2 = r2 & r14
            if (r2 == 0) goto L_0x0502
            android.content.Context r2 = r1.c
            avsf r3 = r0.c
            if (r3 != 0) goto L_0x04ff
            avsf r3 = defpackage.avsf.c
        L_0x04ff:
            defpackage.hwo.a((android.content.Context) r2, (defpackage.avsf) r3)
        L_0x0502:
            int r2 = r0.a
            r2 = r2 & 8
            if (r2 == 0) goto L_0x055a
            avrw r2 = r0.d
            if (r2 == 0) goto L_0x050d
            goto L_0x050f
        L_0x050d:
            avrw r2 = defpackage.avrw.b
        L_0x050f:
            aucx r2 = r2.a
            java.lang.String r3 = ","
            java.lang.String r2 = android.text.TextUtils.join(r3, r2)
            java.lang.Object r3 = b
            monitor-enter(r3)
            java.lang.String r6 = a     // Catch:{ all -> 0x0557 }
            if (r6 == 0) goto L_0x0529
            java.lang.String r6 = a     // Catch:{ all -> 0x0557 }
            boolean r6 = r2.equals(r6)     // Catch:{ all -> 0x0557 }
            if (r6 != 0) goto L_0x0527
            goto L_0x0529
        L_0x0527:
            monitor-exit(r3)     // Catch:{ all -> 0x0557 }
            goto L_0x055a
        L_0x0529:
            android.content.Context r6 = r1.c     // Catch:{ all -> 0x0557 }
            java.lang.String r8 = "LogStoreUtil"
            r15 = 0
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r8, r15)     // Catch:{ all -> 0x0557 }
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ all -> 0x0557 }
            java.lang.String r8 = "log_source_batching_blacklist"
            r6.putString(r8, r2)     // Catch:{ all -> 0x0557 }
            r6.apply()     // Catch:{ all -> 0x0557 }
            java.lang.String r6 = "Set log source batching blacklist - "
            java.lang.String r8 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0557 }
            int r15 = r8.length()     // Catch:{ all -> 0x0557 }
            if (r15 != 0) goto L_0x0550
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x0557 }
            r8.<init>(r6)     // Catch:{ all -> 0x0557 }
            goto L_0x0553
        L_0x0550:
            r6.concat(r8)     // Catch:{ all -> 0x0557 }
        L_0x0553:
            a = r2     // Catch:{ all -> 0x0557 }
            monitor-exit(r3)     // Catch:{ all -> 0x0557 }
            goto L_0x055b
        L_0x0557:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0557 }
            throw r0
        L_0x055a:
        L_0x055b:
            r8 = r0
            goto L_0x0571
        L_0x055d:
            r0 = move-exception
            r17 = 0
            htg r2 = r1.e
            int r6 = r3.b
            byte[] r3 = r3.a
            r2.a((int) r6, (byte[]) r3)
            java.lang.String r2 = "Uploader"
            java.lang.String r3 = "Error parsing log response content."
            android.util.Log.e(r2, r3, r0)
            r8 = 0
        L_0x0571:
            r0 = r23
            goto L_0x057e
        L_0x0574:
            r17 = 0
            r0 = r23
            r8 = 0
            goto L_0x057e
        L_0x057a:
            r17 = 0
            r0 = 2
            r8 = 0
        L_0x057e:
            htg r2 = r1.e
            r2.b((defpackage.avtn) r9, (int) r0)
            int r2 = r0 + -1
            r3 = 1
            if (r2 == r3) goto L_0x068e
            r3 = 2
            if (r2 == r3) goto L_0x068e
            if (r2 == r14) goto L_0x068c
            r3 = 5
            if (r2 == r3) goto L_0x05b9
            htg r2 = r1.e
            long r14 = r5.c()
            long r14 = r14 - r12
            r2.c(r9, r14)
            r1.a(r5)
            if (r10 != 0) goto L_0x05a2
            r11 = 1
            goto L_0x068f
        L_0x05a2:
            if (r11 == 0) goto L_0x05a9
            hsa r2 = r1.f
            r2.d()
        L_0x05a9:
            r2 = 7
            if (r0 != r2) goto L_0x05af
            hry r0 = defpackage.hry.DROPS_BY_BAD_REQUEST
            goto L_0x05b1
        L_0x05af:
            hry r0 = defpackage.hry.EVENTS_UPLOADED
        L_0x05b1:
            java.util.List r2 = r5.c
            r1.a((java.util.List) r2, (defpackage.hry) r0)
            r11 = 1
            goto L_0x068f
        L_0x05b9:
            htg r0 = r1.e
            long r2 = r5.c()
            long r2 = r2 - r12
            r0.c(r9, r2)
            if (r8 == 0) goto L_0x067c
            aucx r0 = r8.e
            int r0 = r0.size()
            if (r0 > 0) goto L_0x05cf
            goto L_0x067c
        L_0x05cf:
            anav r0 = new anav
            r0.<init>()
            aucx r2 = r8.e
            int r3 = r2.size()
            r6 = 0
        L_0x05db:
            if (r6 < r3) goto L_0x0657
            anax r0 = r0.a()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
        L_0x05e7:
            int r6 = r5.b()
            if (r3 >= r6) goto L_0x061b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L_0x05f8
            goto L_0x0618
        L_0x05f8:
            if (r10 == 0) goto L_0x0611
            hux r6 = r5.a(r3)
            avtn r6 = r6.b
            java.lang.String r6 = r6.i
            java.lang.String r8 = "CLEARCUT_FUNNEL"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x060b
            goto L_0x0611
        L_0x060b:
            hsa r6 = r1.f
            r6.d()
            goto L_0x0618
        L_0x0611:
            hux r6 = r5.a(r3)
            r2.add(r6)
        L_0x0618:
            int r3 = r3 + 1
            goto L_0x05e7
        L_0x061b:
            int r0 = r2.size()
            int r3 = r5.b()
            int r5 = r2.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 110(0x6e, float:1.54E-43)
            r6.<init>(r8)
            java.lang.String r8 = "After partial failure (207), deleting "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r0 = " LogEventSets, and will later retry "
            r6.append(r0)
            int r3 = r3 - r5
            r6.append(r3)
            java.lang.String r0 = " LogEventSets."
            r6.append(r0)
            r6.toString()
            hvg r0 = r1.d
            r0.a((java.util.Collection) r2)
            if (r10 == 0) goto L_0x0654
            hry r0 = defpackage.hry.EVENTS_UPLOADED
            r1.a((java.util.List) r2, (defpackage.hry) r0)
            goto L_0x0655
        L_0x0654:
        L_0x0655:
            r11 = 1
            goto L_0x068f
        L_0x0657:
            java.lang.Object r8 = r2.get(r6)
            avrv r8 = (defpackage.avrv) r8
            int r9 = r8.a
            if (r9 < 0) goto L_0x0677
            int r9 = r8.b
            int r9 = defpackage.avru.a(r9)
            r11 = 2
            if (r9 != 0) goto L_0x066b
            goto L_0x0678
        L_0x066b:
            if (r9 != r11) goto L_0x0678
            int r8 = r8.a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0.b(r8)
            goto L_0x0678
        L_0x0677:
            r11 = 2
        L_0x0678:
            int r6 = r6 + 1
            goto L_0x05db
        L_0x067c:
            r1.a(r5)
            if (r10 == 0) goto L_0x0689
            java.util.List r0 = r5.c
            hry r2 = defpackage.hry.DROPS_BY_PARTIAL_FAILURE_WITHOUT_STATUS
            r1.a((java.util.List) r0, (defpackage.hry) r2)
            goto L_0x068a
        L_0x0689:
        L_0x068a:
            r11 = 1
            goto L_0x068f
        L_0x068c:
            r11 = 1
            goto L_0x068f
        L_0x068e:
            r11 = 0
        L_0x068f:
            int r4 = r4 + 1
            if (r11 != 0) goto L_0x0695
            r2 = 0
            return r2
        L_0x0695:
            r2 = 0
            r2 = r28
            r6 = r21
            r3 = r22
            goto L_0x01df
        L_0x069e:
            defpackage.izj.a()
            throw r0
        L_0x06a2:
            r2 = r28
            r3 = r16
            r4 = r20
            goto L_0x00a4
        L_0x06aa:
            r16 = r3
            r20 = r4
            r2 = r28
            goto L_0x00a4
        L_0x06b2:
            r16 = r3
            r20 = r4
            r2 = r28
            goto L_0x00a4
        L_0x06ba:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwq.a(java.lang.String, amzy):boolean");
    }
}
