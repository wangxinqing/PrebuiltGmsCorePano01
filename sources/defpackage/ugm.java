package defpackage;

import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

/* renamed from: ugm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ugm extends bhw implements ugn {
    public ugm() {
        super("com.google.android.gms.nearby.internal.connection.IDiscoveryCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            a((OnEndpointFoundParams) bhx.a(parcel, OnEndpointFoundParams.CREATOR));
            return true;
        } else if (i == 3) {
            a((OnEndpointLostParams) bhx.a(parcel, OnEndpointLostParams.CREATOR));
            return true;
        } else if (i != 4) {
            return false;
        } else {
            OnStoppedDiscoveryParams onStoppedDiscoveryParams = (OnStoppedDiscoveryParams) bhx.a(parcel, OnStoppedDiscoveryParams.CREATOR);
            return true;
        }
    }
}
