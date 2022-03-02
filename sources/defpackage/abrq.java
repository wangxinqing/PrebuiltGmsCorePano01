package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* renamed from: abrq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abrq extends nis {
    public final abxe a;
    public final absf b;
    private final Handler c;

    public abrq(abxe abxe, absf absf, Handler handler) {
        super(75, "GetBootstrappableAccountsOperation");
        this.a = abxe;
        this.b = absf;
        this.c = handler;
    }

    public final void a(Context context) {
        this.c.post(new abrp(this));
    }

    public final void a(Status status) {
        this.a.a(status, new ArrayList());
    }
}
