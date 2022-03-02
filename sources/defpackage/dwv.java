package defpackage;

import com.google.android.gms.appinvite.service.AppInviteChimeraService;
import com.google.android.gms.common.internal.ClientContext;
import java.util.List;
import java.util.Map;

/* renamed from: dwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dwv extends dwo implements jbh {
    private final AppInviteChimeraService a;
    private final jbf b;
    private final ClientContext c;
    private final dwj d;

    public dwv(AppInviteChimeraService appInviteChimeraService, jbf jbf, ClientContext clientContext, dwj dwj) {
        this.a = appInviteChimeraService;
        this.b = jbf;
        this.c = clientContext;
        this.d = dwj;
    }

    public final void a(dwn dwn) {
        this.b.a(this.a, new dxb(this.c, this.d, dwn));
    }

    public final void a(dwn dwn, String str, String str2, String str3, String str4, String str5, Map map, String str6, String str7, List list, String str8, String str9, String str10, String str11, byte[] bArr, int i, int i2, String str12, String str13, int i3, String str14) {
        dwn dwn2 = dwn;
        jbf jbf = this.b;
        dwz dwz = r1;
        AppInviteChimeraService appInviteChimeraService = this.a;
        AppInviteChimeraService appInviteChimeraService2 = appInviteChimeraService;
        jbf jbf2 = jbf;
        dwz dwz2 = new dwz(this.c, this.d, str, str2, str3, str4, str5, map, str6, str7, list, str8, str9, str10, str11, bArr, i, i2, str12, str13, i3, str14, dwn2);
        jbf2.a(appInviteChimeraService2, dwz);
    }
}
