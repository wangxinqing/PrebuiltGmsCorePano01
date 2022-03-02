package defpackage;

import com.google.android.gms.plus.service.v1whitelisted.models.PlusAclentryResourceEntity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zhx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zhx {
    private String a;
    private String b;
    private final Set c = new HashSet();

    public final zhy a() {
        return new PlusAclentryResourceEntity(this.c, this.a, this.b);
    }

    public final void b(String str) {
        this.b = str;
        this.c.add(4);
    }

    public final void a(String str) {
        this.a = str;
        this.c.add(3);
    }
}
