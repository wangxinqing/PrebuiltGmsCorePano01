package defpackage;

import android.graphics.Rect;
import java.util.Comparator;

/* renamed from: rr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rr implements Comparator {
    private final Rect a = new Rect();
    private final Rect b = new Rect();
    private final boolean c;

    public rr(boolean z) {
        this.c = z;
    }

    public final int compare(Object obj, Object obj2) {
        Rect rect = this.a;
        Rect rect2 = this.b;
        ((qs) obj).a(rect);
        ((qs) obj2).a(rect2);
        if (rect.top < rect2.top) {
            return -1;
        }
        if (rect.top > rect2.top) {
            return 1;
        }
        if (rect.left >= rect2.left) {
            if (rect.left <= rect2.left) {
                if (rect.bottom < rect2.bottom) {
                    return -1;
                }
                if (rect.bottom > rect2.bottom) {
                    return 1;
                }
                if (rect.right >= rect2.right) {
                    if (rect.right <= rect2.right) {
                        return 0;
                    }
                    if (this.c) {
                        return -1;
                    }
                    return 1;
                } else if (this.c) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (this.c) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.c) {
            return 1;
        } else {
            return -1;
        }
    }
}
