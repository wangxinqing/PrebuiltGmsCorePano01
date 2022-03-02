package defpackage;

import android.content.Context;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import java.util.concurrent.ExecutorService;

/* renamed from: niy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class niy implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;

    public niy(bapu bapu, bapu bapu2, bapu bapu3) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return new nix((Context) this.a.a(), (LifecycleSynchronizer) this.b.a(), (ExecutorService) this.c.a());
    }
}
