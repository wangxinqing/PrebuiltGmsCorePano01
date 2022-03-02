package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: jyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jyw extends nis {
    private final jyl a;
    private final String[] b;
    private final jyq c;

    public jyw(jyq jyq, jyl jyl, String[] strArr) {
        super(20, "UpdateDevFeaturesOp");
        this.c = jyq;
        this.a = jyl;
        this.b = strArr;
    }

    public final void a(Context context) {
        this.c.a(this.a.a(this.b));
    }

    public final void a(Status status) {
        this.c.a(status.i);
    }
}
