package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: qjs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qjs implements qkc {
    public final qfn a = new qfn("DevManHashPrefixFilterImpl");
    public final qkd b;
    private final Context c;
    private ContentProviderClient d;

    public qjs(Context context, qkd qkd, ExecutorService executorService) {
        this.c = context;
        this.b = qkd;
        executorService.submit(new qjr(this));
    }

    public static void a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public final List a(int[] iArr) {
        throw null;
    }

    public final synchronized ContentProviderClient a() {
        if (this.d == null) {
            this.d = this.c.getApplicationContext().getContentResolver().acquireUnstableContentProviderClient("instantapp-dev-manager");
        }
        return this.d;
    }
}
