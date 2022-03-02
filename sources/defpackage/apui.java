package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.api.model.GetAccountInfoResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUserList;

/* renamed from: apui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apui implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetAccountInfoResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        GetAccountInfoUserList getAccountInfoUserList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 2) {
                ivw.b(parcel, readInt);
            } else {
                getAccountInfoUserList = (GetAccountInfoUserList) ivw.a(parcel, readInt, GetAccountInfoUserList.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new GetAccountInfoResponse(getAccountInfoUserList);
    }
}
