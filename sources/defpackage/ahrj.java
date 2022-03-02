package defpackage;

/* renamed from: ahrj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahrj implements Runnable {
    final /* synthetic */ ahrs a;

    public ahrj(ahrs ahrs) {
        this.a = ahrs;
    }

    private final void a() {
        ahrs ahrs = this.a;
        if (ahrs.f != null) {
            ahrs.e.post(new ahri(this));
        }
        ahrs ahrs2 = this.a;
        if (ahrs2.d) {
            ahrs2.d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:180:0x035a A[Catch:{ InterruptedException -> 0x04a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0409 A[Catch:{ InterruptedException -> 0x04a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0423 A[SYNTHETIC, Splitter:B:220:0x0423] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0460 A[SYNTHETIC, Splitter:B:244:0x0460] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0470 A[SYNTHETIC, Splitter:B:254:0x0470] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0491  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r29 = this;
            r1 = r29
            java.lang.String r2 = "Failed to delete file "
            java.io.File r3 = new java.io.File
            ahrs r4 = r1.a
            java.lang.String r4 = r4.c
            r3.<init>(r4)
            java.lang.String[] r4 = r3.list()
            if (r4 != 0) goto L_0x0031
            ahrs r2 = r1.a
            java.lang.String r3 = r2.c
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Failed to list files in directory:"
            int r5 = r3.length()
            if (r5 != 0) goto L_0x0029
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
            goto L_0x002d
        L_0x0029:
            java.lang.String r3 = r4.concat(r3)
        L_0x002d:
            r2.a((java.lang.String) r3)
            return
        L_0x0031:
            int r5 = r4.length
            if (r5 == 0) goto L_0x0502
            ahuk r6 = defpackage.ahuk.a
            boolean r6 = r6.b((java.io.File) r3)
            if (r6 != 0) goto L_0x04f0
            java.lang.String r6 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x04ce }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ IOException -> 0x04ce }
            java.io.FileReader r8 = new java.io.FileReader     // Catch:{ IOException -> 0x04ce }
            java.io.File r6 = defpackage.ahuz.b(r6)     // Catch:{ IOException -> 0x04ce }
            r8.<init>(r6)     // Catch:{ IOException -> 0x04ce }
            r7.<init>(r8)     // Catch:{ IOException -> 0x04ce }
            int r6 = defpackage.ahuz.a((java.io.BufferedReader) r7)     // Catch:{ NumberFormatException -> 0x04be }
            int r8 = defpackage.ahuz.a((java.io.BufferedReader) r7)     // Catch:{ NumberFormatException -> 0x04be }
            int r9 = defpackage.ahuz.a((java.io.BufferedReader) r7)     // Catch:{ NumberFormatException -> 0x04be }
            r10 = 2
            r11 = 1
            r12 = 0
            if (r6 < r10) goto L_0x0067
            int r13 = defpackage.ahuz.a((java.io.BufferedReader) r7)     // Catch:{ NumberFormatException -> 0x04be }
            if (r13 != r11) goto L_0x0067
            r13 = 1
            goto L_0x0068
        L_0x0067:
            r13 = 0
        L_0x0068:
            r14 = 3
            if (r6 < r14) goto L_0x0076
            int r15 = defpackage.ahuz.a((java.io.BufferedReader) r7)     // Catch:{ NumberFormatException -> 0x04be }
            int r16 = defpackage.ahuz.a((java.io.BufferedReader) r7)     // Catch:{ NumberFormatException -> 0x04be }
            r14 = r16
            goto L_0x0078
        L_0x0076:
            r14 = 0
            r15 = 0
        L_0x0078:
            r11 = 4
            if (r6 < r11) goto L_0x0080
            int r6 = defpackage.ahuz.a((java.io.BufferedReader) r7)     // Catch:{ NumberFormatException -> 0x04be }
            goto L_0x0081
        L_0x0080:
            r6 = 0
        L_0x0081:
            ahuz r11 = new ahuz     // Catch:{ NumberFormatException -> 0x04be }
            r11.<init>(r13)     // Catch:{ NumberFormatException -> 0x04be }
            r11.a = r8     // Catch:{ NumberFormatException -> 0x04be }
            r11.b = r9     // Catch:{ NumberFormatException -> 0x04be }
            r11.c = r15     // Catch:{ NumberFormatException -> 0x04be }
            r11.d = r14     // Catch:{ NumberFormatException -> 0x04be }
            r11.e = r6     // Catch:{ NumberFormatException -> 0x04be }
            r7.close()     // Catch:{ IOException -> 0x04ce }
            int r6 = r11.a()     // Catch:{ IOException -> 0x04ce }
            if (r6 == 0) goto L_0x00a1
            int r6 = r11.b()     // Catch:{ IOException -> 0x04ce }
            if (r6 == 0) goto L_0x00a1
            r6 = 1
            goto L_0x00a2
        L_0x00a1:
            r6 = 0
        L_0x00a2:
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ IOException -> 0x04ce }
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x04ce }
            boolean r8 = r11.c()     // Catch:{ IOException -> 0x04ce }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ IOException -> 0x04ce }
            r7[r12] = r8     // Catch:{ IOException -> 0x04ce }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)     // Catch:{ IOException -> 0x04ce }
            r9 = 1
            r7[r9] = r8     // Catch:{ IOException -> 0x04ce }
            boolean r7 = r11.c()     // Catch:{ IOException -> 0x04ce }
            if (r7 == 0) goto L_0x00be
            goto L_0x00eb
        L_0x00be:
            if (r6 != 0) goto L_0x00eb
            java.lang.String r2 = java.lang.String.valueOf(r11)     // Catch:{ IOException -> 0x04ce }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x04ce }
            int r4 = r4.length()     // Catch:{ IOException -> 0x04ce }
            int r4 = r4 + 51
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x04ce }
            r5.<init>(r4)     // Catch:{ IOException -> 0x04ce }
            java.lang.String r4 = "Not uploading session since missing required data: "
            r5.append(r4)     // Catch:{ IOException -> 0x04ce }
            r5.append(r2)     // Catch:{ IOException -> 0x04ce }
            r5.toString()     // Catch:{ IOException -> 0x04ce }
            ahrs r2 = r1.a     // Catch:{ IOException -> 0x04ce }
            boolean r4 = r2.d     // Catch:{ IOException -> 0x04ce }
            if (r4 == 0) goto L_0x00e7
            r2.a((java.io.File) r3)     // Catch:{ IOException -> 0x04ce }
        L_0x00e7:
            r29.a()     // Catch:{ IOException -> 0x04ce }
            return
        L_0x00eb:
            ahrs r3 = r1.a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r8 = 0
            r9 = 0
            r11 = 0
        L_0x00f5:
            java.lang.String r13 = "uploadedSeq"
            if (r8 >= r5) goto L_0x012c
            r14 = r4[r8]
            java.lang.String r15 = "sessionId"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L_0x010f
            java.lang.String r9 = r3.b(r14)
            boolean r13 = defpackage.ahvx.a((java.lang.String) r9)
            if (r13 == 0) goto L_0x0129
            r9 = 0
            goto L_0x0129
        L_0x010f:
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x011b
            java.lang.String r11 = r3.b(r14)
            goto L_0x0129
        L_0x011b:
            java.lang.String r13 = "sessionSummary"
            boolean r13 = r14.equals(r13)
            if (r13 != 0) goto L_0x0128
            r6.add(r14)
            goto L_0x0129
        L_0x0128:
        L_0x0129:
            int r8 = r8 + 1
            goto L_0x00f5
        L_0x012c:
            if (r9 != 0) goto L_0x0135
            java.lang.String r9 = defpackage.ahui.b()
            r3.c(r9)
        L_0x0135:
            ahrl r4 = new ahrl
            r4.<init>(r3, r6, r9)
            java.lang.String r3 = ","
            if (r11 == 0) goto L_0x0177
            java.lang.String r5 = r11.trim()
            java.lang.String[] r5 = r5.split(r3)
            int r6 = r5.length
            r8 = 0
        L_0x0148:
            if (r8 >= r6) goto L_0x0177
            r9 = r5[r8]
            boolean r11 = defpackage.ahvx.a((java.lang.String) r9)
            if (r11 != 0) goto L_0x0174
            java.lang.String r11 = r9.trim()     // Catch:{ NumberFormatException -> 0x015e }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x015e }
            r4.a((int) r11)     // Catch:{ NumberFormatException -> 0x015e }
            goto L_0x0174
        L_0x015e:
            r0 = move-exception
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r11 = "Invalid number, ignoring seqNum "
            int r14 = r9.length()
            if (r14 != 0) goto L_0x0171
            java.lang.String r9 = new java.lang.String
            r9.<init>(r11)
            goto L_0x0174
        L_0x0171:
            r11.concat(r9)
        L_0x0174:
            int r8 = r8 + 1
            goto L_0x0148
        L_0x0177:
            java.util.List r5 = r4.a
            int r5 = r5.size()
            if (r5 == 0) goto L_0x04b7
            ahrs r5 = r1.a
            java.lang.String r6 = r4.b
            if (r6 == 0) goto L_0x0187
            r6 = 1
            goto L_0x0188
        L_0x0187:
            r6 = 0
        L_0x0188:
            r5.j = r6
            ahuk r5 = defpackage.ahuk.a
            ahrs r6 = r1.a
            java.lang.String r6 = r6.c
            boolean r5 = r5.a((java.lang.String) r6)
            if (r5 != 0) goto L_0x019e
            ahrs r2 = r1.a
            java.lang.String r3 = "Failed to lock working directory."
            r2.a((java.lang.String) r3)
            return
        L_0x019e:
            ahrs r5 = r1.a     // Catch:{ all -> 0x04ab }
            java.util.Locale r6 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x04ab }
            java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch:{ all -> 0x04ab }
            java.util.List r8 = r4.a     // Catch:{ all -> 0x04ab }
            int r8 = r8.size()     // Catch:{ all -> 0x04ab }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x04ab }
            r6[r12] = r8     // Catch:{ all -> 0x04ab }
            java.lang.String r8 = r4.b     // Catch:{ all -> 0x04ab }
            r9 = 1
            r6[r9] = r8     // Catch:{ all -> 0x04ab }
            ahrr r6 = new ahrr     // Catch:{ all -> 0x04ab }
            ahry r8 = r5.f     // Catch:{ all -> 0x04ab }
            r6.<init>(r5, r4, r8)     // Catch:{ all -> 0x04ab }
            r5.n = r6     // Catch:{ all -> 0x04ab }
            ahui r6 = new ahui     // Catch:{ all -> 0x04ab }
            android.content.Context r8 = r5.a     // Catch:{ all -> 0x04ab }
            ajbg r9 = r5.k     // Catch:{ all -> 0x04ab }
            r20 = 2
            r21 = 0
            java.lang.String r10 = r5.b     // Catch:{ all -> 0x04ab }
            r23 = 0
            r24 = 0
            ahrr r11 = r5.n     // Catch:{ all -> 0x04ab }
            java.lang.String r14 = r4.b     // Catch:{ all -> 0x04ab }
            ajrh r15 = r5.h     // Catch:{ all -> 0x04ab }
            r28 = 0
            r17 = r6
            r18 = r8
            r19 = r9
            r22 = r10
            r25 = r11
            r26 = r14
            r27 = r15
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x04ab }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04ab }
            r10 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r8 + r10
            r5.g = r8     // Catch:{ all -> 0x04ab }
            java.util.List r8 = r4.a     // Catch:{ all -> 0x04ab }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x04ab }
        L_0x01f7:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x04ab }
            if (r9 == 0) goto L_0x0349
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x04ab }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x04ab }
            r5.c()     // Catch:{ all -> 0x04ab }
            boolean r10 = r5.l     // Catch:{ all -> 0x04ab }
            if (r10 == 0) goto L_0x020c
            goto L_0x02b1
        L_0x020c:
            java.util.Locale r10 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x04ab }
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x04ab }
            r11[r12] = r9     // Catch:{ all -> 0x04ab }
            java.lang.String r10 = r5.c     // Catch:{ all -> 0x04ab }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x04ab }
            java.lang.String r11 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x04ab }
            int r14 = r11.length()     // Catch:{ all -> 0x04ab }
            if (r14 != 0) goto L_0x0229
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x04ab }
            r11.<init>(r10)     // Catch:{ all -> 0x04ab }
            goto L_0x022d
        L_0x0229:
            java.lang.String r11 = r10.concat(r11)     // Catch:{ all -> 0x04ab }
        L_0x022d:
            byte[] r10 = r5.i     // Catch:{ all -> 0x04ab }
            ajrh r14 = r5.h     // Catch:{ all -> 0x04ab }
            aiab r10 = defpackage.aiab.a((byte[]) r10, (defpackage.ajrh) r14)     // Catch:{ all -> 0x04ab }
            ahrb r14 = new ahrb     // Catch:{ all -> 0x04ab }
            r14.<init>(r11, r10)     // Catch:{ all -> 0x04ab }
            ahrm r10 = defpackage.ahrm.READ_SUCCESS     // Catch:{ all -> 0x04ab }
        L_0x023c:
            byte[] r11 = r14.a()     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            if (r11 == 0) goto L_0x02fc
            boolean r15 = r5.l     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            if (r15 == 0) goto L_0x0264
            java.lang.String r10 = "Stopped processing the rest of file "
            java.lang.String r11 = java.lang.String.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            int r15 = r11.length()     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            if (r15 != 0) goto L_0x0258
            java.lang.String r11 = new java.lang.String     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            r11.<init>(r10)     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            goto L_0x025b
        L_0x0258:
            r10.concat(r11)     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
        L_0x025b:
            r10 = 1
            r6.c = r10     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            ahrm r10 = defpackage.ahrm.READ_INTERRUPTED     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            r19 = r8
            goto L_0x02fe
        L_0x0264:
            aqek r15 = new aqek     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            aqem r7 = defpackage.ajck.al     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            r15.<init>(r7)     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            r15.a((byte[]) r11)     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            boolean r7 = r15.a()     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            if (r7 == 0) goto L_0x02ea
            r7 = 6
            aqek r11 = r15.e(r7)     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            aqek r11 = defpackage.ahvx.a((defpackage.aqek) r11)     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            r15.k(r7)     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            r7 = 3
            int r12 = r11.b((int) r7)     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            r4.a((java.lang.String) r9, (int) r12)     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            boolean r18 = r4.b((int) r12)     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            if (r18 != 0) goto L_0x02d4
            java.util.Locale r18 = java.util.Locale.ENGLISH     // Catch:{ IllegalArgumentException -> 0x0324, FileNotFoundException -> 0x031b, IOException -> 0x0312, ahra -> 0x0307 }
            r19 = r8
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ IllegalArgumentException -> 0x02fa, FileNotFoundException -> 0x02f8, IOException -> 0x02f6, ahra -> 0x02f4 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)     // Catch:{ IllegalArgumentException -> 0x02fa, FileNotFoundException -> 0x02f8, IOException -> 0x02f6, ahra -> 0x02f4 }
            r16 = 0
            r8[r16] = r7     // Catch:{ IllegalArgumentException -> 0x02fa, FileNotFoundException -> 0x02f8, IOException -> 0x02f6, ahra -> 0x02f4 }
            boolean r7 = r6.b(r15, r11)     // Catch:{ IllegalArgumentException -> 0x02fa, FileNotFoundException -> 0x02f8, IOException -> 0x02f6, ahra -> 0x02f4 }
            if (r7 != 0) goto L_0x02cf
            ahrr r7 = r5.n     // Catch:{ IllegalArgumentException -> 0x02fa, FileNotFoundException -> 0x02f8, IOException -> 0x02f6, ahra -> 0x02f4 }
            java.lang.String r8 = r4.b     // Catch:{ IllegalArgumentException -> 0x02fa, FileNotFoundException -> 0x02f8, IOException -> 0x02f6, ahra -> 0x02f4 }
            java.lang.String r10 = "Fatal: can not submit task."
            r7.a((java.lang.String) r8, (int) r12, (java.lang.String) r10)     // Catch:{ IllegalArgumentException -> 0x02fa, FileNotFoundException -> 0x02f8, IOException -> 0x02f6, ahra -> 0x02f4 }
            r14.b()     // Catch:{ IOException -> 0x02b0 }
            goto L_0x02b1
        L_0x02b0:
            r0 = move-exception
        L_0x02b1:
            boolean r7 = r5.l     // Catch:{ all -> 0x04ab }
            java.util.List r7 = r4.a()     // Catch:{ all -> 0x04ab }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x04ab }
        L_0x02bb:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x04ab }
            if (r8 == 0) goto L_0x0349
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x04ab }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x04ab }
            ahrr r9 = r5.n     // Catch:{ all -> 0x04ab }
            java.lang.String r10 = r4.b     // Catch:{ all -> 0x04ab }
            r9.a((java.lang.String) r10, (java.lang.String) r8)     // Catch:{ all -> 0x04ab }
            goto L_0x02bb
        L_0x02cf:
            r8 = r19
            r12 = 0
            goto L_0x023c
        L_0x02d4:
            r19 = r8
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ IllegalArgumentException -> 0x02fa, FileNotFoundException -> 0x02f8, IOException -> 0x02f6, ahra -> 0x02f4 }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ IllegalArgumentException -> 0x02fa, FileNotFoundException -> 0x02f8, IOException -> 0x02f6, ahra -> 0x02f4 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)     // Catch:{ IllegalArgumentException -> 0x02fa, FileNotFoundException -> 0x02f8, IOException -> 0x02f6, ahra -> 0x02f4 }
            r15 = 0
            r8[r15] = r11     // Catch:{ IllegalArgumentException -> 0x02fa, FileNotFoundException -> 0x02f8, IOException -> 0x02f6, ahra -> 0x02f4 }
            r4.a((int) r12, (boolean) r7)     // Catch:{ IllegalArgumentException -> 0x02fa, FileNotFoundException -> 0x02f8, IOException -> 0x02f6, ahra -> 0x02f4 }
            r8 = r19
            r12 = 0
            goto L_0x023c
        L_0x02ea:
            r19 = r8
            java.io.IOException r7 = new java.io.IOException     // Catch:{ IllegalArgumentException -> 0x02fa, FileNotFoundException -> 0x02f8, IOException -> 0x02f6, ahra -> 0x02f4 }
            java.lang.String r8 = "isValid returned after parsing GLocRequest"
            r7.<init>(r8)     // Catch:{ IllegalArgumentException -> 0x02fa, FileNotFoundException -> 0x02f8, IOException -> 0x02f6, ahra -> 0x02f4 }
            throw r7     // Catch:{ IllegalArgumentException -> 0x02fa, FileNotFoundException -> 0x02f8, IOException -> 0x02f6, ahra -> 0x02f4 }
        L_0x02f4:
            r0 = move-exception
            goto L_0x030a
        L_0x02f6:
            r0 = move-exception
            goto L_0x0315
        L_0x02f8:
            r0 = move-exception
            goto L_0x031e
        L_0x02fa:
            r0 = move-exception
            goto L_0x0327
        L_0x02fc:
            r19 = r8
        L_0x02fe:
            r14.b()     // Catch:{ IOException -> 0x0302 }
            goto L_0x032c
        L_0x0302:
            r0 = move-exception
            goto L_0x032c
        L_0x0304:
            r0 = move-exception
            r2 = r0
            goto L_0x0343
        L_0x0307:
            r0 = move-exception
            r19 = r8
        L_0x030a:
            ahrm r10 = defpackage.ahrm.INVALID_FORMAT     // Catch:{ all -> 0x0304 }
            r14.b()     // Catch:{ IOException -> 0x0310 }
            goto L_0x032c
        L_0x0310:
            r0 = move-exception
            goto L_0x032c
        L_0x0312:
            r0 = move-exception
            r19 = r8
        L_0x0315:
            ahrm r10 = defpackage.ahrm.READ_FAILURE     // Catch:{ all -> 0x0304 }
            r14.b()     // Catch:{ IOException -> 0x0310 }
            goto L_0x032c
        L_0x031b:
            r0 = move-exception
            r19 = r8
        L_0x031e:
            ahrm r10 = defpackage.ahrm.READ_FAILURE     // Catch:{ all -> 0x0304 }
            r14.b()     // Catch:{ IOException -> 0x0310 }
            goto L_0x032c
        L_0x0324:
            r0 = move-exception
            r19 = r8
        L_0x0327:
            ahrm r10 = defpackage.ahrm.READ_FAILURE     // Catch:{ all -> 0x0304 }
            r14.b()     // Catch:{ IOException -> 0x0310 }
        L_0x032c:
            r4.a((java.lang.String) r9, (defpackage.ahrm) r10)     // Catch:{ all -> 0x04ab }
            ahrr r7 = r5.n     // Catch:{ all -> 0x04ab }
            java.lang.String r8 = r4.b     // Catch:{ all -> 0x04ab }
            r7.a((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x04ab }
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x04ab }
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x04ab }
            r7 = 0
            r8[r7] = r9     // Catch:{ all -> 0x04ab }
            r8 = r19
            r12 = 0
            goto L_0x01f7
        L_0x0343:
            r14.b()     // Catch:{ IOException -> 0x0347 }
            goto L_0x0348
        L_0x0347:
            r0 = move-exception
        L_0x0348:
            throw r2     // Catch:{ all -> 0x04ab }
        L_0x0349:
            r6.c()     // Catch:{ all -> 0x04ab }
        L_0x034c:
            r5.c()     // Catch:{ InterruptedException -> 0x04a6 }
            java.util.concurrent.CountDownLatch r6 = r5.m     // Catch:{ InterruptedException -> 0x04a6 }
            r6.await()     // Catch:{ InterruptedException -> 0x04a6 }
            boolean r6 = r5.d     // Catch:{ InterruptedException -> 0x04a6 }
            r7 = r6 ^ 1
            if (r6 == 0) goto L_0x0409
            java.util.List r6 = r4.a     // Catch:{ InterruptedException -> 0x04a6 }
            int r7 = r6.size()     // Catch:{ InterruptedException -> 0x04a6 }
            r8 = 0
        L_0x0361:
            if (r8 >= r7) goto L_0x0401
            java.lang.Object r9 = r6.get(r8)     // Catch:{ InterruptedException -> 0x04a6 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ InterruptedException -> 0x04a6 }
            ahvw r10 = r4.a((java.lang.String) r9)     // Catch:{ InterruptedException -> 0x04a6 }
            java.lang.String r11 = "Summary should not be null after all complete."
            defpackage.amrl.a((java.lang.Object) r10, (java.lang.Object) r11)     // Catch:{ InterruptedException -> 0x04a6 }
            int r11 = r10.a     // Catch:{ InterruptedException -> 0x04a6 }
            r12 = 1
            if (r11 != r12) goto L_0x0384
            int r11 = r10.b     // Catch:{ InterruptedException -> 0x04a6 }
            if (r11 != 0) goto L_0x0384
            int r11 = r10.c     // Catch:{ InterruptedException -> 0x04a6 }
            if (r11 != 0) goto L_0x0384
            int r11 = r10.f     // Catch:{ InterruptedException -> 0x04a6 }
            if (r11 != 0) goto L_0x0384
            goto L_0x03b2
        L_0x0384:
            int r10 = r10.d     // Catch:{ InterruptedException -> 0x04a6 }
            r11 = 1
            if (r10 == r11) goto L_0x03b2
            java.lang.String r10 = r5.c     // Catch:{ InterruptedException -> 0x04a6 }
            java.lang.String r11 = java.lang.String.valueOf(r10)     // Catch:{ InterruptedException -> 0x04a6 }
            int r11 = r11.length()     // Catch:{ InterruptedException -> 0x04a6 }
            java.lang.String r12 = java.lang.String.valueOf(r9)     // Catch:{ InterruptedException -> 0x04a6 }
            int r12 = r12.length()     // Catch:{ InterruptedException -> 0x04a6 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x04a6 }
            int r11 = r11 + 91
            int r11 = r11 + r12
            r14.<init>(r11)     // Catch:{ InterruptedException -> 0x04a6 }
            r14.append(r10)     // Catch:{ InterruptedException -> 0x04a6 }
            r14.append(r9)     // Catch:{ InterruptedException -> 0x04a6 }
            java.lang.String r9 = " won't be deleted either because failed to be read or some GLocRequest failed to be upload."
            r14.append(r9)     // Catch:{ InterruptedException -> 0x04a6 }
            r14.toString()     // Catch:{ InterruptedException -> 0x04a6 }
            goto L_0x03fd
        L_0x03b2:
            java.io.File r10 = new java.io.File     // Catch:{ InterruptedException -> 0x04a6 }
            java.lang.String r11 = r5.c     // Catch:{ InterruptedException -> 0x04a6 }
            r10.<init>(r11, r9)     // Catch:{ InterruptedException -> 0x04a6 }
            boolean r9 = r10.delete()     // Catch:{ SecurityException -> 0x03e5 }
            if (r9 != 0) goto L_0x03d7
            java.lang.String r9 = r10.getAbsolutePath()     // Catch:{ SecurityException -> 0x03e5 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SecurityException -> 0x03e5 }
            int r11 = r9.length()     // Catch:{ SecurityException -> 0x03e5 }
            if (r11 != 0) goto L_0x03d3
            java.lang.String r9 = new java.lang.String     // Catch:{ SecurityException -> 0x03e5 }
            r9.<init>(r2)     // Catch:{ SecurityException -> 0x03e5 }
            goto L_0x03fd
        L_0x03d3:
            r2.concat(r9)     // Catch:{ SecurityException -> 0x03e5 }
            goto L_0x03fd
        L_0x03d7:
            java.lang.String r9 = r10.getAbsolutePath()     // Catch:{ SecurityException -> 0x03e5 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SecurityException -> 0x03e5 }
            java.lang.String r11 = " deleted."
            r9.concat(r11)     // Catch:{ SecurityException -> 0x03e5 }
            goto L_0x03fd
        L_0x03e5:
            r0 = move-exception
            java.lang.String r9 = r10.getAbsolutePath()     // Catch:{ InterruptedException -> 0x04a6 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ InterruptedException -> 0x04a6 }
            int r10 = r9.length()     // Catch:{ InterruptedException -> 0x04a6 }
            if (r10 != 0) goto L_0x03fa
            java.lang.String r9 = new java.lang.String     // Catch:{ InterruptedException -> 0x04a6 }
            r9.<init>(r2)     // Catch:{ InterruptedException -> 0x04a6 }
            goto L_0x03fd
        L_0x03fa:
            r2.concat(r9)     // Catch:{ InterruptedException -> 0x04a6 }
        L_0x03fd:
            int r8 = r8 + 1
            goto L_0x0361
        L_0x0401:
            boolean r6 = r5.d()     // Catch:{ InterruptedException -> 0x04a6 }
            if (r6 == 0) goto L_0x040d
            goto L_0x0476
        L_0x0409:
            if (r7 != 0) goto L_0x040d
            goto L_0x0476
        L_0x040d:
            java.util.List r6 = r4.c()     // Catch:{ InterruptedException -> 0x04a6 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x04a6 }
            r7.<init>()     // Catch:{ InterruptedException -> 0x04a6 }
            r8 = 0
        L_0x0417:
            int r9 = r6.size()     // Catch:{ InterruptedException -> 0x04a6 }
            if (r8 < r9) goto L_0x0491
            int r6 = r7.length()     // Catch:{ InterruptedException -> 0x04a6 }
            if (r6 <= 0) goto L_0x0476
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x044f, all -> 0x0449 }
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x044f, all -> 0x0449 }
            java.lang.String r9 = r5.c     // Catch:{ IOException -> 0x044f, all -> 0x0449 }
            r8.<init>(r9, r13)     // Catch:{ IOException -> 0x044f, all -> 0x0449 }
            r9 = 0
            r6.<init>(r8, r9)     // Catch:{ IOException -> 0x044f, all -> 0x0449 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0446, all -> 0x0441 }
            byte[] r7 = r7.getBytes()     // Catch:{ IOException -> 0x0446, all -> 0x0441 }
            r6.write(r7)     // Catch:{ IOException -> 0x0446, all -> 0x0441 }
            r6.close()     // Catch:{ IOException -> 0x043f }
            goto L_0x0476
        L_0x043f:
            r0 = move-exception
            goto L_0x0476
        L_0x0441:
            r0 = move-exception
            r7 = r0
            r9 = 1
            r10 = 0
            goto L_0x046e
        L_0x0446:
            r0 = move-exception
            r7 = r0
            goto L_0x0452
        L_0x0449:
            r0 = move-exception
            r7 = r0
            r6 = 0
            r9 = 1
            r10 = 0
            goto L_0x046e
        L_0x044f:
            r0 = move-exception
            r7 = r0
            r6 = 0
        L_0x0452:
            java.util.Locale r8 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x046a }
            r9 = 1
            java.lang.Object[] r8 = new java.lang.Object[r9]     // Catch:{ all -> 0x0468 }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x0468 }
            r10 = 0
            r8[r10] = r7     // Catch:{ all -> 0x0466 }
            if (r6 == 0) goto L_0x0476
            r6.close()     // Catch:{ IOException -> 0x0464 }
            goto L_0x0476
        L_0x0464:
            r0 = move-exception
            goto L_0x0476
        L_0x0466:
            r0 = move-exception
            goto L_0x046d
        L_0x0468:
            r0 = move-exception
            goto L_0x046c
        L_0x046a:
            r0 = move-exception
            r9 = 1
        L_0x046c:
            r10 = 0
        L_0x046d:
            r7 = r0
        L_0x046e:
            if (r6 == 0) goto L_0x0475
            r6.close()     // Catch:{ IOException -> 0x0474 }
            goto L_0x0475
        L_0x0474:
            r0 = move-exception
        L_0x0475:
            throw r7     // Catch:{ InterruptedException -> 0x04a3 }
        L_0x0476:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x04ab }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x04ab }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x04ab }
            java.lang.String r3 = " quitting."
            r2.concat(r3)     // Catch:{ all -> 0x04ab }
            ahuk r2 = defpackage.ahuk.a
            ahrs r3 = r1.a
            java.lang.String r3 = r3.c
            r2.b((java.lang.String) r3)
            return
        L_0x0491:
            r9 = 1
            r10 = 0
            if (r8 == 0) goto L_0x0498
            r7.append(r3)     // Catch:{ InterruptedException -> 0x04a3 }
        L_0x0498:
            java.lang.Object r11 = r6.get(r8)     // Catch:{ InterruptedException -> 0x04a3 }
            r7.append(r11)     // Catch:{ InterruptedException -> 0x04a3 }
            int r8 = r8 + 1
            goto L_0x0417
        L_0x04a3:
            r0 = move-exception
            goto L_0x034c
        L_0x04a6:
            r0 = move-exception
            r9 = 1
            r10 = 0
            goto L_0x034c
        L_0x04ab:
            r0 = move-exception
            r2 = r0
            ahuk r3 = defpackage.ahuk.a
            ahrs r4 = r1.a
            java.lang.String r4 = r4.c
            r3.b((java.lang.String) r4)
            throw r2
        L_0x04b7:
            r29.a()
            return
        L_0x04bb:
            r0 = move-exception
            r2 = r0
            goto L_0x04ca
        L_0x04be:
            r0 = move-exception
            r2 = r0
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x04bb }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x04bb }
            r3.<init>(r2)     // Catch:{ all -> 0x04bb }
            throw r3     // Catch:{ all -> 0x04bb }
        L_0x04ca:
            r7.close()     // Catch:{ IOException -> 0x04ce }
            throw r2     // Catch:{ IOException -> 0x04ce }
        L_0x04ce:
            r0 = move-exception
            r2 = r0
            ahrs r3 = r1.a
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Failed to load SessionSummary: "
            int r5 = r2.length()
            if (r5 != 0) goto L_0x04e8
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
            goto L_0x04ec
        L_0x04e8:
            java.lang.String r2 = r4.concat(r2)
        L_0x04ec:
            r3.a((java.lang.String) r2)
            return
        L_0x04f0:
            ahrs r2 = r1.a
            java.lang.String r3 = r2.c
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = " is locked."
            java.lang.String r3 = r3.concat(r4)
            r2.a((java.lang.String) r3)
            return
        L_0x0502:
            r29.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahrj.run():void");
    }
}
