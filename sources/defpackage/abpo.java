package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/* renamed from: abpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abpo {
    public final Context a;
    public final Handler b;
    public final Object c;
    public final abvo d;
    public final String e;
    public final abna f;

    public abpo(Context context, Handler handler, Object obj, abvo abvo) {
        this(context, handler, obj, abvo, (String) null);
    }

    public static abna a(Context context) {
        Application application;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        } else {
            application = null;
        }
        return new abna(jfm.a(1, 10), new ahgr(applicationContext, "STREAMZ_SMARTDEVICE"), application, "gmscore_smartdevice");
    }

    public abpo(Context context, Handler handler, Object obj, abvo abvo, String str) {
        this.a = context;
        this.b = handler;
        this.c = obj;
        this.d = abvo;
        this.e = str;
        this.f = a(context);
    }
}
