package defpackage;

import android.text.TextUtils;
import com.google.android.gms.appinvite.service.AppInviteChimeraService;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: dww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dww extends dwq implements jbh {
    private final AppInviteChimeraService a;
    private final jbf b;
    private final ClientContext c;
    private final dwj d;
    private final dwd e;

    public dww(AppInviteChimeraService appInviteChimeraService, jbf jbf, ClientContext clientContext, dwj dwj, dwd dwd) {
        this.a = appInviteChimeraService;
        this.b = jbf;
        this.c = clientContext;
        this.d = dwj;
        this.e = dwd;
    }

    private static final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Invitation id can not be empty.");
        }
    }

    public final void b(dwm dwm, String str) {
        a(str);
        this.b.a(this.a, new dwy(this.c, this.d, this.e, str, dwm));
    }

    public final void a(dwm dwm) {
        this.b.a(this.a, new dxa(this.c, dwm));
    }

    public final void a(dwm dwm, String str) {
        a(str);
        this.b.a(this.a, new dwx(this.c, this.d, this.e, str, dwm));
    }
}
