package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;

/* renamed from: ltx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ltx extends lut {
    final /* synthetic */ String a;
    final /* synthetic */ BluetoothDevice b;
    final /* synthetic */ boolean c;
    final /* synthetic */ lty d;

    public ltx(lty lty, String str, BluetoothDevice bluetoothDevice, boolean z) {
        this.d = lty;
        this.a = str;
        this.b = bluetoothDevice;
        this.c = z;
    }

    public final void a() {
        lty lty = this.d;
        String str = this.a;
        BluetoothDevice bluetoothDevice = this.b;
        boolean z = this.c;
        if (!"android.bluetooth.device.action.ACL_CONNECTED".equals(str)) {
            if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(str) && lty.d.c() && lty.d.a(ltn.a(bluetoothDevice))) {
                String valueOf = String.valueOf(bluetoothDevice.getName());
                Log.i("CAR.DRIVINGMODE", valueOf.length() == 0 ? new String("Driving mode stopped by device: ") : "Driving mode stopped by device: ".concat(valueOf));
                lty.c.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_DISCONNECTED);
                if (!lty.d.b()) {
                    lty.b();
                } else if (!lty.d.b(lxg.BLUETOOTH)) {
                    lty.c.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_DISCONNECT_IGNORED);
                }
                lty.a();
            }
        } else if (lty.d.c() && lty.d.a(ltn.a(bluetoothDevice))) {
            lty.c.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_CONNECTED);
            if (z) {
                luj a2 = lty.d.a();
                if (a2.c() == 2) {
                    ComponentName b2 = a2.b(lty.a);
                    if (b2 == null) {
                        Log.w("CAR.DRIVINGMODE", "Invalid component name, dropping request to send intent.");
                        lty.c.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_CANNOT_RESOLVE_APP_LAUNCH_INTENT);
                        return;
                    }
                    lty.a.startActivity(new Intent("android.intent.action.MAIN").addCategory("com.google.android.gms.car.drivingMode.category.DEFAULT").setComponent(b2).putExtra("com.google.android.gms.car.drivingMode", "BLUETOOTH_CONNECTED").putExtra("android.bluetooth.device.extra.DEVICE", bluetoothDevice).addFlags(268435456));
                    lty.c.a(anxu.DRIVING_MODE, anxt.DRIVING_MODE_AUTOLAUNCH_BLUETOOTH_CONNECTED_WIRELESS);
                }
            }
            String valueOf2 = String.valueOf(bluetoothDevice.getName());
            Log.i("CAR.DRIVINGMODE", valueOf2.length() == 0 ? new String("Auto-launch started by device: ") : "Auto-launch started by device: ".concat(valueOf2));
            lty.a(lxg.BLUETOOTH);
        }
    }
}
