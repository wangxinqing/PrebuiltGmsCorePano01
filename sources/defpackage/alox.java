package defpackage;

import java.util.Map;

/* renamed from: alox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alox extends alqe {
    final /* synthetic */ alpg a;

    public alox(alpg alpg) {
        this.a = alpg;
    }

    public final void a(Map map) {
        alpg alpg = this.a;
        try {
            ((ljp) alpg).d = new izw(((ljp) alpg).b.a(((ljp) alpg).c)).b(((ljp) alpg).c);
        } catch (Exception e) {
            ljp.a.c("AuthorizedAppOAuthToken", String.format("Failed to get OAuth token; using old token: %s", new Object[]{((ljp) alpg).d}), e);
        }
        String str = ((ljp) alpg).d;
        if (str != null) {
            map.put("access_token", str);
        }
    }
}
