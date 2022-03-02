package defpackage;

import com.google.android.gms.plus.service.v1whitelisted.models.ClientAclDetailsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientLoggedRhsComponentEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: zfv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zfv {
    public List a;
    public final Set b = new HashSet();
    private ClientAclDetailsEntity c;
    private List d;
    private ClientLoggedRhsComponentEntity e;

    public final zfw a() {
        return new ClientActionDataEntity(this.b, this.c, this.d, this.a, this.e);
    }

    public final void a(List list) {
        this.d = list;
        this.b.add(7);
    }

    public final void a(zft zft) {
        this.c = (ClientAclDetailsEntity) zft;
        this.b.add(2);
    }

    public final void a(zgf zgf) {
        this.e = (ClientLoggedRhsComponentEntity) zgf;
        this.b.add(20);
    }
}
