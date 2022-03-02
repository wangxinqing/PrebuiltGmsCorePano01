package defpackage;

import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: aeyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeyu extends awem {
    private final awef b;
    private final awef c;
    private final awef d;

    public aeyu(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        super(bapu2, awey.a(aeyu.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(aweu.a(this.b.b()), aweu.a(this.c.b()), this.d.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        awee awee = (awee) list.get(0);
        awee awee2 = (awee) list.get(1);
        afgh afgh = (afgh) list.get(2);
        try {
            aucd o = aokp.o.o();
            aoko aoko = (aoko) awee.a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aokp aokp = (aokp) o.b;
            aoko.getClass();
            aokp.i = aoko;
            aokp.a |= 128;
            aokn aokn = (aokn) awee2.a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aokp aokp2 = (aokp) o.b;
            aokn.getClass();
            aokp2.h = aokn;
            aokp2.a |= 64;
            aokp aokp3 = (aokp) o.i();
            afgh.close();
            return aorl.a((Object) aokp3);
        } catch (ExecutionException e) {
            throw afgh.a(e.getCause(), Exception.class);
        } catch (Throwable th) {
            afgh.close();
            throw th;
        }
    }
}
