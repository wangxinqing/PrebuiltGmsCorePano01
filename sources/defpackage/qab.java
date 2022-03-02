package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: qab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qab {
    private final Intent a;
    private final amrm b;

    public qab(Intent intent, amrm amrm) {
        this.a = intent;
        this.b = amrm;
    }

    public final amri a(Context context) {
        if (this.b.a(context)) {
            return context.getPackageManager().resolveService(this.a, 65536) != null ? amri.b(this.a) : ampu.a;
        }
        return ampu.a;
    }
}
