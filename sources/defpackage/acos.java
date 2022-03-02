package defpackage;

import android.content.Context;
import com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView;

/* renamed from: acos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acos implements ivb {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ String e;

    public acos(Context context, String str, String str2, String str3, String str4) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        Integer num = (Integer) obj;
        Context context = this.a;
        if (acds.a(context, this.b, this.c, this.d, this.e, acds.a(context, "com.google"))) {
            AccountChallengeWebView.a.a("Successfully updated account with credential", new Object[0]);
            return false;
        }
        AccountChallengeWebView.a.a("Upserting with credentials failed", new Object[0]);
        return true;
    }
}
