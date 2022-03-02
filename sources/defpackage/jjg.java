package defpackage;

import java.util.logging.Level;

/* renamed from: jjg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jjg extends anij {
    public static final anif a = anif.a("service_id", Integer.class);
    private final iyc d;

    public jjg(anis anis, iyc iyc) {
        super(anis);
        this.d = iyc;
    }

    public static jjg a() {
        return new jjg(aniy.a(aniy.a().a(jjg.class)), iyc.UNKNOWN);
    }

    public static jjg a(iyc iyc) {
        return new jjg(aniy.a(aniy.a().a(jjg.class)), iyc);
    }

    public static jjg a(String str) {
        return new jjg(aniy.a(str), iyc.UNKNOWN);
    }

    public static jjg a(String str, iyc iyc) {
        return new jjg(aniy.a(str), iyc);
    }

    /* renamed from: a */
    public final anih b(Level level) {
        iyc iyc;
        if (!c(level)) {
            return anij.c;
        }
        Integer num = null;
        if (this.d != iyc.UNKNOWN) {
            iyc = this.d;
        } else {
            iyc = null;
        }
        jjf jjf = new jjf(this, level);
        anif anif = a;
        if (iyc != null) {
            num = Integer.valueOf(iyc.a());
        }
        ankq.a(anif, "metadata key");
        if (num != null) {
            jjf.a(anif, (Object) num);
        }
        jjf.a(anhy.a);
        return jjf;
    }
}
