package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: amve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class amve extends WeakReference implements amvp {
    final int g;
    final amvp h;
    volatile amva i = amvo.s;

    public amve(ReferenceQueue referenceQueue, Object obj, int i2, amvp amvp) {
        super(obj, referenceQueue);
        this.g = i2;
        this.h = amvp;
    }

    public final amva a() {
        return this.i;
    }

    public final void a(amva amva) {
        this.i = amva;
    }

    public final amvp b() {
        return this.h;
    }

    public final int c() {
        return this.g;
    }

    public final Object d() {
        return get();
    }

    public long e() {
        throw new UnsupportedOperationException();
    }

    public amvp f() {
        throw new UnsupportedOperationException();
    }

    public amvp g() {
        throw new UnsupportedOperationException();
    }

    public long h() {
        throw new UnsupportedOperationException();
    }

    public amvp i() {
        throw new UnsupportedOperationException();
    }

    public amvp j() {
        throw new UnsupportedOperationException();
    }

    public void a(long j) {
        throw new UnsupportedOperationException();
    }

    public void b(long j) {
        throw new UnsupportedOperationException();
    }

    public void c(amvp amvp) {
        throw new UnsupportedOperationException();
    }

    public void d(amvp amvp) {
        throw new UnsupportedOperationException();
    }

    public void b(amvp amvp) {
        throw new UnsupportedOperationException();
    }

    public void a(amvp amvp) {
        throw new UnsupportedOperationException();
    }
}
