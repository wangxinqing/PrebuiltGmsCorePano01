package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bago  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bago implements balj {
    public final /* bridge */ /* synthetic */ Object a() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, bagt.c("grpc-timer-%d"));
        try {
            newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE}).invoke(newScheduledThreadPool, new Object[]{true});
        } catch (NoSuchMethodException e) {
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
        return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((ScheduledExecutorService) obj).shutdown();
    }
}
