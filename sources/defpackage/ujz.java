package defpackage;

import com.google.android.gms.beacon.BleSighting;
import java.util.List;

/* renamed from: ujz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ujz extends gth {
    final /* synthetic */ ukz a;

    public ujz(ukz ukz) {
        this.a = ukz;
    }

    public final void a(int i) {
        ((anih) ((anih) ulh.a.c()).a("ujz", "a", 990, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Beacon module failed with error %s", (Object) uld.a(i));
    }

    public final void a(String str) {
    }

    public final void a(List list) {
    }

    public final void a(int i, BleSighting bleSighting) {
        ukz ukz = this.a;
        ujy ujy = new ujy(this, bleSighting);
        int i2 = ukz.f;
        ukz.a((Runnable) ujy);
    }
}
