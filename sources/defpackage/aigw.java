package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: aigw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aigw extends aigg implements aiew, aigt {
    private static final amrm m = aigv.a;
    public final aidf a;
    public boolean b = false;
    private final aigu c;
    private Collection d = Collections.emptyList();
    private Collection g = Collections.emptyList();
    private final aifi h = new aifi();
    private final aifi i = new aifi();
    private boolean j = false;
    private boolean k = false;
    private boolean l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aigw(aiex aiex, Context context, Looper looper, aidf aidf) {
        super(aiex, new jld(context, looper), jgy.a(context), looper);
        aigu aigu = new aigu(context, looper);
        this.c = aigu;
        this.a = aidf;
    }

    public final void a() {
        if (!this.j) {
            this.j = true;
            this.b = false;
            this.c.e = this;
            if (axxg.d()) {
                this.c.a();
                this.k = true;
            }
            b(false);
            super.a();
        }
    }

    public final void b() {
        if (this.j) {
            this.j = false;
            this.c.b();
            this.k = false;
            b(false);
            super.b();
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.c.d.c();
    }

    /* access modifiers changed from: protected */
    public final Collection d() {
        return this.h.k;
    }

    /* access modifiers changed from: protected */
    public final boolean e() {
        return this.b && this.l;
    }

    /* access modifiers changed from: protected */
    public final long g() {
        return this.h.f;
    }

    /* access modifiers changed from: protected */
    public final String h() {
        return "wifi stationary engine";
    }

    public final void a(Collection collection, boolean z) {
        boolean z2 = true;
        if (this.j) {
            if (axxg.d() && !this.k) {
                this.c.a();
                this.k = true;
            } else if (!axxg.d() && this.k) {
                this.c.b();
                this.k = false;
            }
        }
        this.d = collection;
        this.g = null;
        this.h.a(anbs.a((Iterable) collection, aifi.a));
        this.i.a(anbs.a((Iterable) collection, m));
        if (this.i.f <= this.h.f) {
            z2 = false;
        }
        if (z2 != this.l) {
            this.l = z2;
            f();
        }
        b(z);
    }

    public final void b(boolean z) {
        Collection collection;
        if (!e()) {
            collection = this.d;
        } else {
            collection = this.g;
            if (collection == null) {
                this.g = new ArrayList(this.d.size());
                for (LocationRequestInternal locationRequestInternal : this.d) {
                    if (m.a(locationRequestInternal)) {
                        this.g.add(locationRequestInternal);
                    }
                }
                collection = this.g;
            }
        }
        if (e() && z) {
            i();
            z = false;
        }
        this.e.a(collection, z);
    }

    /* access modifiers changed from: protected */
    public final void a(List list) {
        aigu aigu = this.c;
        if (!list.isEmpty()) {
            aigu.d.a(list);
        }
    }
}
