package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: sci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sci extends nis {
    public final ifu a;
    private final sca b;

    public sci(sca sca, ifu ifu) {
        super(152, "AddConfigsForDownloadOperation");
        this.b = sca;
        this.a = ifu;
    }

    public final void a(Context context) {
        aorl.a(axsv.b() ? this.b.a() : aorl.a((Object) null), new sch(this), aoqm.a);
    }

    public final void a(Status status) {
        this.a.a(status);
    }
}
