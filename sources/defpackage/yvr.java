package defpackage;

import com.google.android.gms.plus.service.v1whitelisted.models.PeopleFeed;

/* renamed from: yvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yvr extends irq {
    private final PeopleFeed a;

    public yvr(ywg ywg, yrm yrm, PeopleFeed peopleFeed) {
        super(ywg, yrm);
        this.a = peopleFeed;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        yrm yrm = (yrm) obj;
        PeopleFeed peopleFeed = this.a;
        yrm.b = peopleFeed;
        yrm.deliverResult(peopleFeed);
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }
}
