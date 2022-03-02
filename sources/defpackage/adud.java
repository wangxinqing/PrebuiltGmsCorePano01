package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.userlocation.PlaceEstimate;
import com.google.android.gms.userlocation.Position;
import com.google.android.gms.userlocation.SemanticLocation;
import com.google.android.gms.userlocation.TransitEstimate;
import java.util.ArrayList;

/* renamed from: adud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adud implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SemanticLocation[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        TransitEstimate transitEstimate = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Position position = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    j = ivw.i(parcel, readInt);
                    break;
                case 3:
                    transitEstimate = (TransitEstimate) ivw.a(parcel, readInt, TransitEstimate.CREATOR);
                    break;
                case 4:
                    arrayList = ivw.c(parcel, readInt, PlaceEstimate.CREATOR);
                    break;
                case 5:
                    arrayList2 = ivw.c(parcel, readInt, PlaceEstimate.CREATOR);
                    break;
                case 6:
                    position = (Position) ivw.a(parcel, readInt, Position.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new SemanticLocation(i, j, transitEstimate, arrayList, arrayList2, position);
    }
}
