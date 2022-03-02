package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: fee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fee implements ax {
    private final fei a;

    public fee(fei fei) {
        this.a = fei;
    }

    public final void a(Object obj) {
        fei fei = this.a;
        Status status = (Status) obj;
        if (status.i != 0) {
            fei.b.a(new fej(status, ampu.a));
        } else {
            fei.b();
        }
    }
}
