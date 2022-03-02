package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;

/* renamed from: aarn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aarn extends nis {
    private static final String a;
    private final zzw b;
    private final byte[] c;
    private final String d;
    private final String e;

    static {
        aarn.class.getSimpleName();
        StringBuilder sb = new StringBuilder(21);
        sb.append("SafetyNet/201216073");
        a = sb.toString();
    }

    public aarn(zzw zzw, byte[] bArr, String str, String str2) {
        super(45, "attest");
        this.b = zzw;
        this.c = bArr;
        this.d = str;
        this.e = str2;
    }

    /* JADX WARNING: type inference failed for: r0v68, types: [aucj] */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0650, code lost:
        if (r3 == null) goto L_0x068b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0685, code lost:
        if (r3 == null) goto L_0x068b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0688, code lost:
        defpackage.jlk.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x068b, code lost:
        defpackage.izj.a();
        r5 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0385 A[Catch:{ Exception -> 0x0389 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03b6 A[LOOP:8: B:188:0x03b4->B:189:0x03b6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0659 A[SYNTHETIC, Splitter:B:290:0x0659] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x066d A[SYNTHETIC, Splitter:B:300:0x066d] */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x0674  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0680 A[SYNTHETIC, Splitter:B:310:0x0680] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x06b9  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x06c6  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x06fc  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0734 A[LOOP:11: B:348:0x072e->B:350:0x0734, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0751  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x077a  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x035a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r31) {
        /*
            r30 = this;
            r1 = r30
            r2 = r31
            r3 = 0
            if (r2 != 0) goto L_0x000f
            zzw r0 = r1.b
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.c
            r0.a((com.google.android.gms.common.api.Status) r2, (com.google.android.gms.safetynet.AttestationData) r3)
            return
        L_0x000f:
            byte[] r0 = r1.c
            r4 = 10
            if (r0 == 0) goto L_0x07a4
            aarq r5 = new aarq
            r5.<init>(r2)
            java.lang.String r0 = r1.d
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r7 = ","
            java.lang.String r8 = "snet_attestation_request_times_ms_"
            if (r6 == 0) goto L_0x002d
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r6 = r0
            goto L_0x009b
        L_0x002d:
            boolean r6 = defpackage.azfv.q()
            java.lang.String r9 = ""
            if (r6 == 0) goto L_0x0050
            android.content.SharedPreferences r6 = r5.b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r10 = r0.length()
            if (r10 != 0) goto L_0x0047
            java.lang.String r0 = new java.lang.String
            r0.<init>(r8)
            goto L_0x004b
        L_0x0047:
            java.lang.String r0 = r8.concat(r0)
        L_0x004b:
            java.lang.String r0 = r6.getString(r0, r9)
            goto L_0x006a
        L_0x0050:
            android.content.SharedPreferences r6 = r5.a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r10 = r0.length()
            if (r10 != 0) goto L_0x0062
            java.lang.String r0 = new java.lang.String
            r0.<init>(r8)
            goto L_0x0066
        L_0x0062:
            java.lang.String r0 = r8.concat(r0)
        L_0x0066:
            java.lang.String r0 = r6.getString(r0, r9)
        L_0x006a:
            amsk r6 = defpackage.amsk.a((java.lang.String) r7)
            java.lang.Iterable r0 = r6.a((java.lang.CharSequence) r0)
            java.util.ArrayDeque r6 = new java.util.ArrayDeque
            r6.<init>()
            java.util.Iterator r9 = r0.iterator()
        L_0x007c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r9.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0, r4)     // Catch:{ NumberFormatException -> 0x0098 }
            long r10 = r0.longValue()     // Catch:{ NumberFormatException -> 0x0098 }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ NumberFormatException -> 0x0098 }
            r6.add(r0)     // Catch:{ NumberFormatException -> 0x0098 }
            goto L_0x007c
        L_0x0098:
            r0 = move-exception
            goto L_0x007c
        L_0x009a:
        L_0x009b:
            long r9 = java.lang.System.currentTimeMillis()
        L_0x009f:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x00c3
            java.lang.Object r0 = r6.peek()
            java.lang.Long r0 = (java.lang.Long) r0
            long r11 = r0.longValue()
            int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x00bf
            long r11 = r0.longValue()
            r13 = 120000(0x1d4c0, double:5.9288E-319)
            long r11 = r11 + r13
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c3
        L_0x00bf:
            r6.remove()
            goto L_0x009f
        L_0x00c3:
            int r0 = r6.size()
            if (r0 < r4) goto L_0x00d6
            aarm r0 = new aarm
            r0.<init>()
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.e
            r0.b = r2
            r0.c = r3
            goto L_0x079a
        L_0x00d6:
            com.google.android.gms.common.api.Status r11 = com.google.android.gms.common.api.Status.a
            aarg r0 = defpackage.aarg.k
            aucd r12 = r0.o()
            byte[] r0 = r1.c
            auay r0 = defpackage.auay.a((byte[]) r0)
            boolean r13 = r12.c
            r14 = 0
            if (r13 == 0) goto L_0x00ee
            r12.c()
            r12.c = r14
        L_0x00ee:
            aucj r13 = r12.b
            aarg r13 = (defpackage.aarg) r13
            r0.getClass()
            int r15 = r13.a
            r3 = 1
            r15 = r15 | r3
            r13.a = r15
            r13.b = r0
            r15 = r5
            long r4 = java.lang.System.currentTimeMillis()
            boolean r0 = r12.c
            if (r0 != 0) goto L_0x0107
            goto L_0x010c
        L_0x0107:
            r12.c()
            r12.c = r14
        L_0x010c:
            aucj r0 = r12.b
            aarg r0 = (defpackage.aarg) r0
            int r13 = r0.a
            r13 = r13 | 32
            r0.a = r13
            r0.i = r4
            java.lang.String r4 = r1.d
            if (r4 == 0) goto L_0x0125
            r4.getClass()
            r5 = r13 | 2
            r0.a = r5
            r0.c = r4
        L_0x0125:
            aanm r0 = new aanm
            r0.<init>(r2)
            java.lang.String r4 = r1.d
            aanl r0 = r0.a(r4)
            if (r0 == 0) goto L_0x0486
            byte[] r5 = r0.a
            if (r5 == 0) goto L_0x0153
            auay r5 = defpackage.auay.a((byte[]) r5)
            boolean r13 = r12.c
            if (r13 != 0) goto L_0x013f
            goto L_0x0144
        L_0x013f:
            r12.c()
            r12.c = r14
        L_0x0144:
            aucj r13 = r12.b
            aarg r13 = (defpackage.aarg) r13
            r5.getClass()
            int r4 = r13.a
            r4 = r4 | 4
            r13.a = r4
            r13.e = r5
        L_0x0153:
            byte[][] r4 = r0.b
            if (r4 == 0) goto L_0x018e
            int r4 = r4.length
            r5 = 0
        L_0x0159:
            if (r5 >= r4) goto L_0x018e
            byte[][] r13 = r0.b
            r13 = r13[r5]
            auay r13 = defpackage.auay.a((byte[]) r13)
            boolean r3 = r12.c
            if (r3 != 0) goto L_0x0168
            goto L_0x016d
        L_0x0168:
            r12.c()
            r12.c = r14
        L_0x016d:
            aucj r3 = r12.b
            aarg r3 = (defpackage.aarg) r3
            r13.getClass()
            aucx r14 = r3.d
            boolean r14 = r14.a()
            if (r14 != 0) goto L_0x0184
            aucx r14 = r3.d
            aucx r14 = defpackage.aucj.a((defpackage.aucx) r14)
            r3.d = r14
        L_0x0184:
            aucx r3 = r3.d
            r3.add(r13)
            int r5 = r5 + 1
            r3 = 1
            r14 = 0
            goto L_0x0159
        L_0x018e:
            boolean r0 = r12.c
            if (r0 != 0) goto L_0x0193
            goto L_0x0199
        L_0x0193:
            r12.c()
            r3 = 0
            r12.c = r3
        L_0x0199:
            aucj r0 = r12.b
            aarg r0 = (defpackage.aarg) r0
            int r3 = r0.a
            r3 = r3 | 8
            r0.a = r3
            r3 = 201216073(0xbfe5049, float:9.795804E-32)
            r0.f = r3
            boolean r0 = defpackage.jix.a((android.content.Context) r31)
            boolean r3 = r12.c
            if (r3 != 0) goto L_0x01b1
            goto L_0x01b7
        L_0x01b1:
            r12.c()
            r3 = 0
            r12.c = r3
        L_0x01b7:
            aucj r3 = r12.b
            aarg r3 = (defpackage.aarg) r3
            int r4 = r3.a
            r4 = r4 | 64
            r3.a = r4
            r3.j = r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r0 = defpackage.aash.a()
            int r4 = r0.size()
            r5 = 0
        L_0x01d1:
            if (r5 < r4) goto L_0x045c
            aawp r0 = defpackage.aawq.a()
            aark r4 = defpackage.aark.d
            aucd r4 = r4.o()
            boolean r5 = r0.a
            boolean r13 = r4.c
            if (r13 != 0) goto L_0x01e4
            goto L_0x01ea
        L_0x01e4:
            r4.c()
            r13 = 0
            r4.c = r13
        L_0x01ea:
            aucj r13 = r4.b
            aark r13 = (defpackage.aark) r13
            int r14 = r13.a
            r17 = 1
            r14 = r14 | 1
            r13.a = r14
            r13.b = r5
            boolean r5 = r0.b
            r14 = r14 | 2
            r13.a = r14
            r13.c = r5
            aucj r4 = r4.i()
            aark r4 = (defpackage.aark) r4
            boolean r5 = r12.c
            if (r5 != 0) goto L_0x020b
            goto L_0x0211
        L_0x020b:
            r12.c()
            r5 = 0
            r12.c = r5
        L_0x0211:
            aucj r5 = r12.b
            aarg r5 = (defpackage.aarg) r5
            r4.getClass()
            r5.h = r4
            int r4 = r5.a
            r4 = r4 | 16
            r5.a = r4
            aasg r4 = new aasg
            r4.<init>()
            boolean r5 = r0.b
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            boolean r0 = r4.g
            if (r0 == 0) goto L_0x03a3
            java.lang.String[] r14 = defpackage.aasg.a     // Catch:{ Exception -> 0x0395 }
            r18 = r11
            int r11 = r14.length     // Catch:{ Exception -> 0x038b }
            r19 = r15
            r15 = 0
        L_0x0238:
            if (r15 >= r11) goto L_0x031e
            r0 = r14[r15]     // Catch:{ Exception -> 0x0313 }
            r20 = r11
            java.io.File r11 = new java.io.File     // Catch:{ Exception -> 0x0313 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0313 }
            r21 = r14
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ Exception -> 0x0313 }
            r14.<init>()     // Catch:{ Exception -> 0x0313 }
            boolean r0 = r11.exists()     // Catch:{ Exception -> 0x0313 }
            if (r0 == 0) goto L_0x02f8
            boolean r0 = r11.isDirectory()     // Catch:{ Exception -> 0x0313 }
            if (r0 == 0) goto L_0x02f8
            java.io.File[] r11 = r11.listFiles()     // Catch:{ Exception -> 0x0313 }
            if (r11 == 0) goto L_0x02ef
            r22 = r8
            int r8 = r11.length     // Catch:{ Exception -> 0x02e9 }
            r23 = r7
            r7 = 0
        L_0x0262:
            if (r7 >= r8) goto L_0x02e6
            r0 = r11[r7]     // Catch:{ Exception -> 0x02e2 }
            java.lang.String r24 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x02e2 }
            r25 = r8
            java.lang.reflect.Method r8 = r4.c     // Catch:{ IllegalAccessException -> 0x02d0, IllegalArgumentException -> 0x02ce, InvocationTargetException -> 0x02b2 }
            r26 = r11
            java.lang.Object r11 = r4.b     // Catch:{ IllegalAccessException -> 0x02ac, IllegalArgumentException -> 0x02aa, InvocationTargetException -> 0x02a4 }
            r27 = r6
            r28 = r9
            r6 = 1
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException -> 0x02a2, IllegalArgumentException -> 0x02a0, InvocationTargetException -> 0x029e }
            r6 = 0
            r9[r6] = r24     // Catch:{ IllegalAccessException -> 0x02a2, IllegalArgumentException -> 0x02a0, InvocationTargetException -> 0x029e }
            java.lang.Object r6 = r8.invoke(r11, r9)     // Catch:{ IllegalAccessException -> 0x02a2, IllegalArgumentException -> 0x02a0, InvocationTargetException -> 0x029e }
            if (r6 == 0) goto L_0x02d7
            java.lang.reflect.Field r8 = r4.e     // Catch:{ IllegalAccessException -> 0x02a2, IllegalArgumentException -> 0x02a0, InvocationTargetException -> 0x029e }
            int r8 = r8.getInt(r6)     // Catch:{ IllegalAccessException -> 0x02a2, IllegalArgumentException -> 0x02a0, InvocationTargetException -> 0x029e }
            java.lang.reflect.Field r9 = r4.d     // Catch:{ IllegalAccessException -> 0x02a2, IllegalArgumentException -> 0x02a0, InvocationTargetException -> 0x029e }
            int r6 = r9.getInt(r6)     // Catch:{ IllegalAccessException -> 0x02a2, IllegalArgumentException -> 0x02a0, InvocationTargetException -> 0x029e }
            int r9 = r4.f     // Catch:{ IllegalAccessException -> 0x02a2, IllegalArgumentException -> 0x02a0, InvocationTargetException -> 0x029e }
            r6 = r6 & r9
            if (r6 != 0) goto L_0x0294
        L_0x0293:
            goto L_0x02d7
        L_0x0294:
            if (r8 != 0) goto L_0x0293
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x0389 }
            r14.add(r0)     // Catch:{ Exception -> 0x0389 }
            goto L_0x02d7
        L_0x029e:
            r0 = move-exception
            goto L_0x02b9
        L_0x02a0:
            r0 = move-exception
            goto L_0x02d7
        L_0x02a2:
            r0 = move-exception
            goto L_0x02d7
        L_0x02a4:
            r0 = move-exception
            r27 = r6
            r28 = r9
            goto L_0x02b9
        L_0x02aa:
            r0 = move-exception
            goto L_0x02ad
        L_0x02ac:
            r0 = move-exception
        L_0x02ad:
            r27 = r6
            r28 = r9
            goto L_0x02d7
        L_0x02b2:
            r0 = move-exception
            r27 = r6
            r28 = r9
            r26 = r11
        L_0x02b9:
            int r0 = r4.h     // Catch:{ Exception -> 0x0389 }
            r6 = 35
            if (r0 <= r6) goto L_0x02c0
            goto L_0x02c7
        L_0x02c0:
            r8 = 35
            java.lang.Thread.sleep(r8)     // Catch:{ InterruptedException -> 0x02c6 }
            goto L_0x02c7
        L_0x02c6:
            r0 = move-exception
        L_0x02c7:
            int r0 = r4.h     // Catch:{ Exception -> 0x0389 }
            r6 = 1
            int r0 = r0 + r6
            r4.h = r0     // Catch:{ Exception -> 0x0389 }
            goto L_0x02d7
        L_0x02ce:
            r0 = move-exception
            goto L_0x02d1
        L_0x02d0:
            r0 = move-exception
        L_0x02d1:
            r27 = r6
            r28 = r9
            r26 = r11
        L_0x02d7:
            int r7 = r7 + 1
            r8 = r25
            r11 = r26
            r6 = r27
            r9 = r28
            goto L_0x0262
        L_0x02e2:
            r0 = move-exception
            r27 = r6
            goto L_0x031a
        L_0x02e6:
            r27 = r6
            goto L_0x02f5
        L_0x02e9:
            r0 = move-exception
            r27 = r6
            r23 = r7
            goto L_0x031a
        L_0x02ef:
            r27 = r6
            r23 = r7
            r22 = r8
        L_0x02f5:
            r28 = r9
            goto L_0x0300
        L_0x02f8:
            r27 = r6
            r23 = r7
            r22 = r8
            r28 = r9
        L_0x0300:
            r13.addAll(r14)     // Catch:{ Exception -> 0x0389 }
            int r15 = r15 + 1
            r11 = r20
            r14 = r21
            r8 = r22
            r7 = r23
            r6 = r27
            r9 = r28
            goto L_0x0238
        L_0x0313:
            r0 = move-exception
            r27 = r6
            r23 = r7
            r22 = r8
        L_0x031a:
            r28 = r9
            goto L_0x03af
        L_0x031e:
            r27 = r6
            r23 = r7
            r22 = r8
            r28 = r9
            if (r5 != 0) goto L_0x032a
            goto L_0x03af
        L_0x032a:
            boolean r0 = r13.isEmpty()     // Catch:{ Exception -> 0x0389 }
            if (r0 == 0) goto L_0x03af
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x0389 }
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0389 }
            r5 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0389 }
            r5 = 0
            r6[r5] = r7     // Catch:{ Exception -> 0x0389 }
            java.lang.String r5 = "logcat -t %d"
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch:{ Exception -> 0x0389 }
            java.lang.Process r0 = r0.exec(r5)     // Catch:{ Exception -> 0x0389 }
            if (r0 == 0) goto L_0x03af
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0389 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0389 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ Exception -> 0x0389 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0389 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0389 }
        L_0x035a:
            java.lang.String r0 = r5.readLine()     // Catch:{ Exception -> 0x0389 }
            if (r0 == 0) goto L_0x03af
            java.util.regex.Pattern r6 = r4.i     // Catch:{ Exception -> 0x0389 }
            java.util.regex.Matcher r0 = r6.matcher(r0)     // Catch:{ Exception -> 0x0389 }
            boolean r6 = r0.matches()     // Catch:{ Exception -> 0x0389 }
            if (r6 == 0) goto L_0x0382
            r6 = 1
            java.lang.String r0 = r0.group(r6)     // Catch:{ Exception -> 0x0389 }
            java.lang.String[] r6 = defpackage.aasg.a     // Catch:{ Exception -> 0x0389 }
            int r7 = r6.length     // Catch:{ Exception -> 0x0389 }
            r8 = 0
        L_0x0375:
            if (r8 >= r7) goto L_0x0382
            r9 = r6[r8]     // Catch:{ Exception -> 0x0389 }
            boolean r9 = r0.startsWith(r9)     // Catch:{ Exception -> 0x0389 }
            if (r9 != 0) goto L_0x0383
            int r8 = r8 + 1
            goto L_0x0375
        L_0x0382:
            r0 = 0
        L_0x0383:
            if (r0 == 0) goto L_0x035a
            r13.add(r0)     // Catch:{ Exception -> 0x0389 }
            goto L_0x035a
        L_0x0389:
            r0 = move-exception
            goto L_0x03af
        L_0x038b:
            r0 = move-exception
            r27 = r6
            r23 = r7
            r22 = r8
            r28 = r9
            goto L_0x03a0
        L_0x0395:
            r0 = move-exception
            r27 = r6
            r23 = r7
            r22 = r8
            r28 = r9
            r18 = r11
        L_0x03a0:
            r19 = r15
            goto L_0x03af
        L_0x03a3:
            r27 = r6
            r23 = r7
            r22 = r8
            r28 = r9
            r18 = r11
            r19 = r15
        L_0x03af:
            int r0 = r13.size()
            r4 = 0
        L_0x03b4:
            if (r4 >= r0) goto L_0x03c9
            java.lang.Object r5 = r13.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            aasf r6 = new aasf
            r6.<init>()
            r6.a = r5
            r3.add(r6)
            int r4 = r4 + 1
            goto L_0x03b4
        L_0x03c9:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0455
            r3.size()
            int r0 = r3.size()
            r4 = 0
        L_0x03d7:
            if (r4 >= r0) goto L_0x0455
            java.lang.Object r5 = r3.get(r4)
            aasf r5 = (defpackage.aasf) r5
            aarl r6 = defpackage.aarl.d
            aucd r6 = r6.o()
            java.lang.String r7 = r5.a
            if (r7 == 0) goto L_0x0403
            boolean r8 = r6.c
            if (r8 != 0) goto L_0x03ee
            goto L_0x03f4
        L_0x03ee:
            r6.c()
            r8 = 0
            r6.c = r8
        L_0x03f4:
            aucj r8 = r6.b
            aarl r8 = (defpackage.aarl) r8
            r7.getClass()
            int r9 = r8.a
            r10 = 1
            r9 = r9 | r10
            r8.a = r9
            r8.b = r7
        L_0x0403:
            byte[] r5 = r5.c
            if (r5 == 0) goto L_0x0425
            auay r5 = defpackage.auay.a((byte[]) r5)
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x0410
            goto L_0x0416
        L_0x0410:
            r6.c()
            r7 = 0
            r6.c = r7
        L_0x0416:
            aucj r7 = r6.b
            aarl r7 = (defpackage.aarl) r7
            r5.getClass()
            int r8 = r7.a
            r8 = r8 | 2
            r7.a = r8
            r7.c = r5
        L_0x0425:
            boolean r5 = r12.c
            if (r5 != 0) goto L_0x042a
            goto L_0x0430
        L_0x042a:
            r12.c()
            r5 = 0
            r12.c = r5
        L_0x0430:
            aucj r5 = r12.b
            aarg r5 = (defpackage.aarg) r5
            aucj r6 = r6.i()
            aarl r6 = (defpackage.aarl) r6
            r6.getClass()
            aucx r7 = r5.g
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x044d
            aucx r7 = r5.g
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)
            r5.g = r7
        L_0x044d:
            aucx r5 = r5.g
            r5.add(r6)
            int r4 = r4 + 1
            goto L_0x03d7
        L_0x0455:
            aucj r0 = r12.i()
            aarg r0 = (defpackage.aarg) r0
            goto L_0x0493
        L_0x045c:
            r27 = r6
            r23 = r7
            r22 = r8
            r28 = r9
            r18 = r11
            r19 = r15
            java.lang.Object r6 = r0.get(r5)
            aasf r6 = (defpackage.aasf) r6
            boolean r7 = r6.b
            if (r7 != 0) goto L_0x0473
            goto L_0x0476
        L_0x0473:
            r3.add(r6)
        L_0x0476:
            int r5 = r5 + 1
            r11 = r18
            r15 = r19
            r8 = r22
            r7 = r23
            r6 = r27
            r9 = r28
            goto L_0x01d1
        L_0x0486:
            r27 = r6
            r23 = r7
            r22 = r8
            r28 = r9
            r18 = r11
            r19 = r15
            r0 = 0
        L_0x0493:
            aarh r3 = defpackage.aarh.d
            aucd r3 = r3.o()
            if (r0 == 0) goto L_0x04b9
            auay r0 = r0.au()
            boolean r4 = r3.c
            if (r4 != 0) goto L_0x04a4
            goto L_0x04aa
        L_0x04a4:
            r3.c()
            r4 = 0
            r3.c = r4
        L_0x04aa:
            aucj r4 = r3.b
            aarh r4 = (defpackage.aarh) r4
            r0.getClass()
            int r5 = r4.a
            r6 = 1
            r5 = r5 | r6
            r4.a = r5
            r4.b = r0
        L_0x04b9:
            aarm r4 = new aarm
            r4.<init>()
            r5 = 0
            r4.a = r5
            aucj r0 = r3.b
            aarh r0 = (defpackage.aarh) r0
            int r5 = r0.a
            r6 = 1
            r5 = r5 & r6
            r6 = -1
            if (r5 == 0) goto L_0x06b9
            auay r0 = r0.b
            byte[] r0 = r0.k()
            java.util.Map r0 = defpackage.aann.a((byte[]) r0)
            if (r0 == 0) goto L_0x06b9
            java.lang.String r5 = "attest"
            java.lang.String r0 = defpackage.lxz.a((android.content.Context) r2, (java.lang.String) r5, (java.util.Map) r0)
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x04e3
            goto L_0x04e9
        L_0x04e3:
            r3.c()
            r5 = 0
            r3.c = r5
        L_0x04e9:
            aucj r5 = r3.b
            aarh r5 = (defpackage.aarh) r5
            r0.getClass()
            int r7 = r5.a
            r7 = r7 | 2
            r5.a = r7
            r5.c = r0
            java.lang.String r0 = r5.c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x06b5
            aucj r0 = r3.i()
            aarh r0 = (defpackage.aarh) r0
            r3 = 6146(0x1802, float:8.612E-42)
            defpackage.izj.b(r3)
            java.lang.String r5 = r1.e     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            if (r5 != 0) goto L_0x0516
            java.lang.String r5 = r1.e     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            goto L_0x0518
        L_0x0516:
            java.lang.String r5 = "AIzaSyDqVnJBjE5ymo--oBJt3On7HQx9xNm1RHA"
        L_0x0518:
            java.lang.String r7 = "https://www.googleapis.com/androidcheck/v1/attestations/attest?alt=PROTO&key="
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            int r8 = r5.length()     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            if (r8 != 0) goto L_0x052a
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            r5.<init>(r7)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            goto L_0x052e
        L_0x052a:
            java.lang.String r5 = r7.concat(r5)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
        L_0x052e:
            java.lang.String r7 = a     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            java.lang.String r8 = android.os.Build.DEVICE     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            java.lang.String r9 = android.os.Build.ID     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            java.lang.String r10 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            int r10 = r10.length()     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            r11 = 10
            int r10 = r10 + r11
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            int r11 = r11.length()     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            int r10 = r10 + r11
            java.lang.String r11 = java.lang.String.valueOf(r9)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            int r11 = r11.length()     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            int r10 = r10 + r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            r11.<init>(r10)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            r11.append(r7)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            java.lang.String r7 = " ("
            r11.append(r7)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            r11.append(r8)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            java.lang.String r7 = " "
            r11.append(r7)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            r11.append(r9)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            java.lang.String r7 = "); gzip"
            r11.append(r7)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            java.lang.String r7 = r11.toString()     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            java.net.URL r8 = new java.net.URL     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            r8.<init>(r5)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            boolean r5 = defpackage.azfv.f()     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            if (r5 != 0) goto L_0x0584
            java.net.URLConnection r3 = defpackage.jlk.a(r8, r3)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            goto L_0x059c
        L_0x0584:
            r3 = 6148(0x1804, float:8.615E-42)
            defpackage.izj.b(r3)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            com.google.android.gms.net.PlayServicesCronetProvider r3 = new com.google.android.gms.net.PlayServicesCronetProvider     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            org.chromium.net.CronetEngine$Builder r3 = r3.createBuilder()     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            org.chromium.net.CronetEngine r3 = r3.build()     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            java.net.URLConnection r3 = r3.openConnection(r8)     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x067b, all -> 0x0666 }
        L_0x059c:
            azfv r5 = defpackage.azfv.a     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            azfw r5 = r5.a()     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            boolean r5 = r5.a()     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            if (r5 != 0) goto L_0x05a9
            goto L_0x05bb
        L_0x05a9:
            java.lang.String r5 = r1.d     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            java.lang.String r2 = defpackage.jhg.h(r2, r5)     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            java.lang.String r5 = "X-Android-Package"
            java.lang.String r8 = r1.d     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            r3.setRequestProperty(r5, r8)     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            java.lang.String r5 = "X-Android-Cert"
            r3.setRequestProperty(r5, r2)     // Catch:{ IOException -> 0x0663, all -> 0x065d }
        L_0x05bb:
            java.lang.String r2 = "Content-Type"
            java.lang.String r5 = "application/x-protobuf"
            r3.setRequestProperty(r2, r5)     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            java.lang.String r2 = "User-Agent"
            r3.setRequestProperty(r2, r7)     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            r2 = 30000(0x7530, float:4.2039E-41)
            r3.setConnectTimeout(r2)     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            r3.setReadTimeout(r2)     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            r2 = 1
            r3.setDoInput(r2)     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            r3.setDoOutput(r2)     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            java.lang.String r2 = "Content-Length"
            int r5 = r0.U     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            if (r5 != r6) goto L_0x05e8
            aueh r5 = defpackage.aueh.a     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            aueq r5 = r5.a((java.lang.Object) r0)     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            int r5 = r5.b(r0)     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            r0.U = r5     // Catch:{ IOException -> 0x0663, all -> 0x065d }
        L_0x05e8:
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            r3.setRequestProperty(r2, r5)     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            r2 = 0
            r3.setUseCaches(r2)     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ all -> 0x0655 }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ all -> 0x0655 }
            r2.<init>(r5)     // Catch:{ all -> 0x0655 }
            r0.a(r2)     // Catch:{ all -> 0x0653 }
            r2.close()     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            int r0 = r3.getResponseCode()     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L_0x0650
            java.io.InputStream r2 = r3.getInputStream()     // Catch:{ IOException -> 0x0663, all -> 0x065d }
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x064e, all -> 0x0648 }
            r0.<init>()     // Catch:{ IOException -> 0x064e, all -> 0x0648 }
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x064e, all -> 0x0648 }
        L_0x0617:
            int r7 = r2.read(r5)     // Catch:{ IOException -> 0x064e, all -> 0x0648 }
            if (r7 >= 0) goto L_0x063f
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x064e, all -> 0x0648 }
            aubs r5 = defpackage.aubs.c()     // Catch:{ IOException -> 0x064e, all -> 0x0648 }
            aari r7 = defpackage.aari.c     // Catch:{ IOException -> 0x064e, all -> 0x0648 }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r7, (byte[]) r0, (defpackage.aubs) r5)     // Catch:{ IOException -> 0x064e, all -> 0x0648 }
            r5 = r0
            aari r5 = (defpackage.aari) r5     // Catch:{ IOException -> 0x064e, all -> 0x0648 }
            if (r2 == 0) goto L_0x0635
            r2.close()     // Catch:{ IOException -> 0x0634 }
            goto L_0x0635
        L_0x0634:
            r0 = move-exception
        L_0x0635:
            if (r3 != 0) goto L_0x0638
            goto L_0x063b
        L_0x0638:
            defpackage.jlk.a(r3)
        L_0x063b:
            defpackage.izj.a()
            goto L_0x068f
        L_0x063f:
            if (r7 <= 0) goto L_0x0646
            r8 = 0
            r0.write(r5, r8, r7)     // Catch:{ IOException -> 0x064e, all -> 0x0648 }
            goto L_0x0617
        L_0x0646:
            r8 = 0
            goto L_0x0617
        L_0x0648:
            r0 = move-exception
            r16 = r3
            r3 = r2
            r2 = r0
            goto L_0x066b
        L_0x064e:
            r0 = move-exception
            goto L_0x067e
        L_0x0650:
            if (r3 != 0) goto L_0x0688
            goto L_0x068b
        L_0x0653:
            r0 = move-exception
            goto L_0x0657
        L_0x0655:
            r0 = move-exception
            r2 = 0
        L_0x0657:
            if (r2 == 0) goto L_0x065c
            r2.close()     // Catch:{ IOException -> 0x0663, all -> 0x065d }
        L_0x065c:
            throw r0     // Catch:{ IOException -> 0x0663, all -> 0x065d }
        L_0x065d:
            r0 = move-exception
            r2 = r0
            r16 = r3
            r3 = 0
            goto L_0x066b
        L_0x0663:
            r0 = move-exception
            r2 = 0
            goto L_0x067e
        L_0x0666:
            r0 = move-exception
            r2 = r0
            r3 = 0
            r16 = 0
        L_0x066b:
            if (r3 == 0) goto L_0x0672
            r3.close()     // Catch:{ IOException -> 0x0671 }
            goto L_0x0672
        L_0x0671:
            r0 = move-exception
        L_0x0672:
            if (r16 == 0) goto L_0x0677
            defpackage.jlk.a(r16)
        L_0x0677:
            defpackage.izj.a()
            throw r2
        L_0x067b:
            r0 = move-exception
            r2 = 0
            r3 = 0
        L_0x067e:
            if (r2 == 0) goto L_0x0685
            r2.close()     // Catch:{ IOException -> 0x0684 }
            goto L_0x0685
        L_0x0684:
            r0 = move-exception
        L_0x0685:
            if (r3 != 0) goto L_0x0688
            goto L_0x068b
        L_0x0688:
            defpackage.jlk.a(r3)
        L_0x068b:
            defpackage.izj.a()
            r5 = 0
        L_0x068f:
            if (r5 != 0) goto L_0x0692
            goto L_0x06aa
        L_0x0692:
            int r0 = r5.a
            r2 = 1
            r0 = r0 & r2
            if (r0 != 0) goto L_0x06aa
            java.lang.String r0 = r5.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x06aa
            com.google.android.gms.safetynet.AttestationData r3 = new com.google.android.gms.safetynet.AttestationData
            java.lang.String r0 = r5.b
            r3.<init>(r0)
            r11 = r18
            goto L_0x06bc
        L_0x06aa:
            r2 = 1
            r4.a = r2
            com.google.android.gms.common.api.Status r11 = new com.google.android.gms.common.api.Status
            r0 = 7
            r11.<init>(r0)
            r3 = 0
            goto L_0x06bc
        L_0x06b5:
            com.google.android.gms.common.api.Status r11 = com.google.android.gms.common.api.Status.c
            r3 = 0
            goto L_0x06bc
        L_0x06b9:
            com.google.android.gms.common.api.Status r11 = com.google.android.gms.common.api.Status.c
            r3 = 0
        L_0x06bc:
            r4.b = r11
            r4.c = r3
            boolean r0 = defpackage.azfv.q()
            if (r0 != 0) goto L_0x06fc
            com.google.android.gms.common.api.Status r0 = r4.b
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x06f9
            java.lang.String r0 = r1.d
            com.google.android.gms.safetynet.AttestationData r2 = r4.c
            java.lang.String r2 = r2.a
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x06dd
            r3 = r19
            goto L_0x06fe
        L_0x06dd:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "snet_saved_attestation_response_"
            int r5 = r0.length()
            if (r5 != 0) goto L_0x06ef
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            goto L_0x06f3
        L_0x06ef:
            java.lang.String r0 = r3.concat(r0)
        L_0x06f3:
            r3 = r19
            r3.a((java.lang.String) r0, (java.lang.String) r2)
            goto L_0x06fe
        L_0x06f9:
            r3 = r19
            goto L_0x06fe
        L_0x06fc:
            r3 = r19
        L_0x06fe:
            com.google.android.gms.common.api.Status r0 = r4.b
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0707
            goto L_0x070e
        L_0x0707:
            int r0 = r4.a
            r2 = 1
            if (r0 == r2) goto L_0x070e
            goto L_0x0798
        L_0x070e:
            java.lang.Long r0 = java.lang.Long.valueOf(r28)
            r2 = r27
            r2.add(r0)
            java.lang.String r0 = r1.d
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x0798
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L_0x0798
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x072e:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0743
            java.lang.Object r7 = r2.next()
            java.lang.Long r7 = (java.lang.Long) r7
            r5.append(r7)
            r7 = r23
            r5.append(r7)
            goto L_0x072e
        L_0x0743:
            int r2 = r5.length()
            int r2 = r2 + r6
            r5.deleteCharAt(r2)
            boolean r2 = defpackage.azfv.q()
            if (r2 == 0) goto L_0x077a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0763
            java.lang.String r0 = new java.lang.String
            r2 = r22
            r0.<init>(r2)
            goto L_0x0769
        L_0x0763:
            r2 = r22
            java.lang.String r0 = r2.concat(r0)
        L_0x0769:
            java.lang.String r2 = r5.toString()
            android.content.SharedPreferences r3 = r3.b
            android.content.SharedPreferences$Editor r3 = r3.edit()
            r3.putString(r0, r2)
            r3.commit()
            goto L_0x0799
        L_0x077a:
            r2 = r22
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r0.length()
            if (r6 != 0) goto L_0x078c
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x0790
        L_0x078c:
            java.lang.String r0 = r2.concat(r0)
        L_0x0790:
            java.lang.String r2 = r5.toString()
            r3.a((java.lang.String) r0, (java.lang.String) r2)
            goto L_0x0799
        L_0x0798:
        L_0x0799:
            r0 = r4
        L_0x079a:
            zzw r2 = r1.b
            com.google.android.gms.common.api.Status r3 = r0.b
            com.google.android.gms.safetynet.AttestationData r0 = r0.c
            r2.a((com.google.android.gms.common.api.Status) r3, (com.google.android.gms.safetynet.AttestationData) r0)
            return
        L_0x07a4:
            zzw r0 = r1.b
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r3 = 10
            r2.<init>(r3)
            r3 = 0
            r0.a((com.google.android.gms.common.api.Status) r2, (com.google.android.gms.safetynet.AttestationData) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aarn.a(android.content.Context):void");
    }

    public final void a(Status status) {
        this.b.a(status, (AttestationData) null);
    }
}
