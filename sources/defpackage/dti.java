package defpackage;

import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.Section;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: dti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dti {
    public STSortSpec a;
    private boolean b;
    private List c;
    private boolean d;
    private int e = 0;
    private boolean f;
    private final List g = new ArrayList();

    public final QuerySpecification a() {
        return new QuerySpecification(this.b, (List) null, this.c, this.d, 0, this.e, this.f, 0, true, jhx.a((Collection) this.g), (byte[]) null, this.a, (String) null, Integer.MAX_VALUE);
    }

    public final void b() {
        this.d = true;
    }

    public final void c() {
        this.e = 5;
    }

    public final void d() {
        this.b = true;
    }

    public final void a(Section section) {
        if (section.a.startsWith("semantic#")) {
            if (this.c == null) {
                this.f = true;
                this.c = new ArrayList();
            } else if (!this.f) {
                throw new IllegalArgumentException("Cannot mix literal and semantic sections");
            }
            this.c.add(section);
            return;
        }
        if (this.c == null) {
            this.f = false;
            this.c = new ArrayList();
        } else if (this.f) {
            throw new IllegalArgumentException("Cannot mix literal and semantic sections");
        }
        this.c.add(section);
    }
}
