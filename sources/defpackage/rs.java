package defpackage;

import android.graphics.Rect;

/* renamed from: rs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rs {
    public static int a(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    public static int b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    private static boolean c(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static int a(int i, Rect rect, Rect rect2) {
        int i2;
        if (i == 17) {
            i2 = rect.left - rect2.right;
        } else if (i == 33) {
            i2 = rect.top - rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left - rect.right;
        } else if (i == 130) {
            i2 = rect2.top - rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r10.right <= r12.left) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r10.top >= r12.bottom) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r10.left >= r12.right) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r10.bottom <= r12.top) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = c(r9, r10, r11)
            boolean r1 = c(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L_0x0078
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L_0x003b
            if (r9 == r3) goto L_0x0034
            if (r9 == r4) goto L_0x002d
            if (r9 != r1) goto L_0x0027
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L_0x0077
            goto L_0x0041
        L_0x0027:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x002d:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L_0x0077
            goto L_0x0041
        L_0x0034:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L_0x0077
            goto L_0x0041
        L_0x003b:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L_0x0077
        L_0x0041:
            if (r9 == r5) goto L_0x0077
            if (r9 == r4) goto L_0x0077
            int r11 = a((int) r9, (android.graphics.Rect) r10, (android.graphics.Rect) r11)
            if (r9 == r5) goto L_0x0069
            if (r9 == r3) goto L_0x0063
            if (r9 == r4) goto L_0x005d
            if (r9 != r1) goto L_0x0057
            int r9 = r12.bottom
            int r10 = r10.bottom
            int r9 = r9 - r10
            goto L_0x006e
        L_0x0057:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x005d:
            int r9 = r12.right
            int r10 = r10.right
            int r9 = r9 - r10
            goto L_0x006e
        L_0x0063:
            int r9 = r10.top
            int r10 = r12.top
            int r9 = r9 - r10
            goto L_0x006e
        L_0x0069:
            int r9 = r10.left
            int r10 = r12.left
            int r9 = r9 - r10
        L_0x006e:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L_0x0076
            return r6
        L_0x0076:
            return r2
        L_0x0077:
            return r6
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs.a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean a(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            return (rect.right > rect2.right || rect.left >= rect2.right) && rect.left > rect2.left;
        }
        if (i == 33) {
            return (rect.bottom > rect2.bottom || rect.top >= rect2.bottom) && rect.top > rect2.top;
        }
        if (i == 66) {
            return (rect.left < rect2.left || rect.right <= rect2.left) && rect.right < rect2.right;
        }
        if (i == 130) {
            return (rect.top < rect2.top || rect.bottom <= rect2.top) && rect.bottom < rect2.bottom;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }
}
