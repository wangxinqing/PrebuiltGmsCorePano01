package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: xqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xqh extends nis {
    private final xvm a;
    private final wtb b;
    private final int[] c;

    public xqh(wtb wtb, Context context, int[] iArr) {
        super(208, "AddAccountCategoryToBackupAndSync");
        this.a = xvm.a(context);
        this.c = iArr;
        this.b = wtb;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        this.a.a(this.c);
        this.b.b(Status.a);
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.b.b(status);
    }
}
