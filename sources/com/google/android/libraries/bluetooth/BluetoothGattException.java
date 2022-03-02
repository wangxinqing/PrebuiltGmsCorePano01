package com.google.android.libraries.bluetooth;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BluetoothGattException extends BluetoothException {
    public final int a;

    public BluetoothGattException(String str, int i) {
        super(str);
        this.a = i;
    }

    public BluetoothGattException(String str, int i, Throwable th) {
        super(str, th);
        this.a = i;
    }
}
