package defpackage;

import java.math.RoundingMode;

/* renamed from: aonr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aonr {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RoundingMode.values().length];
        a = iArr;
        try {
            iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            a[RoundingMode.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            a[RoundingMode.FLOOR.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            a[RoundingMode.UP.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            a[RoundingMode.CEILING.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            a[RoundingMode.HALF_DOWN.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
        }
        try {
            a[RoundingMode.HALF_UP.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
        }
        try {
            a[RoundingMode.HALF_EVEN.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
        }
    }
}
