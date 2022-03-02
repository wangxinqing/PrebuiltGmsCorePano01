package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.location.internal.LocationRequestInternal;

/* renamed from: roe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class roe extends rol {
    final /* synthetic */ LocationRequestInternal a;
    final /* synthetic */ PendingIntent b;
    final /* synthetic */ rom c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public roe(rom rom, LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
        super(true);
        this.c = rom;
        this.a = locationRequestInternal;
        this.b = pendingIntent;
    }

    public final icf a() {
        icc icc = this.c.b;
        return icc.b((idf) new rfs(icc, this.a, this.b));
    }
}
