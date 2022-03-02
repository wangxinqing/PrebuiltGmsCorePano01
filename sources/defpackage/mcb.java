package defpackage;

import android.content.Context;
import android.os.IBinder;

/* renamed from: mcb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class mcb {
    private final String a;
    private Object b;

    protected mcb(String str) {
        this.a = str;
    }

    public final Object a(Context context) {
        if (this.b == null) {
            iva.a((Object) context);
            Context i = hxz.i(context);
            if (i != null) {
                try {
                    this.b = a((IBinder) i.getClassLoader().loadClass(this.a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new mca("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new mca("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new mca("Could not access creator.", e3);
                }
            } else {
                throw new mca("Could not get remote context.");
            }
        }
        return this.b;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(IBinder iBinder);
}
