package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kft extends key {
    private final kef f;

    public kft(kec kec, kwg kwg, kef kef) {
        super("DisconnectOperation", kec, kwg);
        this.f = kef;
    }

    public final Set a() {
        return EnumSet.allOf(jzl.class);
    }

    public final void b(Context context) {
        this.a.q.b();
        this.f.a(true);
    }

    public final void a(Status status) {
        this.a.q.b();
        super.a(status);
    }
}
