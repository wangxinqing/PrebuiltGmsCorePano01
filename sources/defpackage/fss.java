package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInCredential;

/* renamed from: fss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fss implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SignInCredential[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
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
                    str3 = ivw.q(parcel, readInt);
                    break;
                case 4:
                    str4 = ivw.q(parcel, readInt);
                    break;
                case 5:
                    uri = (Uri) ivw.a(parcel, readInt, Uri.CREATOR);
                    break;
                case 6:
                    str5 = ivw.q(parcel, readInt);
                    break;
                case 7:
                    str6 = ivw.q(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new SignInCredential(str, str2, str3, str4, uri, str5, str6);
    }
}
