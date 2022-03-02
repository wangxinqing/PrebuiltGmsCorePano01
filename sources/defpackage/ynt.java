package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* renamed from: ynt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ynt implements Handler.Callback {
    private static ynt f;
    public final Handler a = new qvr(Looper.getMainLooper(), this);
    public final izb b;
    public final Context c;
    public final BitmapFactory.Options d;
    public final Resources e;
    private final ExecutorService g = qvj.b.d(4);
    private final HashSet h = new HashSet();

    private ynt(Context context) {
        this.c = context.getApplicationContext();
        izb izb = new izb(this.c, (String) null, (String) null, true, false, (String) null, (String) null);
        this.b = izb;
        izb.g = 6400;
        this.e = this.c.getResources();
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.d = options;
        options.inDensity = 320;
        this.d.inTargetDensity = this.e.getDisplayMetrics().densityDpi;
        this.d.inScaled = true;
    }

    public static ynt a(Context context) {
        if (f == null) {
            f = new ynt(context);
        }
        return f;
    }

    public final void b(yns yns) {
        this.h.remove(yns);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            ynr ynr = (ynr) message.obj;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.e, ynr.b);
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                ((yns) it.next()).a(ynr.a, bitmapDrawable);
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            ynr ynr2 = (ynr) message.obj;
            Iterator it2 = this.h.iterator();
            while (it2.hasNext()) {
                ((yns) it2.next()).a(ynr2.a, (Drawable) null);
            }
            return true;
        }
    }

    public final void a(String str) {
        this.g.execute(new ynr(this, str));
    }

    public final void a(yns yns) {
        this.h.add(yns);
    }
}
