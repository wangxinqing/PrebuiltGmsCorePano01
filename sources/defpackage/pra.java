package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.common.api.Status;

/* renamed from: pra  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pra extends pre {
    private final GetRecentContextCall$Request b;
    private final dux c;
    private final pwz d;

    public pra(GetRecentContextCall$Request getRecentContextCall$Request, dux dux, pwz pwz) {
        super(dux, "GetRecentContext");
        this.b = getRecentContextCall$Request;
        this.c = dux;
        this.d = pwz;
    }

    public final void a(Context context) {
        GetRecentContextCall$Response getRecentContextCall$Response = new GetRecentContextCall$Response();
        getRecentContextCall$Response.a = Status.a;
        getRecentContextCall$Response.b = this.d.a(this.b, new prq(context, "AppDataSearch-main"));
        try {
            this.c.a(getRecentContextCall$Response);
        } catch (RemoteException e) {
            oso.c((Throwable) e, "Client died during getRecentContext.", new Object[0]);
        }
    }
}
