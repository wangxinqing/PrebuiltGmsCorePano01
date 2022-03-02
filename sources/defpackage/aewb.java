package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: aewb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aewb extends awem {
    private final bapu b;
    private final awef c;
    private final awef d;

    public aewb(bapu bapu, bapu bapu2, bapu bapu3, awef awef, awef awef2) {
        super(bapu2, awey.a(aewb.class), bapu);
        this.b = bapu3;
        this.c = aweu.a(awef);
        this.d = aweu.a(awef2);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aweu.a(this.c.b());
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        awee awee = (awee) obj;
        awdn b2 = awds.b(this.b);
        awef awef = this.d;
        try {
            return aorl.a((Object) (Void) awee.a());
        } catch (ExecutionException e) {
            if (e.getCause() instanceof afen) {
                ((pdg) b2.a()).a("Storing changes with delta failed!", e);
                return awef.b();
            }
            throw e;
        }
    }
}
