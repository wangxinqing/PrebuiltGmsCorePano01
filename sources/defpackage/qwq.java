package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: qwq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qwq {
    private static qwq d;
    public final Context a;
    public final aoru b;
    public final Map c = new nz();
    private final amsv e = amta.a((amsv) new qwg(this));
    private final amsv f = amta.a((amsv) new qwh(this));

    private qwq(Context context) {
        aoru b2 = jfm.b(10);
        this.a = context;
        this.b = b2;
    }

    public static qwq a(Context context) {
        qwq qwq;
        synchronized (qwq.class) {
            if (d == null) {
                d = new qwq(context.getApplicationContext());
            }
            qwq = d;
        }
        return qwq;
    }

    private static int b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return -1;
        } catch (PackageManager.NameNotFoundException e2) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public final qxp c() {
        return (qxp) this.e.a();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean d(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.c     // Catch:{ all -> 0x001c }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x001c }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x001c }
            r0 = 0
            if (r3 == 0) goto L_0x001a
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x001c }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x001c }
            if (r2 == 0) goto L_0x001a
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x001c }
            monitor-exit(r1)
            return r2
        L_0x001a:
            monitor-exit(r1)
            return r0
        L_0x001c:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwq.d(java.lang.String, java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c(String str, String str2) {
        Map map = (Map) this.c.get(str2);
        if (!(map == null || map.remove(str) == null || !map.isEmpty())) {
            this.c.remove(str2);
        }
    }

    private final void a(String str, boolean z) {
        List<ResolveInfo> list;
        Intent intent;
        iva.a((Object) str, (Object) "GmsTaskChimeraService must not be null.");
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager == null) {
            list = amzy.h();
        } else {
            if (str == null) {
                intent = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setPackage(this.a.getPackageName());
            } else {
                intent = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY").setClassName(this.a, str);
            }
            list = packageManager.queryIntentServices(intent, 0);
        }
        if (!jir.a((Collection) list)) {
            for (ResolveInfo resolveInfo : list) {
                if (resolveInfo.serviceInfo != null && resolveInfo.serviceInfo.enabled) {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
            sb.append("The task service proxy class you provided ");
            sb.append(str);
            sb.append(" does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY");
            throw new IllegalArgumentException(sb.toString());
        }
        if (z) {
            if (qyg.a(this.a, String.valueOf(str).concat(".ACTION_TASK_READY")) != null) {
                return;
            }
        }
        Log.e("GmsTaskScheduler", String.valueOf(str).concat(" is not available. This may cause the task to be lost."));
    }

    static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must provide a valid tag.");
        } else if (str.length() > 100) {
            throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized qxp b() {
        int i;
        int b2 = b(this.a);
        if (b2 <= 0) {
            Log.e("GmsTaskScheduler", "Google Play services is not available, dropping all GcmNetworkManager requests");
            return new qxq();
        }
        if (b2 < 15300000) {
            i = 4;
        } else {
            i = 16;
        }
        return new qxo(this.a, i, b2);
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean c(String str) {
        return this.c.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean b(String str, String str2) {
        Map map = (Map) this.c.get(str2);
        if (map == null) {
            map = new nz();
            this.c.put(str2, map);
        }
        return map.put(str, false) == null;
    }

    /* access modifiers changed from: package-private */
    public final synchronized aorr a() {
        int i;
        int b2 = b(this.a);
        if (b2 <= 0) {
            Log.e("GmsTaskScheduler", "Google Play services is not available, dropping all GcmNetworkManager requests");
            return aorl.a((Object) new qxq());
        }
        if (b2 < 15300000) {
            i = 4;
        } else {
            i = 16;
        }
        if (!axbn.b()) {
            return aorl.a((Object) new qxo(this.a, i, b2));
        }
        return ahe.a(new qwi(this, i, b2));
    }

    public final void a(String str) {
        ComponentName componentName = new ComponentName(this.a, str);
        qye qye = new qye("nts:client:cancelAll");
        try {
            a(componentName.getClassName(), true);
            a((qwp) new qwl(componentName));
            qye.close();
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void a(String str, String str2) {
        ComponentName componentName = new ComponentName(this.a, str2);
        String valueOf = String.valueOf(str);
        qye qye = new qye(valueOf.length() == 0 ? new String("nts:client:cancel:") : "nts:client:cancel:".concat(valueOf));
        try {
            b(str);
            a(componentName.getClassName(), true);
            a((qwp) new qwk(componentName, str));
            qye.close();
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(qwp qwp) {
        if (axbn.a.a().d()) {
            aorl.a((aorr) this.f.a(), new qwo(qwp), aoqm.a);
        } else {
            qwp.a(c());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r1 == 2) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r1 == 2) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.qxx r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            qye r0 = new qye     // Catch:{ all -> 0x006e }
            java.lang.String r1 = r5.g     // Catch:{ all -> 0x006e }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x006e }
            java.lang.String r2 = "nts:client:schedule:"
            int r3 = r1.length()     // Catch:{ all -> 0x006e }
            if (r3 != 0) goto L_0x0017
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x006e }
            r1.<init>(r2)     // Catch:{ all -> 0x006e }
            goto L_0x001b
        L_0x0017:
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x006e }
        L_0x001b:
            r0.<init>(r1)     // Catch:{ all -> 0x006e }
            int r1 = r5.f     // Catch:{ all -> 0x0064 }
            r2 = 2
            if (r1 != 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            if (r1 != r2) goto L_0x002c
        L_0x0026:
            java.lang.String r1 = r5.e     // Catch:{ all -> 0x0064 }
            r3 = 0
            r4.a((java.lang.String) r1, (boolean) r3)     // Catch:{ all -> 0x0064 }
        L_0x002c:
            int r1 = r5.f     // Catch:{ all -> 0x0064 }
            r3 = 1
            if (r1 != r3) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            if (r1 != r2) goto L_0x0057
        L_0x0034:
            java.lang.String r1 = r5.e     // Catch:{ all -> 0x0064 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = ".ACTION_TASK_READY"
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x0064 }
            android.content.Context r3 = r4.a     // Catch:{ all -> 0x0064 }
            android.content.Intent r2 = defpackage.qyg.a(r3, r2)     // Catch:{ all -> 0x0064 }
            if (r2 != 0) goto L_0x0057
            java.lang.String r2 = "GmsTaskScheduler"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = " is not available. This may cause the task to be lost."
            java.lang.String r1 = r1.concat(r3)     // Catch:{ all -> 0x0064 }
            android.util.Log.e(r2, r1)     // Catch:{ all -> 0x0064 }
        L_0x0057:
            qwj r1 = new qwj     // Catch:{ all -> 0x0064 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0064 }
            r4.a((defpackage.qwp) r1)     // Catch:{ all -> 0x0064 }
            r0.close()     // Catch:{ all -> 0x006e }
            monitor-exit(r4)
            return
        L_0x0064:
            r5 = move-exception
            r0.close()     // Catch:{ all -> 0x0069 }
            goto L_0x006d
        L_0x0069:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r5, (java.lang.Throwable) r0)     // Catch:{ all -> 0x006e }
        L_0x006d:
            throw r5     // Catch:{ all -> 0x006e }
        L_0x006e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwq.a(qxx):void");
    }
}
