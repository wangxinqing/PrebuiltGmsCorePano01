package defpackage;

/* renamed from: zzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zzf {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int a(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 3
            r2 = 1
            r3 = 2
            switch(r0) {
                case -790991584: goto L_0x0029;
                case -151171484: goto L_0x001f;
                case 883869909: goto L_0x0015;
                case 1200407144: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "Google-Guide"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 0
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "CONTACTS_APP_NOTIFICATION"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 3
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "SUW_Restore"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "contacts_restore_settings"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 2
            goto L_0x0034
        L_0x0033:
            r4 = -1
        L_0x0034:
            if (r4 == 0) goto L_0x0044
            if (r4 == r2) goto L_0x0042
            if (r4 == r3) goto L_0x0040
            if (r4 == r1) goto L_0x003d
            return r3
        L_0x003d:
            r4 = 8
            return r4
        L_0x0040:
            r4 = 7
            return r4
        L_0x0042:
            r4 = 6
            return r4
        L_0x0044:
            r4 = 4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzf.a(java.lang.String):int");
    }

    static void a(int i, zza zza) {
        zsi.a().a(i, zza.a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(defpackage.zzb r2, android.content.Context r3, defpackage.zsn r4, defpackage.aqxb r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, defpackage.zsg r9) {
        /*
            r0 = 1
            r1 = 0
            int r6 = a(r6)     // Catch:{ RemoteException -> 0x0069, OperationApplicationException -> 0x0051, RuntimeException -> 0x0021 }
            ztb r6 = defpackage.ztc.a(r3, r6)     // Catch:{ RemoteException -> 0x0069, OperationApplicationException -> 0x0051, RuntimeException -> 0x0021 }
            if (r2 != 0) goto L_0x0010
            r6.a((defpackage.aqxb) r5, (java.lang.String) r7, (boolean) r1)     // Catch:{ RemoteException -> 0x0069, OperationApplicationException -> 0x0051, RuntimeException -> 0x0021 }
            goto L_0x0013
        L_0x0010:
            r6.a((defpackage.aqxb) r5, (java.lang.String) r7, (defpackage.zzb) r2)     // Catch:{ RemoteException -> 0x0069, OperationApplicationException -> 0x0051, RuntimeException -> 0x0021 }
        L_0x0013:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ RemoteException -> 0x001f, OperationApplicationException -> 0x001d, RuntimeException -> 0x001b }
            defpackage.zys.a(r3, r8, r5)     // Catch:{ RemoteException -> 0x001f, OperationApplicationException -> 0x001d, RuntimeException -> 0x001b }
            goto L_0x0080
        L_0x001b:
            r2 = move-exception
            goto L_0x0023
        L_0x001d:
            r2 = move-exception
            goto L_0x0053
        L_0x001f:
            r2 = move-exception
            goto L_0x006b
        L_0x0021:
            r2 = move-exception
            r0 = 0
        L_0x0023:
            double r5 = defpackage.azfa.m()
            r4.a(r2, r5)
            java.lang.String r3 = "Failed to restore contacts due to runtime exception."
            r9.a((java.lang.Throwable) r2, (java.lang.String) r3)
            zsi r3 = defpackage.zsi.a()
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "restore_error:runtime_error:"
            int r5 = r2.length()
            if (r5 != 0) goto L_0x0049
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
            goto L_0x004d
        L_0x0049:
            java.lang.String r2 = r4.concat(r2)
        L_0x004d:
            r3.a((java.lang.String) r2)
            goto L_0x0080
        L_0x0051:
            r2 = move-exception
            r0 = 0
        L_0x0053:
            double r5 = defpackage.azfa.l()
            r4.a(r2, r5)
            java.lang.String r3 = "Failed to write contacts to CP2."
            r9.a((java.lang.Throwable) r2, (java.lang.String) r3)
            zsi r2 = defpackage.zsi.a()
            java.lang.String r3 = "restore_error:cp2_operation_exception"
            r2.a((java.lang.String) r3)
            goto L_0x0080
        L_0x0069:
            r2 = move-exception
            r0 = 0
        L_0x006b:
            double r5 = defpackage.azfa.l()
            r4.a(r2, r5)
            java.lang.String r3 = "Contacts write failed during the execution of a remote method."
            r9.a((java.lang.Throwable) r2, (java.lang.String) r3)
            zsi r2 = defpackage.zsi.a()
            java.lang.String r3 = "restore_error:cp2_remote_exception"
            r2.a((java.lang.String) r3)
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzf.a(zzb, android.content.Context, zsn, aqxb, java.lang.String, java.lang.String, java.lang.String, zsg):boolean");
    }
}
