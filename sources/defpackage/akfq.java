package defpackage;

import android.util.LruCache;

/* renamed from: akfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akfq extends LruCache {
    public akfq(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        akfr akfr = (akfr) obj2;
        akfr akfr2 = (akfr) obj3;
        if (z) {
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        String str = (String) obj;
        int i = ((akfr) obj2).a;
        return 0;
    }
}
