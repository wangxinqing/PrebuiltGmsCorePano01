package defpackage;

import android.content.Context;

/* renamed from: uza  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uza {
    private final Context a;
    private final avch b;
    private uzl c;
    private final ob d = new ob();

    public uza(Context context, avch avch) {
        this.a = context;
        this.b = avch;
    }

    /* access modifiers changed from: package-private */
    public final uzl a(String str) {
        uzl uzl;
        if (this.d.add(str) && this.c == null) {
            avch avch = this.b;
            Context context = this.a;
            avch avch2 = avch.TOKEN_MEDIUM_UNKNOWN;
            int ordinal = avch.ordinal();
            if (ordinal == 1) {
                uzl = new uzl(context, true, "inaudible: ");
            } else if (ordinal != 8) {
                uzl = null;
            } else {
                uzl = new uzl(context, false, "audible: ");
            }
            this.c = uzl;
        }
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        if (this.d.remove(str) && this.d.b == 0) {
            this.c = null;
        }
    }
}
