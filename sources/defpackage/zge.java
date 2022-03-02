package defpackage;

import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedRhsComponentEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: zge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zge {
    private List a;
    private final Set b = new HashSet();

    public final zgf a() {
        return new ClientLoggedRhsComponentEntity(this.b, this.a);
    }

    public final void a(List list) {
        this.a = list;
        this.b.add(5);
    }
}
