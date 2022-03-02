package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Collection;

/* renamed from: lca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lca extends lbj {
    public lca(String str, Collection collection, Collection collection2) {
        super(str, collection, collection2);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        return c(dataHolder, i, i2);
    }

    /* access modifiers changed from: protected */
    public final Boolean d(DataHolder dataHolder, int i, int i2) {
        return Boolean.valueOf(dataHolder.b("trashed", i, i2) == 2);
    }
}
