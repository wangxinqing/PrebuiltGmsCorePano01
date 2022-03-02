package defpackage;

import com.android.volley.toolbox.ImageRequest;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: aurj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aurj implements aurl {
    private static final int[] a = {1, 10, 100, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    public final String a(int i, byte[] bArr) {
        int length = bArr.length;
        byte b = bArr[length - 1] & 15;
        try {
            String num = Integer.toString((new DataInputStream(new ByteArrayInputStream(bArr, b, length - b)).readInt() & Integer.MAX_VALUE) % a[i]);
            for (int length2 = num.length(); length2 < i; length2++) {
                String valueOf = String.valueOf(num);
                num = valueOf.length() == 0 ? new String("0") : "0".concat(valueOf);
            }
            return num;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
