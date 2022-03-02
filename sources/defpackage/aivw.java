package defpackage;

import android.content.Context;
import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/* renamed from: aivw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aivw {
    private static String a;

    private static String a(Context context, long j) {
        try {
            File file = new File(context.getCacheDir(), "nlp_GlsPlatformKey");
            if (file.lastModified() <= j) {
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
            String readUTF = dataInputStream.readUTF();
            dataInputStream.close();
            return readUTF;
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e2) {
            return null;
        }
    }

    public static synchronized String b(Context context) {
        String str;
        synchronized (aivw.class) {
            if (aydu.e()) {
                if (a == null) {
                    String a2 = a(context, System.currentTimeMillis() - 604800000);
                    a = a2;
                    if (a2 == null) {
                        byte[] bArr = new byte[8];
                        new Random().nextBytes(bArr);
                        long currentTimeMillis = System.currentTimeMillis();
                        amrl.a(true);
                        byte[] bArr2 = new byte[12];
                        for (int i = 0; i < 8; i++) {
                            bArr2[i] = bArr[i];
                        }
                        int i2 = (int) (currentTimeMillis / 60000);
                        bArr2[8] = (byte) (i2 >> 24);
                        bArr2[9] = (byte) ((i2 >> 16) & 255);
                        bArr2[10] = (byte) ((i2 >> 8) & 255);
                        bArr2[11] = (byte) (i2 & 255);
                        String encodeToString = Base64.encodeToString(bArr2, 2);
                        a = encodeToString;
                        a(context, encodeToString);
                    }
                }
            } else if (a == null) {
                a = a(context, Long.MIN_VALUE);
            }
            str = a;
        }
        return str;
    }

    public static synchronized void a(Context context) {
        synchronized (aivw.class) {
            File file = new File(context.getCacheDir(), "nlp_GlsPlatformKey");
            try {
                file.delete();
            } catch (SecurityException e) {
                String valueOf = String.valueOf(file.toString());
                if (valueOf.length() == 0) {
                    new String("Unable to delete ");
                } else {
                    "Unable to delete ".concat(valueOf);
                }
            }
        }
    }

    public static synchronized void a(Context context, String str) {
        synchronized (aivw.class) {
            if (!aydu.e()) {
                File cacheDir = context.getCacheDir();
                if (cacheDir != null && (cacheDir.exists() || cacheDir.mkdirs())) {
                    try {
                        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(cacheDir, "nlp_GlsPlatformKey"))));
                        dataOutputStream.writeUTF(str);
                        dataOutputStream.close();
                    } catch (FileNotFoundException | IOException e) {
                    }
                }
                a = str;
            }
        }
    }
}
