package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: bvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bvu extends bvs implements bvt {
    public final PendingIntent a;
    public final ContextDataFilterImpl b;
    private final jxc c;
    private final ContextManagerClientInfo d;
    private final Object e;
    private boolean f;

    public bvu(ContextManagerClientInfo contextManagerClientInfo, jxc jxc, PendingIntent pendingIntent, ContextDataFilterImpl contextDataFilterImpl) {
        super(contextManagerClientInfo.a);
        boolean z;
        this.d = contextManagerClientInfo;
        boolean z2 = false;
        if (jxc != null) {
            z = true;
        } else {
            z = false;
        }
        iva.a((pendingIntent != null ? true : z2) ^ z);
        this.c = jxc;
        this.a = pendingIntent;
        this.b = contextDataFilterImpl;
        this.e = new Object();
        this.f = true;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.e) {
            z = this.f;
        }
        return z;
    }

    public final boolean equals(Object obj) {
        PendingIntent pendingIntent;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvu)) {
            return false;
        }
        bvu bvu = (bvu) obj;
        jxc jxc = this.c;
        if (jxc != null && bvu.c != null) {
            return jxc.asBinder().equals(bvu.c.asBinder());
        }
        PendingIntent pendingIntent2 = this.a;
        if (pendingIntent2 == null || (pendingIntent = bvu.a) == null) {
            return false;
        }
        return pendingIntent2.equals(pendingIntent);
    }

    public final int hashCode() {
        IBinder iBinder;
        Object[] objArr = new Object[2];
        jxc jxc = this.c;
        if (jxc != null) {
            iBinder = jxc.asBinder();
        } else {
            iBinder = null;
        }
        objArr[0] = iBinder;
        objArr[1] = this.a;
        return Arrays.hashCode(objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (defpackage.cbi.l().a(r8, r7.d) != 0) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r0.a(r5.a()).a(4, r8, r5) == 1) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bsz r8, com.google.android.gms.contextmanager.ContextData r9) {
        /*
            r7 = this;
            bsz r0 = super.g()
            java.lang.String r1 = "bvu"
            java.lang.String r2 = "a"
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            if (r0 == 0) goto L_0x0105
            boolean r4 = r0.equals(r8)
            if (r4 != 0) goto L_0x0014
            goto L_0x0105
        L_0x0014:
            if (r9 == 0) goto L_0x001b
            int r8 = r9.g()
            goto L_0x001c
        L_0x001b:
            r8 = -1
        L_0x001c:
            boolean r0 = defpackage.awwt.b()
            r4 = 1
            if (r0 != 0) goto L_0x0024
            goto L_0x004d
        L_0x0024:
            boolean r0 = defpackage.awuz.l()
            if (r0 == 0) goto L_0x0038
            bti r0 = defpackage.cbi.l()
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r5 = r7.d
            int r0 = r0.a(r8, r5)
            if (r0 == 0) goto L_0x004d
            goto L_0x00ed
        L_0x0038:
            bte r0 = defpackage.cbi.x()
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r5 = r7.d
            bsz r6 = r5.a()
            btd r0 = r0.a(r6)
            r6 = 4
            int r0 = r0.a(r6, r8, r5)
            if (r0 != r4) goto L_0x00ed
        L_0x004d:
            jxc r0 = r7.c
            r5 = 0
            if (r0 != 0) goto L_0x00b8
            android.app.PendingIntent r0 = r7.a
            if (r0 == 0) goto L_0x00b7
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            byte[] r9 = r9.b()
            java.lang.String r6 = "context_data_byte_array"
            r0.putExtra(r6, r9)
            android.app.PendingIntent r9 = r7.a     // Catch:{ CanceledException -> 0x008d }
            boolean r6 = defpackage.bta.a(r8)     // Catch:{ CanceledException -> 0x008d }
            if (r6 != 0) goto L_0x0080
            boolean r6 = defpackage.bta.b(r8)     // Catch:{ CanceledException -> 0x008d }
            if (r6 != 0) goto L_0x007d
            boolean r6 = defpackage.bta.e(r8)     // Catch:{ CanceledException -> 0x008d }
            if (r6 == 0) goto L_0x007b
            java.lang.String r6 = "android.permission.BLUETOOTH"
            goto L_0x0082
        L_0x007b:
            r6 = 0
            goto L_0x0082
        L_0x007d:
            java.lang.String r6 = "com.google.android.gms.permission.ACTIVITY_RECOGNITION"
            goto L_0x0082
        L_0x0080:
            java.lang.String r6 = "android.permission.ACCESS_FINE_LOCATION"
        L_0x0082:
            defpackage.bvc.a(r9, r0, r6)     // Catch:{ CanceledException -> 0x008d }
            buc r9 = defpackage.cbi.F()     // Catch:{ CanceledException -> 0x008d }
            r9.a((int) r8, (boolean) r4, (int) r4)     // Catch:{ CanceledException -> 0x008d }
            return
        L_0x008d:
            r9 = move-exception
            java.lang.Object r0 = r7.e
            monitor-enter(r0)
            r7.f = r5     // Catch:{ all -> 0x00b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r0.a((java.lang.Throwable) r9)
            r9 = 158(0x9e, float:2.21E-43)
            anie r9 = r0.a((java.lang.String) r1, (java.lang.String) r2, (int) r9, (java.lang.String) r3)
            anih r9 = (defpackage.anih) r9
            java.lang.String r0 = "[ContextListenerConsumer] Could not deliver context data; PendingIntent is cancelled."
            r9.a((java.lang.String) r0)
            buc r9 = defpackage.cbi.F()
            r9.a((int) r8, (boolean) r5, (int) r4)
            return
        L_0x00b4:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
            throw r8
        L_0x00b7:
            return
        L_0x00b8:
            r0.a(r9)     // Catch:{ RemoteException -> 0x00c3 }
            buc r9 = defpackage.cbi.F()     // Catch:{ RemoteException -> 0x00c3 }
            r9.a((int) r8, (boolean) r4, (int) r5)     // Catch:{ RemoteException -> 0x00c3 }
            return
        L_0x00c3:
            r9 = move-exception
            java.lang.Object r0 = r7.e
            monitor-enter(r0)
            r7.f = r5     // Catch:{ all -> 0x00ea }
            monitor-exit(r0)     // Catch:{ all -> 0x00ea }
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r0.a((java.lang.Throwable) r9)
            r9 = 137(0x89, float:1.92E-43)
            anie r9 = r0.a((java.lang.String) r1, (java.lang.String) r2, (int) r9, (java.lang.String) r3)
            anih r9 = (defpackage.anih) r9
            java.lang.String r0 = "[ContextListenerConsumer] Could not deliver context data because app is not reachable."
            r9.a((java.lang.String) r0)
            buc r9 = defpackage.cbi.F()
            r9.a((int) r8, (boolean) r5, (int) r5)
            return
        L_0x00ea:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ea }
            throw r8
        L_0x00ed:
            jjg r9 = defpackage.bxk.a
            anie r9 = r9.c()
            anih r9 = (defpackage.anih) r9
            r0 = 118(0x76, float:1.65E-43)
            anie r9 = r9.a((java.lang.String) r1, (java.lang.String) r2, (int) r0, (java.lang.String) r3)
            anih r9 = (defpackage.anih) r9
            com.google.android.gms.contextmanager.internal.ContextManagerClientInfo r0 = r7.d
            java.lang.String r1 = "[ContextListenerConsumer] Permission denied to notify %s of %s"
            r9.a((java.lang.String) r1, (java.lang.Object) r0, (int) r8)
            return
        L_0x0105:
            jjg r9 = defpackage.bxk.a
            anie r9 = r9.b()
            anih r9 = (defpackage.anih) r9
            r4 = 95
            anie r9 = r9.a((java.lang.String) r1, (java.lang.String) r2, (int) r4, (java.lang.String) r3)
            anih r9 = (defpackage.anih) r9
            java.lang.String r1 = "[ContextListenerConsumer] Mismatched account name on deliver.  Expected %s, got %s"
            r9.a((java.lang.String) r1, (java.lang.Object) r0, (java.lang.Object) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvu.a(bsz, com.google.android.gms.contextmanager.ContextData):void");
    }

    public final void a(bsz bsz, Collection collection, bun bun, but but) {
        ((anih) ((anih) bxk.a.b()).a("bvu", "a", 173, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextListenerConsumer] Sync is currently unsupported.");
        buq.b(bun, but, bvq.a("ContextListenerConsumer+failureCallback"));
    }
}
