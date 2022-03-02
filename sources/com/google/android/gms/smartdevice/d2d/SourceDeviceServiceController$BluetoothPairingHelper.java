package com.google.android.gms.smartdevice.d2d;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SourceDeviceServiceController$BluetoothPairingHelper extends nla {
    public final Context a;
    public final IntentFilter b;

    public SourceDeviceServiceController$BluetoothPairingHelper(Context context) {
        super("smartdevice");
        this.a = context;
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST");
        this.b = intentFilter;
        intentFilter.addAction("android.bluetooth.device.action.CONNECTION_ACCESS_REQUEST");
        this.b.setPriority(999);
    }

    public final void a(Context context, Intent intent) {
        String action = intent.getAction();
        iwd iwd = abra.a;
        String valueOf = String.valueOf(action);
        iwd.b(valueOf.length() == 0 ? new String("Bluetooth pairing intent received: ") : "Bluetooth pairing intent received: ".concat(valueOf), new Object[0]);
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if ("android.bluetooth.device.action.PAIRING_REQUEST".equals(action)) {
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", Integer.MIN_VALUE);
            iwd iwd2 = abra.a;
            StringBuilder sb = new StringBuilder(54);
            sb.append("Processing Action Paring Request with type ");
            sb.append(intExtra);
            iwd2.b(sb.toString(), new Object[0]);
            if (intExtra == 2 || intExtra == 3) {
                bluetoothDevice.setPairingConfirmation(true);
                iwd iwd3 = abra.a;
                String valueOf2 = String.valueOf(bluetoothDevice.getName());
                iwd3.b(valueOf2.length() == 0 ? new String("Connection confirmed for ") : "Connection confirmed for ".concat(valueOf2), new Object[0]);
                abortBroadcast();
            }
        }
    }
}
