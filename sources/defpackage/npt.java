package defpackage;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: npt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class npt {
    public static File a(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        a(file2, false);
        return file2;
    }

    public static void b(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File b : file.listFiles()) {
                    b(b);
                }
            }
            file.delete();
        }
    }

    public static File a(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(a(str, file), str2);
    }

    public static String a(byte[] bArr) {
        int length;
        if (!(bArr == null || (length = bArr.length) == 0)) {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                instance.update(bArr, 0, length);
                return jjp.a(instance.digest());
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    public static void a(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static boolean a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                jjt.a((Closeable) fileOutputStream2);
                return true;
            } catch (IOException e) {
                fileOutputStream = fileOutputStream2;
                jjt.a((Closeable) fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                jjt.a((Closeable) fileOutputStream);
                throw th;
            }
        } catch (IOException e2) {
            jjt.a((Closeable) fileOutputStream);
            return false;
        } catch (Throwable th2) {
            th = th2;
            jjt.a((Closeable) fileOutputStream);
            throw th;
        }
    }

    public static byte[] a(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] k = auay.a((InputStream) fileInputStream).k();
                jjt.a((Closeable) fileInputStream);
                return k;
            } catch (IOException e) {
                jjt.a((Closeable) fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                jjt.a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (IOException e2) {
            fileInputStream = null;
            jjt.a((Closeable) fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            jjt.a((Closeable) fileInputStream2);
            throw th;
        }
    }
}
