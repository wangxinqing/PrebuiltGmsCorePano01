package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: afnh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afnh implements awdt {
    private final bapu a;
    private final bapu b;
    private final bapu c;
    private final bapu d;
    private final bapu e;
    private final bapu f;

    public afnh(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4, bapu bapu5, bapu bapu6) {
        this.a = bapu;
        this.b = bapu2;
        this.c = bapu3;
        this.d = bapu4;
        this.e = bapu5;
        this.f = bapu6;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.a();
        afng afng = new afng((amri) this.e.a(), scheduledExecutorService, (Context) this.a.a(), (amri) this.f.a(), (agzs) this.c.a(), (amri) ((awdu) this.d).a);
        awdx.a((Object) afng, "Cannot return null from a non-@Nullable @Provides method");
        return afng;
    }
}
