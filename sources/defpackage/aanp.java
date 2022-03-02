package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: aanp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aanp extends nis {
    protected final Context c;

    static {
        aanp.class.getSimpleName();
    }

    public aanp(Context context, String str) {
        super(45, str);
        this.c = context;
    }

    public final void a(Status status) {
        b(status);
    }

    /* access modifiers changed from: protected */
    public abstract void b(Status status);
}
