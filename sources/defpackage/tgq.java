package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: tgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tgq implements Callable {
    private final Context a;
    private final Uri b;

    public tgq(Context context, Uri uri) {
        this.a = context;
        this.b = uri;
    }

    public final Object call() {
        Context context = this.a;
        return Integer.valueOf(context.getContentResolver().delete(this.b, (String) null, (String[]) null));
    }
}
