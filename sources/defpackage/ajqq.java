package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: ajqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajqq {
    public final Context a;

    public ajqq(Context context) {
        this.a = context;
    }

    public final void a(String str) {
        this.a.sendBroadcast(new Intent(str));
    }
}
