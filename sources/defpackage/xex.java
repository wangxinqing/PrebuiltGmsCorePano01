package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: xex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class xex {
    final /* synthetic */ xfb a;

    public xex(xfb xfb) {
        this.a = xfb;
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract String a(Object obj);

    public final void a(long j, Object obj, wmn wmn) {
        ContentValues a2 = this.a.a();
        a2.clear();
        b(a2, obj);
        if (a2.size() > 0) {
            this.a.c.a("ac_item", a2, "container_id = ? AND item_type = ? AND value = ?", new String[]{Long.toString(j), Integer.toString(a()), a(obj)});
            b(wmn);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(ContentValues contentValues, Object obj);

    /* access modifiers changed from: protected */
    public abstract void a(wmn wmn);

    /* access modifiers changed from: protected */
    public abstract void b(ContentValues contentValues, Object obj);

    /* access modifiers changed from: protected */
    public abstract void b(wmn wmn);

    public final void a(long j, Object obj, xdz xdz, wmn wmn) {
        ContentValues a2 = this.a.a();
        a2.clear();
        a2.put("container_id", Long.valueOf(j));
        a2.put("item_type", Integer.valueOf(a()));
        a2.put("is_edge_key", Boolean.valueOf(xeg.c(xdz.a(obj))));
        a(a2, obj);
        if (!TextUtils.isEmpty(a2.getAsString("value"))) {
            this.a.c.a("ac_item", a2);
            a(wmn);
        }
    }
}
