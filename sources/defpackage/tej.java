package defpackage;

import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;

/* renamed from: tej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tej implements igp {
    private final String a;

    public tej(String str) {
        this.a = str;
    }

    public final void a(Object obj, Object obj2) {
        String str = this.a;
        tdo tdo = (tdo) obj;
        idg b = tev.b((acwd) obj2);
        tdo.w();
        ((tee) tdo.x()).a(new ContinueConnectRequest(str, tea.a(b)));
    }
}
