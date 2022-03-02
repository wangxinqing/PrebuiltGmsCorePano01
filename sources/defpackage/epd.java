package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: epd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class epd extends bhw implements epe {
    final /* synthetic */ acwd a;

    public epd() {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }

    public final void a(Status status, Bundle bundle) {
        ihd.a(status, bundle, this.a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public epd(acwd acwd) {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), (Bundle) bhx.a(parcel, Bundle.CREATOR));
        return true;
    }
}
