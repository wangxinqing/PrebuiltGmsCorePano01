package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: equ  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class equ extends nis {
    private final String a;
    private final eqk b;
    private final epb c;

    public equ(epb epb, eqk eqk, String str) {
        super(153, "GetTokenHandle");
        this.c = epb;
        this.b = eqk;
        this.a = str;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        String b2 = this.b.a(context).b(this.a);
        if (b2 != null) {
            this.c.a(Status.a, b2);
            return;
        }
        eqj eqj = new eqj(10);
        eqj.b = "Unable to get a valid token handle.";
        throw eqj.a();
    }

    public final void a(Status status) {
        this.c.a(status, (String) null);
    }
}
