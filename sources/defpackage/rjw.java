package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.places.PlacePhotoMetadataResult;
import com.google.android.gms.location.places.PlacePhotoResult;

/* renamed from: rjw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rjw extends bhw implements rjx {
    private final rhp a;
    private final rho b;

    public rjw() {
        super("com.google.android.gms.location.places.internal.IPhotosCallbacks");
    }

    public final void a(PlacePhotoMetadataResult placePhotoMetadataResult) {
        this.a.a((icl) placePhotoMetadataResult);
    }

    public rjw(rho rho) {
        this();
        this.a = null;
        this.b = rho;
    }

    public final void a(PlacePhotoResult placePhotoResult) {
        this.b.a((icl) placePhotoResult);
    }

    public rjw(rhp rhp) {
        this();
        this.a = rhp;
        this.b = null;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            a((PlacePhotoResult) bhx.a(parcel, PlacePhotoResult.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            a((PlacePhotoMetadataResult) bhx.a(parcel, PlacePhotoMetadataResult.CREATOR));
            return true;
        }
    }
}
