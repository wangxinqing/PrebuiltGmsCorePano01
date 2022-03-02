package defpackage;

/* renamed from: akki  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akki {
    final /* synthetic */ akkj a;

    public akki(akkj akkj) {
        this.a = akkj;
    }

    public final void a(astv[] astvArr, astz[] astzArr) {
        this.a.a.a(astzArr);
        aklc aklc = this.a.b;
        aklc.a.clear();
        aklc.b.clear();
        for (astz a2 : astzArr) {
            aklc.a(a2);
        }
        for (astv astv : astvArr) {
            if ((astv.a & 4) != 0) {
                aklc.b.put(Long.valueOf(astv.b), astv);
            } else {
                akof a3 = aklz.a();
                String valueOf = String.valueOf(astv);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                sb.append("Invalid PersonalizedPlaceInfo: ");
                sb.append(valueOf);
                a3.b(sb.toString());
            }
        }
    }
}
