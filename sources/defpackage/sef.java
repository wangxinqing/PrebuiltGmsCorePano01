package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: sef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sef extends Exception {
    final Status a;
    final int b;

    public sef(Status status, int i) {
        this.a = status;
        this.b = i;
    }
}
