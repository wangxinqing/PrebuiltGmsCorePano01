package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

/* renamed from: ukc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ukc extends urq {
    private final Context a;
    private final BluetoothManager b;
    private final aejh c;
    private aejs d;

    public ukc(Context context, BluetoothManager bluetoothManager, aejh aejh) {
        super(34);
        this.a = context;
        this.b = bluetoothManager;
        this.c = aejh;
    }

    public final void a() {
        aejs aejs = this.d;
        if (aejs != null) {
            synchronized (aejs.c) {
                aeka aeka = aejs.j;
                if (aeka != null) {
                    aeka.a();
                    aejs.j = null;
                }
            }
            this.d = null;
            ukz.e();
            return;
        }
        jjg jjg = ulh.a;
    }

    public final int b() {
        aejs aejs = new aejs(this.a, new aekd(this.b));
        try {
            aejh aejh = this.c;
            synchronized (aejs.c) {
                amrl.b(aejs.j == null, (Object) "Gatt server is already open.");
                aeka a2 = aeka.a(aejs.g.a.openGattServer(aejs.f, aejs.d.b));
                if (a2 != null) {
                    try {
                        ArrayList<BluetoothGattService> arrayList = new ArrayList<>();
                        for (Map.Entry entry : aejh.a.entrySet()) {
                            UUID uuid = (UUID) entry.getKey();
                            aejg aejg = (aejg) entry.getValue();
                            if (uuid == null || aejg == null) {
                                throw new IllegalStateException();
                            }
                            BluetoothGattService bluetoothGattService = new BluetoothGattService(uuid, 0);
                            for (Map.Entry key : aejg.a.entrySet()) {
                                BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) key.getKey();
                                if (bluetoothGattCharacteristic != null) {
                                    bluetoothGattService.addCharacteristic(bluetoothGattCharacteristic);
                                } else {
                                    throw new IllegalStateException();
                                }
                            }
                            arrayList.add(bluetoothGattService);
                        }
                        for (BluetoothGattService bluetoothGattService2 : arrayList) {
                            if (bluetoothGattService2 != null) {
                                aejs.e.b((aekj) new aejo(new Object[]{aejr.ADD_SERVICE, bluetoothGattService2}, a2, bluetoothGattService2), aejs.b);
                            }
                        }
                        aejs.j = a2;
                        aejs.i = aejh;
                    } catch (BluetoothException e) {
                        a2.a();
                        throw e;
                    }
                } else {
                    throw new BluetoothException("Failed to open the GATT server, openGattServer returned null.");
                }
            }
            this.d = aejs;
            ukz.e();
            return 2;
        } catch (BluetoothException e2) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("ukc", "b", 2170, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to start an advertisement GATT server due to a Bluetooth exception.");
            return 4;
        }
    }
}
