package defpackage;

import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: aeui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeui extends awem {
    private final awef b;
    private final awef c;

    public aeui(bapu bapu, bapu bapu2, awef awef, awef awef2) {
        super(bapu2, awey.a(aeui.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), aweu.a(this.c.b()));
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        Void voidR = (Void) list.get(0);
        try {
            ((awee) list.get(1)).a();
            throw new IllegalStateException("Token revocation should always throw!");
        } catch (ExecutionException e) {
            if (e.getCause() instanceof aern) {
                throw new aern(e);
            }
            throw e;
        }
    }
}
