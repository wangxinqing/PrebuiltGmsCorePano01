package defpackage;

import android.content.ContentProviderClient;
import android.database.Cursor;

/* renamed from: pan  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pan {
    final ContentProviderClient a;
    final Cursor b;

    public pan(ContentProviderClient contentProviderClient, Cursor cursor) {
        this.a = contentProviderClient;
        this.b = cursor;
    }

    public final int a(String str) {
        try {
            return this.b.getColumnIndex(str);
        } catch (Throwable th) {
            throw new pam(th);
        }
    }

    public final long a(int i) {
        try {
            return this.b.getLong(i);
        } catch (Throwable th) {
            throw new pam(th);
        }
    }
}
