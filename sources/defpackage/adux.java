package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.userlocation.EstimationOptions;
import com.google.android.gms.userlocation.SemanticLocationUpdateRequest;

/* renamed from: adux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adux implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SemanticLocationUpdateRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        EstimationOptions estimationOptions = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                estimationOptions = (EstimationOptions) ivw.a(parcel, readInt, EstimationOptions.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new SemanticLocationUpdateRequest(str, i, estimationOptions);
    }
}
