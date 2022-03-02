package defpackage;

/* renamed from: njf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class njf {
    public static void a() {
        boolean z;
        int P = (int) axda.a.a().P();
        jge jge = new jge(P != 0 ? amri.b(new jgc(P)) : ampu.a);
        if (qvr.e == null) {
            qvr.e = jge;
            jga jga = new jga();
            if (qvj.b == qvj.a) {
                qvj.b = jga;
                jfe jfe = new jfe();
                if (qvl.b == qvl.a) {
                    qvl.b = jfe;
                    axdc axdc = new axdc();
                    njz njz = new njz();
                    if (qvu.d == qvu.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    amrl.b(z);
                    amrl.a((Object) axdc);
                    qvu.c = axdc;
                    amrl.a((Object) njz);
                    qvu.d = njz;
                    if (axda.a.a().y()) {
                        nka nka = new nka();
                        amrl.a((Object) nka);
                        bhw.a(nka);
                    }
                    itf.a = new njv();
                    if (axda.a.a().t()) {
                        acwl.a = nkv.a;
                    }
                    amkz amkz = nku.a;
                    return;
                }
                throw new IllegalStateException("dup init");
            }
            throw new IllegalStateException("Trying to install an ExecutorFactory twice!");
        }
        throw new IllegalStateException("Duplicate install");
    }
}
