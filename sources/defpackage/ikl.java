package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* renamed from: ikl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ikl extends anjf {
    public final Context a;
    ikm b = null;
    public final iki c;
    private final Executor d;

    public ikl(Context context, iki iki, Executor executor) {
        super((String) null);
        this.a = context;
        this.c = iki;
        this.d = executor;
    }

    public final void a(anir anir) {
        this.d.execute(new ikk(this, anir));
    }

    public final void a(RuntimeException runtimeException, anir anir) {
        Log.e("ClientLogging", "Internal logging error", runtimeException);
    }

    public final boolean a(Level level) {
        return ((long) level.intValue()) >= awya.a.b().b();
    }
}
