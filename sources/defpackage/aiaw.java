package defpackage;

import java.util.Collection;

/* renamed from: aiaw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiaw extends aiaj {
    public final int l;
    private final int m;
    private final int n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiaw(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, Collection collection) {
        super(j, 4, i3, i, i2, collection != null ? collection : aiaj.a, Integer.MAX_VALUE, Integer.MAX_VALUE, i7);
        this.l = i4;
        this.m = i5;
        this.n = i6;
    }

    public final String a() {
        if (this.k == null) {
            int i = this.c;
            int i2 = this.d;
            int i3 = this.b;
            StringBuilder sb = new StringBuilder(37);
            sb.append("6:");
            sb.append(i);
            sb.append(":");
            sb.append(i2);
            sb.append(":");
            sb.append(i3);
            this.k = sb.toString();
        }
        return this.k;
    }

    public final boolean b() {
        return true;
    }

    public final String c() {
        int i = this.l;
        int i2 = this.m;
        int i3 = this.n;
        StringBuilder sb = new StringBuilder(59);
        sb.append(" pci: ");
        sb.append(i);
        sb.append(" tac ");
        sb.append(i2);
        sb.append(" timingAdvance ");
        sb.append(i3);
        return sb.toString();
    }

    public final long d() {
        try {
            return artu.a(this.c, this.d, this.b);
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aiaw) {
            aiaw aiaw = (aiaw) obj;
            return super.equals(aiaw) && this.l == aiaw.l && this.m == aiaw.m;
        }
    }

    public final int hashCode() {
        return (super.hashCode() ^ (this.l * 7013)) ^ (this.m * 2939);
    }

    public final void a(aqek aqek) {
        int i = this.n;
        if (!(i == -1 || i == Integer.MAX_VALUE)) {
            aqek.g(7, i);
        }
        aqek.g(11, this.l);
        aqek.g(12, this.m);
    }

    public final boolean a(aiaj aiaj) {
        if (aiaj instanceof aiaw) {
            aiaw aiaw = (aiaw) aiaj;
            return this.l == aiaw.l && this.m == aiaw.m;
        }
    }
}
