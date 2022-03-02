package defpackage;

import com.google.android.gms.plus.service.v2whitelisted.models.Person;

/* renamed from: xek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xek extends xem {
    final /* synthetic */ xen a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xek(xen xen, boolean z, boolean z2) {
        super(xen, z, z2);
        this.a = xen;
    }

    public final void a() {
    }

    public final void b() {
        xfb xfb = this.a.d;
        xfb.c.a("DELETE FROM ac_people WHERE owner_id=? AND NOT EXISTS (SELECT 1 FROM ac_container AS c WHERE ac_people._id =c.people_id AND NOT (c.container_type=0 AND c.in_circle=0))", (Object[]) new String[]{xfb.d});
    }

    public final void a(Person person) {
        xen xen = this.a;
        xen.d.a(person, true, !this.c, xen.a);
    }
}
