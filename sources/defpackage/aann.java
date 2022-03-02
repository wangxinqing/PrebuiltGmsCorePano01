package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aann  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class aann {
    private static final String a = aann.class.getSimpleName();

    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.android.vending", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            return -1;
        }
    }

    public static boolean b(Context context) {
        aaal aaal = new aaal(context);
        return aaal.b() && aaal.b(aaal.a);
    }

    public static boolean c(Context context, String str) {
        try {
            hya.a(context).a(str);
            return true;
        } catch (SecurityException e) {
            Log.e(a, String.format("%s: %s", new Object[]{e.getMessage(), e.getCause()}));
            return false;
        }
    }

    public static boolean b(Context context, String str) {
        if (hxz.f(context) || "com.android.vending".equals(str) || "com.google.android.gms".equals(str)) {
            return c(context, str);
        }
        return false;
    }

    public static Intent a(Context context, Class cls) {
        return new Intent().setClassName(context, a(cls));
    }

    public static Intent a(Context context, String str) {
        return new Intent().setClassName(context, str);
    }

    public static String a(Class cls) {
        return cls.getCanonicalName().replace("Chimera", "");
    }

    public static Map a(byte[] bArr) {
        MessageDigest b = jhg.b("SHA-256");
        if (b == null) {
            return null;
        }
        String encodeToString = Base64.encodeToString(b.digest(bArr), 2);
        HashMap hashMap = new HashMap();
        hashMap.put("contentBinding", encodeToString);
        return hashMap;
    }

    public static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException();
        }
    }

    public static byte[] a(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            a();
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[FragmentTransaction.TRANSIT_ENTER_MASK];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read < 0) {
                    return instance.digest();
                }
                instance.update(bArr, 0, read);
            }
        } finally {
            fileInputStream.close();
        }
    }
}
