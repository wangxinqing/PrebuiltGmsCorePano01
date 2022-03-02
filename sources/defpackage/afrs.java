package defpackage;

/* renamed from: afrs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afrs implements afry {
    private final afqu a;
    private final agzs b;
    private final afkn c;
    private final String d;
    private final afsb e;
    private final aflf f;
    private final int g;
    private final int h;

    public afrs(afqu afqu, agzs agzs, afkn afkn, int i, afsb afsb, aflf aflf, int i2) {
        this.a = afqu;
        this.b = agzs;
        this.c = afkn;
        this.h = i;
        this.d = afsq.b(afkn);
        this.e = afsb;
        this.f = aflf;
        this.g = i2;
    }

    static void a(afle afle, afkn afkn, int i, afqu afqu) {
        aflh a2 = afqu.a(afkn, i);
        afli a3 = afqu.a(a2);
        if (a3 != null) {
            aucd aucd = (aucd) a3.c(5);
            aucd.a((aucj) a3);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            afli afli = (afli) aucd.b;
            afli.c = afle.g;
            afli.a |= 2;
            if (!afqu.a(a2, (afli) aucd.i())) {
                afsh.a("%s: Unable to write back download info for file entry with %s", (Object) "DownloaderCallbackImpl", (Object) a2);
                afkd a4 = afkf.a();
                a4.a = afke.UNABLE_TO_UPDATE_FILE_STATE_ERROR;
                throw a4.a();
            }
            return;
        }
        afsh.a("%s: Shared file not found, newFileKey = %s", (Object) "DownloaderCallbackImpl", (Object) a2);
        afkd a5 = afkf.a();
        a5.a = afke.SHARED_FILE_NOT_FOUND_ERROR;
        throw a5.a();
    }

    public final void a() {
        a(afle.DOWNLOAD_FAILED, this.c, this.h, this.a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0155, code lost:
        r12 = r0.e(r3);
        r14 = r0.e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015f, code lost:
        if (r12 <= r14) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0161, code lost:
        r6 = defpackage.aojg.g.o();
        r7 = r5.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016b, code lost:
        if (r6.c != false) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016e, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0174, code lost:
        r8 = (defpackage.aojg) r6.b;
        r7.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017b, code lost:
        r18 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r3 = r8.a | 1;
        r8.a = r3;
        r8.b = r7;
        r3 = r3 | 2;
        r8.a = r3;
        r8.c = r10;
        r5 = r5.c;
        r5.getClass();
        r8.a = r3 | 4;
        r8.d = r5;
        r9.a((defpackage.aojg) r6.i(), 3, r12, r14, r11.b, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01aa, code lost:
        r18 = r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.net.Uri r20) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.String r3 = "FileValidator"
            afkn r4 = r1.c
            int r0 = r4.a
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r4.h
            goto L_0x0013
        L_0x0011:
            java.lang.String r0 = r4.f
        L_0x0013:
            agzs r5 = r1.b
            int r6 = defpackage.afru.a
            r6 = 2
            r7 = 1
            r8 = 0
            boolean r9 = r5.c(r2)     // Catch:{ IOException -> 0x0295 }
            r10 = 3
            if (r9 == 0) goto L_0x0274
            int r9 = r4.e     // Catch:{ IOException -> 0x0295 }
            int r9 = defpackage.afkm.a(r9)     // Catch:{ IOException -> 0x0295 }
            if (r9 != 0) goto L_0x002a
            goto L_0x002d
        L_0x002a:
            if (r9 != r6) goto L_0x002d
            goto L_0x003d
        L_0x002d:
            int r9 = r4.e     // Catch:{ IOException -> 0x0295 }
            int r9 = defpackage.afkm.a(r9)     // Catch:{ IOException -> 0x0295 }
            if (r9 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r9 = 1
        L_0x0037:
            boolean r5 = defpackage.afru.a(r5, r2, r0, r9)     // Catch:{ IOException -> 0x0295 }
            if (r5 == 0) goto L_0x0257
        L_0x003d:
            afkn r0 = r1.c
            int r0 = r0.a
            r0 = r0 & 32
            if (r0 == 0) goto L_0x024b
            android.net.Uri r3 = defpackage.afrt.a(r20)
            afkn r0 = r1.c
            boolean r0 = defpackage.afsq.a((defpackage.afkn) r0)
            java.lang.String r4 = "DownloaderCallbackImpl"
            if (r0 == 0) goto L_0x00e8
            afsb r9 = r1.e
            agzs r0 = r1.b
            aflf r5 = r1.f
            int r10 = r1.g
            afkn r11 = r1.c
            java.lang.String r14 = r11.b
            afsa r11 = new afsa     // Catch:{ IOException -> 0x00cd }
            r11.<init>(r3)     // Catch:{ IOException -> 0x00cd }
            agzk[] r12 = new defpackage.agzk[r8]     // Catch:{ IOException -> 0x00cd }
            r0.a(r2, r11, r12)     // Catch:{ IOException -> 0x00cd }
            aojg r11 = defpackage.aojg.g     // Catch:{ IOException -> 0x00c4 }
            aucd r11 = r11.o()     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r12 = r5.b     // Catch:{ IOException -> 0x00c4 }
            boolean r13 = r11.c     // Catch:{ IOException -> 0x00c4 }
            if (r13 != 0) goto L_0x0076
            goto L_0x007b
        L_0x0076:
            r11.c()     // Catch:{ IOException -> 0x00c4 }
            r11.c = r8     // Catch:{ IOException -> 0x00c4 }
        L_0x007b:
            aucj r13 = r11.b     // Catch:{ IOException -> 0x00c4 }
            aojg r13 = (defpackage.aojg) r13     // Catch:{ IOException -> 0x00c4 }
            r12.getClass()     // Catch:{ IOException -> 0x00c4 }
            int r15 = r13.a     // Catch:{ IOException -> 0x00c4 }
            r15 = r15 | r7
            r13.a = r15     // Catch:{ IOException -> 0x00c4 }
            r13.b = r12     // Catch:{ IOException -> 0x00c4 }
            r12 = r15 | 2
            r13.a = r12     // Catch:{ IOException -> 0x00c4 }
            r13.c = r10     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r5 = r5.c     // Catch:{ IOException -> 0x00c4 }
            r5.getClass()     // Catch:{ IOException -> 0x00c4 }
            r10 = r12 | 4
            r13.a = r10     // Catch:{ IOException -> 0x00c4 }
            r13.d = r5     // Catch:{ IOException -> 0x00c4 }
            aucj r5 = r11.i()     // Catch:{ IOException -> 0x00c4 }
            r10 = r5
            aojg r10 = (defpackage.aojg) r10     // Catch:{ IOException -> 0x00c4 }
            ahcl r5 = defpackage.ahcl.a()     // Catch:{ IOException -> 0x00c4 }
            agzk[] r11 = new defpackage.agzk[r8]     // Catch:{ IOException -> 0x00c4 }
            java.lang.Object r3 = r0.a(r3, r5, r11)     // Catch:{ IOException -> 0x00c4 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ IOException -> 0x00c4 }
            long r12 = r3.longValue()     // Catch:{ IOException -> 0x00c4 }
            r11 = 5
            long r15 = r0.e(r2)     // Catch:{ IOException -> 0x00c4 }
            r17 = 0
            r3 = r14
            r14 = r15
            r16 = r3
            r9.a(r10, r11, r12, r14, r16, r17)     // Catch:{ IOException -> 0x00c4 }
            r0.a((android.net.Uri) r2)     // Catch:{ IOException -> 0x00c4 }
            goto L_0x024b
        L_0x00c4:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r8] = r4
            r0[r7] = r2
            goto L_0x024b
        L_0x00cd:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r8] = r4
            r3[r7] = r2
            java.lang.String r2 = "%s: Failed to apply zip download transform for file %s."
            defpackage.afsh.a((java.lang.Throwable) r0, (java.lang.String) r2, (java.lang.Object[]) r3)
            afkd r2 = defpackage.afkf.a()
            afke r3 = defpackage.afke.DOWNLOAD_TRANSFORM_IO_ERROR
            r2.a = r3
            r2.c = r0
            afkf r0 = r2.a()
            throw r0
        L_0x00e8:
            android.net.Uri$Builder r0 = r20.buildUpon()     // Catch:{ IllegalArgumentException -> 0x0230 }
            afkn r2 = r1.c     // Catch:{ IllegalArgumentException -> 0x0230 }
            avlu r2 = r2.g     // Catch:{ IllegalArgumentException -> 0x0230 }
            if (r2 == 0) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            avlu r2 = defpackage.avlu.b     // Catch:{ IllegalArgumentException -> 0x0230 }
        L_0x00f5:
            java.lang.String r2 = defpackage.ahcx.a((defpackage.avlu) r2)     // Catch:{ IllegalArgumentException -> 0x0230 }
            android.net.Uri$Builder r0 = r0.encodedFragment(r2)     // Catch:{ IllegalArgumentException -> 0x0230 }
            android.net.Uri r2 = r0.build()     // Catch:{ IllegalArgumentException -> 0x0230 }
            afsb r9 = r1.e
            agzs r0 = r1.b
            aflf r5 = r1.f
            int r10 = r1.g
            afkn r11 = r1.c
            ahcj r12 = defpackage.ahcj.a()     // Catch:{ IOException -> 0x0212 }
            agzk[] r13 = new defpackage.agzk[r8]     // Catch:{ IOException -> 0x0212 }
            java.lang.Object r12 = r0.a(r2, r12, r13)     // Catch:{ IOException -> 0x0212 }
            java.io.InputStream r12 = (java.io.InputStream) r12     // Catch:{ IOException -> 0x0212 }
            ahcm r13 = defpackage.ahcm.a()     // Catch:{ all -> 0x0204 }
            agzk[] r14 = new defpackage.agzk[r8]     // Catch:{ all -> 0x0204 }
            java.lang.Object r13 = r0.a(r3, r13, r14)     // Catch:{ all -> 0x0204 }
            java.io.OutputStream r13 = (java.io.OutputStream) r13     // Catch:{ all -> 0x0204 }
            defpackage.anmr.a((java.io.InputStream) r12, (java.io.OutputStream) r13)     // Catch:{ all -> 0x01f6 }
            if (r13 == 0) goto L_0x012b
            r13.close()     // Catch:{ all -> 0x0204 }
        L_0x012b:
            if (r12 != 0) goto L_0x012e
        L_0x012d:
            goto L_0x0132
        L_0x012e:
            r12.close()     // Catch:{ IOException -> 0x0212 }
            goto L_0x012d
        L_0x0132:
            int r12 = r11.a     // Catch:{ IOException -> 0x01be }
            r12 = r12 & 32
            if (r12 == 0) goto L_0x01b6
            avlu r12 = r11.g     // Catch:{ IOException -> 0x01be }
            if (r12 == 0) goto L_0x013d
            goto L_0x013f
        L_0x013d:
            avlu r12 = defpackage.avlu.b     // Catch:{ IOException -> 0x01be }
        L_0x013f:
            aucx r12 = r12.a     // Catch:{ IOException -> 0x01be }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ IOException -> 0x01be }
        L_0x0145:
            boolean r13 = r12.hasNext()     // Catch:{ IOException -> 0x01be }
            if (r13 == 0) goto L_0x01b3
            java.lang.Object r13 = r12.next()     // Catch:{ IOException -> 0x01be }
            avlt r13 = (defpackage.avlt) r13     // Catch:{ IOException -> 0x01be }
            int r13 = r13.a     // Catch:{ IOException -> 0x01be }
            if (r13 != r7) goto L_0x01ad
            long r12 = r0.e(r3)     // Catch:{ IOException -> 0x01be }
            long r14 = r0.e(r2)     // Catch:{ IOException -> 0x01be }
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x01aa
            aojg r16 = defpackage.aojg.g     // Catch:{ IOException -> 0x01be }
            aucd r6 = r16.o()     // Catch:{ IOException -> 0x01be }
            java.lang.String r7 = r5.b     // Catch:{ IOException -> 0x01be }
            boolean r8 = r6.c     // Catch:{ IOException -> 0x01be }
            if (r8 != 0) goto L_0x016e
            goto L_0x0174
        L_0x016e:
            r6.c()     // Catch:{ IOException -> 0x01be }
            r8 = 0
            r6.c = r8     // Catch:{ IOException -> 0x01be }
        L_0x0174:
            aucj r8 = r6.b     // Catch:{ IOException -> 0x01be }
            aojg r8 = (defpackage.aojg) r8     // Catch:{ IOException -> 0x01be }
            r7.getClass()     // Catch:{ IOException -> 0x01be }
            r18 = r3
            int r3 = r8.a     // Catch:{ IOException -> 0x01bc }
            r16 = 1
            r3 = r3 | 1
            r8.a = r3     // Catch:{ IOException -> 0x01bc }
            r8.b = r7     // Catch:{ IOException -> 0x01bc }
            r7 = 2
            r3 = r3 | r7
            r8.a = r3     // Catch:{ IOException -> 0x01bc }
            r8.c = r10     // Catch:{ IOException -> 0x01bc }
            java.lang.String r5 = r5.c     // Catch:{ IOException -> 0x01bc }
            r5.getClass()     // Catch:{ IOException -> 0x01bc }
            r3 = r3 | 4
            r8.a = r3     // Catch:{ IOException -> 0x01bc }
            r8.d = r5     // Catch:{ IOException -> 0x01bc }
            aucj r3 = r6.i()     // Catch:{ IOException -> 0x01bc }
            r10 = r3
            aojg r10 = (defpackage.aojg) r10     // Catch:{ IOException -> 0x01bc }
            java.lang.String r3 = r11.b     // Catch:{ IOException -> 0x01bc }
            r11 = 3
            r17 = 0
            r16 = r3
            r9.a(r10, r11, r12, r14, r16, r17)     // Catch:{ IOException -> 0x01bc }
            goto L_0x01b8
        L_0x01aa:
            r18 = r3
            goto L_0x01b8
        L_0x01ad:
            r18 = r3
            r6 = 2
            r7 = 1
            r8 = 0
            goto L_0x0145
        L_0x01b3:
            r18 = r3
            goto L_0x01b8
        L_0x01b6:
            r18 = r3
        L_0x01b8:
            r0.a((android.net.Uri) r2)     // Catch:{ IOException -> 0x01bc }
            goto L_0x01ca
        L_0x01bc:
            r0 = move-exception
            goto L_0x01c1
        L_0x01be:
            r0 = move-exception
            r18 = r3
        L_0x01c1:
            r3 = 2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r3 = 0
            r0[r3] = r4
            r3 = 1
            r0[r3] = r2
        L_0x01ca:
            agzs r0 = r1.b
            java.lang.String r2 = r1.d
            afkn r3 = r1.c
            int r3 = r3.e
            int r3 = defpackage.afkm.a(r3)
            if (r3 == 0) goto L_0x01da
            r7 = r3
            goto L_0x01db
        L_0x01da:
            r7 = 1
        L_0x01db:
            r3 = r18
            boolean r0 = defpackage.afru.a(r0, r3, r2, r7)
            if (r0 == 0) goto L_0x01e4
            goto L_0x024b
        L_0x01e4:
            java.lang.String r0 = "%s: Final file checksum verification failed. %s."
            defpackage.afsh.a((java.lang.String) r0, (java.lang.Object) r4, (java.lang.Object) r3)
            afkd r0 = defpackage.afkf.a()
            afke r2 = defpackage.afke.FINAL_FILE_CHECKSUM_MISMATCH_ERROR
            r0.a = r2
            afkf r0 = r0.a()
            throw r0
        L_0x01f6:
            r0 = move-exception
            r3 = r0
            if (r13 == 0) goto L_0x0203
            r13.close()     // Catch:{ all -> 0x01fe }
            goto L_0x0203
        L_0x01fe:
            r0 = move-exception
            r5 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r5)     // Catch:{ all -> 0x0204 }
        L_0x0203:
            throw r3     // Catch:{ all -> 0x0204 }
        L_0x0204:
            r0 = move-exception
            r3 = r0
            if (r12 == 0) goto L_0x0211
            r12.close()     // Catch:{ all -> 0x020c }
            goto L_0x0211
        L_0x020c:
            r0 = move-exception
            r5 = r0
            defpackage.apev.a((java.lang.Throwable) r3, (java.lang.Throwable) r5)     // Catch:{ IOException -> 0x0212 }
        L_0x0211:
            throw r3     // Catch:{ IOException -> 0x0212 }
        L_0x0212:
            r0 = move-exception
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r5 = 0
            r3[r5] = r4
            r4 = 1
            r3[r4] = r2
            java.lang.String r2 = "%s: Failed to apply download transform for file %s."
            defpackage.afsh.a((java.lang.Throwable) r0, (java.lang.String) r2, (java.lang.Object[]) r3)
            afkd r2 = defpackage.afkf.a()
            afke r3 = defpackage.afke.DOWNLOAD_TRANSFORM_IO_ERROR
            r2.a = r3
            r2.c = r0
            afkf r0 = r2.a()
            throw r0
        L_0x0230:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.String r3 = "%s: Exception while trying to serialize download transform"
            defpackage.afsh.a((java.lang.Throwable) r0, (java.lang.String) r3, (java.lang.Object[]) r2)
            afkd r2 = defpackage.afkf.a()
            afke r3 = defpackage.afke.UNABLE_TO_SERIALIZE_DOWNLOAD_TRANSFORM_ERROR
            r2.a = r3
            r2.c = r0
            afkf r0 = r2.a()
            throw r0
        L_0x024b:
            afle r0 = defpackage.afle.DOWNLOAD_COMPLETE
            afkn r2 = r1.c
            int r3 = r1.h
            afqu r4 = r1.a
            a(r0, r2, r3, r4)
            return
        L_0x0257:
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x0295 }
            r6 = 0
            r5[r6] = r3     // Catch:{ IOException -> 0x0295 }
            r6 = 1
            r5[r6] = r2     // Catch:{ IOException -> 0x0295 }
            r2 = 2
            r5[r2] = r0     // Catch:{ IOException -> 0x0295 }
            java.lang.String r0 = "%s: Downloaded file at uri = %s, checksum = %s verification failed"
            defpackage.afsh.b(r0, r5)     // Catch:{ IOException -> 0x0295 }
            afkd r0 = defpackage.afkf.a()     // Catch:{ IOException -> 0x0295 }
            afke r2 = defpackage.afke.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR     // Catch:{ IOException -> 0x0295 }
            r0.a = r2     // Catch:{ IOException -> 0x0295 }
            afkf r0 = r0.a()     // Catch:{ IOException -> 0x0295 }
            throw r0     // Catch:{ IOException -> 0x0295 }
        L_0x0274:
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x0295 }
            r5 = 0
            r0[r5] = r3     // Catch:{ IOException -> 0x0295 }
            java.lang.String r5 = defpackage.afsq.b(r4)     // Catch:{ IOException -> 0x0295 }
            r6 = 1
            r0[r6] = r5     // Catch:{ IOException -> 0x0295 }
            r5 = 2
            r0[r5] = r2     // Catch:{ IOException -> 0x0295 }
            java.lang.String r2 = "%s: Downloaded file %s is not present at %s"
            defpackage.afsh.b(r2, r0)     // Catch:{ IOException -> 0x0295 }
            afkd r0 = defpackage.afkf.a()     // Catch:{ IOException -> 0x0295 }
            afke r2 = defpackage.afke.DOWNLOADED_FILE_NOT_FOUND_ERROR     // Catch:{ IOException -> 0x0295 }
            r0.a = r2     // Catch:{ IOException -> 0x0295 }
            afkf r0 = r0.a()     // Catch:{ IOException -> 0x0295 }
            throw r0     // Catch:{ IOException -> 0x0295 }
        L_0x0295:
            r0 = move-exception
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r5 = 0
            r2[r5] = r3
            java.lang.String r3 = defpackage.afsq.b(r4)
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "%s: Failed to validate download file %s"
            defpackage.afsh.a((java.lang.Throwable) r0, (java.lang.String) r3, (java.lang.Object[]) r2)
            afkd r2 = defpackage.afkf.a()
            afke r3 = defpackage.afke.UNABLE_TO_VALIDATE_DOWNLOAD_FILE_ERROR
            r2.a = r3
            r2.c = r0
            afkf r0 = r2.a()
            goto L_0x02b8
        L_0x02b7:
            throw r0
        L_0x02b8:
            goto L_0x02b7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afrs.a(android.net.Uri):void");
    }
}
