package defpackage;

import android.os.Looper;
import android.os.StrictMode;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: ahho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahho implements ahhv {
    public final amzy a;
    public final amzy b;

    public ahho(amzy amzy, amzy amzy2) {
        amrl.b(!mm.a(), (Object) "reflection does not work on P");
        this.a = amzy;
        this.b = amzy2;
    }

    static boolean a(amzy amzy, ahhz ahhz) {
        anhk i = amzy.listIterator();
        while (i.hasNext()) {
            Integer num = (Integer) ((amqy) i.next()).a(ahhz);
            if (num != null && ((num.intValue() ^ -1) & ((ahhl) ahhz).a) == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        boolean z;
        StrictMode.ThreadPolicy b2 = ahhr.b(new StrictMode.ThreadPolicy.Builder().build());
        if (Looper.myLooper() != null) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, (Object) "Whitelisting is only available on threads with Loopers.");
        Field declaredField = StrictMode.class.getDeclaredField("violationsBeingTimed");
        declaredField.setAccessible(true);
        ThreadLocal threadLocal = (ThreadLocal) declaredField.get((Object) null);
        ((ArrayList) threadLocal.get()).clear();
        threadLocal.set(new ahhn(this));
        ahhr.a(new StrictMode.ThreadPolicy.Builder(b2).penaltyLog().build());
    }
}
