package defpackage;

/* renamed from: yat  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yat extends yay {
    private final xkf a;
    private final int b;

    public yat(int i, xkf xkf) {
        this.b = i;
        if (xkf != null) {
            this.a = xkf;
            return;
        }
        throw new NullPointerException("Null mismatchFieldType");
    }

    public final xkf a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yay) {
            yay yay = (yay) obj;
            return this.b == yay.b() && this.a.equals(yay.a());
        }
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toString(this.b - 1));
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(valueOf2).length());
        sb.append("MismatchDataField{dataFieldType=");
        sb.append(valueOf);
        sb.append(", mismatchFieldType=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
