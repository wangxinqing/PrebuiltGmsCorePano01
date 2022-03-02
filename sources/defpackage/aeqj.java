package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: aeqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeqj implements awdt {
    private final bapu a;
    private final bapu b;

    public aeqj(bapu bapu, bapu bapu2) {
        this.a = bapu;
        this.b = bapu2;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        aeqn aeqn = new aeqn(awds.b(this.a), new File(new File(((Context) this.b.a()).getFilesDir(), "mdh"), "ChannelConfigListStore"), "default");
        awdx.a((Object) aeqn, "Cannot return null from a non-@Nullable @Provides method");
        return aeqn;
    }
}
