package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.userlocation.EstimationOptions;
import com.google.android.gms.userlocation.SemanticLocationEventRequest;

/* renamed from: adug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adug implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SemanticLocationEventRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int i = 0;
        String str = null;
        EstimationOptions estimationOptions = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a == 3) {
                estimationOptions = (EstimationOptions) ivw.a(parcel, readInt, EstimationOptions.CREATOR);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                i2 = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new SemanticLocationEventRequest(str, i, estimationOptions, i2);
    }
}
