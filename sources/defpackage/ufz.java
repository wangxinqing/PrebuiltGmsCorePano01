package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.internal.connection.OnConnectionRequestParams;

/* renamed from: ufz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ufz extends bhv implements ugb {
    public ufz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
    }

    public final void a(OnConnectionRequestParams onConnectionRequestParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onConnectionRequestParams);
        c(2, aQ);
    }
}
