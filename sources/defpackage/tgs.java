package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: tgs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tgs implements Callable {
    private final Context a;
    private final Uri b;

    public tgs(Context context, Uri uri) {
        this.a = context;
        this.b = uri;
    }

    public final Object call() {
        return agyz.a(this.a, this.b, agyy.a);
    }
}
