package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;

/* renamed from: gpf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class gpf implements acvp {
    private final gqa a;

    public gpf(gqa gqa) {
        this.a = gqa;
    }

    public final void a(acwa acwa) {
        gqa gqa = this.a;
        if (!awja.a.a().a() || acwa.b()) {
            Status status = (Status) acwa.d();
            if (status.c()) {
                return;
            }
            if (status.i != 17) {
                gqa.a(ErrorCode.UNKNOWN_ERR);
            } else {
                gqa.a(ErrorCode.NOT_SUPPORTED_ERR);
            }
        } else {
            gqa.d.e("Unable to fido2 headless sign", acwa.e().getMessage());
        }
    }
}
