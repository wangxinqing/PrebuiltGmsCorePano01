package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: rea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rea extends bhv implements rec {
    public rea(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    public final void a(LocationAvailability locationAvailability) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) locationAvailability);
        c(2, aQ);
    }

    public final void a(LocationResult locationResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) locationResult);
        c(1, aQ);
    }
}
