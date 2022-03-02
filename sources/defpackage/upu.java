package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: upu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class upu {
    static final byte[] a = {0, 0, 0};
    public static final /* synthetic */ int d = 0;
    public final byte[] b;
    public final byte[] c;

    public upu(byte[] bArr, byte[] bArr2) {
        this.b = bArr;
        this.c = bArr2;
    }

    public static upu a(byte[] bArr) {
        if (bArr == null) {
            ((anih) ((anih) ulh.a.d()).a("upu", "a", 31, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BlePacket: null bytes passed in.");
            return null;
        }
        int length = bArr.length;
        if (length >= 3) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte[] bArr2 = new byte[3];
            wrap.get(bArr2);
            byte[] bArr3 = new byte[(length - 3)];
            wrap.get(bArr3);
            return new upu(bArr2, bArr3);
        }
        ((anih) ((anih) ulh.a.d()).a("upu", "a", 36, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot deserialize BlePacket: expecting min %d raw bytes, got %d", 3, length);
        return null;
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != 3) {
            ((anih) ((anih) ulh.a.d()).a("upu", "a", 59, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot serialize BlePacket: expected a serviceIdHash of %d bytes but got %d", 3, length);
            return null;
        }
        int length2 = bArr2.length;
        if (length2 > 2147483644) {
            ((anih) ((anih) ulh.a.d()).a("upu", "a", 66, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Cannot serialize BlePacket: expected data of at most %d bytes but got %d", 2147483644, length2);
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length2 + 3);
        allocate.put(bArr);
        allocate.put(bArr2);
        return allocate.array();
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return Arrays.equals(this.b, a);
    }
}
