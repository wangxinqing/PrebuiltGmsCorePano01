package defpackage;

import android.content.Context;
import android.os.UserHandle;
import android.os.UserManager;
import java.lang.reflect.InvocationTargetException;

/* renamed from: jno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jno extends jnn {
    public final int c() {
        try {
            return ((Integer) UserHandle.class.getMethod("myUserId", new Class[0]).invoke((Object) null, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return 0;
        }
    }

    public final int c(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        Class<UserManager> cls = UserManager.class;
        try {
            return ((Integer) cls.getMethod("getUserSerialNumber", new Class[]{Integer.TYPE}).invoke(userManager, new Object[]{Integer.valueOf(c())})).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            return 0;
        }
    }
}
