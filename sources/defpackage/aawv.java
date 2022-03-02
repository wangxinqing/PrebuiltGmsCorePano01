package defpackage;

import dalvik.system.DexClassLoader;

/* renamed from: aawv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aawv extends DexClassLoader {
    public aawv(String str, String str2, ClassLoader classLoader) {
        super(str, str2, (String) null, classLoader);
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
