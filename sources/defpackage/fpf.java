package defpackage;

import java.util.concurrent.Executor;

/* renamed from: fpf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fpf implements aoqb {
    private final fpl a;
    private final amzy b;
    private final amzy c;

    public fpf(fpl fpl, amzy amzy, amzy amzy2) {
        this.a = fpl;
        this.b = amzy;
        this.c = amzy2;
    }

    public final aorr a(Object obj) {
        Object a2;
        aorr aorr;
        fpl fpl = this.a;
        amzy amzy = this.b;
        amzy amzy2 = this.c;
        Boolean bool = (Boolean) obj;
        if (amzy.size() > 1) {
            return fpl.a(bool.booleanValue());
        }
        fkw fkw = fpl.f;
        String str = fpl.c;
        flm flm = fkw.a;
        flf flf = flm.e;
        iva.a((Object) flf);
        iva.c(str);
        synchronized (flm.c) {
            fla fla = flm.b;
            String b2 = fbx.b(str);
            a2 = fla.a(flk.b, new String[]{"---", b2, flf.a}, new fli(flf), flf.b);
            if (a2 == null) {
                a2 = flf.b;
            }
        }
        if (!((Boolean) a2).booleanValue()) {
            aorr = aorl.a((Object) false);
        } else {
            aorr = qay.a(amzy.a(anbs.a((Iterable) amzy2, (amqy) new fph(fpl))), fpi.a);
        }
        return aopr.a(aorr, (aoqb) new fpk(fpl, bool, amzy), (Executor) aoqm.a);
    }
}
