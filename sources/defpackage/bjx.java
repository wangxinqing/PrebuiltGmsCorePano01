package defpackage;

import android.content.Context;
import com.google.android.chimera.ModuleContext;
import java.io.File;

/* renamed from: bjx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class bjx {
    public final Context a;
    public final File b;
    protected final File c;
    public volatile boolean d;

    protected bjx(Context context, String str) {
        File file;
        Context applicationContext = context.getApplicationContext();
        amtf.a((Object) applicationContext);
        ModuleContext moduleContext = ModuleContext.getModuleContext(applicationContext);
        Context baseContext = moduleContext != null ? moduleContext.getBaseContext() : applicationContext;
        boolean z = true;
        if (aekv.a()) {
            baseContext = aekv.c(baseContext);
            baseContext = baseContext.getApplicationContext() == null ? new bjw(baseContext) : baseContext;
            file = bkq.a(baseContext);
            if (!a(file, str).exists() && (baseContext.getApplicationInfo().flags & 129) != 1) {
                z = false;
            }
        } else {
            file = bkq.a(baseContext);
        }
        this.a = baseContext;
        this.b = file;
        this.c = a(file, str);
        this.d = z;
    }

    protected static File a(File file, String str) {
        return new File(file, str);
    }

    public final boolean b() {
        return !a() && !aekv.b(this.a);
    }

    public final boolean c() {
        return !a() && aekv.b(this.a);
    }

    public final boolean a() {
        boolean z = this.d;
        if (z || !this.c.exists()) {
            return z;
        }
        this.d = true;
        return true;
    }
}
