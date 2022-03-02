package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: tgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tgr implements Callable {
    private final Context a;
    private final Uri b;
    private final String[] c;
    private final String d;
    private final String[] e;
    private final String f;

    public tgr(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.a = context;
        this.b = uri;
        this.c = strArr;
        this.d = str;
        this.e = strArr2;
        this.f = str2;
    }

    public final Object call() {
        Context context = this.a;
        Uri uri = this.b;
        Cursor query = context.getContentResolver().query(uri, this.c, this.d, this.e, this.f);
        if (query == null) {
            return null;
        }
        if (query.moveToFirst()) {
            return query;
        }
        query.close();
        ((anih) tgb.a.c()).a("Failed to open %s because the Cursor was empty", (Object) uri);
        return null;
    }
}
