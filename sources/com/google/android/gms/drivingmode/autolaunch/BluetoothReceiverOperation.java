package com.google.android.gms.drivingmode.autolaunch;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BluetoothReceiverOperation extends IntentOperation {
    private final void a(String str, BluetoothDevice bluetoothDevice) {
        Intent intent = new Intent(str);
        intent.putExtra("android.bluetooth.device.extra.DEVICE", bluetoothDevice);
        intent.setComponent(lto.b);
        startService(intent);
    }

    public final void onHandleIntent(Intent intent) {
        BluetoothDevice bluetoothDevice;
        if (awqd.d() && awqm.b() && (bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) != null) {
            String action = intent.getAction();
            int i = -1;
            if ("android.bluetooth.device.action.ACL_CONNECTED".equals(action)) {
                i = 2;
            } else if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(action)) {
                i = 0;
            } else if ("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED".equals(action)) {
                i = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
            }
            if (i == 2) {
                a("android.bluetooth.device.action.ACL_CONNECTED", bluetoothDevice);
            } else if (i == 0) {
                a("android.bluetooth.device.action.ACL_DISCONNECTED", bluetoothDevice);
            }
        }
    }
}
