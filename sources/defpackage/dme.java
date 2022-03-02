package defpackage;

import android.content.Context;

/* renamed from: dme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class dme {
    public final Context a;
    public final Context b;

    public dme(Context context) {
        iva.a((Object) context);
        Context applicationContext = context.getApplicationContext();
        iva.a((Object) applicationContext, (Object) "Application context can't be null");
        this.a = applicationContext;
        this.b = applicationContext;
    }

    public dpn a(dmd dmd) {
        return new dpn(dmd);
    }

    public dnd b(dmd dmd) {
        return new dnd(dmd);
    }
}
