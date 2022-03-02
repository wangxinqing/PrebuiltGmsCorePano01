package defpackage;

import com.google.android.gms.common.people.data.Audience;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: iww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iww {
    public static final Audience a = new iww().a();
    public boolean b;
    private List c;
    private int d;

    public iww() {
        this.c = Collections.emptyList();
        this.d = 0;
        this.b = false;
    }

    public final Audience a() {
        return new Audience(this.c, this.d, this.b);
    }

    public final void a(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.d = i;
            return;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("Unknown domain restriction setting: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public iww(Audience audience) {
        iva.a((Object) audience, (Object) "Audience must not be null.");
        this.c = audience.b;
        this.d = audience.c;
        this.b = audience.e;
    }

    public final void a(Collection collection) {
        iva.a((Object) collection, (Object) "Audience members must not be null.");
        this.c = Collections.unmodifiableList(new ArrayList(collection));
    }
}
