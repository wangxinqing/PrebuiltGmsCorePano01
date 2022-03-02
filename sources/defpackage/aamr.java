package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aamr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aamr {
    private static final String a = aamr.class.getSimpleName();

    public static Intent a(Context context, Class cls) {
        return new Intent().setClassName(context, cls.getCanonicalName().replace("Chimera", ""));
    }

    public static Map a(byte[] bArr) {
        MessageDigest a2 = jhh.a("SHA-256");
        if (a2 == null) {
            return null;
        }
        String encodeToString = Base64.encodeToString(a2.digest(bArr), 2);
        HashMap hashMap = new HashMap();
        hashMap.put("contentBinding", encodeToString);
        return hashMap;
    }

    public static boolean a(Context context, String str) {
        try {
            hya.a(context).a(str);
            return true;
        } catch (SecurityException e) {
            Log.e(a, String.format("%s: %s", new Object[]{e.getMessage(), e.getCause()}));
            return false;
        }
    }

    public static byte[] a(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                byte[] bArr = new byte[FragmentTransaction.TRANSIT_ENTER_MASK];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read < 0) {
                        return instance.digest();
                    }
                    instance.update(bArr, 0, read);
                }
            } else {
                throw new IllegalStateException();
            }
        } finally {
            fileInputStream.close();
        }
    }
}
