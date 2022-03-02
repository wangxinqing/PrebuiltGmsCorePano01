package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: oaq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oaq {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.audx a(java.io.File r3, defpackage.audx r4) {
        /*
            boolean r0 = r3.exists()
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0033 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0033 }
            r2.<init>(r3)     // Catch:{ all -> 0x0033 }
            r0.<init>(r2)     // Catch:{ all -> 0x0033 }
            byte[] r3 = a((java.io.InputStream) r0)     // Catch:{ all -> 0x0030 }
            boolean r1 = defpackage.jjt.a((byte[]) r3)     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            byte[] r3 = b(r3)     // Catch:{ all -> 0x0030 }
        L_0x0020:
            audw r4 = r4.av()     // Catch:{ all -> 0x0030 }
            audw r3 = r4.a((byte[]) r3)     // Catch:{ all -> 0x0030 }
            audx r3 = r3.i()     // Catch:{ all -> 0x0030 }
            r0.close()
            return r3
        L_0x0030:
            r3 = move-exception
            r1 = r0
            goto L_0x0034
        L_0x0033:
            r3 = move-exception
        L_0x0034:
            if (r1 == 0) goto L_0x0039
            r1.close()
        L_0x0039:
            throw r3
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oaq.a(java.io.File, audx):audx");
    }

    public static byte[] b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        try {
            return a((InputStream) gZIPInputStream);
        } finally {
            gZIPInputStream.close();
            byteArrayInputStream.close();
        }
    }

    public static oll a(String str) {
        return a(str, -1);
    }

    public static oll a(String str, int i) {
        aucd o = oll.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        oll oll = (oll) o.b;
        str.getClass();
        int i2 = oll.a | 1;
        oll.a = i2;
        oll.b = str;
        oll.a = i2 | 2;
        oll.c = i;
        return (oll) o.i();
    }

    public static olz a(String str, String str2) {
        aucd o = olz.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        olz olz = (olz) o.b;
        str.getClass();
        int i = olz.a | 1;
        olz.a = i;
        olz.b = str;
        str2.getClass();
        olz.a = i | 2;
        olz.c = str2;
        return (olz) o.i();
    }

    private static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[10240];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 10240);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } finally {
                byteArrayOutputStream.close();
            }
        }
    }

    public static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } finally {
            byteArrayOutputStream.close();
        }
    }
}
