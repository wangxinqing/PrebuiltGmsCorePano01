package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;

/* renamed from: uor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uor extends urq {
    public final NsdServiceInfo a;
    private final Context b;
    private final ConnectivityManager c;
    private final thc d;
    private uox e;

    public uor(Context context, ConnectivityManager connectivityManager, thc thc, NsdServiceInfo nsdServiceInfo) {
        super(41);
        this.b = context;
        this.c = connectivityManager;
        this.d = thc;
        this.a = nsdServiceInfo;
    }

    public final void a() {
        uox uox = this.e;
        if (uox != null) {
            uox.b();
            this.e = null;
            return;
        }
        jjg jjg = ulh.a;
    }

    public final int b() {
        if (!uoz.a(this.c)) {
            ((anih) ((anih) ulh.a.d()).a("uor", "b", 932, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't advertise over the local area network because we're not connected over Wifi.");
            return 4;
        } else if (!jkr.g() || !uoz.c() || this.d == null) {
            ((anih) ((anih) ulh.a.d()).a("uor", "b", 939, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't advertise over the local area network because mDNS isn't available.");
            return 4;
        } else {
            Intent registerReceiver = this.b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.net.nsd.STATE_CHANGED"));
            if (registerReceiver == null || !"android.net.nsd.STATE_CHANGED".equals(registerReceiver.getAction()) || registerReceiver.getIntExtra("nsd_state", -1) != 2) {
                ((anih) ((anih) ulh.a.d()).a("uor", "b", 945, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't advertise over the local area network because NSD isn't enabled.");
                return 4;
            }
            uox uox = new uox(this.d, this.a);
            thc thc = uox.b;
            NsdServiceInfo nsdServiceInfo = uox.a;
            NsdManager nsdManager = thc.a;
            if (nsdManager != null) {
                try {
                    nsdManager.registerService(nsdServiceInfo, 1, uox);
                    if (!uox.a()) {
                        uox.b();
                        return 4;
                    }
                    this.e = uox;
                    return 2;
                } catch (IllegalArgumentException e2) {
                }
            } else {
                throw new RuntimeException("NsdManagerCompat.registerService can only be called on P+.");
            }
        }
    }
}
