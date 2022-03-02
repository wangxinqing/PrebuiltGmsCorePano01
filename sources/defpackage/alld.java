package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;
import com.google.android.userlocation.LegacySemanticLocationEventSubscription;

/* renamed from: alld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alld implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LegacySemanticLocationEventSubscription[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        SemanticLocationEventRequest semanticLocationEventRequest = null;
        PlacesParams placesParams = null;
        PendingIntent pendingIntent = null;
        PendingIntent pendingIntent2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                semanticLocationEventRequest = (SemanticLocationEventRequest) ivw.a(parcel, readInt, SemanticLocationEventRequest.CREATOR);
            } else if (a == 2) {
                placesParams = (PlacesParams) ivw.a(parcel, readInt, PlacesParams.CREATOR);
            } else if (a == 3) {
                pendingIntent = (PendingIntent) ivw.a(parcel, readInt, PendingIntent.CREATOR);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                pendingIntent2 = (PendingIntent) ivw.a(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new LegacySemanticLocationEventSubscription(semanticLocationEventRequest, placesParams, pendingIntent, pendingIntent2);
    }
}
