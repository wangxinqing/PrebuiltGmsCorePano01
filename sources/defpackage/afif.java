package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: afif  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afif {
    private final afit a;
    private final Context b;
    private final Executor c;
    private final rzb d;

    public afif(afit afit, rzb rzb, Context context, Executor executor) {
        this.a = afit;
        this.d = rzb;
        this.b = context;
        this.c = executor;
    }

    public final afhs a(Account account, int i, int i2, aubq aubq) {
        rzb rzb = this.d;
        return new afij(this.c, this.b, this.a, new sac(rzb.a, rzb.b, rzb.c, rzb.d, account, i, i2), aubq, new afiq(aubq), account, i, i2);
    }

    public final afhs a(Account account, int i, aubq aubq) {
        return a(account, i, aubq.a(), aubq);
    }
}
