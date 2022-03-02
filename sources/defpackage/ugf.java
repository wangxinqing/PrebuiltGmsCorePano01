package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;

/* renamed from: ugf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ugf extends bhv implements ugh {
    public ugf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
    }

    public final void a(OnBandwidthChangedParams onBandwidthChangedParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onBandwidthChangedParams);
        c(5, aQ);
    }

    public final void a(OnConnectionInitiatedParams onConnectionInitiatedParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onConnectionInitiatedParams);
        c(2, aQ);
    }

    public final void a(OnConnectionResultParams onConnectionResultParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onConnectionResultParams);
        c(3, aQ);
    }

    public final void a(OnDisconnectedParams onDisconnectedParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onDisconnectedParams);
        c(4, aQ);
    }
}
