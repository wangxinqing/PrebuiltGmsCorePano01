package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.bluetooth.BluetoothGattException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: aejq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aejq extends aekc {
    final /* synthetic */ aejs a;

    public aejq(aejs aejs) {
        this.a = aejs;
    }

    public final void a(int i, BluetoothGattService bluetoothGattService) {
        this.a.e.a(new aekj(aejr.ADD_SERVICE, bluetoothGattService), i);
    }

    public final void a(aejw aejw, int i) {
        String str = aejs.a;
        Object[] objArr = {aejw, Integer.valueOf(i)};
        try {
            this.a.a(aejw).c.a(new aekj(aejm.a), i);
        } catch (BluetoothGattException e) {
            Log.e(aejs.a, String.format("An error occurred when receiving onNotificationSent", new Object[0]), e);
        }
    }

    public final void a(aejw aejw, int i, int i2) {
        aejh aejh = this.a.i;
        aeka aeka = this.a.j;
        if (aejh != null && aeka != null) {
            if (i2 == 0) {
                if (i != 0) {
                    Log.w(aejs.a, String.format("Disconnection from %s error: %s. Proceeding anyway.", new Object[]{aejw, aekh.a(i)}));
                }
                aejn aejn = (aejn) this.a.k.remove(aejw);
                if (aejn != null) {
                    aeka.a(aejw);
                    synchronized (aejn.a) {
                        for (aejk a2 : aejn.a) {
                            a2.a();
                        }
                    }
                }
                this.a.e.a(new aekj(aejr.CLOSE_CONNECTION), i);
            } else if (i2 != 2) {
                Log.e(aejs.a, String.format("Unexpected connection state: %d", new Object[]{Integer.valueOf(i2)}));
            } else if (i == 0) {
                Log.i(aejs.a, String.format("Connected to device %s.", new Object[]{aejw}));
                if (this.a.k.containsKey(aejw)) {
                    Log.w(aejs.a, String.format("A connection is already open with device %s. Keeping existing one.", new Object[]{aejw}));
                    return;
                }
                this.a.k.put(aejw, new aejn(this.a, aejw, aejh));
                aeju aeju = this.a.h;
                if ((Build.VERSION.SDK_INT >= 24 || aejw.b() != 3) && !aeka.b(aejw)) {
                    Log.w(aejs.a, String.format("Keeping connection open on stop advertising failed for device %s.", new Object[]{aejw}));
                }
            } else {
                Log.e(aejs.a, String.format("Connection to %s failed: %s", new Object[]{aejw, aekh.a(i)}));
            }
        }
    }

    public final void a(aejw aejw, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        aeka aeka = this.a.j;
        if (aeka != null) {
            try {
                aejs aejs = this.a;
                String str = aejs.a;
                aeka.a(aejw, i, 0, i2, aejs.a(aejw).a(bluetoothGattCharacteristic).a(i2));
            } catch (BluetoothGattException e) {
                Log.e(aejs.a, String.format("Could not read  %s on device %s at offset %d", new Object[]{aekh.b(bluetoothGattCharacteristic), aejw, Integer.valueOf(i2)}), e);
                aeka.a(aejw, i, e.a, i2, (byte[]) null);
            }
        }
    }

    public final void a(aejw aejw, int i, int i2, BluetoothGattDescriptor bluetoothGattDescriptor) {
        aeka aeka = this.a.j;
        if (aeka != null) {
            try {
                aejs aejs = this.a;
                String str = aejs.a;
                aejn a2 = aejs.a(aejw);
                BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
                if (characteristic == null) {
                    throw new BluetoothGattException(String.format("Descriptor %s not associated with a characteristics!", new Object[]{aekh.b(bluetoothGattDescriptor)}), 257);
                } else {
                    a2.a(characteristic);
                    throw new BluetoothGattException("Read not supported.", 6);
                }
            } catch (BluetoothGattException e) {
                Log.e(aejs.a, String.format("Could not read %s on device %s at %d", new Object[]{aekh.b(bluetoothGattDescriptor), aejw, Integer.valueOf(i2)}), e);
                aeka.a(aejw, i, e.a, i2, (byte[]) null);
            }
        }
    }

    public final void a(aejw aejw, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) {
        aejw aejw2 = aejw;
        byte[] bArr2 = bArr;
        aeka aeka = this.a.j;
        if (aeka != null) {
            try {
                aejs aejs = this.a;
                String str = aejs.a;
                aejn a2 = aejs.a(aejw2);
                Integer valueOf = Integer.valueOf(i2);
                Object[] objArr = {Integer.valueOf(bArr2.length), valueOf, aekh.b(bluetoothGattCharacteristic), a2.b, Boolean.valueOf(z)};
                try {
                    aejt a3 = a2.a(bluetoothGattCharacteristic);
                    if (z) {
                        SortedMap sortedMap = (SortedMap) a2.d.get(a3);
                        if (sortedMap == null) {
                            sortedMap = new TreeMap();
                            a2.d.put(a3, sortedMap);
                        }
                        sortedMap.put(valueOf, bArr2);
                    } else {
                        a3.toString();
                        aejt.b();
                    }
                    if (z2) {
                        aeka.a(aejw, i, 0, i2, (byte[]) null);
                    }
                } catch (BluetoothGattException e) {
                    e = e;
                    Log.e(aejs.a, String.format("Could not write %s on device %s at offset %d", new Object[]{aekh.b(bluetoothGattCharacteristic), aejw2, Integer.valueOf(i2)}), e);
                    aeka.a(aejw, i, e.a, i2, (byte[]) null);
                }
            } catch (BluetoothGattException e2) {
                e = e2;
                BluetoothGattCharacteristic bluetoothGattCharacteristic2 = bluetoothGattCharacteristic;
                Log.e(aejs.a, String.format("Could not write %s on device %s at offset %d", new Object[]{aekh.b(bluetoothGattCharacteristic), aejw2, Integer.valueOf(i2)}), e);
                aeka.a(aejw, i, e.a, i2, (byte[]) null);
            }
        }
    }

    public final void a(aejw aejw, int i, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z, boolean z2, int i2, byte[] bArr) {
        aejw aejw2 = aejw;
        byte[] bArr2 = bArr;
        aeka aeka = this.a.j;
        if (aeka != null) {
            try {
                aejs aejs = this.a;
                String str = aejs.a;
                aejn a2 = aejs.a(aejw2);
                int length = bArr2.length;
                Integer valueOf = Integer.valueOf(i2);
                Object[] objArr = {Integer.valueOf(length), valueOf, aekh.b(bluetoothGattDescriptor), a2.b, Boolean.valueOf(z)};
                if (!z) {
                    BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
                    if (characteristic != null) {
                        a2.a(characteristic);
                        if (!bluetoothGattDescriptor.getUuid().equals(aeer.a)) {
                            throw new BluetoothGattException("Write not supported.", 6);
                        } else if (i2 != 0) {
                            throw new BluetoothGattException(String.format("Offset should be 0 when changing the client characteristic config: %d.", new Object[]{valueOf}), 7);
                        } else if (length == 2) {
                            boolean containsKey = a2.e.containsKey(characteristic);
                            amrl.a((Object) bArr);
                            amrl.a(true, (Object) "Length should be 2 bytes.");
                            short s = (short) ((bArr2[0] & 255) | (bArr2[1] << 8));
                            if (s != 0) {
                                if (s != 1) {
                                    if (s != 2) {
                                        throw new BluetoothGattException(String.format("Value 0x%s is undefined for the client characteristic config", new Object[]{anml.g.a(bArr2)}), 6);
                                    } else if (!containsKey) {
                                        a2.e.put(characteristic, new aejj());
                                        aejt.a();
                                    }
                                } else if (!containsKey) {
                                    a2.e.put(characteristic, new aeji());
                                    aejt.a();
                                }
                            } else if (containsKey) {
                                if (((aejl) a2.e.remove(characteristic)) != null) {
                                    throw new BluetoothGattException("Notification not supported.", 6);
                                }
                            }
                            if (z2) {
                                aeka.a(aejw, i, 0, 0, (byte[]) null);
                            }
                        } else {
                            throw new BluetoothGattException(String.format("Value 0x%s is undefined for the client characteristic config", new Object[]{anml.g.a(bArr2)}), 13);
                        }
                    } else {
                        throw new BluetoothGattException(String.format("Descriptor %s not associated with a characteristics!", new Object[]{aekh.b(bluetoothGattDescriptor)}), 257);
                    }
                } else {
                    throw new BluetoothGattException(String.format("Prepare write not supported for descriptor %s.", new Object[]{bluetoothGattDescriptor}), 6);
                }
            } catch (BluetoothGattException e) {
                Log.e(aejs.a, String.format("Could not write %s on device %s at %d", new Object[]{aekh.b(bluetoothGattDescriptor), aejw2, Integer.valueOf(i2)}), e);
                aeka.a(aejw, i, e.a, i2, (byte[]) null);
            }
        }
    }

    public final void a(aejw aejw, int i, boolean z) {
        aeka aeka = this.a.j;
        if (aeka != null) {
            try {
                aejs aejs = this.a;
                String str = aejs.a;
                aejn a2 = aejs.a(aejw);
                if (z) {
                    try {
                        for (Map.Entry entry : a2.d.entrySet()) {
                            aejt aejt = (aejt) entry.getKey();
                            SortedMap sortedMap = (SortedMap) entry.getValue();
                            if (aejt == null || sortedMap == null) {
                                throw new IllegalStateException();
                            }
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            Integer num = 0;
                            while (!sortedMap.isEmpty()) {
                                Integer num2 = (Integer) sortedMap.firstKey();
                                if (num2.intValue() >= num.intValue() + byteArrayOutputStream.size()) {
                                    if (num2.intValue() > num.intValue() + byteArrayOutputStream.size()) {
                                        num.intValue();
                                        byteArrayOutputStream.toByteArray();
                                        aejt.b();
                                        byteArrayOutputStream.reset();
                                        num = num2;
                                    }
                                    byte[] bArr = (byte[]) sortedMap.remove(num2);
                                    if (bArr != null) {
                                        byteArrayOutputStream.write(bArr);
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                } else {
                                    int size = byteArrayOutputStream.size();
                                    String valueOf = String.valueOf(num2);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
                                    sb.append("Expected offset of at least ");
                                    sb.append(size);
                                    sb.append(", but got offset ");
                                    sb.append(valueOf);
                                    throw new BluetoothGattException(sb.toString(), 7);
                                }
                            }
                            if (byteArrayOutputStream.size() > 0) {
                                amrl.a((Object) num);
                                num.intValue();
                                byteArrayOutputStream.toByteArray();
                                aejt.b();
                            }
                        }
                        a2.d.clear();
                    } catch (IOException e) {
                        throw new BluetoothGattException("Error assembling request", 257);
                    } catch (Throwable th) {
                        a2.d.clear();
                        throw th;
                    }
                } else {
                    a2.d.clear();
                }
                aeka.a(aejw, i, 0, 0, (byte[]) null);
            } catch (BluetoothGattException e2) {
                Log.e(aejs.a, "Could not execute write.", e2);
                aeka.a(aejw, i, e2.a, 0, (byte[]) null);
            }
        }
    }
}
