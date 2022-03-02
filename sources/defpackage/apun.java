package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apun implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetTokenResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        Long l2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                str2 = ivw.q(parcel, readInt);
            } else if (a == 4) {
                l = ivw.j(parcel, readInt);
            } else if (a == 5) {
                str3 = ivw.q(parcel, readInt);
            } else if (a != 6) {
                ivw.b(parcel, readInt);
            } else {
                l2 = ivw.j(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new GetTokenResponse(str, str2, l, str3, l2);
    }
}
