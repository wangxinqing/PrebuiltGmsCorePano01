package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Set;

/* renamed from: qkn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qkn {
    private static final qfn a = new qfn("NetworkCriteria");
    private final Context b;
    private final qeg c;
    private String d;
    private final Set e = new ob();

    public qkn(Context context, qeg qeg) {
        this.b = context;
        this.c = qeg;
    }

    private final synchronized void b() {
        String q = axuy.a.a().q();
        if (!q.equals(this.d)) {
            this.d = q;
            this.e.clear();
            for (String trim : q.split(",")) {
                String trim2 = trim.trim();
                if (!trim2.isEmpty()) {
                    try {
                        this.e.add(Integer.valueOf(Integer.parseInt(trim2)));
                    } catch (NumberFormatException e2) {
                        a.a(e2, "%s", q);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        boolean z = true;
        if (!axuy.a.a().u() || this.c.a()) {
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getSystemService("connectivity");
        if (connectivityManager == null) {
            a.c("ConnectivityManager N/A", new Object[0]);
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        b();
        synchronized (this) {
            if (activeNetworkInfo.getType() == 0 && this.e.contains(Integer.valueOf(activeNetworkInfo.getSubtype()))) {
                z = false;
            }
        }
        return z;
    }
}
