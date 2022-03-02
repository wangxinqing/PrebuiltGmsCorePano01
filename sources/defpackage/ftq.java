package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.ListSignInCredentialsResult;
import com.google.android.gms.common.api.Status;

/* renamed from: ftq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ftq extends bhw implements ftr {
    final /* synthetic */ acwd a;

    public ftq() {
        super("com.google.android.gms.auth.api.identity.internal.IListSignInCredentialsCallback");
    }

    public final void a(Status status, ListSignInCredentialsResult listSignInCredentialsResult) {
        ihd.a(status, listSignInCredentialsResult, this.a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ftq(acwd acwd) {
        super("com.google.android.gms.auth.api.identity.internal.IListSignInCredentialsCallback");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), (ListSignInCredentialsResult) bhx.a(parcel, ListSignInCredentialsResult.CREATOR));
        return true;
    }
}
