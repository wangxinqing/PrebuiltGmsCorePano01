package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.List;

/* renamed from: yaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class yaa implements yab {
    private final List a;

    public yaa(List list) {
        this.a = list;
    }

    public final void a(ContentValues contentValues, ContentValues contentValues2) {
        List list = this.a;
        if (yac.a(contentValues2)) {
            if (!TextUtils.equals(contentValues2.getAsString("data_sync2"), contentValues.getAsString("data_sync2"))) {
                contentValues.put("data_sync1", xwz.a(contentValues2.getAsString("data_sync1"), xwz.b(contentValues.getAsString("data_sync1"))));
            } else {
                return;
            }
        }
        list.add(new yae(contentValues, contentValues2));
    }
}
