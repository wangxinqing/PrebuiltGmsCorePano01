package defpackage;

import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.Map;

/* renamed from: xev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xev extends xea {
    final /* synthetic */ wmn a;
    final /* synthetic */ xfb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xev(xfb xfb, xdz xdz, Person person, Map map, boolean z, wmn wmn) {
        super(xdz, person, map, z);
        this.b = xfb;
        this.a = wmn;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i, Object obj2) {
        this.b.j.a(((Long) obj2).longValue(), (Person.PhoneNumbers) obj, this.a);
    }
}
