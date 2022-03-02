package defpackage;

import android.content.Context;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: wog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wog extends wnc {
    private final String b;
    private final String c;
    private final int d;

    public wog(String str, int i, wzv wzv, String str2, String str3, int i2) {
        super(str, i, wzv, (String) null, "LoadContactsGaiaIds");
        this.b = str2;
        this.c = str3;
        this.d = i2;
    }

    public final DataHolder d(Context context) {
        return wop.a(context, this.b, this.c, this.d);
    }
}
