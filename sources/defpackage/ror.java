package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ror  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ror {
    public static long a = -1;
    public final Context b;

    public ror(Context context) {
        this.b = context;
        new hol(context, "", (String) null);
    }

    public final boolean a() {
        try {
            acwa a2 = yef.a(this.b).a("com.google.android.gms.lockbox", 1, new String[]{"LB_AS", "LB_CFG", "LB_T", "LB_D"}, new int[0]);
            acws.a(a2, ayfq.b(), TimeUnit.SECONDS);
            return a2.b();
        } catch (ExecutionException | TimeoutException e) {
            return false;
        } catch (InterruptedException e2) {
            return false;
        }
    }
}
