package defpackage;

import com.google.android.gms.plus.service.v1whitelisted.models.ClientAclDetailsEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: zfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zfs {
    public List a;
    public final Set b = new HashSet();
    private List c;
    private List d;

    public final zft a() {
        return new ClientAclDetailsEntity(this.b, this.c, this.a, this.d);
    }

    public final void b(List list) {
        this.d = list;
        this.b.add(5);
    }

    public final void a(List list) {
        this.c = list;
        this.b.add(2);
    }
}
