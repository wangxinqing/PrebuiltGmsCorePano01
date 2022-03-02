package defpackage;

import android.content.Context;
import android.net.Uri;
import com.android.volley.Response;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.List;

/* renamed from: ocx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ocx implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ HelpConfig b;
    final /* synthetic */ List c;
    final /* synthetic */ Response.Listener d;
    final /* synthetic */ Response.ErrorListener e;
    final /* synthetic */ okc f;

    public ocx(Context context, HelpConfig helpConfig, List list, Response.Listener listener, Response.ErrorListener errorListener, okc okc) {
        this.a = context;
        this.b = helpConfig;
        this.c = list;
        this.d = listener;
        this.e = errorListener;
        this.f = okc;
    }

    public final void run() {
        int i = ocy.j;
        ocy ocy = new ocy(this.a, this.b, Uri.parse(axmj.b()).buildUpon().encodedPath(axmj.a.a().aI()).appendQueryParameter("hl", oal.a()).build().toString(), this.c, this.d, this.e);
        ocy.a(20, this.f);
        ocy.e();
    }
}
