package defpackage;

import android.content.Context;
import com.google.android.gms.drive.internal.UntrashResourceRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: khf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class khf extends key {
    private final UntrashResourceRequest f;

    public khf(kec kec, UntrashResourceRequest untrashResourceRequest, kwg kwg) {
        super("UntrashResourceOperation", kec, kwg, 33);
        this.f = untrashResourceRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        njc.a((Object) this.f, "Invalid untrash request.");
        njc.a((Object) this.f.a, "Invalid untrash request.");
        this.a.a(this.f.a, this.c, false);
        this.b.b();
    }
}
