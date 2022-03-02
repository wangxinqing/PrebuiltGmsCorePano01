package defpackage;

import com.google.android.gms.notifications.GunsBrowserChimeraActivity;

/* renamed from: wje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class wje implements acvs {
    final /* synthetic */ GunsBrowserChimeraActivity a;

    public wje(GunsBrowserChimeraActivity gunsBrowserChimeraActivity) {
        this.a = gunsBrowserChimeraActivity;
    }

    public final void a(Exception exc) {
        GunsBrowserChimeraActivity gunsBrowserChimeraActivity = this.a;
        int a2 = ((ibr) exc).a();
        StringBuilder sb = new StringBuilder(49);
        sb.append("window.onFetchPhoneNumberInfo(");
        sb.append(a2);
        sb.append(" , null)");
        gunsBrowserChimeraActivity.c(sb.toString());
    }
}
