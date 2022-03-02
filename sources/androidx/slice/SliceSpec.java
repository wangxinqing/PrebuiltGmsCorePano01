package androidx.slice;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SliceSpec implements atq {
    public String a;
    public int b;

    public SliceSpec() {
        this.b = 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SliceSpec) {
            SliceSpec sliceSpec = (SliceSpec) obj;
            return this.a.equals(sliceSpec.a) && this.b == sliceSpec.b;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b;
    }

    public final String toString() {
        return String.format("SliceSpec{%s,%d}", new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public SliceSpec(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
