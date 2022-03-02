package defpackage;

import android.os.Looper;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: rfr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rfr extends rem {
    final /* synthetic */ LocationRequestInternal a;
    final /* synthetic */ reh b;
    final /* synthetic */ Looper c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rfr(icc icc, LocationRequestInternal locationRequestInternal, reh reh, Looper looper) {
        super(icc);
        this.a = locationRequestInternal;
        this.b = reh;
        this.c = looper;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((rgu) ibf).b(this.a, igf.a(this.b, rop.a(this.c), reh.class.getSimpleName()), new rfv(this));
    }
}
