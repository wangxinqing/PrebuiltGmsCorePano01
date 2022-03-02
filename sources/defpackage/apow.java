package defpackage;

import android.content.Context;

/* renamed from: apow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apow implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;

    public apow(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final void run() {
        apox.b(this.a).edit().remove(this.b).apply();
    }
}
