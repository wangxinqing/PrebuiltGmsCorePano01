package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.userlocation.UserLocationNearbyLikelihood;
import java.util.ArrayList;

/* renamed from: advc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class advc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserLocationNearbyLikelihood[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        String str = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                d = ivw.n(parcel, readInt);
            } else if (a == 3) {
                d2 = ivw.n(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                arrayList = ivw.B(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new UserLocationNearbyLikelihood(str, d, d2, arrayList);
    }
}
