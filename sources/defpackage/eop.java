package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: eop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eop extends bhw implements eoq {
    final /* synthetic */ acwd a;

    public eop() {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }

    public final void a(Status status, AccountChangeEventsResponse accountChangeEventsResponse) {
        ihd.a(status, accountChangeEventsResponse, this.a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eop(acwd acwd) {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), (AccountChangeEventsResponse) bhx.a(parcel, AccountChangeEventsResponse.CREATOR));
        return true;
    }
}
