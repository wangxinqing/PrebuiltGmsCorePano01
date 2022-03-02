package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ahao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahao implements Future {
    private final Uri a;
    private final ahbe b;
    private final CountDownLatch c;
    private final ahaz d;

    public ahao(Uri uri, List list) {
        this.a = uri;
        this.b = ahbe.a(uri);
        this.c = new CountDownLatch(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ahbl) list.get(i)).a(this);
        }
        ahba a2 = this.b.a("transform");
        this.d = a2 != null ? a2.a() : ahba.a("transform");
    }

    /* renamed from: a */
    public final Uri get() {
        this.c.await();
        ahbe ahbe = this.b;
        ahay ahay = new ahay((List) null);
        List list = ahbe.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ahay.a(((ahba) list.get(i)).a());
        }
        ahay.a(this.d);
        return this.a.buildUpon().encodedFragment(ahay.a().toString()).build();
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return this.c.getCount() == 0;
    }

    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        if (this.c.await(j, timeUnit)) {
            return get();
        }
        throw new TimeoutException();
    }

    public final void a(ahbc ahbc) {
        this.d.a(ahbc.a());
        this.c.countDown();
    }
}
