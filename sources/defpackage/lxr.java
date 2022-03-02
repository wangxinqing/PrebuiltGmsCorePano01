package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: lxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lxr extends nis {
    private final ifu a;
    private final boolean b;
    private final int c;

    public lxr(ifu ifu, int i, boolean z) {
        super(184, "StartDrivingModeSetupOperation");
        this.a = ifu;
        this.b = z;
        this.c = i;
    }

    public static final lts b(Context context) {
        return new lts(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r7) {
        /*
            r6 = this;
            luv r0 = new luv
            r0.<init>(r7)
            luu r1 = r0.a     // Catch:{ all -> 0x008c }
            r2 = 0
            r3 = 1
            lxc r4 = r1.c     // Catch:{ RemoteException -> 0x0029 }
            boolean r4 = r4.i()     // Catch:{ RemoteException -> 0x0029 }
            if (r4 == 0) goto L_0x0028
            boolean r4 = defpackage.awqd.f()     // Catch:{ all -> 0x008c }
            if (r4 != 0) goto L_0x0028
            boolean r3 = r6.b     // Catch:{ all -> 0x008c }
            if (r3 == 0) goto L_0x0026
            int r3 = r6.c     // Catch:{ all -> 0x008c }
            lxg r3 = defpackage.lxg.a(r3)     // Catch:{ all -> 0x008c }
            r1.c(r3)     // Catch:{ all -> 0x008c }
            r3 = 0
            goto L_0x0031
        L_0x0026:
            r3 = 0
            goto L_0x0031
        L_0x0028:
            goto L_0x0031
        L_0x0029:
            r1 = move-exception
            java.lang.String r4 = "CAR.DRIVINGMODE"
            java.lang.String r5 = "Disconnected from DrivingModeManager."
            android.util.Log.e(r4, r5, r1)     // Catch:{ all -> 0x008c }
        L_0x0031:
            r0.close()
            if (r3 == 0) goto L_0x0079
            luw r0 = new luw
            r0.<init>()
            boolean r1 = r6.b
            r0.a = r1
            int r1 = r6.c
            r0.b = r1
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.ComponentName r3 = defpackage.lto.c()
            android.content.Intent r1 = r1.setComponent(r3)
            boolean r3 = r0.a
            java.lang.String r4 = "frx_immediate_start"
            android.content.Intent r1 = r1.putExtra(r4, r3)
            int r0 = r0.b
            java.lang.String r3 = "client_trigger_reason"
            android.content.Intent r0 = r1.putExtra(r3, r0)
            java.lang.String r1 = "com.google.android.location.activity.DRIVING_MODE_NOTIFICATION"
            android.content.Intent r0 = r0.putExtra(r1, r2)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r1)
            r7.startActivity(r0)
            lts r0 = b(r7)
            anxu r1 = defpackage.anxu.DRIVING_MODE
            anxt r2 = defpackage.anxt.DRIVING_MODE_CLIENT_START_DRIVING_MODE_SETUP_SHOW_FRX
            r0.a((defpackage.anxu) r1, (defpackage.anxt) r2)
        L_0x0079:
            lts r7 = b(r7)
            anxu r0 = defpackage.anxu.DRIVING_MODE
            anxt r1 = defpackage.anxt.DRIVING_MODE_CLIENT_START_DRIVING_MODE_SETUP
            r7.a((defpackage.anxu) r0, (defpackage.anxt) r1)
            ifu r7 = r6.a
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a
            r7.a(r0)
            return
        L_0x008c:
            r7 = move-exception
            r0.close()     // Catch:{ all -> 0x0091 }
            goto L_0x0095
        L_0x0091:
            r0 = move-exception
            defpackage.apev.a((java.lang.Throwable) r7, (java.lang.Throwable) r0)
        L_0x0095:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxr.a(android.content.Context):void");
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
