package com.google.android.gms.nearby.discovery.fastpair.autotest;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AutoTestBroadcastReceiver extends nla {
    public static final anax a = anax.a("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_DELETE_LOCAL_CACHE", "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_AUTO_TEST_SETUP", "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_AUTO_TEST_TEAR_DOWN", "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_AUTO_CONSENT", "android.bluetooth.device.action.PAIRING_REQUEST");
    public final arwg b;
    public final Context c;
    public long d;

    public AutoTestBroadcastReceiver(Context context) {
        super("nearby");
        this.c = context;
        this.b = (arwg) thl.a(context, arwg.class);
    }

    public final void a(Context context, Intent intent) {
        if (!aymw.W()) {
            ((anih) tsp.a.c()).a("FastPairAutoTestReceiver: SupportAutoTest not enabled, don't do doReceive!");
        } else if ("android.bluetooth.device.action.PAIRING_REQUEST".equals(intent.getAction())) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.d;
            if (elapsedRealtime >= 20000) {
                ((anih) tsp.a.c()).a("FastPairAutoTestReceiver: Can't do auto consent because already timeout for %d ms.", elapsedRealtime);
                return;
            }
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice != null) {
                int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", -1);
                if (intExtra != 3) {
                    ((anih) tsp.a.c()).a("FastPairAutoTestReceiver: Pairing variant is %d, ignore.", intExtra);
                    return;
                }
                abortBroadcast();
                bluetoothDevice.setPairingConfirmation(true);
                ((anih) tsp.a.c()).a("FastPairAutoTestReceiver: Auto consent for device %s.", (Object) bluetoothDevice.getAddress());
            }
        } else if (a.contains(intent.getAction())) {
            this.b.c(new twx(this, "fastPairAutoTestBroadcastReceiver", intent));
        }
    }
}
