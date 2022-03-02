package defpackage;

import android.content.Context;
import android.os.UserHandle;
import android.os.UserManager;
import java.lang.reflect.Method;

/* renamed from: aaam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaam {
    public final UserManager a;
    public final Method b;
    public final Method c;
    public final Method d;

    public aaam(Context context) {
        Method method;
        Method method2;
        UserManager userManager = (UserManager) context.getSystemService("user");
        this.a = userManager;
        Class<?> cls = userManager.getClass();
        Method method3 = null;
        try {
            method = cls.getMethod("getUsers", new Class[0]);
        } catch (NoSuchMethodException e) {
            method = null;
        }
        this.b = method;
        try {
            method2 = cls.getMethod("getSerialNumbersOfUsers", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e2) {
            method2 = null;
        }
        this.c = method2;
        try {
            method3 = UserHandle.class.getMethod("isOwner", new Class[0]);
        } catch (NoSuchMethodException e3) {
        }
        this.d = method3;
    }
}
