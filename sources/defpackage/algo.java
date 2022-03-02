package defpackage;

import android.os.Bundle;

/* renamed from: algo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class algo implements Runnable {
    private final algp a;
    private final String b;
    private final Bundle c;

    public algo(algp algp, String str, Bundle bundle) {
        this.a = algp;
        this.b = str;
        this.c = bundle;
    }

    public final void run() {
        this.a.b(this.b, this.c);
    }
}
