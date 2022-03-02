package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.gms.nearby.discovery.fastpair.CompanionAppInstallChimeraActivity;
import com.google.android.gms.nearby.discovery.fastpair.FastPairNotificationManager$1;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.util.concurrent.TimeUnit;

/* renamed from: tvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tvo {
    static final int b = (-1698320164 - 1);
    public static final int c = (-1698320164 - 2);
    private static int h = 0;
    private static int i = ((int) SystemClock.elapsedRealtime());
    private static final int j = -1698320164;
    public final int a;
    public final Context d;
    public final ttg e;
    public final boolean f;
    public final tsu g;
    private final int k;
    private final jfc l = jfm.a(1, 10);

    public tvo(Context context, ttg ttg, boolean z) {
        int i2;
        this.d = context;
        this.e = ttg;
        this.f = z;
        this.a = j + h;
        if (aymw.L()) {
            i2 = b;
        } else {
            i2 = this.a;
        }
        this.k = i2;
        this.g = (tsu) thl.a(context, tsu.class);
        h++;
    }

    private final PendingIntent a(boolean z, Intent intent, asom asom, String str) {
        Intent putExtra = a("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_PAIRED_NOTIFICATION_DISMISSED").putExtra("com.google.android.gms.nearby.discovery:EXTRA_SUCCESS", z).putExtra("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ID", this.a);
        if (intent != null) {
            putExtra.putExtra("com.google.android.gms.nearby.discovery:EXTRA_PENDING_INTENT", b(intent));
            putExtra.putExtra("com.google.android.gms.nearby.discovery.EXTRA_URL", intent.toUri(1));
            putExtra.putExtra("com.google.android.gms.nearby.discovery.EXTRA_PRIORITY", udl.a("DEVICES_WITHIN_REACH_REBRANDED"));
        }
        putExtra.putExtra("com.google.android.gms.nearby.discovery.EXTRA_LOG_EVENT", asom.bt).putExtra("com.google.android.gms.nearby.discovery.EXTRA_TRIGGER_ID", this.e.G()).putExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP", (String) amri.c(str).a((Object) ""));
        return a(putExtra);
    }

    private final boolean b(String str) {
        return b(str, (String) null) != null;
    }

    public final String c() {
        return this.e.k();
    }

    public final PendingIntent b(Intent intent) {
        Context context = this.d;
        int i2 = i;
        i = i2 + 1;
        return PendingIntent.getActivity(context, i2, intent, JGCastService.FLAG_PRIVATE_DISPLAY);
    }

    public final Intent b(String str, String str2) {
        Intent launchIntentForPackage = this.d.getPackageManager().getLaunchIntentForPackage(str);
        if (aymw.e() && str2 != null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (!(launchIntentForPackage == null || defaultAdapter == null)) {
                launchIntentForPackage.putExtra("android.bluetooth.device.extra.DEVICE", defaultAdapter.getRemoteDevice(str2));
            }
        }
        return launchIntentForPackage;
    }

    public tvo(Context context, ttg ttg, boolean z, int i2) {
        this.d = context;
        this.e = ttg;
        this.f = z;
        this.a = i2;
        this.k = aymw.L() ? b : i2;
        this.g = (tsu) thl.a(context, tsu.class);
    }

    public final udg b() {
        udg twb = this.f ? new twb(this.d, this.e.q()) : new udg(this.d);
        twb.a("DEVICES_WITHIN_REACH_REBRANDED");
        twb.d(true);
        twb.b(udc.a(this.d));
        twb.a(aryg.a(this.d, this.e.A()));
        twb.b(false);
        twb.d();
        twb.a(true);
        twb.u = kf.b(this.d, R.color.discovery_activity_accent);
        return twb;
    }

    private final Intent a(String str) {
        return DiscoveryChimeraService.a(this.d).setAction(str).putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", this.e.i());
    }

    public final PendingIntent a(Intent intent) {
        Context context = this.d;
        int i2 = i;
        i = i2 + 1;
        return PendingIntent.getService(context, i2, intent, JGCastService.FLAG_PRIVATE_DISPLAY);
    }

    public final PendingIntent a(boolean z, Intent intent) {
        return a(z, intent, asom.UNKNOWN_DISCOVERY_EVENT, "");
    }

    public final Intent a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (b(str)) {
            return b(str, str2);
        }
        if (aymw.a.a().l()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            FastPairNotificationManager$1 fastPairNotificationManager$1 = new FastPairNotificationManager$1(this, "trackCompanionAppInstall", str, str2);
            this.d.registerReceiver(fastPairNotificationManager$1, intentFilter);
            if (aymz.b()) {
                ((arwg) thl.a(this.d, arwg.class)).a(new tvn(this, "unregisterCompanionAppRunnable", fastPairNotificationManager$1), TimeUnit.MINUTES.toMillis(aymt.a.a().bc()));
            }
        }
        return CompanionAppInstallChimeraActivity.a(this.d, str);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        a(this.k);
    }

    public final void a(int i2) {
        ((anih) tsp.a.d()).a("FastPair: Canceling notification %s", i2);
        ((thb) thl.a(this.d, thb.class)).a(i2);
        try {
            a(true, (Intent) null).send();
        } catch (PendingIntent.CanceledException e2) {
            anih anih = (anih) tsp.a.b();
            anih.a((Throwable) e2);
            anih.a("FastPair: Finished PendingIntent unexpectedly canceled.");
        }
    }

    public final void a(Notification notification, int i2) {
        ((anih) tsp.a.d()).a("FastPair: Showing notification %s", i2);
        thb thb = (thb) thl.a(this.d, thb.class);
        if (Build.VERSION.SDK_INT == 28) {
            ((arwg) thl.a(this.d, arwg.class)).c().postDelayed(new tvm(thb, i2, notification), aymt.a.a().K());
        } else {
            thb.a(i2, notification);
        }
    }

    public final void a(String str, int i2, String str2, String str3) {
        String str4;
        String str5;
        ((udk) thl.a(this.d, udk.class)).a();
        ((anih) tsp.a.d()).a("FastPair: Showing pairing succeeded notification, companion app: %s, battery: %s", (Object) str, i2);
        ((thb) thl.a(this.d, thb.class)).a(this.a);
        asom asom = asom.UNKNOWN_DISCOVERY_EVENT;
        if (TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(c());
            if (i2 >= 0 && i2 <= 100) {
                sb.append("\n");
                sb.append(this.d.getString(R.string.common_battery_level, new Object[]{Integer.valueOf(i2)}));
            }
            str4 = sb.toString();
        } else if (b(str)) {
            str4 = this.d.getString(R.string.fast_pair_open_companion_app);
            asom = asom.FAST_PAIR_POST_ACTION_LAUNCH_COMPANION_APP;
        } else if (!aymw.a.a().aQ() || b(str) || !tvq.a(str, this.d)) {
            str4 = this.d.getString(R.string.fast_pair_download_app_description);
            asom = asom.FAST_PAIR_POST_ACTION_INSTALL_COMPANION_APP;
        } else {
            str4 = this.d.getString(R.string.fast_pair_update_companion_app);
        }
        Intent a2 = a(str, str3);
        if (str2 == null) {
            str5 = this.d.getString(R.string.fast_pair_device_ready);
        } else {
            str5 = this.d.getString(R.string.fast_pair_device_ready_with_device_name, new Object[]{str2});
        }
        udg b2 = b();
        b2.b(str5);
        b2.s = "status";
        b2.e(str5);
        b2.b((CharSequence) str4);
        b2.a(a(true, a2, asom, str));
        b2.b(a(true, (Intent) null, asom.FAST_PAIR_POST_ACTION_DISMISS_COMPANION_APP, str));
        a(b2.b(), this.k);
        this.g.a(asom.FAST_PAIR_POST_ACTION_NOTIFICATION_SHOWN, this.e.G(), (String) amri.c(str).a((Object) ""));
        if (TextUtils.isEmpty(str)) {
            this.l.a((Runnable) new tvl(this), aymt.a.a().be(), TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, Intent intent) {
        tso tso = (tso) thl.a(this.d, tso.class);
        String a2 = tso.a("fast_pair_retroactive_save_device_description", str);
        udg b2 = b();
        b2.b(a2);
        b2.s = "recommendation";
        b2.e(tso.a("fast_pair_retroactive_save_device_title", this.e.k()));
        b2.b((CharSequence) a2);
        b2.a(a(intent));
        a(b2.b(), this.a);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z, boolean z2, String str, String str2) {
        if (aymw.S() || z2) {
            try {
                Intent putExtra = a("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_PAIRING_PROCESS_DONE").putExtra("com.google.android.gms.nearby.discovery:EXTRA_SUCCESS", z).putExtra("com.google.android.gms.nearby.discovery:EXTRA_PRIVATE_BLE_ADDRESS", str).putExtra("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ID", this.a);
                if (str2 != null) {
                    putExtra.putExtra("com.google.android.gms.nearby.discovery:EXTRA_PUBLIC_ADDRESS", str2);
                }
                this.d.startService(putExtra);
                jjg jjg = tsp.a;
            } catch (IllegalStateException | SecurityException e2) {
                anih anih = (anih) tsp.a.b();
                anih.a(e2);
                anih.a("FastPair: failed to send ACTION_FAST_PAIR_PAIRING_PROCESS_DONE.");
            }
        }
    }
}
