package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

/* renamed from: mzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mzw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialRequestOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        byte[] bArr = null;
        Double d = null;
        String str = null;
        ArrayList arrayList = null;
        Integer num = null;
        TokenBinding tokenBinding = null;
        String str2 = null;
        AuthenticationExtensions authenticationExtensions = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    bArr = ivw.t(parcel, readInt);
                    break;
                case 3:
                    d = ivw.o(parcel, readInt);
                    break;
                case 4:
                    str = ivw.q(parcel, readInt);
                    break;
                case 5:
                    arrayList = ivw.c(parcel, readInt, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 6:
                    num = ivw.h(parcel, readInt);
                    break;
                case 7:
                    tokenBinding = (TokenBinding) ivw.a(parcel, readInt, TokenBinding.CREATOR);
                    break;
                case 8:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 9:
                    authenticationExtensions = (AuthenticationExtensions) ivw.a(parcel, readInt, AuthenticationExtensions.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new PublicKeyCredentialRequestOptions(bArr, d, str, arrayList, num, tokenBinding, str2, authenticationExtensions);
    }
}
