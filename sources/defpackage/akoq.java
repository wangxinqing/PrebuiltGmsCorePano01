package defpackage;

/* renamed from: akoq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class akoq {
    private static final ou d;
    public akls a;
    protected akor b;
    protected final akuo c;
    private final akma e;

    static {
        ou ouVar = new ou();
        ouVar.put(aocj.AT_PLACE, 0);
        ouVar.put(aocj.IN_TRANSIT, 0);
        ou ouVar2 = new ou();
        ouVar2.put(aocj.AT_PLACE, 1);
        ouVar2.put(aocj.IN_TRANSIT, 0);
        ou ouVar3 = new ou();
        ouVar3.put(aocj.AT_PLACE, 0);
        ouVar3.put(aocj.IN_TRANSIT, 1);
        ou ouVar4 = new ou();
        ouVar4.put((Object) null, ouVar);
        ouVar4.put(aocj.AT_PLACE, ouVar2);
        ouVar4.put(aocj.IN_TRANSIT, ouVar3);
        d = ouVar4;
    }

    public akoq(akma akma, akuo akuo) {
        this.c = akuo;
        this.e = akma;
        a();
    }

    /* access modifiers changed from: protected */
    public final int a(aocj aocj) {
        ou ouVar = d;
        akor akor = this.b;
        return ((Integer) ((ou) ouVar.get(akor != null ? akor.b.a : null)).get(aocj)).intValue();
    }

    /* access modifiers changed from: protected */
    public abstract akor a(akln akln);

    /* access modifiers changed from: protected */
    public abstract void a(akma akma, akln akln, akor akor);

    public final akor b(akln akln) {
        akor a2 = a(akln);
        a(this.e, akln, a2);
        akls akls = this.a;
        if (akls.a.size() == 10) {
            akls.a.removeFirst();
        }
        akls.a.addLast(akls.b.toString());
        akls.b = new StringBuilder();
        return a2;
    }

    /* access modifiers changed from: protected */
    public final akor a(int i, aocj aocj, long j, aklr aklr, akli akli) {
        akop akop;
        long j2;
        akop akop2;
        akop akop3;
        akor akor = this.b;
        if (akor != null) {
            akop = akor.b;
        } else {
            akop = null;
        }
        if (akop != null) {
            j2 = akop.b;
        } else {
            j2 = 0;
        }
        if (i != 0) {
            if (aocj == aocj.AT_PLACE) {
                akop3 = akop.a(j2, aklr, akli);
            } else {
                akop3 = akop.a(j2);
            }
            this.b = new akor(1, akop3, (akop) null);
        } else {
            if (aocj == aocj.AT_PLACE) {
                akop2 = akop.a(j, aklr, akli);
            } else {
                akop2 = akop.a(j);
            }
            this.b = new akor(0, akop2, akop);
        }
        return this.b;
    }

    public void a() {
        this.a = new akls();
        this.b = null;
    }
}
