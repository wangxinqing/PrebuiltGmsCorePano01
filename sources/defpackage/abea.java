package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: abea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abea implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SignInResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ConnectionResult connectionResult = null;
        ResolveAccountResponse resolveAccountResponse = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                connectionResult = (ConnectionResult) ivw.a(parcel, readInt, ConnectionResult.CREATOR);
            } else if (a != 3) {
                ivw.b(parcel, readInt);
            } else {
                resolveAccountResponse = (ResolveAccountResponse) ivw.a(parcel, readInt, ResolveAccountResponse.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new SignInResponse(i, connectionResult, resolveAccountResponse);
    }
}
