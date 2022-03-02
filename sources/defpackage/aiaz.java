package defpackage;

import java.util.Collection;

/* renamed from: aiaz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiaz extends aiaj {
    private final int l;
    private final int m;
    private final long n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiaz(long j, int i, int i2, long j2, int i3, int i4, int i5, Collection collection) {
        super(j, 5, 0, i, i2, collection != null ? collection : aiaj.a, Integer.MAX_VALUE, Integer.MAX_VALUE, i5);
        this.n = j2;
        this.l = i3;
        this.m = i4;
    }

    public final String a() {
        if (this.k == null) {
            int i = this.c;
            int i2 = this.d;
            long j = this.n;
            StringBuilder sb = new StringBuilder(46);
            sb.append("7:");
            sb.append(i);
            sb.append(":");
            sb.append(i2);
            sb.append(":");
            sb.append(j);
            this.k = sb.toString();
        }
        return this.k;
    }

    public final boolean b() {
        return true;
    }

    public final String c() {
        long j = this.n;
        int i = this.l;
        int i2 = this.m;
        StringBuilder sb = new StringBuilder(59);
        sb.append(" nci: ");
        sb.append(j);
        sb.append(" pci: ");
        sb.append(i);
        sb.append(" tac ");
        sb.append(i2);
        return sb.toString();
    }

    public final long d() {
        try {
            return artw.a(this.c, this.d, this.n);
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }

    public final void a(aqek aqek) {
        aqek.b(13, this.n);
        aqek.g(11, this.l);
        aqek.g(12, this.m);
    }

    public final boolean a(aiaj aiaj) {
        if (aiaj instanceof aiaz) {
            aiaz aiaz = (aiaz) aiaj;
            return this.l == aiaz.l && this.m == aiaz.m && this.n == aiaz.n;
        }
    }
}
