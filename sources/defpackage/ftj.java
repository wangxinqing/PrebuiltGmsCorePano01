package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.identity.GetDefaultAccountResult;
import com.google.android.gms.common.api.Status;

/* renamed from: ftj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ftj extends bhw implements ftk {
    final /* synthetic */ acwd a;

    public ftj() {
        super("com.google.android.gms.auth.api.identity.internal.IGetDefaultAccountCallback");
    }

    public final void a(Status status, GetDefaultAccountResult getDefaultAccountResult) {
        ihd.a(status, getDefaultAccountResult, this.a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ftj(acwd acwd) {
        super("com.google.android.gms.auth.api.identity.internal.IGetDefaultAccountCallback");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), (GetDefaultAccountResult) bhx.a(parcel, GetDefaultAccountResult.CREATOR));
        return true;
    }
}
