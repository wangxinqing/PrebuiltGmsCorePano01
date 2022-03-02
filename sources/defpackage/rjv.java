package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;
import com.google.android.gms.location.places.PlacePhotoResult;

/* renamed from: rjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rjv extends bhv implements rjx {
    public rjv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.internal.IPhotosCallbacks");
    }

    public final void a(PlacePhotoMetadataResult placePhotoMetadataResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) placePhotoMetadataResult);
        c(3, aQ);
    }

    public final void a(PlacePhotoResult placePhotoResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) placePhotoResult);
        c(2, aQ);
    }
}
