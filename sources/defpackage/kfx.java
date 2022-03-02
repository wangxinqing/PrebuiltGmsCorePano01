package defpackage;

import android.content.Context;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kfx extends kez {
    public kfx(kec kec, kwg kwg) {
        super("GetCurrentChangeSequenceNumberOperation", kec, kwg, 41);
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL);
    }

    public final void d(Context context) {
        this.b.a(this.a.k());
    }
}
