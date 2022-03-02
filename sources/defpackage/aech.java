package defpackage;

/* renamed from: aech  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aech {
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ab, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01ac, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01b0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01b1, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01b5, code lost:
        r13 = r23;
        r19 = r8;
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01bd, code lost:
        r13 = r23;
        r19 = r8;
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01d0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01d3, code lost:
        r13 = r23;
        r19 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01dc, code lost:
        r13 = r23;
        r19 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x021e, code lost:
        if (r12 == null) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x025a, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x015f, code lost:
        r9 = r22;
        r13 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0165, code lost:
        r9 = r22;
        r13 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x016b, code lost:
        r9 = r22;
        r13 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0170, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0175, code lost:
        r9 = r22;
        r13 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x017a, code lost:
        r6 = r16;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ab A[Catch:{ aecr -> 0x01a1, IOException -> 0x0197, Exception -> 0x01b0, all -> 0x01ab }, ExcHandler: all (th java.lang.Throwable), Splitter:B:33:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01b0 A[Catch:{ aecr -> 0x01a1, IOException -> 0x0197, Exception -> 0x01b0, all -> 0x01ab }, ExcHandler: Exception (e java.lang.Exception), Splitter:B:33:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01d0 A[Catch:{ aecr -> 0x01a1, IOException -> 0x0197, Exception -> 0x01b0, all -> 0x01ab }, ExcHandler: Exception (e java.lang.Exception), PHI: r6 
      PHI: (r6v13 long) = (r6v2 long), (r6v14 long), (r6v14 long) binds: [B:21:0x005a, B:23:0x005e, B:30:0x0079] A[DONT_GENERATE, DONT_INLINE], Splitter:B:21:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0243 A[Catch:{ aecr -> 0x01a1, IOException -> 0x0197, Exception -> 0x01b0, all -> 0x01ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x025a A[Catch:{ aecr -> 0x01a1, IOException -> 0x0197, Exception -> 0x01b0, all -> 0x01ab }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r21, defpackage.iby r22, defpackage.aupy r23, defpackage.hph r24) {
        /*
            r0 = r21
            r1 = r24
            java.lang.Class<aech> r2 = defpackage.aech.class
            monitor-enter(r2)
            java.lang.String r3 = "dropbox"
            java.lang.Object r3 = r0.getSystemService(r3)     // Catch:{ all -> 0x025e }
            android.os.DropBoxManager r3 = (android.os.DropBoxManager) r3     // Catch:{ all -> 0x025e }
            if (r3 != 0) goto L_0x0023
            java.lang.String r0 = "WestworldIncidentOp"
            java.lang.String r3 = "Can't find dropbox"
            android.util.Log.i(r0, r3)     // Catch:{ all -> 0x025e }
            java.lang.String r0 = "UploadIncidentFailsDropBoxManager"
            hox r0 = r1.c(r0)     // Catch:{ all -> 0x025e }
            r0.a()     // Catch:{ all -> 0x025e }
            monitor-exit(r2)
            return
        L_0x0023:
            java.lang.String r4 = "WestworldIncidentOp"
            r5 = 0
            android.content.SharedPreferences r4 = r0.getSharedPreferences(r4, r5)     // Catch:{ all -> 0x025e }
            java.lang.String r6 = ":lastRunMsec"
            r7 = -1
            long r6 = r4.getLong(r6, r7)     // Catch:{ all -> 0x025e }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x025e }
            android.content.pm.ApplicationInfo r10 = r21.getApplicationInfo()     // Catch:{ all -> 0x025e }
            int r10 = r10.uid     // Catch:{ all -> 0x025e }
            hol r11 = defpackage.aecq.e     // Catch:{ all -> 0x025e }
            r12 = 0
            if (r11 != 0) goto L_0x004c
            hol r11 = new hol     // Catch:{ all -> 0x025e }
            java.lang.String r13 = defpackage.azvq.b()     // Catch:{ all -> 0x025e }
            r11.<init>(r0, r13, r12)     // Catch:{ all -> 0x025e }
            defpackage.aecq.e = r11     // Catch:{ all -> 0x025e }
        L_0x004c:
            hol r11 = defpackage.aecq.e     // Catch:{ all -> 0x025e }
        L_0x004e:
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x01f1
            java.lang.String r0 = "incident"
            android.os.DropBoxManager$Entry r12 = r3.getNextEntry(r0, r6)     // Catch:{ aecr -> 0x0223, IOException -> 0x0200, Exception -> 0x01f5, all -> 0x01f3 }
            if (r12 == 0) goto L_0x01e4
            long r6 = r12.getTimeMillis()     // Catch:{ aecr -> 0x01db, IOException -> 0x01d2, Exception -> 0x01d0 }
            int r0 = r12.getFlags()     // Catch:{ aecr -> 0x01ca, IOException -> 0x01c4, Exception -> 0x01d0 }
            r13 = 1
            r0 = r0 & r13
            if (r0 == 0) goto L_0x0077
            android.content.SharedPreferences$Editor r0 = r4.edit()     // Catch:{ all -> 0x025e }
            java.lang.String r13 = ":lastRunMsec"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r13, r6)     // Catch:{ all -> 0x025e }
            r0.apply()     // Catch:{ all -> 0x025e }
            r12.close()     // Catch:{ all -> 0x025e }
            goto L_0x004e
        L_0x0077:
            java.lang.String r0 = "UploadIncident"
            hox r0 = r1.c(r0)     // Catch:{ aecr -> 0x01ca, IOException -> 0x01c4, Exception -> 0x01d0 }
            r0.a()     // Catch:{ aecr -> 0x01ca, IOException -> 0x01c4, Exception -> 0x01d0 }
            aecs r0 = new aecs     // Catch:{ aecr -> 0x01ca, IOException -> 0x01c4, Exception -> 0x01d0 }
            java.io.InputStream r14 = r12.getInputStream()     // Catch:{ aecr -> 0x01ca, IOException -> 0x01c4, Exception -> 0x01d0 }
            r16 = r6
            long r5 = defpackage.azwv.e()     // Catch:{ aecr -> 0x01bc, IOException -> 0x01b4, Exception -> 0x01b0, all -> 0x01ab }
            int r6 = (int) r5     // Catch:{ aecr -> 0x01bc, IOException -> 0x01b4, Exception -> 0x01b0, all -> 0x01ab }
            r0.<init>(r14, r6)     // Catch:{ aecr -> 0x01bc, IOException -> 0x01b4, Exception -> 0x01b0, all -> 0x01ab }
        L_0x0090:
            aect r5 = r0.a     // Catch:{ aecr -> 0x01bc, IOException -> 0x01b4, Exception -> 0x01b0, all -> 0x01ab }
            boolean r6 = r5.b     // Catch:{ aecr -> 0x01bc, IOException -> 0x01b4, Exception -> 0x01b0, all -> 0x01ab }
            if (r6 == 0) goto L_0x00a3
            int r5 = r5.a     // Catch:{ aecr -> 0x01bc, IOException -> 0x01b4, Exception -> 0x01b0, all -> 0x01ab }
            if (r5 != 0) goto L_0x00a3
            r13 = r23
            r19 = r8
            r8 = 0
            r9 = r22
            goto L_0x0183
        L_0x00a3:
            auay r5 = r0.a()     // Catch:{ aecr -> 0x01bc, IOException -> 0x01b4, Exception -> 0x01b0, all -> 0x01ab }
            long r6 = defpackage.azws.f()     // Catch:{ aecr -> 0x01bc, IOException -> 0x01b4, Exception -> 0x01b0, all -> 0x01ab }
            boolean r14 = r0.c     // Catch:{ aecr -> 0x01bc, IOException -> 0x01b4, Exception -> 0x01b0, all -> 0x01ab }
            if (r14 != 0) goto L_0x00f2
            java.util.ArrayList r14 = r0.b     // Catch:{ aecr -> 0x00ed, IOException -> 0x00e8, Exception -> 0x01b0, all -> 0x01ab }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ aecr -> 0x00ed, IOException -> 0x00e8, Exception -> 0x01b0, all -> 0x01ab }
        L_0x00b5:
            boolean r18 = r14.hasNext()     // Catch:{ aecr -> 0x00ed, IOException -> 0x00e8, Exception -> 0x01b0, all -> 0x01ab }
            if (r18 == 0) goto L_0x00e5
            java.lang.Object r18 = r14.next()     // Catch:{ aecr -> 0x00ed, IOException -> 0x00e8, Exception -> 0x01b0, all -> 0x01ab }
            r15 = r18
            avqk r15 = (defpackage.avqk) r15     // Catch:{ aecr -> 0x00ed, IOException -> 0x00e8, Exception -> 0x01b0, all -> 0x01ab }
            avqj r13 = r15.a     // Catch:{ aecr -> 0x00ed, IOException -> 0x00e8, Exception -> 0x01b0, all -> 0x01ab }
            if (r13 == 0) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            avqj r13 = defpackage.avqj.c     // Catch:{ aecr -> 0x00ed, IOException -> 0x00e8, Exception -> 0x01b0, all -> 0x01ab }
        L_0x00ca:
            r19 = r8
            long r8 = r13.b     // Catch:{ aecr -> 0x01a1, IOException -> 0x0197, Exception -> 0x01b0, all -> 0x01ab }
            int r13 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r13 != 0) goto L_0x00e1
            avqj r8 = r15.a     // Catch:{ aecr -> 0x01a1, IOException -> 0x0197, Exception -> 0x01b0, all -> 0x01ab }
            if (r8 == 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            avqj r8 = defpackage.avqj.c     // Catch:{ aecr -> 0x01a1, IOException -> 0x0197, Exception -> 0x01b0, all -> 0x01ab }
        L_0x00d9:
            int r8 = r8.a     // Catch:{ aecr -> 0x01a1, IOException -> 0x0197, Exception -> 0x01b0, all -> 0x01ab }
            if (r8 != r10) goto L_0x00e1
            r6 = 1
            r0.c = r6     // Catch:{ aecr -> 0x01a1, IOException -> 0x0197, Exception -> 0x01b0, all -> 0x01ab }
            goto L_0x00f4
        L_0x00e1:
            r8 = r19
            r13 = 1
            goto L_0x00b5
        L_0x00e5:
            r19 = r8
            goto L_0x00f4
        L_0x00e8:
            r0 = move-exception
            r19 = r8
            goto L_0x0198
        L_0x00ed:
            r0 = move-exception
            r19 = r8
            goto L_0x01a2
        L_0x00f2:
            r19 = r8
        L_0x00f4:
            boolean r6 = r0.c     // Catch:{ aecr -> 0x01a1, IOException -> 0x0197, Exception -> 0x01b0, all -> 0x01ab }
            if (r6 == 0) goto L_0x017e
            aupz r6 = defpackage.aupz.e     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            aucd r6 = r6.o()     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            long r7 = r12.getTimeMillis()     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            boolean r9 = r6.c     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            if (r9 != 0) goto L_0x0107
            goto L_0x010d
        L_0x0107:
            r6.c()     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            r9 = 0
            r6.c = r9     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
        L_0x010d:
            aucj r9 = r6.b     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            aupz r9 = (defpackage.aupz) r9     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            int r13 = r9.a     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            r14 = 1
            r13 = r13 | r14
            r9.a = r13     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            r9.b = r7     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            int r7 = r0.d     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            r8 = r13 | 2
            r9.a = r8     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            r9.c = r7     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            r5.getClass()     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            r7 = r8 | 4
            r9.a = r7     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            r9.d = r5     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            auqa r5 = defpackage.auqa.g     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            aucd r5 = r5.o()     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            boolean r7 = r5.c     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            if (r7 != 0) goto L_0x0136
            r8 = 0
            goto L_0x013c
        L_0x0136:
            r5.c()     // Catch:{ aecr -> 0x0174, IOException -> 0x016a, Exception -> 0x01b0, all -> 0x01ab }
            r8 = 0
            r5.c = r8     // Catch:{ aecr -> 0x0164, IOException -> 0x015e, Exception -> 0x01b0, all -> 0x01ab }
        L_0x013c:
            aucj r7 = r5.b     // Catch:{ aecr -> 0x0164, IOException -> 0x015e, Exception -> 0x01b0, all -> 0x01ab }
            auqa r7 = (defpackage.auqa) r7     // Catch:{ aecr -> 0x0164, IOException -> 0x015e, Exception -> 0x01b0, all -> 0x01ab }
            aucj r6 = r6.i()     // Catch:{ aecr -> 0x0164, IOException -> 0x015e, Exception -> 0x01b0, all -> 0x01ab }
            aupz r6 = (defpackage.aupz) r6     // Catch:{ aecr -> 0x0164, IOException -> 0x015e, Exception -> 0x01b0, all -> 0x01ab }
            r6.getClass()     // Catch:{ aecr -> 0x0164, IOException -> 0x015e, Exception -> 0x01b0, all -> 0x01ab }
            r7.c = r6     // Catch:{ aecr -> 0x0164, IOException -> 0x015e, Exception -> 0x01b0, all -> 0x01ab }
            r6 = 3
            r7.b = r6     // Catch:{ aecr -> 0x0164, IOException -> 0x015e, Exception -> 0x01b0, all -> 0x01ab }
            r9 = r22
            r13 = r23
            defpackage.aecq.a(r9, r11, r13, r1, r5)     // Catch:{ aecr -> 0x015c, IOException -> 0x015a, Exception -> 0x01b0, all -> 0x01ab }
            r8 = r19
            r13 = 1
            goto L_0x0090
        L_0x015a:
            r0 = move-exception
            goto L_0x0170
        L_0x015c:
            r0 = move-exception
            goto L_0x017a
        L_0x015e:
            r0 = move-exception
            r9 = r22
            r13 = r23
            goto L_0x0170
        L_0x0164:
            r0 = move-exception
            r9 = r22
            r13 = r23
            goto L_0x017a
        L_0x016a:
            r0 = move-exception
            r9 = r22
            r13 = r23
            r8 = 0
        L_0x0170:
            r6 = r16
            goto L_0x0208
        L_0x0174:
            r0 = move-exception
            r9 = r22
            r13 = r23
            r8 = 0
        L_0x017a:
            r6 = r16
            goto L_0x022b
        L_0x017e:
            r9 = r22
            r13 = r23
            r8 = 0
        L_0x0183:
            android.content.SharedPreferences$Editor r0 = r4.edit()     // Catch:{ all -> 0x025e }
            java.lang.String r5 = ":lastRunMsec"
            r6 = r16
            android.content.SharedPreferences$Editor r0 = r0.putLong(r5, r6)     // Catch:{ all -> 0x025e }
            r0.apply()     // Catch:{ all -> 0x025e }
        L_0x0192:
            r12.close()     // Catch:{ all -> 0x025e }
            goto L_0x0245
        L_0x0197:
            r0 = move-exception
        L_0x0198:
            r9 = r22
            r13 = r23
            r6 = r16
            r8 = 0
            goto L_0x0208
        L_0x01a1:
            r0 = move-exception
        L_0x01a2:
            r9 = r22
            r13 = r23
            r6 = r16
            r8 = 0
            goto L_0x022b
        L_0x01ab:
            r0 = move-exception
            r6 = r16
            goto L_0x024b
        L_0x01b0:
            r0 = move-exception
            r6 = r16
            goto L_0x01f6
        L_0x01b4:
            r0 = move-exception
            r13 = r23
            r19 = r8
            r6 = r16
            goto L_0x01d7
        L_0x01bc:
            r0 = move-exception
            r13 = r23
            r19 = r8
            r6 = r16
            goto L_0x01e0
        L_0x01c4:
            r0 = move-exception
            r13 = r23
            r19 = r8
            goto L_0x01d7
        L_0x01ca:
            r0 = move-exception
            r13 = r23
            r19 = r8
            goto L_0x01e0
        L_0x01d0:
            r0 = move-exception
            goto L_0x01f6
        L_0x01d2:
            r0 = move-exception
            r13 = r23
            r19 = r8
        L_0x01d7:
            r8 = 0
            r9 = r22
            goto L_0x0208
        L_0x01db:
            r0 = move-exception
            r13 = r23
            r19 = r8
        L_0x01e0:
            r8 = 0
            r9 = r22
            goto L_0x022b
        L_0x01e4:
            android.content.SharedPreferences$Editor r0 = r4.edit()     // Catch:{ all -> 0x025e }
            java.lang.String r1 = ":lastRunMsec"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r6)     // Catch:{ all -> 0x025e }
            r0.apply()     // Catch:{ all -> 0x025e }
        L_0x01f1:
            monitor-exit(r2)
            return
        L_0x01f3:
            r0 = move-exception
            goto L_0x024b
        L_0x01f5:
            r0 = move-exception
        L_0x01f6:
            java.lang.String r3 = "IncidentCrash"
            hox r1 = r1.c(r3)     // Catch:{ all -> 0x024a }
            r1.a()     // Catch:{ all -> 0x024a }
            throw r0     // Catch:{ all -> 0x024a }
        L_0x0200:
            r0 = move-exception
            r13 = r23
            r19 = r8
            r8 = 0
            r9 = r22
        L_0x0208:
            java.lang.String r0 = "BadDropBoxEntry"
            hox r0 = r1.c(r0)     // Catch:{ all -> 0x024a }
            r0.a()     // Catch:{ all -> 0x024a }
            android.content.SharedPreferences$Editor r0 = r4.edit()     // Catch:{ all -> 0x025e }
            java.lang.String r5 = ":lastRunMsec"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r5, r6)     // Catch:{ all -> 0x025e }
            r0.apply()     // Catch:{ all -> 0x025e }
            if (r12 == 0) goto L_0x0222
            goto L_0x0192
        L_0x0222:
            goto L_0x0245
        L_0x0223:
            r0 = move-exception
            r13 = r23
            r19 = r8
            r8 = 0
            r9 = r22
        L_0x022b:
            java.lang.String r0 = "BadIncidentReport"
            hox r0 = r1.c(r0)     // Catch:{ all -> 0x024a }
            r0.a()     // Catch:{ all -> 0x024a }
            android.content.SharedPreferences$Editor r0 = r4.edit()     // Catch:{ all -> 0x025e }
            java.lang.String r5 = ":lastRunMsec"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r5, r6)     // Catch:{ all -> 0x025e }
            r0.apply()     // Catch:{ all -> 0x025e }
            if (r12 == 0) goto L_0x0222
            goto L_0x0192
        L_0x0245:
            r8 = r19
            r5 = 0
            goto L_0x004e
        L_0x024a:
            r0 = move-exception
        L_0x024b:
            android.content.SharedPreferences$Editor r1 = r4.edit()     // Catch:{ all -> 0x025e }
            java.lang.String r3 = ":lastRunMsec"
            android.content.SharedPreferences$Editor r1 = r1.putLong(r3, r6)     // Catch:{ all -> 0x025e }
            r1.apply()     // Catch:{ all -> 0x025e }
            if (r12 == 0) goto L_0x025d
            r12.close()     // Catch:{ all -> 0x025e }
        L_0x025d:
            throw r0     // Catch:{ all -> 0x025e }
        L_0x025e:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x0262
        L_0x0261:
            throw r0
        L_0x0262:
            goto L_0x0261
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aech.a(android.content.Context, iby, aupy, hph):void");
    }
}
