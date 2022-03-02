package defpackage;

import java.util.Locale;

/* renamed from: wiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wiq {
    private final aio a;

    public wiq(aio aio) {
        this.a = aio;
    }

    private final int d() {
        return this.a.a("Orientation", 0);
    }

    public final int a() {
        switch (d()) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final boolean b() {
        int d = d();
        return d == 4 || d == 5 || d == 7;
    }

    public final boolean c() {
        return d() == 2;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, description=%s}", new Object[]{Integer.valueOf(this.a.a("ImageWidth", 0)), Integer.valueOf(this.a.a("ImageLength", 0)), Integer.valueOf(a()), Boolean.valueOf(b()), Boolean.valueOf(c()), this.a.a("ImageDescription")});
    }
}
