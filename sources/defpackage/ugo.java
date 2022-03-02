package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.internal.connection.OnEndpointDistanceChangedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

/* renamed from: ugo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ugo extends bhv implements ugq {
    public ugo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
    }

    public final void a(OnEndpointDistanceChangedParams onEndpointDistanceChangedParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onEndpointDistanceChangedParams);
        c(5, aQ);
    }

    public final void a(OnStoppedDiscoveryParams onStoppedDiscoveryParams) {
        throw null;
    }

    public final void a(OnEndpointFoundParams onEndpointFoundParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onEndpointFoundParams);
        c(2, aQ);
    }

    public final void a(OnEndpointLostParams onEndpointLostParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onEndpointLostParams);
        c(3, aQ);
    }
}
