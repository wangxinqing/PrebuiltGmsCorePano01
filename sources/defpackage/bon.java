package defpackage;

import com.google.android.chimera.ModuleContext;
import java.util.Map;

/* renamed from: bon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bon {
    public static final Map e = qug.a();
    public final bms a;
    public final ModuleContext b;
    public final ClassLoader c;
    public final bon d;

    public bon(bms bms, ModuleContext moduleContext, ClassLoader classLoader, bon bon) {
        this.a = bms;
        this.b = moduleContext;
        this.c = classLoader;
        this.d = bon == null ? this : bon;
    }
}
