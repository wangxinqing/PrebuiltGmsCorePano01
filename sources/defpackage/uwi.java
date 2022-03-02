package defpackage;

import java.io.UnsupportedEncodingException;

/* renamed from: uwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uwi {
    public static byte a() {
        return (byte) ((int) (aync.a.a().L() & 255));
    }

    public static byte[] a(byte[] bArr) {
        int length = bArr.length;
        if (length > 1) {
            byte a = a();
            if (bArr[0] == a) {
                int i = length - 1;
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 1, bArr2, 0, i);
                return bArr2;
            }
            String format = String.format("%s Audio token does not match prefix: %s, %s", new Object[]{"AudioBytesUtil: ", jjp.c(bArr), String.valueOf(a)});
            ((anih) ((anih) tgc.a.b()).a("uwi", "a", 46, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s", (Object) format);
            throw new UnsupportedEncodingException(format);
        }
        String format2 = String.format("%s Audio token is too short for decoding.", new Object[]{"AudioBytesUtil: "});
        ((anih) ((anih) tgc.a.b()).a("uwi", "a", 37, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s", (Object) format2);
        throw new UnsupportedEncodingException(format2);
    }
}
