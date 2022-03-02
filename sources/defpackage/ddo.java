package defpackage;

import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;

/* renamed from: ddo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ddo extends bsv {
    final /* synthetic */ ddp b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ddo(ddp ddp, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.b = ddp;
    }

    public final int a() {
        return this.b.f.size();
    }

    public final /* bridge */ /* synthetic */ Fragment b(int i) {
        return dbi.a(dfw.a(((dhp) this.b.f.get(i)).c()));
    }

    public final CharSequence a(int i) {
        return ((dhp) this.b.f.get(i)).a();
    }
}
