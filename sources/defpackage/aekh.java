package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import com.google.android.libraries.bluetooth.BluetoothException;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: aekh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aekh {
    public static BluetoothGattCharacteristic a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic2 = new BluetoothGattCharacteristic(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getProperties(), bluetoothGattCharacteristic.getPermissions());
        try {
            Field declaredField = BluetoothGattCharacteristic.class.getDeclaredField("mInstance");
            Field declaredField2 = BluetoothGattCharacteristic.class.getDeclaredField("mService");
            Field declaredField3 = BluetoothGattCharacteristic.class.getDeclaredField("mDescriptors");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            declaredField3.setAccessible(true);
            declaredField.set(bluetoothGattCharacteristic2, declaredField.get(bluetoothGattCharacteristic));
            declaredField2.set(bluetoothGattCharacteristic2, declaredField2.get(bluetoothGattCharacteristic));
            declaredField3.set(bluetoothGattCharacteristic2, declaredField3.get(bluetoothGattCharacteristic));
            byte[] value = bluetoothGattCharacteristic.getValue();
            if (value != null) {
                bluetoothGattCharacteristic2.setValue(Arrays.copyOf(value, value.length));
            }
            bluetoothGattCharacteristic2.setWriteType(bluetoothGattCharacteristic.getWriteType());
            return bluetoothGattCharacteristic2;
        } catch (NoSuchFieldException e) {
            throw new BluetoothException("Cannot clone characteristic.", e);
        } catch (IllegalAccessException e2) {
            throw new BluetoothException("Cannot clone characteristic.", e2);
        } catch (IllegalArgumentException e3) {
            throw new BluetoothException("Cannot clone characteristic.", e3);
        }
    }

    public static String a(int i) {
        return i != 0 ? i != 13 ? i != 15 ? i != 143 ? i != 257 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? i != 7 ? "Unknown error code" : "GATT_INVALID_OFFSET" : "GATT_REQUEST_NOT_SUPPORTED" : "GATT_INSUFFICIENT_AUTHENTICATION" : "GATT_WRITE_NOT_PERMITTED" : "GATT_READ_NOT_PERMITTED" : "GATT_FAILURE" : "GATT_CONNECTION_CONGESTED" : "GATT_INSUFFICIENT_ENCRYPTION" : "GATT_INVALID_ATTRIBUTE_LENGTH" : "GATT_SUCCESS";
    }

    public static String b(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        String str;
        if (bluetoothGattCharacteristic == null) {
            return "null characteristic";
        }
        Object[] objArr = new Object[2];
        objArr[0] = bluetoothGattCharacteristic.getUuid();
        BluetoothGattService service = bluetoothGattCharacteristic.getService();
        if (service != null) {
            str = String.format("service %s", new Object[]{service.getUuid()});
        } else {
            str = "null service";
        }
        objArr[1] = str;
        return String.format("characteristic %s on %s", objArr);
    }

    public static String b(BluetoothGattDescriptor bluetoothGattDescriptor) {
        if (bluetoothGattDescriptor == null) {
            return "null descriptor";
        }
        return String.format("descriptor %s on %s", new Object[]{bluetoothGattDescriptor.getUuid(), b(bluetoothGattDescriptor.getCharacteristic())});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        throw new com.google.android.libraries.bluetooth.BluetoothException("Cannot clone descriptor.", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        throw new com.google.android.libraries.bluetooth.BluetoothException("Cannot clone descriptor.", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0025, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0023 A[ExcHandler: IllegalArgumentException (r5v5 'e' java.lang.IllegalArgumentException A[CUSTOM_DECLARE]), Splitter:B:1:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0025 A[ExcHandler: IllegalAccessException (r5v4 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:1:0x0014] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.bluetooth.BluetoothGattDescriptor a(android.bluetooth.BluetoothGattDescriptor r5) {
        /*
            java.lang.String r0 = "Cannot clone descriptor."
            android.bluetooth.BluetoothGattDescriptor r1 = new android.bluetooth.BluetoothGattDescriptor
            java.util.UUID r2 = r5.getUuid()
            int r3 = r5.getPermissions()
            r1.<init>(r2, r3)
            r2 = 1
            java.lang.Class<android.bluetooth.BluetoothGattDescriptor> r3 = android.bluetooth.BluetoothGattDescriptor.class
            java.lang.String r4 = "mInstance"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ NoSuchFieldException -> 0x0027, IllegalAccessException -> 0x0025, IllegalArgumentException -> 0x0023 }
            r3.setAccessible(r2)     // Catch:{ NoSuchFieldException -> 0x0027, IllegalAccessException -> 0x0025, IllegalArgumentException -> 0x0023 }
            java.lang.Object r4 = r3.get(r5)     // Catch:{ NoSuchFieldException -> 0x0027, IllegalAccessException -> 0x0025, IllegalArgumentException -> 0x0023 }
            r3.set(r1, r4)     // Catch:{ NoSuchFieldException -> 0x0027, IllegalAccessException -> 0x0025, IllegalArgumentException -> 0x0023 }
            goto L_0x0028
        L_0x0023:
            r5 = move-exception
            goto L_0x0049
        L_0x0025:
            r5 = move-exception
            goto L_0x004f
        L_0x0027:
            r3 = move-exception
        L_0x0028:
            java.lang.Class<android.bluetooth.BluetoothGattDescriptor> r3 = android.bluetooth.BluetoothGattDescriptor.class
            java.lang.String r4 = "mCharacteristic"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ NoSuchFieldException -> 0x0055, IllegalAccessException -> 0x0025, IllegalArgumentException -> 0x0023 }
            r3.setAccessible(r2)     // Catch:{ NoSuchFieldException -> 0x0055, IllegalAccessException -> 0x0025, IllegalArgumentException -> 0x0023 }
            java.lang.Object r2 = r3.get(r5)     // Catch:{ NoSuchFieldException -> 0x0055, IllegalAccessException -> 0x0025, IllegalArgumentException -> 0x0023 }
            r3.set(r1, r2)     // Catch:{ NoSuchFieldException -> 0x0055, IllegalAccessException -> 0x0025, IllegalArgumentException -> 0x0023 }
            byte[] r5 = r5.getValue()     // Catch:{ NoSuchFieldException -> 0x0055, IllegalAccessException -> 0x0025, IllegalArgumentException -> 0x0023 }
            if (r5 == 0) goto L_0x0048
            int r2 = r5.length     // Catch:{ NoSuchFieldException -> 0x0055, IllegalAccessException -> 0x0025, IllegalArgumentException -> 0x0023 }
            byte[] r5 = java.util.Arrays.copyOf(r5, r2)     // Catch:{ NoSuchFieldException -> 0x0055, IllegalAccessException -> 0x0025, IllegalArgumentException -> 0x0023 }
            r1.setValue(r5)     // Catch:{ NoSuchFieldException -> 0x0055, IllegalAccessException -> 0x0025, IllegalArgumentException -> 0x0023 }
        L_0x0048:
            return r1
        L_0x0049:
            com.google.android.libraries.bluetooth.BluetoothException r1 = new com.google.android.libraries.bluetooth.BluetoothException
            r1.<init>(r0, r5)
            throw r1
        L_0x004f:
            com.google.android.libraries.bluetooth.BluetoothException r1 = new com.google.android.libraries.bluetooth.BluetoothException
            r1.<init>(r0, r5)
            throw r1
        L_0x0055:
            r5 = move-exception
            com.google.android.libraries.bluetooth.BluetoothException r1 = new com.google.android.libraries.bluetooth.BluetoothException
            r1.<init>(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aekh.a(android.bluetooth.BluetoothGattDescriptor):android.bluetooth.BluetoothGattDescriptor");
    }
}
