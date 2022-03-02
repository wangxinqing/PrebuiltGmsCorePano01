package defpackage;

/* renamed from: aiep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aiep {
    final int a;
    final int b;
    final int c;

    public aiep(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.a = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aiep) {
            aiep aiep = (aiep) obj;
            return this.b == aiep.b && this.c == aiep.c && this.a == aiep.a;
        }
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
