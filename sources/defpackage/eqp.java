package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: eqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eqp extends nis {
    private final eqk a;
    private final String b;
    private final eor c;

    public eqp(eor eor, eqk eqk, String str) {
        super(153, "GetAccountExportData");
        this.c = eor;
        this.a = eqk;
        this.b = str;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        Bundle a2 = this.a.a(context).a(this.b);
        if (a2 != null) {
            this.c.a(Status.a, a2);
            return;
        }
        eqj eqj = new eqj(5);
        eqj.b = String.format("Account name '%s' does not exist.", new Object[]{this.b});
        throw eqj.a();
    }

    public final void a(Status status) {
        this.c.a(status, (Bundle) null);
    }
}
