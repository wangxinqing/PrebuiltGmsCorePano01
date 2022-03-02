package defpackage;

import com.google.android.gms.plus.service.v1whitelisted.models.AclEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: zei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zei {
    public boolean a;
    public boolean b;
    public final Set c = new HashSet();
    private boolean d;
    private List e;

    public final zej a() {
        return new AclEntity(this.c, this.d, this.e, this.a, this.b);
    }

    public final void a(List list) {
        this.e = list;
        this.c.add(6);
    }

    public final void a(boolean z) {
        this.d = z;
        this.c.add(4);
    }
}
