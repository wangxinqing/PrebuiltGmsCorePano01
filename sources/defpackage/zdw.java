package defpackage;

import com.google.android.gms.plus.service.v1whitelisted.models.AccountField;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zdw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zdw {
    public boolean a;
    public String b;
    public AccountField.ValueEntity.NameEntity c;
    public final Set d = new HashSet();
    private String e;
    private String f;

    public final zdz a() {
        return new AccountField.ValueEntity(this.d, this.a, this.b, this.c, this.e, this.f);
    }

    public final void b(String str) {
        this.f = str;
        this.d.add(6);
    }

    public final void a(String str) {
        this.e = str;
        this.d.add(5);
    }
}
