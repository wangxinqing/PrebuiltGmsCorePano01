package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;

/* renamed from: wso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wso {
    public static ContentValues a(int i, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/contact_event");
        a(contentValues, "data1", str);
        a(contentValues, "data2", "data3", i, str2, 0);
        return contentValues;
    }

    public static ContentValues a(int i, String str, String str2, String str3, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/email_v2");
        contentValues.put("is_primary", Integer.valueOf(z ? 1 : 0));
        a(contentValues, "data1", str);
        a(contentValues, "data4", str2);
        a(contentValues, "data2", "data3", i, str3, 0);
        return contentValues;
    }

    public static ContentValues a(String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/group_membership");
        a(contentValues, "group_sourceid", str);
        return contentValues;
    }

    public static void a(ContentValues contentValues, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, str2);
        }
    }

    public static void a(ContentValues contentValues, String str, String str2, int i, String str3, int i2) {
        if (i2 == i && TextUtils.isEmpty(str3)) {
            contentValues.putNull(str);
            contentValues.putNull(str2);
            return;
        }
        contentValues.put(str, Integer.valueOf(i));
        a(contentValues, str2, str3);
    }
}
