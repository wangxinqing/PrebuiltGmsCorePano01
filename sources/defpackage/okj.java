package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.List;

/* renamed from: okj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class okj extends oga {
    private final List a;

    public okj(Context context, HelpConfig helpConfig, Account account, aoru aoru, List list) {
        super(context, helpConfig, account, aoru);
        this.a = list;
    }

    public static aorr a(Context context, HelpConfig helpConfig, Account account, aoru aoru, List list) {
        iva.b("Must be called from a worker thread.");
        return new okj(context, helpConfig, account, aoru, list).l();
    }

    /* access modifiers changed from: protected */
    public final void a(nzw nzw) {
        nzw.v = this.a;
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return Uri.parse(axmj.b()).buildUpon().encodedPath(axmj.x()).build().toString();
    }

    public final void onPreNetworkDispatch() {
        izj.b(3841);
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return ogg.a(axpd.a.a().b());
    }
}
