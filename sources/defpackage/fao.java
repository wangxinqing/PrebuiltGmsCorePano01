package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: fao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fao implements ax {
    private final fbk a;

    public fao(fbk fbk) {
        this.a = fbk;
    }

    public final void a(Object obj) {
        fbk fbk = this.a;
        Status status = (Status) obj;
        if (status.i != 0) {
            fbk.g.d();
            fbk.f.a(new fbm(status, ampu.a));
            return;
        }
        fbk.g.c();
    }
}
