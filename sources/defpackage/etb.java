package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.internal.UserChallengeRequest;

/* renamed from: etb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class etb extends etk {
    final /* synthetic */ UserChallengeRequest a;

    public etb(UserChallengeRequest userChallengeRequest) {
        this.a = userChallengeRequest;
    }

    /* access modifiers changed from: protected */
    public final void a(eua eua) {
        etz etz = this.c;
        UserChallengeRequest userChallengeRequest = this.a;
        Parcel aQ = eua.aQ();
        bhx.a(aQ, (IInterface) etz);
        bhx.a(aQ, (Parcelable) userChallengeRequest);
        eua.b(8, aQ);
    }
}
