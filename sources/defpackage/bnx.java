package defpackage;

import android.util.Log;
import dalvik.system.DelegateLastClassLoader;
import dalvik.system.DexFile;
import java.io.IOException;

/* renamed from: bnx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bnx {
    public static ClassLoader a(String str, String str2, ClassLoader classLoader) {
        if (bos.a()) {
            return new DelegateLastClassLoader(str, str2, classLoader, false);
        }
        return new bnw(str, str2, classLoader);
    }

    public static boolean a() {
        return !bos.a();
    }

    public static boolean a(String str) {
        if (!a()) {
            return false;
        }
        try {
            return DexFile.isDexOptNeeded(str);
        } catch (Error e) {
            if ("dalvik.system.StaleDexCacheError".equals(e.getClass().getName())) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                sb.append("Failed to check optimization status: ");
                sb.append(valueOf);
                Log.e("ClsLdrUtils", sb.toString());
                return true;
            }
            throw e;
        } catch (IOException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 37);
            sb2.append("Failed to check optimization status: ");
            sb2.append(valueOf2);
            Log.e("ClsLdrUtils", sb2.toString());
            return true;
        }
    }
}
