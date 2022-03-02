package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import org.chromium.net.UrlRequest;

/* renamed from: gdb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gdb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TokenRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        Bundle bundle = new Bundle();
        String str = gda.UNKNOWN.toString();
        String str2 = null;
        String str3 = null;
        FACLConfig fACLConfig = null;
        PACLConfig pACLConfig = null;
        AppDescription appDescription = null;
        CaptchaSolution captchaSolution = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = "com.google";
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case 5:
                    fACLConfig = (FACLConfig) ivw.a(parcel2, readInt, FACLConfig.CREATOR);
                    break;
                case 6:
                    pACLConfig = (PACLConfig) ivw.a(parcel2, readInt, PACLConfig.CREATOR);
                    break;
                case 7:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 8:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 9:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 10:
                    appDescription = (AppDescription) ivw.a(parcel2, readInt, AppDescription.CREATOR);
                    break;
                case 11:
                    captchaSolution = (CaptchaSolution) ivw.a(parcel2, readInt, CaptchaSolution.CREATOR);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    str7 = ivw.q(parcel2, readInt);
                    break;
                case 16:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 17:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 18:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case 19:
                    str6 = ivw.q(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new TokenRequest(i, str2, str3, bundle, fACLConfig, pACLConfig, z, z2, str, appDescription, captchaSolution, z3, z4, str7, i2, str4, str5, str6);
    }
}
