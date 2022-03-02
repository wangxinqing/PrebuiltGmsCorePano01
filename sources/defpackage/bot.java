package defpackage;

import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: bot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bot {
    public final int a;
    public final String b;
    public final Constructor c;
    public final Object[] d;
    public final Method e;

    public bot(int i, String str, Constructor constructor, Object[] objArr, Method method) {
        this.a = i;
        this.b = str;
        this.c = constructor;
        this.d = objArr;
        this.e = method;
    }

    public final Object a(Class cls) {
        bnu bnu;
        try {
            Constructor constructor = this.c;
            if (constructor != null) {
                bnu = (bnu) constructor.newInstance(this.d);
            } else {
                Method method = this.e;
                if (method != null) {
                    bnu = (bnu) method.invoke((Object) null, new Object[0]);
                    if (bnu == null) {
                        String str = this.b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55);
                        sb.append("Failed to instantiate ");
                        sb.append(str);
                        sb.append(": ");
                        sb.append("provideInstance");
                        sb.append("() returned null");
                        Log.e("ChimeraProxyRslvr", sb.toString());
                        return null;
                    }
                } else {
                    bnu = null;
                }
            }
            if (bnu != null) {
                return cls.cast(bnu.getChimeraImpl());
            }
            return null;
        } catch (ClassCastException | IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            if ((e2 instanceof IllegalAccessException) || (e2 instanceof ClassCastException)) {
                String str2 = this.b;
                String valueOf = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 24 + String.valueOf(valueOf).length());
                sb2.append("Failed to instantiate ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(valueOf);
                Log.e("ChimeraProxyRslvr", sb2.toString());
            } else if (!(e2 instanceof InvocationTargetException)) {
                String str3 = this.b;
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 24 + String.valueOf(valueOf2).length());
                sb3.append("Failed to instantiate ");
                sb3.append(str3);
                sb3.append(": ");
                sb3.append(valueOf2);
                Log.e("ChimeraProxyRslvr", sb3.toString(), e2.getCause());
            } else {
                String str4 = this.b;
                String valueOf3 = String.valueOf(e2);
                StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 24 + String.valueOf(valueOf3).length());
                sb4.append("Failed to instantiate ");
                sb4.append(str4);
                sb4.append(": ");
                sb4.append(valueOf3);
                Log.e("ChimeraProxyRslvr", sb4.toString());
                throw new RuntimeException(e2.getCause());
            }
            return null;
        }
    }
}
