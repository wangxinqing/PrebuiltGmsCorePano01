package defpackage;

import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.Map;

/* renamed from: xea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class xea {
    private final Person a;
    private final xdz b;
    private final Map c;
    private final boolean d;

    public final void a() {
        String str;
        for (Object next : xeg.a((Iterable) this.b.a(this.a))) {
            Mergedpeoplemetadata a2 = this.b.a(next);
            int b2 = xeg.b(a2);
            int b3 = xeg.b(a2);
            if (b3 == 0) {
                str = "@profile@";
            } else if (b3 != 1) {
                str = b3 != 2 ? null : "@circle@";
            } else {
                str = a2.e;
            }
            if ((b2 == 0 || b2 == 1 || b2 == 2) && (!this.d || b2 == 1)) {
                Object obj = this.c.get(str);
                if (obj != null) {
                    a(next, b2, obj);
                } else if (b2 == 1) {
                    xdt.b("PeopleSync", "Unknown container=%s", str);
                }
            }
        }
    }

    public abstract void a(Object obj, int i, Object obj2);

    public xea(xdz xdz, Person person, Map map, boolean z) {
        this.a = person;
        this.b = xdz;
        this.c = map;
        this.d = z;
    }
}
