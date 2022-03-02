package defpackage;

/* renamed from: ajii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajii {
    public final ajim a;
    public final ajik b;

    public ajii(ajik ajik, ajim ajim) {
        this.b = ajik;
        this.a = ajim;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r5 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
        if (r5 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009d, code lost:
        if (r5 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0124, code lost:
        if (r2 != null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x013a, code lost:
        if (r2 != null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0146, code lost:
        if (r2 != null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x014a, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a6 A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x014e A[Catch:{ all -> 0x014b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.location.reporting.state.update.ReportingConfig r13) {
        /*
            r12 = this;
            boolean r0 = defpackage.azsy.e()
            r1 = 50
            r2 = 0
            if (r0 == 0) goto L_0x00af
            ajim r0 = r12.a
            java.lang.Object r3 = r0.c
            monitor-enter(r3)
            com.google.android.gms.leveldb.LevelDb r4 = r0.d     // Catch:{ all -> 0x00ac }
            if (r4 == 0) goto L_0x00aa
            java.util.List r4 = r13.b()     // Catch:{ all -> 0x00ac }
            java.util.Iterator r5 = r4.iterator()     // Catch:{ all -> 0x00ac }
        L_0x001a:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x00ac }
            if (r6 == 0) goto L_0x002a
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x00ac }
            android.accounts.Account r6 = (android.accounts.Account) r6     // Catch:{ all -> 0x00ac }
            r0.a((android.accounts.Account) r6)     // Catch:{ all -> 0x00ac }
            goto L_0x001a
        L_0x002a:
            com.google.android.gms.leveldb.LevelDb r5 = r0.d     // Catch:{ LevelDbCorruptionException -> 0x0098, IllegalStateException -> 0x0096, LevelDbException -> 0x0084, all -> 0x0082 }
            com.google.android.gms.leveldb.LevelDb$Iterator r5 = r5.iterator()     // Catch:{ LevelDbCorruptionException -> 0x0098, IllegalStateException -> 0x0096, LevelDbException -> 0x0084, all -> 0x0082 }
            r5.seekToFirst()     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
        L_0x0033:
            boolean r6 = r5.isValid()     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
            if (r6 == 0) goto L_0x0076
            ajir r6 = new ajir     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
            byte[] r7 = r5.key()     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
            r6.<init>(r7)     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
            boolean r7 = r6.a((java.lang.Iterable) r4)     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
            if (r7 != 0) goto L_0x0072
            java.lang.String r7 = "GCoreUlr"
            long r8 = r6.a     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
            r10.<init>(r1)     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
            java.lang.String r11 = "Deleting entries for account #"
            r10.append(r11)     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
            r10.append(r8)     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
            java.lang.String r8 = r10.toString()     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
            defpackage.ajix.a((java.lang.String) r7, (java.lang.String) r8)     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
            java.lang.String r7 = "UlrEntitiesDeletedForInvalidAccount"
            defpackage.ajjb.a((java.lang.String) r7)     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
            com.google.android.gms.leveldb.LevelDb r7 = r0.d     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
            byte[] r8 = r6.a()     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
            byte[] r9 = r6.b()     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
            r7.deleteRange(r8, r9)     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
        L_0x0072:
            r6.a((com.google.android.gms.leveldb.LevelDb.Iterator) r5)     // Catch:{ LevelDbCorruptionException -> 0x0080, IllegalStateException -> 0x007e, LevelDbException -> 0x007c, all -> 0x0079 }
            goto L_0x0033
        L_0x0076:
            if (r5 == 0) goto L_0x00a0
            goto L_0x009f
        L_0x0079:
            r13 = move-exception
            r2 = r5
            goto L_0x00a4
        L_0x007c:
            r0 = move-exception
            goto L_0x0086
        L_0x007e:
            r4 = move-exception
            goto L_0x009a
        L_0x0080:
            r4 = move-exception
            goto L_0x009a
        L_0x0082:
            r13 = move-exception
            goto L_0x00a4
        L_0x0084:
            r0 = move-exception
            r5 = r2
        L_0x0086:
            java.lang.String r4 = "GCoreUlr"
            java.lang.String r6 = "Error removing invalid entries"
            defpackage.ajix.a((java.lang.String) r4, (java.lang.String) r6, (java.lang.Throwable) r0)     // Catch:{ all -> 0x00a2 }
            defpackage.ajjf.a(r0)     // Catch:{ all -> 0x00a2 }
            if (r5 == 0) goto L_0x00a0
        L_0x0092:
            r5.close()     // Catch:{ all -> 0x00ac }
            goto L_0x00a0
        L_0x0096:
            r4 = move-exception
            goto L_0x0099
        L_0x0098:
            r4 = move-exception
        L_0x0099:
            r5 = r2
        L_0x009a:
            r0.a((java.lang.Exception) r4)     // Catch:{ all -> 0x00a2 }
            if (r5 == 0) goto L_0x00a0
        L_0x009f:
            goto L_0x0092
        L_0x00a0:
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            goto L_0x00af
        L_0x00a2:
            r13 = move-exception
            r2 = r5
        L_0x00a4:
            if (r2 == 0) goto L_0x00a9
            r2.close()     // Catch:{ all -> 0x00ac }
        L_0x00a9:
            throw r13     // Catch:{ all -> 0x00ac }
        L_0x00aa:
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            goto L_0x00af
        L_0x00ac:
            r13 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ac }
            throw r13
        L_0x00af:
            boolean r0 = defpackage.azsy.c()
            if (r0 == 0) goto L_0x0157
            ajik r0 = r12.b
            if (r0 == 0) goto L_0x0157
            java.lang.Object r3 = r0.c
            monitor-enter(r3)
            com.google.android.gms.leveldb.LevelDb r4 = r0.d     // Catch:{ all -> 0x0154 }
            if (r4 == 0) goto L_0x0152
            java.util.List r13 = r13.b()     // Catch:{ all -> 0x0154 }
            java.util.Iterator r4 = r13.iterator()     // Catch:{ all -> 0x0154 }
        L_0x00c8:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0154 }
            if (r5 == 0) goto L_0x00d8
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0154 }
            android.accounts.Account r5 = (android.accounts.Account) r5     // Catch:{ all -> 0x0154 }
            r0.a((android.accounts.Account) r5)     // Catch:{ all -> 0x0154 }
            goto L_0x00c8
        L_0x00d8:
            com.google.android.gms.leveldb.LevelDb r4 = r0.d     // Catch:{ LevelDbCorruptionException -> 0x0142, IllegalStateException -> 0x0140, LevelDbException -> 0x012f, all -> 0x012d }
            com.google.android.gms.leveldb.LevelDb$Iterator r2 = r4.iterator()     // Catch:{ LevelDbCorruptionException -> 0x0142, IllegalStateException -> 0x0140, LevelDbException -> 0x012f, all -> 0x012d }
            r2.seekToFirst()     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
        L_0x00e1:
            boolean r4 = r2.isValid()     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
            if (r4 == 0) goto L_0x0124
            ajir r4 = new ajir     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
            byte[] r5 = r2.key()     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
            r4.<init>(r5)     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
            boolean r5 = r4.a((java.lang.Iterable) r13)     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
            if (r5 != 0) goto L_0x0120
            java.lang.String r5 = "GCoreUlr"
            long r6 = r4.a     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
            r8.<init>(r1)     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
            java.lang.String r9 = "Deleting entries for account #"
            r8.append(r9)     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
            r8.append(r6)     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
            java.lang.String r6 = r8.toString()     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
            defpackage.ajix.a((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
            java.lang.String r5 = "UlrEntitiesDeletedForInvalidAccount"
            defpackage.ajjb.a((java.lang.String) r5)     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
            com.google.android.gms.leveldb.LevelDb r5 = r0.d     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
            byte[] r6 = r4.a()     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
            byte[] r7 = r4.b()     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
            r5.deleteRange(r6, r7)     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
        L_0x0120:
            r4.a((com.google.android.gms.leveldb.LevelDb.Iterator) r2)     // Catch:{ LevelDbCorruptionException -> 0x012b, IllegalStateException -> 0x0129, LevelDbException -> 0x0127 }
            goto L_0x00e1
        L_0x0124:
            if (r2 == 0) goto L_0x0149
            goto L_0x0148
        L_0x0127:
            r13 = move-exception
            goto L_0x0130
        L_0x0129:
            r13 = move-exception
            goto L_0x0143
        L_0x012b:
            r13 = move-exception
            goto L_0x0143
        L_0x012d:
            r13 = move-exception
            goto L_0x014c
        L_0x012f:
            r13 = move-exception
        L_0x0130:
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r1 = "Error removing invalid entries"
            defpackage.ajix.a((java.lang.String) r0, (java.lang.String) r1, (java.lang.Throwable) r13)     // Catch:{ all -> 0x014b }
            defpackage.ajjf.a(r13)     // Catch:{ all -> 0x014b }
            if (r2 == 0) goto L_0x0149
        L_0x013c:
            r2.close()     // Catch:{ all -> 0x0154 }
            goto L_0x0149
        L_0x0140:
            r13 = move-exception
            goto L_0x0143
        L_0x0142:
            r13 = move-exception
        L_0x0143:
            r0.a((java.lang.Exception) r13)     // Catch:{ all -> 0x014b }
            if (r2 == 0) goto L_0x0149
        L_0x0148:
            goto L_0x013c
        L_0x0149:
            monitor-exit(r3)     // Catch:{ all -> 0x0154 }
            return
        L_0x014b:
            r13 = move-exception
        L_0x014c:
            if (r2 == 0) goto L_0x0151
            r2.close()     // Catch:{ all -> 0x0154 }
        L_0x0151:
            throw r13     // Catch:{ all -> 0x0154 }
        L_0x0152:
            monitor-exit(r3)     // Catch:{ all -> 0x0154 }
            return
        L_0x0154:
            r13 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0154 }
            throw r13
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajii.a(com.google.android.location.reporting.state.update.ReportingConfig):void");
    }
}
