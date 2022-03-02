package defpackage;

import android.accounts.Account;
import android.database.SQLException;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: aguv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aguv {
    public final Executor a;

    public aguv(Executor executor) {
        this.a = executor;
    }

    /* access modifiers changed from: package-private */
    public final agus a(Account account, File file) {
        try {
            agus agus = new agus(agtd.a(file, new aguu()), this.a);
            agta.a(agus.a, account, new agup(agus));
            return agus;
        } catch (SQLException e) {
            throw new agsx(e);
        }
    }
}
