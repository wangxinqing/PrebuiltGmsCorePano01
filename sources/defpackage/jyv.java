package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: jyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jyv extends nis {
    private final jyl a;
    private final jyq b;

    public jyv(jyq jyq, jyl jyl) {
        super(20, "GetDevFeaturesOp");
        this.b = jyq;
        this.a = jyl;
    }

    public final void a(Context context) {
        DataHolder a2 = this.a.a();
        try {
            this.b.a(a2);
        } finally {
            a2.close();
        }
    }

    public final void a(Status status) {
        this.b.a(DataHolder.b(status.i));
    }
}
