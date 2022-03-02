package defpackage;

import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedCircleMemberEntity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zgb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zgb {
    private String a;
    private String b;
    private final Set c = new HashSet();

    public final zgc a() {
        return new ClientLoggedCircleMemberEntity(this.c, this.a, this.b);
    }

    public final void b(String str) {
        this.b = str;
        this.c.add(5);
    }

    public final void a(String str) {
        this.a = str;
        this.c.add(3);
    }
}
