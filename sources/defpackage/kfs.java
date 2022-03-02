package defpackage;

import android.content.Context;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.internal.CloseContentsRequest;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kfs extends key {
    private final kei f;
    private final CloseContentsRequest g;

    public kfs(kec kec, kei kei, CloseContentsRequest closeContentsRequest, kwg kwg) {
        super("DiscardContentsOperation", kec, kwg, 8);
        this.f = kei;
        this.g = closeContentsRequest;
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        int i;
        boolean z;
        njc.a((Object) this.g, "Invalid close request: no request");
        CloseContentsRequest closeContentsRequest = this.g;
        Contents contents = closeContentsRequest.a;
        if (contents != null) {
            int i2 = contents.b;
            jjt.a(contents.a);
            i = i2;
        } else {
            i = closeContentsRequest.c;
        }
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        njc.a(z, "Invalid close request: no contents");
        njc.a((Object) this.g.b, "Invalid close request: doesn't include save state");
        iva.b(true ^ this.g.b.booleanValue(), "DiscardContentsOperation wants to save contents.");
        this.f.a(b(), i, MetadataBundle.a(), this.g.b.booleanValue(), kdo.a);
        this.b.b();
    }
}
