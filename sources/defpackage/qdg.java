package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* renamed from: qdg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qdg {
    public static File a(Context context) {
        File c = kf.c(context);
        if (c != null && c.isDirectory()) {
            return c;
        }
        Log.w("InstanceID", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    private static final void b(Context context, String str, qde qde) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (qde.equals(a(sharedPreferences, str))) {
                return;
            }
        } catch (qdf e) {
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(qdu.a(str, "|P|"), qde.a());
        edit.putString(qdu.a(str, "|K|"), qde.b());
        edit.putString(qdu.a(str, "cre"), String.valueOf(qde.b));
        edit.commit();
    }

    private static File c(Context context, String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                String a = qdu.a(str.getBytes("UTF-8"));
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(a);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } else {
            str2 = "com.google.InstanceId.properties";
        }
        return new File(a(context), str2);
    }

    private static final KeyPair a(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("InstanceID", sb.toString());
                throw new qdf(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new qdf(e2);
        }
    }

    private static final qde a(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(qdu.a(str, "|P|"), (String) null);
        String string2 = sharedPreferences.getString(qdu.a(str, "|K|"), (String) null);
        if (string == null || string2 == null) {
            return null;
        }
        KeyPair a = a(string, string2);
        String string3 = sharedPreferences.getString(qdu.a(str, "cre"), (String) null);
        long j = 0;
        if (string3 != null) {
            try {
                j = Long.parseLong(string3);
            } catch (NumberFormatException e) {
            }
        }
        return new qde(a, j);
    }

    public final qde b(Context context, String str) {
        qde qde;
        try {
            File c = c(context, str);
            if (c.exists()) {
                try {
                    qde = a(c);
                } catch (IOException e) {
                    qde = a(c);
                }
            } else {
                qde = null;
            }
            if (qde != null) {
                b(context, str, qde);
                return qde;
            }
            e = null;
            try {
                qde a = a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (a != null) {
                    a(context, str, a);
                    return a;
                } else if (e == null) {
                    return null;
                } else {
                    throw e;
                }
            } catch (qdf e2) {
                e = e2;
            }
        } catch (IOException e3) {
            String valueOf = String.valueOf(e3);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
            sb.append("IID file exists, but failed to read from it: ");
            sb.append(valueOf);
            Log.w("InstanceID", sb.toString());
            throw new qdf(e3);
        } catch (qdf e4) {
            e = e4;
        }
    }

    private static final qde a(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            String property = properties.getProperty("pub");
            String property2 = properties.getProperty("pri");
            if (property != null) {
                if (property2 != null) {
                    qde qde = new qde(a(property, property2), Long.parseLong(properties.getProperty("cre")));
                    fileInputStream.close();
                    return qde;
                }
            }
            fileInputStream.close();
            return null;
        } catch (NumberFormatException e) {
            throw new qdf(e);
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                apev.a(th, th2);
            }
            throw th;
        }
    }

    private static final void a(Context context, String str, qde qde) {
        FileOutputStream fileOutputStream;
        try {
            File c = c(context, str);
            c.createNewFile();
            Properties properties = new Properties();
            properties.setProperty("pub", qde.a());
            properties.setProperty("pri", qde.b());
            properties.setProperty("cre", String.valueOf(qde.b));
            fileOutputStream = new FileOutputStream(c);
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (IOException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Failed to write key: ");
            sb.append(valueOf);
            Log.w("InstanceID", sb.toString());
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final qde a(Context context, String str) {
        qde qde = new qde(qcz.a(), System.currentTimeMillis());
        try {
            qde b = b(context, str);
            if (b != null) {
                return b;
            }
        } catch (qdf e) {
        }
        a(context, str, qde);
        b(context, str, qde);
        return qde;
    }
}
