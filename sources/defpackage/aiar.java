package defpackage;

import java.util.Collection;

/* renamed from: aiar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiar extends aiaj {
    public final int l;
    private final int m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiar(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, Collection collection, int i8, int i9) {
        super(j, i, i2, i3, i4, collection, i8, i9, i7);
        int i10 = i6;
        this.m = i5;
        int i11 = -1;
        if (!(i10 == Integer.MAX_VALUE || i10 == 0)) {
            i11 = i10;
        }
        this.l = i11;
    }

    public final String a() {
        if (this.k == null) {
            int f = f();
            if (this.i == 3) {
                int i = this.c;
                int i2 = this.d;
                int i3 = this.b;
                StringBuilder sb = new StringBuilder(50);
                sb.append(f);
                sb.append(":");
                sb.append(i);
                sb.append(":");
                sb.append(i2);
                sb.append(":-1:");
                sb.append(i3);
                this.k = sb.toString();
            } else {
                int i4 = this.c;
                int i5 = this.d;
                int i6 = this.m;
                int i7 = this.b;
                StringBuilder sb2 = new StringBuilder(59);
                sb2.append(f);
                sb2.append(":");
                sb2.append(i4);
                sb2.append(":");
                sb2.append(i5);
                sb2.append(":");
                sb2.append(i6);
                sb2.append(":");
                sb2.append(i7);
                this.k = sb2.toString();
            }
        }
        return this.k;
    }

    public final boolean b() {
        return this.m != -1;
    }

    public final String c() {
        int i = this.m;
        int i2 = this.l;
        StringBuilder sb = new StringBuilder(34);
        sb.append(" lac: ");
        sb.append(i);
        sb.append(" psc: ");
        sb.append(i2);
        return sb.toString();
    }

    public final long d() {
        try {
            if (this.i != 3) {
                return artt.a(this.c, this.d, this.m, this.b);
            }
            return artx.a(this.c, this.d, this.b);
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aiar) {
            aiar aiar = (aiar) obj;
            return this.m == aiar.m && this.l == aiar.l && super.equals(obj);
        }
    }

    public final int hashCode() {
        return (super.hashCode() ^ (this.m * 3701)) ^ (this.l * 2687);
    }

    public final void a(aqek aqek) {
        aqek.g(1, this.m);
        int i = this.l;
        if (i != -1) {
            aqek.g(8, i);
        }
    }

    public final boolean a(aiaj aiaj) {
        if (aiaj instanceof aiar) {
            aiar aiar = (aiar) aiaj;
            int i = aiar.l;
            boolean z = i != -1;
            int i2 = this.l;
            return z == (i2 != -1) && this.m == aiar.m && i2 == i;
        }
    }
}
