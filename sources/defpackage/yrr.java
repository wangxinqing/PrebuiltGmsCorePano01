package defpackage;

import android.content.Context;
import android.database.Cursor;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.DefaultChimeraIntentService;

/* renamed from: yrr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yrr {
    private static yrr g;
    public final izb a;
    public final yse b;
    public final ysd c;
    public final ysb d;
    public final yrs e;
    public final yru f;

    private yrr(Context context) {
        Context applicationContext = context.getApplicationContext();
        zal zal = new zal(applicationContext, (String) ysu.d.c(), (String) ysu.e.c(), ((Boolean) ysu.a.c()).booleanValue(), ((Boolean) ysu.b.c()).booleanValue(), (String) ysu.c.c(), (String) ysu.f.c());
        zal zal2 = new zal(applicationContext, (String) ysu.d.c(), "", ((Boolean) ysu.a.c()).booleanValue(), ((Boolean) ysu.b.c()).booleanValue(), (String) ysu.c.c(), (String) ysu.f.c());
        zal zal3 = new zal(applicationContext, (String) ysu.k.c(), (String) ysu.l.c(), ((Boolean) ysu.a.c()).booleanValue(), ((Boolean) ysu.b.c()).booleanValue(), (String) ysu.c.c(), (String) ysu.m.c());
        zal zal4 = new zal(applicationContext, (String) ysu.h.c(), (String) ysu.i.c(), ((Boolean) ysu.a.c()).booleanValue(), ((Boolean) ysu.b.c()).booleanValue(), (String) ysu.c.c(), (String) ysu.j.c());
        zal zal5 = new zal(applicationContext, (String) ((amsz) iks.m).a, (String) iks.n.c(), ((Boolean) ysu.a.c()).booleanValue(), ((Boolean) ysu.b.c()).booleanValue(), (String) ysu.c.c(), "");
        zal zal6 = new zal(applicationContext, (String) ysu.n.c(), (String) ysu.o.c(), ((Boolean) ysu.a.c()).booleanValue(), ((Boolean) ysu.b.c()).booleanValue(), (String) ysu.c.c(), (String) ysu.p.c());
        this.a = zal6;
        zal6.g = 6400;
        this.b = new yse(new zcs(zal), new zda(zal2), zav.a);
        this.c = new ysd(zal4);
        this.e = new yrs(zal3, new zdb(zal3));
        this.d = new ysb(zal3, new zdd(zal3));
        this.f = new yru(zal4, zal5);
    }

    public static synchronized yrr a(Context context) {
        yrr yrr;
        synchronized (yrr.class) {
            if (g == null) {
                g = new yrr(context);
            }
            yrr = g;
        }
        return yrr;
    }

    public final String a(Context context, ClientContext clientContext) {
        if (clientContext.b() != null) {
            return a(context, clientContext, 0).b();
        }
        return null;
    }

    public final ysy a(Context context, ClientContext clientContext, int i) {
        boolean z = true;
        if (i != 1) {
            Cursor a2 = zaj.a(context.getContentResolver(), clientContext.b());
            if (a2 != null) {
                try {
                    if (a2.moveToFirst()) {
                        if (a2.getInt(a2.getColumnIndex("signedUp")) == 0) {
                            return this.b.a(context, clientContext);
                        }
                        if (System.currentTimeMillis() - a2.getLong(a2.getColumnIndex("updated")) > 3600000) {
                            DefaultChimeraIntentService.a(context, new zbi(clientContext, (yth) null));
                        }
                        String string = a2.getString(a2.getColumnIndex("display_name"));
                        String string2 = a2.getString(a2.getColumnIndex("profile_image_url"));
                        if (a2.getInt(a2.getColumnIndex("signedUp")) == 0) {
                            z = false;
                        }
                        ysy ysy = new ysy(string, string2, z);
                        a2.close();
                        return ysy;
                    }
                } finally {
                    a2.close();
                }
            }
            if (a2 != null) {
                a2.close();
            }
        }
        return this.b.a(context, clientContext);
    }
}
