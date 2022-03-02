package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import com.google.android.gms.signin.internal.SignInRequest;

/* renamed from: abds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abds extends bhv implements abdu {
    public abds(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        b(7, aQ);
    }

    public final void a(ResolveAccountRequest resolveAccountRequest, iue iue) {
        throw null;
    }

    public final void b() {
        throw null;
    }

    public final void c() {
        throw null;
    }

    public final void a(int i, Account account, abdr abdr) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) account);
        bhx.a(aQ, (IInterface) abdr);
        b(8, aQ);
    }

    public final void a(abdr abdr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) abdr);
        b(11, aQ);
    }

    public final void a(AuthAccountRequest authAccountRequest, abdr abdr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) authAccountRequest);
        bhx.a(aQ, (IInterface) abdr);
        b(2, aQ);
    }

    public final void a(RecordConsentByConsentResultRequest recordConsentByConsentResultRequest, abdr abdr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) recordConsentByConsentResultRequest);
        bhx.a(aQ, (IInterface) abdr);
        b(14, aQ);
    }

    public final void a(RecordConsentRequest recordConsentRequest, abdr abdr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) recordConsentRequest);
        bhx.a(aQ, (IInterface) abdr);
        b(10, aQ);
    }

    public final void a(SignInRequest signInRequest, abdr abdr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) signInRequest);
        bhx.a(aQ, (IInterface) abdr);
        b(12, aQ);
    }

    public final void a(itm itm, int i, boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) itm);
        aQ.writeInt(i);
        bhx.a(aQ, z);
        b(9, aQ);
    }

    public final void a(boolean z) {
        Parcel aQ = aQ();
        bhx.a(aQ, false);
        b(13, aQ);
    }
}
