package defpackage;

/* renamed from: akjs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akjs extends akjt {
    final /* synthetic */ akju a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akjs(akju akju) {
        super((akhy) null);
        this.a = akju;
    }

    public final akjt a(akhy akhy) {
        if (akhy.b.isEmpty()) {
            return new akjr(this.a, akhy);
        }
        return new akjq(this.a, akhy);
    }
}
