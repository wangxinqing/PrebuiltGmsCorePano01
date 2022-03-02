package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: crc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class crc {
    public static final /* synthetic */ int a = 0;
    private static final String b = crc.class.getName();

    private crc() {
    }

    public static String a(Object obj) {
        String valueOf = String.valueOf(obj);
        if (obj == null || TextUtils.isEmpty(valueOf)) {
            return valueOf;
        }
        String a2 = a(valueOf.getBytes());
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 2);
        sb.append("[");
        sb.append(a2);
        sb.append("]");
        return sb.toString();
    }

    public static void b(String str, String str2, Object... objArr) {
        Log.i(str, a(str2, objArr));
    }

    public static String a(String str, Object... objArr) {
        String str2;
        try {
            if (objArr.length != 0) {
                str = String.format(Locale.US, str, objArr);
            }
        } catch (IllegalFormatException e) {
            String arrays = Arrays.toString(objArr);
            Log.wtf("Blog", a("msg: \"%s\" args: %s", str, arrays), new crd(e));
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(arrays).length());
            sb.append(str);
            sb.append(" ");
            sb.append(arrays);
            str = sb.toString();
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            String className = stackTraceElement.getClassName();
            if (!className.equals(b) && !className.endsWith("Log")) {
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String methodName = stackTraceElement.getMethodName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 1 + String.valueOf(methodName).length());
                sb2.append(substring);
                sb2.append(".");
                sb2.append(methodName);
                str2 = sb2.toString();
                break;
            }
            i++;
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }

    public static String a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        Log.e(str, a(str2, objArr));
    }

    public static void a(String str, Throwable th, String str2, Object... objArr) {
        Log.w(str, a(str2, objArr), th);
    }
}
