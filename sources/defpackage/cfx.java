package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import java.util.Set;

/* renamed from: cfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cfx extends ccy {
    public static final ccj b = new ccj(new cfw(), "WifiConnectionStateProducer", new int[]{91}, (int[]) null);
    protected final WifiManager k;
    private atvb l;
    private final Set m = anax.a((Object) "android.net.conn.CONNECTIVITY_CHANGE", (Object) "android.net.wifi.STATE_CHANGE");

    public cfx(Context context, bsz bsz, String str, but but) {
        super(context, bsz, b, str, but);
        a(91);
        this.k = (WifiManager) this.d.getSystemService("wifi");
    }

    private final void a(atvb atvb, long j) {
        this.l = atvb;
        jti jti = new jti(7, 91, 1);
        jti.a(jut.b(j));
        jti.a(atvb.d, this.l);
        d(jti.a());
    }

    private final atvb j() {
        WifiInfo connectionInfo;
        aucd o = atvb.c.o();
        WifiManager wifiManager = this.k;
        if (wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null && !TextUtils.isEmpty(connectionInfo.getBSSID()) && !TextUtils.isEmpty(connectionInfo.getSSID())) {
            String replaceAll = connectionInfo.getSSID().replaceAll("^\"(.*)\"$", "$1");
            if (replaceAll.equals("<unknown ssid>")) {
                ((anih) ((anih) bxk.a.d()).a("cfx", "j", 146, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[WifiConnectionStateProducer] Got <unknown ssid>. Dropping state.");
                return null;
            } else if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                aucd o2 = atva.d.o();
                String bssid = connectionInfo.getBSSID();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                atva atva = (atva) o2.b;
                bssid.getClass();
                int i = atva.a | 1;
                atva.a = i;
                atva.b = bssid;
                replaceAll.getClass();
                atva.a = i | 2;
                atva.c = replaceAll;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atvb atvb = (atvb) o.b;
                atva atva2 = (atva) o2.i();
                atva2.getClass();
                atvb.b = atva2;
                atvb.a |= 1;
            }
        }
        return (atvb) o.i();
    }

    /* access modifiers changed from: protected */
    public final IntentFilter c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
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
        atvb j;
        if (this.m.contains(intent.getAction()) && (j = j()) != null) {
            if (!g()) {
                ((anih) ((anih) bxk.a.d()).a("cfx", "a", 102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[WifiConnectionStateProducer] No ongoing data. Inserting new context.");
                a(j, cbi.i().a());
                return;
            }
            atvb atvb = this.l;
            if (atvb != null) {
                atva atva = j.b;
                if (atva == null) {
                    atva = atva.d;
                }
                String str = atva.b;
                atva atva2 = atvb.b;
                if (atva2 == null) {
                    atva2 = atva.d;
                }
                if (str.equals(atva2.b)) {
                    ((anih) ((anih) bxk.a.d()).a("cfx", "a", 108, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[WifiConnectionStateProducer] No state change for wifi state context");
                    return;
                }
            }
            long a = cbi.i().a();
            a(a);
            a(j, a + 1);
        }
    }
}
