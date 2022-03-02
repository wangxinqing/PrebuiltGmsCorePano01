package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

/* renamed from: abrm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abrm extends nis {
    public final abxe a;
    public final absf b;
    public final String c;
    private final Handler d;

    public abrm(abxe abxe, String str, absf absf, Handler handler) {
        super(75, "ContinueWithPinOperation");
        this.a = abxe;
        this.b = absf;
        this.c = str;
        this.d = handler;
    }

    public final void a(Context context) {
        this.d.post(new abrl(this));
    }

    public final void a(Status status) {
        this.a.e(status);
    }
}
