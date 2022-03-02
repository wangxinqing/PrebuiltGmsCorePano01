package androidx.slice;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class SliceSpecParcelizer {
    public static SliceSpec read(atl atl) {
        SliceSpec sliceSpec = new SliceSpec();
        sliceSpec.a = atl.b(sliceSpec.a, 1);
        sliceSpec.b = atl.b(sliceSpec.b, 2);
        return sliceSpec;
    }

    public static void write(SliceSpec sliceSpec, atl atl) {
        atl.a(true, false);
        atl.a(sliceSpec.a, 1);
        int i = sliceSpec.b;
        if (i != 1) {
            atl.a(i, 2);
        }
    }
}
