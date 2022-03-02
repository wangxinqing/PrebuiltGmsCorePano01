package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Set;

/* renamed from: cef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cef extends ccy {
    public static final ccj b = new ccj(new cee(), "NetworkStateProducer", new int[]{27}, (int[]) null);
    private static final Set k = anax.a((Object) "android.net.conn.CONNECTIVITY_CHANGE");
    private atth l;

    public cef(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
        a(27);
    }

    private final void a(atth atth, long j) {
        this.l = atth;
        jti jti = new jti(7, 27, 1);
        jti.a(jut.b(j));
        jti.a(atth.e, this.l);
        d(jti.a());
    }

    private final atth j() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.d.getSystemService("connectivity");
        aucd o = atth.d.o();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getState() != NetworkInfo.State.CONNECTED) {
            atte atte = atte.DISCONNECTED;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atth atth = (atth) o.b;
            atth.b = atte.e;
            atth.a |= 1;
        } else if (activeNetworkInfo.getType() == 0) {
            atte atte2 = atte.ON_CELLULAR;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atth atth2 = (atth) o.b;
            atth2.b = atte2.e;
            atth2.a |= 1;
            attg attg = !connectivityManager.isActiveNetworkMetered() ? attg.UNMETERED : attg.METERED;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atth atth3 = (atth) o.b;
            atth3.c = attg.d;
            atth3.a |= 2;
        } else if (activeNetworkInfo.getType() == 1) {
            atte atte3 = atte.ON_WIFI;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atth atth4 = (atth) o.b;
            atth4.b = atte3.e;
            atth4.a |= 1;
            attg attg2 = !connectivityManager.isActiveNetworkMetered() ? attg.UNMETERED : attg.METERED;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atth atth5 = (atth) o.b;
            atth5.c = attg2.d;
            atth5.a |= 2;
        } else {
            atte atte4 = atte.DISCONNECTED;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atth atth6 = (atth) o.b;
            atth6.b = atte4.e;
            atth6.a |= 1;
        }
        return (atth) o.i();
    }

    /* access modifiers changed from: protected */
    public final IntentFilter c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        return intentFilter;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        a(cbi.i().a());
    }

    /* access modifiers changed from: protected */
    public final void a() {
        a(j(), cbi.i().a());
    }

    /* access modifiers changed from: protected */
    public final void a(long j) {
        super.a(j);
        this.l = null;
    }

    public final void a(Context context, Intent intent) {
        if (k.contains(intent.getAction())) {
            atth j = j();
            if (!g()) {
                ((anih) ((anih) bxk.a.c()).a("cef", "a", 95, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[NetworkStateProducer] No ongoing data. Inserting new context.");
                a(j, cbi.i().a());
                return;
            }
            atth atth = this.l;
            atte a = atte.a(j.b);
            if (a == null) {
                a = atte.UNKNOWN_STATE;
            }
            atte a2 = atte.a(atth.b);
            if (a2 == null) {
                a2 = atte.UNKNOWN_STATE;
            }
            if (a == a2) {
                ((anih) ((anih) bxk.a.c()).a("cef", "a", 103, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[NetworkStateProducer] No state change for network connection context");
                return;
            }
            long a3 = cbi.i().a();
            a(a3);
            a(j, a3 + 1);
        }
    }
}
