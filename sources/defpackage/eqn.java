package defpackage;

import android.content.Context;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: eqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eqn extends nis {
    private final eoq a;
    private final AccountChangeEventsRequest b;
    private final fze c;

    public eqn(eoq eoq, fze fze, AccountChangeEventsRequest accountChangeEventsRequest) {
        super(224, "GetAccountChangeEventsGoogleAuthOperation");
        this.a = eoq;
        this.b = accountChangeEventsRequest;
        this.c = fze;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        this.a.a(Status.a, ((biv) this.c.a(context)).a(this.b));
    }

    public final void a(Status status) {
        this.a.a(status, (AccountChangeEventsResponse) null);
    }
}
