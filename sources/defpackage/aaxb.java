package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: aaxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaxb {
    private static Method f;
    private static Method g;
    private static Method h;
    private static Method i;
    private static Method j;
    public final Integer a;
    final long b;
    final long c;
    final long d;
    final long e;

    public aaxb(Object obj) {
        Integer num;
        if (f == null) {
            Class<?> cls = obj.getClass();
            f = cls.getMethod("getOp", new Class[0]);
            g = cls.getMethod("getTime", new Class[0]);
            if (Build.VERSION.SDK_INT >= 29) {
                h = cls.getMethod("getLastAccessBackgroundTime", new Class[]{Integer.TYPE});
            } else if (Build.VERSION.SDK_INT == 28) {
                h = cls.getMethod("getLastAccessBackgroundTime", new Class[0]);
            }
            i = cls.getMethod("getRejectTime", new Class[0]);
            j = cls.getMethod("getDuration", new Class[0]);
        }
        int indexOfKey = aaxe.b.indexOfKey(((Integer) f.invoke(obj, new Object[0])).intValue());
        if (indexOfKey >= 0) {
            num = Integer.valueOf(aaxe.b.valueAt(indexOfKey));
        } else {
            num = null;
        }
        this.a = num;
        this.b = ((Long) g.invoke(obj, new Object[0])).longValue();
        if (Build.VERSION.SDK_INT >= 29) {
            this.c = ((Long) h.invoke(obj, new Object[]{31})).longValue();
        } else {
            this.c = Build.VERSION.SDK_INT == 28 ? ((Long) h.invoke(obj, new Object[0])).longValue() : 0;
        }
        this.d = ((Long) i.invoke(obj, new Object[0])).longValue();
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = ((Long) j.invoke(obj, new Object[0])).longValue();
        } else {
            this.e = (long) ((Integer) j.invoke(obj, new Object[0])).intValue();
        }
    }
}
