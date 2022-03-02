package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.internal.ConnectionInfo;

/* renamed from: irs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class irs extends itu {
    private irx a;
    private final int b;

    public irs(irx irx, int i) {
        this.a = irx;
        this.b = i;
    }

    public final void a(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    public final void a(int i, IBinder iBinder, Bundle bundle) {
        iva.a((Object) this.a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.a(i, iBinder, bundle, this.b);
        this.a = null;
    }

    public final void a(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
        iva.a((Object) this.a, (Object) "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        iva.a((Object) connectionInfo);
        irx irx = this.a;
        String[] strArr = irx.r;
        irx.p = connectionInfo;
        a(i, iBinder, connectionInfo.a);
    }
}
