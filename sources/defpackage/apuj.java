package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.MfaInfo;
import com.google.firebase.auth.api.model.ProviderUserInfoList;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: apuj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apuj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetAccountInfoUser[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ProviderUserInfoList providerUserInfoList = null;
        String str5 = null;
        String str6 = null;
        DefaultOAuthCredential defaultOAuthCredential = null;
        ArrayList arrayList = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 5:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    providerUserInfoList = (ProviderUserInfoList) ivw.a(parcel2, readInt, ProviderUserInfoList.CREATOR);
                    break;
                case 8:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case 9:
                    str6 = ivw.q(parcel2, readInt);
                    break;
                case 10:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 11:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 12:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    defaultOAuthCredential = (DefaultOAuthCredential) ivw.a(parcel2, readInt, DefaultOAuthCredential.CREATOR);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    arrayList = ivw.c(parcel2, readInt, MfaInfo.CREATOR);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new GetAccountInfoUser(str, str2, z, str3, str4, providerUserInfoList, str5, str6, j, j2, z2, defaultOAuthCredential, arrayList);
    }
}
