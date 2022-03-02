package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: idn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class idn implements Runnable {
    private final ice a;
    private final Status b;

    public idn(ice ice, Status status) {
        this.a = ice;
        this.b = status;
    }

    public final void run() {
        ice ice = this.a;
        Status status = this.b;
        int i = BasePendingResult.l;
        ice.a(status);
    }
}
