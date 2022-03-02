package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDistanceChangedParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;

/* renamed from: vyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vyl extends bhv implements vyn {
    public vyl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.sharing.internal.IShareTargetDiscoveredCallback");
    }

    public final void a(OnShareTargetDiscoveredParams onShareTargetDiscoveredParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onShareTargetDiscoveredParams);
        c(1, aQ);
    }

    public final void a(OnShareTargetDistanceChangedParams onShareTargetDistanceChangedParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onShareTargetDistanceChangedParams);
        c(3, aQ);
    }

    public final void a(OnShareTargetLostParams onShareTargetLostParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onShareTargetLostParams);
        c(2, aQ);
    }
}
