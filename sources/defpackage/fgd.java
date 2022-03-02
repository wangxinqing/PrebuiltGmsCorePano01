package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;

/* renamed from: fgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fgd extends bhv implements fgf {
    public fgd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsInternalService");
    }

    public final void a(fgb fgb) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) fgb);
        b(7, aQ);
    }

    public final void b(fgb fgb, Account account, boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) fgb);
        bhx.a(aQ, (Parcelable) account);
        bhx.a(aQ, z);
        b(9, aQ);
    }

    public final void a(fgb fgb, Account account) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) fgb);
        bhx.a(aQ, (Parcelable) account);
        b(6, aQ);
    }

    public final void a(fgb fgb, Account account, String str, Credential credential) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) fgb);
        bhx.a(aQ, (Parcelable) account);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) credential);
        b(5, aQ);
    }

    public final void a(fgb fgb, Account account, String str, Credential credential, boolean z, String str2, String str3) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) fgb);
        bhx.a(aQ, (Parcelable) account);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) credential);
        bhx.a(aQ, z);
        aQ.writeString(str2);
        aQ.writeString(str3);
        b(3, aQ);
    }

    public final void a(fgb fgb, Account account, String str, String str2, String str3) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) fgb);
        bhx.a(aQ, (Parcelable) account);
        aQ.writeString(str);
        aQ.writeString(str2);
        aQ.writeString(str3);
        b(4, aQ);
    }

    public final void a(fgb fgb, Account account, String str, boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) fgb);
        bhx.a(aQ, (Parcelable) account);
        aQ.writeString(str);
        bhx.a(aQ, z);
        b(11, aQ);
    }

    public final void a(fgb fgb, Account account, boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) fgb);
        bhx.a(aQ, (Parcelable) account);
        bhx.a(aQ, z);
        b(8, aQ);
    }

    public final void a(fgb fgb, HintRequest hintRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) fgb);
        bhx.a(aQ, (Parcelable) hintRequest);
        b(2, aQ);
    }

    public final void a(fgb fgb, String str, CredentialRequest credentialRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) fgb);
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) credentialRequest);
        b(1, aQ);
    }

    public final void a(fgb fgb, String str, boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) fgb);
        aQ.writeString(str);
        bhx.a(aQ, true);
        b(10, aQ);
    }
}
