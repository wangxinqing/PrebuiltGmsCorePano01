package defpackage;

import android.os.Looper;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: rod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rod extends rol {
    final /* synthetic */ LocationRequestInternal a;
    final /* synthetic */ reh b;
    final /* synthetic */ Looper c;
    final /* synthetic */ rom d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rod(rom rom, LocationRequestInternal locationRequestInternal, reh reh, Looper looper) {
        super(true);
        this.d = rom;
        this.a = locationRequestInternal;
        this.b = reh;
        this.c = looper;
    }

    public final icf a() {
        icc icc = this.d.b;
        return icc.b((idf) new rfr(icc, this.a, this.b, this.c));
    }
}
