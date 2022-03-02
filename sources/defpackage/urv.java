package defpackage;

import java.nio.ByteBuffer;

/* renamed from: urv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class urv {
    public final byte a;
    public final byte b;
    public final byte c;
    public final byte d;
    public final byte[] e;
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final byte[] i;

    public urv(byte b2, byte b3, byte b4, byte b5, byte[] bArr, int i2) {
        this.a = b2;
        this.b = b3;
        this.c = b4;
        this.d = b5;
        this.g = bArr;
        this.i = urx.a(i2);
        byte[] a2 = urx.a(bArr.length);
        this.f = a2;
        int length = a2.length;
        this.e = length != 2 ? new byte[0] : new byte[1];
        this.h = (length == 0 && i2 > 255) ? new byte[1] : new byte[0];
    }

    public static urv a(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7 = bArr;
        int length = bArr7.length;
        if (length < 4) {
            ((anih) ((anih) ulh.a.c()).a("urv", "a", 55, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse request %s because the byte array was too short", (Object) ulu.a(bArr));
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte b2 = wrap.get();
        byte b3 = wrap.get();
        byte b4 = wrap.get();
        byte b5 = wrap.get();
        if (length == 4) {
            bArr6 = new byte[0];
            bArr5 = new byte[0];
            bArr4 = new byte[0];
            bArr3 = new byte[0];
            bArr2 = new byte[0];
        } else if (length == 5) {
            bArr6 = new byte[0];
            bArr5 = new byte[0];
            bArr4 = new byte[0];
            bArr3 = new byte[1];
            bArr2 = new byte[0];
        } else {
            byte b6 = bArr7[4];
            if (b6 == 0 && length == 7) {
                bArr6 = new byte[0];
                bArr5 = new byte[0];
                bArr4 = new byte[1];
                bArr3 = new byte[2];
                bArr2 = new byte[0];
            } else if (b6 == 0) {
                byte[] bArr8 = new byte[1];
                byte[] bArr9 = {bArr7[5], bArr7[6]};
                if (length >= urx.a(bArr9) + 7) {
                    int a2 = urx.a(bArr9);
                    bArr2 = new byte[a2];
                    byte[] bArr10 = new byte[0];
                    int i2 = length - (a2 + 7);
                    byte[] bArr11 = new byte[i2];
                    if (i2 <= 2) {
                        bArr3 = bArr11;
                        bArr6 = bArr8;
                        bArr4 = bArr10;
                        bArr5 = bArr9;
                    } else {
                        ((anih) ((anih) ulh.a.c()).a("urv", "a", 113, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse request %s because the byte array was too long", (Object) ulu.a(bArr));
                        return null;
                    }
                } else {
                    ((anih) ((anih) ulh.a.c()).a("urv", "a", 102, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse request %s because the byte array was too short", (Object) ulu.a(bArr));
                    return null;
                }
            } else {
                bArr6 = new byte[0];
                byte[] bArr12 = {b6};
                if (length >= urx.a(bArr12) + 5) {
                    int a3 = urx.a(bArr12);
                    byte[] bArr13 = new byte[a3];
                    byte[] bArr14 = new byte[0];
                    int i3 = length - (a3 + 5);
                    byte[] bArr15 = new byte[i3];
                    if (i3 <= 2) {
                        bArr3 = bArr15;
                        bArr5 = bArr12;
                        bArr2 = bArr13;
                        bArr4 = bArr14;
                    } else {
                        ((anih) ((anih) ulh.a.c()).a("urv", "a", 135, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse request %s because the byte array was too long", (Object) ulu.a(bArr));
                        return null;
                    }
                } else {
                    ((anih) ((anih) ulh.a.c()).a("urv", "a", 124, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse request %s because the byte array was too short", (Object) ulu.a(bArr));
                    return null;
                }
            }
        }
        wrap.get(bArr6);
        wrap.get(bArr5);
        wrap.get(bArr2);
        wrap.get(bArr4);
        wrap.get(bArr3);
        return new urv(b2, b3, b4, b5, bArr2, urx.a(bArr3));
    }
}
