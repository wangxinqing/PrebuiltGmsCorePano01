package defpackage;

/* renamed from: nfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nfg {
    private static final nfg b;
    public final nfb a = new nfb();
    private final nfa c = new nfa();

    static {
        nfg nfg = new nfg();
        synchronized (nfg.class) {
            b = nfg;
        }
    }

    private nfg() {
    }

    public static nfg a() {
        nfg nfg;
        synchronized (nfg.class) {
            nfg = b;
        }
        return nfg;
    }

    public static nfa b() {
        return a().c;
    }
}
