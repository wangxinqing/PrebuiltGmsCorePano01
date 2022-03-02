package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* renamed from: ynl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ynl implements Handler.Callback {
    private static ynl e;
    public final Handler a = new qvr(Looper.getMainLooper(), this);
    public final izb b;
    public final Context c;
    public final BitmapFactory.Options d;
    private final ExecutorService f = qvj.b.d(4);
    private final HashSet g = new HashSet();
    private final Resources h;

    private ynl(Context context) {
        this.c = context.getApplicationContext();
        izb izb = new izb(this.c, (String) null, (String) null, true, false, (String) null, (String) null);
        this.b = izb;
        izb.g = 6400;
        this.h = this.c.getResources();
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.d = options;
        options.inDensity = 320;
        this.d.inTargetDensity = this.h.getDisplayMetrics().densityDpi;
        this.d.inScaled = true;
    }

    public static ynl a(Context context) {
        if (e == null) {
            e = new ynl(context);
        }
        return e;
    }

    public final void b(ynk ynk) {
        this.g.remove(ynk);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            ynj ynj = (ynj) message.obj;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.h, ynj.b);
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                ((ynk) it.next()).a(ynj.a, bitmapDrawable);
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            ynj ynj2 = (ynj) message.obj;
            Iterator it2 = this.g.iterator();
            while (it2.hasNext()) {
                ((ynk) it2.next()).a(ynj2.a, (Drawable) null);
            }
            return true;
        }
    }

    public final void a(ynk ynk) {
        this.g.add(ynk);
    }

    public final void a(yxi yxi, String str) {
        this.f.execute(new ynj(this, ApplicationEntity.a(yxi), str));
    }
}
