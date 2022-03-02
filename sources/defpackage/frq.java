package defpackage;

import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity;

/* renamed from: frq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class frq implements amrm {
    private final frr a;

    public frq(frr frr) {
        this.a = frr;
    }

    public final boolean a(Object obj) {
        String str = (String) obj;
        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = this.a.a;
        if (!hiq.b(str)) {
            return false;
        }
        String a2 = hiq.a(str);
        amri a3 = hiq.a(credentialsSettingsChimeraActivity, hiq.c(a2));
        return a3.a() && ((String) a3.b()).equals(a2);
    }
}
