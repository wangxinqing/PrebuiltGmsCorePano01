package defpackage;

import android.content.Context;
import java.util.Locale;

/* renamed from: wpm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wpm extends wpa {
    private final long a;
    private final boolean b;

    public wpm(String str, int i, wmq wmq, long j, boolean z) {
        super(str, i, wmq, "LoadContactImageByContactId");
        this.a = j;
        this.b = z;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        Locale locale = Locale.US;
        Object[] objArr = {Long.valueOf(this.a), Boolean.valueOf(this.b)};
    }

    /* access modifiers changed from: protected */
    public final byte[] d(Context context) {
        return wto.b(context, this.a, this.b);
    }
}
