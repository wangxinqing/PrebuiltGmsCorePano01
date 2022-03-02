package defpackage;

/* renamed from: amii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum amii {
    SHIFT_AFTER_DELETE(0),
    SHIFT_BEFORE_DELETE(1),
    SHIFT_TO_INVALID(2),
    UNRECOGNIZED(-1);
    
    public final int e;

    private amii(int i) {
        this.e = i;
    }

    public static final amii a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? UNRECOGNIZED : SHIFT_TO_INVALID : SHIFT_BEFORE_DELETE : SHIFT_AFTER_DELETE;
    }
}
