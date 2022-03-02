package com.google.android.libraries.bluetooth.fastpair;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CreateBondException extends PairingException {
    public int a;
    public final int b;

    public CreateBondException(int i, int i2, String str, Object... objArr) {
        super(str, objArr);
        this.b = i;
        this.a = i2;
    }
}
