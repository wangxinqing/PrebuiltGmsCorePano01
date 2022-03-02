package defpackage;

import android.content.Context;
import com.google.android.chimera.Loader;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: gop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gop extends Loader {
    public static final iwd a = ehv.a("MinuteMaid", "DroidGuardLoader");
    public final String b;
    public final Context c;
    public final Collection d = new LinkedList();
    public gon e;

    public gop(Context context, String str) {
        super(context);
        this.b = str;
        this.c = context;
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((goo) it.next()).cancel(true);
            it.remove();
        }
        gon gon = this.e;
        if (gon != null) {
            gon.a();
            this.e.cancel(true);
            this.e = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        if (this.e == null) {
            gon gon = new gon(this);
            this.e = gon;
            gon.execute(new Void[0]);
        }
    }
}
