package defpackage;

/* renamed from: akoc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akoc {
    private final akoa a;
    private final akny b = new akny(new aknv());

    public akoc(ou ouVar) {
        this.a = new akoa(ouVar);
    }

    public final aklp a(akln akln) {
        akny akny = this.b;
        ou a2 = akny.a.a(akln);
        aknw aknw = akny.b;
        aknw.a.removeFirst();
        aknw.a.offerLast(a2);
        ou ouVar = (ou) this.b.b.a.getLast();
        boolean z = !ouVar.containsKey(aklv.p);
        akoa akoa = this.a;
        float f = 0.0f;
        if (!akoa.a.isEmpty()) {
            for (int i = 0; i < ouVar.h; i++) {
                if (akoa.a.containsKey(ouVar.b(i))) {
                    f += ((Float) ouVar.c(i)).floatValue() * ((Float) akoa.a.get(ouVar.b(i))).floatValue();
                }
            }
            f = (float) (1.0d / (Math.exp((double) (-f)) + 1.0d));
        }
        aklz.a();
        String valueOf = String.valueOf(ouVar);
        String valueOf2 = String.valueOf(akln);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72 + String.valueOf(valueOf2).length());
        sb.append("OnTheGoProbability: ");
        sb.append(f);
        sb.append(" with OnTheGoFeatures ");
        sb.append(valueOf);
        sb.append("using signals: ");
        sb.append(valueOf2);
        sb.toString();
        return new aklp(f, z);
    }
}
