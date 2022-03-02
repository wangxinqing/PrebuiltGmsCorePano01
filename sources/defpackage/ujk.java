package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.nearby.mediums.BluetoothClassic$AdvertisingOperation$1;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: ujk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ujk extends urq {
    public final Context a;
    public final BluetoothAdapter b;
    private final String c;
    private int d = -1;

    public ujk(Context context, BluetoothAdapter bluetoothAdapter, String str) {
        super(21);
        this.a = context;
        this.b = bluetoothAdapter;
        this.c = str;
    }

    private final void c() {
        if (!d(this.d)) {
            ((anih) ((anih) ulh.a.c()).a("ujk", "c", 801, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to restore original Bluetooth scan mode to %d", this.d);
        }
        this.d = -1;
    }

    private final boolean d(int i) {
        return arzk.a((Runnable) new ujj(this, i), "SetBluetoothScanMode", new arzi(aymi.a.a().x()).a());
    }

    private final boolean e(int i) {
        Context context;
        if (this.b.getScanMode() == i) {
            return true;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        BluetoothClassic$AdvertisingOperation$1 bluetoothClassic$AdvertisingOperation$1 = new BluetoothClassic$AdvertisingOperation$1("nearby", i, countDownLatch);
        this.a.registerReceiver(bluetoothClassic$AdvertisingOperation$1, new IntentFilter("android.bluetooth.adapter.action.SCAN_MODE_CHANGED"));
        try {
            if (((Boolean) tgf.a((Object) this.b).a("setScanMode", Integer.TYPE).a(Integer.valueOf(i))).booleanValue()) {
                try {
                    countDownLatch.await(aymi.l(), TimeUnit.SECONDS);
                    thp.a(this.a, (BroadcastReceiver) bluetoothClassic$AdvertisingOperation$1);
                    if (this.b.getScanMode() == i) {
                        return true;
                    }
                    ((anih) ((anih) ulh.a.b()).a("ujk", "e", 789, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Couldn't set scan mode to %d in %d seconds", i, aymi.l());
                    return false;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    ((anih) ((anih) ulh.a.b()).a("ujk", "e", 780, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while waiting to set Bluetooth scan mode to %d", i);
                    context = this.a;
                } catch (Throwable th) {
                    thp.a(this.a, (BroadcastReceiver) bluetoothClassic$AdvertisingOperation$1);
                    throw th;
                }
            } else {
                ((anih) ((anih) ulh.a.b()).a("ujk", "e", 760, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to set scan mode to %d", i);
                context = this.a;
                thp.a(context, (BroadcastReceiver) bluetoothClassic$AdvertisingOperation$1);
                return false;
            }
        } catch (tgg e2) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("ujk", "e", 764, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to use reflection to invoke setScanMode to %d", i);
            context = this.a;
        }
    }

    public final void a() {
        if (!d(this.d)) {
            ((anih) ((anih) ulh.a.c()).a("ujk", "c", 801, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to restore original Bluetooth scan mode to %d", this.d);
        }
        this.d = -1;
        upf.a().a(this.a, this.b);
    }

    public final int b() {
        if (upf.a().a(this.a, this.b, this.c)) {
            this.d = this.b.getScanMode();
            if (d(23)) {
                return 2;
            }
            this.d = -1;
            ((anih) ((anih) ulh.a.b()).a("ujk", "b", 679, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start Bluetooth Classic advertising because we couldn't set the scan mode to %d", 23);
            upf.a().a(this.a, this.b);
            return 4;
        }
        ((anih) ((anih) ulh.a.b()).a("ujk", "b", 671, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start Bluetooth Classic advertising because we couldn't set the device name to %s", (Object) this.c);
        return 4;
    }

    public final void a(PrintWriter printWriter) {
        String str;
        super.a(printWriter);
        Object[] objArr = new Object[1];
        int i = this.d;
        if (i == -1) {
            str = "UNINITIALIZED_SCAN_MODE";
        } else if (i == 23) {
            str = "SCAN_MODE_CONNECTABLE_DISCOVERABLE";
        } else if (i == 20) {
            str = "SCAN_MODE_NONE";
        } else if (i != 21) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Unrecognizable scan mode: ");
            sb.append(i);
            str = sb.toString();
        } else {
            str = "SCAN_MODE_CONNECTABLE";
        }
        objArr[0] = str;
        printWriter.write(String.format("    Scan Mode:%s\n", objArr));
        printWriter.write(String.format("    Device Name: %s\n", new Object[]{this.c}));
        printWriter.flush();
    }
}
