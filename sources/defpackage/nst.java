package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: nst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nst extends bhv implements nsv {
    public nst(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.IGcmServiceDiagnosticsCallback");
    }

    public final void a(nss nss) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) nss);
        c(1, aQ);
    }
}
