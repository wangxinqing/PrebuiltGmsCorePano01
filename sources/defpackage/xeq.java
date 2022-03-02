package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.Map;

/* renamed from: xeq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xeq extends xea {
    public xeq(xdz xdz, Person person, Map map, boolean z) {
        super(xdz, person, map, z);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i, Object obj2) {
        ContentValues contentValues = (ContentValues) obj2;
        contentValues.putNull("compressed_avatar_url");
        String str = ((Person.Images) obj).e;
        if (TextUtils.isEmpty(str)) {
            contentValues.put("has_avatar", 0);
            return;
        }
        contentValues.put("has_avatar", 1);
        if (i == 0) {
            contentValues.put("compressed_avatar_url", ycc.a(str));
        }
    }
}
