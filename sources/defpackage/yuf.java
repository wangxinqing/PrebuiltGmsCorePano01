package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.internal.PlusCommonExtras;

/* renamed from: yuf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yuf {
    public int a = 2;
    public Intent b;
    private final Context c;
    private final ClientContext d;
    private boolean e = false;

    public yuf(Context context, ClientContext clientContext) {
        this.c = context;
        this.d = clientContext;
    }

    public final Intent a() {
        PendingIntent pendingIntent;
        String str;
        yud yud = new yud();
        yud.a = this.a;
        Context context = this.c;
        Intent intent = this.b;
        String str2 = null;
        if (intent != null) {
            pendingIntent = jhg.a(context, intent, 134217728);
        } else {
            pendingIntent = null;
        }
        yud.b = pendingIntent;
        if (this.d.f()) {
            str = this.d.g();
        } else {
            str = null;
        }
        yud.c = str;
        if (!this.e) {
            str2 = this.d.b();
        }
        yud.d = str2;
        yud.e = this.d.e();
        ClientContext clientContext = this.d;
        yud.f = clientContext.e;
        yud.g = clientContext.f;
        yud.h = clientContext.h();
        yud.i = this.d.i;
        Bundle bundle = new Bundle();
        if (yud.a == 2 && !yue.a(yud.e)) {
            yud.a = 0;
        }
        yue.a(bundle, yud.d, yud.f, yud.g, yud.a, yud.c, yud.h, yud.b);
        Bundle bundle2 = yud.i;
        if (bundle2 != null) {
            PlusCommonExtras.b(bundle2).a(bundle);
        }
        Intent intent2 = new Intent("com.google.android.gms.plus.action.SIGN_UP");
        intent2.putExtras(bundle);
        return intent2;
    }

    public final void b() {
        this.e = true;
    }
}
