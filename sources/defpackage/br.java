package defpackage;

/* renamed from: br  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class br {
    private final bn a;
    private final bs b;

    public br(bs bsVar, bn bnVar) {
        this.a = bnVar;
        this.b = bsVar;
    }

    public final bl a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String str = "android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName;
            bl blVar = (bl) this.b.a.get(str);
            if (cls.isInstance(blVar)) {
                bn bnVar = this.a;
                if (bnVar instanceof bq) {
                    bq bqVar = (bq) bnVar;
                    return blVar;
                }
            } else {
                bn bnVar2 = this.a;
                if (bnVar2 instanceof bo) {
                    blVar = ((bo) bnVar2).a();
                } else {
                    blVar = bnVar2.a(cls);
                }
                bl blVar2 = (bl) this.b.a.put(str, blVar);
                if (blVar2 != null) {
                    blVar2.f();
                    return blVar;
                }
            }
            return blVar;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
