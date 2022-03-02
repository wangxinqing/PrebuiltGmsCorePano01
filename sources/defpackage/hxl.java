package defpackage;

import java.util.concurrent.Callable;

/* renamed from: hxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class hxl implements Callable {
    private final boolean a;
    private final String b;
    private final hxm c;

    public hxl(boolean z, String str, hxm hxm) {
        this.a = z;
        this.b = str;
        this.c = hxm;
    }

    public final Object call() {
        boolean z = this.a;
        String str = this.b;
        hxm hxm = this.c;
        boolean z2 = true;
        if (z || !hxs.b(str, hxm, true, false).b) {
            z2 = false;
        }
        return hxv.a(str, hxm, z, z2);
    }
}
