package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: rgl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rgl extends bhv implements rgn {
    public rgl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    public final void a(LocationSettingsResult locationSettingsResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) locationSettingsResult);
        c(1, aQ);
    }
}
