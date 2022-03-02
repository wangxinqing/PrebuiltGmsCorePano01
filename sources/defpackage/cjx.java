package defpackage;

/* renamed from: cjx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cjx extends cbm {
    private final bsz a;

    public cjx(bsz bsz) {
        super("DailyCheckinOperation", "daily footprints read operation", new Object[0]);
        this.a = bsz;
    }

    public final void a(int i) {
        super.a(i);
        cbi.F().a(3);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        atqg atqg = (atqg) obj;
        bsz bsz = this.a;
        atpp[] atppArr = (atpp[]) atqg.c.toArray(new atpp[0]);
        aucx aucx = atqg.b;
        atqk atqk = atqg.a;
        if (atqk == null) {
            atqk = atqk.c;
        }
        atpr atpr = atqk.b;
        if (atpr == null) {
            atpr = atpr.b;
        }
        cju.a(bsz, atppArr, aucx, atpr, 6);
        cbi.F().a(4);
    }
}
