package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: jww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jww implements jur {
    final /* synthetic */ DataHolder a;
    final /* synthetic */ Status b;
    private final jtk c;

    public jww(DataHolder dataHolder, Status status) {
        this.a = dataHolder;
        this.b = status;
        DataHolder dataHolder2 = this.a;
        this.c = dataHolder2 != null ? new jtk(dataHolder2) : null;
    }

    public final Status aO() {
        return this.b;
    }

    public final jtk b() {
        return this.c;
    }
}
