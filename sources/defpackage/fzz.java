package defpackage;

import com.google.android.gms.phenotype.Configurations;
import java.util.concurrent.ExecutionException;

/* renamed from: fzz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fzz implements acvf {
    private final gaa a;

    public fzz(gaa gaa) {
        this.a = gaa;
    }

    public final Object a(acwa acwa) {
        gaa gaa = this.a;
        if (!acwa.b()) {
            if (((acwi) acwa).d) {
                return acws.a();
            }
            if (acwa.e() != null) {
                return acws.a(acwa.e());
            }
            return acws.a((Exception) new ExecutionException(new IllegalStateException("Task was not successful, but exception is null")));
        } else if (acwa.d() == null || ((Configurations) acwa.d()).a == null) {
            return acws.a((Exception) new ExecutionException(new IllegalStateException("registerSync result was null")));
        } else {
            return gaa.b.a(((Configurations) acwa.d()).a);
        }
    }
}
