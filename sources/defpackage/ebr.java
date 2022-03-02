package defpackage;

import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: ebr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ebr extends ebl {
    private final int a;
    private final byte[] b;
    private final eaz c;

    public ebr(ClientContext clientContext, eaz eaz, int i, byte[] bArr) {
        super("UpdateStateOp", clientContext);
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
        Log.e("UpdateStateOp", "API is not available anymore.");
        return DataHolder.b(3);
    }

    /* access modifiers changed from: protected */
    public final void a(DataHolder dataHolder) {
        eaz eaz = this.c;
        if (eaz != null) {
            eaz.a(this.a, dataHolder);
        }
    }
}
