package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.phenotype.Configurations;

/* renamed from: xfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xfq extends yfa {
    private final SharedPreferences d;

    public xfq(yey yey, SharedPreferences sharedPreferences, String str) {
        super(yey, str);
        this.d = sharedPreferences;
    }

    /* access modifiers changed from: protected */
    public final void a(Configurations configurations) {
        yfa.a(this.d, configurations);
    }
}
