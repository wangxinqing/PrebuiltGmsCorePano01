package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: ieb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ieb implements ice {
    final /* synthetic */ BasePendingResult a;
    final /* synthetic */ ied b;

    public ieb(ied ied, BasePendingResult basePendingResult) {
        this.b = ied;
        this.a = basePendingResult;
    }

    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
