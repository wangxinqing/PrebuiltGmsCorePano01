package defpackage;

import android.database.Observable;

/* renamed from: ach  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ach extends Observable {
    public final void a(int i, int i2) {
        a(i, i2, (Object) null);
    }

    public final void b() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aci) this.mObservers.get(size)).a();
        }
    }

    public final void c(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aci) this.mObservers.get(size)).c(i, i2);
        }
    }

    public final void d(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aci) this.mObservers.get(size)).d(i, i2);
        }
    }

    public final void a(int i, int i2, Object obj) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aci) this.mObservers.get(size)).a(i, i2, obj);
        }
    }

    public final void b(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((aci) this.mObservers.get(size)).b(i, i2);
        }
    }

    public final boolean a() {
        return !this.mObservers.isEmpty();
    }
}
