package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: acws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acws {
    public static acwa a() {
        acwi acwi = new acwi();
        acwi.g();
        return acwi;
    }

    public static acwa b(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            return a(collection).a((acvf) new acwn(collection));
        }
        return a((Object) Collections.emptyList());
    }

    public static acwa c(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            return a(collection).b(new acwo(collection));
        }
        return a((Object) Collections.emptyList());
    }

    public static acwa a(Exception exc) {
        acwi acwi = new acwi();
        acwi.a(exc);
        return acwi;
    }

    public static acwa a(Object obj) {
        acwi acwi = new acwi();
        acwi.a(obj);
        return acwi;
    }

    public static acwa b(acwa... acwaArr) {
        return c(Arrays.asList(acwaArr));
    }

    public static acwa a(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return a((Object) null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((acwa) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        acwi acwi = new acwi();
        acwr acwr = new acwr(collection.size(), acwi);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            a((acwa) it2.next(), (acwq) acwr);
        }
        return acwi;
    }

    private static Object b(acwa acwa) {
        if (acwa.b()) {
            return acwa.d();
        }
        if (acwa.c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(acwa.e());
    }

    public static acwa a(Executor executor, Callable callable) {
        iva.a((Object) executor, (Object) "Executor must not be null");
        iva.a((Object) callable, (Object) "Callback must not be null");
        acwi acwi = new acwi();
        executor.execute(new acwm(acwi, callable));
        return acwi;
    }

    public static acwa a(acwa... acwaArr) {
        return a((Collection) Arrays.asList(acwaArr));
    }

    public static Object a(acwa acwa) {
        iva.a();
        iva.a((Object) acwa, (Object) "Task must not be null");
        if (acwa.a()) {
            return b(acwa);
        }
        acwp acwp = new acwp();
        a(acwa, (acwq) acwp);
        acwp.a.await();
        return b(acwa);
    }

    public static Object a(acwa acwa, long j, TimeUnit timeUnit) {
        iva.a();
        iva.a((Object) acwa, (Object) "Task must not be null");
        iva.a((Object) timeUnit, (Object) "TimeUnit must not be null");
        if (acwa.a()) {
            return b(acwa);
        }
        acwp acwp = new acwp();
        a(acwa, (acwq) acwp);
        if (acwp.a.await(j, timeUnit)) {
            return b(acwa);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    private static void a(acwa acwa, acwq acwq) {
        acwa.a(acwg.b, (acvv) acwq);
        acwa.a(acwg.b, (acvs) acwq);
        acwa.a(acwg.b, (acvm) acwq);
    }
}
