package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: abur  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abur extends nis {
    public final abxq a;
    private final abpg b;
    private final Handler c;

    public abur(abxq abxq, abpg abpg, Handler handler) {
        super(76, "GetEsimActivationPayloadOperation");
        this.b = abpg;
        this.c = handler;
        this.a = abxq;
    }

    public final void a(Context context) {
        this.b.a().a((Executor) new jls(this.c), (acvp) new abuq(this));
    }

    public final void a(Status status) {
        this.a.a(status, (List) null);
    }
}
