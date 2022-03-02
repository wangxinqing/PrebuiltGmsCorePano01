package defpackage;

/* renamed from: zul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zul {
    public static final boolean a = true;
    private static final zsg b = zsg.a("ContactsLoggerDecision");

    static {
        int i = ztz.a;
    }

    public static void a(zuk zuk) {
        zuk.d = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x019f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r10, defpackage.zvd r11, defpackage.gsa r12, defpackage.zuk r13) {
        /*
            boolean r0 = defpackage.azdq.b()
            r1 = 0
            if (r0 != 0) goto L_0x0015
            boolean r0 = defpackage.azdq.p()
            if (r0 != 0) goto L_0x0015
            boolean r0 = defpackage.azdq.c()
            if (r0 == 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            return r1
        L_0x0015:
            boolean r0 = defpackage.azdq.b()
            r2 = 1
            if (r0 == 0) goto L_0x002c
            android.content.ContentResolver r0 = r10.getContentResolver()
            java.lang.String r3 = "user_full_data_backup_aware"
            int r0 = android.provider.Settings.Secure.getInt(r0, r3, r1)
            if (r0 != 0) goto L_0x002a
            r0 = 0
            goto L_0x002d
        L_0x002a:
            r0 = 1
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            boolean r3 = defpackage.azdq.c()
            if (r3 == 0) goto L_0x0043
            android.content.ContentResolver r3 = r10.getContentResolver()
            java.lang.String r4 = "backup_enabled:com.android.calllogbackup"
            int r3 = android.provider.Settings.Secure.getInt(r3, r4, r1)
            if (r3 != 0) goto L_0x0041
            r3 = 0
            goto L_0x0044
        L_0x0041:
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            zsi r4 = defpackage.zsi.a()
            boolean r5 = defpackage.azdq.c()
            aveu r6 = defpackage.aveu.p
            aucd r6 = r6.o()
            avef r7 = defpackage.avef.d
            aucd r7 = r7.o()
            aveg r8 = defpackage.aveg.q
            aucd r8 = r8.o()
            boolean r9 = r7.c
            if (r9 != 0) goto L_0x0063
            goto L_0x0068
        L_0x0063:
            r7.c()
            r7.c = r1
        L_0x0068:
            aucj r9 = r7.b
            avef r9 = (defpackage.avef) r9
            r9.a = r0
            r9.b = r3
            r9.c = r5
            boolean r5 = r8.c
            if (r5 != 0) goto L_0x0077
            goto L_0x007c
        L_0x0077:
            r8.c()
            r8.c = r1
        L_0x007c:
            aucj r5 = r8.b
            aveg r5 = (defpackage.aveg) r5
            aucj r7 = r7.i()
            avef r7 = (defpackage.avef) r7
            r7.getClass()
            r5.m = r7
            boolean r5 = r6.c
            if (r5 != 0) goto L_0x0090
            goto L_0x0095
        L_0x0090:
            r6.c()
            r6.c = r1
        L_0x0095:
            aucj r5 = r6.b
            aveu r5 = (defpackage.aveu) r5
            aucj r7 = r8.i()
            aveg r7 = (defpackage.aveg) r7
            r7.getClass()
            r5.g = r7
            r4.a((defpackage.aucd) r6)
            if (r0 == 0) goto L_0x00aa
            goto L_0x00ae
        L_0x00aa:
            if (r3 != 0) goto L_0x00ae
        L_0x00ac:
            r0 = 0
            goto L_0x00ed
        L_0x00ae:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r0 < r3) goto L_0x00d6
            android.app.backup.BackupManager r0 = new android.app.backup.BackupManager
            r0.<init>(r10)
            boolean r0 = r0.isBackupEnabled()     // Catch:{ SecurityException -> 0x00c1 }
            if (r0 == 0) goto L_0x00d6
            r0 = 1
            goto L_0x00d7
        L_0x00c1:
            r0 = move-exception
            zsg r3 = b
            java.lang.String r4 = "SecurityException: Unable to verify if backup is enabled."
            r3.d(r4)
            zsn r3 = defpackage.zso.a(r10)
            double r4 = defpackage.azfa.l()
            r3.a(r0, r4)
            r0 = 0
            goto L_0x00d7
        L_0x00d6:
            r0 = 0
        L_0x00d7:
            if (r0 == 0) goto L_0x00ec
            android.accounts.Account r12 = r12.a()
            if (r12 == 0) goto L_0x00ac
            java.lang.String r3 = r12.name
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00ac
            java.lang.String r12 = r12.name
            r13.a = r12
            goto L_0x00ed
        L_0x00ec:
        L_0x00ed:
            boolean r12 = defpackage.azdq.p()
            if (r12 == 0) goto L_0x019b
            amri r12 = r11.a()
            boolean r3 = r12.a()
            if (r3 == 0) goto L_0x019b
            azdq r3 = defpackage.azdq.a
            azef r3 = r3.a()
            boolean r3 = r3.N()
            if (r3 != 0) goto L_0x0168
            java.lang.Object r3 = r12.b()
            java.lang.String r3 = (java.lang.String) r3
            boolean r11 = r11.a(r3)
            if (r11 == 0) goto L_0x0166
            java.lang.Object r11 = r12.b()
            java.lang.String r11 = (java.lang.String) r11
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            if (r3 != 0) goto L_0x012b
            java.util.Set r3 = r13.b
            r3.clear()
            java.util.Set r3 = r13.b
            r3.add(r11)
        L_0x012b:
            java.lang.Object r11 = r12.b()
            java.lang.String r11 = (java.lang.String) r11
            azdq r12 = defpackage.azdq.a
            azef r12 = r12.a()
            boolean r12 = r12.J()
            if (r12 == 0) goto L_0x0164
            android.content.SharedPreferences r10 = defpackage.zti.a(r10)
            java.lang.String r12 = "romanesco-contacts-logger-full-upload-account"
            java.lang.String r3 = ""
            java.lang.String r3 = r10.getString(r12, r3)
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L_0x0164
            android.content.SharedPreferences$Editor r10 = r10.edit()
            android.content.SharedPreferences$Editor r10 = r10.putString(r12, r11)
            r11 = 0
            java.lang.String r3 = "romanesco-contacts-logger-full-upload-timestamp"
            android.content.SharedPreferences$Editor r10 = r10.putLong(r3, r11)
            r10.apply()
            r10 = 1
            goto L_0x019c
        L_0x0164:
            r10 = 1
            goto L_0x019c
        L_0x0166:
            r10 = 0
            goto L_0x019c
        L_0x0168:
            java.lang.Object r10 = r12.b()
            java.lang.String r10 = (java.lang.String) r10
            java.util.Set r10 = r11.b(r10)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x019b
            java.util.Set r11 = r13.b
            r11.clear()
            java.util.Iterator r10 = r10.iterator()
        L_0x0181:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0199
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x0181
            java.util.Set r12 = r13.b
            r12.add(r11)
            goto L_0x0181
        L_0x0199:
            r10 = 1
            goto L_0x019c
        L_0x019b:
            r10 = 0
        L_0x019c:
            if (r0 == 0) goto L_0x019f
            goto L_0x01a2
        L_0x019f:
            if (r10 != 0) goto L_0x01a2
            return r1
        L_0x01a2:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            if (r0 == 0) goto L_0x01a9
            java.lang.String r12 = r13.a
            goto L_0x01ab
        L_0x01a9:
            java.lang.String r12 = "Empty"
        L_0x01ab:
            r11[r1] = r12
            if (r10 == 0) goto L_0x01c6
            java.util.Set r10 = r13.b
            java.util.Iterator r10 = r10.iterator()
        L_0x01b5:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01c6
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r1] = r11
            goto L_0x01b5
        L_0x01c6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zul.a(android.content.Context, zvd, gsa, zuk):boolean");
    }
}
