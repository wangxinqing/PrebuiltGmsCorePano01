package defpackage;

import android.content.Context;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class kfb extends kfa {
    protected kfb(String str, kec kec, kwg kwg) {
        super(str, kec, kwg, (String) null);
    }

    public Set a() {
        return EnumSet.allOf(jzl.class);
    }

    public abstract void c();

    public final void c(Context context) {
        c();
    }

    protected kfb(String str, kec kec, kwg kwg, byte[] bArr) {
        super(str, kec, kwg, (String) null, 62);
    }
}
