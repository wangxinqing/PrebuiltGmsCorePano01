package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.places.placefencing.PlacefencingSubscription;

/* renamed from: akug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akug implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlacefencingSubscription[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        PlacefencingRequest placefencingRequest = null;
        PlacesParams placesParams = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                placefencingRequest = (PlacefencingRequest) ivw.a(parcel, readInt, PlacefencingRequest.CREATOR);
            } else if (a == 2) {
                placesParams = (PlacesParams) ivw.a(parcel, readInt, PlacesParams.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) ivw.a(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new PlacefencingSubscription(placefencingRequest, placesParams, pendingIntent);
    }
}
