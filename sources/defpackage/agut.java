package defpackage;

import android.accounts.Account;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: agut  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class agut implements Callable {
    private final aguv a;
    private final Account b;
    private final File c;

    public agut(aguv aguv, Account account, File file) {
        this.a = aguv;
        this.b = account;
        this.c = file;
    }

    public final Object call() {
        return this.a.a(this.b, this.c);
    }
}
