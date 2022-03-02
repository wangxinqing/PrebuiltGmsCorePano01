package defpackage;

import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: afsy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afsy implements ahcb {
    final /* synthetic */ afsz a;
    private final String b;
    private final String c;
    private final String d;
    private final AtomicLong e = new AtomicLong();
    private final AtomicLong f = new AtomicLong();

    public afsy(afsz afsz, String str) {
        this.a = afsz;
        this.b = str;
        this.c = afsz.a(str, "w");
        this.d = afsz.a(str, "c");
    }

    public final void a() {
        synchronized (afsz.class) {
            afsz afsz = this.a;
            SharedPreferences a2 = afst.a(afsz.a, "gms_icing_mdd_network_usage_monitor", afsz.b);
            SharedPreferences.Editor edit = a2.edit();
            if (this.e.get() > 0) {
                edit.putLong(this.c, a2.getLong(this.c, 0) + this.e.getAndSet(0));
            }
            if (this.f.get() > 0) {
                edit.putLong(this.d, a2.getLong(this.d, 0) + this.f.getAndSet(0));
            }
            edit.apply();
            Object[] objArr = {"NetworkUsageMonitor", this.b, Long.valueOf(a2.getLong(this.c, -1)), Long.valueOf(a2.getLong(this.d, -1))};
        }
    }

    public final void a(int i) {
        ConnectivityManager connectivityManager;
        String str;
        NetworkInfo networkInfo = null;
        try {
            connectivityManager = (ConnectivityManager) this.a.a.getSystemService("connectivity");
        } catch (SecurityException e2) {
            afsh.a("%s: Couldn't retrieve ConnectivityManager.", (Object) "NetworkUsageMonitor");
            connectivityManager = null;
        }
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        }
        if (networkInfo == null) {
            afsh.a("%s: Fail to get network type ", (Object) "NetworkUsageMonitor");
            str = "w";
        } else {
            if (!(networkInfo.getType() == 1 || networkInfo.getType() == 9)) {
                int i2 = Build.VERSION.SDK_INT;
                if (networkInfo.getType() != 17) {
                    str = "c";
                }
            }
            str = "w";
        }
        if ("w".equals(str)) {
            this.e.getAndAdd((long) i);
        } else {
            this.f.getAndAdd((long) i);
        }
        Object[] objArr = {"NetworkUsageMonitor", str, this.b, Integer.valueOf(i), Long.valueOf(this.e.get()), Long.valueOf(this.f.get())};
    }
}
