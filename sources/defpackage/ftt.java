package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.MatchPasswordResult;
import com.google.android.gms.common.api.Status;

/* renamed from: ftt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ftt extends bhw implements ftu {
    final /* synthetic */ acwd a;

    public ftt() {
        super("com.google.android.gms.auth.api.identity.internal.IMatchPasswordCallback");
    }

    public final void a(Status status, MatchPasswordResult matchPasswordResult) {
        ihd.a(status, matchPasswordResult, this.a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ftt(acwd acwd) {
        super("com.google.android.gms.auth.api.identity.internal.IMatchPasswordCallback");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), (MatchPasswordResult) bhx.a(parcel, MatchPasswordResult.CREATOR));
        return true;
    }
}
