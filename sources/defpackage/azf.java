package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: azf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azf {
    public final Context a;
    public final String b;

    public azf(Context context, String str) {
        this.a = context.getApplicationContext();
        this.b = str;
    }

    public static String a(String str, aze aze, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        if (!z) {
            str2 = aze.c;
        } else {
            str2 = ".temp" + aze.c;
        }
        sb.append(str2);
        return sb.toString();
    }

    public final File a(InputStream inputStream, aze aze) {
        FileOutputStream fileOutputStream;
        File file = new File(this.a.getCacheDir(), a(this.b, aze, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }
}
