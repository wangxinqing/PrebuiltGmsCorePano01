package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

/* renamed from: ugl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ugl extends bhv implements ugn {
    public ugl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.IDiscoveryCallback");
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

    public final void a(OnStoppedDiscoveryParams onStoppedDiscoveryParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onStoppedDiscoveryParams);
        c(4, aQ);
    }
}
