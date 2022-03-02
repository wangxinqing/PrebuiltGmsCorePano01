package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: ajiz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajiz extends jfx {
    final /* synthetic */ ajja a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajiz(ajja ajja) {
        super(10);
        this.a = ajja;
    }

    public final void run() {
        icf d = this.a.a.d();
        if (d != null) {
            Status status = (Status) d.a(aztb.a.a().U(), TimeUnit.MILLISECONDS);
            if (!status.c()) {
                String valueOf = String.valueOf(status.j);
                ajix.c("GCoreUlr", valueOf.length() == 0 ? new String("Clearcut: error uploading: ") : "Clearcut: error uploading: ".concat(valueOf));
            }
        }
    }
}
