package defpackage;

/* renamed from: bmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bmj implements Runnable {
    final /* synthetic */ bml a;
    private final bmh b;

    public bmj(bml bml, bmh bmh) {
        this.a = bml;
        this.b = bmh;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0496 A[Catch:{ all -> 0x04b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0498 A[Catch:{ all -> 0x04b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03e0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r35 = this;
            r1 = r35
            java.lang.String r2 = " dropping operation."
            java.lang.String r3 = "Unable to load Chimera module context for "
            java.lang.String r4 = "LoadManifestTask"
            bmh r0 = r1.b
            android.content.Intent r0 = r0.e
            defpackage.amtf.a((java.lang.Object) r0)
            java.lang.String r5 = r0.getAction()
            bml r0 = r1.a
            android.content.Context r0 = r0.k
            bkv r6 = defpackage.bkv.a((android.content.Context) r0)
            r8 = 1
            boz r9 = r6.f()     // Catch:{ InvalidConfigException -> 0x0454 }
            apxg r10 = r9.f()     // Catch:{ InvalidConfigException -> 0x0454 }
            bmh r0 = r1.b
            java.lang.String r0 = r0.j
            if (r0 == 0) goto L_0x0035
            int r0 = defpackage.bpz.a(r9, r0)
            if (r0 >= 0) goto L_0x0033
            r3 = 1
            goto L_0x047b
        L_0x0033:
            r11 = r0
            goto L_0x0037
        L_0x0035:
            r0 = -1
            r11 = -1
        L_0x0037:
            java.lang.String r0 = r10.F()
            bml r12 = r1.a
            android.content.Context r12 = r12.k
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r12 = defpackage.brt.a((java.lang.String) r0, (java.lang.String) r12)
            brv r13 = r10.c(r12)
            if (r13 != 0) goto L_0x006c
            java.lang.String r0 = java.lang.String.valueOf(r12)
            java.lang.String r12 = "Unable to find container service: "
            int r13 = r0.length()
            if (r13 != 0) goto L_0x0063
            java.lang.String r0 = new java.lang.String
            r0.<init>(r12)
            goto L_0x0067
        L_0x0063:
            java.lang.String r0 = r12.concat(r0)
        L_0x0067:
            android.util.Log.e(r4, r0)
            r13 = 0
            goto L_0x00a8
        L_0x006c:
            java.lang.String r0 = defpackage.brt.a((java.lang.String) r0, (java.lang.String) r5)
            apxg r13 = r13.a(r0)
            if (r13 != 0) goto L_0x00a7
            java.lang.String r13 = java.lang.String.valueOf(r12)
            int r13 = r13.length()
            java.lang.String r15 = java.lang.String.valueOf(r0)
            int r15 = r15.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r13 = r13 + 24
            int r13 = r13 + r15
            r7.<init>(r13)
            java.lang.String r13 = "Unable to find action: "
            r7.append(r13)
            r7.append(r12)
            java.lang.String r12 = ":"
            r7.append(r12)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            android.util.Log.e(r4, r0)
            r13 = 0
            goto L_0x00a8
        L_0x00a7:
        L_0x00a8:
            if (r13 == 0) goto L_0x0452
            bmh r0 = r1.b
            android.content.Intent r0 = r0.e
            if (r0 == 0) goto L_0x00d6
            java.util.Set r0 = r0.getCategories()
            if (r0 == 0) goto L_0x00d6
            java.util.Iterator r0 = r0.iterator()
        L_0x00ba:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x00d6
            java.lang.Object r7 = r0.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r12 = "targeted_intent_op_prefix:"
            boolean r12 = r7.startsWith(r12)
            if (r12 == 0) goto L_0x00ba
            r0 = 26
            java.lang.String r0 = r7.substring(r0)
            r7 = r0
            goto L_0x00d7
        L_0x00d6:
            r7 = 0
        L_0x00d7:
            bml r0 = r1.a
            android.content.Context r0 = r0.k
            boolean r0 = defpackage.aekv.b(r0)
            r12 = r0 ^ 1
            int r15 = r13.C()
            brx r14 = new brx
            r14.<init>()
            r18 = r2
            r2 = 0
            r8 = 0
        L_0x00ee:
            if (r8 >= r15) goto L_0x0403
            r13.a((defpackage.brx) r14, (int) r8)
            r19 = r13
            java.lang.String r13 = r14.f()
            if (r12 != 0) goto L_0x00fc
            goto L_0x0112
        L_0x00fc:
            boolean r0 = r14.j()
            if (r0 != 0) goto L_0x0112
            r20 = r7
            r32 = r9
            r33 = r10
            r21 = r11
            r22 = r12
            r34 = r15
            r10 = r18
            goto L_0x03e0
        L_0x0112:
            bmh r0 = r1.b
            boolean r0 = r0.k
            if (r0 == 0) goto L_0x012c
            boolean r0 = r14.i()
            if (r0 != 0) goto L_0x012c
            r20 = r7
            r32 = r9
            r33 = r10
            r21 = r11
            r22 = r12
            r34 = r15
            goto L_0x0329
        L_0x012c:
            if (r11 >= 0) goto L_0x012f
            goto L_0x0145
        L_0x012f:
            int r0 = r14.T()
            if (r0 == r11) goto L_0x0145
            r20 = r7
            r32 = r9
            r33 = r10
            r21 = r11
            r22 = r12
            r34 = r15
            r10 = r18
            goto L_0x03e0
        L_0x0145:
            bmh r0 = r1.b
            int r0 = r0.a
            r17 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0166
            boolean r0 = r14.g()
            if (r0 == 0) goto L_0x0156
            goto L_0x0166
        L_0x0156:
            r20 = r7
            r32 = r9
            r33 = r10
            r21 = r11
            r22 = r12
            r34 = r15
            r10 = r18
            goto L_0x03e0
        L_0x0166:
            if (r7 == 0) goto L_0x017f
            boolean r0 = r7.equals(r13)
            if (r0 == 0) goto L_0x016f
            goto L_0x017f
        L_0x016f:
            r20 = r7
            r32 = r9
            r33 = r10
            r21 = r11
            r22 = r12
            r34 = r15
            r10 = r18
            goto L_0x03e0
        L_0x017f:
            boolean r0 = r14.h()
            if (r0 == 0) goto L_0x0199
            bml r0 = r1.a
            r20 = r7
            bnh r7 = r0.e
            android.content.Context r0 = r0.k
            r21 = r11
            r22 = r12
            long r11 = defpackage.bml.a
            java.lang.Object r0 = r7.a(r0, r13, r11)
            r7 = r0
            goto L_0x01a0
        L_0x0199:
            r20 = r7
            r21 = r11
            r22 = r12
            r7 = 0
        L_0x01a0:
            int r0 = r14.T()     // Catch:{ all -> 0x03f4 }
            if (r0 < 0) goto L_0x01ae
            int r11 = r9.c()     // Catch:{ all -> 0x03f4 }
            if (r0 >= r11) goto L_0x01ae
            r11 = 1
            goto L_0x01af
        L_0x01ae:
            r11 = 0
        L_0x01af:
            defpackage.amrl.b(r11)     // Catch:{ all -> 0x03f4 }
            bpa r0 = r9.b(r0)     // Catch:{ all -> 0x03f4 }
            java.lang.String r0 = r0.b()     // Catch:{ all -> 0x03f4 }
            bml r11 = r1.a     // Catch:{ all -> 0x03f4 }
            java.util.Map r11 = r11.j     // Catch:{ all -> 0x03f4 }
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x03f4 }
            bmk r11 = (defpackage.bmk) r11     // Catch:{ all -> 0x03f4 }
            if (r11 == 0) goto L_0x01c9
            r32 = r9
            goto L_0x01eb
        L_0x01c9:
            bml r11 = r1.a     // Catch:{ InvalidConfigException -> 0x03af }
            android.content.Context r11 = r11.k     // Catch:{ InvalidConfigException -> 0x03af }
            boz r12 = r6.f()     // Catch:{ InvalidConfigException -> 0x03af }
            r32 = r9
            bpa r9 = r12.a((java.lang.String) r0)     // Catch:{ InvalidConfigException -> 0x03ad }
            if (r9 == 0) goto L_0x0378
            android.content.Context r9 = r6.a((android.content.Context) r11, (defpackage.boz) r12, (defpackage.bpa) r9)     // Catch:{ InvalidConfigException -> 0x03ad }
            if (r9 == 0) goto L_0x034c
            bmk r11 = new bmk     // Catch:{ all -> 0x03f4 }
            r11.<init>(r9)     // Catch:{ all -> 0x03f4 }
            bml r9 = r1.a     // Catch:{ all -> 0x03f4 }
            java.util.Map r9 = r9.j     // Catch:{ all -> 0x03f4 }
            r9.put(r0, r11)     // Catch:{ all -> 0x03f4 }
        L_0x01eb:
            java.util.Map r9 = r11.b     // Catch:{ all -> 0x03f4 }
            java.lang.Object r9 = r9.get(r13)     // Catch:{ all -> 0x03f4 }
            bmi r9 = (defpackage.bmi) r9     // Catch:{ all -> 0x03f4 }
            if (r9 != 0) goto L_0x0289
            java.lang.String r9 = r10.F()     // Catch:{ all -> 0x03f4 }
            java.lang.String r9 = defpackage.brt.b((java.lang.String) r9, (java.lang.String) r13)     // Catch:{ all -> 0x03f4 }
            bmh r12 = r1.b     // Catch:{ all -> 0x03f4 }
            java.util.List r12 = r12.d     // Catch:{ all -> 0x03f4 }
            if (r12 != 0) goto L_0x0206
            r33 = r10
            goto L_0x0242
        L_0x0206:
            java.lang.String r12 = defpackage.bml.a(r0, r9)     // Catch:{ all -> 0x03f4 }
            r33 = r10
            bmh r10 = r1.b     // Catch:{ all -> 0x03f4 }
            java.util.List r10 = r10.d     // Catch:{ all -> 0x03f4 }
            boolean r10 = r10.contains(r12)     // Catch:{ all -> 0x03f4 }
            if (r10 == 0) goto L_0x0242
            java.lang.String r0 = "Dropping blacklisted operation "
            java.lang.String r9 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x03f4 }
            int r10 = r9.length()     // Catch:{ all -> 0x03f4 }
            if (r10 != 0) goto L_0x0228
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x03f4 }
            r9.<init>(r0)     // Catch:{ all -> 0x03f4 }
            goto L_0x022c
        L_0x0228:
            java.lang.String r9 = r0.concat(r9)     // Catch:{ all -> 0x03f4 }
        L_0x022c:
            android.util.Log.w(r4, r9)     // Catch:{ all -> 0x03f4 }
            if (r7 == 0) goto L_0x023c
            bml r0 = r1.a
            bnh r0 = r0.e
            r0.a(r7)
            r34 = r15
            goto L_0x0344
        L_0x023c:
            r34 = r15
            r10 = r18
            goto L_0x03e0
        L_0x0242:
            bmi r10 = new bmi     // Catch:{ ClassNotFoundException -> 0x0257 }
            bml r12 = r1.a     // Catch:{ ClassNotFoundException -> 0x0257 }
            r34 = r15
            android.content.Context r15 = r11.a     // Catch:{ ClassNotFoundException -> 0x0255 }
            r10.<init>(r12, r15, r0, r9)     // Catch:{ ClassNotFoundException -> 0x0255 }
            java.util.Map r0 = r11.b     // Catch:{ all -> 0x03f4 }
            r0.put(r13, r10)     // Catch:{ all -> 0x03f4 }
            r27 = r10
            goto L_0x028f
        L_0x0255:
            r0 = move-exception
            goto L_0x025a
        L_0x0257:
            r0 = move-exception
            r34 = r15
        L_0x025a:
            java.lang.String r10 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x03f4 }
            int r10 = r10.length()     // Catch:{ all -> 0x03f4 }
            int r10 = r10 + 59
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x03f4 }
            r11.<init>(r10)     // Catch:{ all -> 0x03f4 }
            java.lang.String r10 = "Can't find Chimera operation impl class "
            r11.append(r10)     // Catch:{ all -> 0x03f4 }
            r11.append(r9)     // Catch:{ all -> 0x03f4 }
            java.lang.String r9 = " dropping operation"
            r11.append(r9)     // Catch:{ all -> 0x03f4 }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x03f4 }
            android.util.Log.e(r4, r9, r0)     // Catch:{ all -> 0x03f4 }
            if (r7 == 0) goto L_0x0285
            bml r0 = r1.a
            bnh r0 = r0.e
            goto L_0x0341
        L_0x0285:
            r10 = r18
            goto L_0x03e0
        L_0x0289:
            r33 = r10
            r34 = r15
            r27 = r9
        L_0x028f:
            com.google.android.chimera.IntentOperation r26 = r27.a()     // Catch:{ all -> 0x03f4 }
            if (r26 == 0) goto L_0x033b
            bml r0 = r1.a     // Catch:{ all -> 0x03f4 }
            java.util.concurrent.locks.ReentrantLock r0 = r0.f     // Catch:{ all -> 0x03f4 }
            r0.lock()     // Catch:{ all -> 0x03f4 }
            if (r2 == 0) goto L_0x029f
            goto L_0x02da
        L_0x029f:
            bml r0 = r1.a     // Catch:{ all -> 0x0332 }
            java.util.Map r0 = r0.g     // Catch:{ all -> 0x0332 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0332 }
            bmf r0 = (defpackage.bmf) r0     // Catch:{ all -> 0x0332 }
            if (r0 != 0) goto L_0x02b2
            bmf r0 = new bmf     // Catch:{ all -> 0x0332 }
            bml r2 = r1.a     // Catch:{ all -> 0x0332 }
            r0.<init>(r2, r5)     // Catch:{ all -> 0x0332 }
        L_0x02b2:
            bmh r2 = r1.b     // Catch:{ all -> 0x0332 }
            boolean r9 = r0.c     // Catch:{ all -> 0x0332 }
            if (r9 != 0) goto L_0x02cf
            bml r9 = r0.d     // Catch:{ all -> 0x0332 }
            java.util.Map r9 = r9.g     // Catch:{ all -> 0x0332 }
            java.lang.String r10 = r0.a     // Catch:{ all -> 0x0332 }
            java.lang.Object r9 = r9.put(r10, r0)     // Catch:{ all -> 0x0332 }
            bmf r9 = (defpackage.bmf) r9     // Catch:{ all -> 0x0332 }
            if (r9 != 0) goto L_0x02c8
            r9 = 1
            goto L_0x02c9
        L_0x02c8:
            r9 = 0
        L_0x02c9:
            defpackage.amtf.a((boolean) r9)     // Catch:{ all -> 0x0332 }
            r9 = 1
            r0.c = r9     // Catch:{ all -> 0x0332 }
        L_0x02cf:
            bme r9 = new bme     // Catch:{ all -> 0x0332 }
            r9.<init>(r0, r2)     // Catch:{ all -> 0x0332 }
            java.util.Queue r0 = r0.b     // Catch:{ all -> 0x0332 }
            r0.add(r9)     // Catch:{ all -> 0x0332 }
            r2 = r9
        L_0x02da:
            boolean r28 = r14.g()     // Catch:{ all -> 0x0332 }
            r0 = 6
            int r0 = r14.d((int) r0)     // Catch:{ all -> 0x0332 }
            if (r0 == 0) goto L_0x02ef
            java.nio.ByteBuffer r9 = r14.d     // Catch:{ all -> 0x0332 }
            int r10 = r14.c     // Catch:{ all -> 0x0332 }
            int r0 = r0 + r10
            int r0 = r9.getInt(r0)     // Catch:{ all -> 0x0332 }
            goto L_0x02f0
        L_0x02ef:
            r0 = 0
        L_0x02f0:
            long r9 = (long) r0     // Catch:{ all -> 0x0332 }
            if (r28 != 0) goto L_0x02f4
            goto L_0x0302
        L_0x02f4:
            bmh r0 = r2.a     // Catch:{ all -> 0x0332 }
            boolean r11 = r0.b     // Catch:{ all -> 0x0332 }
            r12 = 1
            r11 = r11 ^ r12
            defpackage.amtf.a((boolean) r11)     // Catch:{ all -> 0x0332 }
            int r11 = r0.h     // Catch:{ all -> 0x0332 }
            int r11 = r11 + r12
            r0.h = r11     // Catch:{ all -> 0x0332 }
        L_0x0302:
            bmh r0 = r2.a     // Catch:{ all -> 0x0332 }
            android.content.Intent r0 = r0.e     // Catch:{ all -> 0x0332 }
            defpackage.amtf.a((java.lang.Object) r0)     // Catch:{ all -> 0x0332 }
            bmd r11 = new bmd     // Catch:{ all -> 0x0332 }
            r23 = r11
            r24 = r2
            r25 = r0
            r29 = r7
            r30 = r9
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0332 }
            java.util.Queue r0 = r2.b     // Catch:{ all -> 0x0332 }
            r0.add(r11)     // Catch:{ all -> 0x0332 }
            bmf r0 = r2.f     // Catch:{ all -> 0x0332 }
            r0.a()     // Catch:{ all -> 0x0332 }
            bml r0 = r1.a     // Catch:{ all -> 0x032d }
            java.util.concurrent.locks.ReentrantLock r0 = r0.f     // Catch:{ all -> 0x032d }
            r0.unlock()     // Catch:{ all -> 0x032d }
        L_0x0329:
            r10 = r18
            goto L_0x03e0
        L_0x032d:
            r0 = move-exception
            r16 = 1
            goto L_0x03f7
        L_0x0332:
            r0 = move-exception
            bml r2 = r1.a     // Catch:{ all -> 0x03f4 }
            java.util.concurrent.locks.ReentrantLock r2 = r2.f     // Catch:{ all -> 0x03f4 }
            r2.unlock()     // Catch:{ all -> 0x03f4 }
            throw r0     // Catch:{ all -> 0x03f4 }
        L_0x033b:
            if (r7 == 0) goto L_0x0348
            bml r0 = r1.a
            bnh r0 = r0.e
        L_0x0341:
            r0.a(r7)
        L_0x0344:
            r10 = r18
            goto L_0x03e0
        L_0x0348:
            r10 = r18
            goto L_0x03e0
        L_0x034c:
            r33 = r10
            r34 = r15
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x03f4 }
            int r0 = r0.length()     // Catch:{ all -> 0x03f4 }
            int r0 = r0 + 62
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x03f4 }
            r9.<init>(r0)     // Catch:{ all -> 0x03f4 }
            r9.append(r3)     // Catch:{ all -> 0x03f4 }
            r9.append(r13)     // Catch:{ all -> 0x03f4 }
            r10 = r18
            r9.append(r10)     // Catch:{ all -> 0x03f4 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x03f4 }
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x03f4 }
            if (r7 == 0) goto L_0x03e0
            bml r0 = r1.a
            bnh r0 = r0.e
            goto L_0x03dd
        L_0x0378:
            r33 = r10
            r34 = r15
            r10 = r18
            android.content.Context r9 = r6.a     // Catch:{ InvalidConfigException -> 0x03ab }
            r11 = 12
            defpackage.bla.a(r9, r11, r0)     // Catch:{ InvalidConfigException -> 0x03ab }
            com.google.android.chimera.config.InvalidConfigException r9 = new com.google.android.chimera.config.InvalidConfigException     // Catch:{ InvalidConfigException -> 0x03ab }
            java.lang.String r11 = java.lang.String.valueOf(r0)     // Catch:{ InvalidConfigException -> 0x03ab }
            int r11 = r11.length()     // Catch:{ InvalidConfigException -> 0x03ab }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ InvalidConfigException -> 0x03ab }
            int r11 = r11 + 17
            r12.<init>(r11)     // Catch:{ InvalidConfigException -> 0x03ab }
            java.lang.String r11 = "module "
            r12.append(r11)     // Catch:{ InvalidConfigException -> 0x03ab }
            r12.append(r0)     // Catch:{ InvalidConfigException -> 0x03ab }
            java.lang.String r0 = " not found"
            r12.append(r0)     // Catch:{ InvalidConfigException -> 0x03ab }
            java.lang.String r0 = r12.toString()     // Catch:{ InvalidConfigException -> 0x03ab }
            r9.<init>((java.lang.String) r0)     // Catch:{ InvalidConfigException -> 0x03ab }
            throw r9     // Catch:{ InvalidConfigException -> 0x03ab }
        L_0x03ab:
            r0 = move-exception
            goto L_0x03b8
        L_0x03ad:
            r0 = move-exception
            goto L_0x03b2
        L_0x03af:
            r0 = move-exception
            r32 = r9
        L_0x03b2:
            r33 = r10
            r34 = r15
            r10 = r18
        L_0x03b8:
            java.lang.String r9 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x03f4 }
            int r9 = r9.length()     // Catch:{ all -> 0x03f4 }
            int r9 = r9 + 62
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x03f4 }
            r11.<init>(r9)     // Catch:{ all -> 0x03f4 }
            r11.append(r3)     // Catch:{ all -> 0x03f4 }
            r11.append(r13)     // Catch:{ all -> 0x03f4 }
            r11.append(r10)     // Catch:{ all -> 0x03f4 }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x03f4 }
            android.util.Log.w(r4, r9, r0)     // Catch:{ all -> 0x03f4 }
            if (r7 == 0) goto L_0x03e0
            bml r0 = r1.a
            bnh r0 = r0.e
        L_0x03dd:
            r0.a(r7)
        L_0x03e0:
            int r8 = r8 + 1
            r18 = r10
            r13 = r19
            r7 = r20
            r11 = r21
            r12 = r22
            r9 = r32
            r10 = r33
            r15 = r34
            goto L_0x00ee
        L_0x03f4:
            r0 = move-exception
            r16 = 0
        L_0x03f7:
            if (r7 == 0) goto L_0x0402
            if (r16 != 0) goto L_0x0402
            bml r2 = r1.a
            bnh r2 = r2.e
            r2.a(r7)
        L_0x0402:
            throw r0
        L_0x0403:
            if (r2 == 0) goto L_0x0450
            bmf r0 = r2.f
            bml r0 = r0.d
            java.util.concurrent.locks.ReentrantLock r0 = r0.f
            r0.lock()
            boolean r0 = r2.e     // Catch:{ all -> 0x0445 }
            r3 = 1
            r0 = r0 ^ r3
            defpackage.amtf.a((boolean) r0)     // Catch:{ all -> 0x0445 }
            r2.e = r3     // Catch:{ all -> 0x0445 }
            int r0 = r2.c     // Catch:{ all -> 0x0445 }
            if (r0 == 0) goto L_0x041c
            goto L_0x043b
        L_0x041c:
            java.util.Queue r0 = r2.b     // Catch:{ all -> 0x0445 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0445 }
            if (r0 == 0) goto L_0x043b
            bmf r0 = r2.f     // Catch:{ all -> 0x0445 }
            java.util.Queue r0 = r0.b     // Catch:{ all -> 0x0445 }
            java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x0445 }
            if (r0 != r2) goto L_0x0431
            r17 = 1
            goto L_0x0433
        L_0x0431:
            r17 = 0
        L_0x0433:
            defpackage.amtf.a((boolean) r17)     // Catch:{ all -> 0x0445 }
            bmf r0 = r2.f     // Catch:{ all -> 0x0445 }
            r0.b()     // Catch:{ all -> 0x0445 }
        L_0x043b:
            bmf r0 = r2.f
            bml r0 = r0.d
            java.util.concurrent.locks.ReentrantLock r0 = r0.f
            r0.unlock()
            goto L_0x047b
        L_0x0445:
            r0 = move-exception
            bmf r2 = r2.f
            bml r2 = r2.d
            java.util.concurrent.locks.ReentrantLock r2 = r2.f
            r2.unlock()
            throw r0
        L_0x0450:
            r3 = 1
            goto L_0x047b
        L_0x0452:
            r3 = 1
            goto L_0x047b
        L_0x0454:
            r0 = move-exception
            r3 = 1
            bml r2 = r1.a
            android.content.Context r2 = r2.k
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r5 = "Unable to get Chimera module manifest. Dropping all operations for "
            int r6 = r2.length()
            if (r6 != 0) goto L_0x0474
            java.lang.String r2 = new java.lang.String
            r2.<init>(r5)
            goto L_0x0478
        L_0x0474:
            java.lang.String r2 = r5.concat(r2)
        L_0x0478:
            android.util.Log.e(r4, r2, r0)
        L_0x047b:
            bml r0 = r1.a
            java.util.concurrent.locks.ReentrantLock r0 = r0.f
            r0.lock()
            bml r0 = r1.a     // Catch:{ all -> 0x04b0 }
            bmg r0 = r0.l     // Catch:{ all -> 0x04b0 }
            bmh r2 = r1.b     // Catch:{ all -> 0x04b0 }
            r0.b(r2)     // Catch:{ all -> 0x04b0 }
            bmh r0 = r1.b     // Catch:{ all -> 0x04b0 }
            r0.b()     // Catch:{ all -> 0x04b0 }
            bml r0 = r1.a     // Catch:{ all -> 0x04b0 }
            int r0 = r0.h     // Catch:{ all -> 0x04b0 }
            if (r0 <= 0) goto L_0x0498
            r7 = 1
            goto L_0x0499
        L_0x0498:
            r7 = 0
        L_0x0499:
            defpackage.amtf.a((boolean) r7)     // Catch:{ all -> 0x04b0 }
            bml r0 = r1.a     // Catch:{ all -> 0x04b0 }
            defpackage.bml.a(r0)     // Catch:{ all -> 0x04b0 }
            bml r0 = r1.a     // Catch:{ all -> 0x04b0 }
            bmg r0 = r0.l     // Catch:{ all -> 0x04b0 }
            r0.a()     // Catch:{ all -> 0x04b0 }
            bml r0 = r1.a
            java.util.concurrent.locks.ReentrantLock r0 = r0.f
            r0.unlock()
            return
        L_0x04b0:
            r0 = move-exception
            bml r2 = r1.a
            java.util.concurrent.locks.ReentrantLock r2 = r2.f
            r2.unlock()
            goto L_0x04ba
        L_0x04b9:
            throw r0
        L_0x04ba:
            goto L_0x04b9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmj.run():void");
    }
}
