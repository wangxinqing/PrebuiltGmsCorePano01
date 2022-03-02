package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.utils.bluetooth.BluetoothController$1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: acqi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acqi {
    public static final /* synthetic */ int b = 0;
    private static final iwd c = acqa.a("Utils", "Bluetooth", "BluetoothController");
    public final acqg a;
    private final Context d;
    private boolean e = false;

    public static void a(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException e2) {
            c.a((Throwable) e2);
        }
    }

    public final void b() {
        acqg acqg = this.a;
        if (acqg != null && this.e) {
            this.e = false;
            acqg.e();
        }
    }

    public acqi(Context context, acqg acqg) {
        this.d = context;
        this.a = acqg;
    }

    public final Status a() {
        acqg acqg = this.a;
        if (acqg == null) {
            this.e = false;
            c.e("btAdapter was null: Bluetooth unavailable.", new Object[0]);
            return new Status(10550);
        } else if (acqg.b()) {
            return Status.a;
        } else {
            this.e = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            BluetoothController$1 bluetoothController$1 = new BluetoothController$1(this, "smartdevice", countDownLatch);
            this.d.registerReceiver(bluetoothController$1, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            if (this.a.c()) {
                try {
                    if (countDownLatch.await(10, TimeUnit.SECONDS)) {
                        if (this.a.b()) {
                            return Status.a;
                        }
                        return new Status(10550);
                    }
                } catch (InterruptedException e2) {
                    c.a("Interrupted", e2, new Object[0]);
                }
                c.a("Bluetooth initialization took longer than %d seconds", 10);
                a(this.d, bluetoothController$1);
                return new Status(10550);
            }
            a(this.d, bluetoothController$1);
            return new Status(10550);
        }
    }
}
