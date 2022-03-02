package defpackage;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: jzs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jzs extends jzr {
    public final DataHolder a;
    public final int b;
    private final int c;

    public jzs(DataHolder dataHolder, int i) {
        this.a = dataHolder;
        this.b = i;
        this.c = dataHolder.a(i);
    }

    public final Object a(kyq kyq) {
        return kyq.a(this.a, this.b, this.c);
    }

    public final /* bridge */ /* synthetic */ Object r() {
        MetadataBundle a2 = MetadataBundle.a();
        for (kyq kyq : lbm.a()) {
            if (kyq != lce.A) {
                kyq.a(this.a, a2, this.b, this.c);
            }
        }
        return new kuj(a2);
    }
}
