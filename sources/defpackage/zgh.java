package defpackage;

import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedRhsComponentItemEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: zgh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zgh {
    public List a;
    public final Set b = new HashSet();
    private List c;

    public final zgi a() {
        return new ClientLoggedRhsComponentItemEntity(this.b, this.a, this.c);
    }

    public final void a(List list) {
        this.c = list;
        this.b.add(9);
    }
}
