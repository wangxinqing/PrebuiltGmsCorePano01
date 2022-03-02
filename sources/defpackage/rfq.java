package defpackage;

import android.os.Looper;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: rfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rfq extends rem {
    final /* synthetic */ LocationRequestInternal a;
    final /* synthetic */ rei b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rfq(icc icc, LocationRequestInternal locationRequestInternal, rei rei) {
        super(icc);
        this.a = locationRequestInternal;
        this.b = rei;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        ((rgu) ibf).a(this.a, igf.a(this.b, rop.a((Looper) null), rei.class.getSimpleName()), (rge) new rfv(this));
    }
}
