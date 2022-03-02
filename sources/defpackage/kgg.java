package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kgg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kgg extends key {
    public static final ith f = new ith("IsAutobackupEnabledOper", "");

    public kgg(kec kec, kwg kwg) {
        super("IsAutobackupEnabledOper", kec, kwg, 38);
    }

    public final Set a() {
        return EnumSet.allOf(jzl.class);
    }

    public final void b(Context context) {
        String str = this.a.d.a.a;
        if (str != null) {
            ibz ibz = new ibz(context);
            ibz.a(str);
            ibz.a(yjh.a);
            new kgf(ibz.b(), str, this.b).execute(new Void[0]);
            return;
        }
        this.b.a(Status.c);
    }
}
