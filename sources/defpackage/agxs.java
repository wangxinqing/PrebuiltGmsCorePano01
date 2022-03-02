package defpackage;

import java.io.Serializable;

/* renamed from: agxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agxs implements Serializable {
    private static final long serialVersionUID = 1;
    public int a = 0;
    public long b = 0;
    public boolean c;
    public String d = "";
    public boolean e;
    public boolean f = false;
    public boolean g;
    public int h = 1;
    public final String i = "";
    private final String j = "";

    public final boolean equals(Object obj) {
        agxs agxs;
        if (!(obj instanceof agxs) || (agxs = (agxs) obj) == null) {
            return false;
        }
        if (this != agxs) {
            return this.a == agxs.a && this.b == agxs.b && this.d.equals(agxs.d) && this.f == agxs.f && this.h == agxs.h && this.i.equals(agxs.i) && this.j.equals(agxs.j);
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int hashCode = (((((this.a + 2173) * 53) + Long.valueOf(this.b).hashCode()) * 53) + this.d.hashCode()) * 53;
        if (!this.f) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        return ((((((((((hashCode + i2) * 53) + this.h) * 53) + this.i.hashCode()) * 53) + 5) * 53) + this.j.hashCode()) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country Code: ");
        sb.append(this.a);
        sb.append(" National Number: ");
        sb.append(this.b);
        if (this.e && this.f) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.g) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.h);
        }
        if (this.c) {
            sb.append(" Extension: ");
            sb.append(this.d);
        }
        return sb.toString();
    }
}
