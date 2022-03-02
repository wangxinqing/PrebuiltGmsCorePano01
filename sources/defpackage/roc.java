package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.location.LocationManager;

/* renamed from: roc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class roc extends rny {
    private final BroadcastReceiver i = new rob(this);

    public roc(Context context, rns rns) {
        super(context, rns);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.a.registerReceiver(this.i, new IntentFilter("android.location.PROVIDERS_CHANGED"));
        LocationManager locationManager = (LocationManager) this.a.getSystemService(LocationManager.class);
        for (String next : locationManager.getAllProviders()) {
            if (locationManager.isProviderEnabled(next)) {
                a(next, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.a.unregisterReceiver(this.i);
    }
}
