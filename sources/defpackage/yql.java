package defpackage;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: yql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yql implements icm {
    final /* synthetic */ yqq a;

    public yql(yqq yqq) {
        this.a = yqq;
    }

    public final /* bridge */ /* synthetic */ void a(icl icl) {
        String str;
        wld wld = (wld) icl;
        if (wld == null || !wld.aO().c()) {
            this.a.a();
            return;
        }
        AudienceMember b = AudienceMember.b(wld.b(), wld.c());
        Intent intent = this.a.getActivity().getIntent();
        String a2 = iic.a(intent);
        String c = iic.c(intent);
        yqq yqq = this.a;
        AudienceMember audienceMember = yqq.f;
        if (audienceMember == null || (str = audienceMember.e) == null) {
            this.a.a(-1, new iid(1, b, 3, (String) null).a(), (Status) null);
            return;
        }
        ibq ibq = wlt.a;
        String str2 = str;
        xcy.a(yqq.e, a2, c, str2, Arrays.asList(new String[]{wld.b()}), new ArrayList(), (FavaDiagnosticsEntity) null).a((icm) new yqp(this.a, b, str));
    }
}
