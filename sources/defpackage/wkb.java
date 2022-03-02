package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: wkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class wkb extends nis {
    private final wkc a;

    public wkb(wkc wkc, String str) {
        super(110, str);
        this.a = wkc;
    }

    public final void a(Context context) {
        this.a.a(b(context));
    }

    /* access modifiers changed from: protected */
    public abstract Status b(Context context);

    public final void a(Status status) {
        this.a.a(status);
    }
}
