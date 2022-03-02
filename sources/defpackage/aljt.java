package defpackage;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: aljt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aljt {
    private static final alkd a = new alkd("FileUtils");

    static void a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return;
        } catch (IOException e) {
            a.a("Failed to write bytes", e);
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    static void b(File file) {
        File[] listFiles;
        if (!file.exists()) {
            alkd alkd = a;
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("File not exist: ");
            sb.append(valueOf);
            alkd.b(sb.toString());
            return;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File b : listFiles) {
                b(b);
            }
        }
        if (!file.delete()) {
            alkd alkd2 = a;
            String valueOf2 = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 18);
            sb2.append("Failed to delete: ");
            sb2.append(valueOf2);
            alkd2.b(sb2.toString());
        }
    }

    static byte[] a(File file) {
        FileInputStream fileInputStream;
        if (file.isDirectory()) {
            alkd alkd = a;
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Cannot open input stream on directory ");
            sb.append(valueOf);
            alkd.b(sb.toString());
            return null;
        }
        byte[] bArr = new byte[((int) file.length())];
        try {
            fileInputStream = new FileInputStream(file);
            anmr.a((InputStream) fileInputStream, bArr);
            fileInputStream.close();
            return bArr;
        } catch (IOException e) {
            alkd alkd2 = a;
            String valueOf2 = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
            sb2.append("Failed to read from file: ");
            sb2.append(valueOf2);
            Log.e("ConsentLogging", alkd2.a.concat(sb2.toString()), e);
            return null;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
