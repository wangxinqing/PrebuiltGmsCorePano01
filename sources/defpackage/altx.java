package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* renamed from: altx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class altx implements alsk {
    public final amjf a;
    protected final aluh b;
    private altx c;
    private Map d;
    private boolean e;
    private boolean f;
    private volatile boolean g = false;

    protected altx(amjf amjf, aluh aluh, boolean z) {
        this.a = amjf;
        this.b = aluh;
        this.g = z;
    }

    private final void bm() {
        if (!this.f) {
            this.f = true;
            for (amjf a2 : o()) {
                a(a2);
            }
            HashSet hashSet = new HashSet();
            for (amjf amjf : o()) {
                if (amjf.b == amje.REFERENCED_ID) {
                    hashSet.add(amjf.b());
                }
            }
            for (String b2 : Collections.unmodifiableSet(hashSet)) {
                this.b.b(b2).bm();
            }
        }
    }

    public abstract altx a(aluh aluh);

    public abstract void a(amiw amiw, alss alss, alty alty);

    /* access modifiers changed from: package-private */
    public final void a(amiw amiw, amiv amiv) {
        if (amiw.b != amiv) {
            b(amiw);
        }
    }

    public abstract void a(String str, alss alss, alty alty);

    /* access modifiers changed from: package-private */
    public final void b(amiw amiw) {
        throw new alta(g().a().b, amiw);
    }

    public final String d() {
        return this.a.b();
    }

    public final amjf e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof alsk)) {
            return false;
        }
        alsk alsk = (alsk) obj;
        return new altt().a(this.a, alsk.e(), this.b, alsk.j());
    }

    public final String f() {
        return aluv.a(g().a());
    }

    public final List h() {
        Collection<altx> collection;
        if (!this.e && !this.f) {
            return Collections.emptyList();
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        ArrayList arrayList = new ArrayList();
        Stack stack = new Stack();
        stack.push(this);
        newSetFromMap.add(this);
        while (!stack.isEmpty()) {
            altx altx = (altx) stack.pop();
            if (altx.e) {
                arrayList.add(altx);
            }
            altx altx2 = altx.c;
            if (altx2 == null && altx.d == null) {
                collection = Collections.emptySet();
            } else {
                Map map = altx.d;
                if (map == null) {
                    collection = Collections.singletonList(altx2);
                } else {
                    collection = Collections.unmodifiableCollection(map.keySet());
                }
            }
            for (altx altx3 : collection) {
                if (!newSetFromMap.contains(altx3)) {
                    newSetFromMap.add(altx3);
                    stack.push(altx3);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final int hashCode() {
        return ((Integer) new altu(this).a(this.a)).intValue();
    }

    public final /* bridge */ /* synthetic */ alsg j() {
        return this.b;
    }

    public final void m() {
        this.e = true;
        bm();
    }

    /* access modifiers changed from: protected */
    public abstract Iterable o();

    /* access modifiers changed from: package-private */
    public final void p() {
        this.g = true;
    }

    /* access modifiers changed from: package-private */
    public final void q() {
        if (this.g) {
            r();
            this.g = false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void r();

    public final String toString() {
        return (String) new altv(this).a(this.a);
    }

    /* access modifiers changed from: package-private */
    public final void a(amjf amjf) {
        if (this.f && amjf.b == amje.REFERENCED_ID) {
            altx b2 = this.b.b(amjf.b());
            if (this.f) {
                b2.bm();
            }
            if (b2.d == null && b2.c == null) {
                b2.c = this;
                return;
            }
            if (b2.c != null) {
                IdentityHashMap identityHashMap = new IdentityHashMap();
                b2.d = identityHashMap;
                identityHashMap.put(b2.c, 1);
                b2.c = null;
            }
            Integer num = (Integer) b2.d.get(this);
            if (num == null) {
                num = 0;
            }
            b2.d.put(this, Integer.valueOf(num.intValue() + 1));
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(amjf amjf) {
        if (amjf != null && amjf.b == amje.REFERENCED_ID && this.f) {
            altx b2 = this.b.b(amjf.b());
            altx altx = b2.c;
            if (altx != null && altx.equals(this)) {
                b2.c = null;
                return;
            }
            Map map = b2.d;
            if (map != null) {
                Integer num = (Integer) map.get(this);
                if (num != null) {
                    if (num.intValue() == 1) {
                        b2.d.remove(this);
                    } else {
                        b2.d.put(this, Integer.valueOf(num.intValue() - 1));
                    }
                    if (b2.d.size() == 1 && ((Integer) b2.d.values().iterator().next()).intValue() == 1) {
                        b2.c = (altx) b2.d.keySet().iterator().next();
                        b2.d = null;
                        return;
                    }
                    return;
                }
                String valueOf = String.valueOf(this);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb.append("Removed non-existent parent ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            String valueOf2 = String.valueOf(this);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
            sb2.append("Removed non-existent parent ");
            sb2.append(valueOf2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
