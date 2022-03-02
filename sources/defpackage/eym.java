package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: eym  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class eym implements ax {
    private final ezb a;

    public eym(ezb ezb) {
        this.a = ezb;
    }

    public final void a(Object obj) {
        ezb ezb = this.a;
        Status status = (Status) obj;
        if (status.i != 0) {
            ezb.a.d();
            ezb.b.a(ezf.b(status.j));
            return;
        }
        ezb.a.c();
    }
}
