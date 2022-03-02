package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: ofl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ofl implements Runnable {
    private final olg a;
    private final nze b;
    private final Context c;
    private final HelpConfig d;
    private final aoru e;
    private final okc f;

    public ofl(olg olg, nze nze, Context context, HelpConfig helpConfig, aoru aoru, okc okc) {
        this.a = olg;
        this.b = nze;
        this.c = context;
        this.d = helpConfig;
        this.e = aoru;
        this.f = okc;
    }

    public final void run() {
        if (jkf.a(this.c) && ofk.a(this.a, this.b, this.c, this.d, this.e, this.f) == null) {
            String a2 = odu.a(this.d, this.b);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 77);
            sb.append("Got null response when trying to send typing status update for conversation ");
            sb.append(a2);
            sb.append(".");
            Log.w("gH_UpdateTypStatRun", sb.toString());
        }
    }
}
