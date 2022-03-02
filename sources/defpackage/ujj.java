package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.nearby.mediums.BluetoothClassic$AdvertisingOperation$1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: ujj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ujj implements Runnable {
    private final ujk a;
    private final int b;

    public ujj(ujk ujk, int i) {
        this.a = ujk;
        this.b = i;
    }

    public final void run() {
        Context context;
        ujk ujk = this.a;
        int i = this.b;
        if (ujk.b.getScanMode() != i) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            BluetoothClassic$AdvertisingOperation$1 bluetoothClassic$AdvertisingOperation$1 = new BluetoothClassic$AdvertisingOperation$1("nearby", i, countDownLatch);
            ujk.a.registerReceiver(bluetoothClassic$AdvertisingOperation$1, new IntentFilter("android.bluetooth.adapter.action.SCAN_MODE_CHANGED"));
            try {
                if (((Boolean) tgf.a((Object) ujk.b).a("setScanMode", Integer.TYPE).a(Integer.valueOf(i))).booleanValue()) {
                    try {
                        countDownLatch.await(aymi.l(), TimeUnit.SECONDS);
                        thp.a(ujk.a, (BroadcastReceiver) bluetoothClassic$AdvertisingOperation$1);
                        if (ujk.b.getScanMode() != i) {
                            ((anih) ((anih) ulh.a.b()).a("ujk", "e", 789, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Couldn't set scan mode to %d in %d seconds", i, aymi.l());
                            throw new RuntimeException(String.format("Failed to set Bluetooth scan mode to %s", new Object[]{Integer.valueOf(i)}));
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        ((anih) ((anih) ulh.a.b()).a("ujk", "e", 780, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while waiting to set Bluetooth scan mode to %d", i);
                        context = ujk.a;
                    } catch (Throwable th) {
                        thp.a(ujk.a, (BroadcastReceiver) bluetoothClassic$AdvertisingOperation$1);
                        throw th;
                    }
                } else {
                    ((anih) ((anih) ulh.a.b()).a("ujk", "e", 760, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to set scan mode to %d", i);
                    context = ujk.a;
                    thp.a(context, (BroadcastReceiver) bluetoothClassic$AdvertisingOperation$1);
                    throw new RuntimeException(String.format("Failed to set Bluetooth scan mode to %s", new Object[]{Integer.valueOf(i)}));
                }
            } catch (tgg e2) {
                anih anih = (anih) ulh.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("ujk", "e", 764, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to use reflection to invoke setScanMode to %d", i);
                context = ujk.a;
            }
        }
    }
}
