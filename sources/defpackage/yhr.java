package defpackage;

/* renamed from: yhr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yhr {
    public final apgu[] a;
    public yhx[] b;

    public yhr(apgu[] apguArr) {
        this.a = apguArr;
    }

    public final void a() {
        apgu[] apguArr = this.a;
        if (apguArr != null) {
            int length = apguArr.length;
            int i = 0;
            while (i < length) {
                if (apguArr[i] != null) {
                    i++;
                } else {
                    throw new yfy(29500, "Null RegistrationInfo");
                }
            }
            return;
        }
        throw new yfy(29500, "Null RegistrationInfo");
    }
}
