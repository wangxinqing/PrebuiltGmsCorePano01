package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: amui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class amui implements Iterator {
    int a;
    int b = -1;
    amur c;
    AtomicReferenceArray d;
    amvp e;
    amvn f;
    amvn g;
    final /* synthetic */ amvo h;

    public amui(amvo amvo) {
        this.h = amvo;
        this.a = amvo.d.length - 1;
        a();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f = null;
        if (!b() && !c()) {
            while (true) {
                int i = this.a;
                if (i >= 0) {
                    amur[] amurArr = this.h.d;
                    this.a = i - 1;
                    amur amur = amurArr[i];
                    this.c = amur;
                    if (amur.b != 0) {
                        AtomicReferenceArray atomicReferenceArray = this.c.f;
                        this.d = atomicReferenceArray;
                        this.b = atomicReferenceArray.length() - 1;
                        if (c()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        amvp amvp = this.e;
        if (amvp == null) {
            return false;
        }
        while (true) {
            this.e = amvp.b();
            amvp amvp2 = this.e;
            if (amvp2 == null) {
                return false;
            }
            if (a(amvp2)) {
                return true;
            }
            amvp = this.e;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        while (true) {
            int i = this.b;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            this.b = i - 1;
            amvp amvp = (amvp) atomicReferenceArray.get(i);
            this.e = amvp;
            if (amvp != null && (a(amvp) || b())) {
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final amvn d() {
        amvn amvn = this.f;
        if (amvn != null) {
            this.g = amvn;
            a();
            return this.g;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f != null;
    }

    public final void remove() {
        amrl.b(this.g != null);
        this.h.remove(this.g.a);
        this.g = null;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final boolean a(amvp amvp) {
        try {
            long a2 = this.h.p.a();
            Object d2 = amvp.d();
            amvo amvo = this.h;
            Object obj = null;
            if (amvp.d() != null) {
                Object obj2 = amvp.a().get();
                if (obj2 != null) {
                    if (!amvo.a(amvp, a2)) {
                        obj = obj2;
                    }
                }
            }
            if (obj != null) {
                this.f = new amvn(this.h, d2, obj);
                this.c.e();
                return true;
            }
            this.c.e();
            return false;
        } catch (Throwable th) {
            this.c.e();
            throw th;
        }
    }
}
