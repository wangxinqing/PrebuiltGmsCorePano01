package defpackage;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/* renamed from: abeq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abeq implements Runnable {
    private final Context a;
    private final String b;

    public abeq(Context context, String str) {
        this.a = context.getApplicationContext();
        this.b = str;
    }

    public final void run() {
        Toast.makeText(this.a, this.b, 1).show();
        Log.i("SignInHelper", this.b);
    }
}
