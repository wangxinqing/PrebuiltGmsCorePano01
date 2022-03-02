package com.google.android.gms.nearby.bootstrap;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BluetoothScanner$1 extends nla {
    final /* synthetic */ tcu a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothScanner$1(tcu tcu, String str) {
        super(str);
        this.a = tcu;
    }

    public final void a(Context context, Intent intent) {
        char charAt;
        String action = intent.getAction();
        if ("android.bluetooth.device.action.FOUND".equals(action) || "android.bluetooth.device.action.NAME_CHANGED".equals(action)) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            String stringExtra = intent.getStringExtra("android.bluetooth.device.extra.NAME");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = bluetoothDevice.getName();
            }
            if (!TextUtils.isEmpty(stringExtra)) {
                try {
                    int indexOf = stringExtra.indexOf("[");
                    int indexOf2 = stringExtra.indexOf("]");
                    if (indexOf == 0 && indexOf2 > 0 && (charAt = stringExtra.charAt(indexOf2 + 1)) <= '4' && charAt >= '0') {
                        String address = bluetoothDevice.getAddress();
                        Device device = new Device(tcv.a(stringExtra), tcv.b(stringExtra), address, tcv.c(stringExtra));
                        tcu tcu = this.a;
                        anil anil = tcu.a;
                        tcu.c.put(address, bluetoothDevice);
                        if (this.a.b()) {
                            tcu tcu2 = this.a;
                            tcu2.e.a(6, (tdh) tcu2);
                            this.a.b.a(device);
                        }
                    }
                } catch (RemoteException | NullPointerException e) {
                    anih anih = (anih) tcu.a.c();
                    anih.a(e);
                    ((anih) anih.a("com.google.android.gms.nearby.bootstrap.BluetoothScanner$1", "a", 131, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothScanner: Fail to send scan result to listener.");
                }
            }
        } else if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(action)) {
            this.a.a();
        }
    }
}
