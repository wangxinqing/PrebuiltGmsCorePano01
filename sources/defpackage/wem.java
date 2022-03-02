package defpackage;

import android.content.Context;
import android.widget.Toast;

/* renamed from: wem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wem implements Runnable {
    private final wgu a;
    private final int b;
    private final String[] c;
    private final int d;

    public wem(wgu wgu, int i, String[] strArr, int i2) {
        this.a = wgu;
        this.b = i;
        this.c = strArr;
        this.d = i2;
    }

    public final void run() {
        wgu wgu = this.a;
        int i = this.b;
        String[] strArr = this.c;
        int i2 = this.d;
        Context context = wgu.f;
        Toast.makeText(context, context.getString(i, (Object[]) strArr), i2).show();
    }
}
