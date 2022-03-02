package defpackage;

import android.os.Bundle;
import android.os.Messenger;
import android.util.Log;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: qwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qwy {
    public final String a;
    public final Bundle b;
    public final List c;
    final /* synthetic */ qwz d;
    private final qwd e;
    private final qxd f;
    private final nte g;
    private final Messenger h;

    public qwy(qwz qwz, String str, Messenger messenger, Bundle bundle, List list, qwd qwd) {
        this.d = qwz;
        this.a = str;
        this.h = messenger;
        this.b = bundle;
        this.c = list;
        this.e = qwd;
        this.f = null;
        this.g = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r6) {
        /*
            r5 = this;
            qwz r0 = r5.d
            java.lang.Object r0 = r0.a
            monitor-enter(r0)
            qwd r1 = r5.e     // Catch:{ RemoteException -> 0x00c8 }
            boolean r1 = r1.a     // Catch:{ RemoteException -> 0x00c8 }
            if (r1 != 0) goto L_0x0049
            qwz r1 = r5.d     // Catch:{ RemoteException -> 0x00c8 }
            qwq r2 = r1.g     // Catch:{ RemoteException -> 0x00c8 }
            java.lang.String r3 = r5.a     // Catch:{ RemoteException -> 0x00c8 }
            android.content.ComponentName r1 = r1.f     // Catch:{ RemoteException -> 0x00c8 }
            java.lang.String r1 = r1.getClassName()     // Catch:{ RemoteException -> 0x00c8 }
            boolean r1 = r2.d(r3, r1)     // Catch:{ RemoteException -> 0x00c8 }
            if (r1 == 0) goto L_0x0049
            qwz r6 = r5.d     // Catch:{ all -> 0x0137 }
            qwq r1 = r6.g     // Catch:{ all -> 0x0137 }
            java.lang.String r2 = r5.a     // Catch:{ all -> 0x0137 }
            android.content.ComponentName r6 = r6.f     // Catch:{ all -> 0x0137 }
            java.lang.String r6 = r6.getClassName()     // Catch:{ all -> 0x0137 }
            r1.c(r2, r6)     // Catch:{ all -> 0x0137 }
            android.os.Messenger r6 = r5.h     // Catch:{ all -> 0x0137 }
            if (r6 != 0) goto L_0x0047
            qwz r6 = r5.d     // Catch:{ all -> 0x0137 }
            qwq r1 = r6.g     // Catch:{ all -> 0x0137 }
            android.content.ComponentName r6 = r6.f     // Catch:{ all -> 0x0137 }
            java.lang.String r6 = r6.getClassName()     // Catch:{ all -> 0x0137 }
            boolean r6 = r1.c(r6)     // Catch:{ all -> 0x0137 }
            if (r6 != 0) goto L_0x0047
            qwz r6 = r5.d     // Catch:{ all -> 0x0137 }
            int r1 = r6.b     // Catch:{ all -> 0x0137 }
            r6.b(r1)     // Catch:{ all -> 0x0137 }
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0137 }
            return
        L_0x0049:
            android.os.Messenger r1 = r5.h     // Catch:{ RemoteException -> 0x00c8 }
            if (r1 == 0) goto L_0x0072
            android.os.Message r2 = android.os.Message.obtain()     // Catch:{ RemoteException -> 0x00c8 }
            r3 = 3
            r2.what = r3     // Catch:{ RemoteException -> 0x00c8 }
            r2.arg1 = r6     // Catch:{ RemoteException -> 0x00c8 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ RemoteException -> 0x00c8 }
            r6.<init>()     // Catch:{ RemoteException -> 0x00c8 }
            java.lang.String r3 = "component"
            qwz r4 = r5.d     // Catch:{ RemoteException -> 0x00c8 }
            android.content.ComponentName r4 = r4.f     // Catch:{ RemoteException -> 0x00c8 }
            r6.putParcelable(r3, r4)     // Catch:{ RemoteException -> 0x00c8 }
            java.lang.String r3 = "tag"
            java.lang.String r4 = r5.a     // Catch:{ RemoteException -> 0x00c8 }
            r6.putString(r3, r4)     // Catch:{ RemoteException -> 0x00c8 }
            r2.setData(r6)     // Catch:{ RemoteException -> 0x00c8 }
            r1.send(r2)     // Catch:{ RemoteException -> 0x00c8 }
            goto L_0x009b
        L_0x0072:
            qxd r1 = r5.f     // Catch:{ RemoteException -> 0x00c8 }
            if (r1 != 0) goto L_0x0098
            nte r1 = r5.g     // Catch:{ RemoteException -> 0x00c8 }
            if (r1 != 0) goto L_0x0094
            java.lang.String r6 = "GmsTaskChimeraService"
            java.lang.String r1 = "No communication protocol defined (shouldn't be possible): "
            java.lang.String r2 = r5.a     // Catch:{ RemoteException -> 0x00c8 }
            int r3 = r2.length()     // Catch:{ RemoteException -> 0x00c8 }
            if (r3 != 0) goto L_0x008c
            java.lang.String r2 = new java.lang.String     // Catch:{ RemoteException -> 0x00c8 }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x00c8 }
            goto L_0x0090
        L_0x008c:
            java.lang.String r2 = r1.concat(r2)     // Catch:{ RemoteException -> 0x00c8 }
        L_0x0090:
            android.util.Log.e(r6, r2)     // Catch:{ RemoteException -> 0x00c8 }
            goto L_0x009b
        L_0x0094:
            r1.a(r6)     // Catch:{ RemoteException -> 0x00c8 }
            goto L_0x009b
        L_0x0098:
            r1.a(r6)     // Catch:{ RemoteException -> 0x00c8 }
        L_0x009b:
            qwz r6 = r5.d     // Catch:{ all -> 0x0137 }
            qwq r1 = r6.g     // Catch:{ all -> 0x0137 }
            java.lang.String r2 = r5.a     // Catch:{ all -> 0x0137 }
            android.content.ComponentName r6 = r6.f     // Catch:{ all -> 0x0137 }
            java.lang.String r6 = r6.getClassName()     // Catch:{ all -> 0x0137 }
            r1.c(r2, r6)     // Catch:{ all -> 0x0137 }
            android.os.Messenger r6 = r5.h     // Catch:{ all -> 0x0137 }
            if (r6 != 0) goto L_0x010a
            qwz r6 = r5.d     // Catch:{ all -> 0x0137 }
            qwq r1 = r6.g     // Catch:{ all -> 0x0137 }
            android.content.ComponentName r6 = r6.f     // Catch:{ all -> 0x0137 }
            java.lang.String r6 = r6.getClassName()     // Catch:{ all -> 0x0137 }
            boolean r6 = r1.c(r6)     // Catch:{ all -> 0x0137 }
            if (r6 != 0) goto L_0x010a
            qwz r6 = r5.d     // Catch:{ all -> 0x0137 }
            int r1 = r6.b     // Catch:{ all -> 0x0137 }
        L_0x00c2:
            r6.b(r1)     // Catch:{ all -> 0x0137 }
            goto L_0x010a
        L_0x00c6:
            r6 = move-exception
            goto L_0x010c
        L_0x00c8:
            r6 = move-exception
            java.lang.String r6 = "GmsTaskChimeraService"
            java.lang.String r1 = "Error reporting result of operation to scheduler for "
            java.lang.String r2 = r5.a     // Catch:{ all -> 0x00c6 }
            int r3 = r2.length()     // Catch:{ all -> 0x00c6 }
            if (r3 != 0) goto L_0x00db
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x00c6 }
            r2.<init>(r1)     // Catch:{ all -> 0x00c6 }
            goto L_0x00df
        L_0x00db:
            java.lang.String r2 = r1.concat(r2)     // Catch:{ all -> 0x00c6 }
        L_0x00df:
            android.util.Log.e(r6, r2)     // Catch:{ all -> 0x00c6 }
            qwz r6 = r5.d     // Catch:{ all -> 0x0137 }
            qwq r1 = r6.g     // Catch:{ all -> 0x0137 }
            java.lang.String r2 = r5.a     // Catch:{ all -> 0x0137 }
            android.content.ComponentName r6 = r6.f     // Catch:{ all -> 0x0137 }
            java.lang.String r6 = r6.getClassName()     // Catch:{ all -> 0x0137 }
            r1.c(r2, r6)     // Catch:{ all -> 0x0137 }
            android.os.Messenger r6 = r5.h     // Catch:{ all -> 0x0137 }
            if (r6 != 0) goto L_0x010a
            qwz r6 = r5.d     // Catch:{ all -> 0x0137 }
            qwq r1 = r6.g     // Catch:{ all -> 0x0137 }
            android.content.ComponentName r6 = r6.f     // Catch:{ all -> 0x0137 }
            java.lang.String r6 = r6.getClassName()     // Catch:{ all -> 0x0137 }
            boolean r6 = r1.c(r6)     // Catch:{ all -> 0x0137 }
            if (r6 != 0) goto L_0x010a
            qwz r6 = r5.d     // Catch:{ all -> 0x0137 }
            int r1 = r6.b     // Catch:{ all -> 0x0137 }
            goto L_0x00c2
        L_0x010a:
            monitor-exit(r0)     // Catch:{ all -> 0x0137 }
            return
        L_0x010c:
            qwz r1 = r5.d     // Catch:{ all -> 0x0137 }
            qwq r2 = r1.g     // Catch:{ all -> 0x0137 }
            java.lang.String r3 = r5.a     // Catch:{ all -> 0x0137 }
            android.content.ComponentName r1 = r1.f     // Catch:{ all -> 0x0137 }
            java.lang.String r1 = r1.getClassName()     // Catch:{ all -> 0x0137 }
            r2.c(r3, r1)     // Catch:{ all -> 0x0137 }
            android.os.Messenger r1 = r5.h     // Catch:{ all -> 0x0137 }
            if (r1 != 0) goto L_0x0136
            qwz r1 = r5.d     // Catch:{ all -> 0x0137 }
            qwq r2 = r1.g     // Catch:{ all -> 0x0137 }
            android.content.ComponentName r1 = r1.f     // Catch:{ all -> 0x0137 }
            java.lang.String r1 = r1.getClassName()     // Catch:{ all -> 0x0137 }
            boolean r1 = r2.c(r1)     // Catch:{ all -> 0x0137 }
            if (r1 != 0) goto L_0x0136
            qwz r1 = r5.d     // Catch:{ all -> 0x0137 }
            int r2 = r1.b     // Catch:{ all -> 0x0137 }
            r1.b(r2)     // Catch:{ all -> 0x0137 }
        L_0x0136:
            throw r6     // Catch:{ all -> 0x0137 }
        L_0x0137:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0137 }
            goto L_0x013b
        L_0x013a:
            throw r6
        L_0x013b:
            goto L_0x013a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwy.a(int):void");
    }

    public qwy(qwz qwz, String str, nte nte, Bundle bundle, List list, qwd qwd) {
        this.d = qwz;
        this.a = str;
        this.f = null;
        this.g = nte;
        this.b = bundle;
        this.c = list;
        this.e = qwd;
        this.h = null;
    }

    public qwy(qwz qwz, String str, qxd qxd, Bundle bundle, List list, qwd qwd) {
        this.d = qwz;
        this.a = str;
        this.f = qxd;
        this.g = null;
        this.b = bundle;
        this.c = list;
        this.e = qwd;
        this.h = null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(aorr aorr) {
        synchronized (this.d.k) {
            this.d.k.remove(this.a);
        }
        try {
            a(((Integer) aorl.a((Future) aorr)).intValue());
        } catch (CancellationException | ExecutionException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Exception when running the task: ");
            sb.append(valueOf);
            Log.e("GmsTaskChimeraService", sb.toString());
        }
    }
}
