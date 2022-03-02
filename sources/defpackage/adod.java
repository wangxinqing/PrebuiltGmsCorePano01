package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.Objects;

/* renamed from: adod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adod {
    public final amri a;

    public adod(amri amri) {
        this.a = amri;
    }

    public static adod a(Context context) {
        amrl.a(!b(context));
        return new adod(ampu.a);
    }

    static boolean b(Context context) {
        adjw.j(context);
        return jkr.b();
    }

    public final boolean c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (!this.a.a()) {
            return connectivityManager.isActiveNetworkMetered();
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities((Network) this.a.b());
        if (networkCapabilities == null) {
            return true;
        }
        if ((Build.VERSION.SDK_INT != 23 || !networkCapabilities.hasTransport(1)) && !networkCapabilities.hasCapability(11)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adod)) {
            return false;
        }
        adod adod = (adod) obj;
        if (!jkr.b() || ((Network) this.a.b()).getNetworkHandle() == ((Network) adod.a.b()).getNetworkHandle()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (jkr.b()) {
            return Objects.hashCode(Long.valueOf(((Network) this.a.b()).getNetworkHandle()));
        }
        return 0;
    }
}
