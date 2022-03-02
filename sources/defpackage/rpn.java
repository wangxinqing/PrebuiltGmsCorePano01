package defpackage;

import android.content.ComponentName;

/* renamed from: rpn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rpn {
    public static ansc a(ComponentName componentName) {
        aucd o = ansc.d.o();
        String className = componentName.getClassName();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ansc ansc = (ansc) o.b;
        className.getClass();
        ansc.a |= 2;
        ansc.c = className;
        String packageName = componentName.getPackageName();
        if (o.c) {
            o.c();
            o.c = false;
        }
        ansc ansc2 = (ansc) o.b;
        packageName.getClass();
        ansc2.a |= 1;
        ansc2.b = packageName;
        return (ansc) o.i();
    }
}
