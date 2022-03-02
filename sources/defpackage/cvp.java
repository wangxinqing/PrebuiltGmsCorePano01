package defpackage;

import android.content.Context;

/* renamed from: cvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cvp {
    public final String a;
    public final int b;
    public final boolean c;
    public final anbh d;

    public cvp(String str, int i, boolean z, anbh anbh) {
        this.a = str;
        this.c = z;
        this.b = i;
        this.d = anbh;
    }

    public final boolean a(Context context) {
        anhj a2 = this.d.iterator();
        while (a2.hasNext()) {
            if (((cvo) a2.next()).a(context)) {
                return true;
            }
        }
        return false;
    }
}
