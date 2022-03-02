package defpackage;

import com.google.android.gms.R;

/* renamed from: wek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wek implements acvs {
    private final wgu a;
    private final String b;

    public wek(wgu wgu, String str) {
        this.a = wgu;
        this.b = str;
    }

    public final void a(Exception exc) {
        wgu wgu = this.a;
        String str = this.b;
        wgu.a(0, (int) R.string.sharing_toast_wifi_connection_failed, str);
        anih anih = (anih) vvj.a.c();
        anih.a((Throwable) exc);
        ((anih) anih.a("wgu", "a", 2891, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WifiUtils#connectToWifi failed to connect to %s", (Object) str);
    }
}
