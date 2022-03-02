package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* renamed from: eij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eij implements eil {
    final /* synthetic */ AccountChangeEventsRequest a;

    public eij(AccountChangeEventsRequest accountChangeEventsRequest) {
        this.a = accountChangeEventsRequest;
    }

    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        biw biw;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            biw = queryLocalInterface instanceof biw ? (biw) queryLocalInterface : new biu(iBinder);
        } else {
            biw = null;
        }
        AccountChangeEventsResponse a2 = biw.a(this.a);
        eim.a((Object) a2);
        return a2.b;
    }
}
