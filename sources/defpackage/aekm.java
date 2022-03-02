package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: aekm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aekm {
    private static volatile boolean a;

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        return String.format(Locale.US, "%016x", new Object[]{Long.valueOf(Long.parseLong(str) & -2)});
    }

    public static String b(String str, String str2) {
        if (str == null || str2 == null || a) {
            return null;
        }
        return a(str, a(str2));
    }

    public static String a(String str, String str2) {
        if (str == null || str2 == null || a) {
            return null;
        }
        try {
            String format = String.format(Locale.US, "%s:%d:%s", new Object[]{str, 1, str2});
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(format.getBytes("UTF-8"));
            return aekq.a(instance.digest()).toLowerCase(Locale.US);
        } catch (NoSuchAlgorithmException e) {
            a = true;
            throw new Exception("No SHA-256 algorithm");
        }
    }
}
