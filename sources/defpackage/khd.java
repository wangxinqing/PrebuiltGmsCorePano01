package defpackage;

import android.content.Context;
import com.google.android.gms.drive.internal.TrashResourceRequest;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: khd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class khd extends key {
    private final TrashResourceRequest f;

    public khd(kec kec, TrashResourceRequest trashResourceRequest, kwg kwg) {
        super("TrashResourceOperation", kec, kwg, 21);
        this.f = trashResourceRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        njc.a((Object) this.f, "Invalid trash request.");
        njc.a((Object) this.f.a, "Invalid trash request.");
        this.a.a(this.f.a, this.c, true);
        this.b.b();
    }
}
