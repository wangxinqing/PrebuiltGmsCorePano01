package defpackage;

import android.util.Log;
import dalvik.system.PathClassLoader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/* renamed from: bnw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bnw extends PathClassLoader {
    public bnw(String str, String str2, ClassLoader classLoader) {
        super(str, str2, classLoader);
    }

    static void a(List list, Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            list.add((URL) enumeration.nextElement());
        }
    }

    public final URL getResource(String str) {
        URL url;
        ClassLoader systemClassLoader = getSystemClassLoader();
        if (systemClassLoader == null) {
            Log.w("DelegateLastPathClssLdr", "Failed to get SystemClassLoader");
            url = null;
        } else {
            url = systemClassLoader.getResource(str);
        }
        return url == null ? findResource(str) : url;
    }

    public final Enumeration getResources(String str) {
        ArrayList arrayList = new ArrayList();
        ClassLoader systemClassLoader = getSystemClassLoader();
        if (systemClassLoader != null) {
            a(arrayList, systemClassLoader.getResources(str));
        } else {
            Log.w("DelegateLastPathClssLdr", "Failed to get SystemClassLoader");
        }
        a(arrayList, findResources(str));
        return Collections.enumeration(arrayList);
    }

    /* access modifiers changed from: protected */
    public final Class loadClass(String str, boolean z) {
        if (!str.startsWith("java.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException e) {
            }
        }
        return super.loadClass(str, z);
    }
}
