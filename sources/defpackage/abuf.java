package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: abuf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abuf implements acvp {
    private final abug a;
    private final abxq b;

    public abuf(abug abug, abxq abxq) {
        this.a = abug;
        this.b = abxq;
    }

    public final void a(acwa acwa) {
        Status status;
        abug abug = this.a;
        abxq abxq = this.b;
        if (acwa.b()) {
            status = Status.a;
        } else {
            status = new Status(10557);
        }
        abug.j = false;
        abug.h = null;
        abug.i = null;
        abug.a();
        abug.d(abxq, status);
    }
}
