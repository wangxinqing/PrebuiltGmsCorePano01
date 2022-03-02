package defpackage;

import android.content.Context;
import com.google.android.gms.notifications.GunsBrowserChimeraActivity;
import java.io.IOException;

/* renamed from: wjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wjd extends jfx {
    final /* synthetic */ Context a;
    final /* synthetic */ String e;
    final /* synthetic */ GunsBrowserChimeraActivity f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wjd(GunsBrowserChimeraActivity gunsBrowserChimeraActivity, Context context, String str) {
        super(9);
        this.f = gunsBrowserChimeraActivity;
        this.a = context;
        this.e = str;
    }

    public final void run() {
        String str;
        try {
            str = qdc.a(this.a).a(this.e, "GCM");
        } catch (IOException e2) {
            anih anih = (anih) GunsBrowserChimeraActivity.a.b();
            anih.a((Throwable) e2);
            anih.a("Failed to get IIDToken for project: %s", (Object) this.e);
            str = "";
        }
        jjg jjg = GunsBrowserChimeraActivity.a;
        GunsBrowserChimeraActivity gunsBrowserChimeraActivity = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("window.setIIDToken('");
        sb.append(str);
        sb.append("');");
        gunsBrowserChimeraActivity.c(sb.toString());
    }
}
