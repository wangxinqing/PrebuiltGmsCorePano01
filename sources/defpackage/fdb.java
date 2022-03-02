package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: fdb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fdb extends nis {
    public final aosh a = aosh.f();
    private final fcu b;
    private final String c;

    public fdb(int i, String str, String str2, fcu fcu) {
        super(i, str);
        this.b = fcu;
        this.c = str2;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        aorl.a(((fcy) fcy.a.a()).a(this.b, this.c), new fda(this), aoqm.a);
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.a.a((Throwable) qbf.a("Error when executing the operation.", status.i));
    }
}
