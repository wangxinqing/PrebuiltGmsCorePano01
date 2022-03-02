package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: alhf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alhf {
    public String a = "";
    public View.OnClickListener b = null;
    public int c = 0;
    public int d = 0;
    private final Context e;

    public alhf(Context context) {
        this.e = context;
    }

    public final alhg a() {
        return new alhg(this.a, this.b, this.c, this.d);
    }

    public final void a(int i) {
        this.a = this.e.getString(i);
    }
}
