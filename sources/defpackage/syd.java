package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: syd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class syd implements ServiceConnection, irn, iro {
    public volatile boolean a;
    public volatile sul b;
    final /* synthetic */ sye c;

    protected syd(sye sye) {
        this.c = sye;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            defpackage.iva.a((java.lang.String) r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001a
            r3.a = r4     // Catch:{ all -> 0x0059 }
            sye r4 = r3.c     // Catch:{ all -> 0x0059 }
            sut r4 = r4.E()     // Catch:{ all -> 0x0059 }
            sur r4 = r4.c     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = "Service connected with null binder"
            r4.a(r5)     // Catch:{ all -> 0x0059 }
            monitor-exit(r3)     // Catch:{ all -> 0x0059 }
            return
        L_0x001a:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x005b }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x005b }
            if (r2 == 0) goto L_0x004b
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x005b }
            boolean r2 = r1 instanceof defpackage.sug     // Catch:{ RemoteException -> 0x005b }
            if (r2 != 0) goto L_0x0038
            sue r1 = new sue     // Catch:{ RemoteException -> 0x005b }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x005b }
            r0 = r1
            goto L_0x003b
        L_0x0038:
            sug r1 = (defpackage.sug) r1     // Catch:{ RemoteException -> 0x005b }
            r0 = r1
        L_0x003b:
            sye r5 = r3.c     // Catch:{ RemoteException -> 0x0049 }
            sut r5 = r5.E()     // Catch:{ RemoteException -> 0x0049 }
            sur r5 = r5.k     // Catch:{ RemoteException -> 0x0049 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.a(r1)     // Catch:{ RemoteException -> 0x0049 }
            goto L_0x0069
        L_0x0049:
            r5 = move-exception
            goto L_0x005c
        L_0x004b:
            sye r5 = r3.c     // Catch:{ RemoteException -> 0x005b }
            sut r5 = r5.E()     // Catch:{ RemoteException -> 0x005b }
            sur r5 = r5.c     // Catch:{ RemoteException -> 0x005b }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.a(r2, r1)     // Catch:{ RemoteException -> 0x005b }
            goto L_0x0069
        L_0x0059:
            r4 = move-exception
            goto L_0x0091
        L_0x005b:
            r5 = move-exception
        L_0x005c:
            sye r5 = r3.c     // Catch:{ all -> 0x0059 }
            sut r5 = r5.E()     // Catch:{ all -> 0x0059 }
            sur r5 = r5.c     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.a(r1)     // Catch:{ all -> 0x0059 }
        L_0x0069:
            if (r0 == 0) goto L_0x007a
            sye r4 = r3.c     // Catch:{ all -> 0x0059 }
            svs r4 = r4.F()     // Catch:{ all -> 0x0059 }
            sxy r5 = new sxy     // Catch:{ all -> 0x0059 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0059 }
            r4.a((java.lang.Runnable) r5)     // Catch:{ all -> 0x0059 }
            goto L_0x008f
        L_0x007a:
            r3.a = r4     // Catch:{ all -> 0x0059 }
            jca r4 = defpackage.jca.a()     // Catch:{ IllegalArgumentException -> 0x008e }
            sye r5 = r3.c     // Catch:{ IllegalArgumentException -> 0x008e }
            android.content.Context r5 = r5.z()     // Catch:{ IllegalArgumentException -> 0x008e }
            sye r0 = r3.c     // Catch:{ IllegalArgumentException -> 0x008e }
            syd r0 = r0.b     // Catch:{ IllegalArgumentException -> 0x008e }
            r4.a((android.content.Context) r5, (android.content.ServiceConnection) r0)     // Catch:{ IllegalArgumentException -> 0x008e }
            goto L_0x008f
        L_0x008e:
            r4 = move-exception
        L_0x008f:
            monitor-exit(r3)     // Catch:{ all -> 0x0059 }
            return
        L_0x0091:
            monitor-exit(r3)     // Catch:{ all -> 0x0059 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.syd.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        iva.a("MeasurementServiceConnection.onServiceDisconnected");
        this.c.E().j.a("Service disconnected");
        this.c.F().a((Runnable) new sxz(this, componentName));
    }

    public final void a(int i) {
        iva.a("MeasurementServiceConnection.onConnectionSuspended");
        this.c.E().j.a("Service connection suspended");
        this.c.F().a((Runnable) new syb(this));
    }

    public final void a(Bundle bundle) {
        iva.a("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.c.F().a((Runnable) new sya(this, (sug) this.b.x()));
            } catch (DeadObjectException | IllegalStateException e) {
                this.b = null;
                this.a = false;
            }
        }
    }

    public final void a(ConnectionResult connectionResult) {
        sut sut;
        iva.a("MeasurementServiceConnection.onConnectionFailed");
        svv svv = this.c.x;
        sut sut2 = svv.i;
        if (sut2 == null || !sut2.g()) {
            sut = null;
        } else {
            sut = svv.i;
        }
        if (sut != null) {
            sut.f.a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.F().a((Runnable) new syc(this));
    }
}
