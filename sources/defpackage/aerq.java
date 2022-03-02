package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aerq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aerq extends awem {
    private final awef b;

    private aerq(bapu bapu, bapu bapu2, awef awef) {
        super(bapu2, awey.a(aerq.class), bapu);
        this.b = aweu.a(awef);
    }

    public static aerq a(bapu bapu, bapu bapu2, awef awef) {
        return new aerq(bapu, bapu2, awef);
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        return aopr.a((aorr) ((amsv) obj).a(), aerp.a, (Executor) aoqm.a);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return this.b.b();
    }
}
