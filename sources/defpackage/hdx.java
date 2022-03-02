package defpackage;

import android.content.Context;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.ModuleContext;
import java.lang.reflect.Constructor;

/* renamed from: hdx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hdx extends bmp {
    public hdx() {
        this(hdt.b());
    }

    public final IntentOperation a(Constructor constructor, Context context) {
        if (!axda.a.a().l()) {
            return super.a(constructor, context);
        }
        njy njy = new njy(context, constructor.getDeclaringClass(), 3);
        amky b = njy.b("constructor");
        try {
            IntentOperation a = super.a(constructor, context);
            if (b != null) {
                b.close();
            }
            return new hdw(a, njy);
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public hdx(hdt hdt) {
        super(hdt);
    }

    public final void a(IntentOperation intentOperation, Context context) {
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext != null && (moduleContext.getModuleApk() instanceof bkw)) {
            context = new hdv(this, context);
        }
        intentOperation.init(context);
    }
}
