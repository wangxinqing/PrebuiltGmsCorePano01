package defpackage;

import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: aurk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aurk implements aurl {
    public final String a(int i, byte[] bArr) {
        if (i != 9) {
            throw new IllegalArgumentException("Code length must be 9");
        } else if (bArr.length == 32) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i2 = 0;
            for (int i3 = 0; i3 < 32; i3 += 4) {
                i2 = wrap.getInt(i3);
                if ((i2 & 1073741823) < 1000000000) {
                    break;
                }
            }
            return String.format(Locale.US, "%09d", new Object[]{Integer.valueOf((i2 & 1073741823) % 1000000000)});
        } else {
            throw new IllegalArgumentException("Signed challenge length must be exactly 32 bytes");
        }
    }
}
