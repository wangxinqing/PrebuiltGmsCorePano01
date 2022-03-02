package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: amsk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amsk {
    public final amqm a;
    public final boolean b;
    public final int c;
    private final amsj d;

    public static amsk a(char c2) {
        return a(amqm.b(c2));
    }

    public static amsk b(String str) {
        amqp d2 = amrk.d(str);
        amrl.a(!d2.a("").a.matches(), "The pattern may not match the empty string: %s", (Object) d2);
        return new amsk(new amse(d2));
    }

    public final amsi a(amsk amsk) {
        return new amsi(this, amsk);
    }

    public final List c(CharSequence charSequence) {
        amrl.a((Object) charSequence);
        Iterator b2 = b(charSequence);
        ArrayList arrayList = new ArrayList();
        while (b2.hasNext()) {
            arrayList.add((String) b2.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public amsk(amsj amsj) {
        this(amsj, false, amqj.a, Integer.MAX_VALUE);
    }

    public static amsk a(amqm amqm) {
        amrl.a((Object) amqm);
        return new amsk(new amsa(amqm));
    }

    private amsk(amsj amsj, boolean z, amqm amqm, int i) {
        this.d = amsj;
        this.b = z;
        this.a = amqm;
        this.c = i;
    }

    public static amsk a(String str) {
        boolean z;
        if (str.length() != 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z, (Object) "The separator may not be the empty string.");
        if (str.length() == 1) {
            return a(str.charAt(0));
        }
        return new amsk(new amsc(str));
    }

    public final amsk a() {
        return new amsk(this.d, true, this.a, this.c);
    }

    public final amsk a(int i) {
        amrl.a(true, "must be greater than zero: %s", i);
        return new amsk(this.d, this.b, this.a, i);
    }

    public final amsk b() {
        return b((amqm) amql.b);
    }

    public final Iterable a(CharSequence charSequence) {
        amrl.a((Object) charSequence);
        return new amsh(this, charSequence);
    }

    public final amsk b(amqm amqm) {
        amrl.a((Object) amqm);
        return new amsk(this.d, this.b, amqm, this.c);
    }

    public final Iterator b(CharSequence charSequence) {
        return this.d.a(this, charSequence);
    }
}
