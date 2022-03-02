package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import java.util.List;

/* renamed from: ftm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ftm extends bhv implements fto {
    public ftm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService");
    }

    public final void a(ftc ftc, String str, BeginSignInRequest beginSignInRequest, InternalSignInCredentialWrapper internalSignInCredentialWrapper) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ftc);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) beginSignInRequest);
        bhx.a(aQ, (Parcelable) internalSignInCredentialWrapper);
        b(2, aQ);
    }

    public final void b(ifu ifu, String str, String str2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        aQ.writeString(str);
        aQ.writeString(str2);
        b(6, aQ);
    }

    public final void a(fth fth, String str, String str2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) fth);
        aQ.writeString(str);
        aQ.writeString(str2);
        b(11, aQ);
    }

    public final void b(ifu ifu, String str, String str2, Account account) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        aQ.writeString(str);
        aQ.writeString(str2);
        bhx.a(aQ, (Parcelable) account);
        b(4, aQ);
    }

    public final void a(ftk ftk, String str, String str2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ftk);
        aQ.writeString(str);
        aQ.writeString(str2);
        b(9, aQ);
    }

    public final void a(ftr ftr, String str, BeginSignInRequest beginSignInRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ftr);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) beginSignInRequest);
        b(1, aQ);
    }

    public final void a(ftu ftu, SavePasswordRequest savePasswordRequest, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ftu);
        bhx.a(aQ, (Parcelable) savePasswordRequest);
        aQ.writeString(str);
        b(7, aQ);
    }

    public final void a(ifu ifu, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, String str, Account account, String str2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) saveAccountLinkingTokenRequest);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) account);
        aQ.writeString(str2);
        b(10, aQ);
    }

    public final void a(ifu ifu, SavePasswordRequest savePasswordRequest, List list, String str) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        bhx.a(aQ, (Parcelable) savePasswordRequest);
        aQ.writeTypedList(list);
        aQ.writeString(str);
        b(8, aQ);
    }

    public final void a(ifu ifu, String str, String str2) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        aQ.writeString(str);
        aQ.writeString(str2);
        b(5, aQ);
    }

    public final void a(ifu ifu, String str, String str2, Account account) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) ifu);
        aQ.writeString(str);
        aQ.writeString(str2);
        bhx.a(aQ, (Parcelable) account);
        b(3, aQ);
    }
}
