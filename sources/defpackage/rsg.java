package defpackage;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;

/* renamed from: rsg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rsg extends bhv implements rsi {
    public rsg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    public final rwa a(GroundOverlayOptions groundOverlayOptions) {
        rwa rwa;
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) groundOverlayOptions);
        Parcel a = a(12, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
            rwa = queryLocalInterface instanceof rwa ? (rwa) queryLocalInterface : new rvy(readStrongBinder);
        } else {
            rwa = null;
        }
        a.recycle();
        return rwa;
    }

    public final CameraPosition b() {
        Parcel a = a(1, aQ());
        CameraPosition cameraPosition = (CameraPosition) bhx.a(a, CameraPosition.CREATOR);
        a.recycle();
        return cameraPosition;
    }

    public final void c() {
        b(14, aQ());
    }

    public final Location d() {
        Parcel a = a(23, aQ());
        Location location = (Location) bhx.a(a, Location.CREATOR);
        a.recycle();
        return location;
    }

    public final rus e() {
        rus rus;
        Parcel a = a(25, aQ());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            rus = queryLocalInterface instanceof rus ? (rus) queryLocalInterface : new ruq(readStrongBinder);
        } else {
            rus = null;
        }
        a.recycle();
        return rus;
    }

    public final rui f() {
        rui rui;
        Parcel a = a(26, aQ());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            rui = queryLocalInterface instanceof rui ? (rui) queryLocalInterface : new rug(readStrongBinder);
        } else {
            rui = null;
        }
        a.recycle();
        return rui;
    }

    public final void g() {
        Parcel aQ = aQ();
        bhx.a(aQ, true);
        b(41, aQ);
    }

    public final void h() {
        Parcel aQ = aQ();
        aQ.writeInt(0);
        aQ.writeInt(0);
        aQ.writeInt(0);
        aQ.writeInt(0);
        b(39, aQ);
    }

    public final void i() {
        Parcel aQ = aQ();
        bhx.a(aQ, true);
        Parcel a = a(20, aQ);
        bhx.a(a);
        a.recycle();
    }

    public final void b(mby mby) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        b(5, aQ);
    }

    public final rwg a(MarkerOptions markerOptions) {
        rwg rwg;
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) markerOptions);
        Parcel a = a(11, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            rwg = queryLocalInterface instanceof rwg ? (rwg) queryLocalInterface : new rwe(readStrongBinder);
        } else {
            rwg = null;
        }
        a.recycle();
        return rwg;
    }

    public final void a(mby mby) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        b(4, aQ);
    }

    public final void a(rsm rsm) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) rsm);
        b(24, aQ);
    }

    public final void a(rsv rsv) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) rsv);
        b(27, aQ);
    }

    public final void a(rsy rsy) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) rsy);
        b(99, aQ);
    }

    public final void a(rtd rtd) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) rtd);
        b(96, aQ);
    }

    public final void a(rtn rtn) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) rtn);
        b(28, aQ);
    }

    public final void a(rtv rtv) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) rtv);
        b(30, aQ);
    }

    public final void a(rua rua) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) rua);
        b(36, aQ);
    }

    public final void a(boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, z);
        b(22, aQ);
    }
}
