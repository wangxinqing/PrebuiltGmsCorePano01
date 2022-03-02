package defpackage;

/* renamed from: alvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alvi extends alvf {
    public alvi() {
        super(38);
    }

    public final /* bridge */ /* synthetic */ Object a(alze alze) {
        alrl alrl;
        Object obj;
        String g = alze.g();
        alrl[] values = alrl.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                alrl = alrl.UNKNOWN;
                break;
            }
            alrl = values[i];
            if (alrl.c.equals(g)) {
                break;
            }
            i++;
        }
        amic amic = (amic) alze.a((alzf) alsd.a);
        amib amib = amib.KIND_NOT_SET;
        int ordinal = amic.b.ordinal();
        if (ordinal == 1) {
            obj = null;
        } else if (ordinal == 2) {
            obj = Double.valueOf(amic.a());
        } else if (ordinal == 3) {
            obj = amic.b();
        } else if (ordinal == 4) {
            obj = Boolean.valueOf(amic.c());
        } else {
            throw new IllegalArgumentException();
        }
        return new alrm(alrl, obj);
    }

    public final /* bridge */ /* synthetic */ void a(alzd alzd, Object obj) {
        alrm alrm = (alrm) obj;
        a(alzd);
        alzd.b(alrm.a.c);
        Object obj2 = alrm.b;
        if (obj2 instanceof Boolean) {
            alzd.a(((Boolean) obj2).booleanValue());
            alzd.b();
            return;
        }
        throw new IllegalArgumentException();
    }
}
