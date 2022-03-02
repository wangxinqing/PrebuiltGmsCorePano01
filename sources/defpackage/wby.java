package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: wby  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wby {
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    private final int d;

    public wby(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length == 2 && bArr2.length == 14) {
            this.d = i;
            this.a = bArr3;
            this.b = bArr;
            this.c = bArr2;
            return;
        }
        throw new IllegalArgumentException("Advertisement's fields should be of required sizes.");
    }

    public static wby a(byte[] bArr) {
        int i;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte[] bArr2 = null;
        if (wrap.remaining() < 17) {
            ((anih) ((anih) vvj.a.d()).a("wby", "a", 56, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse advertisement %s because it was too short.", (Object) whu.b(bArr));
            return null;
        }
        byte b2 = wrap.get();
        if (((b2 >> 5) & 7) == 0) {
            int i2 = ((b2 >> 4) & 1) ^ 1;
            byte[] bArr3 = new byte[2];
            wrap.get(bArr3);
            byte[] bArr4 = new byte[14];
            wrap.get(bArr4);
            if (wrap.hasRemaining()) {
                i = wrap.get() & 255;
            } else {
                i = 0;
            }
            if (wrap.remaining() >= i && (i != 0 || i2 == 0)) {
                if (i > 0) {
                    byte[] bArr5 = new byte[i];
                    wrap.get(bArr5);
                    if (Arrays.equals(bArr5, new String(bArr5).getBytes())) {
                        bArr2 = bArr5;
                    } else {
                        ((anih) ((anih) vvj.a.d()).a("wby", "a", 101, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse advertisement %s because the device name was corrupted", (Object) whu.b(bArr));
                        return null;
                    }
                }
                return new wby(0, bArr3, bArr4, bArr2);
            }
            ((anih) ((anih) vvj.a.d()).a("wby", "a", 88, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse advertisement %s because the device name did not match the expected length %d", (Object) whu.b(bArr), i);
            return null;
        }
        ((anih) ((anih) vvj.a.d()).a("wby", "a", 67, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to parse advertisement %s because we failed to parse the version number", (Object) whu.b(bArr));
        return null;
    }

    public final boolean a() {
        return this.a != null;
    }

    public static wby a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return new wby(0, bArr, bArr2, bArr3);
    }

    public static byte[] a(wby wby) {
        int i;
        byte[] bArr = wby.a;
        int i2 = 0;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        if (i > 0) {
            i2 = 1;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i2 + 17 + i);
        allocate.put((byte) (((true ^ wby.a() ? 1 : 0) << true) | ((byte) ((wby.d & 7) << 5))));
        allocate.put(wby.b);
        allocate.put(wby.c);
        if (bArr != null && i > 0) {
            allocate.put((byte) (i & 255));
            allocate.put(bArr);
        }
        return allocate.array();
    }
}
