package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;

/* renamed from: hjm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hjm extends Exception {
    private static final long serialVersionUID = 1;
    public final int a;
    public final PendingIntent b;

    public hjm(int i) {
        this(i, (String) null, (PendingIntent) null, (Throwable) null);
    }

    public static hjm a(ibr ibr) {
        Status status = ibr.a;
        int a2 = ibr.a();
        return new hjm(hjn.a(a2), ibr.getMessage(), status.k, ibr.getCause());
    }

    public hjm(int i, String str) {
        this(i, str, (PendingIntent) null, (Throwable) null);
    }

    public hjm(int i, String str, PendingIntent pendingIntent, Throwable th) {
        super(str, th);
        this.a = i;
        this.b = pendingIntent;
    }

    public hjm(int i, String str, Throwable th) {
        this(i, str, (PendingIntent) null, th);
    }

    public hjm(int i, Throwable th) {
        super(th);
        this.a = i;
        this.b = null;
    }
}
