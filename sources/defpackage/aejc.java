package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.util.Log;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.util.List;
import java.util.Locale;

/* renamed from: aejc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aejc extends aejz {
    final /* synthetic */ aejf a;

    public aejc(aejf aejf) {
        this.a = aejf;
    }

    public final void a(aejx aejx, int i) {
        aejf aejf = this.a;
        String str = aejf.a;
        aejf.e.a(new aekj(aeje.DISCOVER_SERVICES_INTERNAL, aejx), i);
    }

    public final void b(aejx aejx, int i) {
        aejf aejf = this.a;
        String str = aejf.a;
        aejf.e.a(new aekj(aeje.WRITE_RELIABLE, aejx), i);
    }

    public final void c(aejx aejx, int i, int i2) {
        aejf aejf = this.a;
        String str = aejf.a;
        aejf.e.a(new aekj(aeje.READ_RSSI, aejx), i2, Integer.valueOf(i));
    }

    public final void a(aejx aejx, int i, int i2) {
        aejw a2 = aejx.a();
        if (i2 == 0) {
            aeiy aeiy = (aeiy) this.a.c.remove(aejx);
            if (aeiy == null) {
                Log.w(aejf.a, String.format("Received unexpected disconnection for device %s! Ignoring.", new Object[]{a2}));
            } else if (aeiy.h) {
                if (aeiy.h) {
                    aeiy.h = false;
                    List list = aeiy.j;
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((aehe) list.get(i3)).a();
                    }
                    aeiy.d.e();
                }
                aejf aejf = this.a;
                String str = aejf.a;
                aejf.e.a(new aekj(aeje.DISCONNECT, a2), i);
            } else {
                if (i == 0) {
                    Log.w(aejf.a, String.format("Received a success for a failed connection attempt for device %s! Ignoring.", new Object[]{a2}));
                    i = 257;
                }
                aejf aejf2 = this.a;
                String str2 = aejf.a;
                aejf2.e.a(new aekj(aeje.CONNECT, a2), i, (Object) null);
                aejx.d();
                aejx.e();
            }
        } else if (i2 != 2) {
            String str3 = aejf.a;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Unexpected connection state: ");
            sb.append(i2);
            Log.e(str3, sb.toString());
        } else {
            aeiy aeiy2 = (aeiy) this.a.c.get(aejx);
            if (aeiy2 == null) {
                Log.w(aejf.a, String.format("Received unexpected successful connection for device %s! Ignoring.", new Object[]{a2}));
                return;
            }
            aekj aekj = new aekj(aeje.CONNECT, a2);
            if (i == 0) {
                amri d = aeiy2.f.d();
                if (!d.a()) {
                    aeiy2.c();
                    aejf aejf3 = this.a;
                    String str4 = aejf.a;
                    aejf3.e.a(aekj, 0, aeiy2);
                } else if (!aejx.b(((Integer) d.b()).intValue())) {
                    aejf aejf4 = this.a;
                    String str5 = aejf.a;
                    aejf4.e.a(aekj, (Object) new BluetoothException(String.format(Locale.US, "Failed to request MTU of %d for device %s: returned false.", new Object[]{d.b(), a2})));
                    this.a.c.remove(aejx);
                    aejx.d();
                    aejx.e();
                }
            } else {
                this.a.c.remove(aejx);
                aejx.d();
                aejx.e();
                aejf aejf5 = this.a;
                String str6 = aejf.a;
                aejf5.e.a(aekj, i, (Object) null);
            }
        }
    }

    public final void b(aejx aejx, int i, int i2) {
        aeiy aeiy = (aeiy) this.a.c.get(aejx);
        aejw a2 = aejx.a();
        if (aeiy == null) {
            Log.w(aejf.a, String.format("Received unexpected MTU change for device %s! Ignoring.", new Object[]{a2}));
        } else if (aeiy.h) {
            aejf aejf = this.a;
            String str = aejf.a;
            aejf.e.a(new aekj(aeje.CHANGE_MTU, aejx), i2, Integer.valueOf(i));
        } else {
            aeiy.c();
            aejf aejf2 = this.a;
            String str2 = aejf.a;
            aejf2.e.a(new aekj(aeje.CONNECT, a2), i2, aeiy);
        }
    }

    public final void b(aejx aejx, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        aejf aejf = this.a;
        String str = aejf.a;
        aejf.e.a(new aekj(aeje.WRITE_CHARACTERISTIC, aejx, bluetoothGattCharacteristic), i);
    }

    public final void b(aejx aejx, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        String str = aejf.a;
        Object[] objArr = {aejx.a(), bluetoothGattDescriptor.getUuid(), Integer.valueOf(i)};
        this.a.e.a(new aekj(aeje.WRITE_DESCRIPTOR, aejx, bluetoothGattDescriptor), i);
    }

    public final void a(aejx aejx, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (value == null) {
            value = new byte[0];
        }
        String str = aejf.a;
        Object[] objArr = {bluetoothGattCharacteristic.getUuid(), aejx.a()};
        try {
            aeiy aeiy = (aeiy) this.a.c.get(aejx);
            if (aeiy != null) {
                aeix aeix = (aeix) aeiy.i.get(bluetoothGattCharacteristic);
                if (aeix != null) {
                    synchronized (aeix.a) {
                        aegu aegu = aeix.b;
                        if (aegu == null) {
                            aeix.a.add(value);
                        } else {
                            aegu.a(value);
                        }
                    }
                    return;
                }
                return;
            }
            String valueOf = String.valueOf(aejx);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append("Receive callback on unexpected device: ");
            sb.append(valueOf);
            throw new BluetoothException(sb.toString());
        } catch (BluetoothException e) {
            Log.e(aejf.a, "Error in onCharacteristicChanged", e);
        }
    }

    public final void a(aejx aejx, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        aejf aejf = this.a;
        String str = aejf.a;
        aejf.e.a(new aekj(aeje.READ_CHARACTERISTIC, aejx, bluetoothGattCharacteristic), i, bluetoothGattCharacteristic.getValue());
    }

    public final void a(aejx aejx, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        aejf aejf = this.a;
        String str = aejf.a;
        aejf.e.a(new aekj(aeje.READ_DESCRIPTOR, aejx, bluetoothGattDescriptor), i, bluetoothGattDescriptor.getValue());
    }
}
