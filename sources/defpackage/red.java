package defpackage;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: red  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class red extends bhv implements ref {
    public red(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    public final void a(Location location) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) location);
        c(1, aQ);
    }
}
