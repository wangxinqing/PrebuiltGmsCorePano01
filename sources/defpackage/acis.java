package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;

/* renamed from: acis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acis extends acjr {
    public acis(idg idg) {
        super(idg);
    }

    public final void a(Status status, BootstrapAccount[] bootstrapAccountArr) {
        if (!status.c()) {
            this.a.a(status);
        } else {
            this.a.a((Object) bootstrapAccountArr);
        }
    }
}
