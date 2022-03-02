package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.CableAuthenticationExtension;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;

/* renamed from: mzj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mzj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationExtensions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        FidoAppIdExtension fidoAppIdExtension = null;
        CableAuthenticationExtension cableAuthenticationExtension = null;
        UserVerificationMethodExtension userVerificationMethodExtension = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                fidoAppIdExtension = (FidoAppIdExtension) ivw.a(parcel, readInt, FidoAppIdExtension.CREATOR);
            } else if (a == 3) {
                cableAuthenticationExtension = (CableAuthenticationExtension) ivw.a(parcel, readInt, CableAuthenticationExtension.CREATOR);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                userVerificationMethodExtension = (UserVerificationMethodExtension) ivw.a(parcel, readInt, UserVerificationMethodExtension.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new AuthenticationExtensions(fidoAppIdExtension, cableAuthenticationExtension, userVerificationMethodExtension);
    }
}
