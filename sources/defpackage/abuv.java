package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: abuv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abuv extends nis {
    public final abvc a;
    public final abxq b;
    private final Handler c;

    public abuv(abxq abxq, abvc abvc, Handler handler) {
        super(76, "GetPinOperation");
        this.a = abvc;
        this.b = abxq;
        this.c = handler;
    }

    public final void a(Context context) {
        this.c.post(new abuu(this));
    }

    public final void a(Status status) {
        this.b.a(status, (String) null);
    }
}
