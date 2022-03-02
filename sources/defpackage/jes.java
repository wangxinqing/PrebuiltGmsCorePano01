package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: jes  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jes implements ConnectivityManager.OnNetworkActiveListener {
    public static final /* synthetic */ int c = 0;
    private static jes d;
    public final jie a;
    protected boolean b;
    private final Context e;
    private final jic f = jer.a;

    private jes(Context context) {
        this.e = context;
        this.b = false;
        this.a = new jie(new jep(context), "radio_activity", this.f, jfm.a(1, 10), axbe.a.a().f(), TimeUnit.MILLISECONDS, (int) axbe.a.a().e());
    }

    public static jes a() {
        ConnectivityManager f2;
        if (axbe.f()) {
            int i = Build.VERSION.SDK_INT;
            if (d == null) {
                jes jes = new jes(ihs.b());
                d = jes;
                int i2 = Build.VERSION.SDK_INT;
                if (!jes.b && (f2 = jkf.f(jes.e)) != null) {
                    f2.addDefaultNetworkActiveListener(jes);
                    jes.b = true;
                }
            }
        } else {
            jes jes2 = d;
            if (jes2 != null) {
                jes2.b();
                d = null;
            }
        }
        return d;
    }

    public final void onNetworkActive() {
        if (!axbe.f()) {
            b();
            return;
        }
        NetworkInfo d2 = jkf.d(this.e);
        if (d2 == null) {
            Log.w("WLRadioListnr", "NetworkInfo was null");
        } else {
            this.a.a((Object) new jeq(System.currentTimeMillis(), d2.getType()));
        }
    }

    public final void b() {
        ConnectivityManager f2;
        int i = Build.VERSION.SDK_INT;
        if (this.b && (f2 = jkf.f(this.e)) != null) {
            f2.removeDefaultNetworkActiveListener(this);
            this.b = false;
        }
    }
}
