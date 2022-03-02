package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: pat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pat implements pas {
    private final Context a;
    private final iby b;

    public pat(Context context) {
        iby a2 = rou.a(context);
        this.a = context;
        this.b = a2;
    }

    private final ick b(String str) {
        Context context = this.a;
        acyp acyp = new acyp();
        acyp.a(str);
        try {
            return (ick) acws.a(acyr.a(context, acyp.a()).m(), ((Long) ozx.bx.c()).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            oso.c(e, "Failed to get UDC opt-in status", new Object[0]);
            if (!(e instanceof InterruptedException)) {
                return null;
            }
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public final String a() {
        ick c = c();
        if (c != null) {
            return amrk.b(c.f());
        }
        oso.e("getSignedInAccountName: Falling back to default value");
        return "";
    }

    public final ick c() {
        try {
            return (ick) acws.a(this.b.g(), ((Long) ozx.bx.c()).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            oso.c(e, "Failed to get Lockbox signed-in status", new Object[0]);
            if (!(e instanceof InterruptedException)) {
                return null;
            }
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public final void b() {
        icc icc = this.b.j;
        rpv rpv = new rpv(icc);
        icc.b((idf) rpv);
        try {
            acws.a(iux.a(rpv), ((Long) ozx.bx.c()).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            oso.e("Failed to remove signed-in account.");
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            oso.e("isOptedInForAppHistory: empty Account Name encountered");
            return false;
        }
        ick b2 = b(str);
        if (b2 == null || !b2.n()) {
            return false;
        }
        return true;
    }
}
