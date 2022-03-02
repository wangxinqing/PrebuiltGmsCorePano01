package defpackage;

import android.content.Context;
import java.util.Locale;

/* renamed from: wpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wpq extends wpa {
    private final long a;
    private final boolean b;

    public wpq(String str, int i, wmq wmq, long j, boolean z) {
        super(str, i, wmq, "LoadRawContactImageByRawContactIdOperation");
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
        return wto.a(context, this.a, this.b);
    }
}
