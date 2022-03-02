package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: pbf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pbf implements agod {
    public final Account a;
    public final quk b;
    private final int c;
    private final String d;
    private final Executor e;

    public pbf(Account account, quk quk, int i, String str, Executor executor) {
        this.a = account;
        this.b = quk;
        this.c = i;
        this.d = str;
        this.e = executor;
    }

    private final aorr a(aorr aorr) {
        return aooz.a(aorr, eif.class, pbc.a, this.e);
    }

    public final void close() {
        this.b.a.h();
    }

    public final aorr a(atwj atwj) {
        return a(aorl.a((Callable) new pbe(this, atwj), this.e));
    }

    public final aorr a(atxm atxm) {
        return a(aorl.a((Callable) new pbd(this, atxm), this.e));
    }

    public final ClientContext a(Account account) {
        ClientContext clientContext = new ClientContext();
        clientContext.b = this.c;
        clientContext.c = account;
        String str = this.d;
        clientContext.e = str;
        clientContext.f = str;
        clientContext.d("https://www.googleapis.com/auth/webhistory");
        return clientContext;
    }
}
