package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* renamed from: rsd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rsd extends bhv implements rsf {
    public rsd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    public final void init(mby mby) {
        throw null;
    }

    public final void initV2(mby mby, int i) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        aQ.writeInt(i);
        b(6, aQ);
    }

    public final rvu newBitmapDescriptorFactoryDelegate() {
        rvu rvu;
        Parcel a = a(5, aQ());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            rvu = queryLocalInterface instanceof rvu ? (rvu) queryLocalInterface : new rvs(readStrongBinder);
        } else {
            rvu = null;
        }
        a.recycle();
        return rvu;
    }

    public final rsb newCameraUpdateFactoryDelegate() {
        rsb rsb;
        Parcel a = a(4, aQ());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            rsb = queryLocalInterface instanceof rsb ? (rsb) queryLocalInterface : new rrz(readStrongBinder);
        } else {
            rsb = null;
        }
        a.recycle();
        return rsb;
    }

    public final rsp newMapFragmentDelegate(mby mby) {
        rsp rsp;
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        Parcel a = a(2, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            rsp = queryLocalInterface instanceof rsp ? (rsp) queryLocalInterface : new rsn(readStrongBinder);
        } else {
            rsp = null;
        }
        a.recycle();
        return rsp;
    }

    public final rss newMapViewDelegate(mby mby, GoogleMapOptions googleMapOptions) {
        rss rss;
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        bhx.a(aQ, (Parcelable) googleMapOptions);
        Parcel a = a(3, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            rss = queryLocalInterface instanceof rss ? (rss) queryLocalInterface : new rsq(readStrongBinder);
        } else {
            rss = null;
        }
        a.recycle();
        return rss;
    }

    public final rum newStreetViewPanoramaFragmentDelegate(mby mby) {
        rum rum;
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        Parcel a = a(8, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            rum = queryLocalInterface instanceof rum ? (rum) queryLocalInterface : new ruk(readStrongBinder);
        } else {
            rum = null;
        }
        a.recycle();
        return rum;
    }

    public final rup newStreetViewPanoramaViewDelegate(mby mby, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        rup rup;
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) mby);
        bhx.a(aQ, (Parcelable) streetViewPanoramaOptions);
        Parcel a = a(7, aQ);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            rup = queryLocalInterface instanceof rup ? (rup) queryLocalInterface : new run(readStrongBinder);
        } else {
            rup = null;
        }
        a.recycle();
        return rup;
    }
}
