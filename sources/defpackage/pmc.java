package defpackage;

import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;

/* renamed from: pmc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class pmc extends pmd {
    private final Resources a;
    private final String b;
    private final String c;
    private final String d;

    public pmc(Resources resources, String str, String str2, String str3) {
        this.a = resources;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    /* access modifiers changed from: protected */
    public abstract String a(Resources resources, int i, String str);

    public final void a(Collection collection) {
        collection.add("_id");
        collection.add("is_primary");
        collection.add("is_super_primary");
        collection.add(this.b);
        collection.add(this.c);
        collection.add(this.d);
    }

    /* access modifiers changed from: protected */
    public abstract void a(pnd pnd, long j, String str, int i, String str2, int i2);

    public final void a(pnd pnd, Cursor cursor) {
        boolean z;
        int i;
        long j;
        String b2 = b(cursor, this.b);
        if (!TextUtils.isEmpty(this.b)) {
            int a2 = a(cursor, this.c);
            String a3 = a(this.a, a2, b(cursor, this.d));
            int a4 = a(cursor, "is_super_primary");
            if (a4 == 0 && a(cursor, "is_primary") == 0) {
                z = false;
            } else {
                z = true;
            }
            if (a4 != 0) {
                i = 3;
            } else {
                i = z ? 2 : 1;
            }
            int columnIndex = cursor.getColumnIndex("_id");
            if (columnIndex == -1) {
                pnz.b("Requested column %s didn't exist in the cursor.", (Object) "_id");
                j = 0;
            } else {
                j = cursor.getLong(columnIndex);
            }
            a(pnd, j, b2, a2, a3, i);
        }
    }
}
