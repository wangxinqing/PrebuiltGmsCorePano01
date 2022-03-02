package defpackage;

import com.google.android.gms.beacon.BleSighting;

/* renamed from: ujy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ujy implements Runnable {
    private final ujz a;
    private final BleSighting b;

    public ujy(ujz ujz, BleSighting bleSighting) {
        this.a = ujz;
        this.b = bleSighting;
    }

    public final void run() {
        ujz ujz = this.a;
        BleSighting bleSighting = this.b;
        ukz ukz = ujz.a;
        int i = ukz.f;
        ukz.a(bleSighting);
    }
}
