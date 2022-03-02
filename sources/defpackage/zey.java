package defpackage;

import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: zey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zey {
    public String a;
    public final Set b = new HashSet();
    private List c;

    public final zez a() {
        return new ActivityEntity.ObjectEntity(this.b, this.c, this.a);
    }

    public final void a(List list) {
        this.c = list;
        this.b.add(3);
    }
}
