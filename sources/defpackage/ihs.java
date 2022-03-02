package defpackage;

import android.content.Context;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.lang.ref.WeakReference;

/* renamed from: ihs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ihs extends BaseApplicationContext {
    private static ihs a;
    private static volatile WeakReference b = new WeakReference((Object) null);

    public ihs() {
        super((Context) null);
        a(this);
    }

    private static void a(ihs ihs) {
        synchronized (ihs.class) {
            irk.a((Object) a);
            a = ihs;
        }
    }

    public static boolean a() {
        return a != null;
    }

    public static ihs b() {
        irk.b(a);
        return a;
    }

    public static irc c() {
        irc irc = (irc) b.get();
        if (irc == null) {
            synchronized (ihs.class) {
                irc = (irc) b.get();
                if (irc == null) {
                    irc = new iqz();
                    b = new WeakReference(irc);
                }
            }
        }
        return irc;
    }

    public ihs(Context context, BaseApplicationContext baseApplicationContext) {
        super(context, baseApplicationContext);
        a(this);
    }
}
