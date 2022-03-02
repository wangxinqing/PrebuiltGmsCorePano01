package defpackage;

/* renamed from: aivo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aivo {
    private final aivq a;

    public aivo(aivq aivq) {
        this.a = aivq;
    }

    public final void a(aiaj[] aiajArr) {
        aivq aivq = this.a;
        if (aiajArr == null || (r1 = aiajArr.length) == 0) {
            aito.a(aivq.a.b, (aiaj) null);
            aivq.a.l.a((aiaj) null);
            return;
        }
        for (aiaj aiaj : aiajArr) {
            aito.a(aivq.a.b, aiaj);
            aivq.a.l.a(aiaj);
        }
    }
}
