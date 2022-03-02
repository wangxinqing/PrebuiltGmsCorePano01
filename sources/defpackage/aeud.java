package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: aeud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeud extends awem {
    private final awef b;
    private final awef c;

    public aeud(bapu bapu, bapu bapu2, awef awef, awef awef2) {
        super(bapu2, awey.a(aeud.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aweu.a(this.b.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        awee awee = (awee) obj;
        awef awef = this.c;
        try {
            return aorl.a((Object) (aokp) awee.a());
        } catch (ExecutionException e) {
            if (babj.a((Throwable) e).r == babj.j.r) {
                return awef.b();
            }
            throw e;
        }
    }
}
