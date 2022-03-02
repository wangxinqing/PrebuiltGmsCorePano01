package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.List;

/* renamed from: nyr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nyr {
    private final Context a;

    public nyr(Context context) {
        this.a = context;
    }

    public final synchronized List a() {
        if (aekv.a(this.a)) {
            return amzy.h();
        }
        try {
            arpd b = aiby.a(this.a).b(this.a);
            if (b != null) {
                return b.c;
            }
            return amzy.h();
        } catch (aicb e) {
            Log.e("GCM", "StorageException while reading file", e);
            return amzy.h();
        }
    }
}
