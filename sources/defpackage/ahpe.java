package defpackage;

/* renamed from: ahpe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahpe {
    private final ahpd a;

    public ahpe(ajaa ajaa) {
        this.a = new ahpd(ajaa.a(ahna.PHONE_SLEEP_DNN));
    }

    public final int a(ahpf ahpf) {
        ahpd ahpd = this.a;
        ahpf ahpf2 = new ahpf();
        for (String str : ahpf.M) {
            ahpf2.a(str, ahpf.a(str));
        }
        ahpf2.b = ahpc.LIGHT.a(ahpf.b);
        ahpf2.K = ahpc.HOUR.a(ahpf.K);
        for (int i = 0; i < ahpf.a.length; i++) {
            String valueOf = String.valueOf(ahpf.a[i]);
            String str2 = valueOf.length() == 0 ? new String("meanLightLevel") : "meanLightLevel".concat(valueOf);
            ahpf2.a(str2, ahpc.LIGHT_DIFF.a(ahpf.a(str2)));
            String valueOf2 = String.valueOf(ahpf.a[i]);
            String str3 = valueOf2.length() == 0 ? new String("accelGravityDir") : "accelGravityDir".concat(valueOf2);
            ahpf2.a(str3, ahpc.ACCEL.a(ahpf.a(str3)));
            String valueOf3 = String.valueOf(ahpf.a[i]);
            String str4 = valueOf3.length() == 0 ? new String("soundMeanLogBark") : "soundMeanLogBark".concat(valueOf3);
            ahpf2.a(str4, ahpc.LOG_BARK_DIFF.a(ahpf.a(str4)));
        }
        return Math.round(ahpd.a.a(new float[]{ahpf2.b, ahpf2.c, ahpf2.d, ahpf2.f, ahpf2.g, ahpf2.h, ahpf2.H, ahpf2.I, ahpf2.J, ahpf2.K})[0] * 100.0f);
    }
}
