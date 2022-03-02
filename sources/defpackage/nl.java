package defpackage;

import java.util.Locale;

/* renamed from: nl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nl {
    private boolean a;
    private int b;
    private np c;

    public nl() {
        a(nn.b(Locale.getDefault()));
    }

    private final void a(boolean z) {
        this.a = z;
        this.c = nn.a;
        this.b = 2;
    }

    public nl(Locale locale) {
        a(nn.b(locale));
    }

    public final nn a() {
        if (this.b == 2 && this.c == nn.a) {
            return !this.a ? nn.b : nn.c;
        }
        return new nn(this.a, this.b, this.c);
    }
}
