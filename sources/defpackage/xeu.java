package defpackage;

import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.Map;

/* renamed from: xeu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xeu extends xea {
    final /* synthetic */ wmn a;
    final /* synthetic */ xfb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xeu(xfb xfb, xdz xdz, Person person, Map map, boolean z, wmn wmn) {
        super(xdz, person, map, z);
        this.b = xfb;
        this.a = wmn;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i, Object obj2) {
        this.b.i.a(((Long) obj2).longValue(), (Person.Emails) obj, this.a);
    }
}
