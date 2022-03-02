package defpackage;

import java.util.Collection;

/* renamed from: aiag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiag extends aiaj {
    private final int l;

    public aiag(long j, int i, int i2, int i3, int i4, int i5, int i6, Collection collection, int i7, int i8) {
        super(j, i, i2, i3, i4, collection, i7, i8, i6);
        this.l = i5;
    }

    public final String a() {
        if (this.k == null) {
            int f = f();
            int i = this.c;
            int i2 = this.d;
            int i3 = this.l;
            int i4 = this.b;
            StringBuilder sb = new StringBuilder(59);
            sb.append(f);
            sb.append(":");
            sb.append(i);
            sb.append(":");
            sb.append(i2);
            sb.append(":");
            sb.append(i3);
            sb.append(":");
            sb.append(i4);
            this.k = sb.toString();
        }
        return this.k;
    }

    public final boolean b() {
        return this.l != -1;
    }

    public final String c() {
        int i = this.l;
        StringBuilder sb = new StringBuilder(17);
        sb.append(" lac: ");
        sb.append(i);
        return sb.toString();
    }

    public final long d() {
        try {
            return arts.a(this.d, this.l, this.b);
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aiag) {
            aiag aiag = (aiag) obj;
            return super.equals(aiag) && this.l == aiag.l;
        }
    }

    public final int hashCode() {
        return super.hashCode() ^ (this.l * 3449);
    }

    public final void a(aqek aqek) {
        aqek.g(1, this.l);
    }

    public final boolean a(aiaj aiaj) {
        return (aiaj instanceof aiag) && this.l == ((aiag) aiaj).l;
    }
}
