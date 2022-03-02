package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import org.chromium.net.UrlRequest;

/* renamed from: gcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gcl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleAccountSetupRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        Bundle bundle = new Bundle();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        AppDescription appDescription = null;
        AccountCredentials accountCredentials = null;
        CaptchaSolution captchaSolution = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case 3:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 4:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 5:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 6:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 9:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 10:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case 11:
                    z5 = ivw.c(parcel2, readInt);
                    break;
                case 12:
                    z6 = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    appDescription = (AppDescription) ivw.a(parcel2, readInt, AppDescription.CREATOR);
                    break;
                case Service.START_CONTINUATION_MASK:
                    accountCredentials = (AccountCredentials) ivw.a(parcel2, readInt, AccountCredentials.CREATOR);
                    break;
                case 16:
                    captchaSolution = (CaptchaSolution) ivw.a(parcel2, readInt, CaptchaSolution.CREATOR);
                    break;
                case 17:
                    str6 = ivw.q(parcel2, readInt);
                    break;
                case 18:
                    str7 = ivw.q(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new GoogleAccountSetupRequest(i, bundle, z, z2, z3, str, str2, str3, str4, z4, z5, z6, str5, appDescription, accountCredentials, captchaSolution, str6, str7);
    }
}
