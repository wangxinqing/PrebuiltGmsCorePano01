package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.Collection;

/* renamed from: kym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kym extends kyl {
    protected kym(String str, Collection collection, Collection collection2, int i) {
        super(str, collection, collection2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Collection c(DataHolder dataHolder, int i, int i2) {
        throw new UnsupportedOperationException("Cannot read collections from a dataHolder.");
    }
}
