package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocationUpdateRequest;
import com.google.android.userlocation.SemanticLocationUpdateSubscription;

/* renamed from: allj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class allj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SemanticLocationUpdateSubscription[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        SemanticLocationUpdateRequest semanticLocationUpdateRequest = null;
        PlacesParams placesParams = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                semanticLocationUpdateRequest = (SemanticLocationUpdateRequest) ivw.a(parcel, readInt, SemanticLocationUpdateRequest.CREATOR);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                placesParams = (PlacesParams) ivw.a(parcel, readInt, PlacesParams.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new SemanticLocationUpdateSubscription(semanticLocationUpdateRequest, placesParams, (advg) null);
    }
}
