package com.google.android.libraries.bluetooth.fastpair;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConnectException extends PairingException {
    public final int a;

    public ConnectException(int i, String str, Object... objArr) {
        super(str, objArr);
        this.a = i;
    }
}
