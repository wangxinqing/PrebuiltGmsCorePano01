package defpackage;

import java.util.logging.Level;

/* renamed from: anhq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anhq extends anhl {
    public static final anhp a = new anhp();

    public anhq(anis anis) {
        super(anis);
    }

    @Deprecated
    public static anhq a(String str) {
        if (!str.isEmpty()) {
            return new anhq(aniy.a(str.replace('/', '.')));
        }
        throw new IllegalArgumentException("injected class name is empty");
    }

    /* renamed from: a */
    public final anhn b(Level level) {
        boolean c = c(level);
        boolean a2 = aniy.a(this.b.a(), level, c);
        return (!c && !a2) ? a : new anho(this, level, a2);
    }
}
