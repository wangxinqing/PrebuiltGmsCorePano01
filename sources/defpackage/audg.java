package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: audg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class audg extends auaf implements RandomAccess, audh {
    private static final audg b;
    private final List c;

    static {
        audg audg = new audg(10);
        b = audg;
        audg.b();
    }

    public audg() {
        this(10);
    }

    private static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof auay) {
            return ((auay) obj).l();
        }
        return aucy.b((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        c();
        this.c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        c();
        if (collection instanceof audh) {
            collection = ((audh) collection).d();
        }
        boolean addAll = this.c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final Object c(int i) {
        return this.c.get(i);
    }

    public final void clear() {
        c();
        this.c.clear();
        this.modCount++;
    }

    public final List d() {
        return Collections.unmodifiableList(this.c);
    }

    public final audh e() {
        return this.a ? new aufj(this) : this;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        c();
        return a(this.c.set(i, (String) obj));
    }

    public final int size() {
        return this.c.size();
    }

    public audg(int i) {
        this(new ArrayList(i));
    }

    public final /* bridge */ /* synthetic */ aucx b(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.c);
            return new audg(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        c();
        Object remove = this.c.remove(i);
        this.modCount++;
        return a(remove);
    }

    private audg(ArrayList arrayList) {
        this.c = arrayList;
    }

    /* renamed from: a */
    public final String get(int i) {
        Object obj = this.c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof auay) {
            auay auay = (auay) obj;
            String l = auay.l();
            if (auay.f()) {
                this.c.set(i, l);
            }
            return l;
        }
        byte[] bArr = (byte[]) obj;
        String b2 = aucy.b(bArr);
        if (aucy.a(bArr)) {
            this.c.set(i, b2);
        }
        return b2;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public final void a(auay auay) {
        c();
        this.c.add(auay);
        this.modCount++;
    }
}
