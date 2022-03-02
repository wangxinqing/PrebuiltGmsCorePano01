package defpackage;

import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: ebp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ebp extends ebl {
    private final int a;
    private final eaz b;

    public ebp(ClientContext clientContext, eaz eaz, int i) {
        super("LoadStateOp", clientContext);
        this.b = eaz;
        this.a = i;
    }

    /* access modifiers changed from: protected */
    public final DataHolder a() {
        Log.e("LoadStateOp", "API is not available anymore.");
        return DataHolder.b(3);
    }

    /* access modifiers changed from: protected */
    public final void a(DataHolder dataHolder) {
        this.b.a(this.a, dataHolder);
    }
}
