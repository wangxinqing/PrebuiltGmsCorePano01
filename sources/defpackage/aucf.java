package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: aucf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aucf extends aucd implements audy {
    public aucf() {
        super((aucj) bhy.a);
    }

    public final void b(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        avco avco = (avco) this.b;
        avab avab = (avab) aucd.i();
        avco avco2 = avco.b;
        avab.getClass();
        if (!avco.a.a()) {
            avco.a = aucj.a(avco.a);
        }
        avco.a.add(avab);
    }

    public final void c() {
        super.c();
        aucg aucg = (aucg) this.b;
        aucg.m = aucg.m.clone();
    }

    /* renamed from: m */
    public final aucg h() {
        if (this.c) {
            return (aucg) this.b;
        }
        ((aucg) this.b).m.b();
        return (aucg) super.h();
    }

    public final void a(aubq aubq, Object obj) {
        Map map = aucj.V;
        auci auci = (auci) aubq;
        if (auci.a == this.a) {
            if (this.c) {
                c();
                this.c = false;
            }
            aubx aubx = ((aucg) this.b).m;
            if (aubx.b) {
                aubx = aubx.clone();
                ((aucg) this.b).m = aubx;
            }
            auch auch = auci.d;
            if (auch.a() == aufx.ENUM) {
                obj = Integer.valueOf(((auco) obj).a());
            }
            aubx.a(auch, obj);
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    public aucf(aucg aucg) {
        super((aucj) aucg);
    }

    public final void b(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        avda avda = (avda) this.b;
        avda avda2 = avda.h;
        if (!avda.e.a()) {
            avda.e = aucj.a(avda.e);
        }
        auab.a(iterable, (List) avda.e);
    }

    public final void a(aucd aucd) {
        if (this.c) {
            c();
            this.c = false;
        }
        auzs auzs = (auzs) this.b;
        auzu auzu = (auzu) aucd.i();
        auzs auzs2 = auzs.b;
        auzu.getClass();
        auzs.e();
        auzs.a.add(auzu);
    }

    public final void a(auzf auzf) {
        if (this.c) {
            c();
            this.c = false;
        }
        avae avae = (avae) this.b;
        avae avae2 = avae.h;
        auzf.getClass();
        if (!avae.d.a()) {
            avae.d = aucj.a(avae.d);
        }
        avae.d.add(auzf);
    }

    public final void a(avrn avrn) {
        if (this.c) {
            c();
            this.c = false;
        }
        avrm avrm = (avrm) this.b;
        avrm avrm2 = avrm.t;
        avrn.getClass();
        if (!avrm.i.a()) {
            avrm.i = aucj.a(avrm.i);
        }
        avrm.i.add(avrn);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        avae avae = (avae) this.b;
        avae avae2 = avae.h;
        avae.e();
        auab.a(iterable, (List) avae.b);
    }

    public final void a(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        avae avae = (avae) this.b;
        avae avae2 = avae.h;
        str.getClass();
        avae.e();
        avae.b.add(str);
    }
}
