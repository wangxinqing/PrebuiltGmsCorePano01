package defpackage;

import android.app.AppOpsManager;

/* renamed from: tld  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tld implements AppOpsManager.OnOpChangedListener {
    private final tlh a;

    public tld(tlh tlh) {
        this.a = tlh;
    }

    public final void onOpChanged(String str, String str2) {
        tlh tlh = this.a;
        if (!tlh.d.equals(str2)) {
            ((anih) ((anih) tky.a.d()).a("tlh", "b", 517, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring irrelevant visibility change for package %s", (Object) str2);
        } else {
            tlh.e();
        }
    }
}
