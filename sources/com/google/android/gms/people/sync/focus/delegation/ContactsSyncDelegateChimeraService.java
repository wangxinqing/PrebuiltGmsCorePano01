package com.google.android.gms.people.sync.focus.delegation;

import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ContactsSyncDelegateChimeraService extends TracingIntentService {
    public ContactsSyncDelegateChimeraService() {
        super("FSA2_ContactsSyncDelegateService");
    }

    private static final void a(String str) {
        xdt.b("FSA2_ContactsSyncDelegateService", "Invalid inputs (%s)", str);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i2, i2);
        return 2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f8, code lost:
        if (r9.equals("sync") != false) goto L_0x00fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x000a
            java.lang.String r9 = "null intent"
            a((java.lang.String) r9)
            r4 = r0
            goto L_0x0068
        L_0x000a:
            android.os.Bundle r9 = r9.getExtras()
            if (r9 != 0) goto L_0x0017
            java.lang.String r9 = "no extras found"
            a((java.lang.String) r9)
            r4 = r0
            goto L_0x0068
        L_0x0017:
            java.lang.String r1 = "syncId"
            java.lang.String r1 = r9.getString(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x002b
            java.lang.String r9 = "missing syncId"
            a((java.lang.String) r9)
            r4 = r0
            goto L_0x0068
        L_0x002b:
            java.lang.String r2 = "directive"
            java.lang.String r2 = r9.getString(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x003f
            java.lang.String r9 = "missing directive"
            a((java.lang.String) r9)
            r4 = r0
            goto L_0x0068
        L_0x003f:
            java.lang.String r3 = "account"
            android.os.Parcelable r3 = r9.getParcelable(r3)
            android.accounts.Account r3 = (android.accounts.Account) r3
            if (r3 != 0) goto L_0x0051
            java.lang.String r9 = "missing account"
            a((java.lang.String) r9)
            r4 = r0
            goto L_0x0068
        L_0x0051:
            java.lang.String r4 = "bundle"
            android.os.Parcelable r9 = r9.getParcelable(r4)
            android.os.Bundle r9 = (android.os.Bundle) r9
            if (r9 != 0) goto L_0x0063
            java.lang.String r9 = "missing sync-bundle"
            a((java.lang.String) r9)
            r4 = r0
            goto L_0x0068
        L_0x0063:
            xws r4 = new xws
            r4.<init>(r1, r2, r3, r9)
        L_0x0068:
            if (r4 == 0) goto L_0x0172
            defpackage.xip.a()
            ayrj r9 = defpackage.ayrj.a
            aytn r9 = r9.a()
            boolean r9 = r9.bH()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            boolean r9 = r9.booleanValue()
            r1 = 0
            r2 = -1
            if (r9 == 0) goto L_0x009a
            android.content.pm.PackageManager r9 = r8.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0090 }
            java.lang.String r3 = "com.google.android.syncadapters.contacts"
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo(r3, r1)     // Catch:{ NameNotFoundException -> 0x0090 }
            int r9 = r9.uid     // Catch:{ NameNotFoundException -> 0x0090 }
            goto L_0x009b
        L_0x0090:
            r9 = move-exception
            java.lang.String r3 = "FSA2_ContactsSyncDelegateService"
            java.lang.String r5 = "Legacy sync adapter package not found."
            android.util.Log.e(r3, r5, r9)
            r9 = -1
            goto L_0x009b
        L_0x009a:
            r9 = -1
        L_0x009b:
            xpp r9 = defpackage.xpp.a((android.content.Context) r8, (int) r9)
            xwr r3 = defpackage.xwr.a(r8)
            android.content.Context r5 = r8.getApplicationContext()
            defpackage.xvh.a((android.content.Context) r5, (defpackage.xwr) r3, (defpackage.xpp) r9)
            java.lang.String r9 = r4.b
            java.lang.String r5 = "sync"
            boolean r5 = r5.equals(r9)
            r6 = 1
            if (r5 != 0) goto L_0x00d9
            java.lang.String r5 = "abort"
            boolean r5 = r5.equals(r9)
            if (r5 != 0) goto L_0x00d9
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r1] = r9
            java.lang.String r9 = "FSA2_ContactsSyncDelegateService"
            java.lang.String r1 = "Invalid [%s] directive"
            defpackage.xdt.b(r9, r1, r2)
            java.lang.String r9 = r4.a
            java.lang.Object r5 = r3.a
            monitor-enter(r5)
            if (r9 == 0) goto L_0x00d4
            java.lang.String r1 = "invalid-sync-request"
            r3.a(r9, r1, r0)     // Catch:{ all -> 0x00d6 }
        L_0x00d4:
            monitor-exit(r5)     // Catch:{ all -> 0x00d6 }
            return
        L_0x00d6:
            r9 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00d6 }
            throw r9
        L_0x00d9:
            int r5 = r9.hashCode()
            r7 = 3545755(0x361a9b, float:4.968661E-39)
            if (r5 == r7) goto L_0x00f2
            r1 = 92611376(0x5852330, float:1.2520186E-35)
            if (r5 == r1) goto L_0x00e8
            goto L_0x00fb
        L_0x00e8:
            java.lang.String r1 = "abort"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x00fb
            r1 = 1
            goto L_0x00fc
        L_0x00f2:
            java.lang.String r5 = "sync"
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto L_0x00fb
            goto L_0x00fc
        L_0x00fb:
            r1 = -1
        L_0x00fc:
            if (r1 == 0) goto L_0x013c
            if (r1 == r6) goto L_0x0101
            return
        L_0x0101:
            java.lang.String r9 = r4.a
            java.lang.Object r1 = r3.a
            monitor-enter(r1)
            r3.d = r0     // Catch:{ all -> 0x0139 }
            java.lang.String r2 = r3.b     // Catch:{ all -> 0x0139 }
            if (r2 == 0) goto L_0x0135
            boolean r9 = r2.equals(r9)     // Catch:{ all -> 0x0139 }
            if (r9 != 0) goto L_0x011a
            java.lang.String r9 = "FSA2_SyncCoordinator"
            java.lang.String r0 = "Ignoring out-of-sequence abort request"
            android.util.Log.i(r9, r0)     // Catch:{ all -> 0x0139 }
            goto L_0x0137
        L_0x011a:
            r3.b = r0     // Catch:{ all -> 0x0139 }
            xvd r9 = r3.c     // Catch:{ all -> 0x0139 }
            r9.a()     // Catch:{ all -> 0x0139 }
            ayrz r9 = defpackage.ayrz.a     // Catch:{ all -> 0x0139 }
            aysa r9 = r9.a()     // Catch:{ all -> 0x0139 }
            boolean r9 = r9.i()     // Catch:{ all -> 0x0139 }
            if (r9 == 0) goto L_0x0137
            android.os.Bundle r9 = r4.d     // Catch:{ all -> 0x0139 }
            android.accounts.Account r0 = r4.c     // Catch:{ all -> 0x0139 }
            defpackage.xwr.a(r9, r0)     // Catch:{ all -> 0x0139 }
            goto L_0x0137
        L_0x0135:
            r3.d = r9     // Catch:{ all -> 0x0139 }
        L_0x0137:
            monitor-exit(r1)     // Catch:{ all -> 0x0139 }
            return
        L_0x0139:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0139 }
            throw r9
        L_0x013c:
            java.lang.String r9 = r4.a
            java.lang.Object r1 = r3.a
            monitor-enter(r1)
            java.lang.String r2 = r3.d     // Catch:{ all -> 0x016f }
            boolean r2 = r9.equals(r2)     // Catch:{ all -> 0x016f }
            r3.d = r0     // Catch:{ all -> 0x016f }
            if (r2 != 0) goto L_0x016d
            java.lang.String r2 = r3.b     // Catch:{ all -> 0x016f }
            if (r2 != 0) goto L_0x016d
            r3.b = r9     // Catch:{ all -> 0x016f }
            java.lang.String r2 = "processing-sync-request"
            r3.a(r9, r2, r0)     // Catch:{ all -> 0x016f }
            xvd r9 = r3.c     // Catch:{ all -> 0x016f }
            android.accounts.Account r0 = r4.c     // Catch:{ all -> 0x016f }
            android.os.Bundle r2 = r4.d     // Catch:{ all -> 0x016f }
            xvc r3 = r9.a     // Catch:{ all -> 0x016f }
            if (r3 != 0) goto L_0x016d
            xvc r3 = new xvc     // Catch:{ all -> 0x016f }
            r3.<init>(r9, r0, r2)     // Catch:{ all -> 0x016f }
            r9.a = r3     // Catch:{ all -> 0x016f }
            r3.getId()     // Catch:{ all -> 0x016f }
            r3.start()     // Catch:{ all -> 0x016f }
        L_0x016d:
            monitor-exit(r1)     // Catch:{ all -> 0x016f }
            return
        L_0x016f:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x016f }
            throw r9
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.people.sync.focus.delegation.ContactsSyncDelegateChimeraService.a(android.content.Intent):void");
    }
}
