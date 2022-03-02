package defpackage;

import android.content.Context;

/* renamed from: uzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uzb {
    public final vgq a;
    public final uzo b;
    public final vgq c;
    public final uzo d;
    private final uza e;
    private final uza f;

    public uzb(Context context) {
        this.e = new uza(context, avch.AUDIO_AUDIBLE_DTMF);
        this.a = new uzm(context, this.e, avch.AUDIO_AUDIBLE_DTMF);
        this.b = new uzo(context, this.e, avch.AUDIO_AUDIBLE_DTMF);
        this.f = new uza(context, avch.AUDIO_ULTRASOUND_PASSBAND);
        this.c = new uzm(context, this.f, avch.AUDIO_ULTRASOUND_PASSBAND);
        this.d = new uzo(context, this.f, avch.AUDIO_ULTRASOUND_PASSBAND);
    }
}
