package defpackage;

/* renamed from: akvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akvh implements Runnable {
    final /* synthetic */ akvl a;

    public akvh(akvl akvl) {
        this.a = akvl;
    }

    public final void run() {
        ou ouVar;
        akhm akhm = this.a.f.b;
        akpb akpb = akhm.a;
        akpt akpt = akpb.b;
        akpt.h = false;
        akpt.j.a.b();
        akpb.a.a();
        akpa akpa = akpb.c;
        int i = 0;
        while (true) {
            ouVar = akpa.d;
            if (i >= ouVar.h) {
                break;
            }
            ((akrh) ouVar.c(i)).b();
            i++;
        }
        ouVar.clear();
        akpb.e.clear();
        akpb.d = false;
        akup akup = akhm.b;
        akup.d.a();
        akup.c.b(akup);
        akyn akyn = this.a.h;
        akxy akxy = akyn.f;
        akxy.n = null;
        akxy.a();
        akyn.m.a(akyn.b, false);
        akyn.g.b();
        akxr akxr = akyn.i;
        if (akxr.d) {
            akxr.a(true);
            akxr.d = false;
            akxr.b = null;
        }
        icc icc = akyn.k;
        icc.a((ica) new akyb(akyn, icc));
        this.a.g.b.shutdown();
        this.a.d.shutdown();
        this.a.e.shutdown();
        this.a.l.shutdown();
        this.a.b.quit();
        this.a.m.shutdown();
    }
}
