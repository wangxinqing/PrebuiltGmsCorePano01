package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;

/* renamed from: pmj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class pmj extends pmd {
    private final String a;

    protected pmj(String str) {
        this.a = str;
    }

    public final void a(Collection collection) {
        collection.add(this.a);
    }

    /* access modifiers changed from: protected */
    public abstract void a(pnd pnd, String str);

    public final void a(pnd pnd, Cursor cursor) {
        String b = b(cursor, this.a);
        if (!TextUtils.isEmpty(b)) {
            a(pnd, b);
        }
    }
}
