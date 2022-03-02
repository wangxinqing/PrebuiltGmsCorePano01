package defpackage;

import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedCircleEntity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zfy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zfy {
    private String a;
    private final Set b = new HashSet();

    public final zfz a() {
        return new ClientLoggedCircleEntity(this.b, this.a);
    }

    public final void a(String str) {
        this.a = str;
        this.b.add(2);
    }
}
