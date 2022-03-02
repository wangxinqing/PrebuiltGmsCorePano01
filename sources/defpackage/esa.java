package defpackage;

import android.content.Context;
import com.google.android.gms.auth.account.service.WorkAccountChimeraService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: esa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class esa implements eio {
    public static final esa a = new esa();

    public final void a(Context context) {
    }

    public final void b(Context context) {
    }

    public final void c(Context context) {
        WorkAccountChimeraService.a.c("update authenticator enabled for boot or update", new Object[0]);
        try {
            acws.a(ejg.a(context).b((ihb) new eji()), 10, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            WorkAccountChimeraService.a.e("Failed to init work authenticator in onBootOrUpdate", e, new Object[0]);
        }
    }

    private esa() {
    }
}
