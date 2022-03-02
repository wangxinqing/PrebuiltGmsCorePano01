package defpackage;

import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: ebo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ebo extends ebl {
    private final eaz a;

    public ebo(ClientContext clientContext, eaz eaz) {
        super("ListStatesOp", clientContext);
        this.a = eaz;
    }

    /* access modifiers changed from: protected */
    public final DataHolder a() {
        Log.e("ListStatesOp", "API is not available anymore.");
        return DataHolder.b(3);
    }

    /* access modifiers changed from: protected */
    public final void a(DataHolder dataHolder) {
        this.a.a(dataHolder);
    }
}
