package defpackage;

import android.content.Context;
import com.google.android.gms.audiomodem.Encoding;

/* renamed from: eeo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eeo {
    public final edw a = new edw();
    public ecg b;
    public boolean c;
    private final Context d;

    public eeo(Context context) {
        edh edh = new edh(context);
        this.d = context;
        this.b = edh;
    }

    public final eel a(Encoding encoding) {
        if (this.a.containsKey(encoding)) {
            return (eel) this.a.get(encoding);
        }
        int i = this.a.a;
        jjg jjg = edx.a;
        this.b.b();
        this.b.a();
        eel eel = new eel(this.d, encoding, i, this.b.a(), this.b.b(), aymc.a.a().v());
        this.a.put(encoding, eel);
        return eel;
    }

    public final void b() {
        if (this.a.isEmpty() && !this.b.c()) {
            jjg jjg = edx.a;
            if (this.b.e()) {
                this.c = false;
            }
        }
    }

    public final void a() {
        this.b.d();
    }
}
