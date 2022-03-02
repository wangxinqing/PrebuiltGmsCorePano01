package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;

/* renamed from: wqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wqc extends wpy {
    private static final String[] a = {"data4", "data1", "data8", "data7", "data5", "data9", "data6"};
    private final StringBuilder b = new StringBuilder();

    public final void a(Collection collection) {
        Collections.addAll(collection, a);
    }

    public final void a(wqt wqt, Cursor cursor) {
        this.b.setLength(0);
        for (String b2 : a) {
            String b3 = b(cursor, b2);
            if (!TextUtils.isEmpty(b3)) {
                if (this.b.length() != 0) {
                    this.b.append(", ");
                }
                this.b.append(b3);
            }
        }
        if (this.b.length() > 0) {
            wqo.a(wqt.a.f, this.b.toString());
        }
    }
}
