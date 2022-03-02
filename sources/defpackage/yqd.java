package defpackage;

import com.google.android.gms.common.people.data.Audience;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: yqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yqd {
    public Audience a;
    private final Set b = new LinkedHashSet();

    public yqd(Audience audience) {
        iva.a((Object) audience, (Object) "Audience must not be null.");
        this.a = audience;
    }

    public final void a(Audience audience, Object obj) {
        iva.a((Object) audience, (Object) "Audience must not be null.");
        this.a = audience;
        for (yqc a2 : this.b) {
            a2.a(obj);
        }
    }

    public final void b(yqc yqc) {
        this.b.remove(yqc);
    }

    public final void a(yqc yqc) {
        this.b.add(yqc);
    }
}
