package defpackage;

/* renamed from: aiak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiak {
    public static aiaj a(long j, long j2) {
        artv artv;
        int a = artv.a(j2, 0, 15, 1, 5);
        if (a == 1) {
            artv = new artt(artt.a(j2), artt.b(j2), artt.c(j2), artt.d(j2));
            if (artv.a != j2) {
                throw new IllegalArgumentException("The primitive long key is invalid for GSM key types.");
            }
        } else if (a == 2) {
            artv = new artx(artx.a(j2), artx.b(j2), artx.c(j2));
            if (artv.a != j2) {
                throw new IllegalArgumentException("The primitive long key is invalid for UMTS key types.");
            }
        } else if (a == 3) {
            artv = new arts(arts.a(j2), arts.b(j2), arts.c(j2));
            if (artv.a != j2) {
                throw new IllegalArgumentException("The primitive long key is invalid for CDMA key types");
            }
        } else if (a == 4) {
            artv = new artu(artu.a(j2), artu.b(j2), artu.c(j2));
            if (artv.a != j2) {
                throw new IllegalArgumentException("The primitive long key is invalid for LTE key types.");
            }
        } else if (a == 5) {
            artv = new artw(artw.a(j2), artw.b(j2), artw.c(j2));
            if (artv.a != j2) {
                throw new IllegalArgumentException("The primitive long key is invalid for NR(5G) key types.");
            }
        } else {
            throw new IllegalArgumentException("Primitive long key is invalid for all mobile communication key types.");
        }
        if (artv instanceof artt) {
            artt artt = (artt) artv;
            return new aiar(j, 1, artt.d(), artt.a(), artt.b(), artt.c(), 0, -9999, aiaj.a, Integer.MAX_VALUE, Integer.MAX_VALUE);
        } else if (artv instanceof artx) {
            artx artx = (artx) artv;
            return new aiar(j, 3, artx.c(), artx.a(), artx.b(), -1, 0, -9999, aiaj.a, Integer.MAX_VALUE, Integer.MAX_VALUE);
        } else if (artv instanceof arts) {
            arts arts = (arts) artv;
            return new aiag(j, 2, arts.c(), 0, arts.a(), arts.b(), -9999, aiaj.a, Integer.MAX_VALUE, Integer.MAX_VALUE);
        } else if (artv instanceof artu) {
            artu artu = (artu) artv;
            return new aiaw(j, artu.a(), artu.b(), artu.c(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -9999, aiaj.a);
        } else if (artv instanceof artw) {
            artw artw = (artw) artv;
            return new aiaz(j, artw.a(), artw.b(), artw.c(), Integer.MAX_VALUE, Integer.MAX_VALUE, -9999, aiaj.a);
        } else {
            String valueOf = String.valueOf(artv.getClass().getSimpleName());
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("New cell type is ") : "New cell type is ".concat(valueOf));
        }
    }
}
