package defpackage;

import android.content.ContentValues;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.Map;

/* renamed from: xep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xep extends xea {
    public xep(xdz xdz, Person person, Map map, boolean z) {
        super(xdz, person, map, z);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i, Object obj2) {
        ((ContentValues) obj2).put("nickname", ((Person.Nicknames) obj).d);
    }
}
