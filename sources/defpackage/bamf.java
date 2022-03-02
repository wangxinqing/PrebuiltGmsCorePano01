package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: bamf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bamf implements balj {
    public final /* bridge */ /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(bagt.c("grpc-okhttp-%d"));
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
