package defpackage;

/* renamed from: akjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akjr extends akjt {
    final /* synthetic */ akju a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akjr(akju akju, akhy akhy) {
        super(akhy);
        this.a = akju;
        if (!akhy.b.isEmpty()) {
            throw new IllegalArgumentException("PlaceInferences has to be empty");
        }
    }

    public final akjt a(akhy akhy) {
        if (!akhy.b.isEmpty()) {
            return new akjq(this.a, akhy);
        }
        this.c = false;
        this.b = akhy;
        return this;
    }
}
