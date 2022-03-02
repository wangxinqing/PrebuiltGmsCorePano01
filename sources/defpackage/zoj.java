package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: zoj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zoj extends nis {
    private final zod a;

    public zoj(zod zod) {
        super(38, "GetLastResetWallTimeMs");
        iva.a((Object) zod);
        this.a = zod;
    }

    public final void a(Context context) {
        long j;
        zod zod = this.a;
        Status status = Status.a;
        synchronized ("PseudonymousIdService") {
            j = context.getSharedPreferences("PseudonymousIdIntentService", 0).getLong("wallTimeMillisLastPseudonymousIdReset", 0);
        }
        zod.a(status, j);
    }

    public final void a(Status status) {
        this.a.a(status, 0);
    }
}
