package defpackage;

import android.util.LruCache;

/* renamed from: akfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akfe extends LruCache {
    public akfe(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        String str = (String) obj;
        return ((akfi) obj2).a.getByteCount();
    }
}
