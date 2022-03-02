package defpackage;

import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.content.ContentValues;
import java.util.List;

/* renamed from: xzz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xzz implements yab {
    private final boolean a;
    private final List b;
    private final xvx c;

    public xzz(xvx xvx, boolean z, List list) {
        this.c = xvx;
        this.a = z;
        this.b = list;
    }

    public final void a(ContentValues contentValues, ContentValues contentValues2) {
        xvx xvx = this.c;
        boolean z = this.a;
        List list = this.b;
        if (!yac.a(contentValues)) {
            long b2 = yac.b(contentValues2);
            xvx.b.a(ContentProviderOperation.newUpdate(ContentUris.withAppendedId(xvx.a, contentValues2.getAsLong("data_id").longValue())).withValue("data_sync4", Long.valueOf(yau.a(b2))).withValue("data_version", Long.valueOf(b2)), false);
        }
        if (z) {
            if (!ayrz.b()) {
                contentValues = contentValues2;
            }
            list.add(contentValues);
        }
    }
}
