package defpackage;

import android.content.Context;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: eqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eqo extends nis {
    private final eoq a;
    private final AccountChangeEventsRequest b;
    private final eqk c;

    public eqo(eoq eoq, eqk eqk, AccountChangeEventsRequest accountChangeEventsRequest) {
        super(153, "GetAccountChangeEvents");
        this.a = eoq;
        this.b = accountChangeEventsRequest;
        this.c = eqk;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        this.a.a(Status.a, this.c.a(context).a(this.b));
    }

    public final void a(Status status) {
        this.a.a(status, (AccountChangeEventsResponse) null);
    }
}
