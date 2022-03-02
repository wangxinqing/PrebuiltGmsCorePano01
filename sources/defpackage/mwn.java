package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: mwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mwn {
    public static byte[] a(File file) {
        FileInputStream fileInputStream;
        iva.a();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            fileInputStream = new FileInputStream(file);
            while (true) {
                try {
                    int read = fileInputStream.read();
                    if (read == -1) {
                        byte[] b = oaq.b(byteArrayOutputStream.toByteArray());
                        fileInputStream.close();
                        byteArrayOutputStream.close();
                        return b;
                    }
                    byteArrayOutputStream.write(read);
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            byteArrayOutputStream.close();
            throw th;
        }
    }
}
