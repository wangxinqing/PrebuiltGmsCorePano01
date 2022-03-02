package defpackage;

import android.util.Log;
import android.util.LruCache;
import java.io.IOException;

/* renamed from: hug  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hug extends LruCache {
    final /* synthetic */ huv a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hug(huv huv, int i) {
        super(i);
        this.a = huv;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        huo huo = (huo) obj2;
        huo huo2 = (huo) obj3;
        try {
            huo.d.close();
            if (huo.f < awtf.d()) {
                huv huv = this.a;
                int i = huv.a;
                huv.g.put(num, new hur(huo.b.getName(), huo.f));
            }
        } catch (IOException e) {
            Log.e("FlatFileLogStore", "Error closing evicted outputstream", e);
        }
    }
}
