package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;

/* renamed from: dmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dmj implements ServiceConnection {
    public volatile dpf a;
    public volatile boolean b;
    final /* synthetic */ dmk c;

    protected dmj(dmk dmk) {
        this.c = dmk;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0053 A[SYNTHETIC, Splitter:B:28:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0067 A[SYNTHETIC, Splitter:B:31:0x0067] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
            r2 = this;
            java.lang.String r3 = "AnalyticsServiceConnection.onServiceConnected"
            defpackage.iva.a((java.lang.String) r3)
            monitor-enter(r2)
            if (r4 != 0) goto L_0x0014
            dmk r3 = r2.c     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = "Service connected with null binder"
            r3.e(r4)     // Catch:{ all -> 0x0047 }
            r2.notifyAll()     // Catch:{ all -> 0x008c }
            monitor-exit(r2)     // Catch:{ all -> 0x008c }
            return
        L_0x0014:
            r3 = 0
            java.lang.String r0 = r4.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0049 }
            java.lang.String r1 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            boolean r1 = r1.equals(r0)     // Catch:{ RemoteException -> 0x0049 }
            if (r1 == 0) goto L_0x003f
            java.lang.String r0 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)     // Catch:{ RemoteException -> 0x0049 }
            boolean r1 = r0 instanceof defpackage.dpf     // Catch:{ RemoteException -> 0x0049 }
            if (r1 != 0) goto L_0x0032
            dpd r0 = new dpd     // Catch:{ RemoteException -> 0x0049 }
            r0.<init>(r4)     // Catch:{ RemoteException -> 0x0049 }
            r3 = r0
            goto L_0x0035
        L_0x0032:
            dpf r0 = (defpackage.dpf) r0     // Catch:{ RemoteException -> 0x0049 }
            r3 = r0
        L_0x0035:
            dmk r4 = r2.c     // Catch:{ RemoteException -> 0x003d }
            java.lang.String r0 = "Bound to IAnalyticsService interface"
            r4.b(r0)     // Catch:{ RemoteException -> 0x003d }
            goto L_0x0051
        L_0x003d:
            r4 = move-exception
            goto L_0x004a
        L_0x003f:
            dmk r4 = r2.c     // Catch:{ RemoteException -> 0x0049 }
            java.lang.String r1 = "Got binder with a wrong descriptor"
            r4.e(r1, r0)     // Catch:{ RemoteException -> 0x0049 }
            goto L_0x0051
        L_0x0047:
            r3 = move-exception
            goto L_0x0088
        L_0x0049:
            r4 = move-exception
        L_0x004a:
            dmk r4 = r2.c     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "Service connect failed to get IAnalyticsService"
            r4.e(r0)     // Catch:{ all -> 0x0047 }
        L_0x0051:
            if (r3 != 0) goto L_0x0067
            jca r3 = defpackage.jca.a()     // Catch:{ IllegalArgumentException -> 0x0065 }
            dmk r4 = r2.c     // Catch:{ IllegalArgumentException -> 0x0065 }
            android.content.Context r4 = r4.d()     // Catch:{ IllegalArgumentException -> 0x0065 }
            dmk r0 = r2.c     // Catch:{ IllegalArgumentException -> 0x0065 }
            dmj r0 = r0.a     // Catch:{ IllegalArgumentException -> 0x0065 }
            r3.a((android.content.Context) r4, (android.content.ServiceConnection) r0)     // Catch:{ IllegalArgumentException -> 0x0065 }
            goto L_0x0083
        L_0x0065:
            r3 = move-exception
            goto L_0x0083
        L_0x0067:
            boolean r4 = r2.b     // Catch:{ all -> 0x0047 }
            if (r4 != 0) goto L_0x0081
            dmk r4 = r2.c     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "onServiceConnected received after the timeout limit"
            r4.d(r0)     // Catch:{ all -> 0x0047 }
            dmk r4 = r2.c     // Catch:{ all -> 0x0047 }
            dkw r4 = r4.g()     // Catch:{ all -> 0x0047 }
            dmh r0 = new dmh     // Catch:{ all -> 0x0047 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0047 }
            r4.a((java.lang.Runnable) r0)     // Catch:{ all -> 0x0047 }
            goto L_0x0083
        L_0x0081:
            r2.a = r3     // Catch:{ all -> 0x0047 }
        L_0x0083:
            r2.notifyAll()     // Catch:{ all -> 0x008c }
            monitor-exit(r2)     // Catch:{ all -> 0x008c }
            return
        L_0x0088:
            r2.notifyAll()     // Catch:{ all -> 0x008c }
            throw r3     // Catch:{ all -> 0x008c }
        L_0x008c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmj.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        iva.a("AnalyticsServiceConnection.onServiceDisconnected");
        this.c.g().a((Runnable) new dmi(this, componentName));
    }
}
