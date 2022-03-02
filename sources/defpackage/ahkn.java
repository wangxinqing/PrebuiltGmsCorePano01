package defpackage;

/* renamed from: ahkn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahkn {
    public final long a;
    public float b;
    public float c;
    public float d;

    public ahkn(long j, float f, float f2, float f3) {
        this.a = j;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public final float a(ahkn ahkn) {
        return (this.b * ahkn.b) + (this.c * ahkn.c) + (this.d * ahkn.d);
    }

    public final String toString() {
        long j = this.a;
        StringBuilder sb = new StringBuilder(40);
        sb.append("timeMillisSinceBoot=");
        sb.append(j);
        String valueOf = String.valueOf(sb.toString());
        float f = this.b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb2.append(valueOf);
        sb2.append(" | x=");
        sb2.append(f);
        String valueOf2 = String.valueOf(sb2.toString());
        float f2 = this.c;
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb3.append(valueOf2);
        sb3.append(", y=");
        sb3.append(f2);
        String valueOf3 = String.valueOf(sb3.toString());
        float f3 = this.d;
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 19);
        sb4.append(valueOf3);
        sb4.append(", z=");
        sb4.append(f3);
        return sb4.toString();
    }

    public final ahkn a(float f) {
        return new ahkn(this.a, this.b * f, this.c * f, this.d * f);
    }
}
