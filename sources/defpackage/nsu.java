package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: nsu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nsu extends bhw implements nsv {
    final /* synthetic */ nsn a;

    public nsu() {
        super("com.google.android.gms.gcm.IGcmServiceDiagnosticsCallback");
    }

    public final void a(nss nss) {
        synchronized (this.a) {
            this.a.b = nss;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nsu(nsn nsn) {
        super("com.google.android.gms.gcm.IGcmServiceDiagnosticsCallback");
        this.a = nsn;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        nss nss;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.gcm.IGcmServiceDiagnostics");
            nss = queryLocalInterface instanceof nss ? (nss) queryLocalInterface : new nsq(readStrongBinder);
        } else {
            nss = null;
        }
        a(nss);
        return true;
    }
}
