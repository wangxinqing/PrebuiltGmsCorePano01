package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.internal.connection.OnConnectionResponseParams;

/* renamed from: ugi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ugi extends bhv implements ugk {
    public ugi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
    }

    public final void a(OnConnectionResponseParams onConnectionResponseParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onConnectionResponseParams);
        c(2, aQ);
    }
}
