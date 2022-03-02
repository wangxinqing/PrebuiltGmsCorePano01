package defpackage;

/* renamed from: agsr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agsr {
    public static agtf a(Exception exc) {
        anab h = anaf.h();
        h.a(babk.class, agsl.a);
        h.a(babl.class, agsm.a);
        h.a(agnz.class, agsn.a);
        h.a(agob.class, agso.a);
        h.a(agoc.class, agsp.a);
        h.a(agoa.class, agsq.a);
        anaf a = h.a();
        for (Throwable th : amtb.c(exc)) {
            amqy amqy = (amqy) a.get(th.getClass());
            if (amqy != null) {
                return (agtf) amqy.a(th);
            }
        }
        return agtf.a(3);
    }
}
