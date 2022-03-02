package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: anne  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anne {
    public static anmo a(File file) {
        return new annd(file);
    }

    public static byte[] b(File file) {
        return a(file).a();
    }

    public static void c(File file) {
        amrl.a((Object) file);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                String valueOf = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("Unable to create parent directories of ");
                sb.append(valueOf);
                throw new IOException(sb.toString());
            }
        }
    }

    public static anms a(File file, Charset charset) {
        return new anmn(a(file), charset);
    }

    public static void a(byte[] bArr, File file) {
        annc annc = new annc(file, new anna[0]);
        amrl.a((Object) bArr);
        anmx a = anmx.a();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(annc.a, annc.b.contains(anna.a));
            a.a((Closeable) fileOutputStream);
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            a.close();
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }
}
