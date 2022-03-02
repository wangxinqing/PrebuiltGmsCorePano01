package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;

/* renamed from: wqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class wqe extends wpy {
    private final String a;

    protected wqe(String str) {
        this.a = str;
    }

    public final void a(Collection collection) {
        collection.add(this.a);
    }

    /* access modifiers changed from: protected */
    public abstract void a(wqt wqt, String str);

    public final void a(wqt wqt, Cursor cursor) {
        String b = b(cursor, this.a);
        if (!TextUtils.isEmpty(b)) {
            a(wqt, b);
        }
    }
}
