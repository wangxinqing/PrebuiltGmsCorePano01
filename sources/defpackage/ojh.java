package defpackage;

import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;

/* renamed from: ojh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ojh extends ojk {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ojh(icc icc, Intent intent, WeakReference weakReference) {
        super(icc);
        this.a = intent;
        this.b = weakReference;
    }

    /* access modifiers changed from: protected */
    public final void a(ojt ojt) {
        GoogleHelp googleHelp = (GoogleHelp) this.a.getParcelableExtra("EXTRA_GOOGLE_HELP");
        mum mum = new nyt(googleHelp).a.G;
        ojv ojv = new ojv(googleHelp);
        ojc ojc = new ojc(this, ojt, this, mum);
        GoogleHelp googleHelp2 = ojv.a;
        try {
            ojt ojt2 = ojc.a;
            ojh ojh = ojc.d;
            ojk ojk = ojc.b;
            ojt2.e(googleHelp2, new oji(ojh.a, ojh.b, ojk, ojc.c));
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
            ojc.d.c(ojl.a);
        }
    }
}
