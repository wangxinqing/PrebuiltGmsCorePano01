package defpackage;

import android.util.Log;
import android.util.LruCache;
import java.io.File;
import java.io.IOException;

/* renamed from: huj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class huj extends LruCache {
    final /* synthetic */ huv a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public huj(huv huv, int i) {
        super(i);
        this.a = huv;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        try {
            huv huv = this.a;
            File file = new File(str);
            int i = huv.a;
            return hvi.a(huv.b(file));
        } catch (IOException e) {
            String valueOf = String.valueOf(str);
            Log.e("FlatFileLogStore", valueOf.length() == 0 ? new String("Failed to read and parse PlayLoggerContext file ") : "Failed to read and parse PlayLoggerContext file ".concat(valueOf), e);
            return null;
        }
    }
}
