package defpackage;

/* renamed from: aeig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeig extends Exception {
    public final int a;

    public aeig(int i, String str, Object... objArr) {
        super(String.format(str, objArr));
        this.a = i;
    }
}
