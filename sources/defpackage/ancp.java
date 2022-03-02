package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: ancp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ancp extends amwy implements Serializable, ancq {
    private static final long serialVersionUID = 0;
    public transient ancm a;
    public transient ancm b;
    public transient Map c = amxr.a(12);
    public transient int d;
    public transient int e;

    public static ancp a() {
        return new ancp();
    }

    public static void g(Object obj) {
        if (obj == null) {
            throw new NoSuchElementException();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = new amxv();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            a(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.d);
        for (Map.Entry entry : b()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Iterable iterable) {
        throw null;
    }

    public final List b() {
        return (List) super.l();
    }

    public final int c() {
        return this.d;
    }

    public final void d() {
        this.a = null;
        this.b = null;
        this.c.clear();
        this.d = 0;
        this.e++;
    }

    public final Set e() {
        return new anch(this);
    }

    public final /* bridge */ /* synthetic */ Collection f() {
        return new ancj(this);
    }

    public final /* bridge */ /* synthetic */ Collection h() {
        return new ancg(this);
    }

    public final Iterator i() {
        throw null;
    }

    public final Map j() {
        return new aney(this);
    }

    public final boolean k() {
        throw null;
    }

    public final /* bridge */ /* synthetic */ Collection l() {
        throw null;
    }

    public final /* bridge */ /* synthetic */ Collection n() {
        throw null;
    }

    public final ancm a(Object obj, Object obj2, ancm ancm) {
        ancm ancm2 = new ancm(obj, obj2);
        if (this.a == null) {
            this.b = ancm2;
            this.a = ancm2;
            this.c.put(obj, new ancl(ancm2));
            this.e++;
        } else if (ancm != null) {
            ((ancl) this.c.get(obj)).c++;
            ancm2.d = ancm.d;
            ancm2.f = ancm.f;
            ancm2.c = ancm;
            ancm2.e = ancm;
            ancm ancm3 = ancm.f;
            if (ancm3 == null) {
                ((ancl) this.c.get(obj)).a = ancm2;
            } else {
                ancm3.e = ancm2;
            }
            ancm ancm4 = ancm.d;
            if (ancm4 == null) {
                this.a = ancm2;
            } else {
                ancm4.c = ancm2;
            }
            ancm.d = ancm2;
            ancm.f = ancm2;
        } else {
            ancm ancm5 = this.b;
            ancm5.c = ancm2;
            ancm2.d = ancm5;
            this.b = ancm2;
            ancl ancl = (ancl) this.c.get(obj);
            if (ancl == null) {
                this.c.put(obj, new ancl(ancm2));
                this.e++;
            } else {
                ancl.c++;
                ancm ancm6 = ancl.b;
                ancm6.e = ancm2;
                ancm2.f = ancm6;
                ancl.b = ancm2;
            }
        }
        this.d++;
        return ancm2;
    }

    public final List b(Object obj) {
        List unmodifiableList = Collections.unmodifiableList(anda.a((Iterator) new anco(this, obj)));
        e(obj);
        return unmodifiableList;
    }

    public final boolean d(Object obj) {
        return this.c.containsKey(obj);
    }

    public final void e(Object obj) {
        ance.f(new anco(this, obj));
    }

    /* renamed from: a */
    public final List c(Object obj) {
        return new ancf(this, obj);
    }

    public final void a(ancm ancm) {
        ancm ancm2 = ancm.d;
        if (ancm2 != null) {
            ancm2.c = ancm.c;
        } else {
            this.a = ancm.c;
        }
        ancm ancm3 = ancm.c;
        if (ancm3 != null) {
            ancm3.d = ancm2;
        } else {
            this.b = ancm2;
        }
        if (ancm.f == null && ancm.e == null) {
            ((ancl) this.c.remove(ancm.a)).c = 0;
            this.e++;
        } else {
            ancl ancl = (ancl) this.c.get(ancm.a);
            ancl.c--;
            ancm ancm4 = ancm.f;
            if (ancm4 == null) {
                ancl.a = ancm.e;
            } else {
                ancm4.e = ancm.e;
            }
            ancm ancm5 = ancm.e;
            if (ancm5 == null) {
                ancl.b = ancm4;
            } else {
                ancm5.f = ancm4;
            }
        }
        this.d--;
    }

    public final boolean a(Object obj, Object obj2) {
        a(obj, obj2, (ancm) null);
        return true;
    }
}
