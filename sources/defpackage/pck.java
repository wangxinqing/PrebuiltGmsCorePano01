package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: pck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pck implements awdt {
    private final bapu a;

    public pck(bapu bapu) {
        this.a = bapu;
    }

    /* renamed from: b */
    public final File a() {
        File file = new File(((Context) this.a.a()).getFilesDir(), "mdh");
        awdx.a((Object) file, "Cannot return null from a non-@Nullable @Provides method");
        return file;
    }
}
