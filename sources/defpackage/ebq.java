package defpackage;

import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: ebq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ebq extends ebl {
    private final int a;
    private final byte[] b;
    private final eaz c;

    public ebq(ClientContext clientContext, eaz eaz, int i, byte[] bArr) {
        super("ResolveStateOp", clientContext);
        this.c = eaz;
        this.a = i;
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            this.b = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return;
        }
        this.b = null;
    }

    /* access modifiers changed from: protected */
    public final DataHolder a() {
        Log.e("ResolveStateOp", "API is not available anymore.");
        return DataHolder.b(3);
    }

    /* access modifiers changed from: protected */
    public final void a(DataHolder dataHolder) {
        this.c.a(this.a, dataHolder);
    }
}
