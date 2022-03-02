package defpackage;

import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zer  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zer {
    public AclEntity a;
    public final Set b = new HashSet();
    private ActivityEntity.ObjectEntity c;

    public final zfa a() {
        return new ActivityEntity(this.b, this.a, this.c);
    }

    public final void a(zez zez) {
        this.c = (ActivityEntity.ObjectEntity) zez;
        this.b.add(15);
    }
}
