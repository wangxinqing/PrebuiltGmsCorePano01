package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.CompleteSignInResult;
import com.google.android.gms.common.api.Status;

/* renamed from: ftb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ftb extends bhw implements ftc {
    final /* synthetic */ acwd a;

    public ftb() {
        super("com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback");
    }

    public final void a(Status status, CompleteSignInResult completeSignInResult) {
        ihd.a(status, completeSignInResult, this.a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ftb(acwd acwd) {
        super("com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), (CompleteSignInResult) bhx.a(parcel, CompleteSignInResult.CREATOR));
        return true;
    }
}
