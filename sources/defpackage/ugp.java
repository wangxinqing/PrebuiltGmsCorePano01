package defpackage;

import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnEndpointDistanceChangedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

/* renamed from: ugp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ugp extends bhw implements ugq {
    public ugp() {
        super("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            a((OnEndpointFoundParams) bhx.a(parcel, OnEndpointFoundParams.CREATOR));
            return true;
        } else if (i == 3) {
            a((OnEndpointLostParams) bhx.a(parcel, OnEndpointLostParams.CREATOR));
            return true;
        } else if (i == 4) {
            a((OnStoppedDiscoveryParams) bhx.a(parcel, OnStoppedDiscoveryParams.CREATOR));
            return true;
        } else if (i != 5) {
            return false;
        } else {
            a((OnEndpointDistanceChangedParams) bhx.a(parcel, OnEndpointDistanceChangedParams.CREATOR));
            return true;
        }
    }
}
