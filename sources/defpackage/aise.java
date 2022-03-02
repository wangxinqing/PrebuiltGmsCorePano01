package defpackage;

/* renamed from: aise  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aise {
    public int a;
    public final aibp[] b;
    public int c = 1;
    public final aisj d;
    public final aisg e;
    public final aish f;
    public final aisd g;
    private final aisf h;

    public aise(aibp[] aibpArr, aisf aisf, aisj aisj, aisg aisg, aish aish) {
        this.h = aisf;
        this.d = aisj;
        this.e = aisg;
        this.f = aish;
        this.b = aibpArr;
        this.g = new aisd(this);
    }

    public final void a() {
        int i = this.c;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                int i3 = aisk.f;
            } else if (i2 == 2) {
                int i4 = aisk.f;
            }
            this.c = 4;
            return;
        }
        throw null;
    }

    public final void b(int i) {
        aisf aisf = this.h;
        aisc aisc = new aisc(this);
        int i2 = aisk.f;
        StringBuilder sb = new StringBuilder(32);
        sb.append("setSingleAlarm for ");
        sb.append(i);
        sb.append("ms");
        sb.toString();
        aisf.a.a.k().a((Runnable) aisc, (long) i);
        this.c = 2;
    }

    public final void a(int i) {
        this.a = i;
        b(i);
    }
}
