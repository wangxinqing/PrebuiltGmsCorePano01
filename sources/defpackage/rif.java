package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.location.places.PlacePhotoResult;

/* renamed from: rif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rif implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlacePhotoResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Status status = null;
        BitmapTeleporter bitmapTeleporter = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                status = (Status) ivw.a(parcel, readInt, Status.CREATOR);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                bitmapTeleporter = (BitmapTeleporter) ivw.a(parcel, readInt, BitmapTeleporter.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new PlacePhotoResult(status, bitmapTeleporter);
    }
}
