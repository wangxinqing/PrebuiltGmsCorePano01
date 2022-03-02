package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: apwa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apwa {
    public int a;
    private final Set b = new HashSet();
    private final Set c = new HashSet();
    private int d;
    private apwc e;
    private Set f;

    @SafeVarargs
    public apwa(Class cls, Class... clsArr) {
        this.d = 0;
        this.a = 0;
        this.f = new HashSet();
        apwe.a((Object) cls, "Null interface");
        this.b.add(cls);
        for (Class a2 : clsArr) {
            apwe.a((Object) a2, "Null interface");
        }
        Collections.addAll(this.b, clsArr);
    }

    public final apwb a() {
        boolean z;
        if (this.e != null) {
            z = true;
        } else {
            z = false;
        }
        apwe.a(z, "Missing required property: factory.");
        return new apwb(new HashSet(this.b), new HashSet(this.c), this.d, this.a, this.f);
    }

    public final void b() {
        a(1);
    }

    public final void a(int i) {
        apwe.a(this.d == 0, "Instantiation type has already been set.");
        this.d = i;
    }

    public final void a(apwc apwc) {
        apwe.a((Object) apwc, "Null factory");
        this.e = apwc;
    }

    public final void a(apwd apwd) {
        apwe.a((Object) apwd, "Null dependency");
        if (!this.b.contains(apwd.a)) {
            this.c.add(apwd);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
}
