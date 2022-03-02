package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: apnj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apnj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PhoneAuthCredential[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel, readInt);
                    break;
                case 2:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 3:
                    z = ivw.c(parcel, readInt);
                    break;
                case 4:
                    str3 = ivw.q(parcel, readInt);
                    break;
                case 5:
                    z2 = ivw.c(parcel, readInt);
                    break;
                case 6:
                    str4 = ivw.q(parcel, readInt);
                    break;
                case 7:
                    str5 = ivw.q(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new PhoneAuthCredential(str, str2, z, str3, z2, str4, str5);
    }
}
