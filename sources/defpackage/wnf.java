package defpackage;

import android.content.Context;
import android.util.Pair;

/* renamed from: wnf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class wnf extends wnb {
    private final String c;
    private final String d;
    private final String e;
    private final int f;

    protected wnf(wzv wzv, String str, int i, String str2, String str3, String str4, String str5, int i2) {
        super(str, i, wzv, str3, str5, (byte[]) null);
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
    }

    public abstract Pair a(Context context, wmr wmr, xpk xpk);

    public final Pair c(Context context) {
        return a(context, wmr.a(context, this.f), wmr.a(context, this.d, this.e, this.c));
    }
}
