package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;

/* renamed from: evd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class evd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new HintRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) ivw.a(parcel, readInt, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        z = ivw.c(parcel, readInt);
                        break;
                    case 3:
                        z2 = ivw.c(parcel, readInt);
                        break;
                    case 4:
                        strArr = ivw.A(parcel, readInt);
                        break;
                    case 5:
                        z3 = ivw.c(parcel, readInt);
                        break;
                    case 6:
                        str = ivw.q(parcel, readInt);
                        break;
                    case 7:
                        str2 = ivw.q(parcel, readInt);
                        break;
                    default:
                        ivw.b(parcel, readInt);
                        break;
                }
            } else {
                i = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str, str2);
    }
}
