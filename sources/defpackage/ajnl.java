package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;

/* renamed from: ajnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajnl extends jfx {
    final /* synthetic */ acwd a;
    final /* synthetic */ Context e;
    final /* synthetic */ Account f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajnl(acwd acwd, Context context, Account account) {
        super(9);
        this.a = acwd;
        this.e = context;
        this.f = account;
    }

    public final void run() {
        try {
            this.a.a((Object) eim.f(this.e, this.f.name));
        } catch (eif | IOException e2) {
            this.a.a((Object) null);
        }
    }
}
