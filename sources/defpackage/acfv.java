package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Map;

/* renamed from: acfv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acfv {
    public static final iwd b = acqa.a("FastPair", "FastPairNotificationController");
    public static final Map c;
    public final Context a;
    public int d;
    public final long e;
    public final byte[] f;
    public final aucd g;

    static {
        nz nzVar = new nz();
        nzVar.put("Pixel", "https://lh3.googleusercontent.com/Y695akw6GQifgofN_GNrZQMTgTZgxnsMg6ZoQNX84xor7Zxmk7IU0N0GnE-YYha40lqFLH6Fa7qW");
        nzVar.put("Pixel 2", "https://lh3.googleusercontent.com/j4urvb3lXTaFGZI6IzHmAjum2HQVID1OHPhDB7dOzRvXb2WscSX2RFwEEFFSYhajqRO5Yu0e6FYQ");
        nzVar.put("Pixel 3", "https://lh3.googleusercontent.com/A-RPvqzMpVIUpyVmgwDawhYjSsYIGRquDl1cCKqvO-QAx9UnMR4IFfaY0ge5IQZxwzSguthlzkmgFw");
        nzVar.put("Pixel XL", "https://lh3.googleusercontent.com/nGqJSoKIA3sQOLJ2e45MWEXXQLWcm7d5CfngQLzlhJ0l7zRDaiBZJRBypTBEGJHfTEg9CQzHRwP0mQ");
        nzVar.put("Pixel 2 XL", "https://lh3.googleusercontent.com/5J7qV0fpEvD-d-cb-8OFaMbR0rDFT5Tcb3X3aIG0C-p0uPKdCYLxiMpssLXzX9FjEBNBkB4yohA");
        nzVar.put("Pixel 3 XL", "https://lh3.googleusercontent.com/3bVhlM_Foj9-K6Wulk9TalAW30osEgoxiTLgCF-oH9fmLPq4rup-q5ULPPbu7N9gpKAs35UER3w");
        c = Collections.unmodifiableMap(nzVar);
    }

    public acfv(Context context, aucd aucd, long j, byte[] bArr) {
        this.g = aucd;
        this.a = context;
        this.e = j;
        this.f = bArr;
    }
}
