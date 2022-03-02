package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: andj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class andj implements Iterator {
    int a;
    int b = -1;
    andp c;
    AtomicReferenceArray d;
    andk e;
    anei f;
    anei g;
    final /* synthetic */ anej h;

    public andj(anej anej) {
        this.h = anej;
        this.a = anej.c.length - 1;
        a();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f = null;
        if (!b() && !c()) {
            while (true) {
                int i = this.a;
                if (i >= 0) {
                    andp[] andpArr = this.h.c;
                    this.a = i - 1;
                    andp andp = andpArr[i];
                    this.c = andp;
                    if (andp.b != 0) {
                        AtomicReferenceArray atomicReferenceArray = this.c.e;
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
        andk andk = this.e;
        if (andk == null) {
            return false;
        }
        while (true) {
            this.e = andk.c();
            andk andk2 = this.e;
            if (andk2 == null) {
                return false;
            }
            if (a(andk2)) {
                return true;
            }
            andk = this.e;
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
            andk andk = (andk) atomicReferenceArray.get(i);
            this.e = andk;
            if (andk != null && (a(andk) || b())) {
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final anei d() {
        anei anei = this.f;
        if (anei != null) {
            this.g = anei;
            a();
            return this.g;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f != null;
    }

    public final void remove() {
        amxg.a(this.g != null);
        this.h.remove(this.g.a);
        this.g = null;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final boolean a(andk andk) {
        Object obj;
        try {
            Object a2 = andk.a();
            if (andk.a() != null) {
                obj = andk.d();
            } else {
                obj = null;
            }
            if (obj != null) {
                this.f = new anei(this.h, a2, obj);
                this.c.d();
                return true;
            }
            this.c.d();
            return false;
        } catch (Throwable th) {
            this.c.d();
            throw th;
        }
    }
}
