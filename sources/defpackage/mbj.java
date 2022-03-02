package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Map;

/* renamed from: mbj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mbj {
    public final Object a;
    public final byte[] b;
    public final mas c;

    public mbj(Class cls, Context context, Parcelable parcelable) {
        this.b = new byte[0];
        this.c = null;
        try {
            this.a = cls.getDeclaredConstructor(new Class[]{Context.class, Parcelable.class}).newInstance(new Object[]{context, parcelable});
        } catch (Exception e) {
            throw new mbf(this.b, (Throwable) e);
        }
    }

    public final boolean a() {
        try {
            return ((Boolean) this.a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.a, new Object[0])).booleanValue();
        } catch (Exception e) {
            throw new mbf(this.b, (Throwable) e);
        }
    }

    public final void b() {
        try {
            this.a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.a, new Object[0]);
        } catch (Exception e) {
            throw new mbf(this.b, (Throwable) e);
        }
    }

    public final byte[] a(Map map) {
        try {
            return (byte[]) this.a.getClass().getDeclaredMethod("run", new Class[]{Map.class}).invoke(this.a, new Object[]{map});
        } catch (Exception e) {
            throw new mbf(this.b, (Throwable) e);
        }
    }

    public mbj(Class cls, Context context, String str, mas mas, Object obj, byte[] bArr, Bundle bundle) {
        this.b = bArr;
        this.c = mas;
        try {
            this.a = cls.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class}).newInstance(new Object[]{context, str, mas.a, obj, bundle});
        } catch (Exception e) {
            throw new mbf(bArr, (Throwable) e);
        }
    }
}
