package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;

/* renamed from: agnl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agnl extends ThreadLocal {
    final /* synthetic */ agnm a;

    public agnl(agnm agnm) {
        this.a = agnm;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        String str;
        long id = Thread.currentThread().getId();
        if (Looper.myLooper() != Looper.getMainLooper()) {
            String valueOf = String.valueOf(Thread.currentThread().getName());
            str = valueOf.length() == 0 ? new String("Thread: ") : "Thread: ".concat(valueOf);
        } else {
            str = "UI Thread";
        }
        agni a2 = agni.a(str, id, 1);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(a2);
        this.a.a.incrementAndGet();
        this.a.c.put(a2, arrayDeque);
        return new WeakReference(arrayDeque);
    }
}
