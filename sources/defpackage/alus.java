package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: alus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alus implements alsu {
    public final alst a;
    public final LinkedList b = new LinkedList();
    public final LinkedList c = new LinkedList();
    public final LinkedList d = new LinkedList();
    public final EnumSet e = EnumSet.noneOf(alsv.class);
    public boolean f;
    private final alui g;
    private final int h;
    private long i;

    public alus(alst alst, alsx alsx, int i2, alui alui) {
        this.a = alst;
        this.g = alui;
        this.h = i2;
        if (alsx != null) {
            this.b.addAll(alsx.b);
            this.c.addAll(alsx.c);
            this.d.addAll(alsx.d);
            a(this.b, alsv.TRUNCATE_UNDO);
            a(this.c, alsv.TRUNCATE_REDO);
        }
    }

    private static final void a(LinkedList linkedList) {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (((amiw) it.next()).b == amiv.KIND_NOT_SET) {
                it.remove();
            }
        }
    }

    public final alsw b(amiw amiw) {
        amiw amiw2;
        EnumSet<E> noneOf = EnumSet.noneOf(alsv.class);
        if (!this.d.isEmpty()) {
            amiw2 = alyo.b.a((List) this.d, amiw);
            noneOf.add(alsv.REFRESH_PENDING_BATCH);
            a(this.d);
        } else {
            amiw2 = amiw;
        }
        if (!this.b.isEmpty()) {
            alyo.b.a((List) this.b, amiw2);
            noneOf.add(alsv.REFRESH_UNDO);
            a(this.b);
        }
        if (!this.c.isEmpty()) {
            amiw = alyo.b.a((List) this.c, amiw);
            noneOf.add(alsv.REFRESH_REDO);
            a(this.c);
        }
        return new alsw(noneOf, amiw);
    }

    private final void a(LinkedList linkedList, alsv alsv) {
        if (this.h != -1 && linkedList.size() > this.h) {
            this.e.add(alsv);
            linkedList.removeLast();
        }
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [alst, aluh] */
    public final alse a(alss alss, amiw amiw) {
        alsh alsh;
        alys.a((Object) amiw, "Cannot put null onto the undo or redo stack");
        alsh alsh2 = null;
        boolean z = false;
        if (amiw.b != amiv.KIND_NOT_SET) {
            boolean z2 = true;
            if (alss.equals(alss.e)) {
                if (!b() || !a()) {
                    z = true;
                }
                this.e.add(alsv.ADD_TO_REDO);
                this.c.push(amiw);
                a(this.c, alsv.TRUNCATE_REDO);
            } else if (alss.equals(alss.f)) {
                if (!a() || !b()) {
                    z = true;
                }
                this.e.add(alsv.ADD_TO_UNDO);
                this.b.push(amiw);
                a(this.b, alsv.TRUNCATE_UNDO);
                alsh = null;
            } else {
                if (a() && !b()) {
                    z2 = false;
                }
                if (this.f) {
                    long j = this.i;
                    List arrayList = new ArrayList();
                    if (!this.d.isEmpty()) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.push((amiw) this.d.peek());
                        alyo.b.a((List) linkedList, aluu.a(this.g, amiw));
                        arrayList = new aluq(this.a).a((amiw) linkedList.get(0)).b;
                    }
                    alsh alsh3 = new alsh(j, arrayList);
                    this.i = System.currentTimeMillis();
                    alsh2 = alsh3;
                }
                this.e.add(alsv.ADD_TO_PENDING_BATCH);
                this.d.push(amiw);
                if (!this.c.isEmpty()) {
                    this.e.add(alsv.REFRESH_REDO);
                    this.c.clear();
                }
                z = z2;
            }
            alsh = alsh2;
        } else {
            alsh = null;
        }
        if (z) {
            this.e.add(alsv.UNDO_REDO_STATE_CHANGED);
        }
        alsw alsw = new alsw(this.e, amiw);
        this.e.clear();
        return new alse((List) null, (Collection) null, (Set) null, (amiw) null, alsw, (amiw) null, alsh);
    }

    public final boolean b() {
        return !this.c.isEmpty();
    }

    public final alsw a(amiw amiw) {
        return b(amiw);
    }

    public final void a(boolean z) {
        amiw amiw;
        alsw alsw = alsw.a;
        if (z) {
            if (!this.d.isEmpty()) {
                amiw = null;
            } else {
                return;
            }
        } else if (this.d.size() > 1) {
            amiw = (amiw) this.d.pop();
        } else {
            return;
        }
        amiw a2 = aluv.a((List) this.d);
        this.e.add(alsv.ADD_TO_UNDO);
        this.b.push(a2);
        a(this.b, alsv.TRUNCATE_UNDO);
        this.e.add(alsv.REFRESH_PENDING_BATCH);
        this.d.clear();
        if (amiw != null) {
            this.d.push(amiw);
        }
        new alsw(this.e, a2);
        this.e.clear();
    }

    public final boolean a() {
        return !this.b.isEmpty() || !this.d.isEmpty();
    }
}
