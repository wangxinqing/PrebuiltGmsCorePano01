package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: lpm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lpm implements icm {
    final /* synthetic */ lpq a;

    public lpm(lpq lpq) {
        this.a = lpq;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        Status status = (Status) icl;
        if (!status.c()) {
            lpq.a.b("SelectFileFragment", "Failed to authorize access (%s)", status.j);
            this.a.a(3);
            this.a.getActivity().finish();
            return;
        }
        lpq lpq = this.a;
        lpq.a(lpq.i.c);
    }
}
