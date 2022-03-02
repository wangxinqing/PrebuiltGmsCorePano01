package defpackage;

import com.google.android.gms.plus.service.pos.PlusonesEntity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: zcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zcn {
    public String a;
    public final Set b = new HashSet();
    private String c;
    private boolean d;

    public final zcr a() {
        return new PlusonesEntity(this.b, this.a, this.c, this.d);
    }

    public final void a(String str) {
        this.c = str;
        this.b.add(4);
    }

    public final void a(boolean z) {
        this.d = z;
        this.b.add(5);
    }
}
