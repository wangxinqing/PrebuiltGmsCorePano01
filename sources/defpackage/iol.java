package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: iol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iol extends imt {
    public iol() {
        super("ClearcutSosFix", Math.max(axbk.a.a().f(), 60), TimeUnit.MILLISECONDS.convert(3, TimeUnit.MINUTES));
    }

    public final boolean a(inb inb) {
        ioo ioo = new ioo(inb.b);
        if (!axbk.a.a().e() || inb.a() == null || !ioo.a.getBoolean("OptInUsageReporting", false) || ioo.a.getInt("OptInGMSCoreVersion", 0) < 0) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: com.google.android.gms.phenotype.ExperimentTokens} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v39, resolved type: com.google.android.gms.phenotype.ExperimentTokens} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v40, resolved type: com.google.android.gms.phenotype.ExperimentTokens} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v41, resolved type: com.google.android.gms.phenotype.ExperimentTokens} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v51, resolved type: com.google.android.gms.phenotype.ExperimentTokens} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v52, resolved type: com.google.android.gms.phenotype.ExperimentTokens} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v53, resolved type: com.google.android.gms.phenotype.ExperimentTokens} */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02c2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02c5, code lost:
        r1 = r0;
        r6 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02c4 A[ExcHandler: all (r0v110 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:96:0x029d] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02e8 A[SYNTHETIC, Splitter:B:121:0x02e8] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x031e A[SYNTHETIC, Splitter:B:135:0x031e] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x039f A[Catch:{ RuntimeException -> 0x03b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03a0 A[Catch:{ RuntimeException -> 0x03b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03c6 A[Catch:{ RuntimeException -> 0x03da }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03c7 A[Catch:{ RuntimeException -> 0x03da }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03ec A[Catch:{ RuntimeException -> 0x0409 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03ed A[Catch:{ RuntimeException -> 0x0409 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03f3 A[Catch:{ RuntimeException -> 0x0409 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03f4 A[Catch:{ RuntimeException -> 0x0409 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x043a A[Catch:{ SecurityException -> 0x047c, RuntimeException -> 0x0472, iom -> 0x0470 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x045b A[Catch:{ SecurityException -> 0x047c, RuntimeException -> 0x0472, iom -> 0x0470 }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x045c A[Catch:{ SecurityException -> 0x047c, RuntimeException -> 0x0472, iom -> 0x0470 }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04ab  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x04ea A[Catch:{ IOException -> 0x0655 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0571 A[Catch:{ IOException -> 0x0655 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0577 A[Catch:{ IOException -> 0x0655 }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x05b3 A[Catch:{ all -> 0x064c }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x05b4 A[Catch:{ all -> 0x064c }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0609  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0621  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0456 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e3 A[Catch:{ iom -> 0x0108 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e4 A[Catch:{ iom -> 0x0108 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014d A[SYNTHETIC, Splitter:B:64:0x014d] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0297 A[SYNTHETIC, Splitter:B:94:0x0297] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.inb b(defpackage.inb r28) {
        /*
            r27 = this;
            r1 = r27
            java.lang.String r2 = "Couldn't get Google accounts"
            java.lang.String r3 = "Couldn't get versionCode"
            java.lang.String r4 = "Couldn't close phenotype database"
            java.lang.String r5 = "SosLogRequestBuilder"
            r6 = r28
            android.content.Context r7 = r6.b
            ion r8 = new ion
            r8.<init>(r7)
            r9 = 0
            r8.b = r9
            ilu r10 = r28.a()
            defpackage.iva.a((java.lang.Object) r10)
            long r11 = java.lang.System.currentTimeMillis()
            long r13 = android.os.SystemClock.elapsedRealtime()
            avrr r0 = defpackage.avrr.q
            aucd r0 = r0.o()
            r15 = r0
            aucf r15 = (defpackage.aucf) r15
            boolean r0 = r15.c
            if (r0 != 0) goto L_0x0033
            goto L_0x0038
        L_0x0033:
            r15.c()
            r15.c = r9
        L_0x0038:
            aucj r0 = r15.b
            avrr r0 = (defpackage.avrr) r0
            int r9 = r0.a
            r6 = 1
            r9 = r9 | r6
            r0.a = r9
            r0.b = r11
            r16 = 2
            r9 = r9 | 2
            r0.a = r9
            r0.c = r13
            avrf r0 = defpackage.avrf.e
            aucd r9 = r0.o()
            boolean r0 = r9.c
            if (r0 == 0) goto L_0x005c
            r9.c()
            r6 = 0
            r9.c = r6
        L_0x005c:
            aucj r0 = r9.b
            avrf r0 = (defpackage.avrf) r0
            r6 = 4
            r0.b = r6
            int r6 = r0.a
            r17 = 1
            r6 = r6 | 1
            r0.a = r6
            android.content.Context r0 = r8.a     // Catch:{ RuntimeException -> 0x007d }
            com.google.android.chimera.config.ModuleManager r0 = com.google.android.chimera.config.ModuleManager.get(r0)     // Catch:{ RuntimeException -> 0x007d }
            jik r0 = defpackage.jil.a((com.google.android.chimera.config.ModuleManager) r0)     // Catch:{ RuntimeException -> 0x007d }
            r24 = r0
            goto L_0x0088
        L_0x0078:
            r0 = move-exception
            r26 = r7
            goto L_0x0109
        L_0x007d:
            r0 = move-exception
            java.lang.String r6 = "Couldn't get chimeraConfigInfo; omitting."
            android.util.Log.e(r5, r6, r0)     // Catch:{ iom -> 0x0078 }
            r8.a(r0)     // Catch:{ iom -> 0x0078 }
            r24 = 0
        L_0x0088:
            android.content.Context r0 = r8.a     // Catch:{ RuntimeException -> 0x0091 }
            anoc r0 = defpackage.jgt.a((android.content.Context) r0)     // Catch:{ RuntimeException -> 0x0091 }
            r25 = r0
            goto L_0x009c
        L_0x0091:
            r0 = move-exception
            r8.a(r0)     // Catch:{ iom -> 0x0078 }
            java.lang.String r6 = "Couldn't get accessibilityState; omitting."
            android.util.Log.e(r5, r6, r0)     // Catch:{ iom -> 0x0078 }
            r25 = 0
        L_0x009c:
            android.content.Context r6 = r8.a     // Catch:{ RuntimeException -> 0x00fa }
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00c6, RuntimeException -> 0x00b8 }
            android.content.Context r1 = r8.a     // Catch:{ NameNotFoundException -> 0x00c6, RuntimeException -> 0x00b8 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x00c6, RuntimeException -> 0x00b8 }
            r26 = r7
            r7 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r7)     // Catch:{ NameNotFoundException -> 0x00b6, RuntimeException -> 0x00b4 }
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x00b6, RuntimeException -> 0x00b4 }
            r22 = r0
            goto L_0x00ce
        L_0x00b4:
            r0 = move-exception
            goto L_0x00bb
        L_0x00b6:
            r0 = move-exception
            goto L_0x00c9
        L_0x00b8:
            r0 = move-exception
            r26 = r7
        L_0x00bb:
            r8.a(r0)     // Catch:{ RuntimeException -> 0x00c4 }
            android.util.Log.e(r5, r3, r0)     // Catch:{ RuntimeException -> 0x00c4 }
            r22 = 0
            goto L_0x00ce
        L_0x00c4:
            r0 = move-exception
            goto L_0x00fd
        L_0x00c6:
            r0 = move-exception
            r26 = r7
        L_0x00c9:
            android.util.Log.e(r5, r3, r0)     // Catch:{ RuntimeException -> 0x00c4 }
            r22 = 0
        L_0x00ce:
            r0 = 201216073(0xbfe5049, float:9.795804E-32)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r0)     // Catch:{ RuntimeException -> 0x00c4 }
            r20 = 0
            r21 = 0
            r19 = r6
            avrb r0 = defpackage.jhg.a(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ RuntimeException -> 0x00c4 }
            boolean r1 = r9.c     // Catch:{ iom -> 0x0108 }
            if (r1 != 0) goto L_0x00e4
            goto L_0x00ea
        L_0x00e4:
            r9.c()     // Catch:{ iom -> 0x0108 }
            r1 = 0
            r9.c = r1     // Catch:{ iom -> 0x0108 }
        L_0x00ea:
            aucj r1 = r9.b     // Catch:{ iom -> 0x0108 }
            avrf r1 = (defpackage.avrf) r1     // Catch:{ iom -> 0x0108 }
            r0.getClass()     // Catch:{ iom -> 0x0108 }
            r1.c = r0     // Catch:{ iom -> 0x0108 }
            int r0 = r1.a     // Catch:{ iom -> 0x0108 }
            r0 = r0 | 8
            r1.a = r0     // Catch:{ iom -> 0x0108 }
            goto L_0x010e
        L_0x00fa:
            r0 = move-exception
            r26 = r7
        L_0x00fd:
            r8.a(r0)     // Catch:{ iom -> 0x0108 }
            iom r1 = new iom     // Catch:{ iom -> 0x0108 }
            java.lang.String r3 = "Couldn't create androidClientInfo"
            r1.<init>(r3, r0)     // Catch:{ iom -> 0x0108 }
            throw r1     // Catch:{ iom -> 0x0108 }
        L_0x0108:
            r0 = move-exception
        L_0x0109:
            java.lang.String r1 = "Couldn't get androidClientInfo; omitting."
            android.util.Log.e(r5, r1, r0)
        L_0x010e:
            aucj r0 = r9.i()
            avrf r0 = (defpackage.avrf) r0
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x0119
            goto L_0x011f
        L_0x0119:
            r15.c()
            r1 = 0
            r15.c = r1
        L_0x011f:
            aucj r1 = r15.b
            avrr r1 = (defpackage.avrr) r1
            r0.getClass()
            r1.d = r0
            int r0 = r1.a
            r3 = 4
            r0 = r0 | r3
            r1.a = r0
            avrp r0 = defpackage.avrp.GMS_CORE
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x0135
            goto L_0x013b
        L_0x0135:
            r15.c()
            r1 = 0
            r15.c = r1
        L_0x013b:
            aucj r1 = r15.b
            avrr r1 = (defpackage.avrr) r1
            int r0 = r0.yv
            r1.e = r0
            int r0 = r1.a
            r0 = r0 | 8
            r1.a = r0
            boolean r0 = r8.b
            if (r0 != 0) goto L_0x0165
            android.content.Context r0 = r8.a     // Catch:{ RuntimeException -> 0x0156 }
            com.google.android.gms.pseudonymous.PseudonymousIdToken r0 = defpackage.zok.b(r0)     // Catch:{ RuntimeException -> 0x0156 }
            java.lang.String r0 = r0.a     // Catch:{ RuntimeException -> 0x0156 }
            goto L_0x0160
        L_0x0156:
            r0 = move-exception
            r8.a(r0)
            java.lang.String r1 = "Couldn't get Zwieback cookie."
            android.util.Log.e(r5, r1, r0)
            r0 = 0
        L_0x0160:
            if (r0 != 0) goto L_0x0167
            java.lang.String r0 = ""
            goto L_0x0167
        L_0x0165:
            java.lang.String r0 = "ANONYMOUS"
        L_0x0167:
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x016c
            goto L_0x0172
        L_0x016c:
            r15.c()
            r1 = 0
            r15.c = r1
        L_0x0172:
            aucj r1 = r15.b
            avrr r1 = (defpackage.avrr) r1
            r0.getClass()
            int r3 = r1.a
            r3 = r3 | 32
            r1.a = r3
            r1.g = r0
            r1 = 1
            avrm[] r3 = new defpackage.avrm[r1]
            avrm r0 = defpackage.avrm.t
            aucd r0 = r0.o()
            r1 = r0
            aucf r1 = (defpackage.aucf) r1
            boolean r0 = r1.c
            if (r0 != 0) goto L_0x0192
            goto L_0x0198
        L_0x0192:
            r1.c()
            r6 = 0
            r1.c = r6
        L_0x0198:
            aucj r0 = r1.b
            avrm r0 = (defpackage.avrm) r0
            int r6 = r0.a
            r7 = 1
            r6 = r6 | r7
            r0.a = r6
            r0.b = r11
            r6 = r6 | 2
            r0.a = r6
            r0.c = r13
            r6 = r6 | 16
            r0.a = r6
            r6 = 17
            r0.f = r6
            aohl r0 = defpackage.aohl.u
            aucd r0 = r0.o()
            aohq r6 = defpackage.aohq.c
            aucd r6 = r6.o()
            aohp r7 = defpackage.aohp.g
            aucd r7 = r7.o()
            java.lang.String r9 = r10.a
            boolean r13 = r7.c
            if (r13 != 0) goto L_0x01cb
            goto L_0x01d1
        L_0x01cb:
            r7.c()
            r13 = 0
            r7.c = r13
        L_0x01d1:
            aucj r13 = r7.b
            aohp r13 = (defpackage.aohp) r13
            r9.getClass()
            int r14 = r13.a
            r17 = 1
            r14 = r14 | 1
            r13.a = r14
            r13.b = r9
            java.lang.String r9 = r10.b
            r9.getClass()
            r14 = r14 | 128(0x80, float:1.794E-43)
            r13.a = r14
            r13.f = r9
            r9 = r2
            r19 = r3
            long r2 = r10.c
            r18 = 4
            r14 = r14 | 4
            r13.a = r14
            r13.c = r2
            long r2 = r10.d
            r14 = r14 | 8
            r13.a = r14
            r13.d = r2
            long r2 = r10.e
            r10 = r14 | 16
            r13.a = r10
            r13.e = r2
            aucj r2 = r7.i()
            aohp r2 = (defpackage.aohp) r2
            boolean r3 = r6.c
            if (r3 != 0) goto L_0x0215
            goto L_0x021b
        L_0x0215:
            r6.c()
            r3 = 0
            r6.c = r3
        L_0x021b:
            aucj r3 = r6.b
            aohq r3 = (defpackage.aohq) r3
            r2.getClass()
            r3.b = r2
            int r2 = r3.a
            r7 = 1
            r2 = r2 | r7
            r3.a = r2
            aucj r2 = r6.i()
            aohq r2 = (defpackage.aohq) r2
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0235
            goto L_0x023b
        L_0x0235:
            r0.c()
            r3 = 0
            r0.c = r3
        L_0x023b:
            aucj r3 = r0.b
            aohl r3 = (defpackage.aohl) r3
            r2.getClass()
            r3.o = r2
            int r2 = r3.a
            r2 = r2 | 512(0x200, float:7.175E-43)
            r3.a = r2
            aucj r0 = r0.i()
            aohl r0 = (defpackage.aohl) r0
            auay r0 = r0.au()
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x0259
            goto L_0x025f
        L_0x0259:
            r1.c()
            r2 = 0
            r1.c = r2
        L_0x025f:
            aucj r2 = r1.b
            avrm r2 = (defpackage.avrm) r2
            r0.getClass()
            int r3 = r2.a
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r2.a = r3
            r2.j = r0
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            int r0 = r0.getOffset(r11)
            int r0 = r0 / 1000
            long r2 = (long) r0
            boolean r0 = r1.c
            if (r0 != 0) goto L_0x027e
            goto L_0x0284
        L_0x027e:
            r1.c()
            r6 = 0
            r1.c = r6
        L_0x0284:
            aucj r0 = r1.b
            avrm r0 = (defpackage.avrm) r0
            int r6 = r0.a
            r7 = 65536(0x10000, float:9.18355E-41)
            r6 = r6 | r7
            r0.a = r6
            r0.k = r2
            boolean r0 = r8.b
            java.lang.String r2 = "com.google.android.gms.common.devicedoctor.fixes.clearcutsos"
            if (r0 != 0) goto L_0x032b
            android.content.Context r0 = r8.a     // Catch:{ RuntimeException -> 0x02d0, all -> 0x02cb }
            yfg r3 = defpackage.yfg.a(r0)     // Catch:{ RuntimeException -> 0x02d0, all -> 0x02cb }
            android.content.Context r0 = r8.a     // Catch:{ RuntimeException -> 0x02c8, all -> 0x02c4 }
            yfg r0 = defpackage.yfg.a(r0)     // Catch:{ RuntimeException -> 0x02c8, all -> 0x02c4 }
            yhj r6 = new yhj     // Catch:{ RuntimeException -> 0x02c8, all -> 0x02c4 }
            java.lang.String r7 = ".metrics"
            r10 = 0
            r6.<init>(r7, r10, r2)     // Catch:{ RuntimeException -> 0x02c2, all -> 0x02c4 }
            com.google.android.gms.phenotype.ExperimentTokens r6 = r6.b(r0)     // Catch:{ RuntimeException -> 0x02c2, all -> 0x02c4 }
            if (r3 != 0) goto L_0x02b3
            r7 = r10
            goto L_0x02f6
        L_0x02b3:
            r3.close()     // Catch:{ RuntimeException -> 0x02b8 }
            r7 = r10
            goto L_0x02f6
        L_0x02b8:
            r0 = move-exception
            r3 = r0
            r8.a(r3)
            android.util.Log.e(r5, r4, r3)
            r7 = r10
            goto L_0x02f6
        L_0x02c2:
            r0 = move-exception
            goto L_0x02d3
        L_0x02c4:
            r0 = move-exception
            r1 = r0
            r6 = r3
            goto L_0x031c
        L_0x02c8:
            r0 = move-exception
            r10 = 0
            goto L_0x02d3
        L_0x02cb:
            r0 = move-exception
            r10 = 0
            r1 = r0
            r6 = r10
            goto L_0x031c
        L_0x02d0:
            r0 = move-exception
            r10 = 0
            r3 = r10
        L_0x02d3:
            r8.a(r0)     // Catch:{ all -> 0x0319 }
            java.lang.String r6 = "Couldn't get experiment Ids. Using sentinel experiment ID 26670039"
            android.util.Log.e(r5, r6, r0)     // Catch:{ all -> 0x0319 }
            r6 = 1
            int[] r7 = new int[r6]     // Catch:{ all -> 0x0319 }
            r0 = 26670039(0x196f3d7, float:5.545119E-38)
            r6 = 0
            r7[r6] = r0     // Catch:{ all -> 0x0319 }
            if (r3 != 0) goto L_0x02e8
            r6 = r10
            goto L_0x02f6
        L_0x02e8:
            r3.close()     // Catch:{ RuntimeException -> 0x02ed }
            r6 = r10
            goto L_0x02f6
        L_0x02ed:
            r0 = move-exception
            r3 = r0
            r8.a(r3)
            android.util.Log.e(r5, r4, r3)
            r6 = r10
        L_0x02f6:
            apez r0 = defpackage.hws.a(r6, r7)
            if (r0 != 0) goto L_0x02fd
            goto L_0x032c
        L_0x02fd:
            boolean r3 = r1.c
            if (r3 != 0) goto L_0x0302
            goto L_0x0308
        L_0x0302:
            r1.c()
            r3 = 0
            r1.c = r3
        L_0x0308:
            aucj r3 = r1.b
            avrm r3 = (defpackage.avrm) r3
            r0.getClass()
            r3.l = r0
            int r0 = r3.a
            r4 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 | r4
            r3.a = r0
            goto L_0x032c
        L_0x0319:
            r0 = move-exception
            r1 = r0
            r6 = r3
        L_0x031c:
            if (r6 == 0) goto L_0x032a
            r6.close()     // Catch:{ RuntimeException -> 0x0322 }
            goto L_0x032a
        L_0x0322:
            r0 = move-exception
            r2 = r0
            r8.a(r2)
            android.util.Log.e(r5, r4, r2)
        L_0x032a:
            throw r1
        L_0x032b:
            r10 = 0
        L_0x032c:
            android.content.Context r0 = r8.a     // Catch:{ RuntimeException -> 0x0333 }
            java.lang.Integer r6 = defpackage.hpk.a(r0)     // Catch:{ RuntimeException -> 0x0333 }
            goto L_0x033d
        L_0x0333:
            r0 = move-exception
            r8.a(r0)
            java.lang.String r3 = "Couldn't get bootCount."
            android.util.Log.w(r3, r0)
            r6 = r10
        L_0x033d:
            if (r6 != 0) goto L_0x0340
            goto L_0x035d
        L_0x0340:
            int r0 = r6.intValue()
            long r3 = (long) r0
            boolean r0 = r1.c
            if (r0 != 0) goto L_0x034a
            goto L_0x0350
        L_0x034a:
            r1.c()
            r6 = 0
            r1.c = r6
        L_0x0350:
            aucj r0 = r1.b
            avrm r0 = (defpackage.avrm) r0
            int r6 = r0.a
            r7 = 2097152(0x200000, float:2.938736E-39)
            r6 = r6 | r7
            r0.a = r6
            r0.q = r3
        L_0x035d:
            aucj r0 = r1.i()
            avrm r0 = (defpackage.avrm) r0
            r1 = 0
            r19[r1] = r0
            java.util.List r0 = java.util.Arrays.asList(r19)
            boolean r3 = r15.c
            if (r3 != 0) goto L_0x0370
            goto L_0x0375
        L_0x0370:
            r15.c()
            r15.c = r1
        L_0x0375:
            aucj r1 = r15.b
            avrr r1 = (defpackage.avrr) r1
            aucx r3 = r1.h
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x0382
            goto L_0x038a
        L_0x0382:
            aucx r3 = r1.h
            aucx r3 = defpackage.aucj.a((defpackage.aucx) r3)
            r1.h = r3
        L_0x038a:
            aucx r1 = r1.h
            defpackage.auab.a((java.lang.Iterable) r0, (java.util.List) r1)
            avri r0 = defpackage.avri.f
            aucd r1 = r0.o()
            android.content.Context r0 = r8.a     // Catch:{ RuntimeException -> 0x03b3 }
            boolean r0 = defpackage.hwr.a(r0)     // Catch:{ RuntimeException -> 0x03b3 }
            boolean r3 = r1.c     // Catch:{ RuntimeException -> 0x03b3 }
            if (r3 != 0) goto L_0x03a0
            goto L_0x03a6
        L_0x03a0:
            r1.c()     // Catch:{ RuntimeException -> 0x03b3 }
            r3 = 0
            r1.c = r3     // Catch:{ RuntimeException -> 0x03b3 }
        L_0x03a6:
            aucj r3 = r1.b     // Catch:{ RuntimeException -> 0x03b3 }
            avri r3 = (defpackage.avri) r3     // Catch:{ RuntimeException -> 0x03b3 }
            int r4 = r3.a     // Catch:{ RuntimeException -> 0x03b3 }
            r6 = 1
            r4 = r4 | r6
            r3.a = r4     // Catch:{ RuntimeException -> 0x03b3 }
            r3.b = r0     // Catch:{ RuntimeException -> 0x03b3 }
            goto L_0x03bc
        L_0x03b3:
            r0 = move-exception
            r8.a(r0)
            java.lang.String r3 = "Couldn't get isUnmetered; leaving as default of false."
            android.util.Log.e(r5, r3, r0)
        L_0x03bc:
            android.content.Context r0 = r8.a     // Catch:{ RuntimeException -> 0x03da }
            boolean r0 = defpackage.hwr.b(r0)     // Catch:{ RuntimeException -> 0x03da }
            boolean r3 = r1.c     // Catch:{ RuntimeException -> 0x03da }
            if (r3 != 0) goto L_0x03c7
            goto L_0x03cd
        L_0x03c7:
            r1.c()     // Catch:{ RuntimeException -> 0x03da }
            r3 = 0
            r1.c = r3     // Catch:{ RuntimeException -> 0x03da }
        L_0x03cd:
            aucj r3 = r1.b     // Catch:{ RuntimeException -> 0x03da }
            avri r3 = (defpackage.avri) r3     // Catch:{ RuntimeException -> 0x03da }
            int r4 = r3.a     // Catch:{ RuntimeException -> 0x03da }
            r4 = r4 | 2
            r3.a = r4     // Catch:{ RuntimeException -> 0x03da }
            r3.c = r0     // Catch:{ RuntimeException -> 0x03da }
            goto L_0x03e3
        L_0x03da:
            r0 = move-exception
            r8.a(r0)
            java.lang.String r3 = "Couldn't get isCharging; leaving as default of false."
            android.util.Log.e(r5, r3, r0)
        L_0x03e3:
            r3 = 3
            android.content.Context r0 = r8.a     // Catch:{ RuntimeException -> 0x0409 }
            boolean r0 = defpackage.hwr.c(r0)     // Catch:{ RuntimeException -> 0x0409 }
            if (r0 != 0) goto L_0x03ed
            goto L_0x03ef
        L_0x03ed:
            r16 = 3
        L_0x03ef:
            boolean r0 = r1.c     // Catch:{ RuntimeException -> 0x0409 }
            if (r0 != 0) goto L_0x03f4
            goto L_0x03fa
        L_0x03f4:
            r1.c()     // Catch:{ RuntimeException -> 0x0409 }
            r4 = 0
            r1.c = r4     // Catch:{ RuntimeException -> 0x0409 }
        L_0x03fa:
            aucj r0 = r1.b     // Catch:{ RuntimeException -> 0x0409 }
            avri r0 = (defpackage.avri) r0     // Catch:{ RuntimeException -> 0x0409 }
            int r4 = r16 + -1
            r0.d = r4     // Catch:{ RuntimeException -> 0x0409 }
            int r4 = r0.a     // Catch:{ RuntimeException -> 0x0409 }
            r6 = 4
            r4 = r4 | r6
            r0.a = r4     // Catch:{ RuntimeException -> 0x0409 }
            goto L_0x042a
        L_0x0409:
            r0 = move-exception
            r8.a(r0)
            java.lang.String r4 = "Couldn't get autoTimeStatus; omitting."
            android.util.Log.e(r5, r4, r0)
            boolean r0 = r1.c
            if (r0 != 0) goto L_0x0418
            r4 = 0
            goto L_0x041e
        L_0x0418:
            r1.c()
            r4 = 0
            r1.c = r4
        L_0x041e:
            aucj r0 = r1.b
            avri r0 = (defpackage.avri) r0
            r0.d = r4
            int r4 = r0.a
            r6 = 4
            r4 = r4 | r6
            r0.a = r4
        L_0x042a:
            android.content.Context r0 = r8.a     // Catch:{ SecurityException -> 0x047c, RuntimeException -> 0x0472 }
            java.util.List r0 = defpackage.jgu.d(r0, r2)     // Catch:{ SecurityException -> 0x047c, RuntimeException -> 0x0472 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ iom -> 0x0470 }
        L_0x0434:
            boolean r2 = r0.hasNext()     // Catch:{ iom -> 0x0470 }
            if (r2 == 0) goto L_0x0456
            java.lang.Object r2 = r0.next()     // Catch:{ iom -> 0x0470 }
            android.accounts.Account r2 = (android.accounts.Account) r2     // Catch:{ iom -> 0x0470 }
            java.lang.String r4 = r2.name     // Catch:{ iom -> 0x0470 }
            if (r4 == 0) goto L_0x0434
            java.lang.String r2 = r2.name     // Catch:{ iom -> 0x0470 }
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ iom -> 0x0470 }
            java.lang.String r2 = r2.toLowerCase(r4)     // Catch:{ iom -> 0x0470 }
            java.lang.String r4 = "@google.com"
            boolean r2 = r2.endsWith(r4)     // Catch:{ iom -> 0x0470 }
            if (r2 == 0) goto L_0x0434
            r0 = 1
            goto L_0x0457
        L_0x0456:
            r0 = 0
        L_0x0457:
            boolean r2 = r1.c     // Catch:{ iom -> 0x0470 }
            if (r2 != 0) goto L_0x045c
            goto L_0x0462
        L_0x045c:
            r1.c()     // Catch:{ iom -> 0x0470 }
            r2 = 0
            r1.c = r2     // Catch:{ iom -> 0x0470 }
        L_0x0462:
            aucj r2 = r1.b     // Catch:{ iom -> 0x0470 }
            avri r2 = (defpackage.avri) r2     // Catch:{ iom -> 0x0470 }
            int r4 = r2.a     // Catch:{ iom -> 0x0470 }
            r4 = r4 | 8
            r2.a = r4     // Catch:{ iom -> 0x0470 }
            r2.e = r0     // Catch:{ iom -> 0x0470 }
            r2 = 0
            goto L_0x04a0
        L_0x0470:
            r0 = move-exception
            goto L_0x0483
        L_0x0472:
            r0 = move-exception
            r8.a(r0)     // Catch:{ iom -> 0x0470 }
            iom r2 = new iom     // Catch:{ iom -> 0x0470 }
            r2.<init>(r9, r0)     // Catch:{ iom -> 0x0470 }
            throw r2     // Catch:{ iom -> 0x0470 }
        L_0x047c:
            r0 = move-exception
            iom r2 = new iom     // Catch:{ iom -> 0x0470 }
            r2.<init>(r9, r0)     // Catch:{ iom -> 0x0470 }
            throw r2     // Catch:{ iom -> 0x0470 }
        L_0x0483:
            java.lang.String r2 = "Couldn't get isGooglerDevice; leaving as default of false."
            android.util.Log.e(r5, r2, r0)
            boolean r0 = r1.c
            if (r0 != 0) goto L_0x048e
            r2 = 0
            goto L_0x0494
        L_0x048e:
            r1.c()
            r2 = 0
            r1.c = r2
        L_0x0494:
            aucj r0 = r1.b
            avri r0 = (defpackage.avri) r0
            int r4 = r0.a
            r4 = r4 | 8
            r0.a = r4
            r0.e = r2
        L_0x04a0:
            aucj r0 = r1.i()
            avri r0 = (defpackage.avri) r0
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x04ab
            goto L_0x04b0
        L_0x04ab:
            r15.c()
            r15.c = r2
        L_0x04b0:
            aucj r1 = r15.b
            avrr r1 = (defpackage.avrr) r1
            r0.getClass()
            r1.l = r0
            int r0 = r1.a
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.a = r0
            aucj r0 = r15.i()
            avrr r0 = (defpackage.avrr) r0
            iop r1 = new iop
            r2 = r26
            r1.<init>(r2)
            defpackage.iva.a((java.lang.Object) r0)     // Catch:{ IOException -> 0x0655 }
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0655 }
            awyw r4 = defpackage.awyw.a     // Catch:{ IOException -> 0x0655 }
            awyx r4 = r4.a()     // Catch:{ IOException -> 0x0655 }
            java.lang.String r4 = r4.J()     // Catch:{ IOException -> 0x0655 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0655 }
            awyw r4 = defpackage.awyw.a     // Catch:{ IOException -> 0x0655 }
            awyx r4 = r4.a()     // Catch:{ IOException -> 0x0655 }
            boolean r4 = r4.H()     // Catch:{ IOException -> 0x0655 }
            if (r4 != 0) goto L_0x051c
            java.lang.String r4 = "https"
            java.lang.String r5 = r2.getProtocol()     // Catch:{ IOException -> 0x0655 }
            boolean r4 = r4.equals(r5)     // Catch:{ IOException -> 0x0655 }
            if (r4 == 0) goto L_0x04f7
            goto L_0x051c
        L_0x04f7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0655 }
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x0655 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0655 }
            int r2 = r2.length()     // Catch:{ IOException -> 0x0655 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0655 }
            int r2 = r2 + 54
            r3.<init>(r2)     // Catch:{ IOException -> 0x0655 }
            java.lang.String r2 = "Abort attempt to upload logs in plaintext: requestUrl="
            r3.append(r2)     // Catch:{ IOException -> 0x0655 }
            r3.append(r1)     // Catch:{ IOException -> 0x0655 }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x0655 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0655 }
            throw r0     // Catch:{ IOException -> 0x0655 }
        L_0x051c:
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ IOException -> 0x0655 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ IOException -> 0x0655 }
            r4 = 1
            r2.setDoOutput(r4)     // Catch:{ IOException -> 0x0655 }
            r4 = 0
            r2.setInstanceFollowRedirects(r4)     // Catch:{ IOException -> 0x0655 }
            r2.setChunkedStreamingMode(r4)     // Catch:{ IOException -> 0x0655 }
            awyw r4 = defpackage.awyw.a     // Catch:{ IOException -> 0x0655 }
            awyx r4 = r4.a()     // Catch:{ IOException -> 0x0655 }
            long r4 = r4.G()     // Catch:{ IOException -> 0x0655 }
            int r5 = (int) r4     // Catch:{ IOException -> 0x0655 }
            r4 = 1
            int r5 = java.lang.Math.max(r4, r5)     // Catch:{ IOException -> 0x0655 }
            r2.setConnectTimeout(r5)     // Catch:{ IOException -> 0x0655 }
            awyw r4 = defpackage.awyw.a     // Catch:{ IOException -> 0x0655 }
            awyx r4 = r4.a()     // Catch:{ IOException -> 0x0655 }
            long r4 = r4.I()     // Catch:{ IOException -> 0x0655 }
            int r5 = (int) r4     // Catch:{ IOException -> 0x0655 }
            r4 = 1
            int r4 = java.lang.Math.max(r4, r5)     // Catch:{ IOException -> 0x0655 }
            r2.setReadTimeout(r4)     // Catch:{ IOException -> 0x0655 }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r5 = "gzip"
            r2.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x0655 }
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/x-gzip"
            r2.setRequestProperty(r4, r5)     // Catch:{ IOException -> 0x0655 }
            java.lang.String r4 = "Cookie"
            java.lang.String r5 = "NID="
            java.lang.String r6 = r0.g     // Catch:{ IOException -> 0x0655 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x0655 }
            int r7 = r6.length()     // Catch:{ IOException -> 0x0655 }
            if (r7 != 0) goto L_0x0577
            java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x0655 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x0655 }
            goto L_0x057b
        L_0x0577:
            java.lang.String r6 = r5.concat(r6)     // Catch:{ IOException -> 0x0655 }
        L_0x057b:
            r2.setRequestProperty(r4, r6)     // Catch:{ IOException -> 0x0655 }
            java.io.OutputStream r4 = r2.getOutputStream()     // Catch:{ all -> 0x064c }
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x064c }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x064c }
            int r6 = r6.length()     // Catch:{ all -> 0x064c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x064c }
            int r6 = r6 + 20
            r7.<init>(r6)     // Catch:{ all -> 0x064c }
            java.lang.String r6 = "Sending logRequest: "
            r7.append(r6)     // Catch:{ all -> 0x064c }
            r7.append(r5)     // Catch:{ all -> 0x064c }
            r7.toString()     // Catch:{ all -> 0x064c }
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x064c }
            r5.<init>(r4)     // Catch:{ all -> 0x064c }
            r0.a(r5)     // Catch:{ all -> 0x063c }
            r5.close()     // Catch:{ all -> 0x064c }
            java.lang.String r0 = "Set-Cookie"
            java.lang.String r0 = r2.getHeaderField(r0)     // Catch:{ all -> 0x064c }
            if (r0 != 0) goto L_0x05b4
            goto L_0x05ef
        L_0x05b4:
            boolean r4 = r0.isEmpty()     // Catch:{ all -> 0x064c }
            if (r4 != 0) goto L_0x05ef
            java.util.List r0 = java.net.HttpCookie.parse(r0)     // Catch:{ all -> 0x064c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x064c }
        L_0x05c2:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x064c }
            if (r4 == 0) goto L_0x05ef
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x064c }
            java.net.HttpCookie r4 = (java.net.HttpCookie) r4     // Catch:{ all -> 0x064c }
            java.lang.String r5 = r4.getName()     // Catch:{ all -> 0x064c }
            java.lang.String r6 = "NID"
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x064c }
            if (r5 == 0) goto L_0x05c2
            java.lang.String r5 = r4.getValue()     // Catch:{ all -> 0x064c }
            if (r5 == 0) goto L_0x05c2
            com.google.android.gms.pseudonymous.PseudonymousIdToken r5 = new com.google.android.gms.pseudonymous.PseudonymousIdToken     // Catch:{ all -> 0x064c }
            java.lang.String r4 = r4.getValue()     // Catch:{ all -> 0x064c }
            r5.<init>(r4)     // Catch:{ all -> 0x064c }
            android.content.Context r4 = r1.a     // Catch:{ all -> 0x064c }
            defpackage.zol.a((com.google.android.gms.pseudonymous.PseudonymousIdToken) r5, (android.content.Context) r4)     // Catch:{ all -> 0x064c }
            goto L_0x05c2
        L_0x05ef:
            int r0 = r2.getResponseCode()     // Catch:{ all -> 0x064c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x064c }
            r4 = 25
            r1.<init>(r4)     // Catch:{ all -> 0x064c }
            java.lang.String r4 = "Got response: "
            r1.append(r4)     // Catch:{ all -> 0x064c }
            r1.append(r0)     // Catch:{ all -> 0x064c }
            r1.toString()     // Catch:{ all -> 0x064c }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L_0x0621
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 >= r1) goto L_0x061e
            r2.disconnect()     // Catch:{ IOException -> 0x0655 }
            ina r0 = r28.d()
            r1 = r27
            r0.a(r1, r3)
            inb r0 = r0.a()
            return r0
        L_0x061e:
            r1 = r27
            goto L_0x0623
        L_0x0621:
            r1 = r27
        L_0x0623:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x064a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x064a }
            r5 = 37
            r4.<init>(r5)     // Catch:{ all -> 0x064a }
            java.lang.String r5 = "Received HTTP status code "
            r4.append(r5)     // Catch:{ all -> 0x064a }
            r4.append(r0)     // Catch:{ all -> 0x064a }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x064a }
            r3.<init>(r0)     // Catch:{ all -> 0x064a }
            throw r3     // Catch:{ all -> 0x064a }
        L_0x063c:
            r0 = move-exception
            r1 = r27
            r3 = r0
            r5.close()     // Catch:{ all -> 0x0644 }
            goto L_0x0649
        L_0x0644:
            r0 = move-exception
            r4 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r4)     // Catch:{ all -> 0x064a }
        L_0x0649:
            throw r3     // Catch:{ all -> 0x064a }
        L_0x064a:
            r0 = move-exception
            goto L_0x064f
        L_0x064c:
            r0 = move-exception
            r1 = r27
        L_0x064f:
            r2.disconnect()     // Catch:{ IOException -> 0x0653 }
            throw r0     // Catch:{ IOException -> 0x0653 }
        L_0x0653:
            r0 = move-exception
            goto L_0x0658
        L_0x0655:
            r0 = move-exception
            r1 = r27
        L_0x0658:
            java.lang.String r2 = "ClearcutSosFix"
            java.lang.String r3 = "Failed to send SOS"
            android.util.Log.e(r2, r3, r0)
            ina r0 = r28.d()
            r2 = 5
            r0.a(r1, r2)
            inb r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iol.b(inb):inb");
    }
}
