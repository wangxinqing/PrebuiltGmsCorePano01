package defpackage;

/* renamed from: audo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class audo {
    private static final audv b = new audm();
    public final audv a;

    public audo() {
        audv audv;
        audv[] audvArr = new audv[2];
        audvArr[0] = aucc.a;
        try {
            audv = (audv) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception e) {
            audv = b;
        }
        audvArr[1] = audv;
        audn audn = new audn(audvArr);
        aucy.a((Object) audn, "messageInfoFactory");
        this.a = audn;
    }

    public static boolean a(audu audu) {
        return audu.c() == 1;
    }
}
