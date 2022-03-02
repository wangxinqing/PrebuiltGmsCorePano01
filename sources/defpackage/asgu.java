package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: asgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asgu extends bhv implements asgw {
    public asgu(IBinder iBinder) {
        super(iBinder, "com.google.location.nearby.direct.client.internal.INearbyDirectCallback");
    }

    public final void a(OperationStatus operationStatus) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) operationStatus);
        c(1, aQ);
    }
}
