package defpackage;

import android.content.Context;

/* renamed from: abfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abfa {
    public static final iwd a = abeb.c("TokenRequester");
    private static final amzy c = amzy.a("authAccount", "booleanResult", "accountType", "authtoken", "retry");
    public final Context b;
    private final gck d;
    private final qac e;

    private abfa(Context context) {
        this.b = context;
        this.d = pzx.a(context);
        this.e = new qac(context);
    }

    public static abfa a(Context context) {
        return new abfa(context);
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.abfb a(com.google.android.gms.auth.firstparty.dataservice.TokenRequest r15) {
        /*
            r14 = this;
            java.lang.String r0 = "com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService"
            gck r1 = r14.d
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r1 = r1.a((com.google.android.gms.auth.firstparty.dataservice.TokenRequest) r15)
            java.lang.String r2 = "Internal error."
            r3 = 8
            if (r1 == 0) goto L_0x0205
            com.google.android.gms.auth.TokenData r4 = r1.w
            r5 = 0
            if (r4 == 0) goto L_0x001f
            abfb r15 = new abfb
            ampu r0 = defpackage.ampu.a
            amri r1 = defpackage.amri.c(r4)
            r15.<init>(r5, r0, r1)
            return r15
        L_0x001f:
            gei r4 = r1.b()
            boolean r4 = defpackage.gei.a((defpackage.gei) r4)
            if (r4 == 0) goto L_0x017e
            agvx r1 = defpackage.abdl.b
            java.lang.Object r1 = r1.c()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x003f
            android.content.Context r0 = r14.b
            android.content.Intent r15 = defpackage.pzt.a(r0, r15)
            goto L_0x0135
        L_0x003f:
            qac r1 = r14.e     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest r4 = new com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            r4.<init>()     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.accounts.Account r6 = r15.a()     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            r4.a((android.accounts.Account) r6)     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            java.lang.String r6 = r15.b     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            r4.b = r6     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.os.Bundle r6 = r15.b()     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            r4.a((android.os.Bundle) r6)     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            com.google.android.gms.auth.firstparty.shared.PACLConfig r6 = r15.f     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            r4.f = r6     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            com.google.android.gms.auth.firstparty.shared.AppDescription r6 = r15.j     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            r4.h = r6     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.os.Bundle r15 = r15.b()     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            java.lang.String r6 = "suppressProgressScreen"
            boolean r15 = r15.getBoolean(r6, r5)     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            r4.g = r15     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            qab r15 = defpackage.qac.a     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.content.Context r6 = r1.b     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            amri r15 = r15.a(r6)     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            boolean r15 = r15.a()     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            r6 = 0
            if (r15 != 0) goto L_0x007c
            goto L_0x0081
        L_0x007c:
            r4.f = r6     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            r4.b()     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
        L_0x0081:
            pzy r15 = new pzy     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            r15.<init>(r4)     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.content.Context r4 = r1.b     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.content.Intent r7 = r1.c     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.content.pm.ResolveInfo r7 = r4.resolveService(r7, r5)     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            if (r7 == 0) goto L_0x0163
            android.content.pm.ServiceInfo r8 = r7.serviceInfo     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            if (r8 == 0) goto L_0x0163
            android.content.pm.ServiceInfo r8 = r7.serviceInfo     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.content.pm.ApplicationInfo r8 = r8.applicationInfo     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            if (r8 == 0) goto L_0x0163
            android.content.Context r8 = r1.b     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo()     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            int r8 = r8.uid     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.content.pm.ServiceInfo r9 = r7.serviceInfo     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.content.pm.ApplicationInfo r9 = r9.applicationInfo     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            int r9 = r9.uid     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            int r4 = r4.checkSignatures(r8, r9)     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            if (r4 != 0) goto L_0x015b
            android.content.Intent r4 = r1.c     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.content.pm.ServiceInfo r7 = r7.serviceInfo     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            java.lang.String r7 = r7.packageName     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            r4.setPackage(r7)     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            hwz r4 = new hwz     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            r4.<init>()     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            jca r8 = defpackage.jca.a()     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.content.Context r9 = r1.b     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            java.lang.String r10 = "AuthUiDelegateHelper"
            android.content.Intent r11 = r1.c     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            r13 = 1
            r12 = r4
            boolean r7 = r8.a((android.content.Context) r9, (java.lang.String) r10, (android.content.Intent) r11, (android.content.ServiceConnection) r12, (int) r13)     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            if (r7 == 0) goto L_0x0153
            android.os.IBinder r7 = r4.a()     // Catch:{ InterruptedException -> 0x00ee }
            if (r7 == 0) goto L_0x00eb
            android.os.IInterface r8 = r7.queryLocalInterface(r0)     // Catch:{ InterruptedException -> 0x00ee }
            boolean r9 = r8 instanceof defpackage.gdn     // Catch:{ InterruptedException -> 0x00ee }
            if (r9 != 0) goto L_0x00e7
            gdl r8 = new gdl     // Catch:{ InterruptedException -> 0x00ee }
            r8.<init>(r7)     // Catch:{ InterruptedException -> 0x00ee }
            r6 = r8
            goto L_0x0108
        L_0x00e7:
            gdn r8 = (defpackage.gdn) r8     // Catch:{ InterruptedException -> 0x00ee }
            r6 = r8
            goto L_0x0108
        L_0x00eb:
            goto L_0x0108
        L_0x00ec:
            r15 = move-exception
            goto L_0x0149
        L_0x00ee:
            r7 = move-exception
            android.os.IBinder r7 = r4.a()     // Catch:{ all -> 0x00ec }
            if (r7 == 0) goto L_0x0107
            android.os.IInterface r0 = r7.queryLocalInterface(r0)     // Catch:{ all -> 0x00ec }
            boolean r6 = r0 instanceof defpackage.gdn     // Catch:{ all -> 0x00ec }
            if (r6 != 0) goto L_0x0103
            gdl r6 = new gdl     // Catch:{ all -> 0x00ec }
            r6.<init>(r7)     // Catch:{ all -> 0x00ec }
            goto L_0x0108
        L_0x0103:
            r6 = r0
            gdn r6 = (defpackage.gdn) r6     // Catch:{ all -> 0x00ec }
            goto L_0x0108
        L_0x0107:
        L_0x0108:
            com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest r15 = r15.a     // Catch:{ all -> 0x00ec }
            android.app.PendingIntent r15 = r6.a((com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest) r15)     // Catch:{ all -> 0x00ec }
            android.content.Context r0 = r1.b     // Catch:{ all -> 0x00ec }
            hya r0 = defpackage.hya.a((android.content.Context) r0)     // Catch:{ all -> 0x00ec }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00ec }
            int r6 = r15.getCreatorUid()     // Catch:{ all -> 0x00ec }
            boolean r0 = r0.a((int) r6)     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x0141
            jca r0 = defpackage.jca.a()     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.content.Context r1 = r1.b     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            r0.a((android.content.Context) r1, (android.content.ServiceConnection) r4)     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.content.Context r0 = r14.b     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            amzy r1 = c     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.app.PendingIntent r15 = defpackage.pzw.a((android.content.Context) r0, (android.app.PendingIntent) r15, (defpackage.amzy) r1)     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.content.Intent r15 = defpackage.fzm.a(r15)     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
        L_0x0135:
            r0 = 4
            amri r15 = defpackage.amri.b(r15)
            java.lang.String r1 = "Sign-in required."
            abfb r15 = defpackage.abfb.a(r0, r1, r15)
            return r15
        L_0x0141:
            java.lang.SecurityException r15 = new java.lang.SecurityException     // Catch:{ all -> 0x00ec }
            java.lang.String r0 = "Invalid delegate! Only first party auth delegates are supported."
            r15.<init>(r0)     // Catch:{ all -> 0x00ec }
            throw r15     // Catch:{ all -> 0x00ec }
        L_0x0149:
            jca r0 = defpackage.jca.a()     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            android.content.Context r1 = r1.b     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            r0.a((android.content.Context) r1, (android.content.ServiceConnection) r4)     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            throw r15     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
        L_0x0153:
            java.lang.InterruptedException r15 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            java.lang.String r0 = "Unable to bind to auth delegate service."
            r15.<init>(r0)     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            throw r15     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
        L_0x015b:
            java.lang.SecurityException r15 = new java.lang.SecurityException     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            java.lang.String r0 = "Cannot delegate to the service with different signature."
            r15.<init>(r0)     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            throw r15     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
        L_0x0163:
            java.lang.SecurityException r15 = new java.lang.SecurityException     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            java.lang.String r0 = "Couldn't resolve AuthDelegateService intent to a delegate service."
            r15.<init>(r0)     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
            throw r15     // Catch:{ InterruptedException -> 0x016d, RemoteException -> 0x016b }
        L_0x016b:
            r15 = move-exception
            goto L_0x016e
        L_0x016d:
            r15 = move-exception
        L_0x016e:
            iwd r0 = a
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r4 = "Unable to fetch the intent to launch token retrieval workflow."
            r0.e(r4, r15, r1)
            ampu r15 = defpackage.ampu.a
            abfb r15 = defpackage.abfb.a(r3, r2, r15)
            return r15
        L_0x017e:
            gei r15 = r1.b()
            boolean r15 = defpackage.gei.b((defpackage.gei) r15)
            if (r15 == 0) goto L_0x01a5
            gei r15 = defpackage.gei.NETWORK_ERROR
            gei r0 = r1.b()
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x019e
            r15 = 7
            ampu r0 = defpackage.ampu.a
            java.lang.String r1 = "Network error."
            abfb r15 = defpackage.abfb.a(r15, r1, r0)
            return r15
        L_0x019e:
            ampu r15 = defpackage.ampu.a
            abfb r15 = defpackage.abfb.a(r3, r2, r15)
            return r15
        L_0x01a5:
            gei r15 = defpackage.gei.SERVICE_DISABLED
            gei r0 = r1.b()
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x01bc
            r15 = 16
            ampu r0 = defpackage.ampu.a
            java.lang.String r1 = "Account or application is not allowed to use some or all of Google services."
            abfb r15 = defpackage.abfb.a(r15, r1, r0)
            return r15
        L_0x01bc:
            gei r15 = defpackage.gei.INVALID_AUDIENCE
            gei r0 = r1.b()
            boolean r15 = r15.equals(r0)
            if (r15 != 0) goto L_0x01e0
            gei r15 = defpackage.gei.UNREGISTERED_ON_API_CONSOLE
            gei r0 = r1.b()
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L_0x01d5
            goto L_0x01e0
        L_0x01d5:
            r15 = 17
            ampu r0 = defpackage.ampu.a
            java.lang.String r1 = "Sign-in failed."
            abfb r15 = defpackage.abfb.a(r15, r1, r0)
            return r15
        L_0x01e0:
            gei r15 = r1.b()
            java.lang.String r15 = r15.ac
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r0 = "Mis-configured OAuth client, please check. Detailed error: "
            int r1 = r15.length()
            if (r1 != 0) goto L_0x01f8
            java.lang.String r15 = new java.lang.String
            r15.<init>(r0)
            goto L_0x01fc
        L_0x01f8:
            java.lang.String r15 = r0.concat(r15)
        L_0x01fc:
            r0 = 10
            ampu r1 = defpackage.ampu.a
            abfb r15 = defpackage.abfb.a(r0, r15, r1)
            return r15
        L_0x0205:
            ampu r15 = defpackage.ampu.a
            abfb r15 = defpackage.abfb.a(r3, r2, r15)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abfa.a(com.google.android.gms.auth.firstparty.dataservice.TokenRequest):abfb");
    }
}
