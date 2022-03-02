package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ahyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahyl {
    private final Context a;

    public ahyl(Context context) {
        this.a = context.getApplicationContext();
    }

    public final boolean a() {
        for (Account account : ahxz.a(this.a).b) {
            ihs b = ihs.b();
            acyp acyp = new acyp();
            acyp.a = account;
            try {
                ick ick = (ick) acws.a(acyr.a(b, acyp.a()).m(), 500, TimeUnit.MILLISECONDS);
                if (ick.o()) {
                    if (ick.n()) {
                        return true;
                    }
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
            }
        }
        return false;
    }
}
