package defpackage;

import android.content.res.AssetManager;
import java.io.File;

/* renamed from: blr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class blr extends blq {
    private final AssetManager a;
    private final String b;

    public blr(AssetManager assetManager, String str) {
        this.a = assetManager;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final String a(File file) {
        String valueOf = String.valueOf(this.b);
        return blz.a(this.a, valueOf.length() == 0 ? new String("chimera-modules/") : "chimera-modules/".concat(valueOf), file);
    }
}
