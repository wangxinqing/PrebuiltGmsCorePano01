package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: gih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gih extends ijj {
    private static final iwd a = ehv.a("AuthManaged", "FetchManagingAppInfoLoader");
    private final gji b;
    private final gjh c;
    private final Account d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gih(Context context, Account account) {
        super(context);
        gjh a2 = gjh.a();
        gji a3 = gji.a(context);
        iva.a((Object) account);
        this.d = account;
        this.c = a2;
        this.b = a3;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        a.c("loadInBackground", new Object[0]);
        this.b.a(2);
        gjd a2 = this.c.a(getContext(), this.d);
        this.c.b(getContext(), this.d);
        if (awpr.c()) {
            if (awpr.b()) {
                this.b.a(9, this.c.a(a2.b));
            } else {
                this.b.a(9);
            }
        }
        return new gig(a2.b, a2.c);
    }
}
