package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: bul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bul implements Future {
    private final ArrayList a = new ArrayList();

    /* renamed from: a */
    public final synchronized Boolean get() {
        boolean z;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        z = true;
        while (true) {
            if (i >= size) {
                break;
            }
            z = ((Boolean) ((Future) arrayList.get(i)).get()).booleanValue();
            i++;
            if (!z) {
                break;
            }
        }
        this.a.clear();
        return Boolean.valueOf(z);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final synchronized boolean isDone() {
        boolean z;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        z = true;
        for (int i = 0; i < size; i++) {
            z &= ((Future) arrayList.get(i)).isDone();
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized Boolean get(long j, TimeUnit timeUnit) {
        boolean z;
        long nanoTime = System.nanoTime() + timeUnit.toNanos(j);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        z = true;
        while (true) {
            if (i >= size) {
                break;
            }
            z = ((Boolean) ((Future) arrayList.get(i)).get(nanoTime - System.nanoTime(), TimeUnit.NANOSECONDS)).booleanValue();
            i++;
            if (!z) {
                break;
            }
        }
        this.a.clear();
        return Boolean.valueOf(z);
    }

    public final synchronized void a(Future future) {
        boolean z;
        if (this != buk.a) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        this.a.add(future);
    }
}
