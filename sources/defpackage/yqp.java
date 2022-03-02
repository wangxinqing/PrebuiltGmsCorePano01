package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: yqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yqp implements icm {
    final /* synthetic */ yqq a;
    private final AudienceMember b;
    private final String c;

    public yqp(yqq yqq, AudienceMember audienceMember, String str) {
        this.a = yqq;
        this.b = audienceMember;
        this.c = str;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        String str;
        wlg wlg = (wlg) icl;
        if (wlg == null || !wlg.aO().c() || (str = this.b.d) == null || !str.equals(wlg.b().get(0))) {
            this.a.a(7, new iid(1, this.b, 2, (String) null).a(), (Status) null);
            return;
        }
        this.a.a(-1, new iid(1, this.b, 1, this.c).a(), wlg.aO());
    }
}
