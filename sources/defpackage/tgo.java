package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: tgo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tgo implements Callable {
    private final Context a;
    private final Uri b;
    private final ContentValues c;

    public tgo(Context context, Uri uri, ContentValues contentValues) {
        this.a = context;
        this.b = uri;
        this.c = contentValues;
    }

    public final Object call() {
        Context context = this.a;
        return context.getContentResolver().insert(this.b, this.c);
    }
}
