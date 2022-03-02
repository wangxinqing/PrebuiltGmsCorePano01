package defpackage;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: nky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nky {
    public static synchronized void a(aghw aghw, boolean z) {
        amsv amsv;
        ExecutorService executorService;
        float f;
        synchronized (nky.class) {
            nks nks = new nks(aghw, z);
            boolean z2 = true;
            if (!nks.b) {
                amsv = amta.a((Object) nku.a);
            } else {
                amlb amlb = new amlb();
                if (axda.a.a().R()) {
                    executorService = Executors.newSingleThreadExecutor(nkp.a);
                } else {
                    executorService = jfb.a(5, 10);
                }
                amlb.a = executorService;
                amlb.b = jfm.a(1, 10);
                amlb.d = true;
                amlb.f = amlp.a();
                amlb.g = amri.b(100);
                amlb.h = nks.e;
                amlq amlq = new amlq();
                if (!nks.d) {
                    f = ((float) axda.a.a().c()) * 0.001f;
                } else {
                    f = 1.0f;
                }
                amlq.a = f;
                amlb.e = amlq;
                if (nks.a.a()) {
                    amlb.a(new amma(new nkq(nks), amlp.a()));
                }
                if (nks.c) {
                    int i = aekp.a;
                    nkl nkl = new nkl(new Random());
                    nkl.a((int) axda.a.a().E(), (int) axda.a.a().D());
                    amlb.a(nkl);
                }
                amsv = amta.a((Object) amlb.a());
            }
            nku.a(amsv);
            if (nks.b) {
                njq njq = njp.a;
                if (axda.a.a().N()) {
                    if (!njq.a) {
                        ihs b = ihs.b();
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                        intentFilter.addAction("android.intent.action.SCREEN_OFF");
                        intentFilter.addAction("android.intent.action.SCREEN_ON");
                        intentFilter.addAction("android.intent.action.BATTERY_LOW");
                        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                        if (jkr.b()) {
                            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                        b.registerReceiver(njq, intentFilter);
                        Intent registerReceiver = b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                        if (registerReceiver != null) {
                            njq.b = Boolean.valueOf(registerReceiver.getIntExtra("plugged", 0) > 0);
                            njq.d = Boolean.valueOf(registerReceiver.getBooleanExtra("battery_low", false));
                        }
                        PowerManager powerManager = (PowerManager) b.getSystemService("power");
                        if (powerManager != null) {
                            njq.c = Boolean.valueOf(jiy.a(powerManager));
                        }
                        njq.e = njq.a(b);
                        njq.f = njq.b(b);
                        njq.a = true;
                    } else {
                        throw new IllegalStateException("DeviceStateMonitor initialized more than once.");
                    }
                }
            }
            if (axda.a.a().I()) {
                int i3 = aekp.a;
                nkk nkk = new nkk(jfm.b(10), new Random(), (int) axda.a.a().K(), (int) axda.a.a().J(), new ixy((int) axda.a.a().L(), 5, 5));
                if (nkf.b != nkf.a) {
                    z2 = false;
                }
                amrl.b(z2, (Object) "already initialized");
                nkf.b = nkk;
            }
        }
    }
}
