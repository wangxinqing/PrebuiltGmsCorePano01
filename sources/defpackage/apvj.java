package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.api.model.VerifyCustomTokenResponse;

/* renamed from: apvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apvj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new VerifyCustomTokenResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                str2 = ivw.q(parcel, readInt);
            } else if (a == 4) {
                j = ivw.i(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                z = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new VerifyCustomTokenResponse(str, str2, j, z);
    }
}
