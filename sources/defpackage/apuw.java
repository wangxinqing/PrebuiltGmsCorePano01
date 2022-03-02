package defpackage;

/* renamed from: apuw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apuw implements apth {
    public String a;

    public final auef a() {
        return (auef) almo.b.c(7);
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        if (audx instanceof almo) {
            this.a = ((almo) audx).a;
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of SendVerificationCodeResponse.");
    }
}
