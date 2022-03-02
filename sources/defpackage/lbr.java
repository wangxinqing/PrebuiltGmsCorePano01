package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: lbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class lbr extends kym {
    public lbr(String str, Collection collection, Collection collection2, int i) {
        super(str, collection, collection2, i);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Bundle bundle, Object obj) {
        Collection collection = (Collection) obj;
        bundle.putParcelableArrayList(this.a, !(collection instanceof ArrayList) ? new ArrayList(collection) : (ArrayList) collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Collection b(Bundle bundle) {
        return bundle.getParcelableArrayList(this.a);
    }
}
