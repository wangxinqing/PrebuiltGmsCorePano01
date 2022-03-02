package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: urw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class urw {
    public final byte[] a;
    private final byte[] b;

    public urw(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public static urw a() {
        return a(new byte[0]);
    }

    public static urw b() {
        return new urw(new byte[0], urx.b);
    }

    public final byte[] d() {
        ByteBuffer allocate = ByteBuffer.allocate(this.a.length + this.b.length);
        allocate.put(this.a);
        allocate.put(this.b);
        return allocate.array();
    }

    public static urw a(byte[] bArr) {
        return new urw(bArr, urx.a);
    }

    public static urw b(byte[] bArr) {
        int length = bArr.length;
        if (length < 2) {
            ((anih) ((anih) ulh.a.c()).a("urw", "b", 254, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse response %s because the byte array was too short", (Object) ulu.a(bArr));
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte[] bArr2 = new byte[(length - 2)];
        wrap.get(bArr2);
        byte[] bArr3 = new byte[2];
        wrap.get(bArr3);
        return new urw(bArr2, bArr3);
    }

    public final boolean c() {
        return !Arrays.equals(urx.a, this.b);
    }
}
