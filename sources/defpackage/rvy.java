package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: rvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rvy extends bhv implements rwa {
    public rvy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    public final void a(LatLng latLng) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) latLng);
        b(3, aQ);
    }

    public final void b() {
        b(1, aQ());
    }

    public final int c() {
        Parcel a = a(20, aQ());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final void a(boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, z);
        b(15, aQ);
    }

    public final boolean a(rwa rwa) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) rwa);
        Parcel a = a(19, aQ);
        boolean a2 = bhx.a(a);
        a.recycle();
        return a2;
    }
}
