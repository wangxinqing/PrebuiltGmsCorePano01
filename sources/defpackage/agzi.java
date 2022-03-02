package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: agzi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agzi {
    private static final Method a;

    static {
        Method method = null;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            method = cls.getMethod("get", new Class[]{String.class, String.class});
            try {
                cls.getMethod("getInt", new Class[]{String.class, Integer.TYPE});
                cls.getMethod("getLong", new Class[]{String.class, Long.TYPE});
                a = method;
            } catch (Exception e) {
                e = e;
                try {
                    apev.a(e);
                    a = method;
                } catch (Throwable th) {
                    th = th;
                    a = method;
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            apev.a(e);
            a = method;
        } catch (Throwable th2) {
            th = th2;
            a = method;
            throw th;
        }
    }

    public static String a(String str, String str2) {
        try {
            return (String) a.invoke((Object) null, new Object[]{str, str2});
        } catch (Exception e) {
            Log.e("SystemProperties", "get error", e);
            return str2;
        }
    }
}
