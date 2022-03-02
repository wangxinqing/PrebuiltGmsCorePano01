package defpackage;

import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.support.v4.graphics.drawable.IconCompat;
import androidx.slice.Slice;

/* renamed from: mtm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mtm extends mtp {
    private final aoo a;
    private int b;

    public mtm(aoo aoo) {
        this.a = aoo;
        ((anih) ((anih) mte.a.d()).a("mtm", "<init>", 129, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ListSliceBuilderWrapper: Build with AndroidXListSliceBuilder");
    }

    public final Slice a() {
        return ((aov) this.a.a).c();
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        this.b = i;
        this.a.a.a();
    }

    public final void a(PendingIntent pendingIntent, IconCompat iconCompat, String str, String str2, boolean z) {
        int i = this.b;
        if (i != 0) {
            iconCompat.a(i);
            iconCompat.i = PorterDuff.Mode.SRC_IN;
        }
        aoo aoo = this.a;
        aon aon = new aon();
        boolean z2 = !z;
        aon.b = iconCompat;
        aon.a = z2 ? 1 : 0;
        aon.d = str;
        aon.e = str2;
        aon.c = aop.a(pendingIntent, iconCompat, z2, str);
        aoo.a.a(aon);
    }
}
