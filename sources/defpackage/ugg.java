package defpackage;

import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;

/* renamed from: ugg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ugg extends bhw implements ugh {
    public ugg() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            a((OnConnectionInitiatedParams) bhx.a(parcel, OnConnectionInitiatedParams.CREATOR));
            return true;
        } else if (i == 3) {
            a((OnConnectionResultParams) bhx.a(parcel, OnConnectionResultParams.CREATOR));
            return true;
        } else if (i == 4) {
            a((OnDisconnectedParams) bhx.a(parcel, OnDisconnectedParams.CREATOR));
            return true;
        } else if (i != 5) {
            return false;
        } else {
            a((OnBandwidthChangedParams) bhx.a(parcel, OnBandwidthChangedParams.CREATOR));
            return true;
        }
    }
}
