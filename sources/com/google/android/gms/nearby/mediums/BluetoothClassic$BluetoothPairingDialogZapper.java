package com.google.android.gms.nearby.mediums;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BluetoothClassic$BluetoothPairingDialogZapper extends nla {
    private final Context a;
    private final IntentFilter b;
    private int c = 0;

    public BluetoothClassic$BluetoothPairingDialogZapper(Context context) {
        super("nearby");
        this.a = context;
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST");
        this.b = intentFilter;
        intentFilter.addAction("android.bluetooth.device.action.CONNECTION_ACCESS_REQUEST");
        this.b.setPriority(999);
    }

    public final synchronized void a() {
        if (aymi.M()) {
            if (this.c == 0) {
                this.a.registerReceiver(this, this.b);
            }
            this.c++;
        }
    }

    public final synchronized void b() {
        if (aymi.M()) {
            int i = this.c - 1;
            this.c = i;
            if (i == 0) {
                thp.a(this.a, (BroadcastReceiver) this);
            }
        }
    }

    public final void a(Context context, Intent intent) {
        String action = intent.getAction();
        ((anih) ((anih) ulh.a.d()).a("com.google.android.gms.nearby.mediums.BluetoothClassic$BluetoothPairingDialogZapper", "a", 619, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Bluetooth Classic pairing intent received: %s", (Object) action);
        if ("android.bluetooth.device.action.PAIRING_REQUEST".equals(action)) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", Integer.MIN_VALUE);
            if (intExtra == 2 || intExtra == 3) {
                bluetoothDevice.setPairingConfirmation(true);
                ((anih) ((anih) ulh.a.d()).a("com.google.android.gms.nearby.mediums.BluetoothClassic$BluetoothPairingDialogZapper", "a", 628, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Intercepted and confirmed Bluetooth Classic pairing dialog for %s", (Object) bluetoothDevice.getName());
                abortBroadcast();
            }
        }
    }
}
