package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;

/* renamed from: gdv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gdv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountCredentials[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = "com.google";
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    z = ivw.c(parcel, readInt);
                    break;
                case 3:
                    str = ivw.q(parcel, readInt);
                    break;
                case 4:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 5:
                    str3 = ivw.q(parcel, readInt);
                    break;
                case 6:
                    str4 = ivw.q(parcel, readInt);
                    break;
                case 7:
                    str5 = ivw.q(parcel, readInt);
                    break;
                case 8:
                    str6 = ivw.q(parcel, readInt);
                    break;
                case 9:
                    str7 = ivw.q(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new AccountCredentials(i, z, str, str2, str3, str4, str5, str6, str7);
    }
}
