package defpackage;

/* renamed from: algv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class algv {
    public static void a(String str, String str2, int i, int i2) {
        boolean z;
        algm.a((Object) str, String.format("%s cannot be null.", new Object[]{str2}));
        int length = str.length();
        if (length > i2) {
            z = false;
        } else {
            z = length >= i;
        }
        algm.a(z, String.format("Length of %s should be in the range [%s-%s]", new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}));
    }
}
