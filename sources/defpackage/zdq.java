package defpackage;

import com.google.android.gms.plus.service.v1whitelisted.models.AccountField;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zdq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zdq {
    public String a;
    public String b;
    public String c;
    public final Set d = new HashSet();
    private AccountField.ValueEntity e;

    public final zea a() {
        return new AccountField(this.d, this.a, this.b, this.e, this.c);
    }

    public final void a(zdz zdz) {
        this.e = (AccountField.ValueEntity) zdz;
        this.d.add(10);
    }
}
