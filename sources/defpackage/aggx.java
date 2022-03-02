package defpackage;

import java.util.concurrent.Executors;

/* renamed from: aggx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aggx implements awdt {
    private final bapu a;

    public aggx(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        aghs aghs = (aghs) this.a.a();
        Object b = aghs.b() != null ? aghs.b() : aghs.a() != null ? aghs.a() : Executors.newSingleThreadExecutor(new aggv("Primes-init", aghs.c()));
        awdx.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }
}
