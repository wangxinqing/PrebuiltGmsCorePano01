package defpackage;

/* renamed from: ckh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ckh extends cbm {
    private final bsz a;

    public ckh(bsz bsz) {
        super("RefreshStateOperation", "refresh synchronizable interest", new Object[0]);
        this.a = bsz;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        atrc atrc = (atrc) obj;
        bsz bsz = this.a;
        atpp[] atppArr = (atpp[]) atrc.c.toArray(new atpp[0]);
        aucx aucx = atrc.b;
        atqk atqk = atrc.a;
        if (atqk == null) {
            atqk = atqk.c;
        }
        atpr atpr = atqk.b;
        if (atpr == null) {
            atpr = atpr.b;
        }
        cju.a(bsz, atppArr, aucx, atpr, 12);
        Object[] objArr = new Object[2];
        objArr[0] = this.a;
        atqk atqk2 = atrc.a;
        if (atqk2 == null) {
            atqk2 = atqk.c;
        }
        atpr atpr2 = atqk2.b;
        if (atpr2 == null) {
            atpr2 = atpr.b;
        }
        objArr[1] = atpr2;
    }
}
