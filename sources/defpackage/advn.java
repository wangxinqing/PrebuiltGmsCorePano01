package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.userlocation.internal.UserLocationClientIdentifier;
import com.google.android.gms.userlocation.internal.UserLocationParameters;
import java.util.ArrayList;

/* renamed from: advn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class advn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserLocationParameters[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        UserLocationClientIdentifier userLocationClientIdentifier = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a == 2) {
                userLocationClientIdentifier = (UserLocationClientIdentifier) ivw.a(parcel, readInt, UserLocationClientIdentifier.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                arrayList = ivw.C(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new UserLocationParameters(str, userLocationClientIdentifier, arrayList);
    }
}
