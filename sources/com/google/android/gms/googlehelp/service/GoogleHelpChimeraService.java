package com.google.android.gms.googlehelp.service;

import android.accounts.Account;
import android.os.Looper;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleHelpChimeraService extends jaz implements nzc {
    public static List a;
    public ofn i;
    public nze j;
    private okc k;
    private nzx l = new nzx();

    public GoogleHelpChimeraService() {
        super(63, "com.google.android.gms.googlehelp.service.GoogleHelpService.START", Collections.emptySet(), 1, 9);
        new qvr(Looper.getMainLooper());
    }

    public static synchronized void a(HelpConfig helpConfig) {
        synchronized (GoogleHelpChimeraService.class) {
            nzz d = d(helpConfig);
            if (d != null && d.b == helpConfig.S) {
                d.b(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized defpackage.nzz b(java.lang.String r5) {
        /*
            java.lang.Class<com.google.android.gms.googlehelp.service.GoogleHelpChimeraService> r0 = com.google.android.gms.googlehelp.service.GoogleHelpChimeraService.class
            monitor-enter(r0)
            java.util.List r1 = a     // Catch:{ all -> 0x0028 }
            r2 = 0
            if (r1 == 0) goto L_0x0026
            r1 = 0
        L_0x0009:
            java.util.List r3 = a     // Catch:{ all -> 0x0028 }
            int r3 = r3.size()     // Catch:{ all -> 0x0028 }
            if (r1 >= r3) goto L_0x0026
            java.util.List r3 = a     // Catch:{ all -> 0x0028 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0028 }
            nzz r3 = (defpackage.nzz) r3     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = r3.a     // Catch:{ all -> 0x0028 }
            boolean r4 = android.text.TextUtils.equals(r4, r5)     // Catch:{ all -> 0x0028 }
            if (r4 != 0) goto L_0x0024
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0024:
            monitor-exit(r0)
            return r3
        L_0x0026:
            monitor-exit(r0)
            return r2
        L_0x0028:
            r5 = move-exception
            monitor-exit(r0)
            goto L_0x002c
        L_0x002b:
            throw r5
        L_0x002c:
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.service.GoogleHelpChimeraService.b(java.lang.String):nzz");
    }

    public static String c(HelpConfig helpConfig) {
        String str;
        String str2 = helpConfig.b;
        if (str2 == null) {
            str2 = "unknown_package_name";
        }
        Account account = helpConfig.d;
        if (account != null) {
            str = account.name;
        } else {
            str = "unknown_account_name";
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf);
    }

    public static nzz d(HelpConfig helpConfig) {
        return b(c(helpConfig));
    }

    public final void onDestroy() {
        okc okc = this.k;
        if (okc != null) {
            okc.close();
        }
        ofn ofn = this.i;
        if (ofn != null) {
            ofn.close();
        }
        super.onDestroy();
    }

    public static synchronized void b(HelpConfig helpConfig) {
        synchronized (GoogleHelpChimeraService.class) {
            nzz d = d(helpConfig);
            if (d != null && d.b == helpConfig.S) {
                d.a(true);
            }
        }
    }

    public static synchronized void a(HelpConfig helpConfig, boolean z) {
        synchronized (GoogleHelpChimeraService.class) {
            String c = c(helpConfig);
            if (a == null) {
                ArrayList arrayList = new ArrayList(1);
                a = arrayList;
                arrayList.add(new nzz(c, helpConfig.S, z));
                return;
            }
            nzz b = b(c);
            if (b == null) {
                a.add(new nzz(c, helpConfig.S, z));
                return;
            }
            b.b = helpConfig.S;
            b.b(false);
            b.a(false);
            b.c = z;
            b.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r1 == 1) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        a.remove(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        a = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(java.lang.String r4) {
        /*
            java.lang.Class<com.google.android.gms.googlehelp.service.GoogleHelpChimeraService> r0 = com.google.android.gms.googlehelp.service.GoogleHelpChimeraService.class
            monitor-enter(r0)
            java.util.List r1 = a     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x002b
            java.util.List r1 = a     // Catch:{ all -> 0x0031 }
            int r1 = r1.size()     // Catch:{ all -> 0x0031 }
            r2 = 0
        L_0x000e:
            if (r2 >= r1) goto L_0x002b
            java.util.List r3 = a     // Catch:{ all -> 0x0031 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0031 }
            nzz r3 = (defpackage.nzz) r3     // Catch:{ all -> 0x0031 }
            java.lang.String r3 = r3.a     // Catch:{ all -> 0x0031 }
            boolean r3 = android.text.TextUtils.equals(r3, r4)     // Catch:{ all -> 0x0031 }
            if (r3 != 0) goto L_0x0023
            int r2 = r2 + 1
            goto L_0x000e
        L_0x0023:
            r4 = 1
            if (r1 == r4) goto L_0x002d
            java.util.List r4 = a     // Catch:{ all -> 0x0031 }
            r4.remove(r2)     // Catch:{ all -> 0x0031 }
        L_0x002b:
            monitor-exit(r0)
            return
        L_0x002d:
            r4 = 0
            a = r4     // Catch:{ all -> 0x0031 }
            goto L_0x002b
        L_0x0031:
            r4 = move-exception
            monitor-exit(r0)
            goto L_0x0035
        L_0x0034:
            throw r4
        L_0x0035:
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.service.GoogleHelpChimeraService.a(java.lang.String):void");
    }

    public final okc a() {
        if (this.k == null) {
            this.k = new okc(this);
        }
        return this.k;
    }

    /* access modifiers changed from: protected */
    public final void a(jbb jbb, GetServiceRequest getServiceRequest) {
        jbb.a(new onr(this, getServiceRequest.d));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.nzc r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            nze r0 = r2.j     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0013
            nzx r0 = r2.l     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0011
            onn r1 = new onn     // Catch:{ all -> 0x0018 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0018 }
            r0.addObserver(r1)     // Catch:{ all -> 0x0018 }
        L_0x0011:
            monitor-exit(r2)
            return
        L_0x0013:
            r3.a(r0)     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            return
        L_0x0018:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.service.GoogleHelpChimeraService.a(nzc):void");
    }

    public final synchronized void a(nze nze) {
        nzx nzx = this.l;
        if (nzx != null) {
            this.j = nze;
            nzx.a();
            this.l = null;
        }
    }
}
