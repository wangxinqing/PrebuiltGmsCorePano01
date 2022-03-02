package defpackage;

import android.os.Parcel;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDistanceChangedParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;

/* renamed from: vym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class vym extends bhw implements vyn {
    public vym() {
        super("com.google.android.gms.nearby.sharing.internal.IShareTargetDiscoveredCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((OnShareTargetDiscoveredParams) bhx.a(parcel, OnShareTargetDiscoveredParams.CREATOR));
        } else if (i == 2) {
            a((OnShareTargetLostParams) bhx.a(parcel, OnShareTargetLostParams.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            a((OnShareTargetDistanceChangedParams) bhx.a(parcel, OnShareTargetDistanceChangedParams.CREATOR));
        }
        return true;
    }
}
