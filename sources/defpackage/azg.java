package defpackage;

import android.content.Context;

/* renamed from: azg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azg {
    public final String a;
    public final azf b;
    private final Context c;

    public azg(Context context, String str) {
        this.c = context.getApplicationContext();
        this.a = str;
        this.b = new azf(this.c, str);
    }
}
