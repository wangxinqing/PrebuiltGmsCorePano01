package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.PasswordCheckResponse;

/* renamed from: gcu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gcu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PasswordCheckResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                str2 = ivw.q(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                str3 = ivw.q(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new PasswordCheckResponse(i, str, str2, str3);
    }
}
