package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;

/* renamed from: rfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rfi extends rcc {
    final /* synthetic */ PendingIntent a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rfi(icc icc, PendingIntent pendingIntent) {
        super(icc);
        this.a = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((rgu) ibf).a(this.a);
        a((icl) Status.a);
    }
}
