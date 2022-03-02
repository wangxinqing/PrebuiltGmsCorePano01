package defpackage;

import android.content.Context;
import java.net.URISyntaxException;
import java.util.List;

/* renamed from: hne  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hne {
    public static final fzi a = new hnd();
    private static final iwd c = hir.c("BroadcastManager");
    public final Context b;
    private final hkx d = ((hkx) hkx.i.b());

    public hne(Context context) {
        this.b = context;
    }

    public final void a(pyv pyv, int i) {
        for (String a2 : (List) this.d.a(pyv, hkx.d(i))) {
            try {
                this.b.sendBroadcast(hkd.a(a2).putExtra("dataType", i));
            } catch (URISyntaxException e) {
                c.e("Unable to parse the intent.", e, new Object[0]);
            }
        }
    }
}
