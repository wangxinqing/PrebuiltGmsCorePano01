package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: qdm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qdm implements ServiceConnection {
    int a = 0;
    final Messenger b = new Messenger(new qvr(Looper.getMainLooper(), new qdi(this)));
    qdn c;
    final Queue d = new ArrayDeque();
    final SparseArray e = new SparseArray();
    final /* synthetic */ qdq f;

    public qdm(qdq qdq) {
        this.f = qdq;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f.b.execute(new qdk(this));
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            this.a = 3;
            jca.a().a(this.f.a, (ServiceConnection) this);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            try {
                this.c = new qdn(iBinder);
                this.a = 2;
                a();
            } catch (RemoteException e2) {
                a(0, e2.getMessage());
            }
        } else {
            a(0, "Null service connection");
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        a(2, "Service disconnected");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i) {
        qdo qdo = (qdo) this.e.get(i);
        if (qdo != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.e.remove(i);
            qdo.a(new qdp(3, "Timed out waiting for response"));
            b();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0014, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.a     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x005f
            r1 = 4
            r2 = 1
            if (r0 == r2) goto L_0x0015
            r2 = 2
            if (r0 == r2) goto L_0x0015
            r4 = 3
            if (r0 == r4) goto L_0x0011
            monitor-exit(r3)
            return
        L_0x0011:
            r3.a = r1     // Catch:{ all -> 0x0065 }
        L_0x0013:
            monitor-exit(r3)
            return
        L_0x0015:
            r3.a = r1     // Catch:{ all -> 0x0065 }
            jca r0 = defpackage.jca.a()     // Catch:{ all -> 0x0065 }
            qdq r1 = r3.f     // Catch:{ all -> 0x0065 }
            android.content.Context r1 = r1.a     // Catch:{ all -> 0x0065 }
            r0.a((android.content.Context) r1, (android.content.ServiceConnection) r3)     // Catch:{ all -> 0x0065 }
            qdp r0 = new qdp     // Catch:{ all -> 0x0065 }
            r0.<init>(r4, r5)     // Catch:{ all -> 0x0065 }
            java.util.Queue r4 = r3.d     // Catch:{ all -> 0x0065 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0065 }
        L_0x002d:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x003d
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0065 }
            qdo r5 = (defpackage.qdo) r5     // Catch:{ all -> 0x0065 }
            r5.a(r0)     // Catch:{ all -> 0x0065 }
            goto L_0x002d
        L_0x003d:
            java.util.Queue r4 = r3.d     // Catch:{ all -> 0x0065 }
            r4.clear()     // Catch:{ all -> 0x0065 }
            r4 = 0
        L_0x0043:
            android.util.SparseArray r5 = r3.e     // Catch:{ all -> 0x0065 }
            int r5 = r5.size()     // Catch:{ all -> 0x0065 }
            if (r4 >= r5) goto L_0x0059
            android.util.SparseArray r5 = r3.e     // Catch:{ all -> 0x0065 }
            java.lang.Object r5 = r5.valueAt(r4)     // Catch:{ all -> 0x0065 }
            qdo r5 = (defpackage.qdo) r5     // Catch:{ all -> 0x0065 }
            r5.a(r0)     // Catch:{ all -> 0x0065 }
            int r4 = r4 + 1
            goto L_0x0043
        L_0x0059:
            android.util.SparseArray r4 = r3.e     // Catch:{ all -> 0x0065 }
            r4.clear()     // Catch:{ all -> 0x0065 }
            goto L_0x0013
        L_0x005f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0065 }
            r4.<init>()     // Catch:{ all -> 0x0065 }
            throw r4     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x0069
        L_0x0068:
            throw r4
        L_0x0069:
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdm.a(int, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(defpackage.qdo r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.a     // Catch:{ all -> 0x0062 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001f
            if (r0 == r2) goto L_0x0018
            r3 = 2
            if (r0 == r3) goto L_0x000e
            monitor-exit(r5)
            return r1
        L_0x000e:
            java.util.Queue r0 = r5.d     // Catch:{ all -> 0x0062 }
            r0.add(r6)     // Catch:{ all -> 0x0062 }
            r5.a()     // Catch:{ all -> 0x0062 }
            monitor-exit(r5)
            return r2
        L_0x0018:
            java.util.Queue r0 = r5.d     // Catch:{ all -> 0x0062 }
            r0.add(r6)     // Catch:{ all -> 0x0062 }
            monitor-exit(r5)
            return r2
        L_0x001f:
            java.util.Queue r0 = r5.d     // Catch:{ all -> 0x0062 }
            r0.add(r6)     // Catch:{ all -> 0x0062 }
            int r6 = r5.a     // Catch:{ all -> 0x0062 }
            if (r6 != 0) goto L_0x002a
            r6 = 1
            goto L_0x002b
        L_0x002a:
            r6 = 0
        L_0x002b:
            defpackage.iva.a((boolean) r6)     // Catch:{ all -> 0x0062 }
            r5.a = r2     // Catch:{ all -> 0x0062 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x0062 }
            jca r0 = defpackage.jca.a()     // Catch:{ all -> 0x0062 }
            qdq r3 = r5.f     // Catch:{ all -> 0x0062 }
            android.content.Context r3 = r3.a     // Catch:{ all -> 0x0062 }
            boolean r6 = r0.a(r3, r6, r5, r2)     // Catch:{ all -> 0x0062 }
            if (r6 != 0) goto L_0x0050
            java.lang.String r6 = "Unable to bind to service"
            r5.a(r1, r6)     // Catch:{ all -> 0x0062 }
            goto L_0x0060
        L_0x0050:
            qdq r6 = r5.f     // Catch:{ all -> 0x0062 }
            java.util.concurrent.ScheduledExecutorService r6 = r6.b     // Catch:{ all -> 0x0062 }
            qdj r0 = new qdj     // Catch:{ all -> 0x0062 }
            r0.<init>(r5)     // Catch:{ all -> 0x0062 }
            r3 = 30
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0062 }
            r6.schedule(r0, r3, r1)     // Catch:{ all -> 0x0062 }
        L_0x0060:
            monitor-exit(r5)
            return r2
        L_0x0062:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdm.a(qdo):boolean");
    }
}
