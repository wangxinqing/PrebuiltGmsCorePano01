package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.auth.AuthzenBeginTxData;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.PostSignInData;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: gdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gdc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TokenResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        ArrayList arrayList = new ArrayList();
        Bundle bundle = new Bundle();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        CaptchaChallenge captchaChallenge = null;
        String str9 = null;
        String str10 = null;
        PostSignInData postSignInData = null;
        Account account = null;
        String str11 = null;
        TokenData tokenData = null;
        String str12 = null;
        ResolutionData resolutionData = null;
        AuthzenBeginTxData authzenBeginTxData = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    str6 = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    str7 = ivw.q(parcel2, readInt);
                    break;
                case 9:
                    str8 = ivw.q(parcel2, readInt);
                    break;
                case 10:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 11:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 12:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    captchaChallenge = (CaptchaChallenge) ivw.a(parcel2, readInt, CaptchaChallenge.CREATOR);
                    break;
                case Service.START_CONTINUATION_MASK:
                    arrayList = ivw.c(parcel2, readInt, ScopeDetail.CREATOR);
                    break;
                case 16:
                    str9 = ivw.q(parcel2, readInt);
                    break;
                case 17:
                    str10 = ivw.q(parcel2, readInt);
                    break;
                case 19:
                    z5 = ivw.c(parcel2, readInt);
                    break;
                case 20:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 21:
                    postSignInData = (PostSignInData) ivw.a(parcel2, readInt, PostSignInData.CREATOR);
                    break;
                case 22:
                    account = (Account) ivw.a(parcel2, readInt, Account.CREATOR);
                    break;
                case 26:
                    str11 = ivw.q(parcel2, readInt);
                    break;
                case 27:
                    tokenData = (TokenData) ivw.a(parcel2, readInt, TokenData.CREATOR);
                    break;
                case 28:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case 29:
                    str12 = ivw.q(parcel2, readInt);
                    break;
                case 30:
                    resolutionData = (ResolutionData) ivw.a(parcel2, readInt, ResolutionData.CREATOR);
                    break;
                case 31:
                    authzenBeginTxData = (AuthzenBeginTxData) ivw.a(parcel2, readInt, AuthzenBeginTxData.CREATOR);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new TokenResponse(i, str, str2, str3, str4, str5, str6, str7, str8, z, z2, z3, z4, captchaChallenge, arrayList, str9, str10, z5, i2, postSignInData, account, str11, tokenData, bundle, str12, resolutionData, authzenBeginTxData);
    }
}
