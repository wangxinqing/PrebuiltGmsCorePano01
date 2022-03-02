package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.location.quake.PowerStateListener$PowerBroadcastReceiver;

/* renamed from: ajdg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajdg extends ajgo {
    public static final /* synthetic */ int c = 0;
    private static final IntentFilter d = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    public Handler a;
    public Runnable b;
    private final Context e;
    private final HandlerThread f;
    private BroadcastReceiver h;

    static {
        iyc iyc = iyc.UNKNOWN;
    }

    public ajdg(Context context, HandlerThread handlerThread, ajgd ajgd) {
        super(ajgd);
        this.e = context;
        this.f = handlerThread;
    }

    static int a(Context context) {
        return a(context.registerReceiver((BroadcastReceiver) null, d));
    }

    public final synchronized void b() {
        if (this.h == null) {
            this.h = new PowerStateListener$PowerBroadcastReceiver(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            this.e.registerReceiver(this.h, intentFilter);
            this.g.a();
        }
        this.a = new qvr(this.f.getLooper());
        ajdf ajdf = new ajdf(this);
        this.b = ajdf;
        this.a.postDelayed(ajdf, ayek.v());
    }

    public final synchronized void c() {
        BroadcastReceiver broadcastReceiver = this.h;
        if (broadcastReceiver != null) {
            this.e.unregisterReceiver(broadcastReceiver);
            this.h = null;
        }
        Handler handler = this.a;
        if (handler != null) {
            Runnable runnable = this.b;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
                this.b = null;
            }
            this.a = null;
        }
    }

    private static int a(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", 0);
            int intExtra2 = intent.getIntExtra("scale", 0);
            if (intExtra2 != 0) {
                return (intExtra * 100) / intExtra2;
            }
        }
        return 0;
    }

    public final int a() {
        int intExtra;
        Intent registerReceiver = this.e.registerReceiver((BroadcastReceiver) null, d);
        if (registerReceiver == null || (((intExtra = registerReceiver.getIntExtra("plugged", -1)) != 1 && intExtra != 2) || ((long) a(registerReceiver)) < ayek.a.a().seismicMinBatteryPercent())) {
            return 2;
        }
        return 3;
    }
}
