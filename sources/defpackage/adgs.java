package defpackage;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: adgs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adgs implements adgu {
    private final WeakReference a;

    public adgs(Context context) {
        this.a = new WeakReference(context);
    }

    public final boolean a(Intent intent) {
        Context context = (Context) this.a.get();
        if (context == null) {
            return false;
        }
        context.startActivity(intent);
        return true;
    }
}
