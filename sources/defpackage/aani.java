package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;

/* renamed from: aani  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aani extends aanp {
    public static final /* synthetic */ int b = 0;
    final Intent a;

    static {
        aani.class.getSimpleName();
    }

    public aani(Context context, Intent intent) {
        super(context, "vappsresult");
        this.a = intent;
    }

    public final void a(Context context) {
        int intExtra = this.a.getIntExtra("nonce", -1);
        int d = aang.a(context).d();
        if (d >= 0 && intExtra == d) {
            aang.a(context).a(new Status(0), new aaal(context).a() ^ true ? 1 : 0);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(Status status) {
        aang.a(this.c).a(status, 1);
    }
}
