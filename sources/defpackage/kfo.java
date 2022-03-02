package defpackage;

import android.content.Context;
import com.google.android.gms.drive.internal.CreateContentsRequest;
import com.google.android.gms.drive.internal.OnContentsResponse;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kfo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kfo extends key {
    private final kei f;
    private final CreateContentsRequest g;

    public kfo(kec kec, kei kei, CreateContentsRequest createContentsRequest, kwg kwg) {
        super("CreateContentsOperation", kec, kwg, 3);
        this.f = kei;
        this.g = createContentsRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        this.c.b(this.g.a);
        this.b.a(new OnContentsResponse(this.f.a(b(), this.g.a, this.b.asBinder()), false));
    }
}
