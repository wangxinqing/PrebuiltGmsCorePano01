package defpackage;

import java.util.logging.Level;

/* renamed from: anhl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class anhl {
    public final anis b;

    protected anhl(anis anis) {
        ankq.a(anis, "backend");
        this.b = anis;
    }

    public final anie b() {
        return b(Level.SEVERE);
    }

    public abstract anie b(Level level);

    public final anie c() {
        return b(Level.WARNING);
    }

    public final anie d() {
        return b(Level.INFO);
    }

    /* access modifiers changed from: protected */
    public final boolean c(Level level) {
        return this.b.a(level);
    }
}
