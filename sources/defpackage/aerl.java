package defpackage;

import java.util.List;

/* renamed from: aerl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aerl extends awem {
    private final awef b;
    private final awef c;

    private aerl(bapu bapu, bapu bapu2, awef awef, awef awef2) {
        super(bapu2, awey.a(aerl.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
    }

    public static aerl a(bapu bapu, bapu bapu2, awef awef, awef awef2) {
        return new aerl(bapu, bapu2, awef, awef2);
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        return aorl.a((Object) ((aerk) list.get(0)).b((String) list.get(1)));
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b());
    }
}
