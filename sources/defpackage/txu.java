package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;

/* renamed from: txu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class txu implements txy {
    private static final void a(Context context, BluetoothDevice bluetoothDevice, boolean z) {
        bluetoothDevice.setSilenceMode(z);
        String address = bluetoothDevice.getAddress();
        if (aein.a(context)) {
            ((anih) ((anih) aehd.a.d()).a("aein", "a", 76, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Send silent mode to validator");
            context.sendBroadcast(new Intent("com.google.android.libraries.bluetooth.fastpair.action.SILENT_STATE_CHANGE").setPackage("com.google.location.nearby.apps.fastpair.validator").putExtra("com.google.android.gms.nearby.discovery.PUBLIC_ADDRESS", address).putExtra("com.google.android.gms.nearby.discovery.EXTRA_SILENT_STATE", z));
            return;
        }
        anil anil = aehd.a;
    }

    public final void a(Context context, BluetoothDevice bluetoothDevice) {
        if (!arxk.a()) {
            ((anih) tsp.a.c()).a("BluetoothEventGroupListener: onDisconnect: not un-silencing due to bt disabled.");
        } else if (jkr.h()) {
            ((anih) tsp.a.d()).a("BluetoothEventGroupListener: onDisconnect: Un-silencing bluetooth device: %s", (Object) bluetoothDevice.getAddress());
            a(context, bluetoothDevice, false);
        }
    }

    public final void a(Context context, BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        if (i != 1) {
            if (i == 2 && jkr.h() && aymw.V()) {
                ((anih) tsp.a.d()).a("BluetoothEventGroupListener: onEvent: Un-silencing bluetooth device: %s", (Object) bluetoothDevice.getAddress());
                a(context, bluetoothDevice, false);
            }
        } else if (jkr.h() && aymw.V()) {
            ((anih) tsp.a.d()).a("BluetoothEventGroupListener: onEvent: Silencing bluetooth device: %s", (Object) bluetoothDevice.getAddress());
            a(context, bluetoothDevice, true);
        }
    }
}
