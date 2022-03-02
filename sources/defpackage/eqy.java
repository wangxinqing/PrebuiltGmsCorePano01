package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: eqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eqy extends nis {
    private final ese a;
    private final String b;
    private final boolean c;
    private final eom d;

    public eqy(eom eom, ese ese, boolean z, String str) {
        super(224, "RequestAccountsAccessGoogleAuthOperation");
        this.d = eom;
        this.a = ese;
        this.b = str;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        this.d.a(Status.a, this.a.a(this.b, this.c));
    }

    public final void a(Status status) {
        this.d.a(status, (Bundle) null);
    }
}
