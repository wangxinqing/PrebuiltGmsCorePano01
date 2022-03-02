package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.phenotype.ExperimentTokens;

/* renamed from: acwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acwy {
    acrz a;
    public int b;
    long c;
    public ExperimentTokens d;
    final acwz e;
    public boolean f;
    public final int g;
    public int h;

    public acwy(Context context, int i) {
        this.h = 0;
        this.c = System.currentTimeMillis();
        this.g = i;
        this.f = true;
        if (!azqq.a.a().l() || Build.VERSION.SDK_INT < 26) {
            this.e = new acxe();
        } else {
            this.e = new acxy();
        }
        acrz acrz = new acrz(context, 1, "wake:CollectionChimeraSvc", (String) null, "com.google.android.gms");
        this.a = acrz;
        acrz.a(false);
        this.a.a(5000);
    }

    public final void a() {
        this.f = false;
    }

    public acwy(Context context, acwz acwz) {
        this(context, 2);
        this.e = acwz;
    }
}
