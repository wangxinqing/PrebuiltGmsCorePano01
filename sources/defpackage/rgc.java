package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* renamed from: rgc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rgc extends bhv implements rge {
    public rgc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    public final void a() {
        c(2, aQ());
    }

    public final void a(FusedLocationProviderResult fusedLocationProviderResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) fusedLocationProviderResult);
        c(1, aQ);
    }
}
