package defpackage;

import android.content.ComponentName;
import android.os.IBinder;

/* renamed from: tfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tfh extends qvy {
    final /* synthetic */ tfq a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tfh(tfq tfq, String str) {
        super(str);
        this.a = tfq;
    }

    public final void a(ComponentName componentName) {
        int i = tfq.f;
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        int i = tfq.f;
        tfq tfq = this.a;
        tfq.b = new tdf(tfq.c, asec.a(iBinder), this.a.a);
        this.a.d.countDown();
    }
}
