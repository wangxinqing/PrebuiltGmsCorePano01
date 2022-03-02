package defpackage;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* renamed from: jns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jns extends jnr {
    private int f;
    private int g;

    public jns() {
        try {
            Class<?> cls = Class.forName("android.app.admin.SystemUpdatePolicy");
            this.f = cls.getField("TYPE_INSTALL_AUTOMATIC").getInt((Object) null);
            this.g = cls.getField("TYPE_INSTALL_WINDOWED").getInt((Object) null);
            cls.getField("TYPE_POSTPONE").getInt((Object) null);
        } catch (ClassNotFoundException e) {
        } catch (NoSuchFieldException e2) {
        } catch (IllegalAccessException e3) {
        }
    }

    private static final int c(Object obj) {
        try {
            return ((Integer) Class.forName("android.app.admin.SystemUpdatePolicy").getMethod("getPolicyType", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return -1;
        }
    }

    public final boolean a(Object obj) {
        return c(obj) == this.f;
    }

    public final boolean b(Object obj) {
        return c(obj) == this.g;
    }

    public final Object f(Context context) {
        try {
            return DevicePolicyManager.class.getMethod("getSystemUpdatePolicy", new Class[0]).invoke((DevicePolicyManager) context.getSystemService("device_policy"), new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return null;
        }
    }
}
