package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

/* renamed from: fux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fux extends bhv implements fuz {
    public fux(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void a(fuw fuw) {
        throw null;
    }

    public final void a(fuw fuw, ProxyGrpcRequest proxyGrpcRequest) {
        throw null;
    }

    public final void a(fuw fuw, ProxyRequest proxyRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) fuw);
        bhx.a(aQ, (Parcelable) proxyRequest);
        b(1, aQ);
    }
}
