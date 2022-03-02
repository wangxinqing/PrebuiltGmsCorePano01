package defpackage;

import android.content.Context;

/* renamed from: fxu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fxu {
    public final Context a;

    public fxu(Context context) {
        this.a = context.getApplicationContext();
    }

    public static void a(Context context) {
        try {
            hxz.l(context);
        } catch (hxx e) {
            throw new eif((Throwable) e);
        } catch (hxw e2) {
            throw new eif((Throwable) e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        r9 = new defpackage.fxv(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        r9 = (defpackage.fxx) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        r12 = r12.a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r7.a("com.google.android.gms.auth.APP_CERT", (android.content.ServiceConnection) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        android.os.Binder.restoreCallingIdentity(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r8 == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r9 = r8.queryLocalInterface("com.google.android.gms.auth.appcert.IAppCertService");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if ((r9 instanceof defpackage.fxx) != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.fxt r12) {
        /*
            r11 = this;
            java.lang.String r0 = "AppCertServiceClient"
            java.lang.String r1 = "com.google.android.gms.auth.APP_CERT"
            r2 = 2
            r3 = 1
        L_0x0006:
            long r4 = android.os.Binder.clearCallingIdentity()
            hwz r6 = new hwz     // Catch:{ all -> 0x0099 }
            r6.<init>()     // Catch:{ all -> 0x0099 }
            android.content.Context r7 = r11.a     // Catch:{ all -> 0x0099 }
            itc r7 = defpackage.itc.a(r7)     // Catch:{ all -> 0x0099 }
            boolean r8 = r7.a((java.lang.String) r1, (android.content.ServiceConnection) r6, (java.lang.String) r0)     // Catch:{ all -> 0x0099 }
            if (r8 == 0) goto L_0x0091
            android.os.IBinder r8 = r6.a()     // Catch:{ InterruptedException -> 0x0050, RemoteException -> 0x0042 }
            if (r8 == 0) goto L_0x0034
            java.lang.String r9 = "com.google.android.gms.auth.appcert.IAppCertService"
            android.os.IInterface r9 = r8.queryLocalInterface(r9)     // Catch:{ InterruptedException -> 0x0050, RemoteException -> 0x0042 }
            boolean r10 = r9 instanceof defpackage.fxx     // Catch:{ InterruptedException -> 0x0050, RemoteException -> 0x0042 }
            if (r10 != 0) goto L_0x0031
            fxv r9 = new fxv     // Catch:{ InterruptedException -> 0x0050, RemoteException -> 0x0042 }
            r9.<init>(r8)     // Catch:{ InterruptedException -> 0x0050, RemoteException -> 0x0042 }
            goto L_0x0035
        L_0x0031:
            fxx r9 = (defpackage.fxx) r9     // Catch:{ InterruptedException -> 0x0050, RemoteException -> 0x0042 }
            goto L_0x0035
        L_0x0034:
            r9 = 0
        L_0x0035:
            java.lang.Object r12 = r12.a(r9)     // Catch:{ InterruptedException -> 0x0050, RemoteException -> 0x0042 }
            r7.a((java.lang.String) r1, (android.content.ServiceConnection) r6)     // Catch:{ all -> 0x0099 }
            android.os.Binder.restoreCallingIdentity(r4)
            return r12
        L_0x0040:
            r12 = move-exception
            goto L_0x008d
        L_0x0042:
            r12 = move-exception
            java.lang.String r2 = "RemoteException when executing call!"
            android.util.Log.w(r0, r2, r12)     // Catch:{ all -> 0x0040 }
            java.io.IOException r12 = new java.io.IOException     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "remote exception"
            r12.<init>(r0)     // Catch:{ all -> 0x0040 }
            throw r12     // Catch:{ all -> 0x0040 }
        L_0x0050:
            r8 = move-exception
            if (r3 >= r2) goto L_0x005c
            r7.a((java.lang.String) r1, (android.content.ServiceConnection) r6)     // Catch:{ all -> 0x0099 }
            android.os.Binder.restoreCallingIdentity(r4)
            r3 = 2
            goto L_0x0006
        L_0x005c:
            java.lang.Thread r12 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0040 }
            r12.interrupt()     // Catch:{ all -> 0x0040 }
            java.lang.String r12 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0040 }
            java.lang.String r2 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0040 }
            int r2 = r2.length()     // Catch:{ all -> 0x0040 }
            int r2 = r2 + 34
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0040 }
            r3.<init>(r2)     // Catch:{ all -> 0x0040 }
            java.lang.String r2 = "Interrupted when getting service: "
            r3.append(r2)     // Catch:{ all -> 0x0040 }
            r3.append(r12)     // Catch:{ all -> 0x0040 }
            java.lang.String r12 = r3.toString()     // Catch:{ all -> 0x0040 }
            android.util.Log.w(r0, r12)     // Catch:{ all -> 0x0040 }
            eif r12 = new eif     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "Interrupted"
            r12.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0040 }
            throw r12     // Catch:{ all -> 0x0040 }
        L_0x008d:
            r7.a((java.lang.String) r1, (android.content.ServiceConnection) r6)     // Catch:{ all -> 0x0099 }
            throw r12     // Catch:{ all -> 0x0099 }
        L_0x0091:
            java.io.IOException r12 = new java.io.IOException     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "Could not bind to service with the given context."
            r12.<init>(r0)     // Catch:{ all -> 0x0099 }
            throw r12     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r12 = move-exception
            android.os.Binder.restoreCallingIdentity(r4)
            goto L_0x009f
        L_0x009e:
            throw r12
        L_0x009f:
            goto L_0x009e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxu.a(fxt):java.lang.Object");
    }

    public final String a(String str) {
        iva.b("Calling this from your main thread can crash your app");
        iva.a((Object) str, (Object) "Package name cannot be null!");
        a(this.a);
        return (String) a((fxt) new fxs(str));
    }
}
