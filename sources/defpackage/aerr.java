package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: aerr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aerr extends awem {
    private final awef b;
    private final awef c;
    private final awef d;

    private aerr(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        super(bapu2, awey.a(aerr.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
        this.d = aweu.a(awef3);
    }

    public static aerr a(bapu bapu, bapu bapu2, awef awef, awef awef2, awef awef3) {
        return new aerr(bapu, bapu2, awef, awef2, awef3);
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        List list = (List) obj;
        auls auls = (auls) baos.a(new aulr(), (azxi) list.get(0));
        azxi azxi = auls.a;
        azxh azxh = new azxh(auls.b);
        azxh.d = (azxf) list.get(1);
        auls auls2 = (auls) auls.a(azxi, azxh);
        return aorl.a((Object) (auls) auls2.a(auls2.a, auls2.b.a(((aeri) list.get(2)).v(), TimeUnit.SECONDS)));
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return aorl.a(this.b.b(), this.c.b(), this.d.b());
    }
}
