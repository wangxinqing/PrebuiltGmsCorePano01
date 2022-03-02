package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.framework.tracing.AbstractGmsTracer;

/* renamed from: njy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class njy extends AbstractGmsTracer implements qvs {
    public njy(Context context, Class cls, int i) {
        super(cls.getClassLoader(), i, context, cls.getSimpleName());
    }

    public static amky a(njy njy, String str) {
        if (njy != null) {
            return njy.b(str);
        }
        return null;
    }

    public final amky b(String str) {
        return a(str, false);
    }

    public static amky a(njy njy, String str, int i) {
        if (njy != null) {
            return njy.a(njy.a(str), amta.a((Object) (nig) njt.a.get(Integer.valueOf(i))), (Intent) null, false);
        }
        return null;
    }

    public njy(Context context, Class cls, int i, String str) {
        super(cls.getClassLoader(), i, context, str);
    }

    public njy(Class cls, int i, String str) {
        super(cls.getClassLoader(), i, str, cls.getSimpleName());
    }

    public njy(Class cls, int i, String str, String str2) {
        super(cls.getClassLoader(), i, str2, str);
    }

    public final amky a(ComponentName componentName, String str) {
        String className = !"com.google.android.gms".equals(componentName.getPackageName()) ? "external" : componentName.getClassName();
        StringBuilder a = a(className.length() + str.length() + 1);
        a.append(className);
        a.append('_');
        a.append(str);
        return a(a.toString(), (amsv) null, (Intent) null, false);
    }

    public final amky a(String str, Intent intent) {
        return a(a(str), (amsv) null, intent, false);
    }

    public final amky a(String str, qvx qvx) {
        iva.a((Object) qvx);
        return a(str, true);
    }
}
