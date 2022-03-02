package defpackage;

import android.support.v4.graphics.drawable.IconCompat;
import androidx.slice.SliceItem;
import androidx.slice.SliceSpec;

/* renamed from: aos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aos extends aov implements aor {
    private CharSequence a;
    private CharSequence b;
    private aop c;
    private IconCompat d;

    public aos(anr anr, SliceSpec sliceSpec) {
        super(anr, sliceSpec);
    }

    public final void a() {
        this.f.a(-1, "color", new String[0]);
    }

    public final void a(aon aon) {
        IconCompat iconCompat;
        aop aop;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (this.a == null && (charSequence2 = aon.d) != null) {
            this.a = charSequence2;
        }
        if (this.b == null && (charSequence = aon.e) != null) {
            this.b = charSequence;
        }
        if (this.c == null && (aop = aon.c) != null) {
            this.c = aop;
        }
        if (this.d == null && (iconCompat = aon.b) != null) {
            this.d = iconCompat;
        }
    }

    public final void b() {
        this.f.b(-1, "millis", "ttl");
    }

    public final void a(anr anr) {
        anr anr2 = new anr(this.f);
        aop aop = this.c;
        if (aop != null) {
            if (this.a == null && aop.b() != null) {
                this.a = this.c.b();
            }
            if (this.d == null && this.c.a() != null) {
                this.d = this.c.a();
            }
            this.c.a(anr2);
        }
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            anr2.a(new SliceItem(charSequence, "text", (String) null, new String[]{"title"}));
        }
        CharSequence charSequence2 = this.b;
        if (charSequence2 != null) {
            anr2.a(new SliceItem(charSequence2, "text", (String) null, new String[0]));
        }
        IconCompat iconCompat = this.d;
        if (iconCompat != null) {
            anr.a(iconCompat, (String) null, "title");
        }
        anr.a(anr2.a());
    }
}
