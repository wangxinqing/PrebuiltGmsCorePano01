package defpackage;

import android.util.DisplayMetrics;
import java.util.Locale;

/* renamed from: dnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dnc extends dma {
    public dnc(dmd dmd) {
        super(dmd);
    }

    /* access modifiers changed from: protected */
    public final void a() {
    }

    public final dli b() {
        q();
        DisplayMetrics displayMetrics = g().b.getResources().getDisplayMetrics();
        dli dli = new dli();
        dli.a = dpx.a(Locale.getDefault());
        dli.b = displayMetrics.widthPixels;
        dli.c = displayMetrics.heightPixels;
        return dli;
    }
}
