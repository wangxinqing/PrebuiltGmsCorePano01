package defpackage;

import android.app.PendingIntent;
import android.support.v4.graphics.drawable.IconCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.slice.SliceItem;

/* renamed from: apd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apd implements apc {
    public PendingIntent a;
    public IconCompat b;
    public CharSequence c;
    public boolean d;
    private int e;
    private CharSequence f;
    private boolean g;
    private int h;
    private SliceItem i;
    private SliceItem j;
    private boolean k;

    public apd(PendingIntent pendingIntent, IconCompat iconCompat, int i2, CharSequence charSequence) {
        this.h = -1;
        this.a = pendingIntent;
        this.b = iconCompat;
        this.c = charSequence;
        this.e = i2;
    }

    public static int a(SliceItem sliceItem) {
        if (sliceItem.a("no_tint")) {
            return sliceItem.a("raw") ? sliceItem.a("large") ? 4 : 3 : !sliceItem.a("large") ? 1 : 2;
        }
        return 0;
    }

    public final String b() {
        if (this.d) {
            return "toggle";
        }
        return null;
    }

    public final boolean c() {
        return this.d;
    }

    public apd(SliceItem sliceItem) {
        this.e = 5;
        int i2 = -1;
        this.h = -1;
        this.i = sliceItem;
        SliceItem a2 = apl.a(sliceItem, "action");
        if (a2 != null) {
            this.j = a2;
            this.a = a2.d();
            SliceItem a3 = apl.a(a2.f(), "image", (String[]) null, (String[]) null);
            if (a3 != null) {
                this.b = a3.c();
                this.e = a(a3);
            }
            SliceItem b2 = apl.b(a2.f(), "text", "title");
            if (b2 != null) {
                if (b2.e == null) {
                    CharSequence b3 = b2.b();
                    if (b3 instanceof Spannable) {
                        SliceItem.a((Spannable) b3);
                    } else if (b3 instanceof Spanned) {
                        Spanned spanned = (Spanned) b3;
                        int i3 = 0;
                        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                        int length = spans.length;
                        while (true) {
                            if (i3 >= length) {
                                break;
                            } else if (!SliceItem.a(spans[i3])) {
                                SpannableString spannableString = new SpannableString(b3);
                                SliceItem.a((Spannable) spannableString);
                                b3 = spannableString;
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    b2.e = b3;
                }
                this.c = b2.e;
            }
            SliceItem a4 = apl.a(a2.f(), "text", "content_description");
            if (a4 != null) {
                this.f = a4.b();
            }
            boolean equals = "toggle".equals(a2.c);
            this.d = equals;
            if (equals) {
                this.g = a2.a("selected");
            }
            this.k = this.i.a("activity");
            SliceItem a5 = apl.a(a2.f(), "int", "priority");
            this.h = a5 != null ? a5.e() : i2;
        }
    }

    public final PendingIntent a() {
        PendingIntent pendingIntent = this.a;
        return pendingIntent == null ? this.j.d() : pendingIntent;
    }

    public final anr a(anr anr) {
        anr anr2 = new anr(anr);
        IconCompat iconCompat = this.b;
        if (iconCompat != null) {
            anr2.a(iconCompat, (String) null, this.e != 0 ? new String[]{"no_tint"} : new String[0]);
        }
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            anr2.a(charSequence, (String) null, "title");
        }
        CharSequence charSequence2 = this.f;
        if (charSequence2 != null) {
            anr2.a(charSequence2, "content_description", new String[0]);
        }
        if (this.d && this.g) {
            anr2.a("selected");
        }
        int i2 = this.h;
        if (i2 != -1) {
            anr2.a(i2, "priority", new String[0]);
        }
        if (this.k) {
            anr.a("activity");
        }
        return anr2;
    }
}
