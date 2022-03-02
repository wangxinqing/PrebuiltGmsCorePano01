package defpackage;

/* renamed from: iqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iqt {
    public boolean a = true;
    public boolean b = false;
    public int c = -1;
    private int d = -1;
    private int e = -1;
    private boolean f = false;

    public final String a(String str) {
        if (str == null || !iqk.b(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = this.d;
        int i2 = this.e;
        if (i == i2 && i != -1) {
            sb.append("s");
            sb.append(this.d);
        } else if (!(i == i2 || i == -1 || i2 == -1)) {
            sb.append("w");
            sb.append(this.d);
            sb.append("-h");
            sb.append(this.e);
        }
        sb.append("-d-no");
        if (!this.a) {
            sb.append("-ns");
        }
        if (this.b) {
            sb.append("-k");
        }
        if (this.f) {
            sb.append("-pf");
        }
        if (this.c != -1) {
            sb.append("-rw-v");
            sb.append(this.c);
        }
        return iqk.a(iqk.a(sb.toString(), str));
    }

    public final void a() {
        this.f = true;
    }

    public final void a(int i) {
        this.e = i;
        this.d = i;
    }
}
