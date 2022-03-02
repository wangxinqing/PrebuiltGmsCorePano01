package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: irm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class irm extends irq {
    public final int a;
    public final Bundle b;
    final /* synthetic */ irx c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected irm(irx irx, int i, Bundle bundle) {
        super(irx, true);
        this.c = irx;
        this.a = i;
        this.b = bundle;
    }

    /* access modifiers changed from: protected */
    public abstract void a(ConnectionResult connectionResult);

    /* JADX WARNING: type inference failed for: r5v16, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            int r5 = r4.a
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L_0x007a
            r2 = 10
            if (r5 == r2) goto L_0x002b
            irx r5 = r4.c
            r5.a((int) r1, (android.os.IInterface) null)
            android.os.Bundle r5 = r4.b
            if (r5 == 0) goto L_0x001f
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r5 = r5.getParcelable(r0)
            r0 = r5
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            goto L_0x0020
        L_0x001f:
        L_0x0020:
            com.google.android.gms.common.ConnectionResult r5 = new com.google.android.gms.common.ConnectionResult
            int r1 = r4.a
            r5.<init>(r1, r0)
            r4.a((com.google.android.gms.common.ConnectionResult) r5)
            return
        L_0x002b:
            irx r5 = r4.c
            r5.a((int) r1, (android.os.IInterface) null)
            boolean r5 = defpackage.jim.a()
            if (r5 == 0) goto L_0x004f
            irx r5 = r4.c
            java.lang.String r5 = r5.b()
            java.lang.String r2 = "com.google.android.gms.games.service.START"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L_0x004f
            com.google.android.gms.common.ConnectionResult r5 = new com.google.android.gms.common.ConnectionResult
            int r1 = r4.a
            r5.<init>(r1, r0)
            r4.a((com.google.android.gms.common.ConnectionResult) r5)
            return
        L_0x004f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r0[r2] = r3
            irx r2 = r4.c
            java.lang.String r2 = r2.b()
            r0[r1] = r2
            r1 = 2
            irx r2 = r4.c
            java.lang.String r2 = r2.c()
            r0[r1] = r2
            java.lang.String r1 = "A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. "
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r5.<init>(r0)
            throw r5
        L_0x007a:
            boolean r5 = r4.a()
            if (r5 != 0) goto L_0x008f
            irx r5 = r4.c
            r5.a((int) r1, (android.os.IInterface) null)
            com.google.android.gms.common.ConnectionResult r5 = new com.google.android.gms.common.ConnectionResult
            r1 = 8
            r5.<init>(r1, r0)
            r4.a((com.google.android.gms.common.ConnectionResult) r5)
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irm.a(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    public abstract boolean a();

    /* access modifiers changed from: protected */
    public final void b() {
    }
}
