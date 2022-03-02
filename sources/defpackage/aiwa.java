package defpackage;

import android.content.Context;
import java.util.Random;

/* renamed from: aiwa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiwa {
    public final Context a;
    public final aizy b;
    public final ajbg c;
    public final aivu d;
    public final aicn e;
    public final ahqp f;
    public final Random g;
    public final aiwd h;
    public final aiwd i;
    public final aiwd j;
    public final atho k;

    public aiwa() {
    }

    public static synchronized void a(Context context) {
        synchronized (aiwa.class) {
            aivw.a(context);
        }
    }

    public static synchronized String b(Context context) {
        String b2;
        synchronized (aiwa.class) {
            b2 = aivw.b(context);
        }
        return b2;
    }

    public static synchronized void a(Context context, String str) {
        synchronized (aiwa.class) {
            aivw.a(context, str);
        }
    }

    public aiwa(Context context, aizy aizy, ajbg ajbg, ahqp ahqp, aivu aivu, aicn aicn) {
        this.g = new Random();
        this.b = aizy;
        this.c = ajbg;
        this.f = ahqp;
        this.d = aivu;
        this.e = aicn;
        this.a = context.getApplicationContext();
        this.k = atho.a();
        this.h = new aiwd(this, 1, ajbe.GLS_QUERY);
        this.i = new aiwd(this, 2, ajbe.GLS_UPLOAD);
        this.j = new aiwd(this, 3, ajbe.GLS_LOC_QUERY);
    }
}
