package defpackage;

import android.net.Uri;

/* renamed from: aeli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeli {
    public final Uri a;

    public aeli(Uri uri) {
        this.a = uri;
    }

    public final aeli a(String str) {
        return new aeli(this.a.buildUpon().encodedPath(str).build());
    }

    public final String toString() {
        return this.a.toString();
    }

    public final String a() {
        return this.a.getPath();
    }
}
