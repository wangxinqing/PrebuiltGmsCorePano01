package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: bagn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bagn implements balj {
    public final String toString() {
        return "grpc-default-executor";
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(bagt.c("grpc-default-executor-%d"));
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
