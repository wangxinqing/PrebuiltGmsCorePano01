package defpackage;

import android.app.ApplicationErrorReport;
import android.os.StrictMode;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahhn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahhn extends ArrayList {
    final /* synthetic */ ahho a;

    public ahhn(ahho ahho) {
        this.a = ahho;
    }

    public final boolean add(Object obj) {
        int i;
        try {
            Field declaredField = Class.forName("android.os.StrictMode$ViolationInfo").getDeclaredField("crashInfo");
            declaredField.setAccessible(true);
            Method declaredMethod = StrictMode.class.getDeclaredMethod("parseViolationFromMessage", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            i = ((Integer) declaredMethod.invoke((Object) null, new Object[]{((ApplicationErrorReport.CrashInfo) declaredField.get(obj)).exceptionMessage})).intValue();
        } catch (InvocationTargetException e) {
            throw ((RuntimeException) e.getCause());
        } catch (Exception e2) {
            Log.e("ThreadStrictMode", "Unable to get violation.", e2);
            i = 0;
        }
        ahhy c = ahhz.c();
        c.a(i);
        c.a((List) amzy.a((Object[]) Thread.currentThread().getStackTrace()));
        ahhz a2 = c.a();
        if (i != 0 && ahho.a(this.a.a, a2)) {
            return true;
        }
        ahhy c2 = ahhz.c();
        c2.a(i);
        c2.a(((ahhl) a2).b);
        c2.a();
        anhk i2 = this.a.b.listIterator();
        boolean z = false;
        while (i2.hasNext()) {
            z |= ((ahhm) i2.next()).a() == 2;
        }
        if (z) {
            return true;
        }
        if (ahib.a == null) {
            try {
                Object invoke = Class.forName("dalvik.system.BlockGuard").getDeclaredMethod("getThreadPolicy", new Class[0]).invoke((Object) null, new Object[0]);
                Method declaredMethod2 = Class.forName("android.os.StrictMode$AndroidBlockGuardPolicy").getDeclaredMethod("handleViolation", new Class[]{obj.getClass()});
                declaredMethod2.setAccessible(true);
                ahib.a = new ahia(declaredMethod2, invoke);
            } catch (Exception e3) {
                Log.e("AndroidStrictMode", "Unable to handle violation. Will execute during next loop.", e3);
            }
        }
        ((Boolean) ahib.a.a(obj)).booleanValue();
        return super.add(obj);
    }
}
