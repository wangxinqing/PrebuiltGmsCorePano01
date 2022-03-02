package defpackage;

import com.google.android.gms.plus.service.v1whitelisted.models.AclDetailsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zeo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zeo {
    public String a;
    public String b;
    public final Set c = new HashSet();
    private AclDetailsEntity d;
    private int e;

    public final zep a() {
        return new ActionTargetEntity(this.c, this.d, this.a, this.e, this.b);
    }

    public final void a(int i) {
        this.e = i;
        this.c.add(6);
    }

    public final void a(zel zel) {
        this.d = (AclDetailsEntity) zel;
        this.c.add(2);
    }
}
